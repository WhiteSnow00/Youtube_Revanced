import java.util.function.Function;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huy implements asjr
{
    public static final huy a;
    public static final huy b;
    public static final huy c;
    public static final huy d;
    public static final huy e;
    public static final huy f;
    public static final huy g;
    public static final huy h;
    public static final huy i;
    public static final huy j;
    public static final huy k;
    public static final huy l;
    public static final huy m;
    public static final huy n;
    public static final huy o;
    public static final huy p;
    public static final huy q;
    public static final huy r;
    public static final huy s;
    public static final huy t;
    public static final huy u;
    private final int v;
    
    static {
        u = new huy(20);
        t = new huy(19);
        s = new huy(18);
        r = new huy(17);
        q = new huy(16);
        p = new huy(15);
        o = new huy(14);
        n = new huy(13);
        m = new huy(12);
        l = new huy(11);
        k = new huy(10);
        j = new huy(9);
        i = new huy(8);
        h = new huy(7);
        g = new huy(6);
        f = new huy(5);
        e = new huy(4);
        d = new huy(3);
        c = new huy(2);
        b = new huy(1);
        a = new huy(0);
    }
    
    private huy(final int v) {
        this.v = v;
    }
    
    public final Object a(final Object o) {
        switch (this.v) {
            default: {
                return o;
            }
            case 19: {
                final aezq aezq = (aezq)o;
                return twb.a;
            }
            case 18: {
                return ((aezp)o).c();
            }
            case 17: {
                final Boolean b = (Boolean)o;
                return twb.a;
            }
            case 16: {
                final trs trs = (trs)o;
                int a;
                if (trs instanceof tru) {
                    a = ((tru)trs).a;
                }
                else {
                    a = 0;
                }
                return a;
            }
            case 15: {
                alxw alxw;
                if ((alxw = ((akcn)o).e) == null) {
                    alxw = alxw.a;
                }
                return alxw.aV;
            }
            case 14: {
                final Throwable t = (Throwable)o;
                if (t instanceof dbj) {
                    return new hwk(Optional.empty(), Optional.of((Object)t));
                }
                throw new twa(t);
            }
            case 13: {
                o.getClass();
                return new hwk(Optional.of(o), Optional.empty());
            }
            case 12: {
                final asht asht = (asht)o;
                final int cu = hwl.cU;
                return asht;
            }
            case 11: {
                final Optional optional = (Optional)o;
                final int cu2 = hwl.cU;
                return optional.map((Function)hpl.u);
            }
            case 10: {
                jqe jqe;
                if ((jqe = jqe.a(((jqf)o).m)) == null) {
                    jqe = jqe.a;
                }
                return jqe;
            }
            case 9: {
                return ((kdi)o).e;
            }
            case 8: {
                return ((Optional)o).get();
            }
            case 7: {
                return kdi.a((anbs)o);
            }
            case 6: {
                return ((Optional)o).get();
            }
            case 5: {
                final Boolean b2 = (Boolean)o;
                return hvf.a();
            }
            case 4: {
                return o;
            }
            case 3: {
                final huq huq = (huq)o;
                final apij b3 = huq.b;
                final apij a2 = huq.a;
                Object o2;
                if (b3 == null) {
                    o2 = hvf.a();
                }
                else {
                    if (a2 == null) {
                        if (b3.getNumVideosFailed() > 0) {
                            o2 = hve.a((int)b3.getNumVideosFailed(), b3.getNumVideosFailed() + b3.getNumVideosCompleted() + b3.getNumVideosInProgress());
                            return o2;
                        }
                        if (b3.getNumVideosInProgress() > 0) {
                            o2 = hvg.a((float)b3.getUploadProgress(), (int)b3.getNumVideosInProgress(), (int)b3.getNumVideosCompleted(), (int)b3.getNumVideosFailed());
                            return o2;
                        }
                        if (b3.getNumVideosCompleted() > 0) {
                            o2 = hvd.a((int)b3.getNumVideosCompleted(), (int)b3.getNumVideosInProgress(), (int)b3.getNumVideosFailed());
                            return o2;
                        }
                    }
                    else {
                        if (b3.getNumVideosFailed() > a2.getNumVideosFailed()) {
                            o2 = hve.a((int)b3.getNumVideosFailed(), b3.getNumVideosFailed() + b3.getNumVideosCompleted() + b3.getNumVideosInProgress());
                            return o2;
                        }
                        if (b3.getNumVideosInProgress() > 0) {
                            o2 = hvg.a((float)b3.getUploadProgress(), (int)b3.getNumVideosInProgress(), (int)b3.getNumVideosCompleted(), (int)b3.getNumVideosFailed());
                            return o2;
                        }
                        if (b3.getNumVideosCompleted() > a2.getNumVideosCompleted()) {
                            o2 = hvd.a((int)b3.getNumVideosCompleted(), (int)b3.getNumVideosInProgress(), (int)b3.getNumVideosFailed());
                            return o2;
                        }
                    }
                    o2 = hvf.a();
                }
                return o2;
            }
            case 2: {
                return huq.a((vft)o);
            }
            case 1: {
                return o;
            }
            case 0: {
                final Boolean b4 = (Boolean)o;
                return hvf.a();
            }
        }
    }
}
