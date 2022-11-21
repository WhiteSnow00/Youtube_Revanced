import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agad extends agci
{
    public agad(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agfl agfl = (agfl)messageLite;
        agfm agfm;
        if ((agfm = agfl.c) == null) {
            agfm = agfm.a;
        }
        final afyf b = afyv.a(agfm.b).b();
        agfm agfm2;
        if ((agfm2 = agfl.c) == null) {
            agfm2 = agfm.a;
        }
        agfd agfd;
        if ((agfd = agfm2.c) == null) {
            agfd = agfd.a;
        }
        return new agac(agfd, b);
    }
}
