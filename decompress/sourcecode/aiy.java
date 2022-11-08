import javax.crypto.Mac;
import java.security.Signature;
import javax.crypto.Cipher;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiy extends FingerprintManager$AuthenticationCallback
{
    final /* synthetic */ qpt a;
    
    public aiy(final qpt a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    public final void onAuthenticationError(final int n, final CharSequence charSequence) {
        ((sg)((cca)this.a.a).a).a(n, charSequence);
    }
    
    public final void onAuthenticationFailed() {
        ((sg)((cca)this.a.a).a).b();
    }
    
    public final void onAuthenticationHelp(final int n, final CharSequence charSequence) {
        final ss ss = (ss)((cca)this.a.a).a;
        if (ss.a.get() != null) {
            final su su = (su)ss.a.get();
            if (su.m == null) {
                su.m = new aux();
            }
            su.m(su.m, (Object)charSequence);
        }
    }
    
    public final void onAuthenticationSucceeded(final FingerprintManager$AuthenticationResult fingerprintManager$AuthenticationResult) {
        final qpt a = this.a;
        final aja d = aiz.d(aiz.a(fingerprintManager$AuthenticationResult));
        blt blt = null;
        Label_0091: {
            if (d != null) {
                final Object b = d.b;
                if (b != null) {
                    blt = new blt((Cipher)b);
                    break Label_0091;
                }
                final Object a2 = d.a;
                if (a2 != null) {
                    blt = new blt((Signature)a2);
                    break Label_0091;
                }
                final Object c = d.c;
                if (c != null) {
                    blt = new blt((Mac)c);
                    break Label_0091;
                }
            }
            blt = null;
        }
        ((sg)((cca)a.a).a).j(new ardu(blt, 2, (byte[])null));
    }
}
