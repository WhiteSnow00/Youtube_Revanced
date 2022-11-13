import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.SuggestedActionsRendererOuterClass;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jde implements asjm
{
    public final SuggestedActionsMainController a;
    
    public jde(final SuggestedActionsMainController a) {
        this.a = a;
    }
    
    @Override
    public final void a(Object o) {
        final SuggestedActionsMainController a = this.a;
        final aani aani = (aani)o;
        if (aani.a() != null) {
            if (!adkp.ae(a.j, aani.a())) {
                final WatchNextResponseModel a2 = aani.a();
                a2.getClass();
                a.j = a2;
                a.l((Runnable)null);
                final alem a3 = a2.a;
                aldx aldx;
                if ((aldx = a3.g) == null) {
                    aldx = aldx.a;
                }
                angl a4;
                if (aldx.b == 78882851) {
                    a4 = (angl)aldx.c;
                }
                else {
                    a4 = angl.a;
                }
                anuv anuv;
                if ((anuv = a4.r) == null) {
                    anuv = anuv.a;
                }
                Object i;
                if (!((ahbc)anuv).ry((ahaq)SuggestedActionsRendererOuterClass.suggestedActionsRenderer)) {
                    i = null;
                }
                else {
                    aldx aldx2;
                    if ((aldx2 = a3.g) == null) {
                        aldx2 = aldx.a;
                    }
                    angl a5;
                    if (aldx2.b == 78882851) {
                        a5 = (angl)aldx2.c;
                    }
                    else {
                        a5 = angl.a;
                    }
                    anuv anuv2;
                    if ((anuv2 = a5.r) == null) {
                        anuv2 = anuv.a;
                    }
                    i = ((ahbc)anuv2).rx((ahaq)SuggestedActionsRendererOuterClass.suggestedActionsRenderer);
                }
                if (i != null && !adkp.ae(i, a.i)) {
                    a.i = (aony)i;
                    final ahbx b = ((aony)i).b;
                    a.o();
                    final Iterator iterator = ((List)b).iterator();
                    while (iterator.hasNext()) {
                        final aonv aonv = (aonv)((ahbc)iterator.next()).rx((ahaq)SuggestedActionsRendererOuterClass.suggestedActionRenderer);
                        aonx aonx;
                        if ((aonx = aonv.g) == null) {
                            aonx = aonx.a;
                        }
                        if (((ahbc)aonx).ry((ahaq)aons.b)) {
                            final lkx r = a.r;
                            final fjv fjv = (fjv)((atke)r.e).a();
                            fjv.getClass();
                            final abty abty = (abty)((atke)r.b).a();
                            abty.getClass();
                            final iri iri = (iri)((atke)r.f).a();
                            iri.getClass();
                            final ghk ghk = (ghk)((atke)r.a).a();
                            ghk.getClass();
                            final fno fno = (fno)((atke)r.c).a();
                            fno.getClass();
                            final iuv iuv = (iuv)((atke)r.d).a();
                            iuv.getClass();
                            aonv.getClass();
                            o = new jcz(fjv, abty, iri, ghk, fno, iuv, aonv);
                        }
                        else if (((ahbc)aonx).ry((ahaq)aonw.b)) {
                            final jki q = a.q;
                            final tgd tgd = (tgd)((atke)q.a).a();
                            tgd.getClass();
                            final iuv iuv2 = (iuv)((atke)q.b).a();
                            iuv2.getClass();
                            aonv.getClass();
                            o = new jdf(tgd, iuv2, aonv);
                        }
                        else if (((ahbc)aonx).ry((ahaq)aont.b)) {
                            final aln t = a.t;
                            final abpu abpu = (abpu)((atke)t.c).a();
                            abpu.getClass();
                            final iuv iuv3 = (iuv)((atke)t.b).a();
                            iuv3.getClass();
                            final Executor executor = (Executor)((atke)t.a).a();
                            executor.getClass();
                            aonv.getClass();
                            o = new jcv(abpu, iuv3, atjj.b(executor), aonv);
                        }
                        else if (((ahbc)aonx).ry((ahaq)aonu.b)) {
                            final e s = a.s;
                            final abpu abpu2 = (abpu)((atke)s.a).a();
                            abpu2.getClass();
                            final iuv iuv4 = (iuv)((atke)s.d).a();
                            iuv4.getClass();
                            final uve uve = (uve)((atke)s.b).a();
                            uve.getClass();
                            final tmx tmx = (tmx)((atke)s.c).a();
                            tmx.getClass();
                            aonv.getClass();
                            o = new jcw(abpu2, iuv4, uve, tmx, aonv);
                        }
                        else {
                            o = null;
                        }
                        if (o != null) {
                            ((jda)o).b();
                            a.b.c(((jda)o).a().an((asjm)new jce(a, 15), (asjm)ixp.r));
                        }
                    }
                }
            }
        }
    }
}
