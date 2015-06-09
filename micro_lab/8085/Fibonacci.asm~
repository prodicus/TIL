LDA 4000H
MOV B,A

MVI A,00H
STA 4001H

MVI A,01H
STA 4002H

LXI H,4001H

ASK:
    MOV A,M
    INX H
    ADD M
    INX H
    MOV M,A
    DCR B
    DCX H
JNZ ASK

HLT
