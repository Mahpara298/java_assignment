
public class ValidateIp {
    public static void main(String[] args) {
        // Test IP addresses
        String[] ipAddresses = {
                "192.168.0.1", // Valid IP
                "172.16.56",   // Invalid IP
                "0.0.0.1",     // Invalid IP
                "1.12.72.2"    // Invalid IP
        };

        // Check each IP address
        for (String ip : ipAddresses) {
            if (isValidIP(ip)) {
                System.out.println(ip + " is a Valid IP");
            } else {
                System.out.println(ip + " is an Invalid IP");
            }
        }
    }

    // Method to check if the IP address is valid
    public static boolean isValidIP(String ip) {
        // Split the IP address into segments
        String[] segments = ip.split("\\.");

        // Check if the IP address has exactly 4 segments
        if (segments.length != 4) {
            return false;
        }

        // Validate each segment
        for (String segment : segments) {
            // Check if the segment is a valid number
            try {
                int num = Integer.parseInt(segment);

                // Check if the number is between 1 and 255, and does not start with '0'
                if (num < 1 || num > 255 || segment.startsWith("0") && segment.length() > 1) {
                    return false;
                }
            } catch (NumberFormatException e) {
                // If parsing fails, the segment is not a valid number
                return false;
            }
        }

        // If all segments are valid
        return true;
    }
}
