import j$.time.Duration;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqm implements asjr
{
    public static final iqm a;
    public static final iqm b;
    public static final iqm c;
    public static final iqm d;
    public static final iqm e;
    public static final iqm f;
    public static final iqm g;
    public static final iqm h;
    public static final iqm i;
    public static final iqm j;
    public static final iqm k;
    public static final iqm l;
    public static final iqm m;
    public static final iqm n;
    public static final iqm o;
    public static final iqm p;
    public static final iqm q;
    public static final iqm r;
    public static final iqm s;
    public static final iqm t;
    public static final iqm u;
    private final int v;
    
    static {
        u = new iqm(20);
        t = new iqm(19);
        s = new iqm(18);
        r = new iqm(17);
        q = new iqm(16);
        p = new iqm(15);
        o = new iqm(14);
        n = new iqm(13);
        m = new iqm(12);
        l = new iqm(11);
        k = new iqm(10);
        j = new iqm(9);
        i = new iqm(8);
        h = new iqm(7);
        g = new iqm(6);
        f = new iqm(5);
        e = new iqm(4);
        d = new iqm(3);
        c = new iqm(2);
        b = new iqm(1);
        a = new iqm(0);
    }
    
    private iqm(final int v) {
        this.v = v;
    }
    
    public final Object a(final Object o) {
        final int v = this.v;
        boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        int n = 0;
        switch (v) {
            default: {
                final ggj ggj = (ggj)o;
                boolean b4 = b3;
                if (ggj.a) {
                    b4 = b3;
                    if (((jcg)ggj.b).f) {
                        b4 = true;
                    }
                }
                return b4;
            }
            case 19: {
                final jcg jcg = (jcg)o;
                return jcg.e.Z((asjr)new jbe(jcg, 4));
            }
            case 18: {
                return ((Integer)o).equals(0) ^ true;
            }
            case 17: {
                return lar.a((int)o, 1);
            }
            case 16: {
                return ((fqx)o).k;
            }
            case 15: {
                return ((aezp)o).c();
            }
            case 14: {
                return ((aans)o).c().a(new abke[] { abke.e, abke.f });
            }
            case 13: {
                return ((Optional)o).get();
            }
            case 12: {
                andh andh = null;
                switch (((abkh)o).i - 1) {
                    default: {
                        andh = andh.o;
                        break;
                    }
                    case 13: {
                        andh = andh.n;
                        break;
                    }
                    case 12: {
                        andh = andh.m;
                        break;
                    }
                    case 11: {
                        andh = andh.l;
                        break;
                    }
                    case 10: {
                        andh = andh.k;
                        break;
                    }
                    case 9: {
                        andh = andh.j;
                        break;
                    }
                    case 8: {
                        andh = andh.i;
                        break;
                    }
                    case 7: {
                        andh = andh.h;
                        break;
                    }
                    case 6: {
                        andh = andh.g;
                        break;
                    }
                    case 5: {
                        andh = andh.f;
                        break;
                    }
                    case 4: {
                        andh = andh.e;
                        break;
                    }
                    case 3: {
                        andh = andh.d;
                        break;
                    }
                    case 2: {
                        andh = andh.c;
                        break;
                    }
                    case 1: {
                        andh = andh.b;
                        break;
                    }
                    case 0: {
                        andh = andh.a;
                        break;
                    }
                }
                return new ium(andh);
            }
            case 11: {
                return iui.b;
            }
            case 10: {
                final aalz aalz = (aalz)o;
                return 2;
            }
            case 9: {
                final aanw aanw = (aanw)o;
                final afeq a = iui.a;
                final int a2 = aanw.a();
                if (a2 != 2) {
                    if (a2 == 3) {
                        n = 3;
                    }
                }
                else {
                    n = 1;
                }
                return n;
            }
            case 8: {
                return ((aanw)o).a();
            }
            case 7: {
                final aamh aamh = (aamh)o;
                final Duration a3 = iua.a;
                if (aamh.d() == abjv.d) {
                    b = true;
                }
                return b;
            }
            case 6: {
                final aaks aaks = (aaks)o;
                return iua.b;
            }
            case 5: {
                return ((abpu)o).p().b;
            }
            case 4: {
                boolean b5 = b2;
                if ((int)o > 0) {
                    b5 = true;
                }
                return b5;
            }
            case 3: {
                return ((aezp)o).c();
            }
            case 2: {
                return ((flm)o).b;
            }
            case 1: {
                final ajiw ajiw = (ajiw)o;
                String s;
                if (ajiw.c == 1) {
                    s = (String)ajiw.d;
                }
                else {
                    s = "";
                }
                return s;
            }
            case 0: {
                final ajiw ajiw2 = (ajiw)o;
                aqdy a4;
                if (ajiw2.c == 2) {
                    a4 = (aqdy)ajiw2.d;
                }
                else {
                    a4 = aqdy.a;
                }
                return a4;
            }
        }
    }
}
