public class Problem6 {
    public static void findFloorCeiling(int[] bands, int threshold) {
        int floor = -1, ceiling = -1;

        for (int val : bands) {
            if (val <= threshold) {
                if (floor == -1 || val > floor) floor = val;
            }
            if (val >= threshold) {
                if (ceiling == -1 || val < ceiling) ceiling = val;
            }
        }

        System.out.println("Threshold: " + threshold);
        System.out.println("Floor (Max value <= Target): " + (floor == -1 ? "None" : floor));
        System.out.println("Ceiling (Min value >= Target): " + (ceiling == -1 ? "None" : ceiling));
    }

    public static void main(String[] args) {
        int[] sortedRisks = {10, 25, 50, 100};
        findFloorCeiling(sortedRisks, 40);
    }
}