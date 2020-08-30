package yearrange;

/**
 *
 * @author BRIDGET GITHINJI
 */
public class YearRange {

    int startYear;
    int endYear;
    int range;

    public YearRange(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public void setRangeType(int index) {
        range = index;
    }

    public int getFirstDivisor() {
        return 14;
    }

    public int getSecondDivisor() {
        return 20;
    }

    public int getFirstYear() {
        return startYear;
    }

    public int getSecondYear() {
        return endYear;
    }

    public void printYears() {
        for (int i = startYear; startYear <= endYear; startYear++) {
            if (range == 1) {
                if (startYear % getFirstDivisor() == 0 && startYear % getSecondDivisor() == 0) {
                    System.out.println(startYear);
                }
            }
            if (range ==2) {
                if (startYear % 4 == 0) {
                    System.out.println(startYear);
                }
            }
            if (range == 3) {
                if (startYear % 4 == 0 && startYear % 3 == 0) {
                    System.out.println(startYear);
                }
            }
        }
    }
}