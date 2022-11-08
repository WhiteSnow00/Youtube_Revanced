import android.view.Display$Mode;
import android.view.Display;
import android.view.WindowManager;
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

public final class baw
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
        m = new int[] { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
        n = new int[] { 0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243 };
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
        if (baw.a < 33) {
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
            dk.d(o);
            defaultDisplay = ((WindowManager)o).getDefaultDisplay();
        }
        Label_0231: {
            if (((Display)defaultDisplay).getDisplayId() != 0 || !ah(context)) {
                break Label_0231;
            }
            if (baw.a < 28) {
                o = aD("sys.display-size");
            }
            else {
                o = aD("vendor.display-size");
            }
            Label_0177: {
                if (TextUtils.isEmpty((CharSequence)o)) {
                    break Label_0177;
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
                        bao.a("Util", "Invalid display size: ".concat(String.valueOf(o)));
                        if ("Sony".equals(baw.c) && baw.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
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
        dk.e((Object)myLooper);
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
    
    public static ayf I(final int z, final int x, final int y) {
        final aye aye = new aye();
        aye.k = "audio/raw";
        aye.x = x;
        aye.y = y;
        aye.z = z;
        return aye.a();
    }
    
    public static azc J(final azg azg, final azc azc) {
        final boolean f = azg.F();
        final axv axv = (axv)azg;
        final azl q = axv.q();
        final boolean p2 = q.p();
        final boolean b = true;
        final boolean b2 = !p2 && q.o(axv.j(), axv.a).h;
        final azl q2 = axv.q();
        boolean b3 = false;
        Label_0116: {
            if (!q2.p()) {
                final int j = axv.j();
                final int aq = axv.aq();
                ((bew)azg).ad();
                if (q2.q(j, aq) != -1) {
                    b3 = true;
                    break Label_0116;
                }
            }
            b3 = false;
        }
        final boolean b4 = axv.ap() != -1;
        final azl q3 = axv.q();
        final boolean b5 = !q3.p() && q3.o(axv.j(), axv.a).d();
        final azl q4 = axv.q();
        final boolean b6 = !q4.p() && q4.o(axv.j(), axv.a).i;
        final boolean p3 = azg.q().p();
        final sin sin = new sin((char[])null, (byte[])null);
        axr.c(azc, sin);
        final boolean b7 = f ^ true;
        axr.d(4, b7, sin);
        axr.d(5, b2 && !f, sin);
        axr.d(6, b3 && !f, sin);
        axr.d(7, !p3 && (b3 || !b5 || b2) && !f, sin);
        axr.d(8, b4 && !f, sin);
        axr.d(9, !p3 && (b4 || (b5 && b6)) && !f, sin);
        axr.d(10, b7, sin);
        axr.d(11, b2 && !f, sin);
        axr.d(12, b2 && !f && b, sin);
        return axr.b(sin);
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
        return new String(array, aexb.c);
    }
    
    public static String O(final byte[] array, final int n, final int n2) {
        return new String(array, n, n2, aexb.c);
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
                    return aeda.x(networkCountryIso);
                }
            }
        }
        return aeda.x(Locale.getDefault().getCountry());
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
    
    public static String U(String concat) {
        if (concat == null) {
            return null;
        }
        final String replace = concat.replace('_', '-');
        String s = concat;
        if (!replace.isEmpty()) {
            s = concat;
            if (!replace.equals("und")) {
                s = replace;
            }
        }
        final String w = aeda.w(s);
        final String[] aq = aq(w, "-");
        final int n = 0;
        final String s2 = aq[0];
        if (baw.j == null) {
            baw.j = aE();
        }
        final String s3 = baw.j.get(s2);
        String s4 = s2;
        concat = w;
        if (s3 != null) {
            concat = s3.concat(String.valueOf(w.substring(s2.length())));
            s4 = s3;
        }
        int n2 = n;
        if (!"no".equals(s4)) {
            n2 = n;
            if (!"i".equals(s4)) {
                if (!"zh".equals(s4)) {
                    return concat;
                }
                n2 = n;
            }
        }
        String concat2;
        while (true) {
            final String[] l = baw.l;
            final int length = l.length;
            concat2 = concat;
            if (n2 >= 18) {
                break;
            }
            if (concat.startsWith(l[n2])) {
                concat2 = String.valueOf(l[n2 + 1]).concat(String.valueOf(concat.substring(l[n2].length())));
                break;
            }
            n2 += 2;
        }
        return concat2;
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
        final Matcher matcher = baw.h.matcher(s);
        int end = n;
        while (n2 > 0 && matcher.find()) {
            final String group = matcher.group(1);
            dk.d((Object)group);
            final int int1 = Integer.parseInt(group, 16);
            sb.append(s, end, matcher.start());
            sb.append((char)int1);
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
        return Executors.newSingleThreadExecutor(new lwi(s, 1));
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
            Double.isNaN(n4);
            final double n5 = 1000000.0 / n4;
            for (int k = n3; k < array.length; ++k) {
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
            bao.b("Util", "Failed to read system property ".concat(s), (Throwable)ex);
            return null;
        }
    }
    
    private static HashMap aE() {
        String[] array = Locale.getISOLanguages();
        final int length = array.length;
        final int length2 = baw.k.length;
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
                            array = baw.k;
                            length3 = array.length;
                            iftrue(Label_0120:)(n2 >= 88);
                            continue;
                        }
                        Label_0120: {
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
    
    public static boolean ab(final bar bar, final bar bar2, final Inflater inflater) {
        if (bar.a() <= 0) {
            return false;
        }
        if (bar2.b() < bar.a()) {
            final int a = bar.a();
            bar2.A(a + a);
        }
        Inflater inflater2;
        if ((inflater2 = inflater) == null) {
            inflater2 = new Inflater();
        }
        inflater2.setInput(bar.a, bar.b, bar.a());
        int n = 0;
        try {
            while (true) {
                final int n2 = n + inflater2.inflate(bar2.a, n, bar2.b() - n);
                if (inflater2.finished()) {
                    bar2.F(n2);
                    return true;
                }
                if (inflater2.needsDictionary() || inflater2.needsInput()) {
                    return false;
                }
                if ((n = n2) != bar2.b()) {
                    continue;
                }
                final int b = bar2.b();
                bar2.A(b + b);
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
        return s.getBytes(aexb.c);
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
        dk.f(n <= array.length);
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
        int n2 = -1;
        for (int i = 0; i < n; ++i) {
            n2 = (baw.m[n2 >>> 24 ^ (array[i] & 0xFF)] ^ n2 << 8);
        }
        return n2;
    }
    
    public static int ax(final byte[] array, int i, final int n) {
        int n2 = 0;
        while (i < n) {
            n2 = baw.n[n2 ^ (array[i] & 0xFF)];
            ++i;
        }
        return n2;
    }
    
    public static Object[] ay(final Object[] array, final int n) {
        dk.f(true);
        dk.f(n <= array.length);
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
            if (baw.a >= 32) {
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
    
    public static int j(String s) {
        int int1 = 0;
        if (s == null) {
            return 0;
        }
        final String[] ap = ap(s, "_");
        final int length = ap.length;
        if (length < 2) {
            return 0;
        }
        s = ap[length - 1];
        boolean b;
        if (length >= 3 && "neg".equals(ap[length - 2])) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            dk.d((Object)s);
            int1 = Integer.parseInt(s);
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
        dk.f(length <= 4);
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
            if (s != null && aeda.y((CharSequence)"rtsp", (CharSequence)s)) {
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
                        s = aeda.w(s.substring(lastIndex + 1));
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
                    final Pattern i = baw.i;
                    final String path = uri.getPath();
                    dk.d((Object)path);
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
            long min = Long.MAX_VALUE;
            for (int i = 0; i < sparseLongArray.size(); ++i) {
                min = Math.min(min, sparseLongArray.valueAt(i));
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
        final Matcher matcher = baw.g.matcher(group);
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
        throw ayz.a("Invalid date/time format: ".concat(String.valueOf(group)), (Throwable)null);
    }
    
    public static long y(final long n, final long n2, final long n3) {
        if (n3 >= n2 && n3 % n2 == 0L) {
            return n / (n3 / n2);
        }
        if (n3 < n2 && n2 % n3 == 0L) {
            return n * (n2 / n3);
        }
        final double n4 = (double)n;
        final double n5 = (double)n2;
        final double n6 = (double)n3;
        Double.isNaN(n5);
        Double.isNaN(n6);
        final double n7 = n5 / n6;
        Double.isNaN(n4);
        return (long)(n4 * n7);
    }
    
    public static long z(final int n) {
        return (long)n & 0xFFFFFFFFL;
    }
}
