import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxe extends hxs
{
    public tqd a;
    public vcy ae;
    public arkg af;
    public String ag;
    public anjt ah;
    public gae ai;
    public LoadingFrameLayout aj;
    public jvm ak;
    public hmw al;
    public aeea am;
    public aeea an;
    public tgd b;
    public zmf c;
    public acgs d;
    public vuf e;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        (this.aj = (LoadingFrameLayout)layoutInflater.inflate(2131625039, viewGroup, false)).f((acxp)new hxc(this, 0));
        final fa at = this.at;
        if (at != null) {
            this.ak = new jvm((Activity)at, this.ae, this.am, this.ag, (View)this.aj, this.al, this.d, ((ggq)this).pF(), this.an, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        }
        this.p(this.ag);
        return (View)this.aj;
    }
    
    public final void aa() {
        super.aa();
        if (!this.c.t()) {
            this.ax.c(false);
        }
    }
    
    public final gae mG() {
        if (this.ai == null) {
            this.ai = this.o();
        }
        return this.ai;
    }
    
    public final void no() {
        super.no();
        this.b.g((Object)this.ak);
    }
    
    public final void np() {
        super.np();
        this.b.m((Object)this.ak);
    }
    
    public final gae o() {
        final anjt ah = this.ah;
        Object b;
        if (ah != null) {
            ajut ajut;
            if ((ajut = ah.c) == null) {
                ajut = ajut.a;
            }
            b = acak.b(ajut);
        }
        else {
            b = "";
        }
        final gad b2 = this.aw.b();
        b2.n((aezf)new hxb((CharSequence)b, 0));
        return b2.a();
    }
    
    public final void oq(Bundle m) {
        super.oq(m);
        m = ((br)this).m;
        if (m != null && m.containsKey("playlist_id")) {
            this.ag = m.getString("playlist_id", "");
        }
    }
    
    public final void p(final String s) {
        final vuc e = this.e.e();
        e.w(s);
        ((vkk)e).k(vap.b);
        this.aj.c();
        this.e.h((vls)e, (zpf)new hxd(this));
    }
}
