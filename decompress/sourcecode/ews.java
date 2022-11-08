import android.content.Context;
import android.os.Looper;
import java.util.Map;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class ews implements abyu
{
    public boolean a;
    private final Activity b;
    private final wwu c;
    private final arhr d;
    private final arhr e;
    private final arhr f;
    private abyv g;
    private final arhr h;
    private final arhr i;
    private final arhr j;
    private final arhr k;
    private final arhr l;
    private final boolean m;
    private final arhr n;
    private int o;
    
    public ews(final Activity b, final wwu c, final arhr d, final arhr arhr, final arhr h, final arhr f, final abns abns, final arhr e, final arhr j, final arhr i, final asho asho, final Executor executor, final arhr k, final arhr l, final boolean m, final arhr n) {
        this.a = true;
        this.o = -1;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
        this.j = j;
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        executor.execute((Runnable)new tu(this, arhr, abns, asho, 14));
    }
    
    public static asgt j(final fjp fjp) {
        return fjp.k().aK().J((asjd)exd.b).W((asjc)exl.b).ai((Object)fjp.j()).w(2L, TimeUnit.SECONDS).i(asgm.e);
    }
    
    public static boolean r(final fkk fkk) {
        return fkk.equals((Object)fkk.a) || fkk.equals((Object)fkk.j) || fkk.equals((Object)fkk.c);
    }
    
    public void k(final aaly aaly) {
    }
    
    public final void l(aioe aioe, final aiva aiva, final boolean b, final boolean b2) {
        final utk utk = (utk)this.j.a();
        final String y = vem.y((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((agzd)aioe).rr((agyr)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint));
        if (!b2) {
            if (y != null && y.equals(utk.h())) {
                if (utk.w()) {
                    final agza builder = ((agzi)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a).createBuilder();
                    builder.copyOnWrite();
                    final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)builder.instance;
                    hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
                    hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = y;
                    final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint)builder.build();
                    final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
                    agzc.e((agyr)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, (Object)hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2);
                    aioe = (aioe)((agza)agzc).build();
                    ((vax)this.d.a()).a(aioe);
                    return;
                }
            }
        }
        else {
            ((abno)this.f.a()).a();
            if (((fjp)this.h.a()).j().equals((Object)fkk.e)) {
                ((lho)this.e.a()).c();
            }
            ((vax)this.d.a()).c(aioe, (Map)afcw.m((Object)"engagement_panel_close_listener_key", (Object)new lmi(this, 1)));
        }
        if (!b) {
            final abyv g = this.g;
            if (g != null) {
                g.c();
                this.g = null;
                final abno abno = (abno)this.f.a();
                if (!abno.f() && this.a) {
                    abno.D();
                }
                if (this.m && this.o != -1) {
                    ((hqa)this.l.a()).c(this.o);
                }
            }
            return;
        }
        this.q(aiva);
    }
    
    public void m() {
    }
    
    public void n() {
    }
    
    public void o(final boolean b) {
    }
    
    public void p() {
        final abno abno = (abno)this.f.a();
        if (!abno.f() && this.a) {
            abno.D();
        }
    }
    
    public void q(final aiva aiva) {
        ((abno)this.f.a()).a();
        if (this.m) {
            this.o = ((hqa)this.l.a()).a();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ((ohr)this.n.a()).a();
        }
        this.g = abyv.n((Context)this.b, aiva, (vax)this.d.a(), this.c.n(), (aeby)this.i.a(), true, false, (abyu)this, (Object)null, (aeby)this.k.a());
    }
}
