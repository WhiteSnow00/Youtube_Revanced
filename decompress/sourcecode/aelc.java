import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.Set;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelc implements aekp
{
    private final aeky a;
    private final Map b;
    private final ahar c;
    
    public aelc(final aeky a, final Map b, final ahar c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private static final eg b(final aekv aekv) {
        agot.D(true);
        final cms cms = new cms(TikTokListenableWorker.class);
        cms.c(aekv.b);
        final aekt d = aekv.d;
        cms.d(d.a, d.b);
        cms.e(aekv.e);
        final afie k = aekv.h.k();
        while (((Iterator)k).hasNext()) {
            cms.b((String)((Iterator)k).next());
        }
        return cms.f();
    }
    
    @Override
    public final ListenableFuture a(final aekv aekv) {
        aelh.d(aekv);
        final Class a = aekv.a;
        final String s = this.b.get(a);
        a.toString();
        s.getClass();
        final afdu s2 = afdu.s((Object)aelh.b(s));
        final aeks aeks = new aeks(aekv);
        final afdu h = aekv.h;
        h.getClass();
        aeks.b((Set)new afgv((Set)h, (Set)s2));
        final aekv a2 = aeks.a();
        final ahar c = this.c;
        aelh.e(a2);
        agot.D(true);
        ListenableFuture listenableFuture;
        if (a2.g.h()) {
            agot.D(true);
            agot.D(a2.g.h());
            final eg b = b(a2);
            final aeky a3 = this.a;
            final String a4 = ((aeku)a2.g.c()).a;
            final aeku aeku = (aeku)a2.g.c();
            listenableFuture = afrp.e(a3.c(a4, b), new aeis(b, 6, null), (Executor)afsl.a);
        }
        else {
            agot.D(true);
            agot.D(a2.g.h() ^ true);
            final eg b2 = b(a2);
            listenableFuture = afrp.e(this.a.b(b2), new aeis(b2, 7, null), (Executor)afsl.a);
        }
        final aada aada = new aada(2);
        final Set set = (Set)((arje)c.d).a;
        final Object b3 = c.b;
        final ArrayList list = new ArrayList();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final ListenableFuture l = afld.l((afrx)new adcd((afry)aada, (aekr)iterator.next(), 17), (Executor)b3);
            aejp.b(l, "TikTok Client WorkManager Scheduling Monitor failed", new Object[0]);
            list.add(l);
        }
        return afva.E(new ListenableFuture[] { listenableFuture, afva.t(afva.n(afva.D((Iterable)list).j(aesm.i((Callable)xmm.g), (Executor)afsl.a)), 10L, TimeUnit.SECONDS, (ScheduledExecutorService)c.b) }).k(aesm.c((afrx)new aeiq(listenableFuture, 3)), (Executor)afsl.a);
    }
}
