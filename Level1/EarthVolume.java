public class EarthVolume {
    public static void main(String[] args) {
    double rKm = 6378;
    double volKm3 = (4.0/3.0) * Math.PI * Math.pow(rKm, 3);
    double rMiles = rKm / 1.6;
    double volMiles3 = (4.0/3.0) * Math.PI * Math.pow(rMiles, 3);
    System.out.println("Volume = " + volKm3 + " km³ OR " + volMiles3 + " mi³");
}
}
