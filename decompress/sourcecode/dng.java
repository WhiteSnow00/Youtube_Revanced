import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.content.res.Resources$Theme;
import java.util.Map;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class dng implements Cloneable
{
    public float a;
    public dfh b;
    public dbz c;
    public Drawable d;
    public int e;
    public Drawable f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public ddj k;
    public boolean l;
    public boolean m;
    public Drawable n;
    public ddo o;
    public Map p;
    public Class q;
    public boolean r;
    public boolean s;
    public boolean t;
    private int u;
    private int v;
    private boolean w;
    private Resources$Theme x;
    private boolean y;
    private boolean z;
    
    public dng() {
        this.a = 1.0f;
        this.b = dfh.c;
        this.c = dbz.c;
        this.h = true;
        this.i = -1;
        this.j = -1;
        this.k = (ddj)doq.b;
        this.m = true;
        this.o = new ddo();
        this.p = (Map)new dou();
        this.q = Object.class;
        this.s = true;
    }
    
    private final dng a(final djx djx, final dds dds) {
        return this.b(djx, dds, false);
    }
    
    private final dng b(final djx djx, final dds dds, final boolean b) {
        dng dng;
        if (b) {
            dng = this.P(djx, dds);
        }
        else {
            dng = this.F(djx, dds);
        }
        dng.s = true;
        return dng;
    }
    
    private static boolean c(final int n, final int n2) {
        return (n & n2) != 0x0;
    }
    
    public dng A(final Drawable n) {
        if (this.r) {
            return this.n().A(n);
        }
        this.n = n;
        final int u = this.u;
        this.v = 0;
        this.u = ((u | 0x2000) & 0xFFFFBFFF);
        this.U();
        return this;
    }
    
    public dng B(final dda dda) {
        cll.h((Object)dda);
        return this.K(dka.a, dda).K(dlp.a, dda);
    }
    
    public dng C() {
        return this.F(djx.c, (dds)new djm());
    }
    
    public dng D() {
        return this.a(djx.b, (dds)new djn());
    }
    
    public dng E() {
        return this.a(djx.a, (dds)new dkf());
    }
    
    final dng F(final djx djx, final dds dds) {
        if (this.r) {
            return this.n().F(djx, dds);
        }
        this.x(djx);
        return this.O(dds, false);
    }
    
    public dng G(final int j, final int i) {
        if (this.r) {
            return this.n().G(j, i);
        }
        this.j = j;
        this.i = i;
        this.u |= 0x200;
        this.U();
        return this;
    }
    
    public dng H(int u) {
        if (this.r) {
            return this.n().H(u);
        }
        this.g = u;
        u = this.u;
        this.f = null;
        this.u = ((u | 0x80) & 0xFFFFFFBF);
        this.U();
        return this;
    }
    
    public dng I(final Drawable f) {
        if (this.r) {
            return this.n().I(f);
        }
        this.f = f;
        final int u = this.u;
        this.g = 0;
        this.u = ((u | 0x40) & 0xFFFFFF7F);
        this.U();
        return this;
    }
    
    public dng J(final dbz c) {
        if (this.r) {
            return this.n().J(c);
        }
        cll.h((Object)c);
        this.c = c;
        this.u |= 0x8;
        this.U();
        return this;
    }
    
    public dng K(final ddn ddn, final Object o) {
        if (this.r) {
            return this.n().K(ddn, o);
        }
        cll.h((Object)ddn);
        cll.h(o);
        this.o.d(ddn, o);
        this.U();
        return this;
    }
    
    public dng L(final ddj k) {
        if (this.r) {
            return this.n().L(k);
        }
        cll.h((Object)k);
        this.k = k;
        this.u |= 0x400;
        this.U();
        return this;
    }
    
    public dng M(final dds dds) {
        return this.O(dds, true);
    }
    
    public dng N(final dds... array) {
        final int length = array.length;
        if (length > 1) {
            return this.O((dds)new ddk(array), true);
        }
        if (length == 1) {
            return this.M(array[0]);
        }
        this.U();
        return this;
    }
    
    final dng O(final dds dds, final boolean b) {
        if (this.r) {
            return this.n().O(dds, b);
        }
        final dkd dkd = new dkd(dds, b);
        this.Q(Bitmap.class, dds, b);
        this.Q(Drawable.class, (dds)dkd, b);
        this.Q(BitmapDrawable.class, (dds)dkd, b);
        this.Q(dli.class, (dds)new dll(dds), b);
        this.U();
        return this;
    }
    
    final dng P(final djx djx, final dds dds) {
        if (this.r) {
            return this.n().P(djx, dds);
        }
        this.x(djx);
        return this.M(dds);
    }
    
    final dng Q(final Class clazz, final dds dds, final boolean b) {
        if (this.r) {
            return this.n().Q(clazz, dds, b);
        }
        cll.h((Object)clazz);
        cll.h((Object)dds);
        this.p.put(clazz, dds);
        final int u = this.u;
        this.m = true;
        final int u2 = u | 0x10800;
        this.u = u2;
        this.s = false;
        if (b) {
            this.u = (u2 | 0x20000);
            this.l = true;
        }
        this.U();
        return this;
    }
    
    public final boolean R(final int n) {
        return c(this.u, n);
    }
    
    public final boolean S() {
        return dpg.r(this.j, this.i);
    }
    
    public dng T() {
        if (this.r) {
            return this.n().T();
        }
        this.t = true;
        this.u |= 0x100000;
        this.U();
        return this;
    }
    
    protected final void U() {
        if (!this.w) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }
    
    public dng V() {
        if (this.r) {
            return this.n().V();
        }
        this.h = false;
        this.u |= 0x100;
        this.U();
        return this;
    }
    
    public void W() {
        this.w = true;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof dng) {
            final dng dng = (dng)o;
            if (Float.compare(dng.a, this.a) == 0 && this.e == dng.e && dpg.n(this.d, dng.d) && this.g == dng.g && dpg.n(this.f, dng.f)) {
                final int v = dng.v;
                if (dpg.n(this.n, dng.n) && this.h == dng.h && this.i == dng.i && this.j == dng.j && this.l == dng.l && this.m == dng.m) {
                    final boolean y = dng.y;
                    final boolean z = dng.z;
                    if (this.b.equals(dng.b) && this.c == dng.c && this.o.equals((Object)dng.o) && this.p.equals(dng.p) && this.q.equals(dng.q) && dpg.n(this.k, dng.k)) {
                        final Resources$Theme x = dng.x;
                        if (dpg.n(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return dpg.g(null, dpg.g(this.k, dpg.g(this.q, dpg.g(this.p, dpg.g(this.o, dpg.g(this.c, dpg.g(this.b, dpg.f(0, dpg.f(0, dpg.f((int)(this.m ? 1 : 0), dpg.f(this.l ? 1 : 0, dpg.f(this.j, dpg.f(this.i, dpg.f((int)(this.h ? 1 : 0), dpg.g(this.n, dpg.f(0, dpg.g(this.f, dpg.f(this.g, dpg.g(this.d, dpg.f(this.e, dpg.d(this.a)))))))))))))))))))));
    }
    
    public dng m(final dng dng) {
        if (this.r) {
            return this.n().m(dng);
        }
        final int u = dng.u;
        if (c(u, 2)) {
            this.a = dng.a;
        }
        if (c(u, 262144)) {
            final boolean y = dng.y;
            this.y = false;
        }
        if (c(u, 1048576)) {
            this.t = dng.t;
        }
        if (c(u, 4)) {
            this.b = dng.b;
        }
        if (c(u, 8)) {
            this.c = dng.c;
        }
        if (c(u, 16)) {
            this.d = dng.d;
            this.e = 0;
            this.u &= 0xFFFFFFDF;
        }
        if (c(dng.u, 32)) {
            this.e = dng.e;
            this.d = null;
            this.u &= 0xFFFFFFEF;
        }
        if (c(dng.u, 64)) {
            this.f = dng.f;
            this.g = 0;
            this.u &= 0xFFFFFF7F;
        }
        if (c(dng.u, 128)) {
            this.g = dng.g;
            this.f = null;
            this.u &= 0xFFFFFFBF;
        }
        final int u2 = dng.u;
        if (c(u2, 256)) {
            this.h = dng.h;
        }
        if (c(u2, 512)) {
            this.j = dng.j;
            this.i = dng.i;
        }
        if (c(u2, 1024)) {
            this.k = dng.k;
        }
        if (c(u2, 4096)) {
            this.q = dng.q;
        }
        if (c(u2, 8192)) {
            this.n = dng.n;
            this.v = 0;
            this.u &= 0xFFFFBFFF;
        }
        if (c(dng.u, 16384)) {
            final int v = dng.v;
            this.v = 0;
            this.n = null;
            this.u &= 0xFFFFDFFF;
        }
        final int u3 = dng.u;
        if (c(u3, 32768)) {
            final Resources$Theme x = dng.x;
            this.x = null;
        }
        if (c(u3, 65536)) {
            this.m = dng.m;
        }
        if (c(u3, 131072)) {
            this.l = dng.l;
        }
        if (c(u3, 2048)) {
            this.p.putAll(dng.p);
            this.s = dng.s;
        }
        if (c(dng.u, 524288)) {
            final boolean z = dng.z;
            this.z = false;
        }
        if (!this.m) {
            this.p.clear();
            final int u4 = this.u;
            this.l = false;
            this.u = (u4 & 0xFFFDF7FF);
            this.s = true;
        }
        this.u |= dng.u;
        this.o.c(dng.o);
        this.U();
        return this;
    }
    
    public dng n() {
        try {
            final dng dng = (dng)super.clone();
            (dng.o = new ddo()).c(this.o);
            (dng.p = (Map)new dou()).putAll(this.p);
            dng.w = false;
            dng.r = false;
            return dng;
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public dng s() {
        if (this.w && !this.r) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.r = true;
        this.W();
        return this;
    }
    
    public dng t() {
        return this.b(djx.b, (dds)new djn(), true);
    }
    
    public dng u(final Class q) {
        if (this.r) {
            return this.n().u(q);
        }
        cll.h((Object)q);
        this.q = q;
        this.u |= 0x1000;
        this.U();
        return this;
    }
    
    public dng v(final dfh b) {
        if (this.r) {
            return this.n().v(b);
        }
        cll.h((Object)b);
        this.b = b;
        this.u |= 0x4;
        this.U();
        return this;
    }
    
    public dng w() {
        if (this.r) {
            return this.n().w();
        }
        this.p.clear();
        final int u = this.u;
        this.l = false;
        this.m = false;
        this.u = ((u & 0xFFFDF7FF) | 0x10000);
        this.s = true;
        this.U();
        return this;
    }
    
    public dng x(final djx djx) {
        final ddn f = djx.f;
        cll.h((Object)djx);
        return this.K(f, djx);
    }
    
    public dng y(int u) {
        if (this.r) {
            return this.n().y(u);
        }
        this.e = u;
        u = this.u;
        this.d = null;
        this.u = ((u | 0x20) & 0xFFFFFFEF);
        this.U();
        return this;
    }
    
    public dng z(final Drawable d) {
        if (this.r) {
            return this.n().z(d);
        }
        this.d = d;
        final int u = this.u;
        this.e = 0;
        this.u = ((u | 0x10) & 0xFFFFFFDF);
        this.U();
        return this;
    }
}
