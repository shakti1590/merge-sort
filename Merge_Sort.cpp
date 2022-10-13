#include <bits/stdc++.h>

using namespace std;

int *temp;

// merge 
void merge(int arr[], int left, int right, int mid)
{
    int k = left, i, j;

    for(i = left, j = mid + 1; i <= mid && j <= right; k++)
    {
        if(arr[i] <= arr[j])
        {
            temp[k] = arr[i];
            i++;
        }
        else
        {
            temp[k] = arr[j];
            j++;
        }
    }

    while(i <= mid)
    {
        temp[k] = arr[i];
        i++;
        k++;
    }

    while(j <= right)
    {
        temp[k] = arr[j];
        j++;
        k++;
    }

    for(i = left; i <= right; i++)
        arr[i] = temp[i];
}


// Divide array into halves
void divide(int arr[], int s, int e)
{
    if(s < e)
    {
        int mid = s + (e - s) / 2;

        divide(arr, s, mid);
        divide(arr, mid + 1, e);

        merge(arr, s, e, mid);
    }
}

void Merge_Sort(int arr[], int size)
{
    temp = new int[size];
    divide(arr, 0, size - 1);
    delete [] temp;
}

// Function to print elements of array
void printArray(int arr[], int size)
{
    for(int i = 0; i < size; i++)
        cout << arr[i] << " ";

    cout << endl;
}

int main()
{
    int arr[] = {2, 4, 3, 1, 6, 8, 4};
    Merge_Sort(arr, 7);
    printArray(arr, 7);
    return 0;
}

// Output
// 1 2 3 4 4 6 8
