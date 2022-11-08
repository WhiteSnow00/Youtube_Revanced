import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfq implements doc
{
    private final acem a;
    private final dny b;
    private final acen c;
    private final aorm d;
    private final acek e;
    private boolean f;
    
    public acfq(final dny b, final acek e, final aorm d, final acen c, final acem a) {
        this.f = false;
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    private final void i(final ImageView imageView) {
        this.f = true;
        final acem a = this.a;
        if (a != null) {
            a.c(imageView);
        }
        this.c.f(imageView, this.e, this.d);
    }
    
    public final void a(final Drawable drawable) {
        final View a = ((doe)this.b).a;
        if (!this.f) {
            this.i((ImageView)a);
        }
        ((dnt)this.b).a(drawable);
        final acem a2 = this.a;
        if (a2 != null) {
            a2.a((ImageView)a);
        }
        this.c.d((ImageView)a, this.e, this.d);
    }
    
    public final void b(final Object o, final dok dok) {
        final View a = ((doe)this.b).a;
        if (!this.f) {
            this.i((ImageView)a);
        }
        this.b.b(o, dok);
        final acem a2 = this.a;
        if (a2 != null) {
            a2.b((ImageView)a);
        }
        this.c.g((ImageView)a, this.e, this.d);
    }
    
    public final dnk d() {
        return ((dnt)this.b).d();
    }
    
    public final void e(final dob dob) {
        ((doe)this.b).e(dob);
    }
    
    public final void f(final Drawable drawable) {
        ((dnt)this.b).f(drawable);
        this.i((ImageView)((doe)this.b).a);
    }
    
    public final void g(final dob dob) {
        ((doe)this.b).g(dob);
    }
    
    public final void h(final dnk dnk) {
        ((doe)this.b).p((Object)dnk);
    }
    
    public final void k() {
    }
    
    public final void l() {
        ((dnt)this.b).l();
    }
    
    public final void lp(final Drawable drawable) {
        ((dnt)this.b).lp(drawable);
        this.c.e((ImageView)((doe)this.b).a, this.e, this.d);
    }
    
    public final void m() {
        ((dnt)this.b).m();
    }
}
