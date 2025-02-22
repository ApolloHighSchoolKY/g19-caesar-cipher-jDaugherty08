/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char[] shifted;
	private int shift;

    public CaesarCipher() {

        shift = 3;

    }
//check back on the recording for these 2
    public CaesarCipher(int num){
        shift = num;
    }

    public String encrypt(String message){
        //hello world!
        String encrypted = "";

        for(int i=0; i<message.length(); i++)
        {
            for(int o=0; i<26; o++)
            {
                if(alphabet[o] == message.charAt(i))
                    encrypted += shifted[o];
            }
        }

        return encrypted;
    }

    public String decrypt(String message){
        String decrypted = "";

        for(int i=0; i<message.length(); i++)
        {
            for(int o=0; i<26; o++)
            {
                if(shifted[o] == message.charAt(i))
                    decrypted += alphabet[o];
            }
        }

        return decrypted;
    }

    public void shifter(int num)
    {
        //give shifted its values.
        
        for(int i=25-num; i<26; i++)
        {
            shifted[i%shift] = alphabet[i];
        }
        for(int i=shift; i<26 - num; i++)
        {
            shifted[i] = alphabet[i + shift];
        }

    }


}
