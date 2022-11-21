import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class afzh extends agci
{
    public afzh(final Class clazz) {
        super(clazz);
    }
    
    public final /* bridge */ Object a(final MessageLite messageLite) {
        final agdr agdr = (agdr)messageLite;
        final afzm afzm = new afzm();
        agdt agdt;
        if ((agdt = agdr.c) == null) {
            agdt = agdt.a;
        }
        final aghw aghw = (aghw)afzm.i((MessageLite)agdt, (Class)aghw.class);
        final agdb agdb = new agdb();
        ageu ageu;
        if ((ageu = agdr.d) == null) {
            ageu = ageu.a;
        }
        final afyw afyw = (afyw)agdb.i((MessageLite)ageu, (Class)afyw.class);
        ageu ageu2;
        if ((ageu2 = agdr.d) == null) {
            ageu2 = ageu.a;
        }
        agew agew;
        if ((agew = ageu2.c) == null) {
            agew = agew.a;
        }
        final int c = agew.c;
        return new aghp(aghw, afyw);
    }
}
