import android.net.Uri;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;
import java.util.List;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.InlineBrowserCustomTabsRendererOuterClass;
import android.graphics.Rect;
import android.app.Activity;
import android.view.View;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvi extends usm implements abym, fjo
{
    public boolean a;
    public final arud b;
    private final utp c;
    private final Context d;
    private final aum e;
    private final abyo f;
    private final vax g;
    private final fjp h;
    private final uvz i;
    private final uwg j;
    private final uuc k;
    private final Executor l;
    private final View m;
    private wxz n;
    
    public kvi(final Context d, final aum e, final auip auip, final wwu wwu, final arud b, final abyo f, final vax g, final fjp h, final uvz i, final uwg j, final vup vup, final Executor l, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super(wwu.n());
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
        this.h = h;
        this.l = l;
        this.j = j;
        if (uyi.bH()) {
            this.m = ((Activity)d).findViewById(2131430060);
        }
        else {
            this.m = ((Activity)d).findViewById(2131430059);
        }
        this.k = vup.q(wwu.n());
        this.c = auip.bc(wwu.n(), this.r, ajkj.a);
    }
    
    private final int s() {
        final Rect rect = new Rect();
        this.m.getRootView().getGlobalVisibleRect(rect);
        final Rect rect2 = new Rect();
        this.m.getGlobalVisibleRect(rect2);
        return rect.bottom - (rect2.top + this.i.b().top);
    }
    
    private final akde u() {
        final ajnl q = super.q;
        if (q != null && (q.c & 0x800000) != 0x0) {
            anss anss;
            if ((anss = q.z) == null) {
                anss = anss.a;
            }
            return (akde)((agzd)anss).rr((agyr)InlineBrowserCustomTabsRendererOuterClass.inlineBrowserCustomTabsRenderer);
        }
        return null;
    }
    
    private final void v() {
        final ajnl q = super.q;
        if (q == null) {
            zjp.b(zjo.a, zjn.a, "[InlineCustomTab]Attempted to close without a model");
            return;
        }
        String d;
        if (q.d == 1) {
            d = (String)q.e;
        }
        else {
            d = "";
        }
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        final agzg hideEngagementPanelEndpoint = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint;
        final agza builder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
        builder.copyOnWrite();
        final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)builder.instance;
        d.getClass();
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = d;
        agzc.e((agyr)hideEngagementPanelEndpoint, builder.build());
        this.g.a((aioe)agzc.build());
    }
    
    public final View a() {
        return new View(this.d);
    }
    
    public final usx b() {
        return (usx)this.c;
    }
    
    public final void c() {
        this.j.a(uwc.b);
    }
    
    public final void d() {
        this.j.a(uwc.a);
    }
    
    public final void e(final acik acik) {
    }
    
    public final void f(final aioe aioe) {
        this.a = false;
        if (aioe != null) {
            this.g.a(aioe);
        }
        this.v();
    }
    
    public final void g(final ajnl ajnl, final alff alff) {
        super.g(ajnl, alff);
        this.k.f(super.q, this.r);
        final akde u = this.u();
        if (u == null) {
            return;
        }
        this.n = (wxz)new wws(u.d);
    }
    
    public final void j() {
        this.h.n(this);
    }
    
    public final void k(final aioe aioe) {
        this.k.a();
    }
    
    public final void l() {
        this.k.b();
    }
    
    public final void m() {
        this.k.c();
        final ajnl q = super.q;
        if (q != null) {
            this.g.b((List)q.q);
        }
        if (this.a) {
            aesm.k(this.d, fvu.h(this.d));
        }
    }
    
    public final void n(aioe aioe) {
        this.k.d(aioe);
        this.h.l(this);
        final ajnl q = super.q;
        if (q != null) {
            this.g.b((List)q.p);
        }
        akdf akdf;
        if (((agzd)aioe).rs((agyr)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint)) {
            if ((akdf = ((ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint)((agzd)aioe).rr((agyr)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint)).e) == null) {
                akdf = akdf.a;
            }
        }
        else if (((agzd)aioe).rs((agyr)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            aoee aoee;
            if ((aoee = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((agzd)aioe).rr((agyr)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)).l) == null) {
                aoee = aoee.a;
            }
            if (aoee.b == 4) {
                akdf = (akdf)aoee.c;
            }
            else {
                akdf = akdf.a;
            }
        }
        else {
            akdf = null;
        }
        if (akdf != null && (akdf.b & 0x1) != 0x0) {
            if ((aioe = akdf.c) == null) {
                aioe = aioe.a;
            }
        }
        else {
            aioe = null;
        }
        final wxz n = this.n;
        if (n != null) {
            super.p.D(n);
            super.p.t(this.n, (alff)null);
        }
        final akde u = this.u();
        if (u == null) {
            zjp.b(zjo.a, zjn.a, "[InlineCustomTab]Attempted to open a null Inline Custom Tabs Renderer.");
            this.f(aioe);
            return;
        }
        if ((u.b & 0x1) == 0x0) {
            zjp.b(zjo.a, zjn.a, "[InlineCustomTab]Attempted to open a Custom Tabs Renderer without a URL.");
            this.f(aioe);
            return;
        }
        final Uri parse = Uri.parse(u.c);
        final ahox c = qcv.C(this.b);
        if (c != null && c.q) {
            tcp.p(this.e, this.f.c((Activity)this.d, parse, this.s(), (abym)this), (trb)new jnf(this, aioe, 12), (trb)new jnf(this, aioe, 13));
            return;
        }
        tcp.k(this.f.c((Activity)this.d, parse, this.s(), (abym)this), this.l, (tcn)new etc(this, aioe, 8), (tco)new jma(this, aioe, 5));
    }
    
    public final void oK(final fkk fkk) {
        if (fkk != fkk.d) {
            this.v();
        }
    }
    
    public final void q(final usz usz) {
    }
    
    public final boolean qh() {
        return true;
    }
    
    public final boolean qi() {
        return false;
    }
    
    public final void qj(final alff alff) {
        final wxz n = this.n;
        if (n != null) {
            super.p.w(n, alff);
        }
    }
    
    public final void qk() {
        final wxz n = this.n;
        if (n != null) {
            super.p.o(n, (alff)null);
        }
        this.v();
    }
    
    public final void ql() {
    }
}
