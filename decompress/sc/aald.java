import android.view.View$OnClickListener;
import java.util.Set;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import android.database.Cursor;
import java.io.IOException;
import java.util.concurrent.Executor;
import com.google.protobuf.MessageLite;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Pair;
import android.graphics.BitmapRegionDecoder;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Iterator;
import android.widget.ImageView;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aald
{
    @Backup
    public static final String AUTONAV = "autonav";
    @Backup
    public static final String NERD_STATS_ENABLED = "nerd_stats_enabled";
    @Backup
    public static final String SUBTITLES_ENABLED = "subtitles_enabled";
    @Backup
    public static final String SUBTITLES_LANGUAGE_CODE = "subtitles_language_code";
    
    public static aezp A(final acku acku, final Object o, final ViewGroup viewGroup) {
        final acko z = z(acku, o, viewGroup);
        if (z == null) {
            return (aezp)aeyo.a;
        }
        F(z.a(), z, acku.c(o));
        return aezp.k((Object)z);
    }
    
    public static void B(final View view, final acku acku) {
        view.getClass();
        final acko y = y(view);
        if (y != null) {
            af(y, view, acku);
        }
    }
    
    public static void C(final acko acko, final acku acku) {
        acko.getClass();
        af(acko, acko.a(), acku);
    }
    
    public static void D(final View view, final ackm ackm) {
        view.getClass();
        view.setTag(2131430570, (Object)ackm);
    }
    
    public static void E(final View view, final acko acko) {
        view.getClass();
        view.setTag(2131430571, (Object)acko);
    }
    
    public static void F(final View view, final acko acko, final int n) {
        view.getClass();
        view.setTag(2131430571, (Object)acko);
        view.setTag(2131430573, (Object)n);
    }
    
    public static final acjo G(final int n, final List list, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return new acjo(n, list, n2, n3, n4, n5, n6);
    }
    
    public static final achb H(final tpo tpo, final ImageView imageView) {
        tpo.getClass();
        imageView.getClass();
        return new achb(tpo, imageView);
    }
    
    public static float I(final aotp aotp) {
        final boolean s = S(aotp);
        float n2;
        float n = n2 = -1.0f;
        if (s) {
            final Iterator<Object> iterator = ((List<Object>)aotp.c).iterator();
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final aoto aoto = iterator.next();
                final int e = aoto.e;
                if (e == 0) {
                    continue;
                }
                final float n3 = aoto.d / (float)e;
                if (n3 <= n) {
                    continue;
                }
                n = n3;
            }
        }
        return n2;
    }
    
    public static Uri J(final aotp aotp) {
        final aoto n = N(aotp);
        if (n == null) {
            return null;
        }
        return tpe.cL(n.c);
    }
    
    public static Uri K(final aotp aotp, final int n, final int n2) {
        final aoto o = O(aotp, n, n2);
        if (o != null && (o.b & 0x1) != 0x0) {
            return tpe.cL(o.c);
        }
        return null;
    }
    
    public static Uri L(final aotp aotp, final int n) {
        final aoto p2 = P(aotp, n);
        if (p2 == null) {
            return null;
        }
        return tpe.cL(p2.c);
    }
    
    public static Uri M(final aotp aotp) {
        final aoto q = Q(aotp);
        if (q != null) {
            return tpe.cL(q.c);
        }
        return null;
    }
    
    public static aoto N(final aotp aotp) {
        if (!S(aotp)) {
            return null;
        }
        return (aoto)aotp.c.get(aotp.c.size() - 1);
    }
    
    public static aoto O(final aotp aotp, final int n, final int n2) {
        final boolean b = true;
        int n3 = 0;
        adkp.H(n >= 0);
        adkp.H(n2 >= 0 && b);
        final boolean s = S(aotp);
        aoto aoto = null;
        final aoto aoto2 = null;
        if (s) {
            final Iterator<Object> iterator = ((List<Object>)aotp.c).iterator();
            aoto aoto3 = aoto2;
            while (true) {
                aoto = aoto3;
                if (!iterator.hasNext()) {
                    break;
                }
                final aoto aoto4 = iterator.next();
                final int n4 = n - aoto4.d;
                final int n5 = n2 - aoto4.e;
                final int n6 = n4 * n4 + n5 * n5;
                if (aoto3 != null && n6 >= n3) {
                    continue;
                }
                aoto3 = aoto4;
                n3 = n6;
            }
        }
        return aoto;
    }
    
    public static aoto P(final aotp aotp, int size) {
        if (!S(aotp)) {
            return null;
        }
        if (size <= 0) {
            return (aoto)aotp.c.get(0);
        }
        for (final aoto aoto : aotp.c) {
            if (aoto.d >= size) {
                return aoto;
            }
        }
        size = aotp.c.size();
        return (aoto)aotp.c.get(size - 1);
    }
    
    public static aoto Q(final aotp aotp) {
        if (!S(aotp)) {
            return null;
        }
        return (aoto)aotp.c.get(0);
    }
    
    public static aotp R(final Uri uri) {
        if (uri == null) {
            return null;
        }
        final ahbb ahbb = (ahbb)((ahbh)aotp.a).createBuilder();
        final ahaz builder = ((ahbh)aoto.a).createBuilder();
        final String string = uri.toString();
        builder.copyOnWrite();
        final aoto aoto = (aoto)builder.instance;
        string.getClass();
        aoto.b |= 0x1;
        aoto.c = string;
        ahbb.cJ(builder);
        return (aotp)((ahaz)ahbb).build();
    }
    
    public static boolean S(final aotp aotp) {
        return aotp != null && aotp.c.size() > 0;
    }
    
    public static boolean T(final aotp aotp) {
        return S(aotp) && ((aoto)aotp.c.get(0)).e == ((aoto)aotp.c.get(0)).d;
    }
    
    public static Bitmap U(final ContentResolver contentResolver, final Uri uri, Rect instance, int ag, int n) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inSampleSize = 1;
        final int n2 = instance.width() / 2;
        final int n3 = instance.height() / 2;
        while (ag > 0 && n2 / bitmapFactory$Options.inSampleSize > ag && n > 0 && n3 / bitmapFactory$Options.inSampleSize > n) {
            final int inSampleSize = bitmapFactory$Options.inSampleSize;
            bitmapFactory$Options.inSampleSize = inSampleSize + inSampleSize;
        }
        ag = ag(contentResolver, uri);
        Rect rect = instance;
        if (ag != 0) {
            final Pair w = W(contentResolver, uri);
            final Matrix matrix = new Matrix();
            final int n4 = -(int)w.first / 2;
            n = -(int)w.second / 2;
            matrix.postTranslate((float)n4, (float)n);
            matrix.postRotate((float)(-ag));
            if (ah(ag)) {
                n = (int)w.second / 2;
                matrix.postTranslate((float)n, (float)((int)w.first / 2));
            }
            else {
                n = (int)w.first / 2;
                matrix.postTranslate((float)n, (float)((int)w.second / 2));
            }
            final RectF rectF = new RectF(instance);
            matrix.mapRect(rectF);
            rect = new Rect((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
        }
        instance = (Rect)BitmapRegionDecoder.newInstance(contentResolver.openInputStream(uri), false);
        try {
            try {
                final Bitmap decodeRegion = ((BitmapRegionDecoder)instance).decodeRegion(rect, bitmapFactory$Options);
                if (ag != 0) {
                    final Matrix matrix2 = new Matrix();
                    matrix2.postRotate((float)ag);
                    try {
                        final Bitmap bitmap = Bitmap.createBitmap(decodeRegion, 0, 0, decodeRegion.getWidth(), decodeRegion.getHeight(), matrix2, false);
                        decodeRegion.recycle();
                        ((BitmapRegionDecoder)instance).recycle();
                        return bitmap;
                    }
                    finally {
                        decodeRegion.recycle();
                    }
                }
                ((BitmapRegionDecoder)instance).recycle();
                return decodeRegion;
            }
            finally {
                ((BitmapRegionDecoder)instance).recycle();
                while (true) {}
            }
        }
        catch (final IllegalArgumentException ex) {}
    }
    
    public static Bitmap V(final Bitmap bitmap, final ContentResolver contentResolver, final Uri uri) {
        final int ag = ag(contentResolver, uri);
        if (ag != 0) {
            final Matrix matrix = new Matrix();
            matrix.postRotate((float)ag);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            }
            finally {
                bitmap.recycle();
            }
        }
        return bitmap;
    }
    
    public static Pair W(final ContentResolver contentResolver, final Uri uri) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), (Rect)null, bitmapFactory$Options);
        if (ah(ag(contentResolver, uri))) {
            return Pair.create((Object)bitmapFactory$Options.outHeight, (Object)bitmapFactory$Options.outWidth);
        }
        return Pair.create((Object)bitmapFactory$Options.outWidth, (Object)bitmapFactory$Options.outHeight);
    }
    
    public static Bitmap X(final ContentResolver contentResolver, final Uri uri) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), (Rect)null, bitmapFactory$Options);
        bitmapFactory$Options.inSampleSize = 1;
        final int n = bitmapFactory$Options.outWidth / 2;
        final int n2 = bitmapFactory$Options.outHeight / 2;
        while (n / bitmapFactory$Options.inSampleSize > 1024 && n2 / bitmapFactory$Options.inSampleSize > 1024) {
            final int inSampleSize = bitmapFactory$Options.inSampleSize;
            bitmapFactory$Options.inSampleSize = inSampleSize + inSampleSize;
        }
        bitmapFactory$Options.inJustDecodeBounds = false;
        return V(BitmapFactory.decodeStream(contentResolver.openInputStream(uri), (Rect)null, bitmapFactory$Options), contentResolver, uri);
    }
    
    public static void Y(final acgt acgt) {
        zlm.c(zll.b, zlk.p, String.format("%s (%s)", acgt.getClass().getSimpleName(), acgt.a), (Throwable)acgt);
    }
    
    public static aezp Z(final ota ota) {
        final ouc f = ota.f;
        final Object d = ota.d;
        final ouk h = ota.h;
        wyw a = null;
        Object d2;
        if (h == null) {
            d2 = null;
        }
        else {
            d2 = h.d;
        }
        if (f instanceof acdg) {
            a = ((acdg)f).a;
        }
        wyw a2;
        if ((a2 = a) == null) {
            a2 = a;
            if (d2 instanceof acfn) {
                a2 = ((acfn)d2).a;
            }
        }
        wyw c;
        if ((c = a2) == null) {
            c = a2;
            if (d instanceof acdc) {
                c = ((acdc)d).c;
            }
        }
        return aezp.j((Object)c);
    }
    
    public static final Class[] a(final aazg aazg, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { aanr.class };
        }
        if (n == 0) {
            aazg.a((aanr)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static tmx aa(final Context context, final afvs afvs, final String c, final qcy qcy) {
        final qoa a = qob.a(context);
        a.e("rendering");
        a.f("rendering_settings.pb");
        final Uri a2 = a.a();
        final qpz a3 = qqa.a();
        a3.e((MessageLite)ahgl.a);
        a3.f(a2);
        final qqb d = qqd.d(context, (Executor)afvs);
        d.c = c;
        d.b();
        d.d(new String[] { "permissions_requested" });
        d.e((qqc)yfj.f);
        a3.b((qpw)d.a());
        return (tmx)new tmv(nns.o(qcy.C(a3.a())), (MessageLite)ahgl.a);
    }
    
    public static afhd ab(final Object o) {
        return new afhd(o);
    }
    
    public static afeq ac(final amgs amgs, final Object o, final bx bx, final vgo vgo) {
        final afel afel = new afel();
        final Iterator<Object> iterator = ((List<Object>)amgs.c).iterator();
        while (iterator.hasNext()) {
            afel.j((Iterable)ai(iterator.next(), o, bx, vgo));
        }
        return afel.g();
    }
    
    public static boolean ad(final amgs amgs, final Object o, final bx bx, final vgo vgo) {
        final Iterator<Object> iterator = ((List<Object>)amgs.c).iterator();
        while (iterator.hasNext()) {
            if (!ai(iterator.next(), o, bx, vgo).isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    private static void ae(final afel afel, final amgp amgp) {
        if (amgp != null) {
            afel.h((Object)amgp);
        }
    }
    
    private static void af(final acko acko, final View view, final acku acku) {
        final ackm x = x(view);
        if (x != null) {
            x.h();
        }
        acku.getClass();
        acko.c(acku);
    }
    
    private static int ag(final ContentResolver contentResolver, final Uri uri) {
        try {
            switch (new atb(contentResolver.openInputStream(uri)).b()) {
                default: {
                    Cursor cursor = null;
                    Cursor cursor2 = null;
                    Label_0174: {
                        try {
                            final Cursor query = contentResolver.query(uri, new String[] { "orientation" }, (String)null, (String[])null, (String)null);
                            if (query == null) {
                                break Label_0174;
                            }
                            cursor2 = query;
                            cursor = query;
                            if (!query.moveToFirst()) {
                                break Label_0174;
                            }
                            cursor2 = query;
                            cursor = query;
                            final int columnIndex = query.getColumnIndex("orientation");
                            if (columnIndex != -1) {
                                cursor2 = query;
                                cursor = query;
                                final int int1 = query.getInt(columnIndex);
                                query.close();
                                return int1;
                            }
                            break Label_0174;
                        }
                        catch (final IllegalArgumentException ex) {
                            if (cursor != null) {
                                final Cursor query = cursor;
                                break Label_0174;
                            }
                        }
                        finally {
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            final Cursor query;
                            iftrue(Label_0206:)(query == null);
                            query.close();
                        }
                    }
                    Label_0206: {
                        return 0;
                    }
                }
                case 7:
                case 8: {
                    return -90;
                }
                case 5:
                case 6: {
                    return 90;
                }
                case 3:
                case 4: {
                    return 180;
                }
                case 1: {
                    return 0;
                }
            }
        }
        catch (final IOException ex2) {
            return 0;
        }
    }
    
    private static boolean ah(final int n) {
        return Math.abs(n % 180) == 90;
    }
    
    private static afeq ai(final amgp amgp, final Object o, final bx bx, final vgo vgo) {
        final afel afel = new afel();
        if (q(amgp) != 1) {
            if (bx != null) {
                final int n = q(amgp) - 1;
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("Unknown menu visibility condition: ");
                        sb.append(n);
                        ttr.l(sb.toString());
                        return afel.g();
                    }
                    if (bx.Q()) {
                        return afel.g();
                    }
                }
                else if (!bx.Q()) {
                    return afel.g();
                }
                ae(afel, amgp);
            }
        }
        else {
            final aiqj e = vyg.e(amgp);
            if (e != null && ((ahbc)e).ry((ahaq)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
                if (vgo != null) {
                    afel.j((Iterable)vgo.c(amgp));
                }
            }
            else {
                final aiqj e2 = vyg.e(amgp);
                if (e2 != null && ((ahbc)e2).ry((ahaq)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
                    if (vgo != null) {
                        ae(afel, vgo.b(amgp, o));
                    }
                }
                else {
                    final aiqj e3 = vyg.e(amgp);
                    if (e3 != null) {
                        if (((ahbc)e3).ry((ahaq)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)) {
                            return afel.g();
                        }
                    }
                    ae(afel, amgp);
                }
            }
        }
        return afel.g();
    }
    
    public static abou b(final atiw atiw, final atiw atiw2, final atiw atiw3, final atiw atiw4, final atiw atiw5, final atiw atiw6, final atiw atiw7, final atiw atiw8, final atiw atiw9, final atiw atiw10) {
        return new abou(atiw, atiw2, atiw3, atiw4, atiw5, atiw6, atiw7, atiw8, atiw9, atiw10);
    }
    
    public static boolean c(final int n) {
        return n == 2 || n == 3;
    }
    
    public static abkx d(final abku abku) {
        return (abkx)new jev(abku, 2);
    }
    
    public static aboe e(final abva abva) {
        return new aboe(abva);
    }
    
    public static boolean f(final PlayerResponseModel playerResponseModel) {
        boolean b2;
        final boolean b = b2 = false;
        if (playerResponseModel != null) {
            b2 = b;
            if (playerResponseModel.y() != null) {
                b2 = b;
                if (aakv.m(playerResponseModel.y())) {
                    if (playerResponseModel.T()) {
                        if (playerResponseModel.m().aD()) {
                            return true;
                        }
                        b2 = b;
                    }
                    else {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public static Set g(final abmq abmq) {
        return (Set)afft.s((Object)abmq.d());
    }
    
    public static boolean h(final abmq abmq, final String s) {
        if (s.equals(abmq.d())) {
            abmq.f();
            return true;
        }
        return false;
    }
    
    public static acxl i(final aezs aezs, final aboe aboe) {
        return new acxl(aboe, aezs);
    }
    
    public static int j(final akck akck) {
        if (akck != null) {
            final int e = akck.e;
            if (e > 0) {
                return e;
            }
        }
        if (akck != null) {
            final int d = akck.d;
            if (d != 0) {
                return d;
            }
        }
        return 3;
    }
    
    public static int k(final apka apka) {
        if (apka != null) {
            final int d = apka.d;
            if (d != 0) {
                return d;
            }
        }
        return 3;
    }
    
    public static akck l(final aodm aodm) {
        aodo aodo;
        if ((aodo = aodm.r) == null) {
            aodo = aodo.a;
        }
        if ((aodo.b & 0x4) != 0x0) {
            aodo aodo2;
            if ((aodo2 = aodm.r) == null) {
                aodo2 = aodo.a;
            }
            akck akck;
            if ((akck = aodo2.e) == null) {
                akck = akck.a;
            }
            return akck;
        }
        return null;
    }
    
    public static apka m(final aodm aodm) {
        aodo aodo;
        if ((aodo = aodm.r) == null) {
            aodo = aodo.a;
        }
        if ((aodo.b & 0x8) != 0x0) {
            aodo aodo2;
            if ((aodo2 = aodm.r) == null) {
                aodo2 = aodo.a;
            }
            apka apka;
            if ((apka = aodo2.f) == null) {
                apka = apka.a;
            }
            return apka;
        }
        return null;
    }
    
    public static float n(final Context context, final vai vai) {
        if (vai.cO() != 0.0) {
            return tpe.aX(context.getResources().getDisplayMetrics(), (float)vai.cO());
        }
        return (float)context.getResources().getDimensionPixelSize(2131168432);
    }
    
    public static float[] o(final Context context, final vai vai) {
        final float n = n(context, vai);
        return new float[] { n, n, n, n, 0.0f, 0.0f, 0.0f, 0.0f };
    }
    
    public static void p(final amgp amgp, final Object o, final aun aun, final vgo vgo, final acle acle, final int n, final aezf aezf) {
        amgu amgu;
        if ((amgu = amgp.d) == null) {
            amgu = amgu.a;
        }
        aiqj aiqj;
        if ((aiqj = amgu.e) == null) {
            aiqj = aiqj.a;
        }
        if (((ahbc)aiqj).ry((ahaq)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            amgu amgu2;
            if ((amgu2 = amgp.d) == null) {
                amgu2 = amgu.a;
            }
            if (amgu2.i) {
                vgo.getClass();
                teu.n(aun, vgo.a(amgp, o), (ttg)xpx.p, (ttg)new acqm(aezf, acle, n));
            }
        }
    }
    
    public static int q(final amgp amgp) {
        final int b = amgp.b;
        if ((b & 0x10) != 0x0) {
            amgl amgl;
            if ((amgl = amgp.g) == null) {
                amgl = amgl.a;
            }
            final int dp = aqsx.dp(amgl.g);
            if (dp == 0) {
                return 1;
            }
            return dp;
        }
        else {
            if ((b & 0x20) == 0x0) {
                return 1;
            }
            amgm amgm;
            if ((amgm = amgp.h) == null) {
                amgm = amgm.a;
            }
            final int dp2 = aqsx.dp(amgm.g);
            if (dp2 == 0) {
                return 1;
            }
            return dp2;
        }
    }
    
    public static final acqe r(final acot acot, final Object o, final View$OnClickListener view$OnClickListener, final acqf acqf) {
        return new acqe(acot, o, view$OnClickListener, acqf);
    }
    
    public static Object s(final aezp aezp, final Object o) {
        if (aezp.h()) {
            return ((acoh)aezp.c()).a(o);
        }
        return o;
    }
    
    public static final Class[] t(final acnz acnz, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { uzn.class, vqk.class };
        }
        if (n == 0) {
            acnz.s(((uzn)o).b());
            return null;
        }
        if (n == 1) {
            acnz.s(((vms)o).b());
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static final Class[] u(final acoy acoy, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { acon.class, acor.class, acos.class, acpb.class };
        }
        if (n == 0) {
            final acon acon = (acon)o;
            acoy.k = true;
            acoy.M(acoy.j.a((acot)acon));
            return null;
        }
        if (n == 1) {
            final acor acor = (acor)o;
            acoy.k = false;
            acoy.M(acoy.j.a((acot)acor));
            return null;
        }
        if (n == 2) {
            final acos acos = (acos)o;
            acoy.k = false;
            acoy.M(acoy.j.a((acot)acos));
            return null;
        }
        if (n == 3) {
            acoy.I((acpb)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static int v(final View view) {
        view.getClass();
        final Object tag = view.getTag(2131430573);
        if (tag instanceof Integer) {
            return (int)tag;
        }
        return -1;
    }
    
    public static ackm w(final View view) {
        ackm x;
        if ((x = x(view)) == null) {
            x = new ackm();
            D(view, x);
        }
        x.h();
        return x;
    }
    
    public static ackm x(final View view) {
        view.getClass();
        final Object tag = view.getTag(2131430570);
        if (tag instanceof ackm) {
            return (ackm)tag;
        }
        return null;
    }
    
    public static acko y(final View view) {
        view.getClass();
        final Object tag = view.getTag(2131430571);
        if (tag instanceof acko) {
            return (acko)tag;
        }
        return null;
    }
    
    public static acko z(final acku acku, final Object o, final ViewGroup viewGroup) {
        acku.getClass();
        o.getClass();
        final int c = acku.c(o);
        if (c == -1) {
            return null;
        }
        return acku.e(c, viewGroup);
    }
}
