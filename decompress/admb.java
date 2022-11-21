import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import android.text.TextUtils;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admb
{
    public static final afcb a;
    private static final afcb d;
    private static final afcb e;
    private static final Map f;
    public final String b;
    public final ume c;
    private final arzb g;
    
    static {
        a = afcb.c(":").a();
        d = afcb.c(",").a();
        e = afcb.c("=").a();
        final abi f2 = new abi();
        (f = (Map)f2).put("v", adlz.a);
        ((Map<String, adlz>)f2).put("api", (adlz)adlx.a);
        ((Map<String, adlz>)f2).put("cf", (adlz)adly.a);
    }
    
    public admb(final ume c, final arzb g, final vbo vbo, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = vbv.a(vbo).c;
        this.c = c;
        this.g = g;
    }
    
    static Set c(String a) {
        final boolean empty = TextUtils.isEmpty((CharSequence)a);
        final String s = "";
        if (empty) {
            a = s;
        }
        else {
            final List h = admb.a.h(a);
            if (h.size() < 4) {
                a = s;
            }
            else if (((String)h.get(1)).length() != 36) {
                a = s;
            }
            else if (!((String)h.get(2)).matches("[0-9]+")) {
                a = s;
            }
            else {
                a = (String)h.get(3);
            }
        }
        if (TextUtils.isEmpty((CharSequence)a)) {
            return (Set)afkg.a;
        }
        final HashSet set = new HashSet();
        for (final String s2 : admb.d.h(a)) {
            final afcb e = admb.e;
            final List h2 = e.h(s2);
            if (h2.size() != 2) {
                return (Set)afkg.a;
            }
            final adlw adlw = admb.f.get(h2.get(0));
            if (adlw == null) {
                return (Set)afkg.a;
            }
            final boolean empty2 = TextUtils.isEmpty((CharSequence)s2);
            a = null;
            if (!empty2) {
                final List h3 = e.h(s2);
                if (h3.size() == 2) {
                    if (adlw.b().equals(h3.get(0))) {
                        try {
                            a = (String)adlw.a(Integer.parseInt((String)h3.get(1)));
                        }
                        catch (final NumberFormatException ex) {
                            tut.d("Cannot parse Frontend ID key-value", (Throwable)ex);
                        }
                    }
                }
            }
            if (a == null) {
                return (Set)afkg.a;
            }
            set.add(a);
        }
        return set;
    }
    
    public static boolean d(final String s) {
        return c(s).contains(adlx.a);
    }
    
    public static boolean e(final String s) {
        return !c(s).isEmpty();
    }
    
    private final String g(final String s, final String s2, int n, final boolean b, final afbh afbh) {
        final StringBuilder sb = new StringBuilder(s);
        sb.append(":");
        sb.append(s2);
        sb.append(":");
        sb.append(n);
        sb.append(":");
        n = adlz.a.c;
        final StringBuilder sb2 = new StringBuilder("v=");
        sb2.append(n);
        sb.append(sb2.toString());
        if (b) {
            sb.append(",");
            n = adlx.a.c;
            final StringBuilder sb3 = new StringBuilder("api=");
            sb3.append(n);
            sb.append(sb3.toString());
        }
        if (afbh.h()) {
            apkz apkz;
            if ((apkz = this.g.f().h) == null) {
                apkz = apkz.a;
            }
            if (apkz.w) {
                sb.append(",");
                sb.append(adly.c((apkb)afbh.c()));
            }
        }
        return sb.toString();
    }
    
    public final String a(final String s, final String s2, final apkb apkb, final int n) {
        String b = s;
        if (s == null) {
            b = this.b;
        }
        return this.g(b, s2, n, true, afbh.k(apkb));
    }
    
    public final String b() {
        return this.f("android_live", ume.Q());
    }
    
    public final String f(final String s, final String s2) {
        return this.g(s, s2, 0, false, afag.a);
    }
}
