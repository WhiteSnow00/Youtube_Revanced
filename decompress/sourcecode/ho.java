import android.view.View;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import android.support.v7.widget.ActionBarContextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ho extends hm implements ik
{
    public final im a;
    private final Context b;
    private final ActionBarContextView c;
    private final hl f;
    private WeakReference g;
    private boolean h;
    
    public ho(final Context b, final ActionBarContextView c, final hl f) {
        this.b = b;
        this.c = c;
        this.f = f;
        final im a = new im(c.getContext());
        a.D();
        this.a = a;
        a.b = (ik)this;
    }
    
    public final void U(final im im) {
        this.g();
        this.c.n();
    }
    
    public final boolean Y(final im im, final MenuItem menuItem) {
        return this.f.b((hm)this, menuItem);
    }
    
    public final Menu a() {
        return (Menu)this.a;
    }
    
    public final MenuInflater b() {
        return (MenuInflater)new ht(this.c.getContext());
    }
    
    public final View c() {
        final WeakReference g = this.g;
        if (g != null) {
            return (View)g.get();
        }
        return null;
    }
    
    public final CharSequence d() {
        return this.c.h;
    }
    
    public final CharSequence e() {
        return this.c.g;
    }
    
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a((hm)this);
    }
    
    public final void g() {
        this.f.d((hm)this, (Menu)this.a);
    }
    
    public final void h(final View view) {
        this.c.j(view);
        WeakReference g;
        if (view != null) {
            g = new WeakReference((T)view);
        }
        else {
            g = null;
        }
        this.g = g;
    }
    
    public final void i(final int n) {
        this.j(this.b.getString(n));
    }
    
    public final void j(final CharSequence charSequence) {
        this.c.k(charSequence);
    }
    
    public final void k(final int n) {
        this.l(this.b.getString(n));
    }
    
    public final void l(final CharSequence charSequence) {
        this.c.l(charSequence);
    }
    
    public final void m(final boolean e) {
        super.e = e;
        this.c.m(e);
    }
    
    public final boolean n() {
        return this.c.j;
    }
}
