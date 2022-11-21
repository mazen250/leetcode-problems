public class sqrtX {
    public int mySqrt(int x) {
        var left = 1;
        var right = x;

        if (x < 2)
            return x;

        while (left < right) {
            var mid = (left + right) / 2;
            var temp = x / mid;
            if (temp == mid)
                return mid;
            else if (temp < mid)
                right = mid;
            else
                left = mid + 1;
        }

        return left - 1;
    }

    public static void main(String[] args) {
        sqrtX x = new sqrtX();
        System.out.println(x.mySqrt(2147395600));
    }
}
