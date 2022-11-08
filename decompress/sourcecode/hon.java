import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelObscuredPlaybackSuspender;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

class hon extends ggh implements ariy
{
    private ContextWrapper a;
    private boolean b;
    private volatile arin c;
    private final Object d;
    private boolean e;
    
    public hon() {
        this.d = new Object();
        this.e = false;
    }
    
    private final void q() {
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
        this.q();
        this.p();
    }
    
    public final Object aR() {
        return this.o().aR();
    }
    
    public final avq getDefaultViewModelProviderFactory() {
        return aqqn.q((br)this, super.getDefaultViewModelProviderFactory());
    }
    
    public final void lP(final Context context) {
        super.lP(context);
        this.q();
        this.p();
    }
    
    public final Context nT() {
        if (super.nT() == null && !this.b) {
            return null;
        }
        this.q();
        return (Context)this.a;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        final LayoutInflater aa = ((br)this).aA();
        return aa.cloneInContext((Context)arin.f(aa, (br)this));
    }
    
    public final arin o() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new arin((br)this);
                }
            }
        }
        return this.c;
    }
    
    protected final void p() {
        if (!this.e) {
            this.e = true;
            final Object ar = this.aR();
            final hos hos = (hos)this;
            final esp esp = (esp)ar;
            ((ggh)hos).av = arjc.b(esp.b.iG);
            ((ggh)hos).az = (uyf)esp.b.w.a();
            ((ggh)hos).aw = (fzw)esp.al.cj.a();
            ((ggh)hos).ax = (ggi)esp.al.P.a();
            ((ggh)hos).ay = (ggs)esp.al.i.a();
            hos.an = (lll)esp.al.cl.a();
            hos.e = (wwu)esp.al.o.a();
            hos.ae = arjc.b(esp.al.cn);
            hos.af = (asho)esp.b.dO.a();
            hos.ag = (ReelObscuredPlaybackSuspender)esp.al.a.z.a();
            hos.ah = (toa)esp.al.n.a();
            hos.ak = (arud)esp.b.v.a();
            hos.ao = (mrm)esp.g.a();
            final esm al = esp.al;
            hos.am = new blt(al.fO, esp.g, al.s, al.ff, esp.b.w);
            hos.ap = new fzo(esp.al.fO, esp.g, null, null, (byte[])null);
            final gau gau = (gau)esp.al.aQ.a();
            final uyi uyi = (uyi)esp.al.cE.a();
            hos.ai = esp.al.ah;
            hos.aj = (hmm)esp.b.jQ.a();
            final hqa hqa = (hqa)esp.al.du.a();
            hos.al = (pa)esp.al.a.v.a();
        }
    }
}
