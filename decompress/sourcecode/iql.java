import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class iql extends aenl implements ariy
{
    private ContextWrapper a;
    private boolean ae;
    private boolean c;
    private volatile arin d;
    private final Object e;
    
    public iql() {
        this.e = new Object();
        this.ae = false;
    }
    
    private final void o() {
        if (this.a == null) {
            this.a = arin.e(super.nT(), this);
            this.c = aqqn.s(super.nT());
        }
    }
    
    @Override
    public void V(final Activity activity) {
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
    
    public final arin a() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = this.d();
                }
            }
        }
        return this.d;
    }
    
    public final Object aR() {
        return this.a().aR();
    }
    
    protected arin d() {
        throw null;
    }
    
    @Override
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    @Override
    public void lP(final Context context) {
        super.lP(context);
        this.o();
        this.n();
    }
    
    protected final void n() {
        if (!this.ae) {
            this.ae = true;
            this.aR();
            final iqt iqt = (iqt)this;
        }
    }
    
    @Override
    public Context nT() {
        if (super.nT() == null && !this.c) {
            return null;
        }
        this.o();
        return (Context)this.a;
    }
}
