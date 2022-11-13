import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class adev extends br implements arln
{
    private ContextWrapper a;
    private boolean b;
    private volatile arlc c;
    private final Object d;
    private boolean e;
    
    public adev() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = arlc.e(super.nT(), this);
            this.b = aqsz.s(super.nT());
        }
    }
    
    @Override
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arlc.d((Context)a) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.a();
        this.n();
    }
    
    public final Object aR() {
        return this.d().aR();
    }
    
    public final arlc d() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arlc(this);
                }
            }
        }
        return this.c;
    }
    
    @Override
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final /* bridge */ arlm lC() {
        return (arlm)this.d();
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.a();
        this.n();
    }
    
    protected final void n() {
        if (!this.e) {
            this.e = true;
            ((ader)this).a = arlr.b(((ess)this.aR()).ak.B);
        }
    }
    
    @Override
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = this.aA();
        return aa.cloneInContext((Context)arlc.f(aa, this));
    }
}
