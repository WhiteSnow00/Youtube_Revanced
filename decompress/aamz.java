import android.view.View$OnClickListener;
import android.view.WindowManager;
import android.graphics.Point;
import android.view.View$OnLayoutChangeListener;
import android.widget.TextView;
import java.util.Set;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import android.database.Cursor;
import java.io.IOException;
import android.graphics.BitmapFactory;
import android.util.Pair;
import android.graphics.BitmapRegionDecoder;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.content.ContentResolver;
import java.util.Iterator;
import android.widget.ImageView;
import android.net.Uri;
import java.util.concurrent.Executor;
import com.google.protobuf.MessageLite;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamz
{
    @Backup
    public static final String AUTONAV = "autonav";
    @Backup
    public static final String NERD_STATS_ENABLED = "nerd_stats_enabled";
    @Backup
    public static final String SUBTITLES_ENABLED = "subtitles_enabled";
    @Backup
    public static final String SUBTITLES_LANGUAGE_CODE = "subtitles_language_code";
    
    public static aclz A(final View view) {
        view.getClass();
        final Object tag = view.getTag(2131430570);
        if (tag instanceof aclz) {
            return (aclz)tag;
        }
        return null;
    }
    
    public static acmb B(final View view) {
        view.getClass();
        final Object tag = view.getTag(2131430571);
        if (tag instanceof acmb) {
            return (acmb)tag;
        }
        return null;
    }
    
    public static acmb C(final acmh acmh, final Object o, final ViewGroup viewGroup) {
        acmh.getClass();
        o.getClass();
        final int c = acmh.c(o);
        if (c == -1) {
            return null;
        }
        return acmh.e(c, viewGroup);
    }
    
    public static afbh D(final acmh acmh, final Object o, final ViewGroup viewGroup) {
        final acmb c = C(acmh, o, viewGroup);
        if (c == null) {
            return afag.a;
        }
        I(c.a(), c, acmh.c(o));
        return afbh.k(c);
    }
    
    public static void E(final View view, final acmh acmh) {
        view.getClass();
        final acmb b = B(view);
        if (b != null) {
            ah(b, view, acmh);
        }
    }
    
    public static void F(final acmb acmb, final acmh acmh) {
        acmb.getClass();
        ah(acmb, acmb.a(), acmh);
    }
    
    public static void G(final View view, final aclz aclz) {
        view.getClass();
        view.setTag(2131430570, (Object)aclz);
    }
    
    public static void H(final View view, final acmb acmb) {
        view.getClass();
        view.setTag(2131430571, (Object)acmb);
    }
    
    public static void I(final View view, final acmb acmb, final int n) {
        view.getClass();
        view.setTag(2131430571, (Object)acmb);
        view.setTag(2131430573, (Object)n);
    }
    
    public static final aclb J(final int n, final List list, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return new aclb(n, list, n2, n3, n4, n5, n6);
    }
    
    public static tnz K(final Context context, final afxj afxj, final String c, final qdr qdr) {
        final qou a = qov.a(context);
        a.e("rendering");
        a.f("rendering_settings.pb");
        final Uri a2 = a.a();
        final qqt a3 = qqu.a();
        a3.e((MessageLite)ahic.a);
        a3.f(a2);
        final qqv d = qqx.d(context, (Executor)afxj);
        d.c = c;
        d.b();
        d.d(new String[] { "permissions_requested" });
        d.e((qqw)ztc.e);
        a3.b((qqq)d.a());
        return (tnz)new tnx(mtf.f(qdr.c(a3.a())), (MessageLite)ahic.a);
    }
    
    public static final acip L(final tqp tqp, final ImageView imageView) {
        tqp.getClass();
        imageView.getClass();
        return new acip(tqp, imageView);
    }
    
    public static float M(final aowb aowb) {
        final boolean w = W(aowb);
        float n2;
        float n = n2 = -1.0f;
        if (w) {
            final Iterator<Object> iterator = ((List<Object>)aowb.c).iterator();
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final aowa aowa = iterator.next();
                final int e = aowa.e;
                if (e == 0) {
                    continue;
                }
                final float n3 = aowa.d / (float)e;
                if (n3 <= n) {
                    continue;
                }
                n = n3;
            }
        }
        return n2;
    }
    
    public static Uri N(final aowb aowb) {
        final aowa r = R(aowb);
        if (r == null) {
            return null;
        }
        return tqf.cL(r.c);
    }
    
    public static Uri O(final aowb aowb, final int n, final int n2) {
        final aowa s = S(aowb, n, n2);
        if (s != null && (s.b & 0x1) != 0x0) {
            return tqf.cL(s.c);
        }
        return null;
    }
    
    public static Uri P(final aowb aowb, final int n) {
        final aowa t = T(aowb, n);
        if (t == null) {
            return null;
        }
        return tqf.cL(t.c);
    }
    
    public static Uri Q(final aowb aowb) {
        final aowa u = U(aowb);
        if (u != null) {
            return tqf.cL(u.c);
        }
        return null;
    }
    
    public static aowa R(final aowb aowb) {
        if (!W(aowb)) {
            return null;
        }
        return (aowa)aowb.c.get(aowb.c.size() - 1);
    }
    
    public static aowa S(final aowb aowb, final int n, final int n2) {
        final boolean b = true;
        int n3 = 0;
        adme.K(n >= 0);
        adme.K(n2 >= 0 && b);
        final boolean w = W(aowb);
        aowa aowa = null;
        final aowa aowa2 = null;
        if (w) {
            final Iterator<Object> iterator = ((List<Object>)aowb.c).iterator();
            aowa aowa3 = aowa2;
            while (true) {
                aowa = aowa3;
                if (!iterator.hasNext()) {
                    break;
                }
                final aowa aowa4 = iterator.next();
                final int n4 = n - aowa4.d;
                final int n5 = n2 - aowa4.e;
                final int n6 = n4 * n4 + n5 * n5;
                if (aowa3 != null && n6 >= n3) {
                    continue;
                }
                aowa3 = aowa4;
                n3 = n6;
            }
        }
        return aowa;
    }
    
    public static aowa T(final aowb aowb, int size) {
        if (!W(aowb)) {
            return null;
        }
        if (size <= 0) {
            return (aowa)aowb.c.get(0);
        }
        for (final aowa aowa : aowb.c) {
            if (aowa.d >= size) {
                return aowa;
            }
        }
        size = aowb.c.size();
        return (aowa)aowb.c.get(size - 1);
    }
    
    public static aowa U(final aowb aowb) {
        if (!W(aowb)) {
            return null;
        }
        return (aowa)aowb.c.get(0);
    }
    
    public static aowb V(final Uri uri) {
        if (uri == null) {
            return null;
        }
        final ahct ahct = (ahct)((ahcz)aowb.a).createBuilder();
        final ahcr builder = ((ahcz)aowa.a).createBuilder();
        final String string = uri.toString();
        builder.copyOnWrite();
        final aowa aowa = (aowa)builder.instance;
        string.getClass();
        aowa.b |= 0x1;
        aowa.c = string;
        ahct.cK(builder);
        return (aowb)((ahcr)ahct).build();
    }
    
    public static boolean W(final aowb aowb) {
        return aowb != null && aowb.c.size() > 0;
    }
    
    public static boolean X(final aowb aowb) {
        return W(aowb) && ((aowa)aowb.c.get(0)).e == ((aowa)aowb.c.get(0)).d;
    }
    
    public static Bitmap Y(final ContentResolver contentResolver, final Uri uri, Rect instance, int ai, int n) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inSampleSize = 1;
        final int n2 = instance.width() / 2;
        final int n3 = instance.height() / 2;
        while (ai > 0 && n2 / bitmapFactory$Options.inSampleSize > ai && n > 0 && n3 / bitmapFactory$Options.inSampleSize > n) {
            final int inSampleSize = bitmapFactory$Options.inSampleSize;
            bitmapFactory$Options.inSampleSize = inSampleSize + inSampleSize;
        }
        ai = ai(contentResolver, uri);
        Rect rect = instance;
        if (ai != 0) {
            final Pair aa = aa(contentResolver, uri);
            final Matrix matrix = new Matrix();
            n = -(int)aa.first / 2;
            matrix.postTranslate((float)n, (float)(-(int)aa.second / 2));
            matrix.postRotate((float)(-ai));
            if (aj(ai)) {
                final int n4 = (int)aa.second / 2;
                n = (int)aa.first / 2;
                matrix.postTranslate((float)n4, (float)n);
            }
            else {
                final int n5 = (int)aa.first / 2;
                n = (int)aa.second / 2;
                matrix.postTranslate((float)n5, (float)n);
            }
            final RectF rectF = new RectF(instance);
            matrix.mapRect(rectF);
            rect = new Rect((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
        }
        instance = (Rect)BitmapRegionDecoder.newInstance(contentResolver.openInputStream(uri), false);
        try {
            try {
                final Bitmap decodeRegion = ((BitmapRegionDecoder)instance).decodeRegion(rect, bitmapFactory$Options);
                if (ai != 0) {
                    final Matrix matrix2 = new Matrix();
                    matrix2.postRotate((float)ai);
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
    
    public static Bitmap Z(final Bitmap bitmap, final ContentResolver contentResolver, final Uri uri) {
        final int ai = ai(contentResolver, uri);
        if (ai != 0) {
            final Matrix matrix = new Matrix();
            matrix.postRotate((float)ai);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            }
            finally {
                bitmap.recycle();
            }
        }
        return bitmap;
    }
    
    public static final Class[] a(final aban aban, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { aapo.class };
        }
        if (n == 0) {
            aban.a((aapo)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static Pair aa(final ContentResolver contentResolver, final Uri uri) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentResolver.openInputStream(uri), (Rect)null, bitmapFactory$Options);
        if (aj(ai(contentResolver, uri))) {
            return Pair.create((Object)bitmapFactory$Options.outHeight, (Object)bitmapFactory$Options.outWidth);
        }
        return Pair.create((Object)bitmapFactory$Options.outWidth, (Object)bitmapFactory$Options.outHeight);
    }
    
    public static Bitmap ab(final ContentResolver contentResolver, final Uri uri) {
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
        return Z(BitmapFactory.decodeStream(contentResolver.openInputStream(uri), (Rect)null, bitmapFactory$Options), contentResolver, uri);
    }
    
    public static void ac(final acih acih) {
        znh.c(zng.b, znf.p, String.format("%s (%s)", acih.getClass().getSimpleName(), acih.a), (Throwable)acih);
    }
    
    public static adzx ad(final Object o) {
        return new adzx(o);
    }
    
    public static afgh ae(final amiv amiv, final Object o, final bx bx, final vhw vhw) {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)amiv.c).iterator();
        while (iterator.hasNext()) {
            afgc.j(ak(iterator.next(), o, bx, vhw));
        }
        return afgc.g();
    }
    
    public static boolean af(final amiv amiv, final Object o, final bx bx, final vhw vhw) {
        final Iterator<Object> iterator = ((List<Object>)amiv.c).iterator();
        while (iterator.hasNext()) {
            if (!ak(iterator.next(), o, bx, vhw).isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    private static void ag(final afgc afgc, final amis amis) {
        if (amis != null) {
            afgc.h(amis);
        }
    }
    
    private static void ah(final acmb acmb, final View view, final acmh acmh) {
        final aclz a = A(view);
        if (a != null) {
            a.h();
        }
        acmh.getClass();
        acmb.c(acmh);
    }
    
    private static int ai(final ContentResolver contentResolver, final Uri uri) {
        try {
            switch (new atd(contentResolver.openInputStream(uri)).b()) {
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
    
    private static boolean aj(final int n) {
        return Math.abs(n % 180) == 90;
    }
    
    private static afgh ak(final amis amis, final Object o, final bx bx, final vhw vhw) {
        final afgc afgc = new afgc();
        if (t(amis) != 1) {
            if (bx != null) {
                final int n = t(amis) - 1;
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("Unknown menu visibility condition: ");
                        sb.append(n);
                        tut.l(sb.toString());
                        return afgc.g();
                    }
                    if (bx.Q()) {
                        return afgc.g();
                    }
                }
                else if (!bx.Q()) {
                    return afgc.g();
                }
                ag(afgc, amis);
            }
        }
        else {
            final aisc n2 = wbe.n(amis);
            if (n2 != null && ((ahcu)n2).ry((ahci)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
                if (vhw != null) {
                    afgc.j(vhw.c(amis));
                }
            }
            else {
                final aisc n3 = wbe.n(amis);
                if (n3 != null && ((ahcu)n3).ry((ahci)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint)) {
                    if (vhw != null) {
                        ag(afgc, vhw.b(amis, o));
                    }
                }
                else {
                    final aisc n4 = wbe.n(amis);
                    if (n4 != null) {
                        if (((ahcu)n4).ry((ahci)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)) {
                            return afgc.g();
                        }
                    }
                    ag(afgc, amis);
                }
            }
        }
        return afgc.g();
    }
    
    public static abqc b(final atlt atlt, final atlt atlt2, final atlt atlt3, final atlt atlt4, final atlt atlt5, final atlt atlt6, final atlt atlt7, final atlt atlt8, final atlt atlt9, final atlt atlt10) {
        return new abqc(atlt, atlt2, atlt3, atlt4, atlt5, atlt6, atlt7, atlt8, atlt9, atlt10);
    }
    
    public static boolean c(final int n) {
        return n == 2 || n == 3;
    }
    
    public static abme d(final abmb abmb) {
        return (abme)new jfg(abmb, 2);
    }
    
    public static abpl e(final abwm abwm) {
        return new abpl(abwm);
    }
    
    public static boolean f(final PlayerResponseModel playerResponseModel) {
        boolean b2;
        final boolean b = b2 = false;
        if (playerResponseModel != null) {
            b2 = b;
            if (playerResponseModel.y() != null) {
                b2 = b;
                if (aamr.m(playerResponseModel.y())) {
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
    
    public static Set g(final abnw abnw) {
        return afhk.s(abnw.d());
    }
    
    public static boolean h(final abnw abnw, final String s) {
        if (s.equals(abnw.d())) {
            abnw.f();
            return true;
        }
        return false;
    }
    
    public static acyy i(final afbk afbk, final abpl abpl) {
        return new acyy(abpl, afbk);
    }
    
    public static View$OnLayoutChangeListener j(final TextView textView, final int n) {
        return (View$OnLayoutChangeListener)new acul(textView, n, 0);
    }
    
    public static Point k(final Context context) {
        final Point point = new Point();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point;
    }
    
    public static Point l(final Context context, final View view, int n, int max, int n2, final int n3, final int n4, int n5) {
        final Point k = k(context);
        final int[] array = new int[2];
        view.getLocationInWindow(array);
        final int n6 = 0;
        int max2 = Math.max(array[0], n3);
        final int n7 = Math.min(array[0] + view.getWidth(), k.x - n3) - max;
        final int min = Math.min(array[1] - n5, k.y - n3);
        final int max3 = Math.max(array[1] + view.getHeight() + n5, n4);
        int n8 = max2;
        Label_0295: {
            int n9 = 0;
        Label_0288_Outer:
            while (true) {
                while (true) {
                    switch (n) {
                        default: {
                            n8 = 0;
                            max = n6;
                            break Label_0295;
                        }
                        case 8: {
                            max = Math.min(array[0] - n5, k.x - n3) - max;
                            n9 = array[1];
                            n5 = (view.getHeight() - n2) / 2;
                            break;
                        }
                        case 7: {
                            max = Math.max(array[0] + view.getWidth() + n5, n3);
                            n9 = array[1];
                            n5 = (view.getHeight() - n2) / 2;
                            break;
                        }
                        case 4: {
                            max = min - n2;
                            break Label_0295;
                        }
                        case 6: {
                            n8 = n7;
                            continue Label_0288_Outer;
                        }
                        case 5: {
                            n8 = array[0] + (view.getWidth() - max) / 2;
                            continue Label_0288_Outer;
                        }
                        case 1: {
                            max = max3;
                            n8 = max2;
                            break Label_0295;
                        }
                        case 3: {
                            max2 = n7;
                            continue;
                        }
                        case 2: {
                            max2 = array[0] + (view.getWidth() - max) / 2;
                            continue;
                        }
                    }
                    break;
                }
                break;
            }
            final int n10 = max;
            max = n9 + n5;
            n8 = n10;
        }
        if (n == 7 || n == 8) {
            if (max < n4) {
                n = n4;
                return new Point(n8, n);
            }
            n = max + n2;
            n2 = k.y - n3;
            if (n > n2) {
                n = max - (n - n2);
                return new Point(n8, n);
            }
        }
        n = max;
        return new Point(n8, n);
    }
    
    public static int m(final akel akel) {
        if (akel != null) {
            final int e = akel.e;
            if (e > 0) {
                return e;
            }
        }
        if (akel != null) {
            final int d = akel.d;
            if (d != 0) {
                return d;
            }
        }
        return 3;
    }
    
    public static int n(final apmm apmm) {
        if (apmm != null) {
            final int d = apmm.d;
            if (d != 0) {
                return d;
            }
        }
        return 3;
    }
    
    public static akel o(final aoft aoft) {
        aofv aofv;
        if ((aofv = aoft.r) == null) {
            aofv = aofv.a;
        }
        if ((aofv.b & 0x4) != 0x0) {
            aofv aofv2;
            if ((aofv2 = aoft.r) == null) {
                aofv2 = aofv.a;
            }
            akel akel;
            if ((akel = aofv2.e) == null) {
                akel = akel.a;
            }
            return akel;
        }
        return null;
    }
    
    public static apmm p(final aoft aoft) {
        aofv aofv;
        if ((aofv = aoft.r) == null) {
            aofv = aofv.a;
        }
        if ((aofv.b & 0x8) != 0x0) {
            aofv aofv2;
            if ((aofv2 = aoft.r) == null) {
                aofv2 = aofv.a;
            }
            apmm apmm;
            if ((apmm = aofv2.f) == null) {
                apmm = apmm.a;
            }
            return apmm;
        }
        return null;
    }
    
    public static float q(final Context context, final arwm arwm) {
        if (arwm.cT() != 0.0) {
            return tqf.aX(context.getResources().getDisplayMetrics(), (float)arwm.cT());
        }
        return (float)context.getResources().getDimensionPixelSize(2131168471);
    }
    
    public static float[] r(final Context context, final arwm arwm) {
        final float q = q(context, arwm);
        return new float[] { q, q, q, q, 0.0f, 0.0f, 0.0f, 0.0f };
    }
    
    public static void s(final amis amis, final Object o, final aup aup, final vhw vhw, final acmr acmr, final int n, final afax afax) {
        amix amix;
        if ((amix = amis.d) == null) {
            amix = amix.a;
        }
        aisc aisc;
        if ((aisc = amix.e) == null) {
            aisc = aisc.a;
        }
        if (((ahcu)aisc).ry((ahci)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint)) {
            amix amix2;
            if ((amix2 = amis.d) == null) {
                amix2 = amix.a;
            }
            if (amix2.i) {
                vhw.getClass();
                tfx.n(aup, vhw.a(amis, o), (tui)xrh.p, (tui)new acrx(afax, acmr, n));
            }
        }
    }
    
    public static int t(final amis amis) {
        final int b = amis.b;
        if ((b & 0x10) != 0x0) {
            amio amio;
            if ((amio = amis.g) == null) {
                amio = amio.a;
            }
            final int dh = aqvq.dh(amio.g);
            if (dh == 0) {
                return 1;
            }
            return dh;
        }
        else {
            if ((b & 0x20) == 0x0) {
                return 1;
            }
            amip amip;
            if ((amip = amis.h) == null) {
                amip = amip.a;
            }
            final int dh2 = aqvq.dh(amip.g);
            if (dh2 == 0) {
                return 1;
            }
            return dh2;
        }
    }
    
    public static final acrp u(final acqf acqf, final Object o, final View$OnClickListener view$OnClickListener, final acrq acrq) {
        return new acrp(acqf, o, view$OnClickListener, acrq);
    }
    
    public static Object v(final afbh afbh, final Object o) {
        if (afbh.h()) {
            return ((acpt)afbh.c()).a(o);
        }
        return o;
    }
    
    public static final Class[] w(final acpm acpm, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { vau.class, vrt.class };
        }
        if (n == 0) {
            acpm.s(((vau)o).b());
            return null;
        }
        if (n == 1) {
            acpm.s(((voa)o).b());
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static final Class[] x(final acqk acqk, final Object o, final int n) {
        if (n == -1) {
            return new Class[] { acpz.class, acqd.class, acqe.class, acqn.class };
        }
        if (n == 0) {
            final acpz acpz = (acpz)o;
            acqk.k = true;
            acqk.M(acqk.j.a((acqf)acpz));
            return null;
        }
        if (n == 1) {
            final acqd acqd = (acqd)o;
            acqk.k = false;
            acqk.M(acqk.j.a((acqf)acqd));
            return null;
        }
        if (n == 2) {
            final acqe acqe = (acqe)o;
            acqk.k = false;
            acqk.M(acqk.j.a((acqf)acqe));
            return null;
        }
        if (n == 3) {
            acqk.I((acqn)o);
            return null;
        }
        final StringBuilder sb = new StringBuilder("unsupported op code: ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public static int y(final View view) {
        view.getClass();
        final Object tag = view.getTag(2131430573);
        if (tag instanceof Integer) {
            return (int)tag;
        }
        return -1;
    }
    
    public static aclz z(final View view) {
        aclz a;
        if ((a = A(view)) == null) {
            a = new aclz();
            G(view, a);
        }
        a.h();
        return a;
    }
}
