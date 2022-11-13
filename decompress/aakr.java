import android.os.Handler;
import java.util.Locale;
import java.util.Comparator;
import java.util.HashSet;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
import java.util.concurrent.Callable;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.Map;
import android.app.Notification;
import android.service.notification.StatusBarNotification;
import android.os.Bundle;
import android.content.Intent;
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

public final class aakr
{
    public static aiqj A(final String c, final alog alog) {
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        final ahbf likeEndpoint = LikeEndpointOuterClass$LikeEndpoint.likeEndpoint;
        final ahaz builder = ((ahbh)LikeEndpointOuterClass$LikeEndpoint.a).createBuilder();
        builder.copyOnWrite();
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint)builder.instance;
        likeEndpointOuterClass$LikeEndpoint.e = alog.e;
        likeEndpointOuterClass$LikeEndpoint.b |= 0x1;
        final ahaz builder2 = aloh.a.createBuilder();
        builder2.copyOnWrite();
        final aloh aloh = (aloh)builder2.instance;
        c.getClass();
        aloh.b |= 0x1;
        aloh.c = c;
        builder.copyOnWrite();
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = (LikeEndpointOuterClass$LikeEndpoint)builder.instance;
        final aloh f = (aloh)builder2.build();
        f.getClass();
        likeEndpointOuterClass$LikeEndpoint2.f = f;
        likeEndpointOuterClass$LikeEndpoint2.b |= 0x2;
        ahbb.e((ahaq)likeEndpoint, (Object)builder.build());
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public static aiqj B(final String s, final aaba aaba, final int n, final byte[] array) {
        aaba.getClass();
        final String f = aaba.f();
        ahab ahab;
        if (array != null) {
            ahab = ahab.x(array);
        }
        else {
            ahab = ahab.b;
        }
        return C(s, f, n, ahab);
    }
    
