import android.text.TextUtils;
import android.text.Html;
import java.util.List;
import android.text.Spanned;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adaa implements Comparable
{
    public static final int o = 0;
    private static final Pattern p;
    public final String a;
    public final String b;
    public final int c;
    public final int[] d;
    public final String e;
    public final int f;
    public final String g;
    public final Spanned h;
    public final List i;
    public final int j;
    public final afbh k;
    public final afbh l;
    public final boolean m;
    public final int n;
    private final int q;
    
    static {
        p = Pattern.compile("&nbsp;", 16);
    }
    
    public adaa(String concat, final int c, final int n, final int[] array, final String e, final int f, final String g, final int q, final String s, final Spanned h) {
        concat.getClass();
        this.b = concat;
        this.c = c;
        this.n = n;
        int[] d = array;
        if (array == null) {
            d = new int[0];
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.q = q;
        this.h = h;
        if (c == 33) {
            concat = "\u2026 ".concat(String.valueOf(c(s)));
        }
        this.a = concat;
        this.i = afgh.q();
        this.j = 1;
        final afag a = afag.a;
        this.k = a;
        this.l = a;
        this.m = false;
    }
    
    public adaa(final String s, final int n, final int[] array) {
        this(s, 0, n, array, null, 0, null, -1, null, null);
    }
    
    public adaa(String concat, final int c, final int[] array, final String e, final int f, final String g, final int q, final String s, final Spanned h, final List list, final int j, final afbh k, final afbh l, final boolean m) {
        concat.getClass();
        this.b = concat;
        this.c = c;
        this.n = 2;
        int[] d = array;
        if (array == null) {
            d = new int[0];
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.q = q;
        this.h = h;
        this.k = k;
        this.l = l;
        this.m = m;
        if (c == 33) {
            concat = "\u2026 ".concat(String.valueOf(c(s)));
        }
        this.a = concat;
        List q2;
        if ((q2 = list) == null) {
            q2 = afgh.q();
        }
        this.i = q2;
        this.j = j;
    }
    
    private static final String c(final String s) {
        String string = s;
        if (s != null) {
            if (s.isEmpty()) {
                string = s;
            }
            else {
                string = Html.fromHtml(adaa.p.matcher(s).replaceAll(" "), 63).toString();
            }
        }
        return string;
    }
    
    public final boolean a() {
        return this.k.h();
    }
    
    public final boolean b() {
        return this.c == 35 && !TextUtils.isEmpty((CharSequence)this.e);
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        final adaa adaa = (adaa)o;
        if (adaa == null) {
            return 0;
        }
        return this.q - adaa.q;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof adaa)) {
            return false;
        }
        final adaa adaa = (adaa)o;
        return this.c == adaa.c && TextUtils.equals((CharSequence)this.a, (CharSequence)adaa.a);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
