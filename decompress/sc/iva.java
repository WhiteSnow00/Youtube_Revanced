import android.graphics.Rect;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iva implements asjs
{
    public static final iva a;
    public static final iva b;
    public static final iva c;
    public static final iva d;
    public static final iva e;
    public static final iva f;
    public static final iva g;
    public static final iva h;
    public static final iva i;
    public static final iva j;
    public static final iva k;
    public static final iva l;
    public static final iva m;
    public static final iva n;
    public static final iva o;
    public static final iva p;
    public static final iva q;
    public static final iva r;
    public static final iva s;
    public static final iva t;
    public static final iva u;
    private final int v;
    
    static {
        u = new iva(20);
        t = new iva(19);
        s = new iva(18);
        r = new iva(17);
        q = new iva(16);
        p = new iva(15);
        o = new iva(14);
        n = new iva(13);
        m = new iva(12);
        l = new iva(11);
        k = new iva(10);
        j = new iva(9);
        i = new iva(8);
        h = new iva(7);
        g = new iva(6);
        f = new iva(5);
        e = new iva(4);
        d = new iva(3);
        c = new iva(2);
        b = new iva(1);
        a = new iva(0);
    }
    
    private iva(final int v) {
        this.v = v;
    }
    
    public final boolean a(final Object o) {
        switch (this.v) {
            default: {
                final Long n = (Long)o;
                if (tok.j(tok.b, (long)n) && tok.j(tok.a, (long)n) && !tok.i(tok.d, (long)n)) {
                    break;
                }
                return true;
            }
            case 19: {
                return (boolean)o;
            }
            case 18: {
                return ((akri)o).b == 117866661;
            }
            case 17: {
                return ((akri)o).b == 123267149;
            }
            case 16: {
                return ((akri)o).b == 123267149;
            }
            case 15: {
                final Boolean b = (Boolean)o;
                final wzz a = jqq.a;
                return b;
            }
            case 14: {
                return ((aanf)o).b().a(new abka[] { abka.f });
            }
            case 13: {
                return ((wxb)o).a() == wxc.a;
            }
            case 12: {
                return ((aezp)o).h();
            }
            case 11: {
                return ((vft)o).c != null;
            }
            case 10: {
                return (boolean)o;
            }
            case 9: {
                return (boolean)o;
            }
            case 8: {
                return !((jdl)o).b.equals(jdm.b);
            }
            case 7: {
                return ((Optional)o).isPresent();
            }
            case 6: {
                return !((Integer)o).equals(0);
            }
            case 5: {
                return jbh.k((jbg)o);
            }
            case 4: {
                final Boolean b2 = (Boolean)o;
                final Rect a2 = YouTubeControlsOverlay.a;
                return b2;
            }
            case 3: {
                return ((aezp)o).h();
            }
            case 2: {
                return ((Optional)o).isPresent();
            }
            case 1: {
                return ((aans)o).c().a(new abke[] { abke.i });
            }
            case 0: {
                if (((aanw)o).a() == 2) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
