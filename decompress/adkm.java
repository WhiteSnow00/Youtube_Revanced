import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import android.text.TextUtils;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkm
{
    public static final afaj a;
    private static final afaj d;
    private static final afaj e;
    private static final Map f;
    public final String b;
    public final vdh c;
    private final arwh g;
    
    static {
        a = afaj.c(":").a();
        d = afaj.c(",").a();
        e = afaj.c("=").a();
        final abh f2 = new abh();
        (f = (Map)f2).put("v", adkk.a);
        ((Map<String, adkk>)f2).put("api", (adkk)adki.a);
        ((Map<String, adkk>)f2).put("cf", (adkk)adkj.a);
    }
    
    public adkm(final vdh c, final arwh g, final vaf vaf, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = vam.a(vaf).c;
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
            final List h = adkm.a.h((CharSequence)a);
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
            return (Set)afiq.a;
        }
        final HashSet set = new HashSet();
        for (final String s2 : adkm.d.h((CharSequence)a)) {
            final afaj e = adkm.e;
            final List h2 = e.h((CharSequence)s2);
            if (h2.size() != 2) {
                return (Set)afiq.a;
            }
            final adkh adkh = adkm.f.get(h2.get(0));
            if (adkh == null) {
                return (Set)afiq.a;
            }
            final boolean empty2 = TextUtils.isEmpty((CharSequence)s2);
            a = null;
            if (!empty2) {
                final List h3 = e.h((CharSequence)s2);
                if (h3.size() == 2) {
                    if (adkh.b().equals(h3.get(0))) {
                        try {
                            a = (String)adkh.a(Integer.parseInt((String)h3.get(1)));
                        }
                        catch (final NumberFormatException ex) {
                            ttr.d("Cannot parse Frontend ID key-value", (Throwable)ex);
                        }
                    }
                }
            }
            if (a == null) {
                return (Set)afiq.a;
            }
            set.add(a);
        }
        return set;
    }
    
    public static boolean d(final String s) {
        return c(s).contains(adki.a);
    }
    
    public static boolean e(final String s) {
        return !c(s).isEmpty();
    }
    
    private final String g(final String s, final String s2, int n, final boolean b, final aezp aezp) {
        final StringBuilder sb = new StringBuilder(s);
        sb.append(":");
        sb.append(s2);
        sb.append(":");
        sb.append(n);
        sb.append(":");
        n = adkk.a.c;
        final StringBuilder sb2 = new StringBuilder("v=");
        sb2.append(n);
        sb.append(sb2.toString());
        if (b) {
            sb.append(",");
            n = adki.a.c;
            final StringBuilder sb3 = new StringBuilder("api=");
            sb3.append(n);
            sb.append(sb3.toString());
        }
        if (aezp.h()) {
            apin apin;
            if ((apin = this.g.f().h) == null) {
                apin = apin.a;
            }
            if (apin.w) {
                sb.append(",");
                sb.append(adkj.c((aphp)aezp.c()));
            }
        }
        return sb.toString();
    }
    
    public final String a(final String s, final String s2, final aphp aphp, final int n) {
        String b = s;
        if (s == null) {
            b = this.b;
        }
        return this.g(b, s2, n, true, aezp.k((Object)aphp));
    }
    
    public final String b() {
        return this.f("android_live", vdh.bc());
    }
    
    public final String f(final String s, final String s2) {
        return this.g(s, s2, 0, false, (aezp)aeyo.a);
    }
}
