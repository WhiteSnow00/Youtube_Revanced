import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import android.graphics.Bitmap;
import java.util.Set;
import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abul
{
    private static final SparseIntArray r;
    public final Set a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public int i;
    public int j;
    public float k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public Bitmap o;
    public Bitmap p;
    public lrd q;
    private final AtomicBoolean s;
    private int t;
    private vgy u;
    
    static {
        final SparseIntArray r2 = new SparseIntArray();
        (r = r2).put(0, 0);
        r2.put(1, 1);
        r2.put(2, 1);
        r2.put(3, 1);
        r2.put(4, 6);
        r2.put(5, 1);
        r2.put(6, 1);
        r2.put(7, 1);
        r2.put(8, 5);
        r2.put(9, 1);
        r2.put(10, 1);
        r2.put(11, 1);
        r2.put(12, 4);
        r2.put(13, 1);
    }
    
    public abul() {
        this.s = new AtomicBoolean();
        this.a = new CopyOnWriteArraySet();
        this.b = 0;
        this.e = true;
        this.l = "";
        this.m = "";
        this.n = "";
        this.k = 1.0f;
        this.u = new vgy();
        this.q = lrd.a;
    }
    
    final void a() {
        if (this.s.compareAndSet(true, false)) {
            this.b(0);
            return;
        }
        throw new IllegalStateException();
    }
    
    public final void b(final int n) {
        this.t |= n;
        if (this.s.get()) {
            return;
        }
        if (this.t != 0) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((abuk)iterator.next()).d(this.t);
            }
        }
        this.t = 0;
    }
    
    public final void c(final abuk abuk) {
        this.a.add(abuk);
    }
    
    public final void d() {
        this.n();
        this.i(0);
        this.h(false, false);
        this.f(false);
        this.g(0L);
        this.j(0L);
        this.m(null, null);
        final CharSequence d = tvb.d((CharSequence)null);
        if (!TextUtils.equals(this.n, d)) {
            this.n = d;
            this.b(512);
        }
        this.l(new vgy());
        this.k(null, null);
        this.a();
    }
    
    public final void e(final boolean e) {
        if (this.e != e) {
            this.e = e;
            this.b(256);
        }
    }
    
    public final void f(final boolean f) {
        if (this.f != f) {
            this.f = f;
            this.b(4);
        }
    }
    
    public final void g(final long g) {
        if (this.g != g) {
            this.g = g;
            this.b(8);
        }
    }
    
    final void h(final boolean c, final boolean d) {
        if (this.c == c && this.d == d) {
            return;
        }
        this.c = c;
        this.d = d;
        this.b(2);
    }
    
    public final void i(final int b) {
        if (this.b != b) {
            this.b = b;
            this.b(1);
        }
    }
    
    final void j(final long h) {
        if (this.h != h) {
            this.h = h;
            this.b(16);
        }
    }
    
    public final void k(final Bitmap o, final Bitmap p2) {
        this.o = o;
        this.p = p2;
        this.b(128);
    }
    
    public final void l(final vgy u) {
        if (!adkp.ae((Object)this.u.e(), (Object)u.e())) {
            this.u = u;
            this.b(64);
        }
    }
    
    public final void m(CharSequence d, CharSequence d2) {
        d = tvb.d(d);
        final boolean equals = TextUtils.equals(this.l, d);
        d2 = tvb.d(d2);
        if (equals && TextUtils.equals(this.m, d2)) {
            return;
        }
        this.l = d;
        this.m = d2;
        this.b(32);
    }
    
    final void n() {
        if (this.s.compareAndSet(false, true)) {
            return;
        }
        throw new IllegalStateException();
    }
}
