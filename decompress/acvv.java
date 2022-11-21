import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class acvv extends acwk implements aroh
{
    private ContextWrapper a;
    private boolean b;
    private volatile arnw c;
    private final Object d;
    private boolean e;
    
    public acvv() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void aM() {
        if (this.a == null) {
            this.a = arnw.e(super.nQ(), (br)this);
            this.b = areq.C(super.nQ());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper a = this.a;
        boolean b = true;
        if (a != null) {
            b = (arnw.d((Context)a) == activity && b);
        }
        areq.v(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aM();
        this.d();
    }
    
    public final arnw a() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arnw((br)this);
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
            final acwh acwh = (acwh)this;
            final esu esu = (esu)ar;
            acwh.b = (xbh)esu.ak.dl.a();
            acwh.c = (acwc)esu.b.a.bm.a();
            acwh.e = (vbs)esu.b.js.a();
        }
    }
    
    public final avs getDefaultViewModelProviderFactory() {
        return areq.A((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final /* bridge */ arog lC() {
        return this.a();
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.aM();
        this.d();
    }
    
    public final Context nQ() {
        if (super.nQ() == null && !this.b) {
            return null;
        }
        this.aM();
        return (Context)this.a;
    }
    
    public final LayoutInflater ng(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arnw.f(aa, (br)this));
    }
}
