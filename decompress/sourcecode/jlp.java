import android.view.LayoutInflater;
import android.os.Bundle;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class jlp extends jlf implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public jlp() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void o() {
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
        this.o();
        this.n();
    }
    
    public final Object aR() {
        return this.pE().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.o();
        this.n();
    }
    
    protected final void n() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final jmq jmq = (jmq)this;
            final esp esp = (esp)ar;
            jmq.ag = (uyf)esp.b.w.a();
            jmq.a = (wwv)esp.b.iG.a();
            jmq.b = (wyo)esp.b.cB.a();
            jmq.ah = esp.al.ye();
            jmq.ai = new bx(esp.al.d, (char[])null, (char[])null);
            jmq.c = (Handler)esp.b.G.a();
            jmq.d = (tdz)esp.b.h.a();
            jmq.e = (tmp)esp.b.a.af.a();
        }
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.o();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
    
    public final arin pE() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
}
