import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agcr extends agci
{
    public agcr(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agdo agdo = (agdo)messageLite;
        final aghx aghx = new aghx(agdo.c.I());
        agdq agdq;
        if ((agdq = agdo.d) == null) {
            agdq = agdq.a;
        }
        return new agia((agdn)aghx, agdq.b);
    }
}
