import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class gyp extends aepl implements arln
{
    private ContextWrapper a;
    private boolean ae;
    private boolean c;
    private volatile aepz d;
    private final Object e;
    
    public gyp() {
        this.e = new Object();
        this.ae = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = aepz.c(super.nT(), (br)this);
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
        this.a();
        this.o();
    }
    
    public final Object aR() {
        return this.n().aR();
    }
    
    protected aepz d() {
        throw null;
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.n();
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.a();
        this.o();
    }
    
    public final aepz n() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = this.d();
                }
            }
        }
        return this.d;
    }
    
    public Context nT() {
        if (super.nT() == null && !this.c) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    protected final void o() {
        if (!this.ae) {
            this.ae = true;
            this.aR();
            final gyg gyg = (gyg)this;
        }
    }
}
