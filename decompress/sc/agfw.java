import java.util.Iterator;
import java.util.logging.Level;
import java.util.Arrays;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfw implements afxl
{
    private final int a;
    private final Object b;
    
    public agfw(final ahcq b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        if (b.c()) {
            agao.a.a();
            aeuz.X(b);
        }
    }
    
    public agfw(final byte[] array, final int a) {
        this.a = a;
        if (!aeuz.T(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (array.length == 32) {
            this.b = aggr.a(array);
            return;
        }
        throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
    }
    
    public final void a(final byte[] array, final byte[] array2) {
        if (this.a != 0) {
            final int length = array.length;
            if (length > 5) {
                final byte[] copy = Arrays.copyOf(array, 5);
                final byte[] copyOfRange = Arrays.copyOfRange(array, 5, length);
                for (final afxh afxh : ((ahcq)this.b).b(copy)) {
                    byte[] t;
                    if (afxh.b.equals(agdv.c)) {
                        t = aevy.T(new byte[][] { array2, aget.b });
                    }
                    else {
                        t = array2;
                    }
                    try {
                        ((afxl)afxh.a).a(copyOfRange, t);
                        final int c = afxh.c;
                        final int length2 = t.length;
                        return;
                    }
                    catch (final GeneralSecurityException ex) {
                        aget.a.logp(Level.INFO, "com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify", "verify", "signature prefix matches a key, but cannot verify: ".concat(ex.toString()));
                        continue;
                    }
                    break;
                }
                for (final afxh afxh2 : ((ahcq)this.b).b(afwq.a)) {
                    try {
                        ((afxl)afxh2.a).a(array, array2);
                        final int c2 = afxh2.c;
                        final int length3 = array2.length;
                        return;
                    }
                    catch (final GeneralSecurityException ex2) {
                        continue;
                    }
                    break;
                }
                throw new GeneralSecurityException("invalid signature");
            }
            throw new GeneralSecurityException("signature too short");
        }
        else {
            if (array.length != 64) {
                throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
            }
            if (agft.d(array2, array, ((aggr)this.b).b())) {
                return;
            }
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
