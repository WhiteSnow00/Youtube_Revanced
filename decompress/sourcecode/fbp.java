import j$.util.Objects;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;
import java.util.HashMap;
import j$.util.Optional;
import java.util.Date;
import android.text.format.DateFormat;
import android.net.Uri;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbp
{
    @Backup
    public static final String BACKGROUND_AUDIO_POLICY = "background_audio_policy";
    @Backup
    public static final String SHOW_BACKGROUND_PLAYBACK_SETTINGS_DIALOG = "show_background_playback_settings_dialog";
    
    private fbp() {
    }
    
    public static void A(final vdv vdv, final afdu afdu) {
        final afie k = afdu.k();
        while (((Iterator)k).hasNext()) {
            vdv.j((vdj)((Iterator)k).next());
        }
    }
    
    public static void B(final vdv vdv, final Map map, final zyz zyz, final aexg aexg, final idn idn) {
        final String a = zyz.a.a;
        final Set set = map.get(a);
        final HashSet set2 = new HashSet(zyz.b);
        if (set != null) {
            final afhf j = aesy.j((Set)set, (Set)set2);
            if (idn != null) {
                idn.a((Object)j);
            }
            A(vdv, (afdu)aexg.apply((Object)aesy.j((Set)set2, (Set)set)));
        }
        else {
            A(vdv, (afdu)aexg.apply((Object)set2));
        }
        map.put(a, set2);
    }
    
    public static afdu C(final Map map, final String s) {
        final afds i = afdu.i();
        final List list = map.get(s);
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                for (final akuf akuf : ((akug)iterator.next()).b) {
                    if (!akuf.d.isEmpty()) {
                        i.h(akuf.d);
                    }
                }
            }
        }
        return i.g();
    }
    
    public static apvx D(final agp agp) {
        final apvx d = apvy.d(gkt.aV((String)agp.e));
        final Object e = agp.e;
        final agza a = d.a;
        a.copyOnWrite();
        final apwa apwa = (apwa)a.instance;
        final apwa a2 = apwa.a;
        apwa.c |= 0x4;
        apwa.e = (String)e;
        final Object b = agp.b;
        final agza a3 = d.a;
        a3.copyOnWrite();
        final apwa apwa2 = (apwa)a3.instance;
        b.getClass();
        apwa2.c |= 0x8;
        apwa2.f = (String)b;
        final aorm e2 = ((vey)agp.c).e();
        final agza a4 = d.a;
        a4.copyOnWrite();
        final apwa apwa3 = (apwa)a4.instance;
        e2.getClass();
        apwa3.g = e2;
        apwa3.c |= 0x10;
        return d;
    }
    
    public static hyr E() {
        return new hyr((Class)ijd.class);
    }
    
    private static ajah F(final int d) {
        final agza builder = ((agzi)ajah.a).createBuilder();
        builder.copyOnWrite();
        final ajah ajah = (ajah)builder.instance;
        ajah.b |= 0x2;
        ajah.d = d;
        return (ajah)builder.build();
    }
    
    public static Uri a(final Context context) {
        return tdb.k(context, "backgroundsettings", "backgroundsettings.pb");
    }
    
    public static int[] b() {
        return new int[] { 1, 2, 3, 4, 5, 6 };
    }
    
    public static anyf c(final int n, int i, final String s) {
        final agza builder = ((agzi)anyf.a).createBuilder();
        int max;
        agza builder2;
        ajah f;
        anxz anxz;
        boolean d;
        anxz anxz2;
        agza builder3;
        anxz c;
        anyb anyb;
        anyf anyf;
        anyb anyb2;
        for (max = Math.max(1, i), i = 0; i < 1440; i += max) {
            builder2 = ((agzi)anxz.a).createBuilder();
            f = F(i);
            builder2.copyOnWrite();
            anxz = (anxz)builder2.instance;
            f.getClass();
            anxz.c = f;
            anxz.b |= 0x2;
            d = (i == n / max * max);
            builder2.copyOnWrite();
            anxz2 = (anxz)builder2.instance;
            anxz2.b |= 0x4;
            anxz2.d = d;
            builder3 = ((agzi)anyb.a).createBuilder();
            c = (anxz)builder2.build();
            builder3.copyOnWrite();
            anyb = (anyb)builder3.instance;
            c.getClass();
            anyb.c = c;
            anyb.b = 190692730;
            builder.copyOnWrite();
            anyf = (anyf)builder.instance;
            anyb2 = (anyb)builder3.build();
            anyb2.getClass();
            anyf.a();
            anyf.f.add((Object)anyb2);
        }
        final agza clone = builder.clone();
        final ajsq h = abyh.h(s);
        clone.copyOnWrite();
        final anyf anyf2 = (anyf)clone.instance;
        h.getClass();
        anyf2.d = h;
        anyf2.b |= 0x2;
        return (anyf)clone.build();
    }
    
    public static String d(final Context context, final int n) {
        final ajah f = F(n);
        return DateFormat.getTimeFormat(context).format(new Date(0, 0, 0, f.c, f.d));
    }
    
    public static final orr f(final boolean b, final boolean b2, final fsj fsj, final Optional optional) {
        final HashMap a = new HashMap();
        a.put("isAutoNav", b);
        a.put("supportsAutoAdvance", b2);
        a.put("playerTrackingViewVisibilityListener", fsj);
        a.put("inlinePlayerParentAllocator", optional);
        final ves a2 = orr.a();
        a2.c = "InlinePlaybackCommandEventData";
        a2.a = a;
        return a2.f();
    }
    
    public static void g(@dyi final aceo aceo, final aorl aorl, final int n, final int n2, @dyi final otd otd, @dyi final orz orz, @dyi final Executor executor) {
        try {
            executor.execute((Runnable)new frp(aceo, aorl, n, n2, 0));
        }
        catch (final RejectedExecutionException ex) {
            otd.a(28, "Image preload rejected", orz, (Throwable)ex);
        }
    }
    
    public static final fre h(final ActiveStateScrollSelectionController activeStateScrollSelectionController) {
        return new fre(activeStateScrollSelectionController);
    }
    
    public static Bitmap i(final View view) {
        if (!(view instanceof ImageView)) {
            return null;
        }
        final Drawable drawable = ((ImageView)view).getDrawable();
        if (!(drawable instanceof ohj)) {
            return null;
        }
        final Bitmap e = ((ohj)drawable).e;
        return e.copy(e.getConfig(), false);
    }
    
    public static View j(final View view) {
        if (view.getTag(2131428821) instanceof aqdw) {
            return view;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View j = j(viewGroup.getChildAt(i));
                if (j != null) {
                    return j;
                }
            }
        }
        return null;
    }
    
    public static aorm k(final Object o) {
        if (!(o instanceof aqdw)) {
            return null;
        }
        final aqdw aqdw = (aqdw)o;
        final agzc agzc = (agzc)((agzi)aorm.a).createBuilder();
        for (final aqdy aqdy : aqdw.c) {
            final agza builder = aorl.a.createBuilder();
            final int c = aqdy.c;
            String s = "";
            String s2;
            if (c == 1) {
                s2 = (String)aqdy.d;
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
            if (aqdy.c == 1) {
                s = (String)aqdy.d;
            }
            builder.copyOnWrite();
            final aorl aorl = (aorl)builder.instance;
            aorl.b |= 0x1;
            aorl.c = s3.concat(String.valueOf(s));
            final int e = aqdy.e;
            builder.copyOnWrite();
            final aorl aorl2 = (aorl)builder.instance;
            aorl2.b |= 0x2;
            aorl2.d = e;
            final int f = aqdy.f;
            builder.copyOnWrite();
            final aorl aorl3 = (aorl)builder.instance;
            aorl3.b |= 0x4;
            aorl3.e = f;
            agzc.cI(builder);
        }
        return (aorm)((agza)agzc).build();
    }
    
    public static final iim l(final tku tku, final asjc asjc) {
        tku.getClass();
        asjc.getClass();
        return new iim(tku, asjc);
    }
    
    public static int m(int n, final int n2, final int n3) {
        if (n == alyo.b.a()) {
            n = n2 - 1;
            if (n != 1) {
                if (n != 2) {
                    if (n3 == 2) {
                        return -5;
                    }
                }
                else if (n3 == 2) {
                    return -5;
                }
            }
            else if (n3 == 2) {
                return -5;
            }
            return -4;
        }
        if (n == alxg.b.a()) {
            n = n2 - 1;
            if (n != 1) {
                if (n != 2) {
                    if (n3 == 2) {
                        return -5;
                    }
                }
                else if (n3 == 2) {
                    return -5;
                }
            }
            else if (n3 == 2) {
                return -5;
            }
            return -4;
        }
        return 0;
    }
    
    public static Optional n(final zzu zzu, final zkh zkh) {
        final aack a = zzu.a();
        final String q = a.q();
        if (!Objects.equals((Object)zkh.d(), (Object)q) && !Objects.equals((Object)zkh.b(), (Object)q)) {
            return Optional.empty();
        }
        return Optional.of((Object)a);
    }
    
    public static ahkd o(String by) {
        final String au = gkt.aU(by);
        au.getClass();
        agot.E(au.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)ahkf.a).createBuilder();
        builder.copyOnWrite();
        final ahkf ahkf = (ahkf)builder.instance;
        ahkf.c |= 0x1;
        ahkf.d = au;
        final ahkd ahkd = new ahkd(builder);
        by = gkt.by(by);
        final agza a = ahkd.a;
        a.copyOnWrite();
        final ahkf ahkf2 = (ahkf)a.instance;
        by.getClass();
        ahkf2.c |= 0x2;
        ahkf2.e = by;
        return ahkd;
    }
    
    public static alyl p(final zzg zzg) {
        final String f = zzg.f();
        final aorm d = zzg.d();
        final String bl = gkt.bl(f);
        bl.getClass();
        agot.E(bl.isEmpty() ^ true, (Object)"key cannot be empty");
        final agzc agzc = (agzc)((agzi)alyo.a).createBuilder();
        ((agza)agzc).copyOnWrite();
        final alyo alyo = (alyo)agzc.instance;
        alyo.c |= 0x1;
        alyo.d = bl;
        final alyl alyl = new alyl(agzc);
        final agzc a = alyl.a;
        ((agza)a).copyOnWrite();
        final alyo alyo2 = (alyo)a.instance;
        f.getClass();
        alyo2.c |= 0x4;
        alyo2.e = f;
        final String j = zzg.j();
        final agzc a2 = alyl.a;
        ((agza)a2).copyOnWrite();
        final alyo alyo3 = (alyo)a2.instance;
        j.getClass();
        alyo3.c |= 0x10;
        alyo3.g = j;
        final long time = zzg.c.getTime();
        final agzc a3 = alyl.a;
        final long longValue = time;
        ((agza)a3).copyOnWrite();
        final alyo alyo4 = (alyo)a3.instance;
        alyo4.c |= 0x20;
        alyo4.h = longValue;
        final int n = (int)zzg.a();
        final agzc a4 = alyl.a;
        final int intValue = n;
        ((agza)a4).copyOnWrite();
        final alyo alyo5 = (alyo)a4.instance;
        alyo5.c |= 0x40;
        alyo5.i = intValue;
        aorm a5 = d;
        if (d == null) {
            a5 = aorm.a;
        }
        final agzc a6 = alyl.a;
        ((agza)a6).copyOnWrite();
        final alyo alyo6 = (alyo)a6.instance;
        a5.getClass();
        alyo6.j = a5;
        alyo6.c |= 0x80;
        final long b = zzg.b();
        final agzc a7 = alyl.a;
        final long longValue2 = b;
        ((agza)a7).copyOnWrite();
        final alyo alyo7 = (alyo)a7.instance;
        alyo7.c |= 0x200;
        alyo7.m = longValue2;
        final agza builder = ((agzi)apwz.a).createBuilder();
        final String i = zzg.i();
        builder.copyOnWrite();
        final apwz apwz = (apwz)builder.instance;
        i.getClass();
        apwz.b |= 0x1;
        apwz.c = i;
        final String e = zzg.e();
        builder.copyOnWrite();
        final apwz apwz2 = (apwz)builder.instance;
        e.getClass();
        apwz2.b |= 0x4;
        apwz2.e = e;
        final String h = zzg.h();
        builder.copyOnWrite();
        final apwz apwz3 = (apwz)builder.instance;
        h.getClass();
        apwz3.b |= 0x2;
        apwz3.d = h;
        final agzc a8 = alyl.a;
        ((agza)a8).copyOnWrite();
        final alyo alyo8 = (alyo)a8.instance;
        final apwz p = (apwz)builder.build();
        p.getClass();
        alyo8.p = p;
        alyo8.c |= 0x1000;
        final agzc agzc2 = (agzc)((agzi)alyq.a).createBuilder();
        final String bb = gkt.bB(f);
        ((agza)agzc2).copyOnWrite();
        final alyq alyq = (alyq)agzc2.instance;
        bb.getClass();
        alyq.b |= 0x1;
        alyq.c = bb;
        final agzc a9 = alyl.a;
        ((agza)a9).copyOnWrite();
        final alyo alyo9 = (alyo)a9.instance;
        final alyq q = (alyq)((agza)agzc2).build();
        q.getClass();
        alyo9.q = q;
        alyo9.c |= 0x2000;
        final String ba = gkt.bA(f);
        final agzc a10 = alyl.a;
        ((agza)a10).copyOnWrite();
        final alyo alyo10 = (alyo)a10.instance;
        ba.getClass();
        alyo10.c |= 0x4000;
        alyo10.r = ba;
        final agp e2 = zzg.e;
        if (e2 != null) {
            final String av = gkt.aV((String)e2.e);
            final agzc a11 = alyl.a;
            ((agza)a11).copyOnWrite();
            final alyo alyo11 = (alyo)a11.instance;
            av.getClass();
            alyo11.c |= 0x8;
            alyo11.f = av;
        }
        return alyl;
    }
    
    public static anib q(final aorm c) {
        final agza builder = ((agzi)ania.a).createBuilder();
        if (c != null) {
            builder.copyOnWrite();
            final ania ania = (ania)builder.instance;
            ania.c = c;
            ania.b |= 0x1;
        }
        final agza builder2 = ((agzi)anib.a).createBuilder();
        final ania c2 = (ania)builder.build();
        builder2.copyOnWrite();
        final anib anib = (anib)builder2.instance;
        c2.getClass();
        anib.c = c2;
        anib.b = 2;
        return (anib)builder2.build();
    }
    
    public static aoux r(final String s, final aouv aouv, final afcr afcr, final aexq aexq) {
        final aoux d = aouy.d(gkt.by(s));
        d.c(gkt.bq(s));
        d.g(aouv);
        if (afcr != null) {
            if (!((List)afcr).isEmpty()) {
                final afif d2 = afcr.D();
                while (((Iterator)d2).hasNext()) {
                    final aojk aojk = (aojk)((Iterator)d2).next();
                    final agzc a = d.a;
                    ((agza)a).copyOnWrite();
                    final aova aova = (aova)a.instance;
                    final aova a2 = aova.a;
                    aojk.getClass();
                    final agzy f = aova.f;
                    if (!f.c()) {
                        aova.f = agzi.mutableCopy(f);
                    }
                    aova.f.add((Object)aojk);
                }
            }
        }
        if (aexq.h()) {
            d.e((aouw)aexq.c());
        }
        return d;
    }
    
    public static aplj s(final String e, long longValue) {
        final String bb = gkt.bB(e);
        bb.getClass();
        agot.E(bb.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = aplm.a.createBuilder();
        builder.copyOnWrite();
        final aplm aplm = (aplm)builder.instance;
        aplm.c |= 0x1;
        aplm.d = bb;
        final aplj aplj = new aplj(builder);
        final agza a = aplj.a;
        a.copyOnWrite();
        final aplm aplm2 = (aplm)a.instance;
        e.getClass();
        aplm2.c |= 0x2;
        aplm2.e = e;
        final agza a2 = aplj.a;
        longValue = longValue;
        a2.copyOnWrite();
        final aplm aplm3 = (aplm)a2.instance;
        aplm3.c |= 0x4;
        aplm3.f = longValue;
        return aplj;
    }
    
    public static apwg t(String br, long longValue) {
        final String az = gkt.aZ(br);
        az.getClass();
        agot.E(az.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)apwj.a).createBuilder();
        builder.copyOnWrite();
        final apwj apwj = (apwj)builder.instance;
        apwj.c |= 0x1;
        apwj.d = az;
        final apwg apwg = new apwg(builder);
        final agza a = apwg.a;
        longValue = longValue;
        a.copyOnWrite();
        final apwj apwj2 = (apwj)a.instance;
        apwj2.c |= 0x20;
        apwj2.h = longValue;
        final String bz = gkt.bz(br);
        final agza a2 = apwg.a;
        a2.copyOnWrite();
        final apwj apwj3 = (apwj)a2.instance;
        bz.getClass();
        apwj3.c |= 0x4;
        apwj3.e = bz;
        final String bo = gkt.bo(br);
        final agza a3 = apwg.a;
        a3.copyOnWrite();
        final apwj apwj4 = (apwj)a3.instance;
        bo.getClass();
        apwj4.c |= 0x10;
        apwj4.g = bo;
        br = gkt.br(br);
        final agza a4 = apwg.a;
        a4.copyOnWrite();
        final apwj apwj5 = (apwj)a4.instance;
        br.getClass();
        apwj5.c |= 0x8;
        apwj5.f = br;
        return apwg;
    }
    
    public static apwt u(final String s, String bz) {
        final String bu = gkt.bu(s, bz);
        bu.getClass();
        agot.E(bu.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)apww.a).createBuilder();
        builder.copyOnWrite();
        final apww apww = (apww)builder.instance;
        apww.c |= 0x1;
        apww.d = bu;
        final apwt apwt = new apwt(builder);
        bz = gkt.bz(bz);
        final agza a = apwt.a;
        a.copyOnWrite();
        final apww apww2 = (apww)a.instance;
        bz.getClass();
        apww2.c |= 0x4;
        apww2.e = bz;
        return apwt;
    }
    
    public static apxa v(final zzg zzg) {
        final String f = zzg.f();
        aorm j = zzg.d();
        final apxa d = apxb.d(gkt.bz(f));
        final String bb = gkt.bB(f);
        final agza a = d.a;
        a.copyOnWrite();
        final apxd apxd = (apxd)a.instance;
        final apxd a2 = apxd.a;
        bb.getClass();
        apxd.c |= 0x2000;
        apxd.p = bb;
        final agza a3 = d.a;
        a3.copyOnWrite();
        final apxd apxd2 = (apxd)a3.instance;
        f.getClass();
        apxd2.c |= 0x4;
        apxd2.e = f;
        final String i = zzg.j();
        final agza a4 = d.a;
        a4.copyOnWrite();
        final apxd apxd3 = (apxd)a4.instance;
        i.getClass();
        apxd3.c |= 0x10;
        apxd3.g = i;
        final long b = zzg.b();
        final agza a5 = d.a;
        final long longValue = b;
        a5.copyOnWrite();
        final apxd apxd4 = (apxd)a5.instance;
        apxd4.c |= 0x400;
        apxd4.m = longValue;
        final long time = zzg.c.getTime();
        final agza a6 = d.a;
        final long longValue2 = time;
        a6.copyOnWrite();
        final apxd apxd5 = (apxd)a6.instance;
        apxd5.c |= 0x20;
        apxd5.h = longValue2;
        final int n = (int)zzg.a();
        final agza a7 = d.a;
        final int intValue = n;
        a7.copyOnWrite();
        final apxd apxd6 = (apxd)a7.instance;
        apxd6.c |= 0x40;
        apxd6.i = intValue;
        if (j == null) {
            j = aorm.a;
        }
        final agza a8 = d.a;
        a8.copyOnWrite();
        final apxd apxd7 = (apxd)a8.instance;
        j.getClass();
        apxd7.j = j;
        apxd7.c |= 0x80;
        final agza builder = ((agzi)apwz.a).createBuilder();
        final String k = zzg.i();
        builder.copyOnWrite();
        final apwz apwz = (apwz)builder.instance;
        k.getClass();
        apwz.b |= 0x1;
        apwz.c = k;
        final String e = zzg.e();
        builder.copyOnWrite();
        final apwz apwz2 = (apwz)builder.instance;
        e.getClass();
        apwz2.b |= 0x4;
        apwz2.e = e;
        final String h = zzg.h();
        builder.copyOnWrite();
        final apwz apwz3 = (apwz)builder.instance;
        h.getClass();
        apwz3.b |= 0x2;
        apwz3.d = h;
        final agza a9 = d.a;
        a9.copyOnWrite();
        final apxd apxd8 = (apxd)a9.instance;
        final apwz q = (apwz)builder.build();
        q.getClass();
        apxd8.q = q;
        apxd8.c |= 0x4000;
        final agp e2 = zzg.e;
        if (e2 != null) {
            final String av = gkt.aV((String)e2.e);
            final agza a10 = d.a;
            a10.copyOnWrite();
            final apxd apxd9 = (apxd)a10.instance;
            av.getClass();
            apxd9.c |= 0x8;
            apxd9.f = av;
        }
        return d;
    }
    
    public static void w(final vdv vdv, final String s) {
        vdv.b().r((asix)new ign(s, 3)).D().U();
    }
    
    public static void x(final vdv vdv, final String s) {
        vdv.c().r((asix)new ign(s, 4)).D().U();
    }
    
    public static ifr y(final alyn alyn) {
        return (ifr)new ifq(alyn, 0);
    }
    
    public static ifr z(final apwi apwi) {
        return (ifr)new ifq(apwi, 1);
    }
}
