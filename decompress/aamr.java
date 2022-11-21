import j$.util.concurrent.ThreadLocalRandom;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import android.widget.ImageView$ScaleType;
import java.util.Iterator;
import android.view.ViewGroup;
import android.view.View;
import java.util.Map;
import app.revanced.integrations.patches.MinimizedPlaybackPatch;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamr
{
    public static otr A(final Object o) {
        return B(o, null);
    }
    
    public static otr B(final Object o, final alji alji) {
        alji alji2 = alji;
        if (alji == null) {
            alji2 = null;
        }
        return (otr)new aceq(C(o, alji2, null, null, null), 0);
    }
    
    public static final acep C(final Object o, final alji alji, final xab xab, final aisc aisc, final List list) {
        return new acep(o, alji, xab, aisc, list);
    }
    
    public static final Class[] a(final aaqi aaqi, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { aaoe.class, aapf.class, aapl.class, aapp.class, aapv.class };
        }
        if (n == 0) {
            aaqi.y((aaoe)o);
            return null;
        }
        if (n == 1) {
            aaqi.A((aapf)o);
            return null;
        }
        if (n == 2) {
            final aapl aapl = (aapl)o;
            aaqi.E();
            return null;
        }
        if (n == 3) {
            aaqi.d((aapp)o);
            return null;
        }
        if (n == 4) {
            final aapv aapv = (aapv)o;
            aaqi.x(aapv);
            aaqi.z(aapv);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static boolean b(final int n) {
        return c(n, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14);
    }
    
    public static boolean c(final int n, final int... array) {
        for (int i = 0; i < array.length; ++i) {
            if (n == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static int d(final int n) {
        return n - 1;
    }
    
    public static apvn e(final int n) {
        switch (n) {
            default: {
                return apvn.a;
            }
            case 9:
            case 10: {
                return apvn.f;
            }
            case 8: {
                return apvn.h;
            }
            case 7: {
                return apvn.g;
            }
            case 6: {
                return apvn.e;
            }
            case 5: {
                return apvn.d;
            }
            case 4: {
                return apvn.j;
            }
            case 3: {
                return apvn.c;
            }
            case 2: {
                return apvn.b;
            }
        }
    }
    
    public static boolean f(final PlayerResponseModel playerResponseModel, final oco oco) {
        return playerResponseModel != null && playerResponseModel.n() != null && playerResponseModel.n().t(oco.d());
    }
    
    public static int g(final int n) {
        return n - 1;
    }
    
    public static int h(final int n, final String s) {
        int n2 = n;
        if (n == 0) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                n2 = 0;
            }
            else {
                n2 = -1;
            }
        }
        return n2;
    }
    
    public static aiaj i(final akyz akyz) {
        if (!m(akyz) && akyz != null && (akyz.b & 0x800) != 0x0) {
            akyq akyq;
            if ((akyq = akyz.j) == null) {
                akyq = akyq.a;
            }
            aiak a;
            if (akyq.b == 64657230) {
                a = (aiak)akyq.c;
            }
            else {
                a = aiak.a;
            }
            if ((a.b & 0x2) != 0x0) {
                akyq akyq2;
                if ((akyq2 = akyz.j) == null) {
                    akyq2 = akyq.a;
                }
                aiak a2;
                if (akyq2.b == 64657230) {
                    a2 = (aiak)akyq2.c;
                }
                else {
                    a2 = aiak.a;
                }
                aiaj aiaj;
                if ((aiaj = a2.d) == null) {
                    aiaj = aiaj.a;
                }
                return aiaj;
            }
        }
        return null;
    }
    
    public static aizd j(final akyz akyz) {
        if ((akyz.b & 0x40) != 0x0) {
            akyy akyy;
            if ((akyy = akyz.g) == null) {
                akyy = akyy.a;
            }
            if (akyy.b == 64099105) {
                akyy akyy2;
                if ((akyy2 = akyz.g) == null) {
                    akyy2 = akyy.a;
                }
                aizd a;
                if (akyy2.b == 64099105) {
                    a = (aizd)akyy2.c;
                }
                else {
                    a = aizd.a;
                }
                return a;
            }
        }
        return null;
    }
    
    public static amzj k(final akyz akyz) {
        if (akyz != null) {
            akyu akyu;
            if ((akyu = akyz.l) == null) {
                akyu = akyu.a;
            }
            if (akyu.b == 60572968) {
                akyu akyu2;
                if ((akyu2 = akyz.l) == null) {
                    akyu2 = akyu.a;
                }
                amzj a;
                if (akyu2.b == 60572968) {
                    a = (amzj)akyu2.c;
                }
                else {
                    a = amzj.a;
                }
                return a;
            }
        }
        return null;
    }
    
    public static anhk l(final akyz akyz) {
        if (akyz != null && (akyz.b & 0x40) != 0x0) {
            akyy akyy;
            if ((akyy = akyz.g) == null) {
                akyy = akyy.a;
            }
            anhk a;
            if (akyy.b == 73238862) {
                akyy akyy2;
                if ((akyy2 = akyz.g) == null) {
                    akyy2 = akyy.a;
                }
                if (akyy2.b == 73238862) {
                    a = (anhk)akyy2.c;
                }
                else {
                    a = anhk.a;
                }
            }
            else {
                a = null;
            }
            if (a != null && !a.c.isEmpty()) {
                final int b = a.b;
                if ((b & 0x4) != 0x0 && (b & 0x2) != 0x0) {
                    return a;
                }
            }
        }
        return null;
    }
    
    public static boolean m(final akyz akyz) {
        return MinimizedPlaybackPatch.isMinimizedPlaybackEnabled();
    }
    
    public static boolean n(final akyz akyz) {
        if (akyz != null && (akyz.b & 0x80000) != 0x0) {
            final int cy = aqvq.cy(akyz.c);
            if (cy != 0) {
                if (cy == 7) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean o(final akyz akyz) {
        if (akyz != null) {
            final int cy = aqvq.cy(akyz.c);
            if (cy != 0) {
                if (cy != 1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean p(final akyz akyz) {
        if (akyz != null) {
            akyw akyw;
            if ((akyw = akyz.h) == null) {
                akyw = akyw.a;
            }
            andp a;
            if (akyw.b == 151635310) {
                a = (andp)akyw.c;
            }
            else {
                a = andp.a;
            }
            if (a.c) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean q(final akyz akyz) {
        if (akyz == null) {
            return false;
        }
        int cy;
        if ((cy = aqvq.cy(akyz.c)) == 0) {
            cy = 1;
        }
        return cy == 1 || cy == 4 || cy == 5 || cy == 6 || cy == 10;
    }
    
    public static boolean r(final akyz akyz) {
        if (akyz != null && (akyz.b & 0x80000) != 0x0) {
            akyt akyt;
            if ((akyt = akyz.o) == null) {
                akyt = akyt.a;
            }
            alwr alwr;
            if ((alwr = akyt.c) == null) {
                alwr = alwr.a;
            }
            return alwr.h;
        }
        return false;
    }
    
    public static afbh s(final ots ots) {
        final ouu f = ots.f;
        final Object d = ots.d;
        final ovc h = ots.h;
        xab a = null;
        Object d2;
        if (h == null) {
            d2 = null;
        }
        else {
            d2 = h.d;
        }
        if (f instanceof acet) {
            a = ((acet)f).a;
        }
        xab a2;
        if ((a2 = a) == null) {
            a2 = a;
            if (d2 instanceof acgy) {
                a2 = ((acgy)d2).a;
            }
        }
        xab c;
        if ((c = a2) == null) {
            c = a2;
            if (d instanceof acep) {
                c = ((acep)d).c;
            }
        }
        return afbh.j(c);
    }
    
    public static void t(final Map map, final ots ots) {
        final afbh s = s(ots);
        if (s.h()) {
            map.put("com.google.android.libraries.youtube.logging.interaction_logger", s.c());
        }
    }
    
    public static void u(final ahct ahct, final ots ots, View view) {
        aisd aisd;
        if ((aisd = ((aisc)ahct.instance).e) == null) {
            aisd = aisd.a;
        }
        final ahct ahct2 = (ahct)((ahcz)aisd).toBuilder();
        final owk c = ots.c;
        if (view != null) {
            if (c != null) {
                final float density = view.getResources().getDisplayMetrics().density;
                if (density != 0.0f) {
                    final int[] array = new int[2];
                    view.getLocationOnScreen(array);
                    final ahcr builder = ((ahcz)aliy.a).createBuilder();
                    final float n = c.a / density;
                    builder.copyOnWrite();
                    final aliy aliy = (aliy)builder.instance;
                    aliy.c |= 0x1;
                    aliy.d = (int)n;
                    final float n2 = c.b / density;
                    builder.copyOnWrite();
                    final aliy aliy2 = (aliy)builder.instance;
                    aliy2.c |= 0x2;
                    aliy2.e = (int)n2;
                    final float n3 = view.getMeasuredWidth() / density;
                    builder.copyOnWrite();
                    final aliy aliy3 = (aliy)builder.instance;
                    aliy3.c |= 0x4;
                    aliy3.f = (int)n3;
                    final float n4 = view.getMeasuredHeight() / density;
                    builder.copyOnWrite();
                    final aliy aliy4 = (aliy)builder.instance;
                    aliy4.c |= 0x8;
                    aliy4.g = (int)n4;
                    final float n5 = array[0] / density;
                    builder.copyOnWrite();
                    final aliy aliy5 = (aliy)builder.instance;
                    aliy5.c |= 0x100;
                    aliy5.l = (int)n5;
                    final float n6 = array[1] / density;
                    builder.copyOnWrite();
                    final aliy aliy6 = (aliy)builder.instance;
                    aliy6.c |= 0x200;
                    aliy6.m = (int)n6;
                    final int orientation = view.getResources().getConfiguration().orientation;
                    if (orientation != 1) {
                        if (orientation != 2) {
                            if (orientation != 3) {
                                final ajgk a = ajgk.a;
                                builder.copyOnWrite();
                                final aliy aliy7 = (aliy)builder.instance;
                                aliy7.n = a.h;
                                aliy7.c |= 0x800;
                            }
                            else {
                                final ajgk g = ajgk.g;
                                builder.copyOnWrite();
                                final aliy aliy8 = (aliy)builder.instance;
                                aliy8.n = g.h;
                                aliy8.c |= 0x800;
                            }
                        }
                        else {
                            final ajgk f = ajgk.f;
                            builder.copyOnWrite();
                            final aliy aliy9 = (aliy)builder.instance;
                            aliy9.n = f.h;
                            aliy9.c |= 0x800;
                        }
                    }
                    else {
                        final ajgk b = ajgk.b;
                        builder.copyOnWrite();
                        final aliy aliy10 = (aliy)builder.instance;
                        aliy10.n = b.h;
                        aliy10.c |= 0x800;
                    }
                    while (view != null && !(view instanceof dvx)) {
                        view = (View)view.getParent();
                    }
                    if (view instanceof dvx) {
                        final int[] array2 = new int[2];
                        view.getLocationOnScreen(array2);
                        final float n7 = view.getMeasuredWidth() / density;
                        builder.copyOnWrite();
                        final aliy aliy11 = (aliy)builder.instance;
                        aliy11.c |= 0x40;
                        aliy11.j = (int)n7;
                        final float n8 = view.getMeasuredHeight() / density;
                        builder.copyOnWrite();
                        final aliy aliy12 = (aliy)builder.instance;
                        aliy12.c |= 0x80;
                        aliy12.k = (int)n8;
                        final float n9 = (array[0] - array2[0]) / density;
                        builder.copyOnWrite();
                        final aliy aliy13 = (aliy)builder.instance;
                        aliy13.c |= 0x10;
                        aliy13.h = (int)n9;
                        final float n10 = (array[1] - array2[1]) / density;
                        builder.copyOnWrite();
                        final aliy aliy14 = (aliy)builder.instance;
                        aliy14.c |= 0x20;
                        aliy14.i = (int)n10;
                    }
                    ahct2.e((ahci)aliy.b, (Object)builder.build());
                }
            }
        }
        final Object d = ots.d;
        if (d instanceof acep) {
            final alji b2 = ((acep)d).b;
            if (b2 != null) {
                ahct2.e((ahci)alku.a, (Object)b2);
            }
        }
        final aisd e = (aisd)((ahcr)ahct2).build();
        ((ahcr)ahct).copyOnWrite();
        final aisc aisc = (aisc)ahct.instance;
        e.getClass();
        aisc.e = e;
        aisc.b |= 0x2;
    }
    
    public static aowb v(final aqjc aqjc) {
        final ahct ahct = (ahct)((ahcz)aowb.a).createBuilder();
        if (aqjc == null) {
            return (aowb)((ahcr)ahct).build();
        }
        for (final aqje aqje : aqjc.c) {
            if (aqje.c == 1) {
                final ahcr builder = ((ahcz)aowa.a).createBuilder();
                final int c = aqje.c;
                String s = "";
                String s2;
                if (c == 1) {
                    s2 = (String)aqje.d;
                }
                else {
                    s2 = "";
                }
                String s3;
                if (!s2.startsWith("//")) {
                    s3 = "";
                }
                else {
                    s3 = "https:";
                }
                if (aqje.c == 1) {
                    s = (String)aqje.d;
                }
                final String concat = s3.concat(String.valueOf(s));
                builder.copyOnWrite();
                final aowa aowa = (aowa)builder.instance;
                aowa.b |= 0x1;
                aowa.c = concat;
                final int e = aqje.e;
                builder.copyOnWrite();
                final aowa aowa2 = (aowa)builder.instance;
                aowa2.b |= 0x2;
                aowa2.d = e;
                final int f = aqje.f;
                builder.copyOnWrite();
                final aowa aowa3 = (aowa)builder.instance;
                aowa3.b |= 0x4;
                aowa3.e = f;
                ahct.cK(builder);
            }
        }
        return (aowb)((ahcr)ahct).build();
    }
    
    public static ImageView$ScaleType w(int n) {
        if (n == 0) {
            throw null;
        }
        if (--n == 2) {
            return ImageView$ScaleType.FIT_CENTER;
        }
        if (n == 3) {
            return ImageView$ScaleType.CENTER_CROP;
        }
        if (n != 4) {
            return ImageView$ScaleType.FIT_XY;
        }
        return ImageView$ScaleType.CENTER;
    }
    
    public static ouy x(final boolean b, final arna arna, final arna arna2, final arna arna3, final arna arna4) {
        if (b) {
            return (ouy)new oxr((aamr)arna.a(), (oyh)arna2.a(), (Executor)arna3.a(), (acem)arna4.a(), (byte[])null, (byte[])null);
        }
        return ouy.a;
    }
    
    public static final long y() {
        return SystemClock.elapsedRealtimeNanos() / 1000L;
    }
    
    public static boolean z() {
        return ThreadLocalRandom.current().nextInt(1000) == 0;
    }
}
