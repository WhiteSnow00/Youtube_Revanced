import javax.crypto.Mac;
import java.security.Signature;
import javax.crypto.Cipher;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aja extends FingerprintManager$AuthenticationCallback
{
    final oqz a;
    
    public aja(final oqz a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
    }
    
    public final void onAuthenticationError(final int n, final CharSequence charSequence) {
        ((sh)((cce)this.a.a).a).a(n, charSequence);
    }
    
    public final void onAuthenticationFailed() {
        ((sh)((cce)this.a.a).a).b();
    }
    
    public final void onAuthenticationHelp(final int n, final CharSequence charSequence) {
        final st st = (st)((cce)this.a.a).a;
        if (st.a.get() != null) {
            final sv sv = (sv)st.a.get();
            if (sv.m == null) {
                sv.m = new auz();
            }
            sv.m(sv.m, (Object)charSequence);
        }
    }
    
    public final void onAuthenticationSucceeded(final FingerprintManager$AuthenticationResult fingerprintManager$AuthenticationResult) {
        final oqz a = this.a;
        final ajc d = ajb.d(ajb.a(fingerprintManager$AuthenticationResult));
        blx blx = null;
        Label_0091: {
            if (d != null) {
                final Object b = d.b;
                if (b != null) {
                    blx = new blx((Cipher)b);
                    break Label_0091;
                }
                final Object a2 = d.a;
                if (a2 != null) {
                    blx = new blx((Signature)a2);
                    break Label_0091;
                }
                final Object c = d.c;
                if (c != null) {
                    blx = new blx((Mac)c);
                    break Label_0091;
                }
            }
            blx = null;
        }
        ((sh)((cce)a.a).a).g(new arjd(blx, 2, null));
    }
}
