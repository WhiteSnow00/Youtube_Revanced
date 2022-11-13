import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaxs implements asjr
{
    public static final aaxs a;
    public static final aaxs b;
    public static final aaxs c;
    public static final aaxs d;
    public static final aaxs e;
    public static final aaxs f;
    public static final aaxs g;
    public static final aaxs h;
    public static final aaxs i;
    public static final aaxs j;
    public static final aaxs k;
    public static final aaxs l;
    public static final aaxs m;
    public static final aaxs n;
    public static final aaxs o;
    public static final aaxs p;
    public static final aaxs q;
    public static final aaxs r;
    public static final aaxs s;
    public static final aaxs t;
    public static final aaxs u;
    private final int v;
    
    static {
        u = new aaxs(20);
        t = new aaxs(19);
        s = new aaxs(18);
        r = new aaxs(17);
        q = new aaxs(16);
        p = new aaxs(15);
        o = new aaxs(14);
        n = new aaxs(13);
        m = new aaxs(12);
        l = new aaxs(11);
        k = new aaxs(10);
        j = new aaxs(9);
        i = new aaxs(8);
        h = new aaxs(7);
        g = new aaxs(6);
        f = new aaxs(5);
        e = new aaxs(4);
        d = new aaxs(3);
        c = new aaxs(2);
        b = new aaxs(1);
        a = new aaxs(0);
    }
    
    private aaxs(final int v) {
        this.v = v;
    }
    
    public final Object a(final Object o) {
        switch (this.v) {
            default: {
                return ((afhd)o).a;
            }
            case 19: {
                return ((afhd)o).a;
            }
            case 18: {
                final aanf aanf = (aanf)o;
                return true;
            }
            case 17: {
                return aald.ab((Object)o);
            }
            case 16: {
                return aald.ab((Object)o);
            }
            case 15: {
                return aald.ab((Object)o);
            }
            case 14: {
                return ((aany)o).a().Y();
            }
            case 13: {
                ttr.f("WillAutonavInformer", "Error retrieving isAutoNavDisabled, assuming restricted.", (Throwable)o);
                return false;
            }
            case 12: {
                final abzl a = ((aany)o).a();
                return a.x().L((asjr)new zgy(a, 12));
            }
            case 11: {
                return ((aqre)o).d;
            }
            case 10: {
                return ((aans)o).c().a(new abke[] { abke.d, abke.e, abke.f });
            }
            case 9: {
                return ((aezp)o).c();
            }
            case 8: {
                return ((aans)o).c().a(new abke[] { abke.d, abke.e, abke.f });
            }
            case 7: {
                return ((aezp)o).c();
            }
            case 6: {
                return ((Optional)o).get();
            }
            case 5: {
                return ((aanc)o).a();
            }
            case 4: {
                return ((Optional)o).get();
            }
            case 3: {
                return ((aayd)o).c;
            }
            case 2: {
                return ((aayd)o).e;
            }
            case 1: {
                return ((aanw)o).a();
            }
            case 0: {
                return ((aayd)o).d;
            }
        }
    }
}
