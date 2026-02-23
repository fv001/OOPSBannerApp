/**
 * UC3
 *
 * UC3: Render OOPS as a Banner using String.join().
 * This program refactors UC2 by replacing string concatenation
 * with the String.join() method for better memory efficiency
 * and readability.
 *
 * @author Fadil
 * @version 1.0
 */
public class OOPSBannerApp {

    /**
     * Main method – entry point of the Java application
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        String[] bannerLines = new String[7];

        bannerLines[0] = String.join("  ", " *** ", " *** ", "**** ", " *** ");
        bannerLines[1] = String.join("  ", "*   *", "*   *", "*   *", "*    ");
        bannerLines[2] = String.join("  ", "*   *", "*   *", "*   *", "*    ");
        bannerLines[3] = String.join("  ", "*   *", "*   *", "**** ", " *** ");
        bannerLines[4] = String.join("  ", "*   *", "*   *", "*    ", "    *");
        bannerLines[5] = String.join("  ", "*   *", "*   *", "*    ", "    *");
        bannerLines[6] = String.join("  ", " *** ", " *** ", "*    ", " *** ");

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
