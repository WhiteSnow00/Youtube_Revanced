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

public final class hqx extends abua implements abcm
{
    public final abuc a;
    public final abcp b;
    public View c;
    public final hqw d;
    private final hqw e;
    private final hqw f;
    
    public hqx(final Context context, final abuc a, final abcp b) {
        super(context);
        this.e = new hqw(2131431113);
        this.f = new hqw(2131431117);
        this.d = new hqw(2131431119);
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
            final View inflate = LayoutInflater.from(this.getContext()).inflate(2131625228, (ViewGroup)this);
            this.e.a(inflate);
            this.f.a(inflate);
            this.d.a(inflate);
            this.c = inflate;
        }
        tpe.v(this.c, b);
        final abuc a = this.a;
        if (a != null) {
            final fti fti = new fti(this, 10);
            final View viewById = ((View)a).findViewById(2131430039);
            if (viewById != null) {
                if (viewById.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                    tpe.aF(viewById, tpe.aB(this.getResources().getDimensionPixelSize(2131169050)), (Class)ViewGroup$MarginLayoutParams.class);
                }
                viewById.addOnLayoutChangeListener((View$OnLayoutChangeListener)fti);
            }
        }
    }
    
    public final boolean i() {
        final View c = this.c;
        return c != null && c.getVisibility() == 0;
    }
    
    public final void td() {
        this.b.td();
    }
}
