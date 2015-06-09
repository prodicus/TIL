data segment
	msg1 db 13,10," Enter the first no $3 "
        msg2 db 13,10," Enter the Second no $ "
        msg3 db 13,10," Result =  $ "

data ends
code segment
start:
	assume DS:data, CS : code
	MOV AX, SEG msg1
	MOV DS, AX
	MOV DX, OFFSET msg1
	
	mov ah, 09h
	int 21h
	
        mov ah, 01h
	int 21h
	
	sub al,'0'
	mov bl,al    

	MOV AX, SEG msg2
	MOV DS, AX
	MOV DX, OFFSET msg2
	
	mov ah, 09h
	int 21h
	
        mov ah, 01h
	int 21h
	
	sub al,'0'
	
	sub al,bl
        add al,'0'
        mov cl,al	
      
	
	MOV AX, SEG msg3
	MOV DS, AX
	MOV DX, OFFSET msg3
	
	mov ah, 09h
	int 21h	 

	mov dl,cl
	mov ah, 02h
	int 21h	 

	mov ax,4c00h
	int 21h

code ends
end start	 
