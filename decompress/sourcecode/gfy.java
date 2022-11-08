import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class gfy extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public gfy() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void r() {
        if (this.a == null) {
            this.a = arin.e(super.nT(), (br)this);
            this.b = aqqn.s(super.nT());
        }
    }
    
    public void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arin.d((Context)a) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.r();
        this.q();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.r();
        this.q();
    }
    
    public Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.r();
        return (Context)this.a;
    }
    
    public final arin o() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = this.p();
                }
            }
        }
        return this.c;
    }
    
    protected arin p() {
        throw null;
    }
    
    protected final void q() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final ggb ggb = (ggb)this;
            final esp esp = (esp)ar;
            ((ggh)ggb).av = arjc.b(esp.b.iG);
            ((ggh)ggb).az = (uyf)esp.b.w.a();
            ((ggh)ggb).aw = (fzw)esp.al.cj.a();
            ((ggh)ggb).ax = (ggi)esp.al.P.a();
            ((ggh)ggb).ay = (ggs)esp.al.i.a();
        }
    }
}
