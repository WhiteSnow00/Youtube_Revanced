import java.util.LinkedHashMap;
import java.util.Map;
import android.view.View;
import java.lang.ref.WeakReference;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public class oxr
{
    public boolean a;
    public long b;
    protected long c;
    protected double d;
    protected final long e;
    protected final oyb f;
    protected oxs g;
    public Rect h;
    private WeakReference i;
    
    public oxr(final oyb f) {
        this.c = -1L;
        this.d = -1.0;
        this.f = f;
        this.e = System.currentTimeMillis();
    }
    
    public final View a() {
        return (View)this.i.get();
    }
    
    public final Boolean b() {
        return this.a;
    }
    
    public final Map c() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(oxo.c, "a");
        final oxo x = oxo.x;
        final mck f = this.f.f;
        final Integer value = 0;
        linkedHashMap.put(x, f.l(1, false));
        linkedHashMap.put(oxo.al, this.e);
        linkedHashMap.put(oxo.aJ, this.d);
        final oxo l = oxo.l;
        final oxs g = this.g;
        final double n = 0.0;
        double a;
        if (g != null) {
            a = g.a;
        }
        else {
            a = 0.0;
        }
        linkedHashMap.put(l, a);
        final oxo s = oxo.s;
        final oxs g2 = this.g;
        double b = n;
        if (g2 != null) {
            b = g2.b;
        }
        linkedHashMap.put(s, b);
        final oxo q = oxo.Q;
        final oxs g3 = this.g;
        Integer[] array = null;
        Label_0279: {
            if (g3 != null) {
                final Rect c = g3.c;
                if (c != null) {
                    array = new Integer[] { c.top, this.g.c.left, this.g.c.bottom, this.g.c.right };
                    break Label_0279;
                }
            }
            array = new Integer[] { value, value, value, value };
        }
        linkedHashMap.put(q, array);
        final oxs g4 = this.g;
        if (g4 != null) {
            final Rect d = g4.d;
            if (d != null && !d.equals((Object)g4.c)) {
                linkedHashMap.put(oxo.V, new Integer[] { this.g.d.top, this.g.d.left, this.g.d.bottom, this.g.d.right });
            }
        }
        final oxo ab = oxo.ab;
        final oxs g5 = this.g;
        Integer[] array2 = null;
        Label_0469: {
            if (g5 != null) {
                final Rect e = g5.e;
                if (e != null) {
                    array2 = new Integer[] { e.width(), this.g.e.height() };
                    break Label_0469;
                }
            }
            array2 = new Integer[] { value, value };
        }
        linkedHashMap.put(ab, array2);
        final oxo ac = oxo.ac;
        final oxs g6 = this.g;
        Integer[] array3 = null;
        Label_0552: {
            if (g6 != null) {
                final Rect f2 = g6.f;
                if (f2 != null) {
                    array3 = new Integer[] { f2.width(), this.g.f.height() };
                    break Label_0552;
                }
            }
            array3 = new Integer[] { value, value };
        }
        linkedHashMap.put(ac, array3);
        linkedHashMap.put(oxo.m, this.f.a);
        linkedHashMap.put(oxo.n, this.f.b);
        linkedHashMap.put(oxo.y, this.f.e.l(1, false));
        linkedHashMap.put(oxo.z, this.f.d());
        return linkedHashMap;
    }
    
    public void d(final View view) {
        this.i = new WeakReference((T)view);
    }
    
    public final void e(final int n, final int n2, final int n3, final int n4) {
        this.h = new Rect(n, n2, n3 + n, n4 + n2);
    }
    
    public boolean f() {
        return false;
    }
    
    public final boolean g() {
        return this.f.c();
    }
    
    public boolean h() {
        return this.a;
    }
}
