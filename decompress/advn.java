import android.support.v7.widget.AppCompatButton;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import com.google.android.material.button.MaterialButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advn
{
    public final MaterialButton a;
    public aeae b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff$Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public LayerDrawable r;
    public int s;
    
    public advn(final MaterialButton a, final aeae b) {
        this.n = false;
        this.o = false;
        this.q = true;
        this.a = a;
        this.b = b;
    }
    
    private final adzz f(final boolean b) {
        final LayerDrawable r = this.r;
        if (r != null && r.getNumberOfLayers() > 0) {
            return (adzz)((LayerDrawable)((InsetDrawable)this.r.getDrawable(0)).getDrawable()).getDrawable((int)((b ^ true) ? 1 : 0));
        }
        return null;
    }
    
    public final adzz a() {
        return this.f(false);
    }
    
    public final adzz b() {
        return this.f(true);
    }
    
    public final aeap c() {
        final LayerDrawable r = this.r;
        if (r == null || r.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (aeap)this.r.getDrawable(2);
        }
        return (aeap)this.r.getDrawable(1);
    }
    
    public final void d() {
        this.o = true;
        ((AppCompatButton)this.a).setSupportBackgroundTintList(this.j);
        ((AppCompatButton)this.a).setSupportBackgroundTintMode(this.i);
    }
    
    public final void e(final aeae b) {
        this.b = b;
        if (this.a() != null) {
            this.a().tm(b);
        }
        if (this.b() != null) {
            this.b().tm(b);
        }
        if (this.c() != null) {
            this.c().tm(b);
        }
    }
}
