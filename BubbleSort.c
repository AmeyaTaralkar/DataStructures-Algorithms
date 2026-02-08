#include <stdio.h>
#include <stdlib.h>
int BubbleSort(int unsortedList[10], int listLength)
{
    for(int i = 0; i < listLength - 1; i++)
    {
        for(int j = 0; j < listLength - 1 - i; j++)
        {
            if(unsortedList[j] > unsortedList[j + 1])
            {
                int temp = unsortedList[j];
                unsortedList[j] = unsortedList[j + 1];
                unsortedList[j + 1] = temp;
                printf("Sorting \n");
            }
        }
    }
}
