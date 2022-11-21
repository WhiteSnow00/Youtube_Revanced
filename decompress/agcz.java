import java.security.Key;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agcz extends agci
{
    public agcz(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final ageu ageu = (ageu)messageLite;
        agew agew;
        if ((agew = ageu.c) == null) {
            agew = agew.a;
        }
        int z;
        if ((z = aexq.Z(agew.b)) == 0) {
            z = 1;
        }
        final SecretKeySpec secretKeySpec = new SecretKeySpec(ageu.d.I(), "HMAC");
        agew agew2;
        if ((agew2 = ageu.c) == null) {
            agew2 = agew.a;
        }
        final int n = z - 2;
        final int c = agew2.c;
        agia agia;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new GeneralSecurityException("unknown hash");
                        }
                        agia = new agia((agdn)new aghz("HMACSHA224", (Key)secretKeySpec), c);
                    }
                    else {
                        agia = new agia((agdn)new aghz("HMACSHA512", (Key)secretKeySpec), c);
                    }
                }
                else {
                    agia = new agia((agdn)new aghz("HMACSHA256", (Key)secretKeySpec), c);
                }
            }
            else {
                agia = new agia((agdn)new aghz("HMACSHA384", (Key)secretKeySpec), c);
            }
        }
        else {
            agia = new agia((agdn)new aghz("HMACSHA1", (Key)secretKeySpec), c);
        }
        return agia;
    }
}
