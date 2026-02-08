#include <stdio.h>
#include <stdlib.h>

int BinarySearch(int array[], int length, int target) {
    int low = 0;
    int high = length - 1;
    int iterations = 0;
    while(low <= high){
        int mid = (low + high) / 2;
        iterations++;

        if(array[mid] == target){
            printf("It took %d times to search for the number", iterations);
            iterations = 1;
            return mid;

        }
        else if(array[mid] < target){
            low = mid + 1;

        }
        else {
            high = mid - 1;
        }
    }
    printf("Here are the number of times binary search took to find your number: %d", iterations);
    return -1;
}
