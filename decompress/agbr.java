import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.GeneralSecurityException;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbr extends agci
{
    public agbr(final Class clazz) {
        super(clazz);
    }
    
    public final Object a(final MessageLite messageLite) {
        final agez agez = (agez)messageLite;
        final agfa c = agez.c;
        if (c == null) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (c.c == null) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (agez.d.H()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        agfa agfa;
        if ((agfa = agez.c) == null) {
            agfa = agfa.a;
        }
        agey agey;
        if ((agey = agfa.c) == null) {
            agey = agey.a;
        }
        aewr.x(agey);
        aewr.K(agey);
        aewr.w(agey);
        final int v = aexq.V(agey.b);
        final int n = 1;
        int n2;
        if ((n2 = v) == 0) {
            n2 = 1;
        }
        final int n3 = n2 - 2;
        if (n3 != 1 && n3 != 2 && n3 != 3 && n3 != 4) {
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(aexq.U(n2)));
        }
        agfa agfa2;
        if ((agfa2 = agez.c) == null) {
            agfa2 = agfa.a;
        }
        agey agey2;
        if ((agey2 = agfa2.c) == null) {
            agey2 = agey.a;
        }
        int v2;
        if ((v2 = aexq.V(agey2.b)) == 0) {
            v2 = 1;
        }
        v2 -= 2;
        if (v2 != 1) {
            if (v2 != 2 && v2 != 3 && v2 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            final byte[] i = agez.d.I();
            agfa agfa3;
            if ((agfa3 = agez.c) == null) {
                agfa3 = agfa.a;
            }
            final byte[] j = agfa3.d.I();
            agfa agfa4;
            if ((agfa4 = agez.c) == null) {
                agfa4 = agfa.a;
            }
            agey agey3;
            if ((agey3 = agfa4.c) == null) {
                agey3 = agey.a;
            }
            int v3 = aexq.V(agey3.b);
            if (v3 == 0) {
                v3 = n;
            }
            final int g = agbw.g(v3);
            final ECPublicKey h = aexq.H(g, j);
            final ECPrivateKey d = aexq.D(g, i);
            aexq.y(h, d);
            agbz.b(h.getW(), d.getParams().getCurve());
            agij.a(i);
            agij.a(j);
        }
        else {
            final byte[] k = agez.d.I();
            final byte[] l = aexq.l(k);
            agij.a(k);
            agij.a(l);
        }
        return new agbo();
    }
}
