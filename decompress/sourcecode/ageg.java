import java.util.Arrays;
import javax.crypto.Mac;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.GeneralSecurityException;
import java.security.Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ageg implements afzu
{
    public final String a;
    public final Key b;
    private final ThreadLocal c;
    private final int d;
    
    public ageg(final String a, final Key b) {
        final agef c = new agef(this);
        this.c = (ThreadLocal)c;
        if (!aesy.ao(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.a = a;
        this.b = b;
        if (b.getEncoded().length >= 16) {
            int n = 0;
            Label_0181: {
                switch (a.hashCode()) {
                    case 392317873: {
                        if (a.equals("HMACSHA512")) {
                            n = 4;
                            break Label_0181;
                        }
                        break;
                    }
                    case 392316170: {
                        if (a.equals("HMACSHA384")) {
                            n = 3;
                            break Label_0181;
                        }
                        break;
                    }
                    case 392315118: {
                        if (a.equals("HMACSHA256")) {
                            n = 2;
                            break Label_0181;
                        }
                        break;
                    }
                    case 392315023: {
                        if (a.equals("HMACSHA224")) {
                            n = 1;
                            break Label_0181;
                        }
                        break;
                    }
                    case -1823053428: {
                        if (a.equals("HMACSHA1")) {
                            n = 0;
                            break Label_0181;
                        }
                        break;
                    }
                }
                n = -1;
            }
            if (n != 0) {
                int d;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(a));
                            }
                            d = 64;
                        }
                        else {
                            d = 48;
                        }
                    }
                    else {
                        d = 32;
                    }
                }
                else {
                    d = 28;
                }
                this.d = d;
            }
            else {
                this.d = 20;
            }
            ((ThreadLocal)c).get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }
    
    public final byte[] a(final byte[] array, final int n) {
        if (n <= this.d) {
            this.c.get().update(array);
            return Arrays.copyOf(this.c.get().doFinal(), n);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
