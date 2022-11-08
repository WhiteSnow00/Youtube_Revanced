import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class jpz extends br implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public jpz() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void n() {
        if (this.a == null) {
            this.a = aenz.c(super.nT(), (br)this);
            this.b = aqqn.s(super.nT());
        }
    }
    
    @Override
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arin.d((Context)a) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.n();
        this.d();
    }
    
    public final aenz a() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
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
            this.aR();
            final jpu jpu = (jpu)this;
        }
    }
    
    @Override
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public final void lP(final Context context) {
        super.lP(context);
        this.n();
        this.d();
    }
    
    @Override
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.n();
        return (Context)this.a;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = this.aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
}
