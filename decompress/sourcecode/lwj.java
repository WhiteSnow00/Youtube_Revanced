import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Arrays;
import android.text.TextUtils;
import android.net.Uri;
import java.io.IOException;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import java.util.regex.Pattern;
import android.os.Build;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwj
{
    public static final int a;
    public static final String b;
    private static final int[] c;
    
    static {
        a = Build$VERSION.SDK_INT;
        b = Build.MODEL;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        c = new int[] { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
    }
    
    public static int a(final int n, final int n2) {
        return (n + n2 - 1) / n2;
    }
    
    public static int b(final long n) {
        return (int)n;
    }
    
    public static int c(final String s) {
        final int length = s.length();
        int i = 0;
        jfi.S(length <= 4);
        int n = 0;
        while (i < length) {
            n = (n << 8 | s.charAt(i));
            ++i;
        }
        return n;
    }
    
    public static int d(final int n) {
        if (n == 8) {
            return 3;
        }
        if (n == 16) {
            return 2;
        }
        if (n == 24) {
            return Integer.MIN_VALUE;
        }
        if (n != 32) {
            return 0;
        }
        return 1073741824;
    }
    
    public static int e(final long n) {
        return (int)(n >>> 32);
    }
    
    public static long f(final int n, final int n2) {
        return ((long)n2 & 0xFFFFFFFFL) | (long)n << 32;
    }
    
    public static long g(final long n, final long n2, final long n3) {
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
    
    public static String h(final Object[] array) {
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
    
    public static String i(final Context context, final String s) {
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
        sb.append(") ExoPlayerLib/1.5.16");
        return sb.toString();
    }
    
    public static void j(final lvl lvl) {
        try {
            lvl.c();
        }
        catch (final IOException ex) {}
    }
    
    public static boolean k(final Object o, final Object o2) {
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
    
    public static boolean l(final Uri uri) {
        final String scheme = uri.getScheme();
        return TextUtils.isEmpty((CharSequence)scheme) || scheme.equals("file");
    }
    
    public static int m(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            binarySearch = ~n2;
        }
        if (b) {
            return Math.min(array.length - 1, binarySearch);
        }
        return binarySearch;
    }
    
    public static int n(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            binarySearch = -(n2 + 2);
        }
        int max = binarySearch;
        if (b) {
            max = Math.max(0, binarySearch);
        }
        return max;
    }
    
    public static int o(final byte[] array, final int n, int i) {
        final int n2 = 0;
        int n3 = i;
        for (i = n2; i < n; ++i) {
            n3 = (lwj.c[n3 >>> 24 ^ (array[i] & 0xFF)] ^ n3 << 8);
        }
        return n3;
    }
    
    public static byte[] p() {
        final byte[] array = new byte[38];
        for (int i = 0; i < 38; ++i) {
            final int n = i + i;
            array[i] = (byte)((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(n), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(n + 1), 16));
        }
        return array;
    }
    
    public static ExecutorService q() {
        return Executors.newSingleThreadExecutor(new lwi(0));
    }
    
    public static void r(final long[] array, long n) {
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
}
