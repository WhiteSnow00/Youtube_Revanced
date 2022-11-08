import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcw extends tcv implements abnq
{
    public final abns d;
    public final asib e;
    public ves f;
    public boolean g;
    public boolean h;
    public boolean i;
    private final aioe j;
    private final WillAutonavInformer k;
    
    public abcw(final aioe j, final WillAutonavInformer k, final abns d) {
        this.e = new asib();
        this.j = j;
        this.k = k;
        this.d = d;
    }
    
    public final void b() {
        this.e.b();
    }
    
    public final void c() {
        final ves f = this.f;
        if (f == null) {
            this.c = false;
            return;
        }
        final vep a = f.a(this.g, this.h, this.i, false);
        if (a == null) {
            this.c = false;
            return;
        }
        if (!aaiy.f(this.j, a.b()) && (!aaiy.f(this.j, a.a()) || !this.k.k())) {
            this.c = false;
            return;
        }
        this.c = true;
        this.a();
    }
    
    public final asic[] lX(final abns abns) {
        final asic am = abns.O().j(aajj.t(abns.bN(), 16777216L)).j(aajj.r(1)).am((asix)new abbr(this, 6), (asix)aaze.s);
        asic asic;
        if (((uyi)abns.cd().h).bx()) {
            asic = abns.R().am((asix)new abbr(this, 7), (asix)aaze.s);
        }
        else {
            asic = abns.Q().j(aajj.t(abns.bN(), 16777216L)).j(aajj.r(1)).am((asix)new abbr(this, 7), (asix)aaze.s);
        }
        return new asic[] { am, asic };
    }
}
