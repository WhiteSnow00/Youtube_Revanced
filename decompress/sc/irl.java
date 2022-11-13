import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class irl extends aepl implements arln
{
    private ContextWrapper a;
    private boolean ae;
    private boolean c;
    private volatile arlc d;
    private final Object e;
    
    public irl() {
        this.e = new Object();
        this.ae = false;
    }
    
    private final void o() {
        if (this.a == null) {
            this.a = arlc.e(super.nT(), (br)this);
            this.c = aqsz.s(super.nT());
        }
    }
    
    public void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arlc.d((Context)a) == activity && b);
        }
        aqsz.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.o();
        this.n();
    }
    
    public final arlc a() {
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
    
    protected arlc d() {
        throw null;
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return aqsz.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.a();
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.o();
        this.n();
    }
    
    protected final void n() {
        if (!this.ae) {
            this.ae = true;
            this.aR();
            final irt irt = (irt)this;
        }
    }
    
    public Context nT() {
        if (super.nT() == null && !this.c) {
            return null;
        }
        this.o();
        return (Context)this.a;
    }
}
