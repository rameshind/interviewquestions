package main.array;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int l =0; int r = nums.length;
        return banSearch(l,r, nums, target);

    }

    static int banSearch(int l,int r,int[] nums, int target){

        if(l>r){
            return -1;
        }
        int mid = l+((l-r)/2);
        if (nums[mid] == target){

            return mid;

        }
        else if(nums[mid]> target){
            return  banSearch(l, mid-1, nums, target);
        }

        else {
            return  banSearch(mid+1, r, nums, target);
        }
    }

    public static void main(String[] args) {
        /*search(new int[]{-1, 0, 3, 5, 9, 12
        },9);*/

        Boolean one, two, three = two = one = false;
  Byte s = new Byte((byte) 10);
  Integer i = new Integer(1);

        System.out.println("s"+1+2);

    }
}
