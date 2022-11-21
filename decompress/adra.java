import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.ExecutionException;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.List;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import java.util.TreeSet;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import com.google.apps.tiktok.account.AccountId;
import java.util.Set;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adra implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public adra(final adre a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final adsw a, final agvu b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final adsw b, final ocw a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adra(final adsw b, final ocx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adra(final adtd a, final Supplier b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final adte a, final Supplier b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final aefl a, final aefn b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final aegb b, final aefr a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adra(final aenf a, final aese b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final aeqd a, final auoz b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final aeqd a, final ListenableFuture b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final aeta a, final Set b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final agnv b, final AccountId a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adra(final aheu b, final adsd a, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adra(final ListenableFuture a, final agqa b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final ListenableFuture a, final ListenableFuture b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final ListenableFuture a, final TimeUnit b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adra(final Future b, final ListenableFuture a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int c = this.c;
        int i = 0;
        switch (c) {
            default: {
                final Object a = this.a;
                final Object b = this.b;
                final aeta aeta = (aeta)a;
                aeta.b.writeLock().lock();
                try {
                    aetl aetl = aetl.a;
                    try {
                        aetl = ((aeta)a).a();
                    }
                    catch (final IOException ex) {
                        if (!((aeta)a).f(ex)) {
                            c.i(((aflw)aeta.a).g(), "Unable to read or clear store. Cannot remove account.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$removeSyncRequests$6", '\u0190', "SyncManagerDataStore.java", ex);
                            aeta.b.writeLock().unlock();
                            return;
                        }
                    }
                    final ahcr builder = aetl.a.createBuilder();
                    builder.mergeFrom((ahcz)aetl);
                    builder.copyOnWrite();
                    ((aetl)builder.instance).d = ahcz.emptyProtobufList();
                    for (final aetk aetk : aetl.d) {
                        aetn aetn;
                        if ((aetn = aetk.c) == null) {
                            aetn = aetn.a;
                        }
                        if (!((Set)b).contains(aetc.c(aetn))) {
                            builder.ai(aetk);
                        }
                    }
                    try {
                        ((aeta)a).e((aetl)builder.build());
                    }
                    catch (final IOException ex2) {
                        c.i(((aflw)aeta.a).g(), "Error writing sync data file. Cannot remove account.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$removeSyncRequests$6", '\u01a4', "SyncManagerDataStore.java", ex2);
                    }
                    aeta.b.writeLock().unlock();
                    return;
                }
                finally {
                    aeta.b.writeLock().unlock();
                    while (true) {}
                }
                break;
            }
            case 19: {
                final Object a2 = this.a;
                final Object b2 = this.b;
                final aeta aeta2 = (aeta)a2;
                aeta2.b.writeLock().lock();
                try {
                    final aetl a3 = aetl.a;
                    aetl a4;
                    try {
                        a4 = ((aeta)a2).a();
                    }
                    catch (final IOException ex3) {
                        a4 = a3;
                        if (!((aeta)a2).f(ex3)) {
                            c.i(((aflw)aeta.a).g(), "Unable to read or clear store, will not update scheduled account ids. ", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateScheduledAccountIds$5", '\u0169', "SyncManagerDataStore.java", ex3);
                            a4 = a3;
                        }
                    }
                    final ahcr builder2 = a4.toBuilder();
                    builder2.copyOnWrite();
                    ((aetl)builder2.instance).f = ahcz.emptyIntList();
                    final TreeSet set = new TreeSet();
                    for (final aetc aetc : b2) {
                        if (aetc.d()) {
                            set.add(((AutoValue_AccountId)aetc.c).a);
                        }
                    }
                    builder2.copyOnWrite();
                    final aetl aetl2 = (aetl)builder2.instance;
                    final ahdh f = aetl2.f;
                    if (!f.c()) {
                        aetl2.f = ahcz.mutableCopy(f);
                    }
                    ahbc.addAll((Iterable)set, (List)aetl2.f);
                    try {
                        ((aeta)a2).e((aetl)builder2.build());
                    }
                    catch (final IOException ex4) {
                        c.i(((aflw)aeta.a).g(), "Error writing scheduled account ids", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "lambda$updateScheduledAccountIds$5", '\u017e', "SyncManagerDataStore.java", ex4);
                    }
                }
                finally {
                    aeta2.b.writeLock().unlock();
                }
            }
            case 18: {
                ((aeqd)this.a).d((auoz)this.b);
                return;
            }
            case 17: {
                final Object a5 = this.a;
                final Object b3 = this.b;
                final Set f2 = ((aeqd)a5).f;
                if (f2 != null) {
                    f2.remove(b3);
                }
                return;
            }
            case 16: {
                TikTokListenableWorker.c((ListenableFuture)this.a, (agqa)this.b);
                return;
            }
            case 15: {
                final Object a6 = this.a;
                final Object b4 = this.b;
                if (((ListenableFuture)a6).isCancelled()) {
                    ((ListenableFuture)b4).cancel(true);
                }
                return;
            }
            case 14: {
                final Object b5 = this.b;
                final Object a7 = this.a;
                ((Future)b5).cancel(true);
                if (((ListenableFuture)a7).isCancelled()) {
                    return;
                }
                try {
                    afxr.t((Future)a7);
                    return;
                }
                catch (final ExecutionException ex5) {
                    final Throwable cause = ex5.getCause();
                    synchronized (aeua.a) {
                        aeua.a.put(cause, true);
                        monitorexit(aeua.a);
                        throw new aewk(cause, aewk.c(aewp.a(), null));
                    }
                }
            }
            case 13: {
                final Object a8 = this.a;
                final Object b6 = this.b;
                if (!((ListenableFuture)a8).isDone()) {
                    ((afly)((afly)((afly)((aflw)aenj.a).g()).i((Throwable)aewk.b())).j("com/google/apps/tiktok/concurrent/AndroidFutures", "lambda$crashApplicationOnFailure$1", 291, "AndroidFutures.java")).y("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", (Object)30L, b6, a8);
                }
                return;
            }
            case 12: {
                final Object a9 = this.a;
                final Object b7 = this.b;
                final aenf aenf = (aenf)a9;
                final File h = aenf.d.h((aese)b7);
                final String[] list = h.list((FilenameFilter)new aend(aenf, 2));
                if (list != null) {
                    while (i < list.length) {
                        final String s = list[i];
                        if (new File(h, s).delete()) {
                            ((afly)((afly)((aflw)aenf.a).f()).j("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "lambda$clean$2", 93, "OrphanCacheSingletonSynclet.java")).t("Removed orphaned cache file: %s", (Object)s);
                        }
                        else {
                            ((afly)((afly)((aflw)aenf.a).g()).j("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "lambda$clean$2", 95, "OrphanCacheSingletonSynclet.java")).t("Failed to remove orphaned cache file: %s", (Object)s);
                        }
                        ++i;
                    }
                }
                return;
            }
            case 11: {
                final Object b8 = this.b;
                final String by = aapu.by((AccountId)this.a);
                final aflu k = ((agnl)((agnv)b8).b).g().k();
                while (((Iterator)k).hasNext()) {
                    final File file = new File((File)((Iterator)k).next(), by);
                    if (file.exists()) {
                        if (file.setWritable(true, true)) {
                            continue;
                        }
                        throw new RuntimeException("Could not make data dir writable.");
                    }
                }
                return;
            }
            case 10: {
                final Object b9 = this.b;
                final Object a10 = this.a;
                final aegb aegb = (aegb)b9;
                aegb.h.k(a10);
                aegb.i.k(a10);
                return;
            }
            case 9: {
                final aefj a11 = ((aefl)this.a).a;
                final aefn aefn = (aefn)this.b;
                final List a12 = aefn.a;
                final List c2 = aefl.c(aefn.b);
                final Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt("status", 5);
                bundle.putInt("error_code", 0);
                if (!a12.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList(a12));
                }
                if (!c2.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList(c2));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                a11.f(aefr.b(bundle));
                return;
            }
            case 8: {
                final Object a13 = this.a;
                final adts adts = ((Supplier<adts>)this.b).get();
                if (adts.b == 2) {
                    ((adte)a13).b.f(adts.a);
                }
                return;
            }
            case 7: {
                afxr.v(((Supplier<ListenableFuture>)this.b).get(), (afwr)new nqg((adtd)this.a, 20), afwd.a);
                return;
            }
            case 6: {
                final Object a14 = this.a;
                final agvu agvu = (agvu)this.b;
                final int b10 = agvu.b;
                if (b10 != 4) {
                    if (b10 == 5) {
                        final adsw adsw = (adsw)a14;
                        if (adsw.a.e.isPresent()) {
                            ((adsv)adsw.a.e.get()).i(agvu);
                            return;
                        }
                        ((afly)((afly)((aflw)adsx.c).h()).j("com/google/android/livesharing/internal/LiveSharingClientImpl$LiveSharingIpcHandler", "lambda$handleStateUpdates$0", 792, "LiveSharingClientImpl.java")).r("Received a co-watching update, but beginCoWatching() was never called.");
                    }
                    return;
                }
                final adsw adsw2 = (adsw)a14;
                if (adsw2.a.d.isPresent()) {
                    ((adsu)adsw2.a.d.get()).i(agvu);
                    return;
                }
                ((afly)((afly)((aflw)adsx.c).h()).j("com/google/android/livesharing/internal/LiveSharingClientImpl$LiveSharingIpcHandler", "lambda$handleStateUpdates$0", 784, "LiveSharingClientImpl.java")).r("Received a co-doing update, but beginCoDoing() was never called.");
                return;
            }
            case 5: {
                final Object b11 = this.b;
                final Object a15 = this.a;
                final adsw adsw3 = (adsw)b11;
                if (!adsw3.a.m.isPresent()) {
                    ((afly)((afly)((aflw)adsx.c).f()).j("com/google/android/livesharing/internal/LiveSharingClientImpl$LiveSharingIpcHandler", "lambda$handleParticipantMetadataSetUpdate$1", 814, "LiveSharingClientImpl.java")).r("Delegate is missing on non-empty participant metadata set update.");
                    return;
                }
                final adsm adsm = (adsm)adsw3.a.m.get();
                final ocx ocx = (ocx)a15;
                adsx.o(ocx);
                if (ocx.b.equals(afgh.r(adsx.b))) {
                    final afkg a16 = afkg.a;
                }
                adsm.a();
                return;
            }
            case 4: {
                ((adsw)this.b).d((ocw)this.a);
                return;
            }
            case 3: {
                ((adsb)((aheu)this.b).a).n((adsd)this.a);
                return;
            }
            case 2: {
                ((adre)this.a).d((String)this.b);
                return;
            }
            case 1: {
                ((adre)this.a).d((String)this.b);
                return;
            }
            case 0: {
                ((adre)this.a).d((String)this.b);
            }
        }
    }
}
