public class BonusMilesService {
    public int calculate (int price) {
        int milesRuble = 20;
        int miles = price / milesRuble;
        return miles;
        }
}
