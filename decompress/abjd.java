import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ScheduledExecutorService;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjd implements asmi
{
    public final abjf a;
    
    public abjd(final abjf a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final abjf a = this.a;
        final aaph aaph = (aaph)o;
        if (aaph.i()) {
            if (a.b(aaph.e())) {
                a.a();
                return;
            }
            if (aaph.c().o().b == null) {
                tut.l("Missing Vss base url");
                return;
            }
            final PlayerResponseModel c = aaph.c();
            final String e = aaph.e();
            final String v = a.v;
            final long b = aaph.b();
            if (!e.equals(a.u)) {
                final Pair pair = a.q.get(e);
                final absq p = a.p;
                final boolean b2 = pair != null && ((absk)pair.second).a;
                final boolean b3 = pair != null && ((absk)pair.second).b;
                final boolean b4 = pair != null && ((absk)pair.second).c;
                final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)p.a.a();
                scheduledExecutorService.getClass();
                final aajb aajb = (aajb)p.b.a();
                aajb.getClass();
                final zkr zkr = (zkr)p.c.a();
                zkr.getClass();
                final oco oco = (oco)p.d.a();
                oco.getClass();
                final tkq tkq = (tkq)p.e.a();
                tkq.getClass();
                final twn twn = (twn)p.f.a();
                twn.getClass();
                final zkn zkn = (zkn)p.g.a();
                zkn.getClass();
                final zrg zrg = (zrg)p.h.a();
                zrg.getClass();
                final tsd tsd = (tsd)p.i.a();
                final aamy aamy = (aamy)p.j.a();
                aamy.getClass();
                final zoa zoa = (zoa)p.k.a();
                zoa.getClass();
                final arzb arzb = (arzb)p.l.a();
                arzb.getClass();
                final absv absv = (absv)p.m.a();
                absv.getClass();
                final abkq abkq = (abkq)p.n.a();
                abkq.getClass();
                final abls abls = (abls)p.o.a();
                abls.getClass();
                final apup apup = (apup)p.p.a();
                final adry adry = (adry)p.q.a();
                adry.getClass();
                final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)((aron)p.r).a;
                c.getClass();
                e.getClass();
                a.t = new absp(scheduledExecutorService, aajb, zkr, oco, tkq, twn, zkn, zrg, tsd, aamy, zoa, arzb, absv, abkq, abls, apup, adry, playbackStartDescriptor, v, c, e, 1, b2, b3, b4, null, null, null);
                if (pair == null) {
                    a.q.put(e, new Pair((Object)b, (Object)a.t.a()));
                }
                a.u = e;
            }
            long e2 = a.s.e;
            final Pair pair2 = a.q.get(aaph.e());
            if (pair2 != null) {
                e2 = a.s.e - (long)pair2.first;
            }
            final absp t = a.t;
            if (t != null) {
                t.m(e2);
            }
        }
        else if (!a.b(aaph.e()) && aaph.e().equals(a.u)) {
            final absp t2 = a.t;
            if (t2 != null) {
                t2.o();
                final absk a2 = a.t.a();
                final Pair pair3 = a.q.get(aaph.e());
                long longValue;
                if (pair3 != null) {
                    longValue = (long)pair3.first;
                }
                else {
                    longValue = 0L;
                }
                a.q.put(aaph.e(), new Pair((Object)longValue, (Object)a2));
                a.a();
            }
        }
    }
}
