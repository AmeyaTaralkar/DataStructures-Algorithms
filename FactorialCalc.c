
#include <stdio.h>
#include <stdlib.h>

int FactorialCalc(int num) {


    for(int i = 0; i < num + 1; i++){
        if(num == 1 || num == 0){
            return 1;
        }
        return num * (FactorialCalc(num-1));
    }
    return 0;
}
