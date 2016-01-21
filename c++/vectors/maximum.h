template <typename T>

T maximum(T num1, T num2, T num3){
    T maxval = num1;

    if(maxval < num2 && num2 > num3){
        return num2;
    }
    else if(maxval < num3 && num3 > num2){
        return num3;
    }
    else return maxval;
}