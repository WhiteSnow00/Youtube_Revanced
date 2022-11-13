import android.os.SystemClock;
import java.util.concurrent.Executor;
import android.widget.ImageView$ScaleType;
import java.util.Iterator;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.rastermill.FrameSequence;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.content.res.Resources$Theme;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.content.Context;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Map;
import app.revanced.integrations.patches.MinimizedPlaybackPatch;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
import j$.util.concurrent.ThreadLocalRandom;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakv
{
    public static boolean A() {
        return ThreadLocalRandom.current().nextInt(1000) == 0;
    }
    
    public static osz B(final Object o) {
        return C(o, null);
    }
    
    public static osz C(final Object o, final alhi alhi) {
        alhi alhi2 = alhi;
        if (alhi == null) {
            alhi2 = null;
        }
        return (osz)new acdd(D(o, alhi2, null, null, null), 0);
    }
    
    public static final acdc D(final Object o, final alhi alhi, final wyw wyw, final aiqj aiqj, final List list) {
        return new acdc(o, alhi, wyw, aiqj, list);
    }
    
    public static final Class[] a(final aaon aaon, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { aamh.class, aani.class, aano.class, aans.class, aany.class };
        }
        if (n == 0) {
            aaon.y((aamh)o);
            return null;
        }
        if (n == 1) {
            aaon.A((aani)o);
            return null;
        }
        if (n == 2) {
            final aano aano = (aano)o;
            aaon.E();
            return null;
        }
        if (n == 3) {
            aaon.d((aans)o);
            return null;
        }
        if (n == 4) {
            final aany aany = (aany)o;
            aaon.x(aany);
            aaon.z(aany);
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
    
    public static apta e(final int n) {
        switch (n) {
            default: {
                return apta.a;
            }
            case 9:
            case 10: {
                return apta.f;
            }
            case 8: {
                return apta.h;
            }
            case 7: {
                return apta.g;
            }
            case 6: {
                return apta.e;
            }
            case 5: {
                return apta.d;
            }
            case 4: {
                return apta.j;
            }
            case 3: {
                return apta.c;
            }
            case 2: {
                return apta.b;
            }
        }
    }
    
    public static boolean f(final PlayerResponseModel playerResponseModel, final oby oby) {
        return playerResponseModel != null && playerResponseModel.n() != null && playerResponseModel.n().t(oby.d());
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
    
    public static ahyq i(final akwz akwz) {
        if (!m(akwz) && akwz != null && (akwz.b & 0x800) != 0x0) {
            akwq akwq;
            if ((akwq = akwz.j) == null) {
                akwq = akwq.a;
            }
            ahyr a;
            if (akwq.b == 64657230) {
                a = (ahyr)akwq.c;
            }
            else {
                a = ahyr.a;
            }
            if ((a.b & 0x2) != 0x0) {
                akwq akwq2;
                if ((akwq2 = akwz.j) == null) {
                    akwq2 = akwq.a;
                }
                ahyr a2;
                if (akwq2.b == 64657230) {
                    a2 = (ahyr)akwq2.c;
                }
                else {
                    a2 = ahyr.a;
                }
                ahyq ahyq;
                if ((ahyq = a2.d) == null) {
                    ahyq = ahyq.a;
                }
                return ahyq;
            }
        }
        return null;
    }
    
    public static aixf j(final akwz akwz) {
        if ((akwz.b & 0x40) != 0x0) {
            akwy akwy;
            if ((akwy = akwz.g) == null) {
                akwy = akwy.a;
            }
            if (akwy.b == 64099105) {
                akwy akwy2;
                if ((akwy2 = akwz.g) == null) {
                    akwy2 = akwy.a;
                }
                aixf a;
                if (akwy2.b == 64099105) {
                    a = (aixf)akwy2.c;
                }
                else {
                    a = aixf.a;
                }
                return a;
            }
        }
        return null;
    }
    
    public static amxe k(final akwz akwz) {
        if (akwz != null) {
            akwu akwu;
            if ((akwu = akwz.l) == null) {
                akwu = akwu.a;
            }
            if (akwu.b == 60572968) {
                akwu akwu2;
                if ((akwu2 = akwz.l) == null) {
                    akwu2 = akwu.a;
                }
                amxe a;
                if (akwu2.b == 60572968) {
                    a = (amxe)akwu2.c;
                }
                else {
                    a = amxe.a;
                }
                return a;
            }
        }
        return null;
    }
    
    public static anfd l(final akwz akwz) {
        if (akwz != null && (akwz.b & 0x40) != 0x0) {
            akwy akwy;
            if ((akwy = akwz.g) == null) {
                akwy = akwy.a;
            }
            anfd a;
            if (akwy.b == 73238862) {
                akwy akwy2;
                if ((akwy2 = akwz.g) == null) {
                    akwy2 = akwy.a;
                }
                if (akwy2.b == 73238862) {
                    a = (anfd)akwy2.c;
                }
                else {
                    a = anfd.a;
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
    
    public static boolean m(final akwz akwz) {
        return MinimizedPlaybackPatch.isMinimizedPlaybackEnabled();
    }
    
    public static boolean n(final akwz akwz) {
        if (akwz != null && (akwz.b & 0x80000) != 0x0) {
            final int cg = aqsx.cG(akwz.c);
            if (cg != 0) {
                if (cg == 7) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean o(final akwz akwz) {
        if (akwz != null) {
            final int cg = aqsx.cG(akwz.c);
            if (cg != 0) {
                if (cg != 1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean p(final akwz akwz) {
        if (akwz != null) {
            akww akww;
            if ((akww = akwz.h) == null) {
                akww = akww.a;
            }
            anbi a;
            if (akww.b == 151635310) {
                a = (anbi)akww.c;
            }
            else {
                a = anbi.a;
            }
            if (a.c) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean q(final akwz akwz) {
        if (akwz == null) {
            return false;
        }
        int cg;
        if ((cg = aqsx.cG(akwz.c)) == 0) {
            cg = 1;
        }
        return cg == 1 || cg == 4 || cg == 5 || cg == 6 || cg == 10;
    }
    
    public static boolean r(final akwz akwz) {
        if (akwz != null && (akwz.b & 0x80000) != 0x0) {
            akwt akwt;
            if ((akwt = akwz.o) == null) {
                akwt = akwt.a;
            }
            aluq aluq;
            if ((aluq = akwt.c) == null) {
                aluq = aluq.a;
            }
            return aluq.h;
        }
        return false;
    }
    
    public static void s(final Map map, final ota ota) {
        final aezp z = aald.Z(ota);
        if (z.h()) {
            map.put("com.google.android.libraries.youtube.logging.interaction_logger", z.c());
        }
    }
    
    public static void t(final ahbb ahbb, final ota ota, View view) {
        aiqk aiqk;
        if ((aiqk = ((aiqj)ahbb.instance).e) == null) {
            aiqk = aiqk.a;
        }
        final ahbb ahbb2 = (ahbb)((ahbh)aiqk).toBuilder();
        final ovs c = ota.c;
        if (view != null) {
            if (c != null) {
                final float density = view.getResources().getDisplayMetrics().density;
                if (density != 0.0f) {
                    final int[] array = new int[2];
                    view.getLocationOnScreen(array);
                    final ahaz builder = ((ahbh)algy.a).createBuilder();
                    final float n = c.a / density;
                    builder.copyOnWrite();
                    final algy algy = (algy)builder.instance;
                    algy.c |= 0x1;
                    algy.d = (int)n;
                    final float n2 = c.b / density;
                    builder.copyOnWrite();
                    final algy algy2 = (algy)builder.instance;
                    algy2.c |= 0x2;
                    algy2.e = (int)n2;
                    final float n3 = view.getMeasuredWidth() / density;
                    builder.copyOnWrite();
                    final algy algy3 = (algy)builder.instance;
                    algy3.c |= 0x4;
                    algy3.f = (int)n3;
                    final float n4 = view.getMeasuredHeight() / density;
                    builder.copyOnWrite();
                    final algy algy4 = (algy)builder.instance;
                    algy4.c |= 0x8;
                    algy4.g = (int)n4;
                    final float n5 = array[0] / density;
                    builder.copyOnWrite();
                    final algy algy5 = (algy)builder.instance;
                    algy5.c |= 0x100;
                    algy5.l = (int)n5;
                    final float n6 = array[1] / density;
                    builder.copyOnWrite();
                    final algy algy6 = (algy)builder.instance;
                    algy6.c |= 0x200;
                    algy6.m = (int)n6;
                    final int orientation = view.getResources().getConfiguration().orientation;
                    if (orientation != 1) {
                        if (orientation != 2) {
                            if (orientation != 3) {
                                final ajel a = ajel.a;
                                builder.copyOnWrite();
                                final algy algy7 = (algy)builder.instance;
                                algy7.n = a.h;
                                algy7.c |= 0x800;
                            }
                            else {
                                final ajel g = ajel.g;
                                builder.copyOnWrite();
                                final algy algy8 = (algy)builder.instance;
                                algy8.n = g.h;
                                algy8.c |= 0x800;
                            }
                        }
                        else {
                            final ajel f = ajel.f;
                            builder.copyOnWrite();
                            final algy algy9 = (algy)builder.instance;
                            algy9.n = f.h;
                            algy9.c |= 0x800;
                        }
                    }
                    else {
                        final ajel b = ajel.b;
                        builder.copyOnWrite();
                        final algy algy10 = (algy)builder.instance;
                        algy10.n = b.h;
                        algy10.c |= 0x800;
                    }
                    while (view != null && !(view instanceof dvu)) {
                        view = (View)view.getParent();
                    }
                    if (view instanceof dvu) {
                        final int[] array2 = new int[2];
                        view.getLocationOnScreen(array2);
                        final float n7 = view.getMeasuredWidth() / density;
                        builder.copyOnWrite();
                        final algy algy11 = (algy)builder.instance;
                        algy11.c |= 0x40;
                        algy11.j = (int)n7;
                        final float n8 = view.getMeasuredHeight() / density;
                        builder.copyOnWrite();
                        final algy algy12 = (algy)builder.instance;
                        algy12.c |= 0x80;
                        algy12.k = (int)n8;
                        final float n9 = (array[0] - array2[0]) / density;
                        builder.copyOnWrite();
                        final algy algy13 = (algy)builder.instance;
                        algy13.c |= 0x10;
                        algy13.h = (int)n9;
                        final float n10 = (array[1] - array2[1]) / density;
                        builder.copyOnWrite();
                        final algy algy14 = (algy)builder.instance;
                        algy14.c |= 0x20;
                        algy14.i = (int)n10;
                    }
                    ahbb2.e((ahaq)algy.b, (Object)builder.build());
                }
            }
        }
        final Object d = ota.d;
        if (d instanceof acdc) {
            final alhi b2 = ((acdc)d).b;
            if (b2 != null) {
                ahbb2.e((ahaq)aliu.a, (Object)b2);
            }
        }
        final aiqk e = (aiqk)((ahaz)ahbb2).build();
        ((ahaz)ahbb).copyOnWrite();
        final aiqj aiqj = (aiqj)ahbb.instance;
        e.getClass();
        aiqj.e = e;
        aiqj.b |= 0x2;
    }
    
    public static void u(final aqgi aqgi, final ImageView imageView, final Context context, final otc otc) {
        if (((List)aqgi.c).isEmpty() && (aqgi.b & 0x2) != 0x0) {
            imageView.setImageBitmap(Bitmap.createBitmap(1, 1, Bitmap$Config.ALPHA_8));
            return;
        }
        final int c = osh.c(context, aqgi);
        if (c > 0) {
            final int f = aqgi.f;
            final int i = aqsx.I(f);
            Label_0115: {
                if (i != 0) {
                    if (i == 5) {
                        break Label_0115;
                    }
                }
                final int j = aqsx.I(f);
                if (j != 0) {
                    if (j == 4) {
                        break Label_0115;
                    }
                }
                imageView.setImageDrawable(ahv.f(context.getResources(), c, null));
                return;
            }
            final ovw ovw = new ovw((CommandOuterClass$Command)null, (CommandOuterClass$Command)null, otc, (Object)aqgi);
            final FrameSequenceDrawable imageDrawable = new FrameSequenceDrawable(FrameSequence.decodeStream(context.getResources().openRawResource(c)));
            ovw.b(imageDrawable);
            imageView.setImageDrawable((Drawable)imageDrawable);
            ovw.c();
            return;
        }
        final aezp o = nbr.O(aqgi);
        if (o.h()) {
            imageView.setImageDrawable(nbr.M(context, (byte[])o.c()));
        }
    }
    
    public static aotp v(final aqgi aqgi) {
        final ahbb ahbb = (ahbb)((ahbh)aotp.a).createBuilder();
        if (aqgi == null) {
            return (aotp)((ahaz)ahbb).build();
        }
        for (final aqgk aqgk : aqgi.c) {
            if (aqgk.c == 1) {
                final ahaz builder = ((ahbh)aoto.a).createBuilder();
                final int c = aqgk.c;
                String s = "";
                String s2;
                if (c == 1) {
                    s2 = (String)aqgk.d;
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
                if (aqgk.c == 1) {
                    s = (String)aqgk.d;
                }
                final String concat = s3.concat(String.valueOf(s));
                builder.copyOnWrite();
                final aoto aoto = (aoto)builder.instance;
                aoto.b |= 0x1;
                aoto.c = concat;
                final int e = aqgk.e;
                builder.copyOnWrite();
                final aoto aoto2 = (aoto)builder.instance;
                aoto2.b |= 0x2;
                aoto2.d = e;
                final int f = aqgk.f;
                builder.copyOnWrite();
                final aoto aoto3 = (aoto)builder.instance;
                aoto3.b |= 0x4;
                aoto3.e = f;
                ahbb.cJ(builder);
            }
        }
        return (aotp)((ahaz)ahbb).build();
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
    
    public static oug x(final boolean b, final arkg arkg, final arkg arkg2, final arkg arkg3, final arkg arkg4) {
        if (b) {
            return (oug)new owy((aakv)arkg.a(), (oxp)arkg2.a(), (Executor)arkg3.a(), (accz)arkg4.a(), (byte[])null, (byte[])null);
        }
        return oug.a;
    }
    
    public static boolean y(final acdp acdp, final tdz tdz) {
        return ((acdn)acdp.a()).c && tdz.c(((acdn)acdp.a()).d, tea.c);
    }
    
    public static final long z() {
        return SystemClock.elapsedRealtimeNanos() / 1000L;
    }
}
