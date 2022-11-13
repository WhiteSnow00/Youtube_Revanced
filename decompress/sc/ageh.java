import java.security.interfaces.ECPublicKey;
import java.security.interfaces.ECPrivateKey;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class ageh extends agaq
{
    public ageh(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agcr agcr = (agcr)messageLite;
        agcs agcs;
        if ((agcs = agcr.c) == null) {
            agcs = agcs.a;
        }
        agcq agcq;
        if ((agcq = agcs.c) == null) {
            agcq = agcq.a;
        }
        final int g = aeuz.G(agcq.c);
        final int n = 1;
        int n2;
        if ((n2 = g) == 0) {
            n2 = 1;
        }
        final ECPrivateKey m = aevy.M(aevy.Z(n2), agcr.d.I());
        agcs agcs2;
        if ((agcs2 = agcr.c) == null) {
            agcs2 = agcs.a;
        }
        agcq agcq2;
        if ((agcq2 = agcs2.c) == null) {
            agcq2 = agcq.a;
        }
        int g2;
        if ((g2 = aeuz.G(agcq2.c)) == 0) {
            g2 = 1;
        }
        final int z = aevy.Z(g2);
        agcs agcs3;
        if ((agcs3 = agcr.c) == null) {
            agcs3 = agcs.a;
        }
        final byte[] i = agcs3.d.I();
        agcs agcs4;
        if ((agcs4 = agcr.c) == null) {
            agcs4 = agcs.a;
        }
        final ECPublicKey n3 = aevy.N(z, i, agcs4.e.I());
        agcs agcs5;
        if ((agcs5 = agcr.c) == null) {
            agcs5 = agcs.a;
        }
        agcq agcq3;
        if ((agcq3 = agcs5.c) == null) {
            agcq3 = agcq.a;
        }
        int e;
        if ((e = aeuz.E(agcq3.b)) == 0) {
            e = 1;
        }
        final int ab = aevy.ab(e);
        agcs agcs6;
        if ((agcs6 = agcr.c) == null) {
            agcs6 = agcs.a;
        }
        agcq agcq4;
        if ((agcq4 = agcs6.c) == null) {
            agcq4 = agcq.a;
        }
        int h;
        if ((h = aeuz.H(agcq4.d)) == 0) {
            h = 1;
        }
        aggp.a(m, n3, ab, aevy.aa(h));
        agcs agcs7;
        if ((agcs7 = agcr.c) == null) {
            agcs7 = agcs.a;
        }
        agcq agcq5;
        if ((agcq5 = agcs7.c) == null) {
            agcq5 = agcq.a;
        }
        int e2;
        if ((e2 = aeuz.E(agcq5.b)) == 0) {
            e2 = 1;
        }
        final int ab2 = aevy.ab(e2);
        agcs agcs8;
        if ((agcs8 = agcr.c) == null) {
            agcs8 = agcs.a;
        }
        agcq agcq6;
        if ((agcq6 = agcs8.c) == null) {
            agcq6 = agcq.a;
        }
        int h2 = aeuz.H(agcq6.d);
        if (h2 == 0) {
            h2 = n;
        }
        return new agfn(m, ab2, aevy.aa(h2));
    }
}
