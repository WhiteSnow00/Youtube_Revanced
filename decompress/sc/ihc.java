import java.util.Iterator;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Collections;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import com.google.research.xeno.effect.ProcessorBase;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.List;
import j$.util.Optional;
import android.content.Context;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihc implements ace
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public ihc(final acid a, final PlaybackStartDescriptor b, final abjy c, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ihc(final adru b, final Context a, final Optional c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ihc(final adru b, final Context a, final String c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public ihc(final ihd a, final ajpw b, final ajvo c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ihc(final List a, final ScheduledExecutorService c, final Executor b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ihc(final mlq c, final cct a, final cct b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ihc(final nym a, final List c, final aqvb b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final Object a(final acc acc) {
        switch (this.d) {
            default: {
                ((adru)this.b).a(((Context)this.a).getApplicationContext(), (adrp)new adrs(acc), (Optional)this.c, Optional.empty());
                return adrp.class.getSimpleName();
            }
            case 6: {
                ((adru)this.b).a(((Context)this.a).getApplicationContext(), (adrp)new adrs(acc), Optional.empty(), Optional.of(this.c));
                return adrp.class.getSimpleName();
            }
            case 5: {
                final Object a = this.a;
                final Object b = this.b;
                final Object c = this.c;
                final acid acid = (acid)a;
                final Object c2 = acid.c;
                final aanx aanx = (aanx)acid.b;
                final abfc abfc = (abfc)((atke)aanx.a).a();
                abfc.getClass();
                ((Executor)c2).execute(new abeq(abfc, (adet)((atke)aanx.b).a(), acc, (PlaybackStartDescriptor)b, (abjy)c, null, null, null));
                return "PrefetchPrebufferManagerImpl.doPrefetch operation";
            }
            case 4: {
                final Object a2 = this.a;
                final Object b2 = this.b;
                final Object c3 = this.c;
                final acid acid2 = (acid)a2;
                final Object c4 = acid2.c;
                final abfc abfc2 = (abfc)((atke)((adet)acid2.d).a).a();
                abfc2.getClass();
                ((Executor)c4).execute(new abet(abfc2, acc, (PlaybackStartDescriptor)b2, (abjy)c3));
                return "PrefetchPrebufferManagerImpl.doOnesiePrefetchPrebuffer operation";
            }
            case 3: {
                ((ProcessorBase)this.b).i((aqvf)new aquw(((nym)this.a).a, (List)this.c, pja.F(acc), 1, null, null, null, null));
                return "Experience.activateItems";
            }
            case 2: {
                final Object c5 = this.c;
                final Object a3 = this.a;
                final Object b3 = this.b;
                final mlq mlq = (mlq)c5;
                return mlq.b.post((Runnable)new jps(mlq, (cct)a3, (cct)b3, acc, 10));
            }
            case 1: {
                final Object a4 = this.a;
                final Object c6 = this.c;
                final Object b4 = this.b;
                final ListenableFuture f = sg.f((Collection)a4);
                final ScheduledFuture<?> schedule = ((ScheduledExecutorService)c6).schedule((Runnable)new vo((Executor)b4, f, acc, 2), 5000L, TimeUnit.MILLISECONDS);
                acc.a((Runnable)new uy(f, 4), (Executor)b4);
                sg.i(f, (aad)new zb(acc, (ScheduledFuture)schedule, 0), (Executor)b4);
                return "surfaceList";
            }
            case 0: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                final Object c7 = this.c;
                for (final ajqd ajqd : ((ajpw)b5).d) {
                    if (ajqd.c.equals("Egl0aGVtZS1zZXQgSygB")) {
                        ajqe ajqe;
                        if ((ajqe = ajqd.f) == null) {
                            ajqe = ajqe.a;
                        }
                        final byte[] m = vwa.m(((agzk)ajqe).toByteString());
                        if (m == null) {
                            continue;
                        }
                        try {
                            ((ihd)a5).e = (aosg)ahbh.parseFrom((ahbh)aosg.a, m, ExtensionRegistryLite.getGeneratedRegistry());
                        }
                        catch (final ahca ahca) {
                            ttr.b("Could not parse persisted ThemeSetEntity");
                            acc.c(c7);
                        }
                        final ihd ihd = (ihd)a5;
                        final aosg e = ihd.e;
                        if (e == null) {
                            continue;
                        }
                        ihd.d = new String[Collections.unmodifiableMap((Map<?, ?>)e.d).size()];
                        Collections.unmodifiableMap((Map<?, ?>)ihd.e.d).values().toArray(ihd.d);
                        final String c8 = ihd.e.c;
                        final iep iep = new iep(acc, (ajvo)c7, 8);
                        ihd.a.put(c8, ihd.b.a("Egl0aGVtZS1zZXQgSygB").af(atjj.b((Executor)ihd.c)).K((asjs)hus.s).i(ashb.e).L((asjr)ign.c).L((asjr)ign.d).v((asjm)new iad(acc, 20)).am((asjm)new gng(ihd, c8, (Runnable)iep, 5)));
                        for (final String s : ihd.d) {
                            ihd.a.put(s, ihd.b.a(s).af(atjj.b((Executor)ihd.c)).K((asjs)hus.s).aH((asjm)new gng(ihd, s, (Runnable)iep, 6)));
                        }
                    }
                }
                return null;
            }
        }
    }
}
