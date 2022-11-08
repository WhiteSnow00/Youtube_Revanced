import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.FilenameFilter;
import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.Serializable;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.apps.tiktok.account.AccountId;
import java.util.concurrent.Executor;
import java.util.Set;
import java.lang.reflect.Field;
import com.google.mediapipe.framework.Packet;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.content.Intent;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahbd
{
    public final Object a;
    public final Object b;
    
    public ahbd() {
        this(new auip((byte[])null), new long[10], null, null);
    }
    
    public ahbd(final aeim a, final aeip b) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final aelt b, final oas a) {
        this.b = b;
        this.a = a;
    }
    
    public ahbd(final aeru a, final byte[] array) {
        this.b = null;
        this.a = a;
    }
    
    public ahbd(final aftr a, final agjt b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final aftr a, final auip b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final ageq b, final Class a) {
        this.b = b;
        this.a = a;
    }
    
    public ahbd(final agjt a, final ahbd b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final ahbd a, final aeig b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final ahbd ahbd, final byte[] array) {
        this.b = new auip((auip)ahbd.b, (byte[])null, (byte[])null);
        this.a = Arrays.copyOf((long[])ahbd.a, 10);
    }
    
    public ahbd(final Intent a) {
        this.b = new nmo();
        this.a = a;
    }
    
    public ahbd(final SharedPreferences b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public ahbd(final aquo b) {
        this.b = b;
        this.a = null;
    }
    
    public ahbd(final aseo b, final aexq aexq, final aeoe a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        if (aexq.h()) {
            agot.D(aexq.c() instanceof qt);
        }
        this.a = a;
    }
    
    public ahbd(final atjj b, final agjt a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public ahbd(final auip a, final atjj b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final auip b, final long[] a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public ahbd(final Packet a, final Long b) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final Class b, final Class a) {
        this.b = b;
        this.a = a;
    }
    
    public ahbd(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final Field a, final Field b) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final Set a) {
        this.a = a;
        this.b = new boolean[256];
        for (int i = 0; i < 256; ++i) {
            ((boolean[])this.b)[i] = ((Set)this.a).contains(i);
        }
    }
    
    public ahbd(final Set a, final hgm b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public ahbd(final Executor b) {
        this.a = new abg();
        this.b = b;
    }
    
    public static ahbd c(final Object o, final Object o2) {
        return new ahbd(o, o2);
    }
    
    public static ahbd i(final Class clazz, final Class clazz2) {
        return new ahbd(clazz, clazz2);
    }
    
    public static ahbd j(final ageq ageq, final Class clazz) {
        return new ahbd(ageq, clazz);
    }
    
    public static ahbd k(final Class clazz, final Class clazz2) {
        return new ahbd(clazz, clazz2);
    }
    
    public static String r(final int n, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(".");
        sb.append(s);
        return sb.toString();
    }
    
    public static String s(final AccountId accountId, final String s) {
        return r(accountId.a(), s);
    }
    
    public final boolean a() {
        return this.a != null;
    }
    
    public final boolean b() {
        return this.b != null;
    }
    
    public final nly d() {
        return (nly)((nmo)this.b).a;
    }
    
    public final void e() {
        ((nmo)this.b).e((Object)null);
    }
    
    public final nly f(final String s, final arvv arvv) {
        synchronized (this) {
            final nly nly = ((Map<K, nly>)this.a).get(s);
            if (nly != null) {
                return nly;
            }
            final Object c = arvv.c;
            final Object a = arvv.a;
            final Object b = arvv.b;
            final agkm e = ((FirebaseMessaging)c).e;
            final nly b2 = agkm.b(e.a(agkp.e(e.a), "*", new Bundle())).d(((FirebaseMessaging)c).f, (nlx)new agki((FirebaseMessaging)c, (String)a, (agks)b, 0)).b((Executor)this.b, (nln)new agjb(this, s, 3, (byte[])null, (byte[])null));
            ((Map<String, nly>)this.a).put(s, b2);
            return b2;
        }
    }
    
    public final aenc g(final AccountId accountId) {
        final alm alm = new alm((avu)this.a, (avq)new aenb(this, accountId, null, null, null, null));
        Serializable value;
        if (accountId == null) {
            value = "null";
        }
        else {
            value = accountId.a();
        }
        return (aenc)alm.i("tt_activity_account_retained:".concat(value.toString()), (Class)aenc.class);
    }
    
    public final Object h(final AccountId accountId) {
        final aenc g = this.g(accountId);
        synchronized (g.c) {
            if (g.d == null) {
                final fzo v = ((aemz)aqqm.k(g.e.g(g.b), (Class)aemz.class)).v();
                final avh a = g.a;
                g.d = new esl((eqv)v.a, (esr)v.b);
            }
            return g.d;
        }
    }
    
    public final ListenableFuture l(final File file) {
        return ((aftr)this.a).rt(aesm.i((Callable)new adbx(file, 10)));
    }
    
    public final afcr m(final afdu afdu, final afdu afdu2, final boolean b) {
        final boolean b2 = true;
        boolean b3 = false;
        Label_0033: {
            if (afdu == null) {
                b3 = b2;
                if (afdu2 != null) {
                    break Label_0033;
                }
            }
            b3 = (afdu != null && afdu2 == null && b2);
        }
        agot.u(b3);
        final afcm d = afcr.d();
        final afie k = ((agjt)this.a).g().k();
        while (((Iterator)k).hasNext()) {
            final File[] listFiles = new File((File)((Iterator)k).next(), "accounts").listFiles((FilenameFilter)new aejf(afdu2, afdu, b));
            if (listFiles != null) {
                d.i((Object[])listFiles);
            }
        }
        return d.g();
    }
    
    public final afcr n(final boolean b) {
        return this.m(null, (afdu)afgq.a, b);
    }
    
    public final ListenableFuture o(final afcr afcr) {
        final ArrayList list = new ArrayList();
        for (int c = ((afgh)afcr).c, i = 0; i < c; ++i) {
            list.add(((ahbd)this.b).l((File)((List<Object>)afcr).get(i)));
        }
        return afva.D((Iterable)list).j((Callable)new adbx((List)list, 9), (Executor)afsl.a);
    }
    
    public final int p() {
        return ((SharedPreferences)this.b).getInt("count", 0);
    }
    
    public final String q(final AccountId accountId, final String s) {
        return ((SharedPreferences)this.b).getString(s(accountId, s), (String)null);
    }
    
    public final boolean t(final AccountId accountId, final String s) {
        return ((SharedPreferences)this.b).getBoolean(s(accountId, s), false);
    }
    
    public final ListenableFuture u(final AccountId accountId) {
        final aeit aeit = (aeit)this.b;
        return afrp.f(aeit.h.b(), aesm.d((afry)new xpu(aeit, accountId, 16)), (Executor)afsl.a);
    }
    
    public final ListenableFuture v(final String s, final String s2) {
        final aeim aeim = (aeim)this.a;
        return afrp.e(((aagm)aeim.b).b(), (aexg)new abiy(s, s2, 7), (Executor)aeim.a);
    }
    
    public final ListenableFuture w(final AccountId accountId) {
        return afrp.e(((aagm)((aeim)this.a).b).b(), (aexg)new abnf(accountId, 19), (Executor)afsl.a);
    }
    
    public final ListenableFuture x() {
        final aeim aeim = (aeim)this.a;
        return afrp.e(((aagm)aeim.b).b(), (aexg)acrp.t, (Executor)aeim.a);
    }
    
    public final aagm y(final aeom aeom, final eg eg) {
        agot.E(true, (Object)"LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        aftr f;
        if ((f = aeom.f) == null) {
            f = (aftr)((atjj)this.b).a();
        }
        final aagm u = qaw.u(aeom.a, f.rt(aesm.i((Callable)new aejg(this, aeom, 5, (byte[])null, (byte[])null, (byte[])null))), aeom.b, (Executor)f, aeom.e, eg);
        if (!aeom.d.isEmpty()) {
            u.d((afry)qop.b((List)aeom.d, (Executor)f));
        }
        return u;
    }
}
