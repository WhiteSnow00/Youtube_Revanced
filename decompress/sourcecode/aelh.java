import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelh
{
    static final Pattern a;
    static final Pattern b;
    
    static {
        a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
        b = Pattern.compile("^(TikTokWorker#|tiktok_).*");
    }
    
    static afdu a(final Set set) {
        final abi abi = new abi(set.size());
        for (final String s : set) {
            if (s.startsWith("TikTokWorker#")) {
                abi.add((Object)s.substring(13));
            }
        }
        return afdu.p((Collection)abi);
    }
    
    public static String b(final String s) {
        return "TikTokWorker#".concat(String.valueOf(s));
    }
    
    public static String c(final WorkerParameters workerParameters) {
        return (String)adwd.aL((Iterable)a(workerParameters.c));
    }
    
    static void d(final aekv aekv) {
        final afie k = aekv.h.k();
        while (((Iterator)k).hasNext()) {
            final String s = (String)((Iterator)k).next();
            if (!aelh.a.matcher(s).matches()) {
                continue;
            }
            final StringBuilder sb = new StringBuilder("Tag ");
            sb.append(s);
            sb.append(" is reserved by AccountWorkManager.");
            throw new aela(sb.toString());
        }
        final afie i = aekv.h.k();
        while (((Iterator)i).hasNext()) {
            final String s2 = (String)((Iterator)i).next();
            if (!aelh.b.matcher(s2).matches()) {
                continue;
            }
            final StringBuilder sb2 = new StringBuilder("Tag ");
            sb2.append(s2);
            sb2.append(" is reserved by TikTokWorkManager.");
            throw new aela(sb2.toString());
        }
    }
    
    public static void e(final aekv aekv) {
        final String s = (String)adwd.aL((Iterable)a((Set)aekv.h));
    }
}
