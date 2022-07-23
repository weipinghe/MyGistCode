// Check Java Cryptography Extensions Unlimited Strength policy
// The JCE uses jurisdiction policy files to control the cryptographic strength.
// Policy files consist of two jars: local_policy.jar and US_export_policy.jar.
// under $JAVA_HOME\jre\lib\security

import javax.crypto.Cipher;
public class CheckJCE {
	public static void main(String args[]) throws Exception {
		boolean unlimited = javax.crypto.Cipher.getMaxAllowedKeyLength("RC5") >= 256;
		System.out.println("Java Cryptography Extensions Unlimited Strength enabled: " + unlimited);
		}
}