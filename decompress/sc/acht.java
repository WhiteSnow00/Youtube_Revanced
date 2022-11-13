import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acht implements dod
{
    private final acgq a;
    private final dnz b;
    private final acgr c;
    private final aotp d;
    private final acgo e;
    private boolean f;
    
    public acht(final dnz b, final acgo e, final aotp d, final acgr c, final acgq a) {
        this.f = false;
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    private final void i(final ImageView imageView) {
        this.f = true;
        final acgq a = this.a;
        if (a != null) {
            a.c(imageView);
        }
        this.c.f(imageView, this.e, this.d);
    }
    
    @Override
    public final void a(final Drawable drawable) {
        final View a = this.b.a;
        if (!this.f) {
            this.i((ImageView)a);
        }
        ((dnu)this.b).a(drawable);
        final acgq a2 = this.a;
        if (a2 != null) {
            a2.a((ImageView)a);
        }
        this.c.d((ImageView)a, this.e, this.d);
    }
    
    @Override
    public final void b(final Object o, final dol dol) {
        final View a = this.b.a;
        if (!this.f) {
            this.i((ImageView)a);
        }
        this.b.b(o, dol);
        final acgq a2 = this.a;
        if (a2 != null) {
            a2.b((ImageView)a);
        }
        this.c.g((ImageView)a, this.e, this.d);
    }
    
    @Override
    public final dnl d() {
        return ((dnu)this.b).d();
    }
    
    @Override
    public final void e(final doc doc) {
        this.b.e(doc);
    }
    
    @Override
    public final void f(final Drawable drawable) {
        ((dnu)this.b).f(drawable);
        this.i((ImageView)this.b.a);
    }
    
    @Override
    public final void g(final doc doc) {
        this.b.g(doc);
    }
    
    @Override
    public final void h(final dnl dnl) {
        this.b.p((Object)dnl);
    }
    
    public final void k() {
    }
    
    public final void l() {
        ((dnu)this.b).l();
    }
    
    @Override
    public final void lp(final Drawable drawable) {
        ((dnu)this.b).lp(drawable);
        this.c.e((ImageView)this.b.a, this.e, this.d);
    }
    
    public final void m() {
        ((dnu)this.b).m();
    }
}
