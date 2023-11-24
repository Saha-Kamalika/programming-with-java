class Solution {
public:
    int bs(vector<int>& nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
        int s=0;
        int n=nums.size();
        if(n==0) return -1;
        int e=n-1;
        int index=0;
        while(s<e) {
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]) s=mid+1;
            else e=mid;
        }
        index=s;
        int f=bs(nums,0,index-1,target);
        int l=bs(nums,index,n-1,target);
        if(f==-1 && l==-1) return -1;
        else if(f!=-1) return f;
        else return l;
    }
};
