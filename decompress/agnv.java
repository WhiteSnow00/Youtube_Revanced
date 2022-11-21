import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.FilenameFilter;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import android.util.Pair;
import com.google.apps.tiktok.account.AccountId;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import android.content.Context;
import java.util.concurrent.Executor;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnv
{
    public final Object a;
    public final Object b;
    
    public agnv() {
        this(new aapu((byte[])null, null), new long[10], null, null, null);
    }
    
    public agnv(final aapu a, final atnb b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final aapu b, final long[] a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public agnv(final aepm b, final oco a) {
        this.b = b;
        this.a = a;
    }
    
    public agnv(final afnf b, final afne a) {
        this.b = b;
        this.a = a;
    }
    
    public agnv(final afr a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final afxj a, final aapu b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final afxj a, final agnl b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final agnl a, final agnv b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final agnv a, final aema b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final aheu a, final aemk b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final aheu aheu, final byte[] array) {
        this();
        e(this, aheu);
    }
    
    public agnv(final SharedPreferences b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public agnv(final atnb b) {
        this.a = new HashMap();
        this.b = b;
    }
    
    public agnv(final Object b, final aery a) {
        this.b = b;
        this.a = a;
    }
    
    private agnv(final FileChannel a, final FileLock b) {
        this.a = a;
        this.b = b;
    }
    
    public agnv(final Executor a) {
        this.b = new abi();
        this.a = a;
    }
    
    public agnv(final byte[] b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    public static agnv b(Context ex) {
        FileChannel channel = null;
        FileLock lock = null;
        Label_0086: {
            try {
                ex = (OverlappingFileLockException)new RandomAccessFile(new File(((Context)ex).getFilesDir(), "generatefid.lock"), "rw");
                channel = ((RandomAccessFile)ex).getChannel();
                try {
                    lock = channel.lock();
                    try {
                        return new agnv(channel, lock);
                    }
                    catch (final OverlappingFileLockException ex) {}
                    catch (final Error ex) {}
                    catch (final IOException ex) {}
                }
                catch (final OverlappingFileLockException ex) {}
                catch (final Error ex) {}
                catch (final IOException ex2) {}
                lock = null;
                break Label_0086;
            }
            catch (final OverlappingFileLockException ex) {}
            catch (final Error ex) {}
            catch (final IOException ex3) {}
            channel = null;
            lock = null;
        }
        Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", (Throwable)ex);
        if (lock != null) {
            try {
                lock.release();
            }
            catch (final IOException ex4) {}
        }
        Label_0115: {
            if (channel == null) {
                break Label_0115;
            }
            try {
                channel.close();
                return null;
            }
            catch (final IOException ex5) {
                return null;
            }
        }
    }
    
    public static void e(final agnv agnv, final aheu aheu) {
        aghv.b((long[])((aapu)agnv.b).b, (long[])((aapu)aheu.b).b, (long[])aheu.a);
        final Object c = ((aapu)agnv.b).c;
        final aapu aapu = (aapu)aheu.b;
        aghv.b((long[])c, (long[])aapu.c, (long[])aapu.a);
        aghv.b((long[])((aapu)agnv.b).a, (long[])((aapu)aheu.b).a, (long[])aheu.a);
        final Object a = agnv.a;
        final aapu aapu2 = (aapu)aheu.b;
        aghv.b((long[])a, (long[])aapu2.b, (long[])aapu2.c);
    }
    
    public static String l(final int n, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(".");
        sb.append(s);
        return sb.toString();
    }
    
    public static String m(final AccountId accountId, final String s) {
        return l(accountId.a(), s);
    }
    
    public final void a() {
        try {
            ((FileLock)this.b).release();
            ((FileChannel)this.a).close();
        }
        catch (final IOException ex) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", (Throwable)ex);
        }
    }
    
    public final nnt c(String ex, String a, agmp e) {
        synchronized (this) {
            final Pair pair = new Pair((Object)ex, (Object)a);
            final nnt nnt = ((Map<K, nnt>)this.b).get(pair);
            if (nnt == null) {
                a = (String)e.a;
                ex = (InterruptedException)e.b;
                final Object c = e.c;
                final Object d = e.d;
                e = (agmp)e.e;
                final agmq e2 = ((FirebaseInstanceId)a).e;
                final Bundle bundle = new Bundle();
                bundle.putString("scope", (String)d);
                bundle.putString("sender", (String)c);
                bundle.putString("subtype", (String)c);
                bundle.putString("appid", (String)ex);
                bundle.putString("gmp_app_id", ((agjs)e2.a).e().b);
                bundle.putString("gmsv", Integer.toString(((agmr)e2.b).a()));
                bundle.putString("osv", Integer.toString(Build$VERSION.SDK_INT));
                bundle.putString("app_ver", ((agmr)e2.b).c());
                bundle.putString("app_ver_name", ((agmr)e2.b).d());
                bundle.putString("firebase-app-name-hash", e2.a());
                Label_0297: {
                    try {
                        ex = (InterruptedException)((agnf)nom.f(((agnb)e2.f).l())).a;
                        if (!TextUtils.isEmpty((CharSequence)ex)) {
                            bundle.putString("Goog-Firebase-Installations-Auth", (String)ex);
                            break Label_0297;
                        }
                        Log.w("FirebaseInstanceId", "FIS auth token is empty");
                        break Label_0297;
                    }
                    catch (final InterruptedException ex) {}
                    catch (final ExecutionException ex2) {}
                    Log.e("FirebaseInstanceId", "Failed to get FIS auth token", (Throwable)ex);
                }
                bundle.putString("cliv", "fiid-21.1.1");
                final agml agml = (agml)((agmy)e2.e).a();
                final agph agph = (agph)((agmy)e2.d).a();
                if (agml != null && agph != null) {
                    final int b = agml.b();
                    if (b != 1) {
                        bundle.putString("Firebase-Client-Log-Type", Integer.toString(agpx.w(b)));
                        bundle.putString("Firebase-Client", agph.a());
                    }
                }
                final nnt d2 = ((mqe)e2.c).b(bundle).a(agmn.a, (nni)new myw(4)).d(((FirebaseInstanceId)a).b, (nns)new agob((FirebaseInstanceId)a, (String)c, (String)d, 1));
                d2.o((Executor)rs.h, (nnp)new rkb((FirebaseInstanceId)a, (agmv)e, 2));
                final nnt b2 = d2.b((Executor)this.a, (nni)new agmt(this, pair, 0, null));
                ((Map<Pair, nnt>)this.b).put(pair, b2);
                return b2;
            }
            return nnt;
        }
    }
    
    public final Object d(final AccountId a) {
        synchronized (this.a) {
            if (!((Map)this.a).containsKey(a)) {
                final Object a2 = this.a;
                final hzv hzv = (hzv)((atnb)this.b).a();
                ((Map<AccountId, esw>)a2).put((AccountId)(hzv.a = a), new esw((era)hzv.b, (AccountId)hzv.a));
            }
            return ((Map<K, Object>)this.a).get(a);
        }
    }
    
    public final ListenableFuture f(final File file) {
        return ((afxj)this.a).rz(aewf.i((Callable)new aenb(file, 0)));
    }
    
    public final afgh g(final afhk afhk, final afhk afhk2, final boolean b) {
        final boolean b2 = true;
        boolean b3 = false;
        Label_0033: {
            if (afhk == null) {
                b3 = b2;
                if (afhk2 != null) {
                    break Label_0033;
                }
            }
            b3 = (afhk != null && afhk2 == null && b2);
        }
        adme.K(b3);
        final afgc d = afgh.d();
        final aflu k = ((agnl)this.a).g().k();
        while (((Iterator)k).hasNext()) {
            final File[] listFiles = new File((File)((Iterator)k).next(), "accounts").listFiles((FilenameFilter)new aemz(afhk2, afhk, b));
            if (listFiles != null) {
                d.i((Object[])listFiles);
            }
        }
        return d.g();
    }
    
    public final afgh h(final boolean b) {
        return this.g(null, (afhk)afkg.a, b);
    }
    
    public final ListenableFuture i(final afgh afgh) {
        final ArrayList list = new ArrayList();
        for (int c = ((afjx)afgh).c, i = 0; i < c; ++i) {
            list.add(((agnv)this.b).f((File)afgh.get(i)));
        }
        return afxr.L(list).j((Callable)new aenb((List)list, 1), (Executor)afwd.a);
    }
    
    public final int j() {
        return ((SharedPreferences)this.b).getInt("count", 0);
    }
    
    public final String k(final AccountId accountId, final String s) {
        return ((SharedPreferences)this.b).getString(m(accountId, s), (String)null);
    }
    
    public final boolean n(final AccountId accountId, final String s) {
        return ((SharedPreferences)this.b).getBoolean(m(accountId, s), false);
    }
    
    public final ListenableFuture o(final AccountId accountId) {
        final aemn aemn = (aemn)this.b;
        return afvh.f(aemn.h.a(), aewf.d((afvq)new xtd(aemn, accountId, 16)), (Executor)afwd.a);
    }
    
    public final ListenableFuture p(final String s, final String s2) {
        final aheu aheu = (aheu)this.a;
        return afvh.e(((qrk)aheu.a).a(), (afax)new ably(s, s2, 7), (Executor)aheu.b);
    }
    
    public final ListenableFuture q(final AccountId accountId) {
        return afvh.e(((qrk)((aheu)this.a).a).a(), (afax)new aemg(accountId, 0), (Executor)afwd.a);
    }
    
    public final ListenableFuture r() {
        final aheu aheu = (aheu)this.a;
        return afvh.e(((qrk)aheu.a).a(), (afax)aemh.c, (Executor)aheu.b);
    }
}