    public static aiqj C(final String d, final String c, final int e, final ahab c2) {
        final ahaz builder = ((ahbh)amwo.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amwo amwo = (amwo)builder.instance;
            c.getClass();
            amwo.b |= 0x1;
            amwo.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amwo amwo2 = (amwo)builder.instance;
            d.getClass();
            amwo2.b |= 0x2;
            amwo2.d = d;
        }
        if (e != -1) {
            builder.copyOnWrite();
            final amwo amwo3 = (amwo)builder.instance;
            amwo3.b |= 0x4;
            amwo3.e = e;
        }
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        if (c2 != null && !c2.H()) {
            ((ahaz)ahbb).copyOnWrite();
            final aiqj aiqj = (aiqj)ahbb.instance;
            aiqj.b |= 0x1;
            aiqj.c = c2;
        }
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public static anuv D(final String s, final boolean b) {
        final ahbb ahbb = (ahbb)((ahbh)aoif.a).createBuilder();
        if (b) {
            ((ahaz)ahbb).copyOnWrite();
            final aoif aoif = (aoif)ahbb.instance;
            aoif.b |= 0x1;
            aoif.c = true;
        }
        else {
            ((ahaz)ahbb).copyOnWrite();
            final aoif aoif2 = (aoif)ahbb.instance;
            aoif2.b |= 0x2;
            aoif2.d = true;
        }
        final String h = vgl.h(62, s);
        ((ahaz)ahbb).copyOnWrite();
        final aoif aoif3 = (aoif)ahbb.instance;
        h.getClass();
        aoif3.b |= 0x10;
        aoif3.f = h;
        final ahaz builder = ((ahbh)aida.a).createBuilder();
        final ahaz builder2 = ((ahbh)aidi.a).createBuilder();
        final ahbb ahbb2 = (ahbb)((ahbh)akdi.a).createBuilder();
        akdh akdh;
        if (b) {
            akdh = akdh.aA;
        }
        else {
            akdh = akdh.aB;
        }
        ((ahaz)ahbb2).copyOnWrite();
        final akdi akdi = (akdi)ahbb2.instance;
        akdi.c = akdh.sy;
        akdi.b |= 0x1;
        builder2.copyOnWrite();
        final aidi aidi = (aidi)builder2.instance;
        final akdi g = (akdi)((ahaz)ahbb2).build();
        g.getClass();
        aidi.g = g;
        aidi.b |= 0x20;
        final ahbb ahbb3 = (ahbb)((ahbh)akdi.a).createBuilder();
        akdh akdh2;
        if (b) {
            akdh2 = akdh.aC;
        }
        else {
            akdh2 = akdh.aD;
        }
        ((ahaz)ahbb3).copyOnWrite();
        final akdi akdi2 = (akdi)ahbb3.instance;
        akdi2.c = akdh2.sy;
        akdi2.b |= 0x1;
        builder2.copyOnWrite();
        final aidi aidi2 = (aidi)builder2.instance;
        final akdi m = (akdi)((ahaz)ahbb3).build();
        m.getClass();
        aidi2.m = m;
        aidi2.b |= 0x1000;
        alog alog;
        if (b) {
            alog = alog.a;
        }
        else {
            alog = alog.b;
        }
        final aiqj a = A(s, alog);
        builder2.copyOnWrite();
        final aidi aidi3 = (aidi)builder2.instance;
        a.getClass();
        aidi3.k = a;
        aidi3.b |= 0x200;
        final aiqj a2 = A(s, alog.c);
        builder2.copyOnWrite();
        final aidi aidi4 = (aidi)builder2.instance;
        a2.getClass();
        aidi4.p = a2;
        aidi4.b |= 0x8000;
        builder.copyOnWrite();
        final aida aida = (aida)builder.instance;
        final aidi d = (aidi)builder2.build();
        d.getClass();
        aida.d = d;
        aida.b |= 0x2;
        ((ahaz)ahbb).copyOnWrite();
        final aoif aoif4 = (aoif)ahbb.instance;
        final aida g2 = (aida)builder.build();
        g2.getClass();
        aoif4.g = g2;
        aoif4.b |= 0x20;
        final ahbb ahbb4 = (ahbb)((ahbh)anuv.a).createBuilder();
        ahbb4.e((ahaq)SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer, (Object)((ahaz)ahbb).build());
        return (anuv)((ahaz)ahbb4).build();
    }
    
    public static Uri E(final abny abny, final String s, final int n, final String s2, final long n2, final long n3, final long n4) {
        if (abny == null) {
            return null;
        }
        final ateg a = abny.a("/pudl", s, n, s2, n2, n3);
        a.i("e", n4);
        return a.g();
    }
    
    public static PlayerResponseModel F(final PlayerResponseModel playerResponseModel, final vjm vjm) {
        final PlayerResponseModelImpl playerResponseModelImpl = (PlayerResponseModelImpl)playerResponseModel;
        final ahbb ahbb = (ahbb)((ahbh)playerResponseModelImpl.b).toBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final akxi akxi = (akxi)ahbb.instance;
        akxi.d = null;
        akxi.b &= 0xFFFFFFFE;
        ((ahaz)ahbb).copyOnWrite();
        final akxi akxi2 = (akxi)ahbb.instance;
        akxi2.j = null;
        akxi2.b &= 0xFFFFFFBF;
        return (PlayerResponseModel)new PlayerResponseModelImpl((akxi)((ahaz)ahbb).build(), playerResponseModelImpl.c, vjm);
    }
    
    public static PlayerResponseModel G(final PlayerResponseModel playerResponseModel, final vjm vjm, final FormatStreamModel formatStreamModel, final FormatStreamModel formatStreamModel2, final aait aait) {
        final long k = playerResponseModel.k();
        akxm akxm;
        if ((akxm = playerResponseModel.z().h) == null) {
            akxm = akxm.b;
        }
        final long d = akxm.d;
        final ahbb ahbb = (ahbb)((ahbh)playerResponseModel.z()).toBuilder();
        final akxi akxi = (akxi)ahbb.instance;
        ahaz builder;
        if ((akxi.b & 0x10) != 0x0) {
            akxm akxm2;
            if ((akxm2 = akxi.h) == null) {
                akxm2 = akxm.b;
            }
            builder = ((ahbh)akxm2).toBuilder();
        }
        else {
            builder = null;
        }
        vjm b = vjm;
        if (builder != null) {
            final long max = Math.max(0L, d);
            builder.copyOnWrite();
            final akxm akxm3 = (akxm)builder.instance;
            final int c = akxm3.c;
            final int n = 1;
            akxm3.c = (c | 0x1);
            akxm3.d = max;
            final SparseArray aa = aa(Collections.unmodifiableList((List<?>)akxm3.f));
            int n2;
            if (formatStreamModel != null) {
                if (formatStreamModel.y()) {
                    aa.put(formatStreamModel.e(), (Object)formatStreamModel.a);
                }
                else {
                    final SparseArray aa2 = aa(Collections.unmodifiableList((List<?>)((akxm)builder.instance).e));
                    aa2.put(formatStreamModel.e(), (Object)formatStreamModel.a);
                    builder.copyOnWrite();
                    ((akxm)builder.instance).e = akxm.emptyProtobufList();
                    builder.aY((Iterable)ab(aa2));
                }
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (formatStreamModel2 != null) {
                aa.put(formatStreamModel2.e(), (Object)formatStreamModel2.a);
                n2 = n;
            }
            builder.copyOnWrite();
            ((akxm)builder.instance).f = akxm.emptyProtobufList();
            builder.aX((Iterable)ab(aa));
            final akxm h = (akxm)builder.build();
            ((ahaz)ahbb).copyOnWrite();
            final akxi akxi2 = (akxi)ahbb.instance;
            h.getClass();
            akxi2.h = h;
            akxi2.b |= 0x10;
            b = vjm;
            if (n2 != 0) {
                b = vjm;
                if (aait.q()) {
                    b = vjm.b;
                }
            }
        }
        return (PlayerResponseModel)new PlayerResponseModelImpl((akxi)((ahaz)ahbb).build(), k, PlayerResponseModelImpl.ag(b, (akxi)((ahaz)ahbb).build(), k));
    }
    
    public static PlayerResponseModel H(final PlayerResponseModel playerResponseModel, final vjm vjm, final FormatStreamModel formatStreamModel, final FormatStreamModel formatStreamModel2, final long n, long max, final boolean b, final aait aait) {
        final ahbb ahbb = (ahbb)((ahbh)playerResponseModel.z()).toBuilder();
        final akxi akxi = (akxi)ahbb.instance;
        ahaz builder;
        if ((akxi.b & 0x10) != 0x0) {
            akxm akxm;
            if ((akxm = akxi.h) == null) {
                akxm = akxm.b;
            }
            builder = ((ahbh)akxm).toBuilder();
        }
        else {
            builder = null;
        }
        vjm b2 = vjm;
        if (builder != null) {
            max = Math.max(0L, max);
            builder.copyOnWrite();
            final akxm akxm2 = (akxm)builder.instance;
            final ahbq a = akxm.a;
            final int c = akxm2.c;
            final int n2 = 1;
            akxm2.c = (c | 0x1);
            akxm2.d = max;
            if (!b) {
                builder.copyOnWrite();
                final akxm akxm3 = (akxm)builder.instance;
                akxm3.c &= 0xFFFFFFFD;
                akxm3.h = akxm.b.h;
                builder.copyOnWrite();
                final akxm akxm4 = (akxm)builder.instance;
                akxm4.c &= 0xFFFFFFFB;
                akxm4.i = akxm.b.i;
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
                    for (int size = ((akxm)builder.instance).f.size(), i = 0; i < size; ++i) {
                        final ajum av = builder.aV(i);
                        if (vjd.d(av.f)) {
                            sparseArray.put(av.d, (Object)av);
                        }
                    }
                    for (int size2 = ((akxm)builder.instance).e.size(), j = 0; j < size2; ++j) {
                        final ajum ajum = (ajum)((akxm)builder.instance).e.get(j);
                        sparseArray2.put(ajum.d, (Object)ajum);
                    }
                }
                n4 = 0;
            }
            if (formatStreamModel2 != null) {
                sparseArray.put(formatStreamModel2.e(), (Object)formatStreamModel2.a);
                n4 = n2;
            }
            else if (b) {
                for (int size3 = ((akxm)builder.instance).f.size(), k = n3; k < size3; ++k) {
                    final ajum av2 = builder.aV(k);
                    if (vjd.c(av2.f)) {
                        sparseArray.put(av2.d, (Object)av2);
                    }
                }
            }
            builder.copyOnWrite();
            ((akxm)builder.instance).f = akxm.emptyProtobufList();
            builder.aX((Iterable)ab(sparseArray));
            builder.copyOnWrite();
            ((akxm)builder.instance).e = akxm.emptyProtobufList();
            builder.aY((Iterable)ab(sparseArray2));
            final akxm h = (akxm)builder.build();
            ((ahaz)ahbb).copyOnWrite();
            final akxi akxi2 = (akxi)ahbb.instance;
            h.getClass();
            akxi2.h = h;
            akxi2.b |= 0x10;
            b2 = vjm;
            if (n4 != 0) {
                b2 = vjm;
                if (aait.q()) {
                    b2 = vjm.b;
                }
            }
        }
        return (PlayerResponseModel)new PlayerResponseModelImpl((akxi)((ahaz)ahbb).build(), n, PlayerResponseModelImpl.ag(b2, (akxi)((ahaz)ahbb).build(), n));
    }
    
    public static PlayerResponseModel I(final PlayerResponseModel playerResponseModel, final vjm vjm) {
        final PlayerResponseModelImpl playerResponseModelImpl = (PlayerResponseModelImpl)playerResponseModel;
        final ahbb ahbb = (ahbb)((ahbh)playerResponseModelImpl.b).toBuilder();
        final akxi akxi = (akxi)ahbb.instance;
        akxm h;
        if ((akxi.b & 0x10) != 0x0) {
            akxm akxm;
            if ((akxm = akxi.h) == null) {
                akxm = akxm.b;
            }
            final ahaz builder = ((ahbh)akxm).toBuilder();
            builder.copyOnWrite();
            ((akxm)builder.instance).f = akxm.emptyProtobufList();
            builder.copyOnWrite();
            ((akxm)builder.instance).e = akxm.emptyProtobufList();
            h = (akxm)builder.build();
        }
        else {
            h = null;
        }
        if (h != null) {
            ((ahaz)ahbb).copyOnWrite();
            final akxi akxi2 = (akxi)ahbb.instance;
            akxi2.h = h;
            akxi2.b |= 0x10;
        }
        else {
            ((ahaz)ahbb).copyOnWrite();
            final akxi akxi3 = (akxi)ahbb.instance;
            akxi3.h = null;
            akxi3.b &= 0xFFFFFFEF;
        }
        ((ahaz)ahbb).copyOnWrite();
        ((akxi)ahbb.instance).m = akxi.emptyProtobufList();
        return (PlayerResponseModel)new PlayerResponseModelImpl((akxi)((ahaz)ahbb).build(), playerResponseModelImpl.c, vjm);
    }
    
    public static ListenableFuture J(final ListenableFuture listenableFuture, final Set set, final aftz aftz, final Executor executor) {
        return afsw.f(listenableFuture, (Class)Exception.class, (aftz)new xow(set, aftz, 5), executor);
    }
    
    public static ListenableFuture K(final ListenableFuture listenableFuture, final int n, final ScheduledExecutorService scheduledExecutorService) {
        return aftq.e(listenableFuture, (aezf)new fqt(n, 13), (Executor)scheduledExecutorService);
    }
    
    public static final ListenableFuture L(final String s, ListenableFuture j, final ListenableFuture listenableFuture, final long n, final afft afft, final ScheduledExecutorService scheduledExecutorService, final aaag aaag, final aezs aezs, final int n2) {
        final afeq i = afwm.i((Iterable)afeq.s((Object)j, (Object)listenableFuture));
        final ListenableFuture t = afwm.t(afwm.n(K(j, 0, scheduledExecutorService)), n, TimeUnit.MILLISECONDS, scheduledExecutorService);
        final affr affr = new affr();
        affr.j((Iterable)afft);
        affr.h((Object)TimeoutException.class);
        j = J(t, (Set)affr.g(), (aftz)new zzh(i, scheduledExecutorService, afft, j, 3), scheduledExecutorService);
        final afum a = afum.a;
        afwm.w(j, (afva)new aacw(aezs, aaag, s, n2, listenableFuture, (Executor)a), (Executor)a);
        return aftq.e(j, (aezf)zxl.k, (Executor)afum.a);
    }
    
    public static int M(final int n) {
        int n2;
        if ((n & 0x8) != 0x0) {
            n2 = 2;
        }
        else {
            n2 = 0;
        }
        int n3 = n2;
        if ((n & 0x2) != 0x0) {
            n3 = (n2 | 0x8);
        }
        int n4 = n3;
        if ((n & 0x4) != 0x0) {
            n4 = (n3 | 0x10);
        }
        int n5 = n4;
        if ((n & 0x180) != 0x0) {
            n5 = (n4 | 0x40);
        }
        if ((n & 0x1000) != 0x0) {
            return n5 | 0x100;
        }
        return n5;
    }
    
    public static boolean N(final aaak aaak) {
        final int h = aaff.h(aaak);
        return (h == 3 || h == 4) && !TextUtils.isEmpty((CharSequence)aaff.u(aaak));
    }
    
    public static ahaz O(final aabi aabi) {
        final ahaz builder = ((ahbh)amvq.a).createBuilder();
        final long k = aabi.d / 1024L;
        builder.copyOnWrite();
        final amvq amvq = (amvq)builder.instance;
        amvq.b |= 0x100;
        amvq.k = k;
        final long m = aabi.e / 1024L;
        builder.copyOnWrite();
        final amvq amvq2 = (amvq)builder.instance;
        amvq2.b |= 0x400;
        amvq2.m = m;
        final int h = aaff.h(aabi.f);
        builder.copyOnWrite();
        final amvq amvq3 = (amvq)builder.instance;
        amvq3.b |= 0x8000;
        int n = 3;
        amvq3.q = (h == 3);
        final boolean z = aaff.Z(aabi.f);
        builder.copyOnWrite();
        final amvq amvq4 = (amvq)builder.instance;
        amvq4.b |= 0x2000000;
        amvq4.w = z;
        final amwz c = aaiz.c(aaff.d(aabi.f));
        builder.copyOnWrite();
        final amvq amvq5 = (amvq)builder.instance;
        amvq5.t = c.k;
        amvq5.b |= 0x100000;
        final int aj = aaff.aj(aabi.f);
        builder.copyOnWrite();
        final amvq amvq6 = (amvq)builder.instance;
        if (aj == 0) {
            throw null;
        }
        amvq6.u = aj - 1;
        amvq6.b |= 0x200000;
        final int ak = aaff.ak(aabi.f);
        builder.copyOnWrite();
        final amvq amvq7 = (amvq)builder.instance;
        if (ak != 0) {
            amvq7.r = ak - 1;
            amvq7.b |= 0x10000;
            final int h2 = aaff.h(aabi.f);
            Label_0430: {
                if (h2 != 0) {
                    if (h2 == 1) {
                        n = 2;
                        break Label_0430;
                    }
                    if (h2 == 2) {
                        break Label_0430;
                    }
                    if (h2 == 3) {
                        n = 4;
                        break Label_0430;
                    }
                    if (h2 == 4) {
                        n = 5;
                        break Label_0430;
                    }
                    if (h2 == 6) {
                        n = 7;
                        break Label_0430;
                    }
                    if (h2 == 7) {
                        n = 8;
                        break Label_0430;
                    }
                    ttr.b("Unrecognized offline transfer type, defaulting to unknown.");
                }
                n = 1;
            }
            builder.copyOnWrite();
            final amvq amvq8 = (amvq)builder.instance;
            amvq8.x = n - 1;
            amvq8.c |= 0x2;
            final String u = aaff.u(aabi.f);
            builder.copyOnWrite();
            final amvq amvq9 = (amvq)builder.instance;
            amvq9.b |= 0x1;
            amvq9.d = u;
            final String t = aaff.t(aabi.f);
            if (!TextUtils.isEmpty((CharSequence)t)) {
                builder.copyOnWrite();
                final amvq amvq10 = (amvq)builder.instance;
                amvq10.b |= 0x2;
                amvq10.e = t;
            }
            final String r = aaff.r(aabi.f);
            if (r != null) {
                builder.copyOnWrite();
                final amvq amvq11 = (amvq)builder.instance;
                amvq11.b |= 0x4;
                amvq11.f = r;
            }
            final String p = aaff.p(aabi.f);
            if (p != null) {
                builder.copyOnWrite();
                final amvq amvq12 = (amvq)builder.instance;
                amvq12.b |= 0x80000;
                amvq12.s = p;
            }
            final byte[] ag = aaff.ag(aabi.f);
            if (ag != null) {
                final ahab x = ahab.x(ag);
                builder.copyOnWrite();
                final amvq amvq13 = (amvq)builder.instance;
                amvq13.c |= 0x20;
                amvq13.z = x;
            }
            return builder;
        }
        throw null;
    }
    
    public static void P(final Intent intent, final String s, final amsv amsv) {
        if (amsv != null && amsv.l) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                intent.putExtra("push_notification_clientstreamz_logging", s);
            }
        }
    }
    
    public static zrx Q(final Intent intent) {
        final Bundle extras = intent.getExtras();
        zrx zrx;
        if (extras == null) {
            zrx = zrx.a("", -666);
        }
        else {
            zrx = zrx.b(tvb.i(extras.getString("notification_tag")), extras.getInt("notification_id", -666), tvb.i(extras.getString("client_id")));
        }
        return zrx;
    }
    
    public static aezp R(final StatusBarNotification statusBarNotification) {
        final Notification notification = statusBarNotification.getNotification();
        if (notification == null) {
            return (aezp)aeyo.a;
        }
        final Bundle extras = notification.extras;
        if (extras == null) {
            return (aezp)aeyo.a;
        }
        return aezp.j((Object)extras.getString("client_id"));
    }
    
    public static void S(final afq afq, final zrx zrx) {
        final String c = zrx.c;
        if (TextUtils.isEmpty((CharSequence)c)) {
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putString("client_id", c);
        final Bundle x = afq.x;
        if (x == null) {
            afq.x = new Bundle(bundle);
            return;
        }
        x.putAll(bundle);
    }
    
    public static void T(final Intent intent, final zrx zrx) {
        intent.putExtra("notification_tag", zrx.a);
        intent.putExtra("notification_id", zrx.b);
        intent.putExtra("client_id", zrx.c);
    }
    
    public static void U(final Intent intent, final aiqj aiqj) {
        if (aiqj == null) {
            return;
        }
        intent.putExtra("service_endpoint", ((agzk)aiqj).toByteArray());
    }
    
    public static void V(final Intent intent, final aiqj aiqj, final wyw wyw, final boolean b) {
        if (aiqj == null) {
            return;
        }
        aiqj aiqj2 = aiqj;
        if (wyw != null) {
            aiqj2 = aiqj;
            if (b) {
                final ahaz builder = ((ahbh)amqg.a).createBuilder();
                final String i = wyw.i();
                builder.copyOnWrite();
                final amqg amqg = (amqg)builder.instance;
                i.getClass();
                amqg.b |= 0x1;
                amqg.c = i;
                final amqg amqg2 = (amqg)builder.build();
                final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
                ahbb.e((ahaq)amqf.b, (Object)amqg2);
                aiqj2 = (aiqj)((ahaz)ahbb).build();
            }
        }
        intent.putExtra("navigation_endpoint", ((agzk)aiqj2).toByteArray());
    }
    
    public static void W(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static void X(final zlo zlo, final zll zll, final zlk zlk, final String s, final Throwable t) {
        Y(zlo, zll, zlk, s, t, afim.b);
    }
    
    public static void Y(final zlo zlo, final zll zll, final zlk zlk, final String s, final Throwable t, final Map map) {
        zlo.c(zll, zlk, s, t, map, (Function)zkn.h);
    }
    
    public static adet Z(final xra xra) {
        return new adet(xra, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static atiw a() {
        return ((atiw)atiy.aE()).aL();
    }
    
    private static SparseArray aa(final List list) {
        final SparseArray sparseArray = new SparseArray();
        for (final ajum ajum : agpi.T(list)) {
            sparseArray.put(ajum.d, (Object)ajum);
        }
        return sparseArray;
    }
    
    private static List ab(final SparseArray sparseArray) {
        final ArrayList list = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); ++i) {
            list.add(sparseArray.valueAt(i));
        }
        return list;
    }
    
    public static tdm b() {
        return (tdm)new tdt(20);
    }
    
    public static ListenableFuture c(final Context context, final Executor executor) {
        return afwm.q((Callable)new zup(context, 3), executor);
    }
    
    public static abmw d(final Context context, final abul abul, final abuj abuj, final abpu abpu, final abmz abmz, final abms abms, final oby oby, final abnc abnc, final List list) {
        return new abmw(context, abul, abuj, abpu.bN(), abms, abmz, oby, abnc, list);
    }
    
    public static abmz e(final Context context, final atke atke, final abul abul, final aalc aalc, final atke atke2) {
        return new abmz(context, atke, abul, aalc.d, atke2);
    }
    
    public static abul f(final abpu abpu) {
        return abpu.t().c = new abul();
    }
    
    public static Intent g(final Context context) {
        return new Intent(context, (Class)BackgroundPlayerService.class);
    }
    
    public static trc h(final trc trc, final aalc aalc) {
        if (aalc.g) {
            return trc;
        }
        return null;
    }
    
    public static ymb i(final aalc aalc, final ylz ylz) {
        if (aalc.a) {
            return (ymb)ylz;
        }
        return null;
    }
    
    public static abmq j(final abmr abmr) {
        return (abmq)new abna((abmq)abmr, xaa.c(105671));
    }
    
    public static abmq k(final abmy abmy) {
        return (abmq)new abna((abmq)abmy, xaa.c(105673));
    }
    
    public static abmq l(final abmy abmy) {
        return (abmq)new abna((abmq)abmy, xaa.c(105672));
    }
    
    public static abmq m(final abmy abmy) {
        return (abmq)new abna((abmq)abmy, xaa.c(105674));
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
    
    public static akvk o(final akvm akvm, final String s) {
        if (akvm == null) {
            return null;
        }
        for (final akvn akvn : akvm.c) {
            akvk akvk;
            if ((akvk = akvn.b) == null) {
                akvk = akvk.a;
            }
            if (akvk.b.equals(s)) {
                akvk akvk2;
                if ((akvk2 = akvn.b) == null) {
                    akvk2 = akvk.a;
                }
                return akvk2;
            }
        }
        return null;
    }
    
    public static amuw p(final akvp akvp, final String s) {
        for (final amux amux : akvp.d) {
            amuw amuw;
            if ((amuw = amux.b) == null) {
                amuw = amuw.a;
            }
            if (amuw.c.equals(s)) {
                amuw amuw2;
                if ((amuw2 = amux.b) == null) {
                    amuw2 = amuw.a;
                }
                return amuw2;
            }
        }
        return null;
    }
    
    public static aotp q(final aotp aotp, final List list) {
        final vgy vgy = new vgy(aotp);
        final HashSet set = new HashSet();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final vgx c = vgy.c((int)iterator.next());
            if (c != null) {
                set.add(c);
            }
        }
        final ArrayList list2 = new ArrayList();
        for (final vgx vgx : set) {
            final ahaz builder = ((ahbh)aoto.a).createBuilder();
            final int a = vgx.a;
            builder.copyOnWrite();
            final aoto aoto = (aoto)builder.instance;
            aoto.b |= 0x2;
            aoto.d = a;
            final int b = vgx.b;
            builder.copyOnWrite();
            final aoto aoto2 = (aoto)builder.instance;
            aoto2.b |= 0x4;
            aoto2.e = b;
            final String string = vgx.a().toString();
            builder.copyOnWrite();
            final aoto aoto3 = (aoto)builder.instance;
            string.getClass();
            aoto3.b |= 0x1;
            aoto3.c = string;
            list2.add(builder.build());
        }
        Collections.sort((List<Object>)list2, (Comparator<? super Object>)zks.g);
        final ahbb ahbb = (ahbb)((ahbh)aotp.a).createBuilder();
        ((ahaz)ahbb).copyOnWrite();
        final aotp aotp2 = (aotp)ahbb.instance;
        aotp2.a();
        agzk.addAll((Iterable)list2, (List)aotp2.c);
        return (aotp)((ahaz)ahbb).build();
    }
    
    public static String r(final String s, final String s2) {
        return String.format(Locale.US, "%s:%s:thumb", s, s2);
    }
    
    public static String s(final String s, final String s2) {
        return String.format(Locale.US, "%s:%s:master", s, s2);
    }
    
    public static void t(final amxe amxe, final wyw wyw, final String g, final String g2, final amwz amwz, final boolean d, final aaaz aaaz, final amta amta) {
        if (wyw == null) {
            return;
        }
        adkp.H(TextUtils.isEmpty((CharSequence)g) != TextUtils.isEmpty((CharSequence)g2));
        final ahaz builder = ((ahbh)alhi.a).createBuilder();
        final ahaz builder2 = ((ahbh)alhn.a).createBuilder();
        builder2.copyOnWrite();
        final alhn alhn = (alhn)builder2.instance;
        alhn.c = amwz.k;
        alhn.b |= 0x1;
        builder2.copyOnWrite();
        final alhn alhn2 = (alhn)builder2.instance;
        alhn2.b |= 0x2;
        alhn2.d = d;
        final aaaz a = aaaz.a;
        if (aaaz.ordinal() != 0) {
            builder2.copyOnWrite();
            final alhn alhn3 = (alhn)builder2.instance;
            alhn3.e = 0;
            alhn3.b |= 0x4;
        }
        else {
            builder2.copyOnWrite();
            final alhn alhn4 = (alhn)builder2.instance;
            alhn4.e = 1;
            alhn4.b |= 0x4;
        }
        if (!TextUtils.isEmpty((CharSequence)g)) {
            builder2.copyOnWrite();
            final alhn alhn5 = (alhn)builder2.instance;
            alhn5.f = 1;
            alhn5.b |= 0x8;
            builder2.copyOnWrite();
            final alhn alhn6 = (alhn)builder2.instance;
            g.getClass();
            alhn6.b |= 0x10;
            alhn6.g = g;
        }
        else if (!TextUtils.isEmpty((CharSequence)g2)) {
            builder2.copyOnWrite();
            final alhn alhn7 = (alhn)builder2.instance;
            alhn7.f = 2;
            alhn7.b |= 0x8;
            builder2.copyOnWrite();
            final alhn alhn8 = (alhn)builder2.instance;
            g2.getClass();
            alhn8.b |= 0x10;
            alhn8.g = g2;
        }
        if (amta != null) {
            builder2.copyOnWrite();
            final alhn alhn9 = (alhn)builder2.instance;
            alhn9.h = amta.f;
            alhn9.b |= 0x20;
        }
        builder.copyOnWrite();
        final alhi alhi = (alhi)builder.instance;
        final alhn i = (alhn)builder2.build();
        i.getClass();
        alhi.i = i;
        alhi.b |= 0x10;
        if ((amxe.b & 0x80) != 0x0 && amxe.i.d() > 0) {
            wyw.J(3, (wzz)new wyt(amxe.i), (alhi)builder.build());
            return;
        }
        String s = g;
        if (TextUtils.isEmpty((CharSequence)g)) {
            s = g2;
        }
        wyw.J(3, xmm.ac(wyw.g((Object)s, xaa.c(7111))), (alhi)builder.build());
    }
    
    public static void u(final amxe amxe, final wyw wyw) {
        wyw.t((wzz)new wyt(amxe.i), (alhi)null);
    }
    
    public static tvl v(final Context context, final arkg arkg, final ttl ttl) {
        return new tvl(context, (Handler)arkg.a(), ttl, (byte[])null);
    }
    
    public static void w(final aaak aaak, final aaak aaak2, final String s) {
        final Class clazz = (Class)aaff.a.get(s);
        if (clazz == Boolean.TYPE) {
            aaak2.i(s, aaak.o(s));
            return;
        }
        if (clazz == Integer.TYPE) {
            aaak2.l(s, aaak.b(s));
            return;
        }
        if (clazz == Long.TYPE) {
            aaak2.m(s, aaak.d(s));
            return;
        }
        if (clazz == Double.TYPE) {
            aaak2.k(s, aaak.a(s));
            return;
        }
        if (clazz == byte[].class) {
            final byte[] q = aaak.q(s);
            if (q != null) {
                aaak2.j(s, q);
            }
        }
        else if (clazz == String.class) {
            final String g = aaak.g(s);
            if (g != null) {
                aaak2.n(s, g);
            }
        }
    }
    
    public static final aaes x(final aaax aaax, final int n, final ArrayList list, final int n2) {
        if (n >= 0) {
            return new aaes(aaax, n, n2, (amtf[])list.toArray(new amtf[list.size()]));
        }
        throw new IllegalArgumentException("OfflineStreamVerificationResult.Builder not properly initialized");
    }
    
    public static final void y(final long d, final aaax aaax, final ArrayList list) {
        final ahaz builder = ((ahbh)amtf.a).createBuilder();
        final int a = aaax.a();
        builder.copyOnWrite();
        final amtf amtf = (amtf)builder.instance;
        amtf.b |= 0x1;
        amtf.c = a;
        builder.copyOnWrite();
        final amtf amtf2 = (amtf)builder.instance;
        amtf2.b |= 0x2;
        amtf2.d = d;
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
