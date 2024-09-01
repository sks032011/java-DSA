// Function to find square root
// // x: element to find square root
// class BSOnAnswers
// {
//      long floorSqrt(long x)
// 	 {
// 		long low=0;long high=x; long ans=1;
// 		while(low<=high){
// 		    long mid=(low+high)/2;
// 		    if((mid*mid)<=x){
// 		        ans=mid;
// 		        low=mid+1;
// 		    }
// 		    else{
// 		        high=mid-1;

// 		    }
// 		}
// 		return ans;
// 	 }
// }
// -----------------------------------------------------------------------------
// 875. Koko Eating Bananas
// TC O(N+NLOG(MAX OF ARRAY))

// class BS {
//     public int minEatingSpeed(int[] piles, int h) {
//         int l=1;int hi=findMax(piles);
//         while(l<=hi){
//             int mid=(l+hi)/2;
//             int totalhr=totalHr(piles,mid);
//             if(totalhr<=h){
//              hi=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//         return l;
//     }
//     public static int totalHr(int[]a,int h){
//         int totalhr=0;
//         for(int i=0;i<a.length;i++){
//                 totalhr+= Math.ceil((double)(a[i]) / (double)(h));
//         }
//         return totalhr;
//     }
//        public static int findMax(int[] v) {
//         int maxi = Integer.MIN_VALUE;;
//         int n = v.length;
//         //find the maximum:
//         for (int i = 0; i < n; i++) {
//             maxi = Math.max(maxi, v[i]);
//         }
//         return maxi;
//     }
// }-----------------------------------------------------------

// 1482. Minimum Number of Days to Make m Bouquets

// class BS {
//     public int minDays(int[] dayarr, int m, int k) {
//         int n = dayarr.length;
//                long val = (long) m * k;

//         if (val > n) return -1; // Impossible case.
// // Directly return -1 if it's impossible

//        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;

//         // Find the minimum and maximum days in the array
//         for (int i = 0; i < n; i++) {
//             mini = Math.min(mini, dayarr[i]);
//             maxi = Math.max(maxi, dayarr[i]);
//         }

//         int l = mini, h = maxi;
//         while (l <= h) {
//             int mid = l + (h - l) / 2; // Prevent overflow
//             if (possible(dayarr, mid, m, k)) {
//                 h = mid - 1;
//             } else {
//                 l = mid + 1;
//             }
//         }
//         return l;
//     }

//     public boolean possible(int[] a, int day, int m, int k) {
//         int n = a.length;
//         int cnt = 0, numboq = 0;

//         for (int i = 0; i < n; i++) {
//             if (a[i] <= day) {
//                 cnt++;
//                 if (cnt == k) {
//                     numboq++;
//                     cnt = 0; // Reset count after forming a bouquet
//                     if (numboq == m) return true; // Early exit if we already have enough bouquets
//                 }
//             } else {
//                 cnt = 0; // Reset count if the current day exceeds the mid value
//             }
//         }
//         return numboq >= m;
//     }
// }
// ------------------------------------------------
// 1283. Find the Smallest Divisor Given a Threshold
// AND FOR KOKO TOO

// class BS {
//     public int smallestDivisor(int[] a, int tld) {
//         int n=a.length;
//         int ans=-1;
//         int low=1;int high=1000000;
//         while(low<=high){
//             int mid=low+(high-low)/2;

//             if(hr(a,mid)<=tld){
//                 ans=mid;
//                 high=mid-1;
//             }
//             else low=mid+1;
//         }
//         return ans;
//     }
//     public int hr(int[]a,int div){
//         int sum=0;
//         for(int i:a){
//             sum += (i + div - 1) / div;
//         }

//         return sum;

//     }
// }
// ------------------------------------------------------------------------

// 1011. Capacity To Ship Packages Within D Days

// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//        int n=weights.length; int sum=0;int max=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//         if(weights[i]>max) max=weights[i];
//         sum+=weights[i];
//        }
//         int low =max;int h=sum;
//         while(low<=h){
//             int mid=(low+h)/2;
//             if(noOfdaysREQ(weights,mid)<=days){
//               h=mid-1;
//             }
//             else low=mid+1;
//         }
//         return low;
//     }
//     public int noOfdaysREQ(int a[],int cap){
//          int n=a.length;
//         int load=0;int days=1;
//         for(int i=0;i<n;i++){
//             if(a[i]+load>cap){
//                 days+=1;
//                 load=a[i];
//             }
//             else{
//                 load+=a[i];
//             }
//         }
//         return days;
//     }
// }
// ----------------------------------------------------------------

// 1552. Magnetic Force Between Two Balls/// AGRESSIVE COWS

// import java.util.Arrays;
// class Solution {
//     public int maxDistance(int[] pos, int m) {
//         Arrays.sort(pos);
//         int n = pos.length;
//         int h = (pos[n - 1] - pos[0]) / (m - 1);

//         int low = 1;
//         while (low <= h) {
//             int mid = low + (h - low) / 2;
//             if (canweplace(pos, mid, m) == true) {
//                 low = mid + 1;
//             } else {
//                 h = mid - 1;
//                 ;
//             }
//         }
//         return h;
//     }

//     public static boolean canweplace(int[] a, int dist, int magnets) {
//         int cntball = 1;
//         int last = a[0];
//         int n = a.length;
//         for (int i = 1; i < n; i++) {
//             if (a[i] - last >= dist) {
//                 cntball += 1;
//                 last = a[i];
//             }
//             if (cntball >= magnets)
//                 return true;
//         }

//         return false;
//     }

// }

