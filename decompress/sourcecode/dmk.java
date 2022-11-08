import java.util.concurrent.locks.Lock;
import java.util.Queue;
import java.util.Map;
import java.util.Iterator;
import android.graphics.Bitmap;
import java.lang.reflect.Constructor;
import java.util.Collection;
import android.os.SystemClock;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.util.Collections;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.Bundle;
import android.os.Looper;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Intent;
import androidx.mediarouter.media.MediaTransferReceiver;
import android.os.Build$VERSION;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;
import java.util.ArrayList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmk
{
    public static cco c;
    public final Object a;
    public final Object b;
    
    public dmk() {
        this.a = new dpc(1000L);
        this.b = dpn.b(10, (dpj)new dhd(0));
    }
    
    public dmk(final akq akq) {
        final din a = new din(akq);
        this.b = new cya((char[])null);
        this.a = a;
    }
    
    public dmk(final Context a) {
        this.b = new ArrayList();
        this.a = a;
    }
    
    public dmk(final Context b, final dag dag) {
        this.b = b;
        this.a = new czw(this, dag, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public dmk(final Context b, final dah dah) {
        this.b = b;
        this.a = new czw(this, dah, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public dmk(Handler b, final bsn a) {
        if (a != null) {
            dk.d((Object)b);
        }
        else {
            b = null;
        }
        this.b = b;
        this.a = a;
    }
    
    public dmk(final azm azm, final int... array) {
        this(azm, array, null);
    }
    
    public dmk(final azm b, final int[] a, final byte[] array) {
        if (a.length == 0) {
            bao.b("ETSDefinition", "Empty tracks are not allowed", (Throwable)new IllegalArgumentException());
        }
        this.b = b;
        this.a = a;
    }
    
    public dmk(final bte b) {
        this.b = b;
        this.a = new AtomicBoolean(false);
    }
    
    public dmk(final dgf a, final dgd b) {
        this.a = a;
        this.b = b;
    }
    
    public dmk(final dmo b) {
        this.a = new HashMap();
        this.b = b;
    }
    
    public dmk(final String b) {
        this.b = b;
        final String s = b;
        this.a = new JSONObject(b);
    }
    
    public dmk(final List b) {
        this.b = b;
        this.a = new buc[b.size()];
    }
    
    public dmk(final List a, final dgd b) {
        this.a = a;
        this.b = b;
    }
    
    public dmk(final byte[] array) {
        this.a = new HashMap();
        this.b = new cxz((byte[])null, (byte[])null);
    }
    
    public dmk(final byte[] array, final byte[] array2) {
        final ByteArrayOutputStream b = new ByteArrayOutputStream(512);
        this.b = b;
        this.a = new DataOutputStream(b);
    }
    
    public dmk(final char[] array) {
        this.a = new Object();
        this.b = new LinkedHashMap();
    }
    
    public dmk(final long[] a, final long[] b) {
        this.a = a;
        this.b = b;
    }
    
    public static final void A(final ccs ccs) {
        if (ccs != null) {
            r();
            q().k(ccs, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }
    
    public static final void B(final eg z) {
        r();
        final cco q = q();
        q.z = z;
        ccn y;
        if (z != null) {
            y = new ccn(q, z);
        }
        else {
            y = null;
        }
        final ccn y2 = q.y;
        if (y2 != null) {
            y2.a();
        }
        if ((q.y = y) != null) {
            q.n();
        }
    }
    
    public static final void C(final int n) {
        if (n >= 0 && n <= 3) {
            r();
            final cco q = q();
            final ccs c = q.c();
            if (q.e() != c) {
                q.k(c, n);
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }
    
    public static dmk T(final Context context) {
        if (context != null) {
            r();
            if (dmk.c == null) {
                dmk.c = new cco(context.getApplicationContext());
            }
            final cco c = dmk.c;
            int size = c.f.size();
            while (--size >= 0) {
                final dmk dmk = c.f.get(size).get();
                if (dmk == null) {
                    c.f.remove(size);
                }
                else {
                    if (dmk.a == context) {
                        return dmk;
                    }
                    continue;
                }
            }
            final dmk dmk2 = new dmk(context);
            c.f.add(new WeakReference(dmk2));
            return dmk2;
        }
        throw new IllegalArgumentException("context must not be null");
    }
    
    private static void W(final DataOutputStream dataOutputStream, final String s) {
        dataOutputStream.writeBytes(s);
        dataOutputStream.writeByte(0);
    }
    
    private final int X(final bkt bkt) {
        for (int size = ((ArrayList)this.b).size(), i = 0; i < size; ++i) {
            if (((adge)((ArrayList)this.b).get(i)).c == bkt) {
                return i;
            }
        }
        return -1;
    }
    
    public static final dfx d(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final ddo ddo) {
        final Drawable decodeDrawable = ImageDecoder.decodeDrawable(imageDecoder$Source, (ImageDecoder$OnHeaderDecodedListener)new djc(n, n2, ddo));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return (dfx)new dkz((AnimatedImageDrawable)decodeDrawable, 2);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: ".concat(String.valueOf(String.valueOf(decodeDrawable))));
    }
    
    public static final boolean e(final ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        return imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_WEBP;
    }
    
    public static cco q() {
        final cco c = dmk.c;
        if (c == null) {
            return null;
        }
        if (!c.b) {
            c.b = true;
            final int sdk_INT = Build$VERSION.SDK_INT;
            boolean d = false;
            Label_0134: {
                if (sdk_INT >= 30) {
                    final Context a = c.a;
                    final Intent intent = new Intent(a, (Class)MediaTransferReceiver.class);
                    intent.setPackage(a.getPackageName());
                    if (a.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                        d = true;
                    }
                    c.d = d;
                    if (d) {
                        c.e = new cbz(c.a, new qpt(c), null, null, null, null);
                        break Label_0134;
                    }
                }
                else {
                    c.d = false;
                }
                c.e = null;
            }
            c.c = (cdt)new cdl(c.a, c);
            c.l = new cct((Runnable)new aur(c, 18));
            c.g(c.c);
            final cbz e = c.e;
            if (e != null) {
                c.g(e);
            }
            c.A = new mus(c.a, (cdk)c);
            final mus a2 = c.A;
            if (!a2.a) {
                a2.a = true;
                final IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                if (Build$VERSION.SDK_INT < 33) {
                    ((Context)a2.b).registerReceiver((BroadcastReceiver)a2.c, intentFilter, (String)null, (Handler)a2.e);
                }
                else {
                    cdj.a((Context)a2.b, (BroadcastReceiver)a2.c, intentFilter, (Handler)a2.e, 4);
                }
                ((Handler)a2.e).post((Runnable)a2.f);
            }
        }
        return dmk.c;
    }
    
    public static void r() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }
    
    public static boolean s() {
        if (dmk.c == null) {
            return false;
        }
        final ccz m = q().m;
        if (m != null) {
            final Bundle d = m.d;
            if (d != null) {
                if (!d.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean t() {
        return dmk.c != null && q().q();
    }
    
    public static boolean u() {
        final cco q = q();
        if (q != null) {
            final ccz m = q.m;
            if (m != null) {
                if (m.c) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final ccs v() {
        r();
        return q().d();
    }
    
    public static final MediaSessionCompat$Token w() {
        final cco c = dmk.c;
        MediaSessionCompat$Token b = null;
        if (c == null) {
            return null;
        }
        final ccn y = c.y;
        if (y != null) {
            b = y.a.b();
        }
        else {
            final eg z = c.z;
            if (z != null) {
                return z.b();
            }
        }
        return b;
    }
    
    public static final List x() {
        r();
        final cco q = q();
        List<Object> list;
        if (q == null) {
            list = Collections.emptyList();
        }
        else {
            list = q.g;
        }
        return list;
    }
    
    public static final ccs y() {
        r();
        return q().e();
    }
    
    public static final boolean z(final ccj ccj, final int n) {
        if (ccj != null) {
            r();
            final cco q = q();
            final boolean d = ccj.d();
            final boolean b = false;
            boolean b2;
            if (d) {
                b2 = b;
            }
            else {
                if ((n & 0x2) != 0x0 || !q.k) {
                    final ccz m = q.m;
                    final boolean b3 = m != null && m.b && q.q();
                    final int size = q.g.size();
                    int n2 = 0;
                    while (true) {
                        b2 = b;
                        if (n2 >= size) {
                            return b2;
                        }
                        final ccs ccs = q.g.get(n2);
                        if ((n & 0x1) == 0x0 || !ccs.j()) {
                            if ((!b3 || ccs.j() || ccs.c() == q.e) && ccs.n(ccj)) {
                                break;
                            }
                        }
                        ++n2;
                    }
                }
                b2 = true;
            }
            return b2;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
    
    public final void D(final long n, final bar bar) {
        ble.c(n, bar, (buc[])this.a);
    }
    
    public final void E(final btl btl, final can can) {
        for (int i = 0; i < ((buc[])this.a).length; ++i) {
            can.c();
            final buc q = btl.q(can.a(), 3);
            final ayf ayf = ((List<ayf>)this.b).get(i);
            final String n = ayf.n;
            final boolean equals = "application/cea-608".equals(n);
            boolean b = true;
            if (!equals) {
                b = ("application/cea-708".equals(n) && b);
            }
            dk.g(b, (Object)"Invalid closed caption mime type provided: ".concat(String.valueOf(n)));
            String a;
            if ((a = ayf.c) == null) {
                a = can.b();
            }
            final aye aye = new aye();
            aye.a = a;
            aye.k = n;
            aye.d = ayf.f;
            aye.c = ayf.e;
            aye.C = ayf.F;
            aye.m = ayf.p;
            q.b(aye.a());
            ((buc[])this.a)[i] = q;
        }
    }
    
    public final byte[] F(final EventMessage eventMessage) {
        ((ByteArrayOutputStream)this.b).reset();
        try {
            W((DataOutputStream)this.a, eventMessage.a);
            String b;
            if ((b = eventMessage.b) == null) {
                b = "";
            }
            W((DataOutputStream)this.a, b);
            ((DataOutputStream)this.a).writeLong(eventMessage.c);
            ((DataOutputStream)this.a).writeLong(eventMessage.d);
            ((DataOutputStream)this.a).write(eventMessage.e);
            ((DataOutputStream)this.a).flush();
            return ((ByteArrayOutputStream)this.b).toByteArray();
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final void G(final ccj ccj, final bkt bkt) {
        this.H(ccj, bkt, 0);
    }
    
    public final void H(final ccj ccj, final bkt bkt, final int a) {
        if (ccj == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (bkt != null) {
            r();
            final int x = this.X(bkt);
            adge adge;
            if (x < 0) {
                adge = new adge(this, bkt, null, null, null);
                ((ArrayList)this.b).add(adge);
            }
            else {
                adge = ((ArrayList)this.b).get(x);
            }
            boolean b;
            if (a != adge.a) {
                adge.a = a;
                b = true;
            }
            else {
                b = false;
            }
            adge.b = SystemClock.elapsedRealtime();
            final ccj ccj2 = (ccj)adge.e;
            ccj2.c();
            ccj.c();
            if (!ccj2.c.containsAll(ccj.c)) {
                final elw elw = new elw((ccj)adge.e);
                elw.p(ccj);
                adge.e = elw.m();
            }
            else if (((b ? 1 : 0) | (a & 0x1)) == 0x0) {
                return;
            }
            q().m();
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
    
    public final void I(final bkt bkt) {
        if (bkt != null) {
            r();
            final int x = this.X(bkt);
            if (x >= 0) {
                ((ArrayList)this.b).remove(x);
                q().m();
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
    
    public final bti J(final Object... array) {
        final Object a = this.a;
        monitorenter(a);
        try {
            Constructor<bti> a2 = null;
            Label_0074: {
                Label_0022: {
                    if (!((AtomicBoolean)this.a).get()) {
                        try {
                            a2 = ((bte)this.b).a();
                            monitorexit(a);
                        }
                        catch (final Exception ex) {
                            throw new RuntimeException("Error instantiating extension", ex);
                        }
                        catch (final ClassNotFoundException ex2) {
                            ((AtomicBoolean)this.a).set(true);
                            monitorexit(a);
                            break Label_0022;
                        }
                        break Label_0074;
                    }
                    monitorexit(a);
                }
                a2 = null;
            }
            if (a2 == null) {
                return null;
            }
            try {
                return a2.newInstance(array);
            }
            catch (final Exception ex3) {
                throw new IllegalStateException("Unexpected error creating extractor", ex3);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void K(final String s, final long n, final long n2) {
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new bsm(this, s, n, n2, 0, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void L(final String s) {
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new bhc(this, s, 17, null, null, null));
        }
    }
    
    public final void M(final bdx bdx) {
        bdx.a();
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new bhc(this, bdx, 15, null, null, null));
        }
    }
    
    public final void N(final int n, final long n2) {
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new bsl(this, n, n2, 1, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void O(final bdx bdx) {
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new bhc(this, bdx, 14, null, null, null));
        }
    }
    
    public final void P(final ayf ayf, final bdy bdy) {
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new vo(this, ayf, bdy, 7, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void Q(final Object o) {
        if (this.b != null) {
            ((Handler)this.b).post((Runnable)new hbw(this, o, SystemClock.elapsedRealtime(), 1, (byte[])null, (byte[])null, (byte[])null));
        }
    }
    
    public final void R(final Exception ex) {
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new bhc(this, ex, 13, null, null, null));
        }
    }
    
    public final void S(final azr azr) {
        final Object b = this.b;
        if (b != null) {
            ((Handler)b).post((Runnable)new bhc(this, azr, 16, null, null, null));
        }
    }
    
    public final avt U(final cqv cqv) {
        synchronized (this.a) {
            return ((Map<K, avt>)this.b).remove(cqv);
        }
    }
    
    public final avt V(final cqv cqv) {
        synchronized (this.a) {
            final Object b = this.b;
            avt value;
            if ((value = ((Map<cqv, avt>)b).get(cqv)) == null) {
                value = new avt(cqv);
                ((Map<cqv, avt>)b).put(cqv, value);
            }
            return value;
        }
    }
    
    public final void a(final Bitmap bitmap) {
        ((dgf)this.a).d(bitmap);
    }
    
    public final void b(final byte[] array) {
        final Object b = this.b;
        if (b == null) {
            return;
        }
        ((dgd)b).c((Object)array);
    }
    
    public final byte[] c(final int n) {
        final Object b = this.b;
        if (b == null) {
            return new byte[n];
        }
        return (byte[])((dgd)b).a(n, (Class)byte[].class);
    }
    
    public final List f(final Class clazz) {
        synchronized (this) {
            return ((din)this.a).c(clazz);
        }
    }
    
    public final List g(final Class clazz) {
        synchronized (this) {
            final cya cya = ((Map<K, cya>)((cya)this.b).a).get(clazz);
            Object a;
            if (cya == null) {
                a = null;
            }
            else {
                a = cya.a;
            }
            if (a != null) {
                return (List)a;
            }
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)((din)this.a).b(clazz));
            if (((Map<Class, cya>)((cya)this.b).a).put(clazz, new cya((List)unmodifiableList)) == null) {
                return unmodifiableList;
            }
            throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(clazz))));
        }
    }
    
    public final void h(final Class clazz, final Class clazz2, final dij dij) {
        synchronized (this) {
            ((din)this.a).f(clazz, clazz2, dij);
            ((cya)this.b).f();
        }
    }
    
    public final void i(final Class clazz, final Class clazz2, final dij dij) {
        synchronized (this) {
            ((din)this.a).g(clazz, clazz2, dij);
            ((cya)this.b).f();
        }
    }
    
    public final void j(final Class clazz, final Class clazz2, final dij dij) {
        monitorenter(this);
        try {
            final Iterator iterator = ((din)this.a).e(clazz, clazz2, dij).iterator();
            while (iterator.hasNext()) {
                ((dij)iterator.next()).c();
            }
            ((cya)this.b).f();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final String k(final ddj ddj) {
        Object o = this.a;
        monitorenter(o);
        try {
            final String s = (String)((dpc)this.a).f(ddj);
            monitorexit(o);
            o = s;
            if (s == null) {
                final dhe dhe = (dhe)((akq)this.b).a();
                cll.h((Object)dhe);
                try {
                    ddj.a(dhe.a);
                    o = dhe.a.digest();
                    synchronized (dpg.b) {
                        final char[] b = dpg.b;
                        for (int i = 0; i < o.length; ++i) {
                            final int n = o[i] & 0xFF;
                            final int n2 = i + i;
                            final char[] a = dpg.a;
                            b[n2] = a[n >>> 4];
                            b[n2 + 1] = a[n & 0xF];
                        }
                        o = new String(b);
                    }
                }
                finally {
                    ((akq)this.b).b((Object)dhe);
                }
            }
            synchronized (this.a) {
                ((dpc)this.a).g(ddj, o);
                return (String)o;
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void l(final String s) {
        synchronized (this) {
            final arcq arcq = ((Map<K, arcq>)this.a).get(s);
            cll.h((Object)arcq);
            int b = arcq.b;
            if (b > 0) {
                --b;
                Label_0212: {
                    if ((arcq.b = b) == 0) {
                        final arcq arcq2 = ((Map<K, arcq>)this.a).remove(s);
                        if (arcq2.equals(arcq)) {
                            final Object b2 = this.b;
                            synchronized (((cxz)b2).a) {
                                if (((Collection)((cxz)b2).a).size() < 10) {
                                    ((Queue<arcq>)((cxz)b2).a).offer(arcq2);
                                }
                                break Label_0212;
                            }
                        }
                        final String string = arcq.toString();
                        final String value = String.valueOf(arcq2);
                        final StringBuilder sb = new StringBuilder("Removed the wrong lock, expected to remove: ");
                        sb.append(string);
                        sb.append(", but actually removed: ");
                        sb.append(value);
                        sb.append(", safeKey: ");
                        sb.append(s);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                monitorexit(this);
                ((Lock)arcq.a).unlock();
                return;
            }
            final StringBuilder sb2 = new StringBuilder("Cannot release a lock that is not held, safeKey: ");
            sb2.append(s);
            sb2.append(", interestedThreads: ");
            sb2.append(b);
            throw new IllegalStateException(sb2.toString());
        }
    }
    
    public final dag m() {
        return ((czw)this.a).b;
    }
    
    public final dah n() {
        return ((czw)this.a).a;
    }
    
    public final List o(final String s) {
        s.getClass();
        final Object a = this.a;
        monitorenter(a);
        try {
            final Object b = this.b;
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (final Map.Entry<cqv, V> entry : ((Map)b).entrySet()) {
                if (atnh.c(entry.getKey().a, s)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            final Iterator iterator2 = linkedHashMap.keySet().iterator();
            while (iterator2.hasNext()) {
                ((Map<Object, Object>)this.b).remove(iterator2.next());
            }
            final List i = aqzg.I((Iterable)linkedHashMap.values());
            monitorexit(a);
            return i;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final boolean p(final cqv cqv) {
        synchronized (this.a) {
            return ((Map)this.b).containsKey(cqv);
        }
    }
}
