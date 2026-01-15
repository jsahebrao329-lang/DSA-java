class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int[] arr=new int[m+n];
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
             arr[k]=nums1[i];
             k++;
             i++;
            }
            else
            {
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
            while(i<n)
            {
                arr[k++]=nums1[i++];
            }
            while(j<m)
            {
                arr[k++]=nums2[j++];
            }
            
        
        int sum=m+n;
        if(sum%2==1)
        {
            return arr[sum/2];
        }
        else
        {
            return (arr[sum/2]+arr[sum/2-1])/2.0;
        }

        
    }
}