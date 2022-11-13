import java.util.function.Function;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzh implements asjr
{
    public static final hzh a;
    public static final hzh b;
    public static final hzh c;
    public static final hzh d;
    public static final hzh e;
    public static final hzh f;
    public static final hzh g;
    public static final hzh h;
    public static final hzh i;
    public static final hzh j;
    public static final hzh k;
    public static final hzh l;
    public static final hzh m;
    public static final hzh n;
    public static final hzh o;
    public static final hzh p;
    public static final hzh q;
    public static final hzh r;
    public static final hzh s;
    public static final hzh t;
    public static final hzh u;
    private final int v;
    
    static {
        u = new hzh(20);
        t = new hzh(19);
        s = new hzh(18);
        r = new hzh(17);
        q = new hzh(16);
        p = new hzh(15);
        o = new hzh(14);
        n = new hzh(13);
        m = new hzh(12);
        l = new hzh(11);
        k = new hzh(10);
        j = new hzh(9);
        i = new hzh(8);
        h = new hzh(7);
        g = new hzh(6);
        f = new hzh(5);
        e = new hzh(4);
        d = new hzh(3);
        c = new hzh(2);
        b = new hzh(1);
        a = new hzh(0);
    }
    
    private hzh(final int v) {
        this.v = v;
    }
    
    public final Object a(final Object o) {
        switch (this.v) {
            default: {
                final vfn c = ((vft)o).c;
                c.getClass();
                return c;
            }
            case 19: {
                return ((vfn)o).e();
            }
            case 18: {
                return asht.U((Iterable)o);
            }
            case 17: {
                final iem iem = (iem)o;
                final afft a = ieu.a;
                return ashi.K((Object)iem).Q();
            }
            case 16: {
                return ((ashi)o).aa((asjs)hus.p).aB(500L, TimeUnit.MILLISECONDS).Q();
            }
            case 15: {
                final vft vft = (vft)o;
                final afft a2 = ieo.a;
                return ien.a(aezp.j((Object)vft.c), vft.a, vft.e);
            }
            case 14: {
                return ashi.H((Iterable)o);
            }
            case 13: {
                return ((asie)o).f();
            }
            case 12: {
                final vfn c2 = ((vft)o).c;
                c2.getClass();
                return c2;
            }
            case 11: {
                final Optional optional = (Optional)o;
                final int b = icy.b;
                return optional.map((Function)hvv.q).orElse((Object)asht.X((Object)Optional.empty()));
            }
            case 10: {
                return Optional.of((Object)o);
            }
            case 9: {
                return ((Optional)o).map((Function)hvv.p).orElse((Object)asht.X((Object)Optional.empty()));
            }
            case 8: {
                final ggq ggq = (ggq)o;
                final String a3 = ibj.a;
                Boolean b2;
                if (ggq.bo()) {
                    b2 = false;
                }
                else {
                    b2 = true;
                }
                return b2;
            }
            case 7: {
                final akcn akcn = (akcn)o;
                final int h = iav.h;
                amfk amfk;
                if ((amfk = akcn.l) == null) {
                    amfk = amfk.a;
                }
                return amfk.f;
            }
            case 6: {
                final asie asie = (asie)o;
                return new fhv();
            }
            case 5: {
                final vqu vqu = (vqu)o;
                return new fhu();
            }
            case 4: {
                final Throwable t = (Throwable)o;
                return new fht();
            }
            case 3: {
                return ((asie)o).e().O().J((asjr)huy.u);
            }
            case 2: {
                return ((aeea)o).a;
            }
            case 1: {
                return ((asie)o).i().F();
            }
            case 0: {
                return ((asie)o).i().F();
            }
        }
    }
}
