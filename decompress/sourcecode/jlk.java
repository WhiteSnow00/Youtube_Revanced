import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class jlk extends wxf implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public jlk() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void r() {
        if (this.a == null) {
            this.a = arin.e(super.nT(), (br)this);
            this.b = aqqn.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arin.d((Context)a) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.r();
        this.d();
    }
    
    public final arin a() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected final void d() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final jlt jlt = (jlt)this;
            final esp esp = (esp)ar;
            jlt.c = (asho)esp.b.bf.a();
            jlt.d = (asho)esp.b.dO.a();
            jlt.ah = (lzi)esp.b.fL.a();
            jlt.e = (zki)esp.b.aC.a();
            jlt.ae = (wwv)esp.b.iG.a();
            jlt.af = (wvu)esp.b.aw.a();
            jlt.ag = (gko)esp.b.fo.a();
        }
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.r();
        this.d();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.r();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
}
