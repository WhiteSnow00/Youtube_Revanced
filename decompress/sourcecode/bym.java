import java.util.Iterator;
import java.util.Set;
import android.text.TextUtils;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class bym
{
    private static final Pattern a;
    private static final afdu b;
    private static final afdu c;
    private static final afdu d;
    private static final afdu e;
    
    static {
        a = Pattern.compile("\\s+");
        b = afdu.t((Object)"auto", (Object)"none");
        c = afdu.u((Object)"dot", (Object)"sesame", (Object)"circle");
        d = afdu.t((Object)"filled", (Object)"open");
        e = afdu.u((Object)"after", (Object)"before", (Object)"outside");
    }
    
    private bym() {
    }
    
    public static bym a(String w) {
        if (w == null) {
            return null;
        }
        w = aeda.w(w.trim());
        if (w.isEmpty()) {
            return null;
        }
        final afdu q = afdu.q((Object[])TextUtils.split(w, bym.a));
        ((String)adwd.aJ((Iterable)aesy.k((Set)bym.e, (Set)q), "outside")).hashCode();
        final afhf k = aesy.k((Set)bym.b, (Set)q);
        bym bym;
        if (!((Set)k).isEmpty()) {
            ((String)((Iterator<Object>)((afgx)k).a()).next()).hashCode();
            bym = new bym();
        }
        else {
            final afhf i = aesy.k((Set)bym.d, (Set)q);
            final afhf j = aesy.k((Set)bym.c, (Set)q);
            if (((Set)i).isEmpty() && ((Set)j).isEmpty()) {
                bym = new bym();
            }
            else {
                ((String)adwd.aJ((Iterable)i, "filled")).hashCode();
                ((String)adwd.aJ((Iterable)j, "circle")).hashCode();
                bym = new bym();
            }
        }
        return bym;
    }
}
