public class FirstBadVersion {
    public int firstBadVersion2logF(int n) {
        if (isBadVersion(1)) {
            return 1;
        }

        int searchBad;
        int searchGood;
        for (searchBad = 2; searchBad <= n && (long) 2 * searchBad <= n; searchBad *= 2) {
            if (isBadVersion(searchBad)) {
                break;
            }
        }
        if (isBadVersion(searchBad)) {
            searchGood = searchBad / 2;
        } else {
            searchGood = searchBad;
            searchBad = n;
        }

        // range is from searchGood to searchBad;
        int lo = searchGood, hi = searchBad;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                if (lo == hi) {
                    return lo;
                }
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return -1;

    }

    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                if (lo == hi) {
                    return lo;
                }
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return -1;

    }

}
