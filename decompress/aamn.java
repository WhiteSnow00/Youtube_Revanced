import android.os.Handler;
import java.util.Locale;
import java.util.Comparator;
import java.util.HashSet;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
import java.util.concurrent.Callable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.Map;
import android.app.Notification;
import android.service.notification.StatusBarNotification;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import java.util.Set;
import com.google.common.util.concurrent.ListenableFuture;
import android.util.SparseArray;
import java.util.List;
import java.util.Collections;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamn
{
    public static aisc A(final String c, final alqg alqg) {
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        final ahcx likeEndpoint = LikeEndpointOuterClass$LikeEndpoint.likeEndpoint;
        final ahcr builder = ((ahcz)LikeEndpointOuterClass$LikeEndpoint.a).createBuilder();
        builder.copyOnWrite();
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint)builder.instance;
        likeEndpointOuterClass$LikeEndpoint.e = alqg.e;
        likeEndpointOuterClass$LikeEndpoint.b |= 0x1;
        final ahcr builder2 = alqh.a.createBuilder();
        builder2.copyOnWrite();
        final alqh alqh = (alqh)builder2.instance;
        c.getClass();
        alqh.b |= 0x1;
        alqh.c = c;
        builder.copyOnWrite();
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = (LikeEndpointOuterClass$LikeEndpoint)builder.instance;
        final alqh f = (alqh)builder2.build();
        f.getClass();
        likeEndpointOuterClass$LikeEndpoint2.f = f;
        likeEndpointOuterClass$LikeEndpoint2.b |= 0x2;
        ahct.e((ahci)likeEndpoint, (Object)builder.build());
        return (aisc)((ahcr)ahct).build();
    }
    
    public static aisc B(final String s, final aacx aacx, final int n, final byte[] array) {
        aacx.getClass();
        final String f = aacx.f();
        ahbt ahbt;
        if (array != null) {
            ahbt = ahbt.x(array);
        }
        else {
            ahbt = ahbt.b;
        }
        return C(s, f, n, ahbt);
    }
    
    public static aisc C(final String d, final String c, final int e, final ahbt c2) {
        final ahcr builder = ((ahcz)amyt.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amyt amyt = (amyt)builder.instance;
            c.getClass();
            amyt.b |= 0x1;
            amyt.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amyt amyt2 = (amyt)builder.instance;
            d.getClass();
            amyt2.b |= 0x2;
            amyt2.d = d;
        }
        if (e != -1) {
            builder.copyOnWrite();
            final amyt amyt3 = (amyt)builder.instance;
            amyt3.b |= 0x4;
            amyt3.e = e;
        }
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        ahct.e((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        if (c2 != null && !c2.H()) {
            ((ahcr)ahct).copyOnWrite();
            final aisc aisc = (aisc)ahct.instance;
            aisc.b |= 0x1;
            aisc.c = c2;
        }
        return (aisc)((ahcr)ahct).build();
    }
    
    public static anxb D(final String s, final boolean b) {
        final ahct ahct = (ahct)((ahcz)aoko.a).createBuilder();
        if (b) {
            ((ahcr)ahct).copyOnWrite();
            final aoko aoko = (aoko)ahct.instance;
            aoko.b |= 0x1;
            aoko.c = true;
        }
        else {
            ((ahcr)ahct).copyOnWrite();
            final aoko aoko2 = (aoko)ahct.instance;
            aoko2.b |= 0x2;
            aoko2.d = true;
        }
        final String h = vht.h(62, s);
        ((ahcr)ahct).copyOnWrite();
        final aoko aoko3 = (aoko)ahct.instance;
        h.getClass();
        aoko3.b |= 0x10;
        aoko3.f = h;
        final ahcr builder = aiet.a.createBuilder();
        final ahcr builder2 = aifb.a.createBuilder();
        final ahct ahct2 = (ahct)((ahcz)akfj.a).createBuilder();
        akfi akfi;
        if (b) {
            akfi = akfi.aA;
        }
        else {
            akfi = akfi.aB;
        }
        ((ahcr)ahct2).copyOnWrite();
        final akfj akfj = (akfj)ahct2.instance;
        akfj.c = akfi.sB;
        akfj.b |= 0x1;
        builder2.copyOnWrite();
        final aifb aifb = (aifb)builder2.instance;
        final akfj g = (akfj)((ahcr)ahct2).build();
        g.getClass();
        aifb.g = g;
        aifb.b |= 0x20;
        final ahct ahct3 = (ahct)((ahcz)akfj.a).createBuilder();
        akfi akfi2;
        if (b) {
            akfi2 = akfi.aC;
        }
        else {
            akfi2 = akfi.aD;
        }
        ((ahcr)ahct3).copyOnWrite();
        final akfj akfj2 = (akfj)ahct3.instance;
        akfj2.c = akfi2.sB;
        akfj2.b |= 0x1;
        builder2.copyOnWrite();
        final aifb aifb2 = (aifb)builder2.instance;
        final akfj m = (akfj)((ahcr)ahct3).build();
        m.getClass();
        aifb2.m = m;
        aifb2.b |= 0x1000;
        alqg alqg;
        if (b) {
            alqg = alqg.a;
        }
        else {
            alqg = alqg.b;
        }
        final aisc a = A(s, alqg);
        builder2.copyOnWrite();
        final aifb aifb3 = (aifb)builder2.instance;
        a.getClass();
        aifb3.k = a;
        aifb3.b |= 0x200;
        final aisc a2 = A(s, alqg.c);
        builder2.copyOnWrite();
        final aifb aifb4 = (aifb)builder2.instance;
        a2.getClass();
        aifb4.p = a2;
        aifb4.b |= 0x8000;
        builder.copyOnWrite();
        final aiet aiet = (aiet)builder.instance;
        final aifb d = (aifb)builder2.build();
        d.getClass();
        aiet.d = d;
        aiet.b |= 0x2;
        ((ahcr)ahct).copyOnWrite();
        final aoko aoko4 = (aoko)ahct.instance;
        final aiet g2 = (aiet)builder.build();
        g2.getClass();
        aoko4.g = g2;
        aoko4.b |= 0x20;
        final ahct ahct4 = (ahct)((ahcz)anxb.a).createBuilder();
        ahct4.e((ahci)SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer, (Object)((ahcr)ahct).build());
        return (anxb)((ahcr)ahct4).build();
    }
    
    public static Uri E(final abpf abpf, final String s, final int n, final String s2, final long n2, final long n3, final long n4) {
        if (abpf == null) {
            return null;
        }
        final athd a = abpf.a("/pudl", s, n, s2, n2, n3);
        a.i("e", n4);
        return a.g();
    }
    
    public static PlayerResponseModel F(final PlayerResponseModel playerResponseModel, final vku vku) {
        final PlayerResponseModelImpl playerResponseModelImpl = (PlayerResponseModelImpl)playerResponseModel;
        final ahct ahct = (ahct)((ahcz)playerResponseModelImpl.b).toBuilder();
        ((ahcr)ahct).copyOnWrite();
        final akzi akzi = (akzi)ahct.instance;
        akzi.d = null;
        akzi.b &= 0xFFFFFFFE;
        ((ahcr)ahct).copyOnWrite();
        final akzi akzi2 = (akzi)ahct.instance;
        akzi2.j = null;
        akzi2.b &= 0xFFFFFFBF;
        return (PlayerResponseModel)new PlayerResponseModelImpl((akzi)((ahcr)ahct).build(), playerResponseModelImpl.c, vku);
    }
    
    public static PlayerResponseModel G(final PlayerResponseModel playerResponseModel, final vku vku, final FormatStreamModel formatStreamModel, final FormatStreamModel formatStreamModel2, final aaks aaks) {
        final long k = playerResponseModel.k();
        akzm akzm;
        if ((akzm = playerResponseModel.z().h) == null) {
            akzm = akzm.b;
        }
        final long d = akzm.d;
        final ahct ahct = (ahct)((ahcz)playerResponseModel.z()).toBuilder();
        final akzi akzi = (akzi)ahct.instance;
        ahcr builder;
        if ((akzi.b & 0x10) != 0x0) {
            akzm akzm2;
            if ((akzm2 = akzi.h) == null) {
                akzm2 = akzm.b;
            }
            builder = akzm2.toBuilder();
        }
        else {
            builder = null;
        }
        vku b = vku;
        if (builder != null) {
            final long max = Math.max(0L, d);
            builder.copyOnWrite();
            final akzm akzm3 = (akzm)builder.instance;
            final int c = akzm3.c;
            final int n = 1;
            akzm3.c = (c | 0x1);
            akzm3.d = max;
            final SparseArray z = Z(Collections.unmodifiableList((List<?>)akzm3.f));
            int n2;
            if (formatStreamModel != null) {
                if (formatStreamModel.y()) {
                    z.put(formatStreamModel.e(), (Object)formatStreamModel.a);
                }
                else {
                    final SparseArray z2 = Z(Collections.unmodifiableList((List<?>)((akzm)builder.instance).e));
                    z2.put(formatStreamModel.e(), (Object)formatStreamModel.a);
                    builder.copyOnWrite();
                    ((akzm)builder.instance).e = ahcz.emptyProtobufList();
                    builder.aY((Iterable)aa(z2));
                }
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (formatStreamModel2 != null) {
                z.put(formatStreamModel2.e(), (Object)formatStreamModel2.a);
                n2 = n;
            }
            builder.copyOnWrite();
            ((akzm)builder.instance).f = ahcz.emptyProtobufList();
            builder.aX((Iterable)aa(z));
            final akzm h = (akzm)builder.build();
            ((ahcr)ahct).copyOnWrite();
            final akzi akzi2 = (akzi)ahct.instance;
            h.getClass();
            akzi2.h = h;
            akzi2.b |= 0x10;
            b = vku;
            if (n2 != 0) {
                b = vku;
                if (aaks.q()) {
                    b = vku.b;
                }
            }
        }
        return (PlayerResponseModel)new PlayerResponseModelImpl((akzi)((ahcr)ahct).build(), k, PlayerResponseModelImpl.ag(b, (akzi)((ahcr)ahct).build(), k));
    }
    
    public static PlayerResponseModel H(final PlayerResponseModel playerResponseModel, final vku vku, final FormatStreamModel formatStreamModel, final FormatStreamModel formatStreamModel2, final long n, long max, final boolean b, final aaks aaks) {
        final ahct ahct = (ahct)((ahcz)playerResponseModel.z()).toBuilder();
        final akzi akzi = (akzi)ahct.instance;
        ahcr builder;
        if ((akzi.b & 0x10) != 0x0) {
            akzm akzm;
            if ((akzm = akzi.h) == null) {
                akzm = akzm.b;
            }
            builder = akzm.toBuilder();
        }
        else {
            builder = null;
        }
        vku b2 = vku;
        if (builder != null) {
            max = Math.max(0L, max);
            builder.copyOnWrite();
            final akzm akzm2 = (akzm)builder.instance;
            final ahdi a = akzm.a;
            final int c = akzm2.c;
            final int n2 = 1;
            akzm2.c = (c | 0x1);
            akzm2.d = max;
            if (!b) {
                builder.copyOnWrite();
                final akzm akzm3 = (akzm)builder.instance;
                akzm3.c &= 0xFFFFFFFD;
                akzm3.h = akzm.b.h;
                builder.copyOnWrite();
                final akzm akzm4 = (akzm)builder.instance;
                akzm4.c &= 0xFFFFFFFB;
                akzm4.i = akzm.b.i;
            }
            final SparseArray sparseArray = new SparseArray();
            final SparseArray sparseArray2 = new SparseArray();
            final int n3 = 0;
            int n4;
            if (formatStreamModel != null) {
                if (formatStreamModel.y()) {
                    sparseArray.put(formatStreamModel.e(), (Object)formatStreamModel.a);
                }
                else {
                    sparseArray2.put(formatStreamModel.e(), (Object)formatStreamModel.a);
                }
                n4 = 1;
            }
            else {
                if (b) {
                    for (int size = ((akzm)builder.instance).f.size(), i = 0; i < size; ++i) {
                        final ajwl av = builder.aV(i);
                        if (vkl.d(av.f)) {
                            sparseArray.put(av.d, (Object)av);
                        }
                    }
                    for (int size2 = ((akzm)builder.instance).e.size(), j = 0; j < size2; ++j) {
                        final ajwl ajwl = (ajwl)((akzm)builder.instance).e.get(j);
                        sparseArray2.put(ajwl.d, (Object)ajwl);
                    }
                }
                n4 = 0;
            }
            if (formatStreamModel2 != null) {
                sparseArray.put(formatStreamModel2.e(), (Object)formatStreamModel2.a);
                n4 = n2;
            }
            else if (b) {
                for (int size3 = ((akzm)builder.instance).f.size(), k = n3; k < size3; ++k) {
                    final ajwl av2 = builder.aV(k);
                    if (vkl.c(av2.f)) {
                        sparseArray.put(av2.d, (Object)av2);
                    }
                }
            }
            builder.copyOnWrite();
            ((akzm)builder.instance).f = ahcz.emptyProtobufList();
            builder.aX((Iterable)aa(sparseArray));
            builder.copyOnWrite();
            ((akzm)builder.instance).e = ahcz.emptyProtobufList();
            builder.aY((Iterable)aa(sparseArray2));
            final akzm h = (akzm)builder.build();
            ((ahcr)ahct).copyOnWrite();
            final akzi akzi2 = (akzi)ahct.instance;
            h.getClass();
            akzi2.h = h;
            akzi2.b |= 0x10;
            b2 = vku;
            if (n4 != 0) {
                b2 = vku;
                if (aaks.q()) {
                    b2 = vku.b;
                }
            }
        }
        return (PlayerResponseModel)new PlayerResponseModelImpl((akzi)((ahcr)ahct).build(), n, PlayerResponseModelImpl.ag(b2, (akzi)((ahcr)ahct).build(), n));
    }
    
    public static PlayerResponseModel I(final PlayerResponseModel playerResponseModel, final vku vku) {
        final PlayerResponseModelImpl playerResponseModelImpl = (PlayerResponseModelImpl)playerResponseModel;
        final ahct ahct = (ahct)((ahcz)playerResponseModelImpl.b).toBuilder();
        final akzi akzi = (akzi)ahct.instance;
        akzm h;
        if ((akzi.b & 0x10) != 0x0) {
            akzm akzm;
            if ((akzm = akzi.h) == null) {
                akzm = akzm.b;
            }
            final ahcr builder = akzm.toBuilder();
            builder.copyOnWrite();
            ((akzm)builder.instance).f = ahcz.emptyProtobufList();
            builder.copyOnWrite();
            ((akzm)builder.instance).e = ahcz.emptyProtobufList();
            h = (akzm)builder.build();
        }
        else {
            h = null;
        }
        if (h != null) {
            ((ahcr)ahct).copyOnWrite();
            final akzi akzi2 = (akzi)ahct.instance;
            akzi2.h = h;
            akzi2.b |= 0x10;
        }
        else {
            ((ahcr)ahct).copyOnWrite();
            final akzi akzi3 = (akzi)ahct.instance;
            akzi3.h = null;
            akzi3.b &= 0xFFFFFFEF;
        }
        ((ahcr)ahct).copyOnWrite();
        ((akzi)ahct.instance).m = akzi.emptyProtobufList();
        return (PlayerResponseModel)new PlayerResponseModelImpl((akzi)((ahcr)ahct).build(), playerResponseModelImpl.c, vku);
    }
    
    public static ListenableFuture J(final ListenableFuture listenableFuture, final Set set, final afvq afvq, final Executor executor) {
        return afun.f(listenableFuture, (Class)Exception.class, (afvq)new xtd(set, afvq, 4), executor);
    }
    
    public static ListenableFuture K(final ListenableFuture listenableFuture, final int n, final ScheduledExecutorService scheduledExecutorService) {
        return afvh.e(listenableFuture, (afax)new fqv(n, 13), (Executor)scheduledExecutorService);
    }
    
    public static final ListenableFuture L(final String s, ListenableFuture j, final ListenableFuture listenableFuture, final long n, final afhk afhk, final ScheduledExecutorService scheduledExecutorService, final aacd aacd, final afbk afbk, final int n2) {
        final afgh h = afxr.h(afgh.s(j, listenableFuture));
        final ListenableFuture s2 = afxr.s(afxr.m(K(j, 0, scheduledExecutorService)), n, TimeUnit.MILLISECONDS, scheduledExecutorService);
        final afhi afhi = new afhi();
        afhi.j(afhk);
        afhi.h(TimeoutException.class);
        j = J(s2, afhi.g(), (afvq)new vdx(h, scheduledExecutorService, afhk, j, 4), scheduledExecutorService);
        final afwd a = afwd.a;
        afxr.v(j, new aaet(afbk, aacd, s, n2, listenableFuture, a), a);
        return afvh.e(j, (afax)zzj.j, (Executor)afwd.a);
    }
    
    public static PendingIntent M(final Context context, final Intent intent) {
        return PendingIntent.getActivity(context, (int)(Math.random() * 2.147483647E9), intent, 1140850688);
    }
    
    public static PendingIntent N(final Context context, final Intent intent) {
        return PendingIntent.getBroadcast(context, (int)(Math.random() * 2.147483647E9), intent, 1140850688);
    }
    
    public static void O(final Intent intent, final String s, final amva amva) {
        if (amva != null && amva.l) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                intent.putExtra("push_notification_clientstreamz_logging", s);
            }
        }
    }
    
    public static ztt P(final Intent intent) {
        final Bundle extras = intent.getExtras();
        ztt ztt;
        if (extras == null) {
            ztt = ztt.a("", -666);
        }
        else {
            ztt = ztt.b(twd.i(extras.getString("notification_tag")), extras.getInt("notification_id", -666), twd.i(extras.getString("client_id")));
        }
        return ztt;
    }
    
    public static afbh Q(final StatusBarNotification statusBarNotification) {
        final Notification notification = statusBarNotification.getNotification();
        if (notification == null) {
            return afag.a;
        }
        final Bundle extras = notification.extras;
        if (extras == null) {
            return afag.a;
        }
        return afbh.j(extras.getString("client_id"));
    }
    
    public static void R(final afr afr, final ztt ztt) {
        final String c = ztt.c;
        if (TextUtils.isEmpty((CharSequence)c)) {
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("client_id", c);
        final Bundle x = afr.x;
        if (x == null) {
            afr.x = new Bundle(bundle);
            return;
        }
        x.putAll(bundle);
    }
    
    public static void S(final Intent intent, final ztt ztt) {
        intent.putExtra("notification_tag", ztt.a);
        intent.putExtra("notification_id", ztt.b);
        intent.putExtra("client_id", ztt.c);
    }
    
    public static void T(final Intent intent, final aisc aisc) {
        if (aisc == null) {
            return;
        }
        intent.putExtra("service_endpoint", ((ahbc)aisc).toByteArray());
    }
    
    public static boolean U(final dbm dbm) {
        if (dbm instanceof zot) {
            return true;
        }
        dbe dbe;
        if (dbm instanceof dbd) {
            dbe = ((dbd)dbm).b;
        }
        else if (dbm instanceof dbk) {
            dbe = ((dbk)dbm).b;
        }
        else {
            dbe = null;
        }
        if (dbe != null) {
            final int a = dbe.a;
            return a == 400 || a == 403;
        }
        return false;
    }
    
    public static void V(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static void W(final znj znj, final zng zng, final znf znf, final String s, final Throwable t) {
        X(znj, zng, znf, s, t, afkc.b);
    }
    
    public static void X(final znj znj, final zng zng, final znf znf, final String s, final Throwable t, final Map map) {
        znj.c(zng, znf, s, t, map, (Function)zge.i);
    }
    
    public static adgg Y(final xsj xsj) {
        return new adgg(xsj, (byte[])null, (byte[])null);
    }
    
    private static SparseArray Z(final List list) {
        final SparseArray sparseArray = new SparseArray();
        for (final ajwl ajwl : agpx.R(list)) {
            sparseArray.put(ajwl.d, (Object)ajwl);
        }
        return sparseArray;
    }
    
    public static atlt a() {
        return ((atlt)atlv.aE()).aL();
    }
    
    private static List aa(final SparseArray sparseArray) {
        final ArrayList list = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); ++i) {
            list.add(sparseArray.valueAt(i));
        }
        return list;
    }
    
    public static teq b() {
        return (teq)new tex(20);
    }
    
    public static ListenableFuture c(final Context context, final Executor executor) {
        return afxr.p((Callable)new zms(context, 7), executor);
    }
    
    public static abod d(final Context context, final abvv abvv, final abvt abvt, final abqz abqz, final abog abog, final abny abny, final oco oco, final aboj aboj, final List list) {
        return new abod(context, abvv, abvt, abqz.bN(), abny, abog, oco, aboj, list);
    }
    
    public static abog e(final Context context, final atnb atnb, final abvv abvv, final aamy aamy, final atnb atnb2) {
        return new abog(context, atnb, abvv, aamy.d, atnb2);
    }
    
    public static abvv f(final abqz abqz) {
        return abqz.t().c = new abvv();
    }
    
    public static Intent g(final Context context) {
        return new Intent(context, (Class)BackgroundPlayerService.class);
    }
    
    public static tsd h(final tsd tsd, final aamy aamy) {
        if (aamy.g) {
            return tsd;
        }
        return null;
    }
    
    public static ynz i(final aamy aamy, final ynx ynx) {
        if (aamy.a) {
            return (ynz)ynx;
        }
        return null;
    }
    
    public static abnw j(final abnx abnx) {
        return (abnw)new aboh((abnw)abnx, xbf.c(105671));
    }
    
    public static abnw k(final abof abof) {
        return (abnw)new aboh((abnw)abof, xbf.c(105673));
    }
    
    public static abnw l(final abof abof) {
        return (abnw)new aboh((abnw)abof, xbf.c(105672));
    }
    
    public static abnw m(final abof abof) {
        return (abnw)new aboh((abnw)abof, xbf.c(105674));
    }
    
    public static int n(int n, final int n2) {
        if (n == n2) {
            n = 0;
        }
        else {
            if (n < n2) {
                return -1;
            }
            n = 1;
        }
        return n;
    }
    
    public static akxk o(final akxm akxm, final String s) {
        if (akxm == null) {
            return null;
        }
        for (final akxn akxn : akxm.c) {
            akxk akxk;
            if ((akxk = akxn.b) == null) {
                akxk = akxk.a;
            }
            if (akxk.b.equals(s)) {
                akxk akxk2;
                if ((akxk2 = akxn.b) == null) {
                    akxk2 = akxk.a;
                }
                return akxk2;
            }
        }
        return null;
    }
    
    public static amxb p(final akxp akxp, final String s) {
        for (final amxc amxc : akxp.d) {
            amxb amxb;
            if ((amxb = amxc.b) == null) {
                amxb = amxb.a;
            }
            if (amxb.c.equals(s)) {
                amxb amxb2;
                if ((amxb2 = amxc.b) == null) {
                    amxb2 = amxb.a;
                }
                return amxb2;
            }
        }
        return null;
    }
    
    public static aowb q(final aowb aowb, final List list) {
        final vig vig = new vig(aowb);
        final HashSet set = new HashSet();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final vif c = vig.c((int)iterator.next());
            if (c != null) {
                set.add(c);
            }
        }
        final ArrayList list2 = new ArrayList();
        for (final vif vif : set) {
            final ahcr builder = ((ahcz)aowa.a).createBuilder();
            final int a = vif.a;
            builder.copyOnWrite();
            final aowa aowa = (aowa)builder.instance;
            aowa.b |= 0x2;
            aowa.d = a;
            final int b = vif.b;
            builder.copyOnWrite();
            final aowa aowa2 = (aowa)builder.instance;
            aowa2.b |= 0x4;
            aowa2.e = b;
            final String string = vif.a().toString();
            builder.copyOnWrite();
            final aowa aowa3 = (aowa)builder.instance;
            string.getClass();
            aowa3.b |= 0x1;
            aowa3.c = string;
            list2.add(builder.build());
        }
        Collections.sort((List<Object>)list2, (Comparator<? super Object>)zmm.g);
        final ahct ahct = (ahct)((ahcz)aowb.a).createBuilder();
        ((ahcr)ahct).copyOnWrite();
        final aowb aowb2 = (aowb)ahct.instance;
        aowb2.a();
        ahbc.addAll((Iterable)list2, (List)aowb2.c);
        return (aowb)((ahcr)ahct).build();
    }
    
    public static String r(final String s, final String s2) {
        return String.format(Locale.US, "%s:%s:thumb", s, s2);
    }
    
    public static String s(final String s, final String s2) {
        return String.format(Locale.US, "%s:%s:master", s, s2);
    }
    
    public static void t(final amzj amzj, final xab xab, final String g, final String g2, final amze amze, final boolean d, final aacw aacw, final amvf amvf) {
        if (xab == null) {
            return;
        }
        adme.K(TextUtils.isEmpty((CharSequence)g) != TextUtils.isEmpty((CharSequence)g2));
        final ahcr builder = ((ahcz)alji.a).createBuilder();
        final ahcr builder2 = ((ahcz)aljn.a).createBuilder();
        builder2.copyOnWrite();
        final aljn aljn = (aljn)builder2.instance;
        aljn.c = amze.k;
        aljn.b |= 0x1;
        builder2.copyOnWrite();
        final aljn aljn2 = (aljn)builder2.instance;
        aljn2.b |= 0x2;
        aljn2.d = d;
        final aacw a = aacw.a;
        if (aacw.ordinal() != 0) {
            builder2.copyOnWrite();
            final aljn aljn3 = (aljn)builder2.instance;
            aljn3.e = 0;
            aljn3.b |= 0x4;
        }
        else {
            builder2.copyOnWrite();
            final aljn aljn4 = (aljn)builder2.instance;
            aljn4.e = 1;
            aljn4.b |= 0x4;
        }
        if (!TextUtils.isEmpty((CharSequence)g)) {
            builder2.copyOnWrite();
            final aljn aljn5 = (aljn)builder2.instance;
            aljn5.f = 1;
            aljn5.b |= 0x8;
            builder2.copyOnWrite();
            final aljn aljn6 = (aljn)builder2.instance;
            g.getClass();
            aljn6.b |= 0x10;
            aljn6.g = g;
        }
        else if (!TextUtils.isEmpty((CharSequence)g2)) {
            builder2.copyOnWrite();
            final aljn aljn7 = (aljn)builder2.instance;
            aljn7.f = 2;
            aljn7.b |= 0x8;
            builder2.copyOnWrite();
            final aljn aljn8 = (aljn)builder2.instance;
            g2.getClass();
            aljn8.b |= 0x10;
            aljn8.g = g2;
        }
        if (amvf != null) {
            builder2.copyOnWrite();
            final aljn aljn9 = (aljn)builder2.instance;
            aljn9.h = amvf.f;
            aljn9.b |= 0x20;
        }
        builder.copyOnWrite();
        final alji alji = (alji)builder.instance;
        final aljn i = (aljn)builder2.build();
        i.getClass();
        alji.i = i;
        alji.b |= 0x10;
        if ((amzj.b & 0x80) != 0x0 && amzj.i.d() > 0) {
            xab.J(3, (xbe)new wzy(amzj.i), (alji)builder.build());
            return;
        }
        String s = g;
        if (TextUtils.isEmpty((CharSequence)g)) {
            s = g2;
        }
        xab.J(3, xny.P(xab.g((Object)s, xbf.c(7111))), (alji)builder.build());
    }
    
    public static void u(final amzj amzj, final xab xab) {
        xab.t((xbe)new wzy(amzj.i), (alji)null);
    }
    
    public static twn v(final Context context, final arna arna, final tun tun) {
        return new twn(context, (Handler)arna.a(), tun, (byte[])null);
    }
    
    public static void w(final aach aach, final aach aach2, final String s) {
        final Class clazz = (Class)aahc.a.get(s);
        if (clazz == Boolean.TYPE) {
            aach2.i(s, aach.o(s));
            return;
        }
        if (clazz == Integer.TYPE) {
            aach2.l(s, aach.b(s));
            return;
        }
        if (clazz == Long.TYPE) {
            aach2.m(s, aach.d(s));
            return;
        }
        if (clazz == Double.TYPE) {
            aach2.k(s, aach.a(s));
            return;
        }
        if (clazz == byte[].class) {
            final byte[] q = aach.q(s);
            if (q != null) {
                aach2.j(s, q);
            }
        }
        else if (clazz == String.class) {
            final String g = aach.g(s);
            if (g != null) {
                aach2.n(s, g);
            }
        }
    }
    
    public static final aagp x(final aacu aacu, final int n, final ArrayList list, final int n2) {
        if (n >= 0) {
            return new aagp(aacu, n, n2, list.toArray(new amvk[list.size()]));
        }
        throw new IllegalArgumentException("OfflineStreamVerificationResult.Builder not properly initialized");
    }
    
    public static final void y(final long d, final aacu aacu, final ArrayList list) {
        final ahcr builder = ((ahcz)amvk.a).createBuilder();
        final int a = aacu.a();
        builder.copyOnWrite();
        final amvk amvk = (amvk)builder.instance;
        amvk.b |= 0x1;
        amvk.c = a;
        builder.copyOnWrite();
        final amvk amvk2 = (amvk)builder.instance;
        amvk2.b |= 0x2;
        amvk2.d = d;
        list.add(builder.build());
    }
    
    public static final int z(String lowerCase, String lowerCase2, final String s) {
        if (TextUtils.isEmpty((CharSequence)lowerCase)) {
            return 1;
        }
        final String lowerCase3 = lowerCase.toLowerCase(Locale.getDefault());
        lowerCase = lowerCase2.toLowerCase(Locale.getDefault());
        lowerCase2 = s.toLowerCase(Locale.getDefault());
        if (lowerCase.contains(lowerCase3) || lowerCase2.contains(lowerCase3)) {
            return 4;
        }
        final String[] split = lowerCase3.split("\\s+");
        final int length = split.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final String s2 = split[i];
            int n2 = 0;
            Label_0112: {
                if (!lowerCase.contains(s2)) {
                    n2 = n;
                    if (!lowerCase2.contains(s2)) {
                        break Label_0112;
                    }
                }
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        final int length2 = split.length;
        if (n == length2) {
            return 3;
        }
        if (n >= length2 >> 1 && n > 0) {
            return 2;
        }
        return 1;
    }
}
