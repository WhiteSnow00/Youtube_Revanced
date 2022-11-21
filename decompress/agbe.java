import java.security.interfaces.ECPublicKey;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbe extends agci
{
    public agbe(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agep agep = (agep)messageLite;
        agen agen;
        if ((agen = agep.c) == null) {
            agen = agen.a;
        }
        ageq ageq;
        if ((ageq = agen.b) == null) {
            ageq = ageq.a;
        }
        final int p = aewr.p(ageq.b);
        final int n = 1;
        int n2;
        if ((n2 = p) == 0) {
            n2 = 1;
        }
        final ECPublicKey e = aexq.E(aewr.A(n2), agep.d.I(), agep.e.I());
        agel agel;
        if ((agel = agen.c) == null) {
            agel = agel.a;
        }
        agfd agfd;
        if ((agfd = agel.b) == null) {
            agfd = agfd.a;
        }
        final agbj agbj = new agbj(agfd);
        final byte[] i = ageq.d.I();
        int z;
        if ((z = aexq.Z(ageq.c)) == 0) {
            z = 1;
        }
        final String z2 = aewr.z(z);
        int s = aewr.s(agen.d);
        if (s == 0) {
            s = n;
        }
        return new aghi(e, i, z2, aewr.B(s), (aghh)agbj);
    }
}
