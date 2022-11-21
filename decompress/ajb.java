import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;
import android.os.Handler;
import android.os.CancellationSignal;
import android.hardware.fingerprint.FingerprintManager;
import android.content.Context;
import java.security.Signature;
import javax.crypto.Mac;
import javax.crypto.Cipher;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager$CryptoObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajb
{
    static FingerprintManager$CryptoObject a(final Object o) {
        return ((FingerprintManager$AuthenticationResult)o).getCryptoObject();
    }
    
    public static FingerprintManager$CryptoObject b(final ajc ajc) {
        FingerprintManager$CryptoObject fingerprintManager$CryptoObject = null;
        if (ajc == null) {
            return null;
        }
        if (ajc.b != null) {
            return new FingerprintManager$CryptoObject((Cipher)ajc.b);
        }
        if (ajc.a == null) {
            if (ajc.c != null) {
                fingerprintManager$CryptoObject = new FingerprintManager$CryptoObject((Mac)ajc.c);
            }
            return fingerprintManager$CryptoObject;
        }
        return new FingerprintManager$CryptoObject((Signature)ajc.a);
    }
    
    public static FingerprintManager c(final Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager)context.getSystemService((Class)FingerprintManager.class);
        }
        return null;
    }
    
    public static ajc d(final Object o) {
        final FingerprintManager$CryptoObject fingerprintManager$CryptoObject = (FingerprintManager$CryptoObject)o;
        ajc ajc = null;
        if (fingerprintManager$CryptoObject == null) {
            return null;
        }
        if (fingerprintManager$CryptoObject.getCipher() != null) {
            return new ajc(fingerprintManager$CryptoObject.getCipher());
        }
        if (fingerprintManager$CryptoObject.getSignature() != null) {
            return new ajc(fingerprintManager$CryptoObject.getSignature());
        }
        if (fingerprintManager$CryptoObject.getMac() != null) {
            ajc = new ajc(fingerprintManager$CryptoObject.getMac());
        }
        return ajc;
    }
    
    public static void e(final Object o, final Object o2, final CancellationSignal cancellationSignal, final int n, final Object o3, final Handler handler) {
        ((FingerprintManager)o).authenticate((FingerprintManager$CryptoObject)o2, cancellationSignal, n, (FingerprintManager$AuthenticationCallback)o3, handler);
    }
    
    static boolean f(final Object o) {
        return ((FingerprintManager)o).hasEnrolledFingerprints();
    }
    
    static boolean g(final Object o) {
        return ((FingerprintManager)o).isHardwareDetected();
    }
}
