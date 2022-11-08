import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class joc extends cex implements ariy
{
    private final Object ae;
    private boolean af;
    private ContextWrapper c;
    private boolean d;
    private volatile aenz e;
    
    public joc() {
        this.ae = new Object();
        this.af = false;
    }
    
    private final void aO() {
        if (this.c == null) {
            this.c = aenz.c(super.nT(), (br)this);
            this.d = aqqn.s(super.nT());
        }
    }
    
    public final void V(final Activity activity) {
        super.V(activity);
        final ContextWrapper c = this.c;
        boolean b = true;
        if (c != null) {
            b = (arin.d((Context)c) == activity && b);
        }
        aqqn.l(b, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        this.aO();
        this.aX();
    }
    
    public final Object aR() {
        return this.aW().aR();
    }
    
    public final aenz aW() {
        if (this.e == null) {
            synchronized (this.ae) {
                if (this.e == null) {
                    this.e = new aenz((br)this, true);
                }
            }
        }
        return this.e;
    }
    
    protected final void aX() {
        if (!this.af) {
            this.af = true;
            final Object ar = this.aR();
            final jnr jnr = (jnr)this;
            final eso eso = (eso)ar;
            jnr.c = (zki)eso.a.aC.a();
            jnr.an = (arud)eso.a.v.a();
            jnr.am = (uyf)eso.a.w.a();
            jnr.d = eso.aO.L();
            jnr.e = (SettingsDataAccess)eso.aO.Z.a();
            jnr.ae = (thh)eso.a.P.a();
            jnr.af = (vax)eso.aO.k.a();
            jnr.aq = eso.aO.bb();
            jnr.ag = (gko)eso.a.fo.a();
            jnr.ap = (lzi)eso.a.fL.a();
            jnr.ah = (wzt)eso.a.jw.a();
            jnr.ao = new blt((Activity)eso.aO.c.a(), (vax)eso.aO.k.a(), (SettingsDataAccess)eso.aO.Z.a(), eso.aO.L(), (c)eso.a.ku.a(), (byte[])null, (byte[])null);
            jnr.ai = (asho)eso.a.dO.a();
        }
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return ajox.aa((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.aO();
        this.aX();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.d) {
            return null;
        }
        this.aO();
        return (Context)this.c;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)aenz.d(aa, (br)this));
    }
}
