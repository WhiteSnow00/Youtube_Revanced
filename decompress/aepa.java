import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepa
{
    static final Pattern a;
    static final Pattern b;
    
    static {
        a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
        b = Pattern.compile("^(TikTokWorker#|tiktok_).*");
    }
    
    static afhk a(final Set set) {
        final abk abk = new abk(set.size());
        for (final String s : set) {
            if (s.startsWith("TikTokWorker#")) {
                abk.add(s.substring(13));
            }
        }
        return afhk.p(abk);
    }
    
    public static String b(final String s) {
        return "TikTokWorker#".concat(String.valueOf(s));
    }
    
    public static String c(final WorkerParameters workerParameters) {
        return (String)agpx.an(a(workerParameters.c));
    }
    
    static void d(final aeop aeop) {
        final aflu k = aeop.h.k();
        while (((Iterator)k).hasNext()) {
            final String s = (String)((Iterator)k).next();
            if (!aepa.a.matcher(s).matches()) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("Tag ");
            sb.append(s);
            sb.append(" is reserved by AccountWorkManager.");
            throw new aeot(sb.toString());
        }
        final aflu i = aeop.h.k();
        while (((Iterator)i).hasNext()) {
            final String s2 = (String)((Iterator)i).next();
            if (!aepa.b.matcher(s2).matches()) {
                continue;
            }
            final StringBuilder sb2 = new StringBuilder("Tag ");
            sb2.append(s2);
            sb2.append(" is reserved by TikTokWorkManager.");
            throw new aeot(sb2.toString());
        }
    }
    
    public static void e(final aeop aeop) {
        final String s = (String)agpx.an(a(aeop.h));
    }
}
