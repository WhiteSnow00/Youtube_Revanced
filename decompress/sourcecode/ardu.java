import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.text.ParseException;
import android.text.TextUtils;
import android.net.Uri;
import android.database.Cursor;
import android.widget.TableRow$LayoutParams;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.widget.TableLayout;
import android.media.MediaCodec;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.HashMap;
import java.util.List;
import io.grpc.Status;
import android.content.Intent;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardu
{
    public static ardu c;
    public final int a;
    public final Object b;
    
    public ardu() {
        this.a = 1;
        this.b = new ArrayList();
    }
    
    public ardu(final int n) {
        this(n, (aecn)null);
    }
    
    public ardu(final int a, final aecn b) {
        this.a = a;
        this.b = b;
        if (a == 4) {
            aeda.g((Object)b, "CompatService cannot be null when state is connected");
        }
    }
    
    public ardu(final int a, final ahws b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final Intent b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final aqyw b) {
        this.a = a;
        this.b = b;
    }
    
    private ardu(final int a, final Status b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final String b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final zyw b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final byte[] array) {
        this.a = a;
        this.b = atit.aa();
    }
    
    public ardu(final int n, final byte[] array, final byte[] array2) {
        this(n, (ahws)null);
    }
    
    public ardu(final int a, final byte[] b, final char[] array) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final char[] array) {
        this.a = a;
        this.b = new HashMap();
    }
    
    public ardu(final int a, final char[] array, final byte[] array2) {
        this.b = new Object();
        this.a = a;
    }
    
    public ardu(final int a, final char[] array, final byte[] array2, final byte[] array3) {
        this.b = null;
        this.a = a;
    }
    
    public ardu(final int a, final FormatStreamModel[] b) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final int a, final Object... b) {
        this.a = a;
        this.b = b;
    }
    
    @Deprecated
    public ardu(final int a, final ofb[] b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public ardu(final akco b) {
        this.b = b;
        akcl akcl;
        if ((akcl = b.c) == null) {
            akcl = akcl.a;
        }
        final int b2 = akcl.b;
        if ((b2 & 0x8) != 0x0) {
            this.a = 1;
            return;
        }
        if ((b2 & 0x4) != 0x0) {
            this.a = 2;
            return;
        }
        if ((b2 & 0x1) != 0x0) {
            this.a = 3;
            return;
        }
        if ((b2 & 0x2) != 0x0) {
            this.a = 4;
            return;
        }
        if ((b2 & 0x80) != 0x0) {
            this.a = 5;
            return;
        }
        trn.b("Encountered unknown or invalid card");
        this.a = 0;
    }
    
    public ardu(final Context context) {
        this.b = context.getMainLooper().getThread();
        this.a = tsi.a(context);
    }
    
    public ardu(final Context b, final byte[] array) {
        this.b = b;
        this.a = 2;
    }
    
    public ardu(final RectF b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final Typeface b) {
        this.b = b;
        this.a = 0;
    }
    
    public ardu(final MediaCodec b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final TableLayout b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final arcq b, final int a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final ardm b) {
        this.a = 2;
        this.b = b;
    }
    
    public ardu(final blt b, final int a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final ccb b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final PaneDescriptor b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final ConnectionResult b, final int a) {
        kgk.aL((Object)b);
        this.b = b;
        this.a = a;
    }
    
    public ardu(final Object b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final Object b, final int a, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final String b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    private ardu(final String s, final Map map, final int n) {
        this(Collections.singletonList(s), map, n);
    }
    
    public ardu(final List list) {
        final boolean empty = list.isEmpty();
        final Object o = null;
        if (empty) {
            this.a = 0;
            this.b = null;
            return;
        }
        this.a = list.get(0);
        Object b;
        if (list.size() <= 3) {
            b = o;
        }
        else {
            b = new auck(list.get(1), list.get(2), list.subList(3, list.size()));
        }
        this.b = b;
    }
    
    private ardu(List unmodifiableList, final Map map, final int a) {
        unmodifiableList.getClass();
        unmodifiableList = Collections.unmodifiableList((List<?>)unmodifiableList);
        this.b = unmodifiableList;
        agot.v(unmodifiableList.isEmpty() ^ true, (Object)"videoIds cannot be empty");
        map.getClass();
        Collections.unmodifiableMap((Map<?, ?>)map);
        this.a = a;
    }
    
    public ardu(final Set b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public ardu(final byte[] b) {
        this.b = b;
        this.a = 0;
    }
    
    public ardu(final int[] array, final int n) {
    }
    
    public static ardu a(final int n, final Status status) {
        int n2 = n;
        if (n != 4) {
            n2 = 5;
        }
        agot.D(true);
        status.getClass();
        return new ardu(n2, status);
    }
    
    public static ardu b(final int n) {
        agot.D(true);
        return new ardu(n, (Status)null);
    }
    
    public static TableRow$LayoutParams l() {
        final TableRow$LayoutParams tableRow$LayoutParams = new TableRow$LayoutParams();
        tableRow$LayoutParams.width = 0;
        tableRow$LayoutParams.weight = 1.0f;
        return tableRow$LayoutParams;
    }
    
    public static ardu n(final String s, final Cursor cursor) {
        if (cursor.isAfterLast()) {
            return null;
        }
        final int columnIndexOrThrow = cursor.getColumnIndexOrThrow(tdl.e(s, "ad_video_id"));
        final int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(tdl.e(s, "playback_count"));
        final int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(tdl.e(s, "status"));
        if (cursor.isNull(columnIndexOrThrow)) {
            return null;
        }
        cursor.getString(columnIndexOrThrow);
        return new ardu(cursor.getInt(columnIndexOrThrow2), zyw.a(cursor.getInt(columnIndexOrThrow3)));
    }
    
    public static ardu o(final Uri uri) {
        Uri build = uri;
        if (tmy.cJ(uri)) {
            build = uri.buildUpon().scheme("http").build();
        }
        if ("vnd.youtube".equals(build.getScheme())) {
            String s2;
            final String s = s2 = build.getSchemeSpecificPart();
            if (s.startsWith("//")) {
                s2 = s.substring(2);
            }
            if (!TextUtils.isEmpty((CharSequence)s2)) {
                final int index = s2.indexOf(63);
                String substring = s2;
                if (index > 0) {
                    substring = s2.substring(0, index);
                }
                final Map t = t(build);
                return new ardu(substring, t, r((String)t.get("t")));
            }
            throw new ParseException("No video id in the Uri: ".concat(String.valueOf(String.valueOf(build))), 0);
        }
        else if ("youtu.be".equalsIgnoreCase(build.getHost())) {
            final List pathSegments = build.getPathSegments();
            if (!pathSegments.isEmpty() && !TextUtils.isEmpty((CharSequence)pathSegments.get(0))) {
                final Map t2 = t(build);
                return new ardu(pathSegments.subList(0, 1), u(t2), s(build, t2));
            }
            throw new ParseException("No video id in the Uri path: ".concat(String.valueOf(String.valueOf(build))), 0);
        }
        else {
            final String path = build.getPath();
            final String fragment = build.getFragment();
            if (path.startsWith("/watch") || path.startsWith("/movie")) {
                return v(build);
            }
            if (path.startsWith("/get_video")) {
                final Map t3 = t(build);
                final String s3 = t3.get("video_id");
                if (!TextUtils.isEmpty((CharSequence)s3)) {
                    return new ardu(s3, u(t3), s(build, t3));
                }
                throw new ParseException("No id found in the uri: ".concat(String.valueOf(String.valueOf(build))), 0);
            }
            else {
                if (path.startsWith("/v/")) {
                    final String[] split = build.getLastPathSegment().split("&");
                    final String s4 = split[0];
                    final HashMap hashMap = new HashMap();
                    for (int i = 1; i < split.length; ++i) {
                        final String[] split2 = split[i].split("=");
                        if (split2.length == 2) {
                            hashMap.put(split2[0], split2[1]);
                        }
                    }
                    return new ardu(s4, hashMap, r((String)hashMap.get("start")));
                }
                if (path.startsWith("/e/") || path.startsWith("/embed/")) {
                    return new ardu(build.getLastPathSegment(), t(build), r(build.getQueryParameter("start")));
                }
                if (fragment != null && (fragment.startsWith("/watch") || fragment.startsWith("watch"))) {
                    return v(Uri.parse(build.buildUpon().encodedPath(build.getFragment()).fragment("").build().toString()));
                }
                throw new ParseException("Unrecognised URI", 0);
            }
        }
    }
    
    public static ardu p(final MediaCodec mediaCodec) {
        final int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000000L);
        if (dequeueInputBuffer >= 0) {
            return new ardu(mediaCodec, dequeueInputBuffer);
        }
        return null;
    }
    
    public static ardu q(final int n, final ofb[] array) {
        return new ardu(n, array, null);
    }
    
    private static int r(String substring) {
        if (substring == null) {
            return 0;
        }
        final int index = substring.indexOf("h");
        int n;
        String substring2;
        if (index >= 0) {
            n = tsx.b(substring.substring(0, index), 0) * 3600000;
            substring2 = substring.substring(index + 1);
        }
        else {
            n = 0;
            substring2 = substring;
        }
        final int index2 = substring2.indexOf("m");
        int n2 = n;
        substring = substring2;
        if (index2 >= 0) {
            n2 = n + tsx.b(substring2.substring(0, index2), 0) * 60000;
            substring = substring2.substring(index2 + 1);
        }
        String substring3 = substring;
        if (substring.endsWith("s")) {
            substring3 = substring.substring(0, substring.length() - 1);
        }
        return n2 + (int)(tsx.a(substring3, 0.0f) * 1000.0f);
    }
    
    private static int s(final Uri uri, final Map map) {
        String s2;
        final String s = s2 = map.get("t");
        if (s == null) {
            final String decode = Uri.decode(uri.getEncodedFragment());
            s2 = s;
            if (!TextUtils.isEmpty((CharSequence)decode)) {
                final String[] split = decode.split("&");
                final int length = split.length;
                int n = 0;
                String s3 = s;
                while (true) {
                    s2 = s3;
                    if (n >= length) {
                        break;
                    }
                    final String[] split2 = split[n].split("=");
                    String s4 = s3;
                    if (split2.length == 2) {
                        s4 = s3;
                        if ("t".equals(split2[0])) {
                            s4 = split2[1];
                        }
                    }
                    ++n;
                    s3 = s4;
                }
            }
        }
        return r(s2);
    }
    
    private static Map t(final Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptyMap();
        }
        final HashMap hashMap = new HashMap();
        for (final String s : uri.getQueryParameterNames()) {
            hashMap.put(s, uri.getQueryParameter(s));
        }
        return hashMap;
    }
    
    private static Map u(final Map map) {
        final HashMap hashMap = new HashMap(map);
        hashMap.remove("v");
        hashMap.remove("video_id");
        hashMap.remove("video_ids");
        hashMap.remove("feature");
        return hashMap;
    }
    
    private static ardu v(final Uri uri) {
        final Map t = t(uri);
        final String s = t.get("v");
        final String s2 = t.get("video_ids");
        String s3 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s3 = s;
            if (TextUtils.isEmpty((CharSequence)s2)) {
                final List pathSegments = uri.getPathSegments();
                int index = pathSegments.indexOf("watch");
                if (index < 0) {
                    throw new ParseException("No /watch/ part in the Uri: ".concat(String.valueOf(String.valueOf(uri))), 0);
                }
                if (++index >= pathSegments.size()) {
                    throw new ParseException("No id found in the Uri: ".concat(String.valueOf(String.valueOf(uri))), 0);
                }
                s3 = (String)pathSegments.get(index);
                if (TextUtils.isEmpty((CharSequence)s3)) {
                    throw new ParseException("No video id in the Uri: ".concat(String.valueOf(String.valueOf(uri))), 0);
                }
            }
        }
        if (s2 == null) {
            return new ardu(s3, u(t), s(uri, t));
        }
        return new ardu(Arrays.asList(s2.split(",")), u(t), s(uri, t));
    }
    
    public final akch c() {
        akcl akcl;
        if ((akcl = ((akco)this.b).c) == null) {
            akcl = akcl.a;
        }
        akch akch;
        if ((akch = akcl.f) == null) {
            akch = akch.a;
        }
        return akch;
    }
    
    public final akcu d() {
        akcl akcl;
        if ((akcl = ((akco)this.b).c) == null) {
            akcl = akcl.a;
        }
        akcu akcu;
        if ((akcu = akcl.e) == null) {
            akcu = akcu.a;
        }
        return akcu;
    }
    
    public final akcv e() {
        akcl akcl;
        if ((akcl = ((akco)this.b).c) == null) {
            akcl = akcl.a;
        }
        akcv akcv;
        if ((akcv = akcl.g) == null) {
            akcv = akcv.a;
        }
        return akcv;
    }
    
    public final akcx f() {
        akcl akcl;
        if ((akcl = ((akco)this.b).c) == null) {
            akcl = akcl.a;
        }
        akcx akcx;
        if ((akcx = akcl.c) == null) {
            akcx = akcx.a;
        }
        return akcx;
    }
    
    public final akcy g() {
        akcq akcq;
        if ((akcq = ((akco)this.b).b) == null) {
            akcq = akcq.a;
        }
        akcy akcy;
        if ((akcy = akcq.b) == null) {
            akcy = akcy.a;
        }
        return akcy;
    }
    
    public final akcz h() {
        akcl akcl;
        if ((akcl = ((akco)this.b).c) == null) {
            akcl = akcl.a;
        }
        akcz akcz;
        if ((akcz = akcl.d) == null) {
            akcz = akcz.a;
        }
        return akcz;
    }
    
    public final List i() {
        return ((akco)this.b).d;
    }
    
    public final byte[] j() {
        akcj akcj;
        if ((akcj = ((akco)this.b).e) == null) {
            akcj = akcj.a;
        }
        if ((akcj.b & 0x2) != 0x0) {
            akcj akcj2;
            if ((akcj2 = ((akco)this.b).e) == null) {
                akcj2 = akcj.a;
            }
            akcn akcn;
            if ((akcn = akcj2.c) == null) {
                akcn = akcn.a;
            }
            return akcn.b.I();
        }
        return null;
    }
    
    public final boolean k(final ByteBuffer byteBuffer, final long n, final int n2) {
        final int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final ByteBuffer byteBuffer2 = ((MediaCodec)this.b).getInputBuffers()[this.a];
        byteBuffer2.clear();
        byteBuffer.limit(position + Math.min(byteBuffer2.remaining(), limit - position));
        byteBuffer2.put(byteBuffer).flip();
        ((MediaCodec)this.b).queueInputBuffer(this.a, 0, byteBuffer2.remaining(), n, n2);
        byteBuffer.limit(limit);
        return byteBuffer.hasRemaining();
    }
    
    public final int m() {
        return ((ArrayList)((arcq)this.b).a).get(this.a);
    }
}
