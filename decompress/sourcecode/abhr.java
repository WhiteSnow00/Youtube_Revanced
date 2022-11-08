import java.util.Set;
import java.util.Deque;
import android.os.Looper;
import java.io.IOException;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
import android.service.notification.StatusBarNotification;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Map;
import java.util.Locale;
import android.app.Notification;
import android.app.NotificationManager;
import java.lang.ref.WeakReference;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abhr
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    
    public abhr(final afts b, final ScheduledExecutorService a, final ScheduledExecutorService g, final ScheduledExecutorService f, final ylz j, final xun e, final Context c, final yzf h, final xxa i, final afts d, final yzu k, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.g = g;
        this.f = f;
        this.j = j;
        this.e = e;
        this.c = c;
        this.h = h;
        this.i = i;
        this.d = d;
        this.k = k;
    }
    
    public abhr(final Context c, final aexq a, final zqx b, final adcr h, final zhb k, final Executor g, final aexq d, final atjj f, final arud e, final wwv i, final zpf j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.h = h;
        this.k = k;
        this.g = g;
        this.d = d;
        this.f = f;
        this.e = e;
        this.i = i;
        this.j = j;
    }
    
    public abhr(final Context h, final pgg b, final phf f, final phh a, final pig i, final pex d, final eg j, final aexq c, final peu e, final Executor g, final pdm k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.h = h;
        this.b = b;
        this.f = f;
        this.a = a;
        this.i = i;
        this.d = d;
        this.j = j;
        this.c = c;
        this.e = e;
        this.g = g;
        this.k = k;
    }
    
    public abhr(final Context h, final tdg k, final Executor g, final Executor c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.j = new ArrayList();
        this.i = new HashMap();
        this.a = atix.e();
        this.b = atix.e();
        this.f = atix.e();
        this.e = atix.e();
        this.d = atix.e();
        this.h = h;
        this.k = k;
        this.c = c;
        this.g = g;
    }
    
    public abhr(final asho asho) {
        final atid ad = atid.aD();
        this.a = ad;
        final atid ad2 = atid.aD();
        this.b = ad2;
        final atid ad3 = atid.aD();
        this.c = ad3;
        final atid ad4 = atid.aD();
        this.d = ad4;
        final atid ad5 = atid.aD();
        this.e = ad5;
        this.f = ((asgt)ad2).R().P(asho).V();
        this.g = ad;
        this.h = ad2;
        this.i = ad3;
        this.j = ad4;
        this.k = ad5;
    }
    
    public abhr(final atjj c, final atjj k, final atjj h, final atjj i, final atjj f, final atjj a, final atjj e, final atjj b, final atjj d, final atjj g, final atjj j) {
        c.getClass();
        this.c = c;
        k.getClass();
        this.k = k;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        g.getClass();
        this.g = g;
        j.getClass();
        this.j = j;
    }
    
    public abhr(final atjj c, final atjj j, final atjj i, final atjj e, final atjj f, final atjj b, final atjj d, final atjj g, final atjj a, final atjj h, final atjj k, final byte[] array) {
        c.getClass();
        this.c = c;
        this.j = j;
        i.getClass();
        this.i = i;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        g.getClass();
        this.g = g;
        a.getClass();
        this.a = a;
        h.getClass();
        this.h = h;
        k.getClass();
        this.k = k;
    }
    
    public abhr(final atjj h, final atjj f, final atjj a, final atjj c, final atjj i, final atjj j, final atjj k, final atjj b, final atjj d, final atjj g, final atjj e, final byte[] array, final byte[] array2) {
        h.getClass();
        this.h = h;
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
        k.getClass();
        this.k = k;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        this.g = g;
        e.getClass();
        this.e = e;
    }
    
    public abhr(final atjj e, final atjj c, final atjj g, final atjj h, final atjj a, final atjj f, final atjj k, final atjj j, final atjj b, final atjj d, final atjj i, final char[] array) {
        e.getClass();
        this.e = e;
        c.getClass();
        this.c = c;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        a.getClass();
        this.a = a;
        f.getClass();
        this.f = f;
        k.getClass();
        this.k = k;
        j.getClass();
        this.j = j;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        i.getClass();
        this.i = i;
    }
    
    public abhr(final wvu j, final tny d, final mck k, final atjj i, final wwv b, final bu c, final svm h, final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint g, final swp e, final aeby f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.j = j;
        this.d = d;
        this.k = k;
        this.i = i;
        this.b = b;
        this.c = c;
        this.h = h;
        this.g = g;
        this.e = e;
        this.f = f;
        final boolean h2 = g.c.H();
        Object e2 = null;
        if (!h2) {
            final tgu tgu = new tgu((byte[])null);
            tgu.b = g.c;
            tgu.a = 3;
            e2 = tgu.e();
        }
        this.a = e2;
    }
    
    private static MessageLite B(final ahbe ahbe, final byte[] array) {
        try {
            return (MessageLite)ahbe.l(array, ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahab ahab) {
            return null;
        }
    }
    
    private final void C(final List list) {
        if (list != null) {
            ((Executor)this.g).execute(aesm.h((Runnable)new yqb(this, list, 18, (byte[])null)));
        }
    }
    
    private static boolean D(final Class clazz, final String s) {
        return clazz.getName().equals(s);
    }
    
    private final afcr E(final List list) {
        final afcm d = afcr.d();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            d.h((Object)this.j(((List)this.j).size(), (spq)iterator.next()));
        }
        return d.g();
    }
    
    private static List F(final List list) {
        final HashSet set = new HashSet();
        final ArrayList list2 = new ArrayList();
        for (final spq spq : list) {
            if (set.add(spq.a)) {
                list2.add(spq);
            }
            else {
                trn.b(String.valueOf(String.valueOf(spq.a)).concat(" already exists"));
            }
        }
        return list2;
    }
    
    private final List G(final List list) {
        final ArrayList list2 = new ArrayList();
    Label_0015:
        for (final spq spq : list) {
            final Uri g = spq.g;
            while (true) {
                for (final spq spq2 : ((HashMap)this.i).values()) {
                    if (spq2.g.equals((Object)g) && spq2.a()) {
                        final Object o = aexq.k(spq2);
                        spq c;
                        if (((aexq)o).h()) {
                            c = (spq)((aexq)o).c();
                        }
                        else if (!((HashMap)this.i).containsKey(spq.a)) {
                            c = spq;
                        }
                        else {
                            final spq spq3 = ((HashMap<K, spq>)this.i).get(spq.a);
                            final viv d = spq.d();
                            if (spq.d == null) {
                                final akbt d2 = spq3.d;
                                if (d2 != null) {
                                    d.d = d2;
                                }
                            }
                            if (spq.c == null) {
                                final Drawable c2 = spq3.c;
                                if (c2 != null) {
                                    d.f = c2;
                                }
                            }
                            if (spq.f == null) {
                                final String f = spq3.f;
                                if (f != null) {
                                    d.a = f;
                                }
                            }
                            if (spq.e == 0) {
                                final int e = spq3.e;
                                if (e != 0) {
                                    d.e(e);
                                }
                            }
                            c = d.c();
                        }
                        list2.add(c);
                        continue Label_0015;
                    }
                }
                final Object o = aewp.a;
                continue;
            }
        }
        return list2;
    }
    
    public static final bgs e(final bac bac) {
        return new bgs(bac);
    }
    
    public static final yxi f(final ypi ypi, final PlayerConfigModel playerConfigModel, final VideoStreamingData videoStreamingData) {
        yxi a;
        if (videoStreamingData.u()) {
            a = new yxi(playerConfigModel, videoStreamingData, (Runnable)new yoq(ypi, 6), ypi.l);
        }
        else {
            a = yxi.a;
        }
        return a;
    }
    
    public static final bbj g(final ypi ypi, final yjy yjy, final yul yul, final ArrayList list) {
        return (bbj)new ypj(ypi.f, yul.u, yjy, yul, list);
    }
    
    public static final yqm h(final ypi ypi, final ynt ynt) {
        return (yqm)new ypk(ypi, ynt);
    }
    
    public final acvj A(final ypp ypp) {
        return new acvj(this, ypp, (byte[])null, (byte[])null);
    }
    
    public final asgt a() {
        return ((asgt)this.d).p().Q();
    }
    
    public final asgt b() {
        return ((asgt)this.b).R();
    }
    
    public final void c(byte[] array, String o) {
        final boolean d = D(ahrv.class, (String)o);
        final alhk alhk = null;
        Label_1589: {
            if (d) {
                final ahrv ahrv = (ahrv)B(((agzi)ahrv.a).getParserForType(), array);
                ((zpf)this.j).a(ampf.o, ahrv);
                final int n = 0;
                final boolean b = ahrv != null && ahrv.m.size() != 0;
                if (b) {
                    this.C(ahrv.m);
                    ((zpf)this.j).a(ampf.d, ahrv);
                }
                if (!xkm.aa(ahrv) && !xkm.ab(ahrv, (acng)((aexw)this.a).a)) {
                    if (b) {
                        return;
                    }
                    ((zpf)this.j).a(ampf.n, ahrv);
                    return;
                }
                else {
                    ((zpf)this.j).a(ampf.h, ahrv);
                    final Object i = this.i;
                    if (i != null && (ahrv.b & 0x10000) != 0x0) {
                        ((wwv)i).b(wya.b(28631), (aioe)null, (alff)null);
                        alts alts;
                        if ((alts = ahrv.u) == null) {
                            alts = alts.b;
                        }
                        ((wwv)this.i).D((wxz)new wws(alts.d));
                    }
                    final Object h = this.h;
                    final Object k = this.k;
                    final Object j = this.i;
                    final Iterator<Object> iterator = ((Deque<Object>)((adcr)h).a).iterator();
                    while (true) {
                        while (true) {
                            while (iterator.hasNext()) {
                                final zpp zpp = iterator.next().get();
                                if (zpp == null) {
                                    iterator.remove();
                                }
                                else {
                                    if (!zpp.a(ahrv)) {
                                        continue;
                                    }
                                    o = null;
                                    if (o != null) {
                                        final Object l = this.i;
                                        final Object m = this.j;
                                        if ((ahrv.b & 0x8000) != 0x0) {
                                            if ((array = (byte[])(Object)ahrv.t) == null) {
                                                array = (byte[])(Object)ampg.a;
                                            }
                                        }
                                        else {
                                            array = null;
                                        }
                                        final Object a = ((auip)o).a;
                                        final NotificationManager notificationManager = (NotificationManager)((Context)((auip)o).b).getSystemService("notification");
                                        Label_1074: {
                                            try {
                                                while (true) {
                                                    for (final StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                                                        if (((zqd)((aaal)a).c).a.equals(statusBarNotification.getTag()) && ((zqd)((aaal)a).c).b == statusBarNotification.getId()) {
                                                            final boolean b2 = true;
                                                            final Object c = ((aaal)a).c;
                                                            notificationManager.notify(((zqd)c).a, ((zqd)c).b, (Notification)((aaal)a).b);
                                                            if (b2) {
                                                                final Locale us = Locale.US;
                                                                final Object c2 = ((aaal)a).c;
                                                                String.format(us, "Replaced notification with %s:%s", ((zqd)c2).a, ((zqd)c2).b);
                                                                zpg.f((atjj)((aaal)a).d, "REPLACED", (arud)((aaal)a).a);
                                                            }
                                                            else {
                                                                final Locale us2 = Locale.US;
                                                                final Object c3 = ((aaal)a).c;
                                                                String.format(us2, "New notification with %s:%s", ((zqd)c3).a, ((zqd)c3).b);
                                                            }
                                                            zpg.f((atjj)((aaal)a).d, "POSTED", (arud)((aaal)a).a);
                                                            break Label_1074;
                                                        }
                                                    }
                                                    final boolean b2 = false;
                                                    continue;
                                                }
                                            }
                                            catch (final RuntimeException ex) {
                                                zjp.b(zjo.a, zjn.g, ex.getMessage());
                                            }
                                        }
                                        if (m != null) {
                                            ((zpf)m).b(ampf.j, (ampg)(Object)array);
                                        }
                                        if (l != null) {
                                            final Object c4 = ((auip)o).c;
                                            for (int c5 = ((afgh)c4).c, n3 = 0; n3 < c5; ++n3) {
                                                final alts alts2 = ((List<alts>)c4).get(n3);
                                                if ((alts2.c & 0x1) != 0x0) {
                                                    ((wwv)l).t((wxz)new wws(alts2.d), (alff)null);
                                                }
                                            }
                                        }
                                        if ((ahrv.b & 0x20) != 0x0) {
                                            final vax vax = (vax)((aexw)this.d).a;
                                            aioe aioe;
                                            if ((aioe = ahrv.j) == null) {
                                                aioe = aioe.a;
                                            }
                                            vax.c(aioe, (Map)null);
                                        }
                                        final int r = ahrv.r;
                                        if (r > 0) {
                                            final Object c6 = this.c;
                                            final Object i2 = this.i;
                                            final Object f = this.f;
                                            final Object e = this.e;
                                            final Context context = (Context)c6;
                                            final NotificationManager notificationManager2 = (NotificationManager)context.getSystemService("notification");
                                            final StatusBarNotification[] m2 = ztl.m(context);
                                            final int n4 = m2.length - r;
                                            if (n4 > 0) {
                                                Arrays.sort(m2, (Comparator<? super StatusBarNotification>)zox.c);
                                                for (int n5 = n; n5 < n4; ++n5) {
                                                    final StatusBarNotification statusBarNotification2 = m2[n5];
                                                    ztl.k((wwv)i2, statusBarNotification2.getNotification());
                                                    notificationManager2.cancel(statusBarNotification2.getTag(), statusBarNotification2.getId());
                                                    zpg.f((atjj)f, "CAPPED", (arud)e);
                                                }
                                            }
                                        }
                                        this.C(ahrv.l);
                                        return;
                                    }
                                    ((zpf)this.j).a(ampf.i, ahrv);
                                    trn.l("System notification suppressed or failed to build.");
                                    return;
                                }
                            }
                            if (!xkm.aa(ahrv) && !xkm.ab(ahrv, (acng)((aexw)((zhb)k).d).a)) {
                                continue;
                            }
                            break;
                        }
                        ahrq ahrq;
                        if ((ahrq = ahrv.e) == null) {
                            ahrq = ahrq.a;
                        }
                        final String c7 = ahrq.c;
                        ahrq ahrq2;
                        if ((ahrq2 = ahrv.e) == null) {
                            ahrq2 = ahrq.a;
                        }
                        final zqd b3 = zqd.b(c7, ahrq2.d, uji.T());
                        final zhb zhb = (zhb)k;
                        final afp afp = new afp((Context)zhb.a);
                        final Iterator<Object> iterator2 = ((Set<Object>)zhb.e).iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().a(ahrv, (wwv)j, b3, afp);
                        }
                        aaiw.R(afp, b3);
                        final aaal aaal = new aaal(afp.a(), b3, (atjj)zhb.c, (arud)zhb.b, (byte[])null, (byte[])null);
                        final afcm d2 = afcr.d();
                        alts alts3;
                        if ((alts3 = ahrv.u) == null) {
                            alts3 = alts.b;
                        }
                        d2.h((Object)alts3);
                        final AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer y = xkm.Y(ahrv);
                        if (y != null) {
                            final Iterator<Object> iterator3 = y.c.iterator();
                            while (iterator3.hasNext()) {
                                final AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer = (AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer)((agzd)iterator3.next()).rr((agyr)AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer);
                                if ((androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.b & 0x8) != 0x0) {
                                    alts alts4;
                                    if ((alts4 = androidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.f) == null) {
                                        alts4 = alts.b;
                                    }
                                    d2.h((Object)alts4);
                                }
                            }
                        }
                        o = new auip((Context)zhb.a, aaal, d2.g(), (byte[])null);
                        continue;
                    }
                }
            }
            else if (D(ahwi.class, (String)o)) {
                final ahwi ahwi = (ahwi)B(((agzi)ahwi.a).getParserForType(), array);
                if (ahwi != null) {
                    this.C(ahwi.b);
                }
                return;
            }
            else if (!D(alhl.class, (String)o)) {
                break Label_1589;
            }
            try {
                final alhl alhl = (alhl)agzi.parseFrom((agzi)alhl.a, array, ExtensionRegistryLite.getGeneratedRegistry());
                if ((alhl.b & 0x1) != 0x0) {
                    final Object b4 = this.b;
                    alhj alhj;
                    if ((alhj = alhl.c) == null) {
                        alhj = alhj.a;
                    }
                    alhi alhi;
                    if ((alhi = alhj.c) == null) {
                        alhi = alhi.a;
                    }
                    final String e2 = alhi.e;
                    final alhj c8 = alhl.c;
                    alhj a2;
                    if (c8 == null) {
                        a2 = alhj.a;
                    }
                    else {
                        a2 = c8;
                    }
                    alhk alhk2 = alhk;
                    if ((0x2 & a2.b) != 0x0) {
                        alhj a3;
                        if ((a3 = c8) == null) {
                            a3 = alhj.a;
                        }
                        if ((alhk2 = a3.d) == null) {
                            alhk2 = alhk.a;
                        }
                    }
                    ((zqx)b4).d(e2, alhk2);
                }
                return;
                trn.b("Unknown renderer type.");
            }
            catch (final ahab ahab) {}
        }
    }
    
    public final yvk d(final ypi ypi, final yul yul) {
        final PlayerConfigModel u = yul.u;
        return new yvk(g(ypi, null, yul, null), ypi.i.c, u.w(), u.v(), yul.b.a(), u.p(), new acvj[] { this.A(ypi.h) }, ypi.i.d, yul.O, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final void i() {
        final Object a = this.a;
        if (a != null) {
            ((wvu)this.j).d((aklq)a);
        }
    }
    
    public final spq j(final int n, final spq spq) {
        final Uri a = spq.a;
        if (spq.c == null) {
            ((Executor)this.c).execute((Runnable)new rfu(this, a, 14, (byte[])null, (byte[])null));
        }
        spq c = spq;
        if (spq.c != null) {
            c = spq;
            if (spq.d == null) {
                final viv d = spq.d();
                d.d = riv.r((float)spq.c.getIntrinsicWidth(), (float)spq.c.getIntrinsicWidth());
                c = d.c();
            }
        }
        ((List<Uri>)this.j).add(n, c.a);
        ((HashMap<Uri, spq>)this.i).put(c.a, c);
        return c;
    }
    
    public final aexq k(final Uri uri) {
        if (!((List)this.j).contains(uri)) {
            return (aexq)aewp.a;
        }
        return aexq.j(((HashMap)this.i).get(uri));
    }
    
    public final afcr l() {
        szc.f();
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = ((List<Object>)this.j).iterator();
        while (iterator.hasNext()) {
            list.add(((HashMap)this.i).get(iterator.next()));
        }
        return afcr.o((Collection)list);
    }
    
    public final asic m(final spc spc) {
        final Object e = this.e;
        spc.getClass();
        return ((ashe)e).aB((asix)new skb(spc, 12));
    }
    
    public final asic n(final spf spf) {
        final Object b = this.b;
        spf.getClass();
        return ((ashe)b).aB((asix)new skb(spf, 13));
    }
    
    public final asic o(final sph sph) {
        final Object f = this.f;
        sph.getClass();
        return ((ashe)f).aB((asix)new skb(sph, 14));
    }
    
    public final asic p(final spj spj) {
        final Object a = this.a;
        spj.getClass();
        return ((ashe)a).aB((asix)new skb(spj, 10));
    }
    
    public final void q(final List list) {
        szc.f();
        final List f = F(list);
        final ArrayList list2 = new ArrayList();
        for (final spq spq : f) {
            if (!((List)this.j).contains(spq.a)) {
                list2.add(spq);
            }
        }
        this.E(this.G(list2));
        final afcm d = afcr.d();
        final Iterator iterator2 = f.iterator();
        while (iterator2.hasNext()) {
            d.h((Object)((HashMap<K, spq>)this.i).get(((spq)iterator2.next()).a));
        }
        ((Executor)this.g).execute(aesm.h((Runnable)new rfu(this, d, 17, (byte[])null, (byte[])null)));
    }
    
    public final void r() {
        szc.f();
        ((List)this.j).clear();
        ((HashMap)this.i).clear();
    }
    
    public final void s(final List list) {
        szc.f();
        final List g = this.G(F(list));
        final Iterator<Object> iterator = ((List<Object>)this.j).iterator();
        while (iterator.hasNext()) {
            this.t(iterator.next());
        }
        ((List)this.j).clear();
        ((Executor)this.g).execute(aesm.h((Runnable)new rfu(this, this.E(g), 13, (byte[])null, (byte[])null)));
    }
    
    public final void t(final Uri uri) {
        final spq spq = ((HashMap)this.i).get(uri);
        if (spq != null) {
            final viv d = spq.d();
            d.f = null;
            ((HashMap)this.i).put(uri, d.c());
        }
    }
    
    public final void u(final List list) {
        szc.f();
        final afcm d = afcr.d();
        for (final Uri uri : list) {
            final spq spq = ((HashMap)this.i).get(uri);
            if (spq != null) {
                ((List)this.j).remove(uri);
                this.t(uri);
                d.h((Object)spq);
                if (!spq.a()) {
                    continue;
                }
                ((HashMap)this.i).remove(uri);
            }
        }
        final afcr g = d.g();
        if (g.isEmpty()) {
            return;
        }
        ((Executor)this.g).execute((Runnable)new rfu(this, g, 15, (byte[])null, (byte[])null));
    }
    
    public final void v(final spq spq) {
        szc.f();
        final int index = ((List)this.j).indexOf(spq.a);
        if (index < 0) {
            return;
        }
        if (((HashMap<K, spq>)this.i).get(spq.a).equals(spq)) {
            return;
        }
        ((HashMap<Uri, spq>)this.i).put(spq.a, spq);
        ((Executor)this.g).execute((Runnable)new nwy(this, spq, index, 3, (byte[])null, (byte[])null));
    }
    
    public final int w(Uri iterator, final List list) {
        int n;
        try {
            if (!((eg)this.j).aA(iterator)) {
                return 0;
            }
            iterator = (Uri)((eg)this.j).au(iterator).iterator();
            n = 0;
        Label_0035:
            while (true) {
                final int n2 = n;
                try {
                    if (((Iterator)iterator).hasNext()) {
                        final Uri uri = ((Iterator<Uri>)iterator).next();
                        try {
                            final Iterator iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                                if (uri.toString().startsWith(((Uri)iterator2.next()).toString())) {
                                    continue Label_0035;
                                }
                            }
                            if (((eg)this.j).aB(uri)) {
                                n += this.w(uri, list);
                            }
                            else {
                                uri.getPath();
                                final int a = pii.a;
                                ((eg)this.j).ay(uri);
                                ++n;
                            }
                        }
                        catch (final IOException ex) {
                            ((pig)this.i).g(1059);
                            pii.f((Throwable)ex, "%s: Failed to delete unaccounted file!", new Object[] { "ExpirationHandler" });
                        }
                        continue;
                    }
                    return n2;
                }
                catch (final IOException ex2) {}
            }
        }
        catch (final IOException ex2) {
            n = 0;
        }
        ((pig)this.i).g(1059);
        final IOException ex2;
        pii.f((Throwable)ex2, "%s: Failed to delete unaccounted file!", new Object[] { "ExpirationHandler" });
        return n;
    }
    
    public final leb x(final aogo aogo) {
        final Context context = (Context)((atjj)this.e).a();
        context.getClass();
        final vax vax = (vax)((atjj)this.c).a();
        vax.getClass();
        final fyt fyt = (fyt)((atjj)this.g).a();
        fyt.getClass();
        final elw elw = (elw)((atjj)this.h).a();
        elw.getClass();
        final aeim aeim = (aeim)((atjj)this.a).a();
        aeim.getClass();
        final lcx lcx = (lcx)((atjj)this.f).a();
        lcx.getClass();
        final acae acae = (acae)((atjj)this.k).a();
        acae.getClass();
        final kct kct = (kct)((atjj)this.j).a();
        kct.getClass();
        final arud arud = (arud)((atjj)this.b).a();
        arud.getClass();
        final vbq vbq = (vbq)((atjj)this.d).a();
        vbq.getClass();
        final asho asho = (asho)((atjj)this.i).a();
        asho.getClass();
        aogo.getClass();
        return new leb(context, vax, fyt, elw, aeim, lcx, acae, kct, arud, vbq, asho, aogo, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final yqi y(final afts afts, final wvu wvu, final abjm abjm, final xpb xpb, final zba zba) {
        final HashMap hashMap = new HashMap(1);
        hashMap.put("aid", tmy.bv((Context)this.c));
        return new yqi(abjm, hashMap, afts, wvu, xpb, zba, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public final bei z(final ypi ypi, final bfb bfb, final agmd s) {
        final zba c = ypi.i.c;
        final beh beh = new beh((Context)this.c, (bft)ypi, (bnv)bob.a, (bra)ypi.u, bfb, (brd)brf.i((Context)this.c), ypi.b);
        final Looper mainLooper = Looper.getMainLooper();
        dk.h(beh.q ^ true);
        dk.d((Object)mainLooper);
        beh.i = mainLooper;
        final long k = ((yzk)c).k();
        dk.h(beh.q ^ true);
        beh.n = k;
        dk.h(beh.q ^ true);
        beh.s = s;
        return beh.a();
    }
}
