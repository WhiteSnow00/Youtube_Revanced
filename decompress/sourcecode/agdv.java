import java.util.Iterator;
import java.util.logging.Level;
import java.util.Arrays;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agdv implements afvk
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public agdv(final ahar b, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        if (b.c()) {
            afyn.a.a();
            aesy.as(b);
        }
    }
    
    public agdv(final byte[] array, final int a) {
        this.a = a;
        if (!aesy.ao(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (array.length == 32) {
            this.b = ageq.a(array);
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
                for (final afvg afvg : ((ahar)this.b).b(copy)) {
                    byte[] s;
                    if (afvg.b.equals(agbu.c)) {
                        s = aety.S(new byte[][] { array2, agcs.b });
                    }
                    else {
                        s = array2;
                    }
                    try {
                        ((afvk)afvg.a).a(copyOfRange, s);
                        final int c = afvg.c;
                        final int length2 = s.length;
                        return;
                    }
                    catch (final GeneralSecurityException ex) {
                        agcs.a.logp(Level.INFO, "com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify", "verify", "signature prefix matches a key, but cannot verify: ".concat(ex.toString()));
                        continue;
                    }
                    break;
                }
                for (final afvg afvg2 : ((ahar)this.b).b(afuo.a)) {
                    try {
                        ((afvk)afvg2.a).a(array, array2);
                        final int c2 = afvg2.c;
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
            if (agds.d(array2, array, ((ageq)this.b).b())) {
                return;
            }
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
