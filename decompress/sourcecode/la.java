import android.security.keystore.KeyGenParameterSpec$Builder;
import android.util.Log;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.KeyStoreException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.UnrecoverableKeyException;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Key;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.security.KeyStore;
import android.security.identity.PresentationSession;
import android.security.identity.IdentityCredential;
import android.os.Build$VERSION;
import javax.crypto.Mac;
import java.security.Signature;
import javax.crypto.Cipher;
import android.hardware.biometrics.BiometricPrompt$CryptoObject;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class la
{
    static int a(final TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }
    
    static void b(final TextView textView, final int n, final int n2, final int n3, final int n4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
    }
    
    static void c(final TextView textView, final int[] array, final int n) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
    }
    
    static boolean d(final TextView textView, final String fontVariationSettings) {
        return textView.setFontVariationSettings(fontVariationSettings);
    }
    
    public static BiometricPrompt$CryptoObject e(final blt blt) {
        if (blt == null) {
            return null;
        }
        final Object a = blt.a;
        if (a != null) {
            return sx.b((Cipher)a);
        }
        final Object d = blt.d;
        if (d != null) {
            return sx.a((Signature)d);
        }
        final Object c = blt.c;
        if (c != null) {
            return sx.c((Mac)c);
        }
        if (Build$VERSION.SDK_INT >= 30) {
            final Object e = blt.e;
            if (e != null) {
                return sy.a((IdentityCredential)e);
            }
        }
        if (Build$VERSION.SDK_INT >= 33) {
            final Object b = blt.b;
            if (b != null) {
                return sz.a((PresentationSession)b);
            }
        }
        return null;
    }
    
    public static blt f() {
        Object o = null;
        try {
            final KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            final KeyGenParameterSpec$Builder a = sw.a("androidxBiometric", 3);
            sw.d(a);
            sw.e(a);
            o = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            sw.c((KeyGenerator)o, sw.b(a));
            ((KeyGenerator)o).generateKey();
            final SecretKey secretKey = (SecretKey)instance.getKey("androidxBiometric", null);
            o = Cipher.getInstance("AES/CBC/PKCS7Padding");
            ((Cipher)o).init(1, secretKey);
            o = new blt((Cipher)o);
            return (blt)o;
        }
        catch (final NoSuchProviderException o) {}
        catch (final IOException o) {}
        catch (final UnrecoverableKeyException o) {}
        catch (final InvalidAlgorithmParameterException o) {}
        catch (final InvalidKeyException o) {}
        catch (final KeyStoreException o) {}
        catch (final CertificateException o) {}
        catch (final NoSuchAlgorithmException o) {}
        catch (final NoSuchPaddingException ex) {}
        Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", (Throwable)o);
        return null;
    }
}
