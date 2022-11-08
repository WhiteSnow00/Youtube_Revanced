import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmw implements vau, fbz
{
    private final Context a;
    private final ggi b;
    private final tdz c;
    private final zki d;
    private final fml e;
    private final atjj f;
    private final hnj g;
    private final uyf h;
    private final hyr i;
    private final blt j;
    private final sin k;
    private final fzo l;
    
    public gmw(final Context a, final ggi b, final tdz c, final zki d, final sin k, final fml e, final hyr i, final fzo l, final atjj f, final uyf h, final blt j, final hnj g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.k = k;
        this.e = e;
        this.i = i;
        this.l = l;
        this.j = j;
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final aial aial = (aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint);
        final int al = aesy.aL(((aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).j);
        final int n = 1;
        int n2 = al;
        if (al == 0) {
            n2 = 1;
        }
        if (aial.c.equals("FEsfv_channel_pivot")) {
            final Optional a = this.g.a();
            if (a.isPresent() && ((hnk)a.get()).F()) {
                ajpg ajpg;
                if ((ajpg = this.h.b().y) == null) {
                    ajpg = ajpg.a;
                }
                final agza builder = ajph.a.createBuilder();
                builder.copyOnWrite();
                ajph.a((ajph)builder.instance);
                final ajph ajph = (ajph)builder.build();
                final ahas b = ajpg.b;
                final Long value = 45378800L;
                ajph ajph2 = ajph;
                if (b.containsKey(value)) {
                    ajph2 = b.get(value);
                }
                if (ajph2.b == 1) {
                    if (ajph2.c) {
                        ((hnk)a.get()).C();
                        return;
                    }
                }
            }
        }
        if (n2 == 5) {
            final qbo qbo = (qbo)this.f.a();
            final vlo f = ((vlq)qbo.c).f();
            final agza builder2 = ((aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
            f.w(((aial)builder2.instance).c);
            f.y(((aial)builder2.instance).d);
            ((vii)f).j(aioe.c);
            if ((((aial)builder2.instance).b & 0x40) != 0x0) {
                final agza builder3 = aiap.a.createBuilder();
                aiao aiao;
                if ((aiao = ((aial)builder2.instance).h) == null) {
                    aiao = aiao.a;
                }
                builder3.aC((Iterable)aiao.d);
                aiao aiao2;
                if ((aiao2 = ((aial)builder2.instance).h) == null) {
                    aiao2 = aiao.a;
                }
                aptq a2;
                if (aiao2.b == 328644166) {
                    a2 = (aptq)aiao2.c;
                }
                else {
                    a2 = aptq.a;
                }
                builder3.copyOnWrite();
                final aiap aiap = (aiap)builder3.instance;
                a2.getClass();
                aiap.c = a2;
                aiap.b = 328644166;
                f.f = (aiap)builder3.build();
                builder2.copyOnWrite();
                final aial aial2 = (aial)builder2.instance;
                aial2.h = null;
                aial2.b &= 0xFFFFFFBF;
            }
            ((svm)qbo.a).show(((bu)qbo.e).getFragmentManager(), svm.a);
            tcp.n((aum)qbo.e, ((vlq)qbo.c).h(f, (Executor)qbo.d), (trb)new exr(qbo, 20, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (trb)new gnx(qbo, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            return;
        }
        this.c.d((Object)new fhr());
        final boolean b2 = ((int)tmy.N(map, (Object)"com.google.android.apps.youtube.app.endpoint.flags", (Object)0) & 0x10) != 0x0;
        int n3 = 0;
        Label_0746: {
            if ("FElibrary".equals(((aial)((agzd)aioe).rr((agyr)BrowseEndpointOuterClass.browseEndpoint)).c) && this.d.t()) {
                n3 = n;
                if (!this.k.a) {
                    break Label_0746;
                }
                final fml e = this.e;
                try {
                    if (((aftm)((fmm)e.b.a()).g()).b) {
                        n3 = n;
                        break Label_0746;
                    }
                }
                catch (final Exception ex) {
                    trn.d("Failed to get has access to offline.", (Throwable)ex);
                }
                catch (final InterruptedException ex2) {
                    Thread.currentThread().interrupt();
                }
            }
            n3 = 0;
        }
        PaneDescriptor paneDescriptor = null;
        Label_0876: {
            if (gkt.n(this.h)) {
                if (n3 != 0) {
                    paneDescriptor = this.j.i(aioe);
                    break Label_0876;
                }
            }
            else if (n3 != 0 && tmy.be(this.a) == 4) {
                paneDescriptor = this.i.d(aioe);
                break Label_0876;
            }
            if (map != null && map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
                final acij acij = map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext");
                paneDescriptor = this.l.ax(aioe, false, acij.j("nested_fragment_key", false), acij.j("selection_panel", false));
            }
            else {
                paneDescriptor = this.l.av(aioe);
            }
        }
        paneDescriptor.b.putBoolean("pivot", b2);
        aext e2;
        final aext aext = e2 = (aext)tmy.O(map, (Object)"replace_pane_predicate", (Class)aext.class);
        if (aext == null) {
            e2 = aext;
            if (n2 == 2) {
                e2 = PaneDescriptor.e();
            }
        }
        paneDescriptor.d = e2;
        this.b.d(paneDescriptor);
    }
}
