import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbh
{
    public static final ahbh a;
    private final ConcurrentMap b;
    private final ahaq c;
    
    static {
        a = new ahbh();
    }
    
    private ahbh() {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
        this.c = new ahaq();
    }
    
    public final ahbp a(final Class clazz) {
        agzz.i(clazz, "messageType");
        Object o;
        if ((o = this.b.get(clazz)) == null) {
            final ahaq c = this.c;
            ahbq.p(clazz);
            final ahau a = c.a.a(clazz);
            if (a.c()) {
                if (agzi.class.isAssignableFrom(clazz)) {
                    o = ahba.c(ahbq.c, agyt.a, a.a());
                }
                else {
                    o = ahba.c(ahbq.a, agyt.a(), a.a());
                }
            }
            else if (agzi.class.isAssignableFrom(clazz)) {
                if (ahaq.a(a)) {
                    o = ahaz.m(a, ahbc.b, aham.b, ahbq.c, agyt.a, ahat.b);
                }
                else {
                    o = ahaz.m(a, ahbc.b, aham.b, ahbq.c, (ahbz)null, ahat.b);
                }
            }
            else if (ahaq.a(a)) {
                o = ahaz.m(a, ahbc.a, aham.a, ahbq.a, agyt.a(), ahat.a);
            }
            else {
                o = ahaz.m(a, ahbc.a, aham.a, ahbq.b, (ahbz)null, ahat.a);
            }
            agzz.i(clazz, "messageType");
            agzz.i(o, "schema");
            final ahbp ahbp = this.b.putIfAbsent(clazz, o);
            if (ahbp != null) {
                return ahbp;
            }
        }
        return (ahbp)o;
    }
    
    public final ahbp b(final Object o) {
        return this.a(o.getClass());
    }
}
