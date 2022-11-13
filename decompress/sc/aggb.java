import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Mac;
import java.security.KeyPairGenerator;
import java.security.KeyFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import java.security.Provider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggb implements aggc
{
    private final int a;
    
    public aggb(final int a) {
        this.a = a;
    }
    
    public final Object a(final String s, final Provider provider) {
        final int a = this.a;
        if (a == 0) {
            KeyAgreement keyAgreement;
            if (provider == null) {
                keyAgreement = KeyAgreement.getInstance(s);
            }
            else {
                keyAgreement = KeyAgreement.getInstance(s, provider);
            }
            return keyAgreement;
        }
        if (a == 1) {
            Cipher cipher;
            if (provider == null) {
                cipher = Cipher.getInstance(s);
            }
            else {
                cipher = Cipher.getInstance(s, provider);
            }
            return cipher;
        }
        if (a == 2) {
            KeyFactory keyFactory;
            if (provider == null) {
                keyFactory = KeyFactory.getInstance(s);
            }
            else {
                keyFactory = KeyFactory.getInstance(s, provider);
            }
            return keyFactory;
        }
        if (a == 3) {
            KeyPairGenerator keyPairGenerator;
            if (provider == null) {
                keyPairGenerator = KeyPairGenerator.getInstance(s);
            }
            else {
                keyPairGenerator = KeyPairGenerator.getInstance(s, provider);
            }
            return keyPairGenerator;
        }
        if (a == 4) {
            Mac mac;
            if (provider == null) {
                mac = Mac.getInstance(s);
            }
            else {
                mac = Mac.getInstance(s, provider);
            }
            return mac;
        }
        if (a != 5) {
            Signature signature;
            if (provider == null) {
                signature = Signature.getInstance(s);
            }
            else {
                signature = Signature.getInstance(s, provider);
            }
            return signature;
        }
        MessageDigest messageDigest;
        if (provider == null) {
            messageDigest = MessageDigest.getInstance(s);
        }
        else {
            messageDigest = MessageDigest.getInstance(s, provider);
        }
        return messageDigest;
    }
}
