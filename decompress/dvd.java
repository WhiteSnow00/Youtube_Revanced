import java.util.List;
import java.util.Map;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvd implements Cloneable
{
    public final dsx a;
    public final String b;
    public final dst c;
    public final Rect d;
    public final int e;
    public final int f;
    public final int g;
    public final dxh h;
    public final long i;
    public int j;
    public long k;
    public int l;
    public final dtz m;
    public final glo n;
    private final int o;
    private final int p;
    
    public dvd(final dtz m, final glo n, final dst c, final String b, final Rect d, int n2, final int p13, final int e, final long i, final int n3, final int g, final dxh h, final byte[] array) {
        this.l = 0;
        this.m = m;
        this.n = n;
        this.c = c;
        this.b = b;
        this.a = c.p;
        this.d = d;
        this.o = n2;
        this.p = p13;
        this.e = e;
        this.i = i;
        n2 = n3;
        if (n3 == 8) {
            n2 = 1;
        }
        this.f = n2;
        this.g = g;
        this.h = h;
    }
    
    public static dvd b(final ega ega) {
        return c(ega.d);
    }
    
    public static dvd c(final ege ege) {
        return ege.b.a;
    }
    
    public static boolean e(final int n) {
        return (n & 0x1) == 0x1;
    }
    
    static ege g(final dvd dvd, final ege ege, final Map map) {
        final egg egg = new egg(dvd);
        final Rect rect = new Rect();
        dvd.f(rect);
        final glo n = dvd.n;
        if (ege != null) {
            final List e = ege.e;
            if (e != null) {
                e.size();
            }
        }
        return new ege(ege, egg, (Object)map, rect);
    }
    
    public final int a() {
        final long k = this.k;
        if (k == 0L) {
            return 3;
        }
        return (int)(k >> 16 & 0x7L);
    }
    
    public final boolean d() {
        if (this.f == 2) {
            return false;
        }
        final dtz m = this.m;
        return (m != null && m.C()) || ((dtd)this.c).aj();
    }
    
    public final void f(final Rect rect) {
        rect.left = this.d.left - this.o;
        rect.top = this.d.top - this.p;
        rect.right = this.d.right - this.o;
        rect.bottom = this.d.bottom - this.p;
    }
}
