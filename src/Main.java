public class Main {
    public static void main(String[] args) {
        int target = 67;
        int[] nums = new int[]{4, 6, 7, 8, 9, 13, 67, 300, 670}; //an array of integers nums which is sorted in ascending order
        System.out.println("Result: ");
        System.out.println(BinarySearch.binarySearch(nums, target));
    }
}