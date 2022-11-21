import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.text.TextUtils;
import java.util.List;
import java.util.HashMap;
import android.net.Uri$Builder;
import java.util.concurrent.TimeUnit;
import android.util.LruCache;
import java.util.WeakHashMap;
import java.util.Map;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ackq implements thj
{
    static final long a;
    static final Uri b;
    private final Map c;
    private final WeakHashMap d;
    private final LruCache e;
    private final oco f;
    private long g;
    
    static {
        a = TimeUnit.SECONDS.toMillis(10L);
        b = new Uri$Builder().scheme("yt").authority("reactr").build();
    }
    
    public ackq(final oco f, final thg thg) {
        this.c = new HashMap();
        this.d = new WeakHashMap();
        this.e = new LruCache(1000);
        f.getClass();
        this.f = f;
        this.g = Long.MAX_VALUE;
        thg.g((Object)this);
    }
    
    static Uri a(final Uri uri) {
        final List pathSegments = uri.getPathSegments();
        if (pathSegments != null && !pathSegments.isEmpty()) {
            final Uri$Builder buildUpon = uri.buildUpon();
            buildUpon.path("");
            for (int i = 0; i < pathSegments.size() - 1; ++i) {
                buildUpon.appendPath((String)pathSegments.get(i));
            }
            return buildUpon.build();
        }
        return null;
    }
    
    public static Uri g(int i, final String... array) {
        adme.K(true);
        adme.K(true);
        adme.K(true);
        final int n = 0;
        adme.K(TextUtils.isEmpty((CharSequence)array[0]) ^ true);
        final Uri$Builder buildUpon = ackq.b.buildUpon();
        String s;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    s = "SUBSCRIPTIONS";
                }
                else {
                    s = "SOCIAL";
                }
            }
            else {
                s = "NOTIFICATIONS";
            }
        }
        else {
            s = "COMMENTS";
        }
        buildUpon.authority(s);
        int length;
        String s2;
        for (length = array.length, i = n; i < length; ++i) {
            s2 = array[i];
            twd.n(s2);
            buildUpon.appendPath(s2);
        }
        return buildUpon.build();
    }
    
    private final List i(final Uri uri, final boolean b) {
        tcl.l();
        final List list = this.c.get(uri);
        if (list == null && b) {
            final ArrayList list2 = new ArrayList();
            this.c.put(uri, list2);
            return list2;
        }
        return list;
    }
    
    private final boolean j(final Uri uri) {
        final List i = this.i(uri, false);
        if (i != null) {
            final Iterator iterator = i.iterator();
            while (iterator.hasNext()) {
                if (((WeakReference)iterator.next()).get() == null) {
                    iterator.remove();
                }
            }
        }
        return i != null && !i.isEmpty();
    }
    
    public final acko b(final Uri uri) {
        tcl.l();
        return (acko)this.e.get((Object)uri);
    }
    
    public final acko c(final Uri uri, final acko acko) {
        acko.getClass();
        final acko acko2 = (acko)this.e.get((Object)uri);
        acko e = acko;
        if (acko2 != null) {
            e = acko2.e(acko);
            if (e == null) {
                throw new IllegalStateException();
            }
        }
        this.d(uri, e);
        return e;
    }
    
    public final void d(final Uri uri, final acko acko) {
        tcl.l();
        this.e.put((Object)uri, (Object)acko);
        tcl.l();
        for (Uri a = uri; a != null; a = a(a)) {
            final List i = this.i(a, false);
            List list;
            if ((list = i) != null) {
                list = new ArrayList(i);
            }
            if (list != null) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    final ackp ackp = ((WeakReference<ackp>)iterator.next()).get();
                    if (ackp == null) {
                        iterator.remove();
                    }
                    else {
                        ackp.b(a, uri);
                    }
                }
            }
        }
    }
    
    public final void f(final ackp ackp) {
        ackp.getClass();
        final Set set = this.d.remove(ackp);
        if (set == null) {
            return;
        }
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final List i = this.i((Uri)iterator.next(), false);
            if (i != null) {
                final Iterator iterator2 = i.iterator();
                while (iterator2.hasNext()) {
                    final ackp ackp2 = ((WeakReference<ackp>)iterator2.next()).get();
                    if (ackp2 == null) {
                        iterator2.remove();
                    }
                    else {
                        if (ackp2 != ackp) {
                            continue;
                        }
                        iterator2.remove();
                    }
                }
            }
        }
    }
    
    public final void h(final Uri uri, final ackp ackp) {
        uri.getClass();
        ackp.getClass();
        tcl.l();
        Set set;
        if ((set = this.d.get(ackp)) == null) {
            set = new HashSet();
            this.d.put(ackp, set);
        }
        if (set.add(uri)) {
            this.i(uri, true).add(new WeakReference(ackp));
        }
        final long d = this.f.d();
        final long g = this.g;
        if (g == -1L || d - g >= ackq.a) {
            final HashMap hashMap = new HashMap();
            hashMap.put(uri, true);
            for (final Uri uri2 : this.c.keySet()) {
                if (!hashMap.containsKey(uri2)) {
                    final Uri a = a(uri2);
                    Boolean value;
                    if ((value = (Boolean)hashMap.get(a)) == null) {
                        value = this.j(a);
                        hashMap.put(a, value);
                    }
                    final boolean b = this.j(uri2) || value;
                    if (!b) {
                        this.e.remove((Object)uri2);
                    }
                    hashMap.put(uri2, b);
                }
            }
            this.g = d;
        }
        final acko acko = (acko)this.e.get((Object)uri);
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zop zop = (zop)o;
            this.e.evictAll();
            this.c.clear();
            this.d.clear();
            this.g = this.f.d();
            array = null;
        }
        else {
            array = new Class[] { zop.class };
        }
        return array;
    }
}
