import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krk implements fwy
{
    public View a;
    public boolean b;
    public final alm c;
    public qpt d;
    private final Context e;
    private final acue f;
    private final fjn g;
    private acug h;
    
    public krk(final Context e, final alm c, final acue f, final fjn g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.c = c;
        this.f = f;
        this.g = g;
    }
    
    private final acug g() {
        if (this.h == null) {
            final acuf a = this.f.a();
            a.a = this.a;
            a.b = this.e.getString(2132018901);
            a.c = this.e.getString(2132018900);
            a.m(1);
            a.f(1);
            a.f = (actk)new krj(this, 0);
            a.n(false);
            this.h = a.c();
        }
        return this.h;
    }
    
    public final void a(final View a) {
        this.a = a;
        this.h = null;
        this.d();
    }
    
    public final boolean b() {
        return this.c.F();
    }
    
    public final int c() {
        return 5001;
    }
    
    public final void d() {
        this.f.b(this.g());
    }
    
    public final void e() {
        if (this.f()) {
            this.f.c(this.g());
        }
    }
    
    public final boolean f() {
        return this.b && this.a != null && !this.g.l() && this.b();
    }
}
