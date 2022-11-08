import org.json.JSONArray;
import java.util.Iterator;
import java.util.Collection;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.Locale;
import android.os.SystemClock;
import java.util.Random;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmt
{
    public static final Pattern a;
    public static final Random b;
    
    static {
        a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
        b = new Random(SystemClock.elapsedRealtime());
    }
    
    public static double a(final long n) {
        final double n2 = (double)n;
        Double.isNaN(n2);
        return n2 / 1000.0;
    }
    
    public static long b(final double n) {
        return (long)(n * 1000.0);
    }
    
    public static long c(final long n) {
        return n * 1000L;
    }
    
    public static String d(final String s) {
        return "urn:x-cast:".concat(s);
    }
    
    public static String e(final Locale locale) {
        final StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        final String country = locale.getCountry();
        if (!TextUtils.isEmpty((CharSequence)country)) {
            sb.append('-');
            sb.append(country);
        }
        final String variant = locale.getVariant();
        if (!TextUtils.isEmpty((CharSequence)variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }
    
    public static String f(final JSONObject jsonObject, final String s) {
        if (jsonObject != null && jsonObject.has(s)) {
            return jsonObject.optString(s);
        }
        return null;
    }
    
    public static List g(final int[] array) {
        final ArrayList list = new ArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return list;
    }
    
    public static JSONObject h(final String s) {
        if (s == null) {
            return null;
        }
        try {
            return new JSONObject(s);
        }
        catch (final JSONException ex) {
            return null;
        }
    }
    
    public static JSONObject i(final JSONObject jsonObject, final String s) {
        if (jsonObject.has(s)) {
            return jsonObject.optJSONObject(s);
        }
        return null;
    }
    
    public static void j(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (s.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!s.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (s.length() != 11) {
            return;
        }
        throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
    }
    
    public static boolean k(final Object o, final Object o2) {
        final boolean b = true;
        if (o == null) {
            final boolean b2 = b;
            if (o2 == null) {
                return b2;
            }
        }
        boolean b2;
        if (o != null && o2 != null) {
            if (!o.equals(o2)) {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    public static int[] l(final Collection collection) {
        final int[] array = new int[collection.size()];
        final Iterator iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = (int)iterator.next();
            ++n;
        }
        return array;
    }
    
    public static long[] m(final JSONArray jsonArray) {
        if (jsonArray == null) {
            return null;
        }
        final long[] array = new long[jsonArray.length()];
        for (int i = 0; i < jsonArray.length(); ++i) {
            array[i] = jsonArray.getLong(i);
        }
        return array;
    }
}
