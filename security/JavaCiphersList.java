// Check Java ssl and Ciphers
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLContext;

public class JavaCiphersList {

	public static void main(String args[]) throws Exception {
		System.out.println("Java Version: " + System.getProperty("java.version"));
		SSLSocketFactory factory = (SSLSocketFactory) SSLContext.getDefault().getSocketFactory();
		System.out.println("The JAVA_HOME is: " + System.getenv("JAVA_HOME") );
		System.out.println("The socket factory is: " + factory.getClass().getName());

		String[] sslProtocols = javax.net.ssl.SSLContext.getDefault().getDefaultSSLParameters().getProtocols();
		System.out.print("Supported SSL protocols: ");
		for (String protocol : sslProtocols) System.out.print(protocol + " ");
		System.out.print("\n\n");

		String[] sslDefaultCipherSuites = factory.getDefaultCipherSuites();
		System.out.print("Default cipher suites on the socketfactory: \n");
		for (String cipher : sslDefaultCipherSuites) System.out.print(cipher + " ");
		System.out.print("\n\n");

		String[] sslSupportedCipherSuites = factory.getSupportedCipherSuites();
		System.out.print("Supported cipher suites on the socketfactory: \n");
		for (String cipher : sslSupportedCipherSuites) System.out.print(cipher + " ");
		System.out.print("\n");
	}
}