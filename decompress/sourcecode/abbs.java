import android.view.View;
import android.os.Handler;
import android.net.Uri;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbs implements abnq, tec
{
    public final abbq a;
    public Bitmap b;
    private final aceo c;
    private final szx d;
    private szz e;
    private Uri f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    
    public abbs(final abbq a, final aceo c) {
        this.a = a;
        c.getClass();
        this.c = c;
        this.d = (szx)taf.c(new Handler(), (szx)new hwo(this, 12));
    }
    
    private final void d() {
        this.f = null;
        this.b = null;
        final szz e = this.e;
        if (e != null) {
            e.d();
            this.e = null;
        }
        this.a.m();
    }
    
    private final void f() {
        if ((this.g && (this.i || this.j)) || !this.h) {
            if (this.b == null && this.f != null && this.e == null) {
                final szz c = szz.c(this.d);
                this.e = c;
                this.c.k(this.f, (szx)c);
            }
            this.a.mm();
            return;
        }
        this.a.mk();
    }
    
    public final void a(final aakn aakn) {
        this.j = (aakn.d() == abid.h);
        this.f();
    }
    
    public final void b(final aalw aalw) {
        this.i = aalw.b();
        this.f();
    }
    
    public final void c(final aaly aaly) {
        if (aaly.c() == abim.a) {
            this.d();
        }
        else if (aaly.c().c(abim.c)) {
            final abbq a = this.a;
            final boolean b = a instanceof absb;
            final Uri uri = null;
            View md;
            if (b) {
                md = ((absb)a).md();
            }
            else {
                md = null;
            }
            int width;
            if (md != null) {
                width = md.getWidth();
            }
            else {
                width = 480;
            }
            int height;
            if (md != null) {
                height = md.getHeight();
            }
            else {
                height = 320;
            }
            if (aaly.b() != null) {
                final vey l = aaly.b().l();
                Uri a2 = uri;
                if (l.f()) {
                    a2 = l.b(width, height).a();
                }
                if (a2 == null || !a2.equals((Object)this.f)) {
                    this.d();
                }
                this.f = a2;
            }
        }
        this.g = aaly.c().c(abim.c);
        this.h = (aaly.c().a(new abim[] { abim.c, abim.d, abim.g, abim.j }) ^ true);
        this.f();
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = ((asgt)abns.q().a).j(aajj.t(abns.bN(), 2097152L)).j(aajj.r(1)).am((asix)new abat(this, 20), (asix)aaze.o);
        final asic am2 = ((asgt)abns.f().a).j(aajj.t(abns.bN(), 2097152L)).j(aajj.r(1)).am((asix)new abbr(this, 1), (asix)aaze.o);
        asic asic;
        if (((uyi)abns.cd().h).bw()) {
            asic = ((asgt)abns.f().f).am((asix)new abbr(this, 0), (asix)aaze.o);
        }
        else {
            asic = abns.f().b().j(aajj.t(abns.bN(), 2097152L)).j(aajj.r(0)).am((asix)new abbr(this, 0), (asix)aaze.o);
        }
        return new asic[] { am, am2, asic };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c((aaly)o);
                }
                else {
                    this.b((aalw)o);
                }
            }
            else {
                this.a((aakn)o);
            }
        }
        else {
            array = new Class[] { aakn.class, aalw.class, aaly.class };
        }
        return array;
    }
}
