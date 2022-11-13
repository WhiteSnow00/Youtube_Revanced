import java.security.interfaces.ECPublicKey;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agek extends agaq
{
    public agek(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agcs agcs = (agcs)messageLite;
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
        final ECPublicKey n3 = aevy.N(aevy.Z(n2), agcs.d.I(), agcs.e.I());
        agcq agcq2;
        if ((agcq2 = agcs.c) == null) {
            agcq2 = agcq.a;
        }
        int e;
        if ((e = aeuz.E(agcq2.b)) == 0) {
            e = 1;
        }
        final int ab = aevy.ab(e);
        agcq agcq3;
        if ((agcq3 = agcs.c) == null) {
            agcq3 = agcq.a;
        }
        int h = aeuz.H(agcq3.d);
        if (h == 0) {
            h = n;
        }
        return new agfo(n3, ab, aevy.aa(h));
    }
}
