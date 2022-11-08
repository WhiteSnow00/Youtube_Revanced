import android.view.View;
import android.os.Looper;
import android.os.Handler;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aatx extends aanu implements aaqa, aaro
{
    public final Context e;
    public final aasb f;
    public final ViewGroup g;
    public aaps h;
    public boolean i;
    public final acga j;
    private final aarp k;
    private final Handler m;
    
    public aatx(final Context e, final aarp k, final aasb f, final aceo aceo, final ViewGroup g, final vax vax) {
        super(new aapo(f, 0.0f, 0.0f));
        this.e = e;
        k.getClass();
        this.k = k;
        this.f = f;
        this.g = g;
        this.m = new Handler(Looper.getMainLooper());
        this.j = new acga(e, aceo, g, vax);
        this.c();
    }
    
    private final void c() {
        if (!((aaqh)this).v()) {
            ((aaqh)this).l = true;
        }
    }
    
    public final void a() {
        if (((aaqh)this).v()) {
            ((aaqh)this).l = false;
        }
    }
    
    public final void b(final anep[] array) {
        this.m.post((Runnable)new aatw(this, array));
    }
    
    public final boolean f(final foi foi) {
        return ((aapi)this).q(foi);
    }
    
    public final boolean g(final foi foi) {
        return false;
    }
    
    public final boolean h(final foi foi) {
        return false;
    }
    
    public final void o(final foi foi) {
        if (((aapi)this).q(foi)) {
            final aaps h = this.h;
            if (h != null) {
                final aajz b = super.a.b(foi);
                if (h.k != null) {
                    if (b.c()) {
                        final int n = (int)(b.b() * 4.0f);
                        if (n < h.k.getChildCount()) {
                            final View child = h.k.getChildAt(n);
                            if (child != null && child.isClickable()) {
                                h.j.post((Runnable)new aano(child, 8));
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void p(final foi foi) {
        this.i = ((aapi)this).q(foi);
        final aarp k = this.k;
        if (k.w() && !k.x()) {
            this.c();
        }
        else {
            this.a();
            final aaps h = this.h;
            float n;
            if (!this.i) {
                n = 0.5f;
            }
            else {
                n = 1.0f;
            }
            h.n = n;
        }
        super.p(foi);
    }
}
