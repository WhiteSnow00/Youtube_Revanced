import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnd implements vcv, fcd
{
    private final Context a;
    private final ggr b;
    private final tgd c;
    private final zmf d;
    private final fmr e;
    private final atke f;
    private final hof g;
    private final vaf h;
    private final hzn i;
    private final blu j;
    private final skt k;
    private final fzw l;
    
    public gnd(final Context a, final ggr b, final tgd c, final zmf d, final skt k, final fmr e, final hzn i, final fzw l, final atke f, final vaf h, final blu j, final hof g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
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
    
    public final void mE(final aiqj aiqj, final Map map) {
        final aicj aicj = (aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint);
        final int ah = aefb.ah(((aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).j);
        final int n = 1;
        int n2 = ah;
        if (ah == 0) {
            n2 = 1;
        }
        if (aicj.c.equals("FEsfv_channel_pivot")) {
            final Optional a = this.g.a();
            if (a.isPresent() && ((hog)a.get()).F()) {
                ajrk ajrk;
                if ((ajrk = this.h.b().y) == null) {
                    ajrk = ajrk.a;
                }
                final ahaz builder = ((ahbh)ajrl.a).createBuilder();
                builder.copyOnWrite();
                ajrl.a((ajrl)builder.instance);
                final ajrl ajrl = (ajrl)builder.build();
                final ahcr b = ajrk.b;
                final Long value = 45378800L;
                ajrl ajrl2 = ajrl;
                if (((Map)b).containsKey(value)) {
                    ajrl2 = (ajrl)((Map)b).get(value);
                }
                if (ajrl2.b == 1) {
                    if (ajrl2.c) {
                        ((hog)a.get()).C();
                        return;
                    }
                }
            }
        }
        if (n2 == 5) {
            final qcy qcy = (qcy)this.f.a();
            final vns f = ((vnu)qcy.c).f();
            final ahaz builder2 = ((ahbh)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).toBuilder();
            f.w(((aicj)builder2.instance).c);
            f.y(((aicj)builder2.instance).d);
            ((vkk)f).j(aiqj.c);
            if ((((aicj)builder2.instance).b & 0x40) != 0x0) {
                final ahaz builder3 = ((ahbh)aicn.a).createBuilder();
                aicm aicm;
                if ((aicm = ((aicj)builder2.instance).h) == null) {
                    aicm = aicm.a;
                }
                builder3.aC((Iterable)aicm.d);
                aicm aicm2;
                if ((aicm2 = ((aicj)builder2.instance).h) == null) {
                    aicm2 = aicm.a;
                }
                apwa a2;
                if (aicm2.b == 328644166) {
                    a2 = (apwa)aicm2.c;
                }
                else {
                    a2 = apwa.a;
                }
                builder3.copyOnWrite();
                final aicn aicn = (aicn)builder3.instance;
                a2.getClass();
                aicn.c = a2;
                aicn.b = 328644166;
                f.f = (aicn)builder3.build();
                builder2.copyOnWrite();
                final aicj aicj2 = (aicj)builder2.instance;
                aicj2.h = null;
                aicj2.b &= 0xFFFFFFBF;
            }
            ((sxr)qcy.a).show(((bu)qcy.e).getFragmentManager(), sxr.a);
            teu.n((aun)qcy.e, ((vnu)qcy.c).h(f, (Executor)qcy.d), (ttg)new exv(qcy, 20, (byte[])null, (byte[])null, (byte[])null, (byte[])null), (ttg)new goe(qcy, 1, null, null, null, null));
            return;
        }
        this.c.d((Object)new fhx());
        final boolean b2 = ((int)tpe.N(map, (Object)"com.google.android.apps.youtube.app.endpoint.flags", (Object)0) & 0x10) != 0x0;
        int n3 = 0;
        Label_0766: {
            if ("FElibrary".equals(((aicj)((ahbc)aiqj).rx((ahaq)BrowseEndpointOuterClass.browseEndpoint)).c) && this.d.t()) {
                n3 = n;
                if (!this.k.a) {
                    break Label_0766;
                }
                final fmr e = this.e;
                try {
                    if (((afvn)((fms)e.b.a()).g()).b) {
                        n3 = n;
                        break Label_0766;
                    }
                }
                catch (final Exception ex) {
                    ttr.d("Failed to get has access to offline.", (Throwable)ex);
                }
                catch (final InterruptedException ex2) {
                    Thread.currentThread().interrupt();
                }
            }
            n3 = 0;
        }
        PaneDescriptor paneDescriptor = null;
        Label_0899: {
            if (fbu.P(this.h)) {
                if (n3 != 0) {
                    paneDescriptor = this.j.i(aiqj);
                    break Label_0899;
                }
            }
            else if (n3 != 0 && tpe.be(this.a) == 4) {
                paneDescriptor = this.i.d(aiqj);
                break Label_0899;
            }
            if (map != null && map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
                final ackm ackm = map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext");
                paneDescriptor = this.l.ar(aiqj, false, ackm.j("nested_fragment_key", false), ackm.j("selection_panel", false));
            }
            else {
                paneDescriptor = this.l.ap(aiqj);
            }
        }
        paneDescriptor.b.putBoolean("pivot", b2);
        aezs e2;
        final aezs aezs = e2 = (aezs)tpe.O(map, (Object)"replace_pane_predicate", (Class)aezs.class);
        if (aezs == null) {
            e2 = aezs;
            if (n2 == 2) {
                e2 = PaneDescriptor.e();
            }
        }
        paneDescriptor.d = e2;
        this.b.d(paneDescriptor);
    }
}
