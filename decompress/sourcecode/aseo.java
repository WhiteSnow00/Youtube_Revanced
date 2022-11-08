import java.util.concurrent.Future;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.ExecutionException;
import android.text.TextUtils;
import android.os.Build$VERSION;
import com.google.firebase.iid.FirebaseInstanceId;
import android.util.Pair;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.Set;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;
import java.lang.reflect.Method;
import io.grpc.Status;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import android.content.ContentProviderClient;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aseo
{
    public final Object a;
    public final Object b;
    
    public aseo() {
        this.b = new HashMap();
        this.a = new HashMap();
    }
    
    public aseo(final afjp b, final afjo a) {
        this.b = b;
        this.a = a;
    }
    
    public aseo(final afp a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public aseo(final ahbd ahbd, final byte[] array) {
        this((byte[])null);
        i(this, ahbd);
    }
    
    public aseo(final ContentProviderClient b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public aseo(final arts b) {
        b.getClass();
        this.b = b;
        this.a = "pick_first";
    }
    
    public aseo(final arvf b, final aseo a, final byte[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public aseo(final arvn a, final ScheduledFuture b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public aseo(final asef a, final aseo b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public aseo(final aseo aseo, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = new HashMap((Map<?, ?>)aseo.b);
        final HashMap a = new HashMap((Map<? extends K, ? extends V>)aseo.a);
        this.a = a;
        final HashMap hashMap = a;
        final Iterator iterator = a.entrySet().iterator();
        while (iterator.hasNext()) {
            if (((Map.Entry<K, aqzr>)iterator.next()).getValue().e.get()) {
                iterator.remove();
            }
        }
    }
    
    public aseo(final atjj b) {
        this.a = new HashMap();
        this.b = b;
    }
    
    public aseo(final auip b, final long[] a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public aseo(final Status b, final Object a) {
        b.getClass();
        this.b = b;
        this.a = a;
    }
    
    public aseo(final Status b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    public aseo(final Object b, final aeof a) {
        this.b = b;
        this.a = a;
    }
    
    public aseo(final Method b, final Method a) {
        this.b = b;
        this.a = a;
    }
    
    private aseo(final FileChannel a, final FileLock b) {
        this.a = a;
        this.b = b;
    }
    
    public aseo(final Set a, final erb b) {
        this.a = a;
        this.b = b;
    }
    
    public aseo(final Executor a) {
        this.b = new abg();
        this.a = a;
    }
    
    public aseo(final byte[] array) {
        this(new auip((byte[])null), new long[10], null, null);
    }
    
    public aseo(final byte[] b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    public static aseo h(Context ex) {
        Object channel = null;
        FileLock lock = null;
        Label_0086: {
            try {
                ex = (OverlappingFileLockException)new RandomAccessFile(new File(((Context)ex).getFilesDir(), "generatefid.lock"), "rw");
                channel = ((RandomAccessFile)ex).getChannel();
                try {
                    lock = ((FileChannel)channel).lock();
                    try {
                        return new aseo((FileChannel)channel, lock);
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
            channel = (lock = null);
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
                ((AbstractInterruptibleChannel)channel).close();
                return null;
            }
            catch (final IOException ex5) {
                return null;
            }
        }
    }
    
    public static void i(final aseo aseo, final ahbd ahbd) {
        agec.b((long[])((auip)aseo.b).c, (long[])((auip)ahbd.b).c, (long[])ahbd.a);
        final Object b = ((auip)aseo.b).b;
        final auip auip = (auip)ahbd.b;
        agec.b((long[])b, (long[])auip.b, (long[])auip.a);
        agec.b((long[])((auip)aseo.b).a, (long[])((auip)ahbd.b).a, (long[])ahbd.a);
        final Object a = aseo.a;
        final auip auip2 = (auip)ahbd.b;
        agec.b((long[])a, (long[])auip2.c, (long[])auip2.b);
    }
    
    public final void a() {
        ((arvn)this.a).b = true;
        ((Future)this.b).cancel(false);
    }
    
    public final avq b(final br br, final avq avq) {
        return this.c((cgj)br, br.m, avq);
    }
    
    public final avq c(final cgj cgj, final Bundle bundle, final avq avq) {
        final Object a = this.a;
        aqqn.m((Object)avq);
        return (avq)new aric(cgj, bundle, (Set)a, avq, (erb)this.b);
    }
    
    public final void d() {
        ((ContentProviderClient)this.b).close();
    }
    
    public final void e() {
        try {
            ((FileLock)this.b).release();
            ((FileChannel)this.a).close();
        }
        catch (final IOException ex) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", (Throwable)ex);
        }
    }
    
    public final nly f(String ex, String a, agix e) {
        synchronized (this) {
            final Pair pair = new Pair((Object)ex, (Object)a);
            final nly nly = ((Map<K, nly>)this.b).get(pair);
            if (nly == null) {
                a = (String)e.a;
                ex = (InterruptedException)e.b;
                final Object c = e.c;
                final Object d = e.d;
                e = (agix)e.e;
                final agiy e2 = ((FirebaseInstanceId)a).e;
                final Bundle bundle = new Bundle();
                bundle.putString("scope", (String)d);
                bundle.putString("sender", (String)c);
                bundle.putString("subtype", (String)c);
                bundle.putString("appid", (String)ex);
                bundle.putString("gmp_app_id", ((agfz)e2.a).e().b);
                bundle.putString("gmsv", Integer.toString(((agiz)e2.b).a()));
                bundle.putString("osv", Integer.toString(Build$VERSION.SDK_INT));
                bundle.putString("app_ver", ((agiz)e2.b).c());
                bundle.putString("app_ver_name", ((agiz)e2.b).d());
                bundle.putString("firebase-app-name-hash", e2.a());
                Label_0306: {
                    try {
                        ex = (InterruptedException)((agjn)nmr.d(((agjj)e2.f).l())).a;
                        if (!TextUtils.isEmpty((CharSequence)ex)) {
                            bundle.putString("Goog-Firebase-Installations-Auth", (String)ex);
                            break Label_0306;
                        }
                        Log.w("FirebaseInstanceId", "FIS auth token is empty");
                        break Label_0306;
                    }
                    catch (final InterruptedException ex) {}
                    catch (final ExecutionException ex2) {}
                    Log.e("FirebaseInstanceId", "Failed to get FIS auth token", (Throwable)ex);
                }
                bundle.putString("cliv", "fiid-21.1.1");
                final agit agit = (agit)((agjg)e2.e).a();
                final aglo aglo = (aglo)((agjg)e2.d).a();
                if (agit != null && aglo != null) {
                    final int b = agit.b();
                    if (b != 1) {
                        bundle.putString("Firebase-Client-Log-Type", Integer.toString(agnj.y(b)));
                        bundle.putString("Firebase-Client", aglo.a());
                    }
                }
                final nly d2 = ((mol)e2.c).b(bundle).a(agiv.a, (nln)new mxc(4)).d(((FirebaseInstanceId)a).b, (nlx)new agki((FirebaseInstanceId)a, (String)c, (String)d, 1));
                d2.o((Executor)rr.h, (nlu)new rgz((FirebaseInstanceId)a, (agjd)e, 2));
                final nly b2 = d2.b((Executor)this.a, (nln)new agjb(this, pair, 0, (byte[])null, (byte[])null, (byte[])null));
                ((Map<Pair, nly>)this.b).put(pair, b2);
                return b2;
            }
            return nly;
        }
    }
    
    public final Object g(final AccountId a) {
        synchronized (this.a) {
            if (!((Map)this.a).containsKey(a)) {
                final Object a2 = this.a;
                final hyq hyq = (hyq)((atjj)this.b).a();
                ((Map<AccountId, esr>)a2).put((AccountId)(hyq.a = a), new esr((eqv)hyq.b, (AccountId)hyq.a));
            }
            return ((Map<K, Object>)this.a).get(a);
        }
    }
}
