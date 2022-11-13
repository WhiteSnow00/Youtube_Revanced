import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenh
{
    static final Pattern a;
    static final Pattern b;
    
    static {
        a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
        b = Pattern.compile("^(TikTokWorker#|tiktok_).*");
    }
    
    static afft a(final Set set) {
        final abj abj = new abj(set.size());
        for (final String s : set) {
            if (s.startsWith("TikTokWorker#")) {
                abj.add((Object)s.substring(13));
            }
        }
        return afft.p((Collection)abj);
    }
    
    public static String b(final String s) {
        return "TikTokWorker#".concat(String.valueOf(s));
    }
    
    public static String c(final WorkerParameters workerParameters) {
        return (String)agpc.W((Iterable)a(workerParameters.c));
    }
    
    static void d(final aemw aemw) {
        final afke k = aemw.h.k();
        while (k.hasNext()) {
            final String s = k.next();
            if (!aenh.a.matcher(s).matches()) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("Tag ");
            sb.append(s);
            sb.append(" is reserved by AccountWorkManager.");
            throw new aena(sb.toString());
        }
        final afke i = aemw.h.k();
        while (i.hasNext()) {
            final String s2 = i.next();
            if (!aenh.b.matcher(s2).matches()) {
                continue;
            }
            final StringBuilder sb2 = new StringBuilder("Tag ");
            sb2.append(s2);
            sb2.append(" is reserved by TikTokWorkManager.");
            throw new aena(sb2.toString());
        }
    }
    
    public static void e(final aemw aemw) {
        final String s = (String)agpc.W((Iterable)a((Set)aemw.h));
    }
}
