import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etg implements ttg
{
    public static final etg a;
    public static final etg b;
    public static final etg c;
    public static final etg d;
    public static final etg e;
    public static final etg f;
    public static final etg g;
    public static final etg h;
    public static final etg i;
    public static final etg j;
    public static final etg k;
    public static final etg l;
    public static final etg m;
    public static final etg n;
    public static final etg o;
    public static final etg p;
    public static final etg q;
    public static final etg r;
    public static final etg s;
    public static final etg t;
    private final int u;
    
    static {
        t = new etg(20);
        s = new etg(19);
        r = new etg(18);
        q = new etg(17);
        p = new etg(16);
        o = new etg(15);
        n = new etg(14);
        m = new etg(13);
        l = new etg(12);
        k = new etg(11);
        j = new etg(10);
        i = new etg(9);
        h = new etg(8);
        g = new etg(7);
        f = new etg(6);
        e = new etg(4);
        d = new etg(3);
        c = new etg(2);
        b = new etg(1);
        a = new etg(0);
    }
    
    public etg(final int u) {
        this.u = u;
    }
    
    public final void a(final Object o) {
        switch (this.u) {
            default: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                zlm.b(zll.b, zlk.y, "[Clockwork][SfvAudioCommandResolver] accountIdResolver.get() failed.");
                return;
            }
            case 19: {
                final Void void1 = (Void)o;
                final afeq a = hcd.a;
                return;
            }
            case 18: {
                final Throwable t = (Throwable)o;
                ttr.b("Can't write to ProtoDataStore");
                return;
            }
            case 17: {
                final bej bej = (bej)o;
                if (bej != null) {
                    bej.t();
                }
                return;
            }
            case 16: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                zlm.b(zll.b, zlk.y, "[Clockwork][ShortsCreationCommandResolver] accountIdResolver.get() failed.");
                return;
            }
            case 15: {
                final Throwable t2 = (Throwable)o;
                final xab a2 = gvy.a;
                return;
            }
            case 14: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                zlm.b(zll.b, zlk.y, "[Clockwork][BackstageImageUploadEndpointResolver] accountIdResolver.get() failed.");
                return;
            }
            case 13: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                zlm.b(zll.b, zlk.y, "[Clockwork][AppSettingsCommandResolver] accountIdResolver.get() failed.");
                return;
            }
            case 12: {
                ttr.d("Exception when trying to fetch pip setting", (Throwable)o);
                return;
            }
            case 11: {
                ttr.d("Failed to cancel unlocking activity orientation to allow WindowManager sensor-driven rotation", (Throwable)o);
                return;
            }
            case 10: {
                ttr.d("Failed to set active state and notify listeners", (Throwable)o);
                return;
            }
            case 9: {
                ttr.d("Failed to read notification settings.", (Throwable)o);
                return;
            }
            case 8: {
                ttr.d("Failed to update offline stream snackbar impressions and offline stream snackbar last shown.", (Throwable)o);
                return;
            }
            case 7: {
                ttr.d("Failed to disable offline button poor connectivity tooltip disabled.", (Throwable)o);
                return;
            }
            case 6: {
                final Throwable t3 = (Throwable)o;
                final int g = fdd.g;
                return;
            }
            case 5: {
                final aknc aknc = (aknc)o;
                if (aknc != null && fdd.c(aknc)) {
                    List<Object> emptyList;
                    if (!fdd.c(aknc)) {
                        emptyList = Collections.emptyList();
                    }
                    else {
                        emptyList = new ArrayList<Object>(aknc.c.size());
                        final Iterator<Object> iterator = ((List<Object>)aknc.c).iterator();
                        while (iterator.hasNext()) {
                            emptyList.add(iterator.next().b);
                        }
                    }
                    final Iterator<Object> iterator2 = (Iterator<Object>)emptyList.iterator();
                    while (iterator2.hasNext()) {
                        ttr.b("Dismiss failed: ".concat(String.valueOf(iterator2.next())));
                    }
                }
                return;
            }
            case 4: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                return;
            }
            case 3: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                return;
            }
            case 2: {
                ttr.d("accountIdResolver.get() failed", (Throwable)o);
                return;
            }
            case 1: {
                ttr.b("Error reading incognito_promotion_already_shown.".concat(String.valueOf(String.valueOf(o))));
                return;
            }
            case 0: {
                ttr.d("ProfileCardController", (Throwable)o);
            }
        }
    }
}