// ----------------------------------------------------------------

// 410. Split Array Largest Sum/Book allocation 

// class Solution {
//     public int splitArray(int[] nums, int k) {
//         int max = 0, sum = 0;
//         for (int num : nums) {
//             max = Math.max(max, num);
//             sum += num;
//         }
        
//         int low = max;
//         int high = sum;
        
//         while (low < high) {
//             int mid = low + (high - low) / 2;
//             if (count(nums, mid) <= k) {
//                 high = mid;
//             } else {
//                 low = mid + 1;
//             }
//         }
        
//         return low;
//     }
    
//     private int count(int[] nums, int maxSum) {
//         int subarrays = 1, currentSum = 0;
//         for (int num : nums) {
//             if (currentSum + num > maxSum) {
//                 subarrays++;
//                 currentSum = num;
//             } else {
//                 currentSum += num;  //inc the pagesstu
//             }
//         }
//         return subarrays; //return student
//     }
// }
// ---------------------------------------------------------

// 4. Median of Two Sorted Arrays
// BETTER 0(N1+N2)    100P ON LC THOUGH 

// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1=nums1.length;int n2=nums2.length;
//         int n=n1+n2;
//         int idx2=n/2;int idx1=idx2-1;
//         int cnt=0;
//         int idx1el=-1;int idx2el=-1;
//         int i=0;int j=0;
//         while(i<n1 && j<n2){
//         if(nums1[i]<nums2[j]){
//         if(cnt==idx1) idx1el=nums1[i];
//         if(cnt==idx2) idx2el=nums1[i]; 
//        cnt++;i++;}
//        else {
//                 if (cnt == idx1) idx1el = nums2[j];
//                 if (cnt == idx2) idx2el = nums2[j];
//                 cnt++;
//                 j++;
//             }
            
//             }
//              while (i < n1) {
//             if (cnt == idx1) idx1el = nums1[i];
//             if (cnt == idx2) idx2el = nums1[i];
//             cnt++;
//             i++;
//         }
//         while (j < n2) {
//             if (cnt == idx1) idx1el = nums2[j];
//             if (cnt == idx2) idx2el = nums2[j];
//             cnt++;
//             j++;
//         }

//         //Find the median:
//         if (n % 2 == 1) {
//             return (double)idx2el;
//         }

//         return (double)((double)(idx1el + idx2el)) / 2.0;
//     }
// }
// ----------------------------------------------------------------------

// IMPORTANT 
// OPTIMAL 
// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1=nums1.length;int n2=nums2.length;
//         // i want arr1 to be smaller 
//         if(n1>n2) return findMedianSortedArrays( nums2, nums1);
//         int left=(n1+n2+1)/2;
//         int low=0;int high=n1;
//         int n=n1+n2;
//         while(low<=high){
//             int mid1=(low+high)/2;
//             int mid2=left-mid1;
//             int l1=Integer.MIN_VALUE;int l2=Integer.MIN_VALUE;
//         int r1=Integer.MAX_VALUE;int r2=Integer.MAX_VALUE;
//               if(mid1-1>=0)   l1=nums1[mid1-1];
//               if(mid2-1>=0)   l2=nums2[mid2-1];
//             if(mid1<n1) r1=nums1[mid1];
//             if(mid2<n2) r2=nums2[mid2];
//             if(l1<=r2&&l2<=r1){
//                 if(n%2==1) {return (Math.max(l1,l2));}
//             return ((double)((Math.max(l1,l2)+Math.min(r1,r2))))/2.0;
               
//             }
//            else if(l1>r2)high=mid1-1;
//             else low=mid1+1;


        
//         }
//         return 0;


//     }
// }
// ------------------------------------------------------


// K-th element of two Arrays



// // } Driver Code Ends
// class Solution{
//     public:
//     int kthElement(int arr1[], int arr2[], int m, int n, int k)
//     {
//         if (m>n) return kthElement( arr2, arr1,  n,  m,  k);
//         int left =k;
//         int high=min(k,m);int low=max(0,k-n);
//         while(low<=high){
//             int mid1=(low+high)/2;
//             int mid2=left-mid1;
//             int l1 = INT_MIN, l2 = INT_MIN;
//         int r1 = INT_MAX, r2 = INT_MAX;
//              if (mid1 < m) r1 = arr1[mid1];
//         if (mid2 < n) r2 = arr2[mid2];
//         if (mid1 - 1 >= 0) l1 = arr1[mid1 - 1];
//         if (mid2 - 1 >= 0) l2 = arr2[mid2 - 1];
//         if(l1<=r2 && l2<=r1){
//             return max(l1,l2);
//         }
//         else if (l1 > r2) high = mid1 - 1;
//         else low = mid1 + 1;
    
//         }
            
//     }
// };

// ----------------------------------------

Minimize Max Distance to Gas StatioN
BETTER,,,,,,,,,,tle
class Solution {
  public:
    double findSmallestMaxDist(vector<int> &arr, int k) {
        // Code here
        int n=arr.size();
        vector<int>howmany(n-1,0);
        priority_queue<pair<long double,int>>pq;
        
        for(int i=0;i<n-1;i++){
            pq.push({arr[i+1]-arr[i],i});
            
        }
        for(int i=1;i<=k;i++){
            
            auto tp=pq.top();
            pq.pop();
            int secidx=tp.second;
            howmany[secidx]++;
        long    double diff=arr[secidx+1]-arr[secidx];
            long double seclen=diff/(long double)(howmany[secidx]+1);
            pq.push({seclen,secidx});
        }
        return pq.top().first;
    }
};
