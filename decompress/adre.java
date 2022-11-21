import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import j$.time.Duration;
import android.os.Bundle;
import java.util.concurrent.ScheduledFuture;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adre
{
    public final Context a;
    public final Object b;
    public final Executor c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final adgg n;
    
    public adre(final Context a, final admj b, final adms d, final adnd e, final ScheduledExecutorService c, final adgg n, final tdu f, final adgg g, final adqd h, final byte[] array, final byte[] array2, final byte[] array3) {
        this.i = new CopyOnWriteArrayList();
        this.j = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.k = Collections.synchronizedSet(new HashSet<Object>());
        this.l = new HashMap();
        this.m = new HashMap();
        this.a = a;
        this.b = b;
        this.c = c;
        this.n = n;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public adre(final Context a, final oco f, final Executor c, final admb b, final admj d, final adnk j, final adgg n, final adnd g, final adnc h, final adms e, final arna i, final adgg l, final adme k, final adgg m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.f = f;
        this.c = c;
        this.b = b;
        this.d = d;
        this.j = j;
        this.n = n;
        this.g = g;
        this.h = h;
        this.e = e;
        this.i = i;
        this.l = l;
        this.k = k;
        this.m = m;
    }
    
    public static List k(final Context context) {
        final ArrayList list = new ArrayList();
        if (!acwc.h(context, 0)) {
            list.add(apkd.e);
        }
        return list;
    }
    
    public static void n(final ahcr ahcr) {
        ahcr.copyOnWrite();
        final adoj adoj = (adoj)ahcr.instance;
        final adoj a = adoj.a;
        adoj.c |= 0x40000;
        adoj.Z = false;
    }
    
    private static void o(final List list) {
        if (list.isEmpty()) {
            return;
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final adrc adrc = (adrc)iterator.next();
            adrc.b.d(adrc);
            iterator.remove();
        }
    }
    
    private final void p(final String s, final int n) {
        try {
            if (((admj)this.b).b(s) == null) {
                this.n.C("Unknown Upload job while updating UI for requirements.");
                return;
            }
            if (n != 1 && n != 3) {
                return;
            }
            final ahcr builder = adog.a.createBuilder();
            builder.copyOnWrite();
            final adog adog = (adog)builder.instance;
            adog.c = 0;
            adog.b |= 0x1;
            apkh apkh;
            if (n == 3) {
                apkh = apkh.h;
            }
            else {
                apkh = apkh.i;
            }
            builder.copyOnWrite();
            final adog adog2 = (adog)builder.instance;
            adog2.d = apkh.aD;
            adog2.b |= 0x2;
            ((adms)this.d).g(s, (adog)builder.build());
        }
        catch (final admk admk) {
            this.n.D("Can't update UI.", (Throwable)admk);
        }
    }
    
    public final void a(final adrd adrd) {
        ((CopyOnWriteArrayList)this.i).addIfAbsent(adrd);
    }
    
    public final void b(final String s, final boolean b) {
        synchronized (this) {
            final ScheduledFuture scheduledFuture = ((Map<K, ScheduledFuture>)this.l).remove(s);
            if (scheduledFuture != null && b) {
                scheduledFuture.cancel(false);
            }
            final List list = ((Map<K, List>)this.m).remove(s);
            if (list != null) {
                o(list);
            }
        }
    }
    
    public final void c(String s, final adro adro, String s2) {
        monitorenter(this);
        try {
            final int g = this.g(s, s2);
            final int n = 1;
            if (g != 1 && g != 2) {
                Label_0919: {
                    if (adro != null) {
                        if (!adro.a()) {
                            if (!adro.a()) {
                                final String a = adro.a;
                                try {
                                    final adoj b = ((admj)this.b).b(a);
                                    if (b == null) {
                                        tut.c("UploadFlowController", "Corresponding job not found.");
                                        this.n.C("Corresponding job not found.");
                                        break Label_0919;
                                    }
                                    final boolean z = b.Z;
                                    int n2 = 0;
                                    if (z) {
                                        final afhk b2 = adro.b;
                                        List q;
                                        if (b2.isEmpty()) {
                                            q = afgh.q();
                                        }
                                        else {
                                            q = new ArrayList(b2.size());
                                        }
                                        if (!b2.isEmpty()) {
                                            final Iterator<Object> iterator = b2.iterator();
                                            while (iterator.hasNext()) {
                                                final adnr g2 = iterator.next().g();
                                                if (g2.b) {
                                                    q.clear();
                                                    this.c.execute(new adra(this, a, 0));
                                                    break Label_0919;
                                                }
                                                q.add(g2.c);
                                            }
                                        }
                                        final Iterator iterator2 = q.iterator();
                                        while (true) {
                                            final boolean hasNext = iterator2.hasNext();
                                            long a2 = 0L;
                                            if (!hasNext) {
                                                break;
                                            }
                                            final int intValue = (int)iterator2.next();
                                            this.p(a, intValue);
                                            yrd b3 = null;
                                            yrd yrd = null;
                                            int n3 = 0;
                                            Label_0366: {
                                                if (intValue != 1) {
                                                    if (intValue != 2) {
                                                        if (intValue == 3) {
                                                            s = "yt_upload_wifi_req";
                                                            a2 = 0L;
                                                            yrd = null;
                                                            n3 = 2;
                                                            break Label_0366;
                                                        }
                                                        s2 = "yt_upload_network_req";
                                                    }
                                                    else {
                                                        a2 = admd.a;
                                                        b3 = admd.b;
                                                        s2 = "yt_upload_storage_req";
                                                    }
                                                    final yrd yrd2 = b3;
                                                    n3 = 0;
                                                    s = s2;
                                                    yrd = yrd2;
                                                }
                                                else {
                                                    s = "yt_upload_network_req";
                                                    a2 = 0L;
                                                    yrd = null;
                                                    n3 = 1;
                                                }
                                            }
                                            if (((tdu)this.f).d(s, a2, false, n3, false, (Bundle)null, yrd, false)) {
                                                continue;
                                            }
                                            tut.c("UploadFlowController", "Cannot schedule background task requiring a constraint.");
                                            this.n.C("Cannot schedule background task requiring a constraint.");
                                        }
                                        final afbh c = adro.c;
                                        if (c.h()) {
                                            final Duration duration = (Duration)c.c();
                                            if (duration.getSeconds() <= 0L) {
                                                tut.c("UploadFlowController", "Cannot schedule background task with invalid duration.");
                                                this.n.C("Cannot schedule background task with invalid duration.");
                                            }
                                            else if (!((tdu)this.f).d("yt_upload_long_retry", duration.getSeconds(), false, 0, false, (Bundle)null, (yrd)null, true)) {
                                                tut.c("UploadFlowController", "Cannot schedule background task for later.");
                                                this.n.C("Cannot schedule background task for later.");
                                            }
                                        }
                                        final Iterator iterator3 = ((CopyOnWriteArrayList)this.i).iterator();
                                        while (iterator3.hasNext()) {
                                            ((adrd)iterator3.next()).s(a);
                                        }
                                        break Label_0919;
                                    }
                                    final afhk b4 = adro.b;
                                    Label_0733: {
                                        if (!b4.isEmpty()) {
                                            final ArrayList list = new ArrayList(b4.size());
                                            while (true) {
                                                for (final adnq adnq : b4) {
                                                    final adrc adrc = new adrc(this, a, adnq);
                                                    adnq.b(adrc);
                                                    final adnr g3 = adnq.g();
                                                    if (!g3.b) {
                                                        this.p(a, g3.c);
                                                        list.add((Object)adrc);
                                                    }
                                                    else {
                                                        adnq.d(adrc);
                                                        o(list);
                                                        n2 = n;
                                                        if (n2 != 0) {
                                                            this.c.execute(new adat(this, a, 19));
                                                            break Label_0733;
                                                        }
                                                        ((Map<String, ArrayList>)this.m).put(a, list);
                                                        break Label_0733;
                                                    }
                                                }
                                                n2 = 0;
                                                continue;
                                            }
                                        }
                                    }
                                    final afbh c2 = adro.c;
                                    if (c2.h()) {
                                        if (n2 != 0) {
                                            break Label_0919;
                                        }
                                        ((Map<String, ScheduledFuture<?>>)this.l).put(a, ((ScheduledExecutorService)this.c).schedule((Runnable)new adat(this, a, 20), ((Duration)c2.c()).toMillis(), TimeUnit.MILLISECONDS));
                                    }
                                    else if (n2 != 0) {
                                        break Label_0919;
                                    }
                                    final Iterator iterator5 = ((CopyOnWriteArrayList)this.i).iterator();
                                    while (iterator5.hasNext()) {
                                        ((adrd)iterator5.next()).t();
                                    }
                                    break Label_0919;
                                }
                                catch (final admk admk) {
                                    tut.d("UploadFlowController", (Throwable)admk);
                                    this.n.D("Cannot find job for retry.", (Throwable)admk);
                                    break Label_0919;
                                }
                            }
                            throw new IllegalStateException("Cannot reschedule an already completed UploadFlow.");
                        }
                        final Iterator iterator6 = ((CopyOnWriteArrayList)this.i).iterator();
                        while (iterator6.hasNext()) {
                            ((adrd)iterator6.next()).r(s);
                        }
                    }
                }
                if (((Map)this.j).isEmpty() && ((Map)this.m).isEmpty() && ((Map)this.l).isEmpty()) {
                    try {
                        if (((admj)this.b).d(aafv.q).isEmpty()) {
                            ((tdu)this.f).b("yt_upload_storage_req");
                            monitorexit(this);
                            return;
                        }
                    }
                    catch (final admk admk2) {
                        tut.f("UploadFlowController", "Cannot fetch uploads requiring storage.", (Throwable)admk2);
                        this.n.D("Cannot fetch uploads requiring storage.", (Throwable)admk2);
                        monitorexit(this);
                        return;
                    }
                }
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean d(final String b) {
        synchronized (this) {
            try {
                if (((Map)this.j).containsKey(b)) {
                    goto Label_0372;
                }
                final adoj b2 = ((admj)this.b).b(b);
                if (b2 == null) {
                    throw new admk("Job not found ".concat(String.valueOf(b)));
                }
                if (!((Map)this.j).containsKey(b)) {
                    final Context a = this.a;
                    adoh c;
                    if ((c = adoh.a(b2.l)) == null) {
                        c = adoh.a;
                    }
                    final cce zb = ((adqt)tqf.J(a, (Class)adqt.class)).zB();
                    b.getClass();
                    zb.b = b;
                    c.getClass();
                    zb.c = c;
                    arxu.o(zb.b, String.class);
                    arxu.o(zb.c, adoh.class);
                    final adrp a2 = ((adqz)new eqm((era)zb.a, (String)zb.b, (adoh)zb.c).C.a()).a(b2);
                    final String string = UUID.randomUUID().toString();
                    ((Map<String, agpw>)this.j).put(b, new agpw(a2, string));
                    afxr.v((ListenableFuture)a2, new adrb(this, b, string, 0), this.c);
                    final Iterator iterator = ((CopyOnWriteArrayList)this.i).iterator();
                    while (iterator.hasNext()) {
                        ((adrd)iterator.next()).q(b, b2);
                    }
                    ((adqd)this.h).a(new adne(null, b2));
                    return true;
                }
                throw new IllegalStateException("UploadFlow Future already exists for ".concat(String.valueOf(b)));
            }
            catch (final Exception ex) {
                goto Label_0372;
            }
        }
    }
    
    public final boolean e(final String s) {
        synchronized (this) {
            return ((Map)this.j).containsKey(s);
        }
    }
    
    public final boolean f(final String s) {
        synchronized (this) {
            return ((Map)this.l).containsKey(s) || ((Map)this.m).containsKey(s);
        }
    }
    
    public final int g(final String s, final String s2) {
        synchronized (this) {
            if (((Set)this.k).remove(s2) || !((Map)this.j).containsKey(s)) {
                return 2;
            }
            final agpw agpw = ((Map<K, agpw>)this.j).remove(s);
            if (agpw != null) {
                if (agpw.b == 1) {
                    this.c.execute(new adra(this, s, 2));
                }
                return agpw.b;
            }
            return 3;
        }
    }
    
    public final void h(final String s) {
        monitorenter(this);
        Object b = null;
        Label_0069: {
            try {
                try {
                    b = ((admj)this.b).b(s);
                    if (b == null || !((adoj)b).ai) {}
                    if (((adoj)b).aj) {
                        b = new adml(1);
                        break Label_0069;
                    }
                    b = new adml(0);
                    break Label_0069;
                }
                finally {}
            }
            catch (final admk admk) {
                tut.d("UploadFlowController", (Throwable)admk);
            }
            b = null;
        }
        if (b != null) {
            ((admj)this.b).a(s, (admm)b);
            monitorexit(this);
            return;
        }
        this.b(s, true);
        final agpw agpw = ((Map<K, agpw>)this.j).get(s);
        if (agpw != null) {
            agpw.b = 1;
            ((adrp)agpw.a).cancel(true);
        }
        final adne a = ((admj)this.b).a(s, (admm)new admg((adgg)this.g, (adnd)this.e, null, null));
        if (agpw == null) {
            this.c.execute(new adra(this, s, 1));
        }
        ((adqd)this.h).a(a);
        monitorexit(this);
        return;
        monitorexit(this);
    }
    
    public final void i(String c, final boolean b) {
        synchronized (this) {
            if (this.e(c) || this.f(c)) {
                this.b(c, true);
                final agpw agpw = ((Map<K, agpw>)this.j).remove(c);
                if (agpw != null) {
                    agpw.b = 2;
                    if (b) {
                        ((Set<Object>)this.k).add(agpw.c);
                    }
                    final Object a = agpw.a;
                    c = (String)((adrp)a).c;
                    synchronized (c) {
                        ((adrf)c).a = true;
                        monitorexit(c);
                        ((adrp)a).b.cancel(true);
                    }
                }
            }
        }
    }
    
    public final ListenableFuture j(final znz znz) {
        if (znz.z()) {
            tut.c("UploadEngine", "Signed-out identities cannot have pending uploads associated.\nCalling this method without a valid identity is wrong.");
            return afxr.l(afgh.q());
        }
        final ListenableFuture q = afxr.q((afvp)new adfs(this, znz, 9, (byte[])null), this.c);
        afxr.v(q, (afwr)new nqg(this, 18, (byte[])null), this.c);
        return q;
    }
    
    public final void l(final admt admt) {
        ((adms)this.e).p(admt);
    }
    
    public final void m(final admt admt) {
        ((adms)this.e).q(admt);
    }
}
