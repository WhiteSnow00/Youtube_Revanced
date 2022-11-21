import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzk extends agci
{
    public afzk(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agdt agdt = (agdt)messageLite;
        final byte[] i = agdt.d.I();
        agdv agdv;
        if ((agdv = agdt.c) == null) {
            agdv = agdv.a;
        }
        return new aggy(i, agdv.b);
    }
}
