import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqc extends abrz implements abar
{
    public final absb a;
    public final abav b;
    public View c;
    public final hqb d;
    private final hqb e;
    private final hqb f;
    
    public hqc(final Context context, final absb a, final abav b) {
        super(context);
        this.e = new hqb(2131431110);
        this.f = new hqb(2131431114);
        this.d = new hqb(2131431116);
        this.a = a;
        this.b = b;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void e() {
        this.h(false);
        this.b.h();
    }
    
    public final void f(final long n) {
        this.e.b(n);
    }
    
    public final void g(final long n) {
        this.f.b(n);
    }
    
    public final void h(final boolean b) {
        if (this.c == null) {
            final View inflate = LayoutInflater.from(this.getContext()).inflate(2131625223, (ViewGroup)this);
            this.e.a(inflate);
            this.f.a(inflate);
            this.d.a(inflate);
            this.c = inflate;
        }
        tmy.v(this.c, b);
        final absb a = this.a;
        if (a != null) {
            final fta fta = new fta(this, 10);
            final View viewById = ((View)a).findViewById(2131430039);
            if (viewById != null) {
                if (viewById.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                    tmy.aF(viewById, tmy.aB(this.getResources().getDimensionPixelSize(2131169051)), (Class)ViewGroup$MarginLayoutParams.class);
                }
                viewById.addOnLayoutChangeListener((View$OnLayoutChangeListener)fta);
            }
        }
    }
    
    public final boolean i() {
        final View c = this.c;
        return c != null && c.getVisibility() == 0;
    }
    
    public final void sX() {
        this.b.sX();
    }
}
