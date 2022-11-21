import java.security.interfaces.ECPublicKey;
import java.security.interfaces.ECPrivateKey;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agfz extends agci
{
    public agfz(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agej agej = (agej)messageLite;
        agek agek;
        if ((agek = agej.c) == null) {
            agek = agek.a;
        }
        agei agei;
        if ((agei = agek.c) == null) {
            agei = agei.a;
        }
        final int p = aewr.p(agei.c);
        final int n = 1;
        int n2;
        if ((n2 = p) == 0) {
            n2 = 1;
        }
        final ECPrivateKey d = aexq.D(aexq.Q(n2), agej.d.I());
        agek agek2;
        if ((agek2 = agej.c) == null) {
            agek2 = agek.a;
        }
        agei agei2;
        if ((agei2 = agek2.c) == null) {
            agei2 = agei.a;
        }
        int p2;
        if ((p2 = aewr.p(agei2.c)) == 0) {
            p2 = 1;
        }
        final int q = aexq.Q(p2);
        agek agek3;
        if ((agek3 = agej.c) == null) {
            agek3 = agek.a;
        }
        final byte[] i = agek3.d.I();
        agek agek4;
        if ((agek4 = agej.c) == null) {
            agek4 = agek.a;
        }
        final ECPublicKey e = aexq.E(q, i, agek4.e.I());
        agek agek5;
        if ((agek5 = agej.c) == null) {
            agek5 = agek.a;
        }
        agei agei3;
        if ((agei3 = agek5.c) == null) {
            agei3 = agei.a;
        }
        int z;
        if ((z = aexq.Z(agei3.b)) == 0) {
            z = 1;
        }
        final int s = aexq.S(z);
        agek agek6;
        if ((agek6 = agej.c) == null) {
            agek6 = agek.a;
        }
        agei agei4;
        if ((agei4 = agek6.c) == null) {
            agei4 = agei.a;
        }
        int q2;
        if ((q2 = aewr.q(agei4.d)) == 0) {
            q2 = 1;
        }
        agih.a(d, e, s, aexq.R(q2));
        agek agek7;
        if ((agek7 = agej.c) == null) {
            agek7 = agek.a;
        }
        agei agei5;
        if ((agei5 = agek7.c) == null) {
            agei5 = agei.a;
        }
        int z2;
        if ((z2 = aexq.Z(agei5.b)) == 0) {
            z2 = 1;
        }
        final int s2 = aexq.S(z2);
        agek agek8;
        if ((agek8 = agej.c) == null) {
            agek8 = agek.a;
        }
        agei agei6;
        if ((agei6 = agek8.c) == null) {
            agei6 = agei.a;
        }
        int q3 = aewr.q(agei6.d);
        if (q3 == 0) {
            q3 = n;
        }
        return new aghf(d, s2, aexq.R(q3));
    }
}
