import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class gxm extends wzf implements arln
{
    private ContextWrapper a;
    private boolean b;
    private volatile aepz c;
    private final Object d;
    private boolean e;
    
    public gxm() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void a() {
        if (this.a == null) {
            this.a = aepz.c(super.nT(), (br)this);
            this.b = aqsz.s(super.nT());
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
        this.s();
    }
    
    public final Object aR() {
        return this.r().aR();
    }
    
    protected aepz d() {
        throw null;
    }
    
    public final avr getDefaultViewModelProviderFactory() {
        return agpc.aj((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arlm lC() {
        return (arlm)this.r();
    }
    
    public void lP(final Context context) {
        super.lP(context);
        this.a();
        this.s();
    }
    
    public Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.a();
        return (Context)this.a;
    }
    
    public final aepz r() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = this.d();
                }
            }
        }
        return this.c;
    }
    
    protected final void s() {
        if (!this.e) {
            this.e = true;
            this.aR();
            final gwh gwh = (gwh)this;
        }
    }
}
