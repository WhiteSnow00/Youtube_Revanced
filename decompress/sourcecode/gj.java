import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gj extends hm implements ik
{
    public final im a;
    public hl b;
    final /* synthetic */ gk c;
    private final Context f;
    private WeakReference g;
    
    public gj(final gk c, final Context f, final hl b) {
        this.c = c;
        this.f = f;
        this.b = b;
        final im a = new im(f);
        a.D();
        this.a = a;
        a.b = (ik)this;
    }
    
    public final void U(final im im) {
        if (this.b == null) {
            return;
        }
        this.g();
        this.c.e.n();
    }
    
    public final boolean Y(final im im, final MenuItem menuItem) {
        final hl b = this.b;
        return b != null && b.b((hm)this, menuItem);
    }
    
    public final Menu a() {
        return (Menu)this.a;
    }
    
    public final MenuInflater b() {
        return (MenuInflater)new ht(this.f);
    }
    
    public final View c() {
        final WeakReference g = this.g;
        if (g != null) {
            return (View)g.get();
        }
        return null;
    }
    
    public final CharSequence d() {
        return this.c.e.h;
    }
    
    public final CharSequence e() {
        return this.c.e.g;
    }
    
    public final void f() {
        final gk c = this.c;
        if (c.g != this) {
            return;
        }
        if (!gk.F(c.l, c.m, false)) {
            c.h = this;
            c.i = this.b;
        }
        else {
            this.b.a((hm)this);
        }
        this.b = null;
        this.c.D(false);
        final ActionBarContextView e = this.c.e;
        if (e.i == null) {
            e.i();
        }
        final gk c2 = this.c;
        c2.b.k(c2.o);
        this.c.g = null;
    }
    
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d((hm)this, (Menu)this.a);
        }
        finally {
            this.a.r();
        }
    }
    
    public final void h(final View view) {
        this.c.e.j(view);
        this.g = new WeakReference((T)view);
    }
    
    public final void i(final int n) {
        this.j(this.c.a.getResources().getString(n));
    }
    
    public final void j(final CharSequence charSequence) {
        this.c.e.k(charSequence);
    }
    
    public final void k(final int n) {
        this.l(this.c.a.getResources().getString(n));
    }
    
    public final void l(final CharSequence charSequence) {
        this.c.e.l(charSequence);
    }
    
    public final void m(final boolean e) {
        super.e = e;
        this.c.e.m(e);
    }
    
    public final boolean n() {
        return this.c.e.j;
    }
}
