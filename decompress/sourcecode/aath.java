import android.opengl.Matrix;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;
import android.view.ViewGroup;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aath extends aaqq implements aarr, aars, aaqa
{
    public final Handler i;
    public final ViewGroup j;
    public aatg k;
    public boolean o;
    private final float p;
    private final aart q;
    private final aarp r;
    private int s;
    
    public aath(final ViewGroup j, final Context context, final Handler i, final aasb aasb, final float n, final float n2, final aart q, final aarp r) {
        super(n * context.getResources().getDisplayMetrics().scaledDensity, n2 * context.getResources().getDisplayMetrics().scaledDensity, aasa.a(1.0f, 1.0f, aaqq.m), aasb, q.a.c());
        this.i = i;
        this.j = j;
        this.q = q;
        this.r = r;
        ((aann)this).sT(n, n2, 1.0f);
        final float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
        this.p = scaledDensity;
        i.post((Runnable)new aatf(this, context, j, s(n * scaledDensity), s(scaledDensity * n2), 0));
        this.s = q.k;
        this.B();
        q.a((aarr)this);
        q.b((aars)this);
        this.y();
    }
    
    private final void B() {
        ((aann)this).a.e(this.s != 3);
        if (this.s == 3) {
            this.D(true);
            return;
        }
        this.C(true);
    }
    
    private final void C(final boolean b) {
        if (b) {
            final aart q = this.q;
            this.E(q.h, q.i);
            ((aann)this).a.j(0.0f);
        }
    }
    
    private final void D(final boolean b) {
        final float a = aarz.a(-100.0f);
        if (b) {
            this.E(56.0f, 31.5f);
            ((aann)this).k(0.0f, a, 0.0f);
            return;
        }
        ((aann)this).k(0.0f, -a, 0.0f);
    }
    
    private final void E(final float n, final float n2) {
        ((aann)this).sT(n, n2, 1.0f);
        final float p2 = this.p;
        this.w(n * p2, p2 * n2);
        this.i.post((Runnable)new aaer(this, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(s(n * this.p), s(n2 * this.p)), 15));
    }
    
    public final void A() {
        final boolean f = this.r.f;
        boolean l = true;
        if (f) {
            l = (!this.o && l);
        }
        ((aaqh)this).l = l;
    }
    
    public final void b(final float n, final float n2) {
        if (this.s != 3) {
            this.E(n, n2);
        }
    }
    
    public final boolean f(final foi foi) {
        return false;
    }
    
    public final boolean g(final foi foi) {
        return false;
    }
    
    public final boolean h(final foi foi) {
        return true;
    }
    
    public final void o(final foi foi) {
    }
    
    public final void p(final foi foi) {
        super.p(foi);
        if (this.s == 3) {
            final float[] array = (float[])foi.b;
            final float n = array[2];
            final float length = Matrix.length(array[0], array[1], n);
            final float n2 = array[10];
            float n3;
            if (Float.isNaN(n3 = (float)Math.toDegrees(Math.atan2(n / length, n2 / Matrix.length(array[8], array[9], n2))))) {
                n3 = 0.0f;
            }
            ((aann)this).a.j(n3);
        }
    }
    
    public final void rK() {
        super.rK();
        this.i.post((Runnable)new aano(this, 20));
        this.q.g((aarr)this);
        this.q.h((aars)this);
    }
    
    public final void y() {
        this.i.post((Runnable)new aano(this, 19));
        this.o = false;
        this.A();
    }
    
    public final void z(final int s) {
        final int s2 = this.s;
        if (s2 != s) {
            if (s2 == 3) {
                this.D(false);
            }
            else {
                this.C(false);
            }
            this.s = s;
            this.B();
        }
    }
}
