import java.security.interfaces.ECPublicKey;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class aggc extends agci
{
    public aggc(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agek agek = (agek)messageLite;
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
        final ECPublicKey e = aexq.E(aexq.Q(n2), agek.d.I(), agek.e.I());
        agei agei2;
        if ((agei2 = agek.c) == null) {
            agei2 = agei.a;
        }
        int z;
        if ((z = aexq.Z(agei2.b)) == 0) {
            z = 1;
        }
        final int s = aexq.S(z);
        agei agei3;
        if ((agei3 = agek.c) == null) {
            agei3 = agei.a;
        }
        int q = aewr.q(agei3.d);
        if (q == 0) {
            q = n;
        }
        return new aghg(e, s, aexq.R(q));
    }
}
