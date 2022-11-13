import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.graphics.drawable.Animatable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dnz extends dof implements dok
{
    private Animatable c;
    
    public dnz(final ImageView imageView) {
        super((View)imageView);
    }
    
    private final void q(final Object o) {
        if (o instanceof Animatable) {
            (this.c = (Animatable)o).start();
            return;
        }
        this.c = null;
    }
    
    private final void r(final Object o) {
        this.i(o);
        this.q(o);
    }
    
    public void a(final Drawable drawable) {
        this.r(null);
        this.n(drawable);
    }
    
    public void b(final Object o, final dol dol) {
        if (dol != null && dol.a(o, (dok)this)) {
            this.q(o);
            return;
        }
        this.r(o);
    }
    
    public void f(final Drawable drawable) {
        this.r(null);
        this.n(drawable);
    }
    
    protected abstract void i(final Object p0);
    
    public final Drawable j() {
        return ((ImageView)this.a).getDrawable();
    }
    
    public final void l() {
        final Animatable c = this.c;
        if (c != null) {
            c.start();
        }
    }
    
    public void lp(final Drawable drawable) {
        super.b.A();
        final Animatable c = this.c;
        if (c != null) {
            c.stop();
        }
        this.r(null);
        this.n(drawable);
    }
    
    public final void m() {
        final Animatable c = this.c;
        if (c != null) {
            c.stop();
        }
    }
    
    public final void n(final Drawable imageDrawable) {
        ((ImageView)this.a).setImageDrawable(imageDrawable);
    }
}
