import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acjg implements dog
{
    private final acie a;
    private final doc b;
    private final acif c;
    private final aowb d;
    private final acic e;
    private boolean f;
    
    public acjg(final doc b, final acic e, final aowb d, final acif c, final acie a) {
        this.f = false;
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
        this.a = a;
    }
    
    private final void i(final ImageView imageView) {
        this.f = true;
        final acie a = this.a;
        if (a != null) {
            a.c(imageView);
        }
        this.c.f(imageView, this.e, this.d);
    }
    
    public final void a(final Drawable drawable) {
        final View a = ((doi)this.b).a;
        if (!this.f) {
            this.i((ImageView)a);
        }
        ((dnx)this.b).a(drawable);
        final acie a2 = this.a;
        if (a2 != null) {
            a2.a((ImageView)a);
        }
        this.c.d((ImageView)a, this.e, this.d);
    }
    
    public final void b(final Object o, final doo doo) {
        final View a = ((doi)this.b).a;
        if (!this.f) {
            this.i((ImageView)a);
        }
        this.b.b(o, doo);
        final acie a2 = this.a;
        if (a2 != null) {
            a2.b((ImageView)a);
        }
        this.c.g((ImageView)a, this.e, this.d);
    }
    
    public final dno d() {
        return ((dnx)this.b).d();
    }
    
    public final void e(final dof dof) {
        ((doi)this.b).e(dof);
    }
    
    public final void f(final Drawable drawable) {
        ((dnx)this.b).f(drawable);
        this.i((ImageView)((doi)this.b).a);
    }
    
    public final void g(final dof dof) {
        ((doi)this.b).g(dof);
    }
    
    public final void h(final dno dno) {
        ((doi)this.b).p((Object)dno);
    }
    
    public final void k() {
    }
    
    public final void l() {
        ((dnx)this.b).l();
    }
    
    public final void lp(final Drawable drawable) {
        ((dnx)this.b).lp(drawable);
        this.c.e((ImageView)((doi)this.b).a, this.e, this.d);
    }
    
    public final void m() {
        ((dnx)this.b).m();
    }
}
