import java.util.Collection;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import java.util.HashMap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff$Mode;
import android.content.ContextWrapper;
import android.app.Activity;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import android.widget.ImageView$ScaleType;
import com.google.android.libraries.elements.interfaces.ContentMode;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executor;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import j$.util.Optional;
import java.util.Set;
import java.util.Map;
import android.net.Uri$Builder;
import android.net.Uri;
import java.util.concurrent.TimeUnit;
import android.util.Base64;
import java.io.File;
import java.nio.BufferUnderflowException;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.nio.BufferOverflowException;
import java.util.zip.CRC32;
import java.io.IOException;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import android.content.Context;
import android.content.SharedPreferences$Editor;
import com.google.protobuf.MessageLite;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public class oaw
{
    public static volatile aruk a;
    public static volatile aruk b;
    public static volatile aruk c;
    public static volatile aruk d;
    public static volatile aruk e;
    
    public static boolean A(final SharedPreferences sharedPreferences, final String s) {
        return sharedPreferences.edit().remove(s).commit();
    }
    
    public static boolean B(final SharedPreferences sharedPreferences, final String s, final MessageLite messageLite) {
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        z(edit, s, messageLite);
        return edit.commit();
    }
    
    public static pef C(final String s, final Context context, final peu peu) {
        final List h = aeyk.c("|").h(s);
        final pgn a = pgn.a;
        final int ordinal = psb.u(context, peu).ordinal();
        agza agza;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (h.size() != 4) {
                    throw new pjb("Bad-format serializedFileKey = ".concat(String.valueOf(s)));
                }
                agza = ((agzi)pef.a).createBuilder();
                final String c = h.get(0);
                agza.copyOnWrite();
                final pef pef = (pef)agza.instance;
                c.getClass();
                pef.b |= 0x1;
                pef.c = c;
                final int int1 = Integer.parseInt(h.get(1));
                agza.copyOnWrite();
                final pef pef2 = (pef)agza.instance;
                pef2.b |= 0x2;
                pef2.d = int1;
                final String e = h.get(2);
                agza.copyOnWrite();
                final pef pef3 = (pef)agza.instance;
                e.getClass();
                pef3.b |= 0x4;
                pef3.e = e;
                final int r = pqw.r(Integer.parseInt(h.get(3)));
                agza.copyOnWrite();
                final pef pef4 = (pef)agza.instance;
                if (r == 0) {
                    throw null;
                }
                pef4.f = r - 1;
                pef4.b |= 0x8;
            }
            else {
                if (h.size() != 2) {
                    throw new pjb("Bad-format serializedFileKey = s".concat(String.valueOf(s)));
                }
                agza = ((agzi)pef.a).createBuilder();
                final String e2 = h.get(0);
                agza.copyOnWrite();
                final pef pef5 = (pef)agza.instance;
                e2.getClass();
                pef5.b |= 0x4;
                pef5.e = e2;
                final int r2 = pqw.r(Integer.parseInt(h.get(1)));
                agza.copyOnWrite();
                final pef pef6 = (pef)agza.instance;
                if (r2 == 0) {
                    throw null;
                }
                pef6.f = r2 - 1;
                pef6.b |= 0x8;
            }
        }
        else {
            if (h.size() != 5) {
                throw new pjb("Bad-format serializedFileKey = ".concat(String.valueOf(s)));
            }
            final agza builder = ((agzi)pef.a).createBuilder();
            final String c2 = h.get(0);
            builder.copyOnWrite();
            final pef pef7 = (pef)builder.instance;
            c2.getClass();
            pef7.b |= 0x1;
            pef7.c = c2;
            final int int2 = Integer.parseInt(h.get(1));
            builder.copyOnWrite();
            final pef pef8 = (pef)builder.instance;
            pef8.b |= 0x2;
            pef8.d = int2;
            final String e3 = h.get(2);
            builder.copyOnWrite();
            final pef pef9 = (pef)builder.instance;
            e3.getClass();
            pef9.b |= 0x4;
            pef9.e = e3;
            final int r3 = pqw.r(Integer.parseInt(h.get(3)));
            builder.copyOnWrite();
            final pef pef10 = (pef)builder.instance;
            if (r3 == 0) {
                throw null;
            }
            pef10.f = r3 - 1;
            pef10.b |= 0x8;
            if (h.get(4) != null && !((String)h.get(4)).isEmpty()) {
                try {
                    final aqts g = (aqts)u(h.get(4), ((agzi)aqts.a).getParserForType());
                    builder.copyOnWrite();
                    final pef pef11 = (pef)builder.instance;
                    g.getClass();
                    pef11.g = g;
                    pef11.b |= 0x10;
                }
                catch (final ahab ahab) {
                    throw new pjb("Failed to deserialize key:".concat(String.valueOf(s)), (Throwable)ahab);
                }
            }
            agza = builder;
        }
        return (pef)agza.build();
    }
    
    public static String D(final pef pef, final Context context, final peu peu) {
        final pgn a = pgn.a;
        final int ordinal = psb.u(context, peu).ordinal();
        if (ordinal == 0) {
            return E(pef);
        }
        if (ordinal == 1) {
            return G(pef);
        }
        if (ordinal != 2) {
            return E(pef);
        }
        return F(pef);
    }
    
    public static String E(final pef pef) {
        final StringBuilder sb = new StringBuilder(pef.c);
        sb.append("|");
        sb.append(pef.d);
        sb.append("|");
        sb.append(pef.e);
        sb.append("|");
        int r;
        if ((r = pqw.r(pef.f)) == 0) {
            r = 1;
        }
        sb.append(r - 1);
        return sb.toString();
    }
    
    public static String F(final pef pef) {
        final StringBuilder sb = new StringBuilder(pef.e);
        sb.append("|");
        int r;
        if ((r = pqw.r(pef.f)) == 0) {
            r = 1;
        }
        sb.append(r - 1);
        return sb.toString();
    }
    
    public static String G(final pef pef) {
        final StringBuilder sb = new StringBuilder(pef.c);
        sb.append("|");
        sb.append(pef.d);
        sb.append("|");
        sb.append(pef.e);
        sb.append("|");
        int r;
        if ((r = pqw.r(pef.f)) == 0) {
            r = 1;
        }
        sb.append(r - 1);
        sb.append("|");
        String x;
        if ((pef.b & 0x10) != 0x0) {
            aqts aqts;
            if ((aqts = pef.g) == null) {
                aqts = aqts.a;
            }
            x = x((MessageLite)aqts);
        }
        else {
            x = "";
        }
        sb.append(x);
        return sb.toString();
    }
    
    public static ByteBuffer H(Iterable iterator) {
        final Iterator<Object> iterator2 = (Iterator<Object>)((Iterable<MessageLite>)iterator).iterator();
        final int n = 0;
        long n2 = 0L;
        int n3 = 0;
        while (iterator2.hasNext()) {
            n2 += iterator2.next().getSerializedSize() + 12;
            ++n3;
        }
        if (n3 != 0) {
            final int n4 = (int)n2;
            try {
                final ByteBuffer allocate = ByteBuffer.allocate(n4);
                final byte[] array = allocate.array();
                iterator = ((Iterable<MessageLite>)iterator).iterator();
                int n5 = n;
                while (iterator.hasNext()) {
                    final MessageLite messageLite = iterator.next();
                    final int serializedSize = messageLite.getSerializedSize();
                    try {
                        allocate.putInt(serializedSize);
                        n5 += 4;
                        try {
                            messageLite.writeTo(agym.am(array, n5, serializedSize));
                        }
                        catch (final IOException ex) {
                            Log.e("ProtoLiteUtil", "Exception while writing to buffer.", (Throwable)ex);
                        }
                        try {
                            allocate.put(array, n5, serializedSize);
                            n5 += serializedSize;
                            final CRC32 crc32 = new CRC32();
                            crc32.update(array, n5 - serializedSize, serializedSize);
                            allocate.putLong(crc32.getValue());
                            n5 += 8;
                        }
                        catch (final BufferOverflowException ex2) {
                            ab(ex2);
                            return null;
                        }
                    }
                    catch (final BufferOverflowException ex3) {
                        ab(ex3);
                        return null;
                    }
                    break;
                }
                allocate.rewind();
                return allocate;
            }
            catch (final IllegalArgumentException ex4) {
                String s;
                if (n2 > 1073741824L) {
                    final Locale us = Locale.US;
                    final double n6 = (double)n2;
                    Double.isNaN(n6);
                    s = String.format(us, "%.2fGB", n6 / 1.073741824E9);
                }
                else if (n2 > 1048576L) {
                    final Locale us2 = Locale.US;
                    final double n7 = (double)n2;
                    Double.isNaN(n7);
                    s = String.format(us2, "%.2fMB", n7 / 1048576.0);
                }
                else if (n2 > 1024L) {
                    final Locale us3 = Locale.US;
                    final double n8 = (double)n2;
                    Double.isNaN(n8);
                    s = String.format(us3, "%.2fKB", n8 / 1024.0);
                }
                else {
                    s = String.format(Locale.US, "%d Bytes", n2);
                }
                Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", s), (Throwable)ex4);
                return null;
            }
        }
        return ByteBuffer.allocate(0);
    }
    
    public static List I(final ByteBuffer byteBuffer, final Class clazz, final ahbe ahbe) {
        final String string = clazz.toString();
        final int limit = byteBuffer.limit();
        final ArrayList list = new ArrayList(byteBuffer.limit() / 1000 + 1);
        while (byteBuffer.position() < limit) {
            try {
                final int int1 = byteBuffer.getInt();
                if (int1 < 0) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d. May have given the wrong message type: %s", int1, string));
                    return null;
                }
                if (limit < byteBuffer.position() + int1 + 8) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d (buffer end is %d)", int1, limit));
                    return list;
                }
                final long long1 = byteBuffer.getLong(byteBuffer.position() + int1);
                final byte[] array = byteBuffer.array();
                final int arrayOffset = byteBuffer.arrayOffset();
                final int position = byteBuffer.position();
                Object a = new CRC32();
                ((CRC32)a).update(array, arrayOffset + position, int1);
                final long value = ((CRC32)a).getValue();
                if (value != long1) {
                    Log.e("ProtoLiteUtil", String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", long1, value));
                    return list;
                }
                final byte[] array2 = byteBuffer.array();
                final int arrayOffset2 = byteBuffer.arrayOffset();
                final int position2 = byteBuffer.position();
                try {
                    a = ExtensionRegistryLite.a;
                    try {
                        final Object m = ahbe.m(array2, arrayOffset2 + position2, int1, (ExtensionRegistryLite)a);
                    }
                    catch (final ahab a) {}
                }
                catch (final ahab ahab) {}
                Log.e("ProtoLiteUtil", "Cannot deserialize message of type ".concat(clazz.toString()), (Throwable)a);
                final Object m = null;
                if (m == null) {
                    return null;
                }
                list.add(m);
                byteBuffer.position(byteBuffer.position() + int1 + 8);
                continue;
            }
            catch (final BufferUnderflowException ex) {
                Log.e("ProtoLiteUtil", String.format("Buffer underflow. May have given the wrong message type: %s", string), (Throwable)ex);
                return null;
            }
            break;
        }
        return list;
    }
    
    public static pec J(final String s) {
        pec pec = null;
        try {
            pec = (pec)u(s, ((agzi)pec.a).getParserForType());
            return pec;
        }
        catch (final ahab pec) {}
        catch (final NullPointerException ex) {}
        throw new pja("Failed to deserialize key:".concat(String.valueOf(s)), (Throwable)pec);
    }
    
    public static File K(final Context context, final aexq aexq) {
        String concat = "gms_icing_mdd_garbage_file";
        if (aexq != null) {
            concat = concat;
            if (aexq.h()) {
                concat = "gms_icing_mdd_garbage_file".concat((String)aexq.c());
            }
        }
        return new File(context.getFilesDir(), concat);
    }
    
    public static String L(final pec pec) {
        return Base64.encodeToString(((agxl)pec).toByteArray(), 3);
    }
    
    public static long M(final pds pds) {
        if (pds.k == 0L) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(pds.k);
    }
    
    public static Uri N(final Uri uri, final pdq pdq) {
        final Uri$Builder buildUpon = uri.buildUpon();
        if (pdq.p.isEmpty()) {
            final String d = pdq.d;
            buildUpon.appendPath(d.substring(d.lastIndexOf("/") + 1));
        }
        else {
            for (final String s : pdq.p.split("/", -1)) {
                if (!s.isEmpty()) {
                    buildUpon.appendPath(s);
                }
            }
        }
        return buildUpon.build();
    }
    
    public static Uri O(final Context context, final aexq aexq, final pds pds) {
        String s;
        if (!pds.v.isEmpty()) {
            s = pds.v;
        }
        else {
            s = pds.d;
        }
        int r;
        if ((r = pqw.r(pds.i)) == 0) {
            r = 1;
        }
        return psb.l(context, aexq).buildUpon().appendPath("links").build().buildUpon().appendPath(psb.p(r)).build().buildUpon().appendPath(s).build();
    }
    
    public static pds P(final pds pds, final long c) {
        pdr pdr;
        if ((pdr = pds.c) == null) {
            pdr = pdr.a;
        }
        final agza builder = ((agzi)pdr).toBuilder();
        builder.copyOnWrite();
        final pdr pdr2 = (pdr)builder.instance;
        pdr2.b |= 0x1;
        pdr2.c = c;
        final pdr c2 = (pdr)builder.build();
        final agza builder2 = ((agzi)pds).toBuilder();
        builder2.copyOnWrite();
        final pds pds2 = (pds)builder2.instance;
        c2.getClass();
        pds2.c = c2;
        pds2.b |= 0x1;
        return (pds)builder2.build();
    }
    
    public static String Q(final pdq pdq) {
        String s;
        if (R(pdq)) {
            s = pdq.i;
        }
        else {
            s = pdq.g;
        }
        return s;
    }
    
    public static boolean R(final pdq pdq) {
        if ((pdq.b & 0x20) != 0x0) {
            aqts aqts;
            if ((aqts = pdq.h) == null) {
                aqts = aqts.a;
            }
            final Iterator<Object> iterator = aqts.b.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().b == 4) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean S(final long n, final pex pex) {
        return n <= pex.a();
    }
    
    public static boolean T(final pdq pdq) {
        return ac(pdq, afdu.s((Object)"inlinefile"));
    }
    
    public static boolean U(final pds pds) {
        if (pds.m) {
            final Iterator<Object> iterator = pds.n.iterator();
            while (iterator.hasNext()) {
                final int t = pqw.t(iterator.next().m);
                if (t != 0 && t == 2) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean V(final pdq pdq) {
        return ac(pdq, afdu.t((Object)"file", (Object)"asset"));
    }
    
    public static Uri X(final Uri uri) {
        final String string = uri.toString();
        return Uri.parse(string.substring(0, string.lastIndexOf("_")));
    }
    
    public static String Y(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("_");
        sb.append(s2);
        return sb.toString();
    }
    
    public static opa Z(final Map map, final Set set, final otd otd, final Optional optional, final Optional optional2, final asho asho, final atjj atjj, final Optional optional3, final phq phq, final atjj atjj2, final atjj atjj3) {
        return new opa(map, set, otd, optional, optional2, asho, atjj, optional3, phq, atjj2, atjj3, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static oas a() {
        return (oas)new tsy(1);
    }
    
    public static void aa(final Context context, final aexq aexq, final pds pds, final eg eg) {
        final Uri o = O(context, aexq, pds);
        if (eg.aA(o)) {
            final qnv qnv = new qnv();
            qnv.a = true;
            final Void void1 = (Void)eg.av(o, (qmo)qnv);
        }
    }
    
    private static void ab(final BufferOverflowException ex) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", (Throwable)ex);
    }
    
    private static boolean ac(final pdq pdq, final afdu afdu) {
        if ((pdq.b & 0x2) != 0x0) {
            final int index = pdq.d.indexOf(58);
            agot.G(index >= 0, "Invalid url: %s", (Object)pdq.d);
            final String substring = pdq.d.substring(0, index);
            final afie k = afdu.k();
            while (((Iterator)k).hasNext()) {
                if (aeda.y((CharSequence)substring, (CharSequence)((Iterator)k).next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static oae b(final Iterable iterable) {
        return (oae)new oaf(iterable, 2);
    }
    
    public static Set c(final Class clazz, final Class... array) {
        final HashSet set = new HashSet();
        final int length = array.length;
        for (int i = 0; i < 15; ++i) {
            for (final Field field : array[i].getDeclaredFields()) {
                if (field.isAnnotationPresent(clazz) && field.getType().equals(String.class)) {
                    try {
                        set.add(field.get(null));
                    }
                    catch (final IllegalAccessException ex) {
                        throw new IllegalArgumentException(ex);
                    }
                }
            }
        }
        return set;
    }
    
    public static afts d(final afts afts) {
        return (afts)pqg.i((aftr)new odi(afva.g((Executor)afts), afts), afts);
    }
    
    public static ThreadFactory e(final ThreadFactory threadFactory) {
        return new lwi(threadFactory, 3);
    }
    
    public static afts g(final afts afts) {
        return (afts)new ocx(afts);
    }
    
    public static void h(final oss oss, final View view) {
        oss.e(view);
    }
    
    public static Uri i(final String s) {
        Uri uri2;
        final Uri uri = uri2 = Uri.parse(s);
        if (aexs.f(uri.getScheme())) {
            uri2 = uri.buildUpon().scheme("https").build();
        }
        return uri2;
    }
    
    public static ImageView$ScaleType j(final ContentMode contentMode) {
        final ContentMode content_MODE_UNKNOWN = ContentMode.CONTENT_MODE_UNKNOWN;
        final int ordinal = contentMode.ordinal();
        if (ordinal == 2) {
            return ImageView$ScaleType.CENTER_INSIDE;
        }
        if (ordinal == 3) {
            return ImageView$ScaleType.CENTER_CROP;
        }
        if (ordinal != 4) {
            return ImageView$ScaleType.FIT_XY;
        }
        return ImageView$ScaleType.CENTER;
    }
    
    public static dci k(final Context context, final ImageProxy imageProxy, final ImageProxy imageProxy2, final ImageProxy imageProxy3, int n, final int n2, final boolean b) {
        if (!l(context)) {
            final ogs ogs = (ogs)imageProxy;
            Object d;
            if (ogs.a.isEmpty() && ogs.a() != null) {
                d = dbo.c(context).d((Drawable)new BitmapDrawable(context.getResources(), Bitmap.createBitmap(1, 1, Bitmap$Config.ALPHA_8)));
            }
            else {
                d = null;
            }
            Object f = d;
            if (d == null) {
                final ImageSourceProxy o = oga.o(imageProxy, n, n2);
                if (o != null && !TextUtils.isEmpty((CharSequence)o.url())) {
                    f = dbo.c(context).c().f(i(o.url()));
                }
                else {
                    f = null;
                }
            }
            Object e;
            if ((e = f) == null) {
                n = oqy.b(context, imageProxy);
                if (n == 0) {
                    e = null;
                }
                else {
                    e = dbo.c(context).e(Integer.valueOf(n));
                }
            }
            Object g;
            if ((g = e) == null) {
                final aexq o2 = o(imageProxy);
                if (o2.h()) {
                    g = dbo.c(context).g((byte[])o2.c());
                }
                else {
                    g = null;
                }
            }
            Object f2;
            if ((f2 = g) == null) {
                if (imageProxy3 == null) {
                    return null;
                }
                f2 = dbo.c(context).f((Object)null);
            }
            if (imageProxy.contentMode() == ContentMode.CONTENT_MODE_CENTER) {
                if (!b || !oqy.d(context, imageProxy)) {
                    ((dng)f2).v(dfh.b);
                }
                ((dng)f2).G(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            else {
                djx djx;
                if (imageProxy.contentMode().ordinal() != 2) {
                    djx = djx.c;
                }
                else {
                    djx = djx.b;
                }
                ((dng)f2).x(djx);
            }
            if (imageProxy2 != null) {
                n = oqy.b(context, imageProxy2);
                if (n != 0) {
                    ((dng)f2).H(n);
                }
                else {
                    final aexq o3 = o(imageProxy2);
                    if (o3.h()) {
                        ((dng)f2).I(n(context, (byte[])o3.c()));
                    }
                }
            }
            if (imageProxy3 != null) {
                n = oqy.b(context, imageProxy3);
                if (n != 0) {
                    ((dng)f2).y(n);
                }
                else {
                    final aexq o4 = o(imageProxy3);
                    if (o4.h()) {
                        ((dng)f2).z(n(context, (byte[])o4.c()));
                    }
                }
            }
            return (dci)f2;
        }
        return null;
    }
    
    public static boolean l(Context baseContext) {
        if (baseContext instanceof Activity) {
            return ((Activity)baseContext).isDestroyed();
        }
        if (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper)baseContext).getBaseContext();
            if (baseContext != null && l(baseContext)) {
                return true;
            }
        }
        return false;
    }
    
    public static void m(final Drawable drawable, final ImageProxy imageProxy) {
        final ogs ogs = (ogs)imageProxy;
        if (!ogs.a.isEmpty()) {
            final ArrayList a = ogs.a;
            int n = 0;
            if (((ImageSourceProxy)a.get(0)).clientResource() != null) {
                if (((ImageSourceProxy)ogs.a.get(0)).clientResource().imageColor() != 0L) {
                    if (((ImageSourceProxy)ogs.a.get(0)).clientResource() != null) {
                        n = (int)ogs.a.get(0).clientResource().imageColor();
                    }
                    drawable.setColorFilter(n, PorterDuff$Mode.SRC_IN);
                }
            }
        }
    }
    
    public static Drawable n(final Context context, final byte[] array) {
        return (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(array, 0, array.length));
    }
    
    public static aexq o(final ImageProxy imageProxy) {
        final ArrayList a = ((ogs)imageProxy).a;
        final int size = a.size();
        int i = 0;
        while (i < size) {
            final ImageSourceProxy imageSourceProxy = (ImageSourceProxy)a.get(i);
            ++i;
            if (imageSourceProxy.imageData().length != 0) {
                return aexq.k(imageSourceProxy.imageData());
            }
        }
        return (aexq)aewp.a;
    }
    
    public static aexq p(final aqdw aqdw) {
        for (int i = 0; i < aqdw.c.size(); ++i) {
            final aqdy aqdy = aqdw.c.get(i);
            if (aqdy.c == 2) {
                return aexq.k(((agyc)aqdy.d).I());
            }
        }
        return (aexq)aewp.a;
    }
    
    public static ashe q(final opc opc, final int n, final afcw afcw, final osb osb, final ashe ashe) {
        if (!afcw.isEmpty()) {
            try {
                final afct h = afcw.h();
                final HashMap hashMap = new HashMap();
                final agyh o = agyh.O(opc.a);
                while (!o.E()) {
                    final int n2 = o.n();
                    final int a = ahco.a(n2);
                    if (ahco.b(n2) == 2) {
                        hashMap.put(a, o.H());
                    }
                    else {
                        o.G(n2);
                    }
                }
                final afie k = afcw.r().k();
                while (((Iterator)k).hasNext()) {
                    final Map.Entry<K, Integer> entry = (Map.Entry<K, Integer>)((Iterator)k).next();
                    final String s = (String)entry.getKey();
                    byte[] a2;
                    if ((a2 = (byte[])hashMap.get(entry.getValue())) == null) {
                        a2 = otc.a;
                    }
                    h.g((Object)s, (Object)a2);
                }
                final afcw c = h.c();
                final afdu s2 = afcw.s();
                final ArrayList list = new ArrayList(((Collection)s2).size());
                for (final String s3 : s2) {
                    final q q = new q(s3, 7);
                    if (ashe != null && "/environment".equals(s3)) {
                        list.add((Object)ashe.W((asjc)llz.l).W((asjc)q));
                    }
                    else {
                        list.add((Object)osb.a(s3).W((asjc)q));
                    }
                }
                return ashe.l((Iterable)list, (asjc)new opg(c, 1)).W((asjc)new opd(n, afcw, opc, 1));
            }
            catch (final IOException ex) {
                throw new otf("Failed to process default model", ex);
            }
        }
        return (ashe)atir.aR((Object)opc.b(n));
    }
    
    public static Map r(final orl orl, final cxz cxz) {
        final boolean b = orl.b();
        Map map2;
        final Map map = map2 = null;
        if (b) {
            final osw osw = (osw)cxz.u((Class)osw.class);
            map2 = map;
            if (osw != null) {
                map2 = new HashMap();
                final Object a = osw.a;
                if (a != null) {
                    map2.put("CellLogId", a);
                }
                final Object c = osw.c;
                if (c != null) {
                    map2.put("CELL_NODE_ID", c);
                }
            }
        }
        return map2;
    }
    
    public static int s(final int n) {
        if (n == 0) {
            return 1;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        return 0;
                    }
                    case 1005: {
                        return 1006;
                    }
                    case 1004: {
                        return 1005;
                    }
                    case 1003: {
                        return 1004;
                    }
                    case 1002: {
                        return 1003;
                    }
                    case 1001: {
                        return 1002;
                    }
                }
                break;
            }
            case 952: {
                return 953;
            }
            case 951: {
                return 952;
            }
            case 950: {
                return 951;
            }
        }
    }
    
    public static SharedPreferences t(final Context context, final String s, final aexq aexq) {
        return context.getSharedPreferences(w(s, aexq), 0);
    }
    
    public static MessageLite u(final String s, final ahbe ahbe) {
        try {
            return (MessageLite)ahbe.l(Base64.decode(s, 3), ExtensionRegistryLite.a);
        }
        catch (final IllegalArgumentException ex) {
            throw new ahab("Unable to decode to byte array", new IOException(ex));
        }
    }
    
    public static MessageLite v(final SharedPreferences sharedPreferences, final String s, final ahbe ahbe) {
        final String string = sharedPreferences.getString(s, (String)null);
        if (string == null) {
            return null;
        }
        try {
            return u(string, ahbe);
        }
        catch (final ahab ahab) {
            return null;
        }
    }
    
    public static String w(final String s, final aexq aexq) {
        String concat = s;
        if (aexq != null) {
            concat = s;
            if (aexq.h()) {
                concat = s.concat((String)aexq.c());
            }
        }
        return concat;
    }
    
    public static String x(final MessageLite messageLite) {
        return Base64.encodeToString(messageLite.toByteArray(), 3);
    }
    
    public static void y(final SharedPreferences$Editor sharedPreferences$Editor, final String s) {
        sharedPreferences$Editor.remove(s);
    }
    
    public static void z(final SharedPreferences$Editor sharedPreferences$Editor, final String s, final MessageLite messageLite) {
        sharedPreferences$Editor.putString(s, x(messageLite));
    }
}
