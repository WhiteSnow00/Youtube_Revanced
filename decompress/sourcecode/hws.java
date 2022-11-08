import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hws extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile aenz c;
    private final Object d;
    private boolean e;
    
    public hws() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void o() {
        if (this.a == null) {
            this.a = aenz.c(super.nT(), (br)this);
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
        this.aL();
    }
    
    public final aenz aK() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new aenz((br)this, true);
                }
            }
        }
        return this.c;
    }
    
    protected final void aL() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hvz hvz = (hvz)this;
            final eso eso = (eso)ar;
            ((ggh)hvz).av = arjc.b(eso.a.iG);
            ((ggh)hvz).az = (uyf)eso.a.w.a();
            ((ggh)hvz).aw = eso.aO.e();
            ((ggh)hvz).ax = eso.aO.i();
            ((ggh)hvz).ay = (ggs)eso.aO.D.a();
            hvz.ai = eso.aO.aR();
            hvz.a = (fml)eso.a.jn.a();
            final avt zb = ((vbe)((arix)((aeoe)eso.aO.g.a()).a()).aR()).zB();
            zb.getClass();
            hvz.ak = zb;
            hvz.al = hvr.j();
            hvz.aj = eso.a.zT();
        }
    }
    
    public final Object aR() {
        return this.aK().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.o();
        this.aL();
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
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
}
