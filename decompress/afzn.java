import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzn extends agci
{
    public afzn(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agdw agdw = (agdw)messageLite;
        final byte[] i = agdw.d.I();
        agdy agdy;
        if ((agdy = agdw.c) == null) {
            agdy = agdy.a;
        }
        return new aghb(i, agdy.b);
    }
}
