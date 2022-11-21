import android.view.Display$Mode;
import android.view.Display;
import android.view.WindowManager;
import java.nio.ShortBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import j$.util.DesugarTimeZone;
import java.util.NoSuchElementException;
import android.util.SparseLongArray;
import android.os.SystemClock;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.media.AudioManager;
import android.content.res.Resources;
import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import android.app.UiModeManager;
import android.net.Uri;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.MissingResourceException;
import java.util.Collections;
import android.os.Parcel;
import java.util.List;
import java.io.IOException;
import java.io.Closeable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import android.content.pm.PackageManager$NameNotFoundException;
import android.telephony.TelephonyManager;
import java.util.Locale;
import android.os.Handler;
import android.os.Handler$Callback;
import android.os.Looper;
import android.text.TextUtils;
import android.hardware.display.DisplayManager;
import android.graphics.Point;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class baz
{
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final byte[] e;
    public static final Pattern f;
    private static final Pattern g;
    private static final Pattern h;
    private static final Pattern i;
    private static HashMap j;
    private static final String[] k;
    private static final String[] l;
    private static final int[] m;
    private static final int[] n;
    
    static {
        a = Build$VERSION.SDK_INT;
        b = Build.DEVICE;
        c = Build.MANUFACTURER;
        d = Build.MODEL;
        e = new byte[0];
        g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        h = Pattern.compile("%([A-Fa-f0-9]{2})");
        i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        k = new String[] { "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
        l = new String[] { "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
        m = $d2j$hex$541f0aaa$decode_I("00000000b71dc1046e3b8209d926430ddc7604136b6bc517b24d861a0550471eb8ed08260ff0c922d6d68a2f61cb4b2b649b0c35d386cd310aa08e3cbdbd4f3870db114cc7c6d0481ee09345a9fd5241acad155f1bb0d45bc2969756758b5652c836196a7f2bd86ea60d9b6311105a6714401d79a35ddc7d7a7b9f70cd665e74e0b6239857abe29c8e8da191399060953cc0278b8bdde68f52fba582e5e66486585b2bbeef46eaba3660a9b7817d68b3842d2fad3330eea9ea16ada45d0b6ca0906d32d42770f3d0fe56b0dd494b71d94c1b36c7fb06f7c32220b4ce953d75ca28803af29f9dfbf646bbb8fbf1a679fff4f63ee143ebffe59acdbce82dd07dec77708634c06d4730194b043dae56c539ab0682271c1b4323c53d002e7220c12acf9d8e1278804f16a1a60c1b16bbcd1f13eb8a01a4f64b057dd00808cacdc90c07ab9778b0b6567c69901571de8dd475dbdd936b6cc0526fb5e6116202fbd066bf469f5e085b5e5ad17d1d576660dc5363309b4dd42d5a490d0b1944ba16d84097c6a5ac20db64a8f9fd27a54ee0e6a14bb0a1bffcad60bb258b23b69296e2b22f2bad8a98366c8e41102f83f60dee87f35da9994440689d9d662b902a7bea94e71db4e0500075e4892636e93e3bf7ed3b6bb0f38c7671f7555032fae24df3fe5ff0bcc6e8ed7dc231cb3ecf86d6ffcb8386b8d5349b79d1edbd3adc5aa0fbd8eee00c6959fdcd6d80db8e6037c64f643296087a858bc97e5cad8a73ebb04b77560d044fe110c54b383686468f2b47428a7b005c3d66c158e4408255535d43519e3b1d252926dc21f0009f2c471d5e28424d1936f550d8322c769b3f9b6b5a3b26d6150391cbd40748ed970afff0560efaa011104dbdd014949b93192386521d0e562ff1b94beef5606dadf8d7706cfcd2202be2653deae6bc1ba9eb0b0668efb6bb27d701a6e6d3d880a5de6f9d64da6acd23c4ddd0e2c004f6a1cdb3eb60c97e8d3ebdc990ffb910b6bcb4a7ab7db0a2fb3aae15e6fbaaccc0b8a77bdd79a3c660369b717df79fa85bb4921f4675961a163288ad0bf38c742db081c330718599908a5d2e8d4b59f7ab085440b6c95045e68e4ef2fb4f4a2bdd0c479cc0cd43217d827b9660437f4f460072f85bc176fd0b86684a16476c93300461242dc565e94b9b115e565a1587701918306dd81c353d9f0282205e065b061d0bec1bdc0f51a69337e6bb52333f9d113e8880d03a8dd097243acd5620e3eb152d54f6d4297926a9c5ce3b68c1171d2bcca000eac8a550add6124d6cd2cb6b2fdf7c76eedbc1cba1e376d660e7aff023ea18ede2ee1dbda5f0aaa064f4738627f9c49be6fd09fdb889bee0798d67c63a80d0dbfb84d58bbc9a62967d9ebbb03e930cadff97b110b0af060d71abdf2b32a66836f3a26d66b4bcda7b75b8035d36b5b440f7b1");
        n = $d2j$hex$541f0aaa$decode_I("00000000070000000e000000090000001c0000001b0000001200000015000000380000003f000000360000003100000024000000230000002a0000002d00000070000000770000007e000000790000006c0000006b0000006200000065000000480000004f000000460000004100000054000000530000005a0000005d000000e0000000e7000000ee000000e9000000fc000000fb000000f2000000f5000000d8000000df000000d6000000d1000000c4000000c3000000ca000000cd00000090000000970000009e000000990000008c0000008b0000008200000085000000a8000000af000000a6000000a1000000b4000000b3000000ba000000bd000000c7000000c0000000c9000000ce000000db000000dc000000d5000000d2000000ff000000f8000000f1000000f6000000e3000000e4000000ed000000ea000000b7000000b0000000b9000000be000000ab000000ac000000a5000000a20000008f00000088000000810000008600000093000000940000009d0000009a0000002700000020000000290000002e0000003b0000003c00000035000000320000001f00000018000000110000001600000003000000040000000d0000000a0000005700000050000000590000005e0000004b0000004c00000045000000420000006f00000068000000610000006600000073000000740000007d0000007a000000890000008e000000870000008000000095000000920000009b0000009c000000b1000000b6000000bf000000b8000000ad000000aa000000a3000000a4000000f9000000fe000000f7000000f0000000e5000000e2000000eb000000ec000000c1000000c6000000cf000000c8000000dd000000da000000d3000000d4000000690000006e000000670000006000000075000000720000007b0000007c00000051000000560000005f000000580000004d0000004a0000004300000044000000190000001e000000170000001000000005000000020000000b0000000c00000021000000260000002f000000280000003d0000003a00000033000000340000004e00000049000000400000004700000052000000550000005c0000005b0000007600000071000000780000007f0000006a0000006d00000064000000630000003e00000039000000300000003700000022000000250000002c0000002b0000000600000001000000080000000f0000001a0000001d0000001400000013000000ae000000a9000000a0000000a7000000b2000000b5000000bc000000bb0000009600000091000000980000009f0000008a0000008d0000008400000083000000de000000d9000000d0000000d7000000c2000000c5000000cc000000cb000000e6000000e1000000e8000000ef000000fa000000fd000000f4000000f3000000");
    }
    
    public static long A(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                n2 = n;
            }
            else {
                n2 = n / 1000L;
            }
        }
        return n2;
    }
    
    public static Intent B(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        if (baz.a < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }
    
    public static Point C(Context context) {
        final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        Object o;
        if (displayManager != null) {
            o = displayManager.getDisplay(0);
        }
        else {
            o = null;
        }
        Object defaultDisplay = o;
        if (o == null) {
            o = context.getSystemService("window");
            bad.b(o);
            defaultDisplay = ((WindowManager)o).getDefaultDisplay();
        }
        Label_0235: {
            if (((Display)defaultDisplay).getDisplayId() != 0 || !ah(context)) {
                break Label_0235;
            }
            if (baz.a < 28) {
                o = aD("sys.display-size");
            }
            else {
                o = aD("vendor.display-size");
            }
            Label_0181: {
                if (TextUtils.isEmpty((CharSequence)o)) {
                    break Label_0181;
                }
                while (true) {
                    try {
                        final String[] ap = ap(((String)o).trim(), "x");
                        if (ap.length == 2) {
                            final int int1 = Integer.parseInt(ap[0]);
                            final int int2 = Integer.parseInt(ap[1]);
                            if (int1 > 0 && int2 > 0) {
                                context = (Context)new Point(int1, int2);
                                return (Point)context;
                            }
                        }
                        baq.a("Util", "Invalid display size: ".concat(String.valueOf(o)));
                        if ("Sony".equals(baz.c) && baz.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            context = (Context)new Point(3840, 2160);
                        }
                        else {
                            context = (Context)new Point();
                            o = ((Display)defaultDisplay).getMode();
                            ((Point)context).x = ((Display$Mode)o).getPhysicalWidth();
                            ((Point)context).y = ((Display$Mode)o).getPhysicalHeight();
                        }
                        return (Point)context;
                    }
                    catch (final NumberFormatException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static Handler D(final Looper looper, final Handler$Callback handler$Callback) {
        return new Handler(looper, handler$Callback);
    }
    
    public static Handler E() {
        return F(null);
    }
    
    public static Handler F(final Handler$Callback handler$Callback) {
        final Looper myLooper = Looper.myLooper();
        bad.c(myLooper);
        return D(myLooper, handler$Callback);
    }
    
    public static Handler G() {
        return D(H(), null);
    }
    
    public static Looper H() {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }
    
    public static ayh I(final int z, final int x, final int y) {
        final ayg ayg = new ayg();
        ayg.k = "audio/raw";
        ayg.x = x;
        ayg.y = y;
        ayg.z = z;
        return ayg.a();
    }
    
    public static aze J(final azi azi, final aze aze) {
        final boolean f = azi.F();
        final axx axx = (axx)azi;
        final azn q = axx.q();
        final boolean p2 = q.p();
        final boolean b = true;
        final boolean b2 = !p2 && q.o(axx.j(), axx.a).h;
        final azn q2 = axx.q();
        boolean b3 = false;
        Label_0120: {
            if (!q2.p()) {
                final int j = axx.j();
                final int aq = axx.aq();
                ((bez)azi).ad();
                if (q2.q(j, aq) != -1) {
                    b3 = true;
                    break Label_0120;
                }
            }
            b3 = false;
        }
        final int ap = axx.ap();
        final azn q3 = axx.q();
        final boolean b4 = !q3.p() && q3.o(axx.j(), axx.a).d();
        final azn q4 = axx.q();
        final boolean b5 = !q4.p() && q4.o(axx.j(), axx.a).i;
        final boolean p3 = azi.q().p();
        final slt slt = new slt((char[])null, (byte[])null);
        axu.c(aze, slt);
        final boolean b6 = f ^ true;
        axu.d(4, b6, slt);
        axu.d(5, b2 && !f, slt);
        axu.d(6, b3 && !f, slt);
        final boolean b7 = !p3 && (b3 || !b4 || b2) && !f;
        final boolean b8 = ap != -1;
        axu.d(7, b7, slt);
        axu.d(8, b8 && !f, slt);
        axu.d(9, !p3 && (b8 || (b4 && b5)) && !f, slt);
        axu.d(10, b6, slt);
        axu.d(11, b2 && !f, slt);
        axu.d(12, b2 && !f && b, slt);
        return axu.b(slt);
    }
    
    public static CharSequence K(final CharSequence charSequence, final int n) {
        if (charSequence.length() <= n) {
            return charSequence;
        }
        return charSequence.subSequence(0, n);
    }
    
    public static Object L(final Object o) {
        return o;
    }
    
    public static String M(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    public static String N(final byte[] array) {
        return new String(array, afas.c);
    }
    
    public static String O(final byte[] array, final int n, final int n2) {
        return new String(array, n, n2, afas.c);
    }
    
    public static String P(final Object[] array) {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        while (true) {
            final int length = array.length;
            if (n >= length) {
                break;
            }
            sb.append(array[n].getClass().getSimpleName());
            if (n < length - 1) {
                sb.append(", ");
            }
            ++n;
        }
        return sb.toString();
    }
    
    public static String Q(final Context context) {
        if (context != null) {
            final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            if (telephonyManager != null) {
                final String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty((CharSequence)networkCountryIso)) {
                    return aewr.c(networkCountryIso);
                }
            }
        }
        return aewr.c(Locale.getDefault().getCountry());
    }
    
    public static String R(final int n) {
        if (n == 0) {
            return "NO";
        }
        if (n == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (n == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (n == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (n == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
    
    public static String S(final int n) {
        if (n == -2) {
            return "none";
        }
        if (n == -1) {
            return "unknown";
        }
        if (n == 0) {
            return "default";
        }
        if (n == 1) {
            return "audio";
        }
        if (n != 2) {
            return "text";
        }
        return "video";
    }
    
    public static String T(final Context context, final String s) {
        String versionName;
        try {
            versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            versionName = "?";
        }
        final String release = Build$VERSION.RELEASE;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("/");
        sb.append(versionName);
        sb.append(" (Linux;Android ");
        sb.append(release);
        sb.append(") AndroidXMedia3/1.0.0-beta02");
        return sb.toString();
    }
    
    public static String U(String s) {
        if (s == null) {
            return null;
        }
        final String replace = s.replace('_', '-');
        String s2 = s;
        if (!replace.isEmpty()) {
            s2 = s;
            if (!replace.equals("und")) {
                s2 = replace;
            }
        }
        final String b = aewr.b(s2);
        final String[] aq = aq(b, "-");
        final int n = 0;
        final String s3 = aq[0];
        if (baz.j == null) {
            baz.j = aE();
        }
        final String s4 = baz.j.get(s3);
        String s5 = s3;
        s = b;
        if (s4 != null) {
            s = s4.concat(String.valueOf(b.substring(s3.length())));
            s5 = s4;
        }
        int n2 = n;
        if (!"no".equals(s5)) {
            n2 = n;
            if (!"i".equals(s5)) {
                if (!"zh".equals(s5)) {
                    return s;
                }
                n2 = n;
            }
        }
        String concat;
        while (true) {
            final String[] l = baz.l;
            final int length = l.length;
            concat = s;
            if (n2 >= 18) {
                break;
            }
            if (s.startsWith(l[n2])) {
                final String s6 = l[n2 + 1];
                s = s.substring(l[n2].length());
                concat = String.valueOf(s6).concat(String.valueOf(s));
                break;
            }
            n2 += 2;
        }
        return concat;
    }
    
    public static String V(final String s) {
        final int length = s.length();
        final int n = 0;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            int n3 = n2;
            if (s.charAt(i) == '%') {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        if (n2 == 0) {
            return s;
        }
        final int n4 = length - (n2 + n2);
        final StringBuilder sb = new StringBuilder(n4);
        final Matcher matcher = baz.h.matcher(s);
        int end = n;
        while (n2 > 0 && matcher.find()) {
            final String group = matcher.group(1);
            bad.b(group);
            final char c = (char)Integer.parseInt(group, 16);
            sb.append(s, end, matcher.start());
            sb.append(c);
            end = matcher.end();
            --n2;
        }
        if (end < length) {
            sb.append(s, end, length);
        }
        if (sb.length() != n4) {
            return null;
        }
        return sb.toString();
    }
    
    public static ExecutorService W(final String s) {
        return Executors.newSingleThreadExecutor((ThreadFactory)new lyb(s, 1));
    }
    
    public static void X(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static void Y(final List list, final int n, final int n2) {
        if (n >= 0 && n2 <= list.size() && n <= n2) {
            if (n != n2) {
                list.subList(n, n2).clear();
            }
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void Z(final Parcel parcel, final boolean b) {
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    public static float a(final float n, final float n2, final float n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static void aA(final long[] array, long n) {
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        if (n >= 1000000L && n % 1000000L == 0L) {
            n /= 1000000L;
            while (i < array.length) {
                array[i] /= n;
                ++i;
            }
        }
        else if (n < 1000000L && 1000000L % n == 0L) {
            n = 1000000L / n;
            for (int j = n2; j < array.length; ++j) {
                array[j] *= n;
            }
        }
        else {
            final double n4 = (double)n;
            for (int k = n3; k < array.length; ++k) {
                Double.isNaN(n4);
                final double n5 = 1000000.0 / n4;
                final double n6 = (double)array[k];
                Double.isNaN(n6);
                array[k] = (long)(n6 * n5);
            }
        }
    }
    
    public static long aB(final long n, final long n2) {
        final long n3 = n - n2;
        if (((n ^ n3) & (n2 ^ n)) < 0L) {
            return Long.MIN_VALUE;
        }
        return n3;
    }
    
    public static int aC(final List list, final Comparable comparable, final boolean b) {
        int binarySearch;
        final int n = binarySearch = Collections.binarySearch(list, comparable);
        int n2;
        if (n < 0) {
            n2 = -(n + 2);
        }
        else {
            do {
                n2 = binarySearch - 1;
                if (n2 < 0) {
                    break;
                }
                binarySearch = n2;
            } while (((Comparable<Comparable>)list.get(n2)).compareTo(comparable) == 0);
            if (b) {
                return n2 + 1;
            }
        }
        return n2;
    }
    
    private static String aD(final String s) {
        try {
            final Class<?> forName = Class.forName("android.os.SystemProperties");
            return (String)forName.getMethod("get", String.class).invoke(forName, s);
        }
        catch (final Exception ex) {
            baq.b("Util", "Failed to read system property ".concat(s), ex);
            return null;
        }
    }
    
    private static HashMap aE() {
        String[] array = Locale.getISOLanguages();
        final int length = array.length;
        final int length2 = baz.k.length;
        final HashMap hashMap = new HashMap<String, String>(length + 88);
        final int n = 0;
        int length3 = 0;
    Label_0081_Outer:
        while (true) {
            int n2 = n;
            Label_0087: {
                if (length3 >= length) {
                    break Label_0087;
                }
                final String s = array[length3];
                while (true) {
                    try {
                        final String iso3Language = new Locale(s).getISO3Language();
                        if (!TextUtils.isEmpty((CharSequence)iso3Language)) {
                            hashMap.put(iso3Language, s);
                        }
                        ++length3;
                        continue Label_0081_Outer;
                        while (true) {
                            hashMap.put(array[n2], array[n2 + 1]);
                            n2 += 2;
                            array = baz.k;
                            length3 = array.length;
                            iftrue(Label_0124:)(n2 >= 88);
                            continue;
                        }
                        Label_0124: {
                            return hashMap;
                        }
                    }
                    catch (final MissingResourceException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static boolean aa(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            if (o2 == null) {
                return true;
            }
            equals = false;
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static boolean ab(final bat bat, final bat bat2, final Inflater inflater) {
        if (bat.a() <= 0) {
            return false;
        }
        if (bat2.b() < bat.a()) {
            final int a = bat.a();
            bat2.A(a + a);
        }
        Inflater inflater2;
        if ((inflater2 = inflater) == null) {
            inflater2 = new Inflater();
        }
        inflater2.setInput(bat.a, bat.b, bat.a());
        int n = 0;
        try {
            while (true) {
                final int n2 = n + inflater2.inflate(bat2.a, n, bat2.b() - n);
                if (inflater2.finished()) {
                    bat2.F(n2);
                    return true;
                }
                if (inflater2.needsDictionary() || inflater2.needsInput()) {
                    return false;
                }
                if ((n = n2) != bat2.b()) {
                    continue;
                }
                final int b = bat2.b();
                bat2.A(b + b);
                n = n2;
            }
        }
        catch (final DataFormatException ex) {
            return false;
        }
        finally {
            inflater2.reset();
        }
    }
    
    public static boolean ac(final Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }
    
    public static boolean ad(final int n) {
        return n == 536870912 || n == 805306368 || n == 4;
    }
    
    public static boolean ae(final int n) {
        return n == 3 || n == 2 || n == 268435456 || n == 536870912 || n == 805306368 || n == 4;
    }
    
    public static boolean af(final int n) {
        return n == 10 || n == 13;
    }
    
    public static boolean ag(final Uri uri) {
        final String scheme = uri.getScheme();
        return TextUtils.isEmpty((CharSequence)scheme) || "file".equals(scheme);
    }
    
    public static boolean ah(final Context context) {
        final UiModeManager uiModeManager = (UiModeManager)context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }
    
    public static boolean ai(final Parcel parcel) {
        return parcel.readInt() != 0;
    }
    
    public static byte[] aj(final String s) {
        return s.getBytes(afas.c);
    }
    
    public static byte[] ak(final InputStream inputStream) {
        final byte[] array = new byte[4096];
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public static Object[] al(final Object[] array) {
        return array;
    }
    
    public static Object[] am(Object[] copy, final Object[] array) {
        final int length = copy.length;
        final int length2 = array.length;
        copy = Arrays.copyOf(copy, length + length2);
        System.arraycopy(array, 0, copy, length, length2);
        return copy;
    }
    
    public static Object[] an(final Object[] array, final int n) {
        bad.d(n <= array.length);
        return Arrays.copyOf(array, n);
    }
    
    public static String[] ao() {
        final String[] ap = ap(Resources.getSystem().getConfiguration().getLocales().toLanguageTags(), ",");
        for (int i = 0; i < ap.length; ++i) {
            ap[i] = U(ap[i]);
        }
        return ap;
    }
    
    public static String[] ap(final String s, final String s2) {
        return s.split(s2, -1);
    }
    
    public static String[] aq(final String s, final String s2) {
        return s.split(s2, 2);
    }
    
    public static String[] ar(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return new String[0];
        }
        return ap(s.trim(), "(\\s*,\\s*)");
    }
    
    public static long as(final long n, final long n2) {
        final long n3 = n + n2;
        if (((n ^ n3) & (n2 ^ n3)) < 0L) {
            return Long.MAX_VALUE;
        }
        return n3;
    }
    
    public static int at(final List list, final Comparable comparable) {
        int binarySearch = Collections.binarySearch(list, comparable);
        int n;
        if (binarySearch < 0) {
            n = ~binarySearch;
        }
        else {
            final int size = list.size();
            do {
                n = binarySearch + 1;
                if (n >= size) {
                    break;
                }
                binarySearch = n;
            } while (((Comparable<Comparable>)list.get(n)).compareTo(comparable) == 0);
        }
        return n;
    }
    
    public static int au(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        int n3;
        if (n2 < 0) {
            n3 = ~n2;
        }
        else {
            int n4;
            do {
                n4 = binarySearch + 1;
                if (n4 >= array.length) {
                    break;
                }
                binarySearch = n4;
            } while (array[n4] == n);
            if (b) {
                return n4 - 1;
            }
            n3 = n4;
        }
        return n3;
    }
    
    public static int av(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        int n3;
        if (n2 < 0) {
            n3 = -(n2 + 2);
        }
        else {
            int n4;
            do {
                n4 = binarySearch - 1;
                if (n4 < 0) {
                    break;
                }
                binarySearch = n4;
            } while (array[n4] == n);
            n3 = n4 + 1;
        }
        int max = n3;
        if (b) {
            max = Math.max(0, n3);
        }
        return max;
    }
    
    public static int aw(final byte[] array, final int n) {
        int i = 0;
        int n2 = -1;
        while (i < n) {
            n2 = (baz.m[n2 >>> 24 ^ (array[i] & 0xFF)] ^ n2 << 8);
            ++i;
        }
        return n2;
    }
    
    public static int ax(final byte[] array, int i, final int n) {
        int n2 = 0;
        while (i < n) {
            n2 = baz.n[n2 ^ (array[i] & 0xFF)];
            ++i;
        }
        return n2;
    }
    
    public static Object[] ay(final Object[] array, final int n) {
        bad.d(true);
        bad.d(n <= array.length);
        return Arrays.copyOfRange(array, 1, n);
    }
    
    public static void az(final Handler handler, final Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        handler.post(runnable);
    }
    
    public static int b(final int[] array, int n, final boolean b, final boolean b2) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            n = -(n2 + 2);
        }
        else {
            int n3;
            do {
                n3 = binarySearch - 1;
                if (n3 < 0) {
                    break;
                }
                binarySearch = n3;
            } while (array[n3] == n);
            if (b) {
                n = n3 + 1;
            }
            else {
                n = n3;
            }
        }
        int max = n;
        if (b2) {
            max = Math.max(0, n);
        }
        return max;
    }
    
    public static int c(final int n, final int n2) {
        return (n + n2 - 1) / n2;
    }
    
    public static int d(final long n, final long n2) {
        int n3;
        if (n < n2) {
            n3 = -1;
        }
        else {
            if (n == n2) {
                return 0;
            }
            n3 = 1;
        }
        return n3;
    }
    
    public static int e(final int n, final int n2, final int n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static int f(final Context context) {
        final AudioManager audioManager = (AudioManager)context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }
    
    public static int g(final int n) {
        if (n != 12) {
            switch (n) {
                default: {
                    return 0;
                }
                case 8: {
                    return 6396;
                }
                case 7: {
                    return 1276;
                }
                case 6: {
                    return 252;
                }
                case 5: {
                    return 220;
                }
                case 4: {
                    return 204;
                }
                case 3: {
                    return 28;
                }
                case 2: {
                    return 12;
                }
                case 1: {
                    return 4;
                }
            }
        }
        else {
            if (baz.a >= 32) {
                return 743676;
            }
            return 0;
        }
    }
    
    public static int h(final ByteBuffer byteBuffer, int int1) {
        int1 = byteBuffer.getInt(int1);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return int1;
        }
        return Integer.reverseBytes(int1);
    }
    
    public static int i(final int n) {
        if (n != 2 && n != 4) {
            if (n != 10) {
                if (n != 7) {
                    if (n != 8) {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return 6006;
                                    }
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28: {
                                        return 6002;
                                    }
                                }
                                break;
                            }
                            case 15: {
                                break;
                            }
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22: {
                                return 6004;
                            }
                            case 16:
                            case 18: {
                                return 6005;
                            }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }
    
    public static int j(final String s) {
        int int1 = 0;
        if (s == null) {
            return 0;
        }
        final String[] ap = ap(s, "_");
        final int length = ap.length;
        if (length < 2) {
            return 0;
        }
        final String s2 = ap[length - 1];
        boolean b;
        if (length >= 3 && "neg".equals(ap[length - 2])) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            bad.b(s2);
            int1 = Integer.parseInt(s2);
            if (b) {
                return -int1;
            }
            return int1;
        }
        catch (final NumberFormatException ex) {
            return int1;
        }
    }
    
    public static int k(final String s) {
        final int length = s.length();
        int i = 0;
        bad.d(length <= 4);
        int n = 0;
        while (i < length) {
            n = (n << 8 | s.charAt(i));
            ++i;
        }
        return n;
    }
    
    public static int l(final int n) {
        if (n == 8) {
            return 3;
        }
        if (n == 16) {
            return 2;
        }
        if (n == 24) {
            return 536870912;
        }
        if (n != 32) {
            return 0;
        }
        return 805306368;
    }
    
    public static int m(final int n, final int n2) {
        if (n != 2) {
            int n3 = n2;
            if (n != 3) {
                if (n != 4) {
                    if (n == 268435456) {
                        return n2 + n2;
                    }
                    if (n == 536870912) {
                        return n2 * 3;
                    }
                    if (n != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
                n3 = n2 * 4;
            }
            return n3;
        }
        return n2 + n2;
    }
    
    public static int n(final int n) {
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 0;
        }
        if (n != 3) {
            return 4;
        }
        return 8;
    }
    
    public static int o(final Uri uri, String s) {
        int n = -1;
        final int n2 = 4;
        if (s == null) {
            s = uri.getScheme();
            int n3;
            if (s != null && aewr.d("rtsp", s)) {
                n3 = 3;
            }
            else {
                s = uri.getLastPathSegment();
                if (s == null) {
                    n3 = n2;
                }
                else {
                    final int lastIndex = s.lastIndexOf(46);
                    if (lastIndex >= 0) {
                        s = aewr.b(s.substring(lastIndex + 1));
                        switch (s.hashCode()) {
                            case 3299913: {
                                if (s.equals("m3u8")) {
                                    n = 1;
                                    break;
                                }
                                break;
                            }
                            case 3242057: {
                                if (s.equals("isml")) {
                                    n = 3;
                                    break;
                                }
                                break;
                            }
                            case 108321: {
                                if (s.equals("mpd")) {
                                    n = 0;
                                    break;
                                }
                                break;
                            }
                            case 104579: {
                                if (s.equals("ism")) {
                                    n = 2;
                                    break;
                                }
                                break;
                            }
                        }
                        if (n != 0) {
                            if (n != 1) {
                                if (n != 2 && n != 3) {
                                    n3 = 4;
                                }
                                else {
                                    n3 = 1;
                                }
                            }
                            else {
                                n3 = 2;
                            }
                        }
                        else {
                            n3 = 0;
                        }
                        if (n3 != 4) {
                            return n3;
                        }
                    }
                    final Pattern i = baz.i;
                    final String path = uri.getPath();
                    bad.b(path);
                    final Matcher matcher = i.matcher(path);
                    n3 = n2;
                    if (matcher.matches()) {
                        final String group = matcher.group(2);
                        if (group != null) {
                            if (group.contains("format=mpd-time-csf")) {
                                n3 = 0;
                                return n3;
                            }
                            if (group.contains("format=m3u8-aapl")) {
                                return 2;
                            }
                        }
                        n3 = 1;
                    }
                }
            }
            return n3;
        }
        switch (s.hashCode()) {
            case 1154777587: {
                if (s.equals("application/x-rtsp")) {
                    n = 3;
                    break;
                }
                break;
            }
            case 64194685: {
                if (s.equals("application/dash+xml")) {
                    n = 0;
                    break;
                }
                break;
            }
            case -156749520: {
                if (s.equals("application/vnd.ms-sstr+xml")) {
                    n = 2;
                    break;
                }
                break;
            }
            case -979127466: {
                if (s.equals("application/x-mpegURL")) {
                    n = 1;
                    break;
                }
                break;
            }
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 1;
        }
        if (n != 3) {
            return 4;
        }
        return 3;
    }
    
    public static int p(final int[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static long q(final long n, final long n2) {
        return (n + n2 - 1L) / n2;
    }
    
    public static long r(final long n, final long n2, final long n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static long s(final long n, final float n2) {
        if (n2 == 1.0f) {
            return n;
        }
        final double n3 = (double)n;
        final double n4 = n2;
        Double.isNaN(n3);
        Double.isNaN(n4);
        return Math.round(n3 * n4);
    }
    
    public static long t(long currentTimeMillis) {
        if (currentTimeMillis == -9223372036854775807L) {
            currentTimeMillis = System.currentTimeMillis();
        }
        else {
            currentTimeMillis += SystemClock.elapsedRealtime();
        }
        return currentTimeMillis;
    }
    
    public static long u(final long n, final float n2) {
        if (n2 == 1.0f) {
            return n;
        }
        final double n3 = (double)n;
        final double n4 = n2;
        Double.isNaN(n3);
        Double.isNaN(n4);
        return Math.round(n3 / n4);
    }
    
    public static long v(final SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            int i = 0;
            long min = Long.MAX_VALUE;
            while (i < sparseLongArray.size()) {
                min = Math.min(min, sparseLongArray.valueAt(i));
                ++i;
            }
            return min;
        }
        throw new NoSuchElementException();
    }
    
    public static long w(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                n2 = n;
            }
            else {
                n2 = n * 1000L;
            }
        }
        return n2;
    }
    
    public static long x(String group) {
        final Matcher matcher = baz.g.matcher(group);
        if (matcher.matches()) {
            group = matcher.group(9);
            int n = 0;
            if (group != null) {
                if (!matcher.group(9).equalsIgnoreCase("Z")) {
                    final int n2 = n = Integer.parseInt(matcher.group(12)) * 60 + Integer.parseInt(matcher.group(13));
                    if ("-".equals(matcher.group(11))) {
                        n = -n2;
                    }
                }
            }
            final GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty((CharSequence)matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0.".concat(String.valueOf(matcher.group(8)))).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (n != 0) {
                timeInMillis -= n * 60000L;
            }
            return timeInMillis;
        }
        throw azb.a("Invalid date/time format: ".concat(String.valueOf(group)), null);
    }
    
    public static long y(final long n, final long n2, final long n3) {
        if (n3 >= n2 && n3 % n2 == 0L) {
            return n / (n3 / n2);
        }
        if (n3 < n2 && n2 % n3 == 0L) {
            return n * (n2 / n3);
        }
        final double n4 = (double)n2;
        final double n5 = (double)n3;
        final double n6 = (double)n;
        Double.isNaN(n4);
        Double.isNaN(n5);
        final double n7 = n4 / n5;
        Double.isNaN(n6);
        return (long)(n6 * n7);
    }
    
    public static long z(final int n) {
        return (long)n & 0xFFFFFFFFL;
    }
    
    private static long[] $d2j$hex$541f0aaa$decode_J(final String src) {
        final byte[] d = $d2j$hex$541f0aaa$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final LongBuffer s = b.asLongBuffer();
        final long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }
    
    private static int[] $d2j$hex$541f0aaa$decode_I(final String src) {
        final byte[] d = $d2j$hex$541f0aaa$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final IntBuffer s = b.asIntBuffer();
        final int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }
    
    private static short[] $d2j$hex$541f0aaa$decode_S(final String src) {
        final byte[] d = $d2j$hex$541f0aaa$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final ShortBuffer s = b.asShortBuffer();
        final short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }
    
    private static byte[] $d2j$hex$541f0aaa$decode_B(final String src) {
        final char[] d = src.toCharArray();
        final byte[] ret = new byte[src.length() / 2];
        for (int i = 0; i < ret.length; ++i) {
            final char h = d[2 * i];
            final char l = d[2 * i + 1];
            int hh;
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            }
            else if (h >= 'a' && h <= 'f') {
                hh = h - 'a' + 10;
            }
            else {
                if (h < 'A' || h > 'F') {
                    throw new RuntimeException();
                }
                hh = h - 'A' + 10;
            }
            int ll;
            if (l >= '0' && l <= '9') {
                ll = l - '0';
            }
            else if (l >= 'a' && l <= 'f') {
                ll = l - 'a' + 10;
            }
            else {
                if (l < 'A' || l > 'F') {
                    throw new RuntimeException();
                }
                ll = l - 'A' + 10;
            }
            ret[i] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}
