#include <stdio.h>
#include <stdlib.h>

int main()
{
    int row, col, i, j;
    int **arr;  // Declare pointer to pointer for 2D array

    // Get row and column values from user
    printf("Enter number of rows: ");
    scanf("%d", &row);
    printf("Enter number of columns: ");
    scanf("%d", &col);

    // Allocate memory for rows
    arr = (int **)malloc(row * sizeof(int *));

    // Allocate memory for columns
    for (i = 0; i < row; i++) {
        arr[i] = (int *)malloc(col * sizeof(int));
    }

    // Assign values to array
    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            arr[i][j] = i * j;
        }
    }

    // Print array
    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    // Free memory
    for (i = 0; i < row; i++) {
        free(arr[i]);
    }
    free(arr);

    return 0;
}

