public class Ceiling {
        public static void main(String[] args) {
            int[] arr = {2, 4, 7, 12, 16, 22, 45,};
            int target = 15;
            int ans = ceiling(arr, target);
            System.out.println(ans);
        }
        static int ceiling(int[] arr, int target){
            if (target > arr[arr.length-1]){
                return -1;
            }
            int start = 0;
            int end = arr.length-1;


//        find ascending or descending
//            Ceiling is smallest >= target
            boolean isAsc = arr[start] < arr[end];

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if (target == arr[mid]){
                    return mid;
                }
                if (isAsc)
                    if (target < arr[mid]){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                else {
                    if (target > arr[mid]){
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return start;
        }
}

