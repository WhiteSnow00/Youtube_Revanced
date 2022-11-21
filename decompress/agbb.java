import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbb extends agci
{
    public agbb(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final ageo ageo = (ageo)messageLite;
        agep agep;
        if ((agep = ageo.c) == null) {
            agep = agep.a;
        }
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
        aexq.D(aewr.A(n2), ageo.d.I());
        agel agel;
        if ((agel = agen.c) == null) {
            agel = agel.a;
        }
        agfd agfd;
        if ((agfd = agel.b) == null) {
            agfd = agfd.a;
        }
        new agbj(agfd);
        ageq.d.I();
        int z;
        if ((z = aexq.Z(ageq.c)) == 0) {
            z = 1;
        }
        aewr.z(z);
        int s = aewr.s(agen.d);
        if (s == 0) {
            s = n;
        }
        aewr.B(s);
        return new agbo();
    }
}
