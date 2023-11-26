class Solution{
public:
	int findMaximum(int arr[], int n) {
	    int start=0;
	    int end=n-1;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return arr[mid];
	        else if(arr[mid-1]>arr[mid]) end=mid-1;
	        else start=mid+1;
	   }
	    return arr[n-1];
	}
};
