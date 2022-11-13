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

public final class acjd implements tgg
{
    static final long a;
    static final Uri b;
    private final Map c;
    private final WeakHashMap d;
    private final LruCache e;
    private final oby f;
    private long g;
    
    static {
        a = TimeUnit.SECONDS.toMillis(10L);
        b = new Uri$Builder().scheme("yt").authority("reactr").build();
    }
    
    public acjd(final oby f, final tgd tgd) {
        this.c = new HashMap();
        this.d = new WeakHashMap();
        this.e = new LruCache(1000);
        f.getClass();
        this.f = f;
        this.g = Long.MAX_VALUE;
        tgd.g((Object)this);
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
        adkp.H(true);
        adkp.H(true);
        adkp.H(true);
        final int n = 0;
        adkp.H(TextUtils.isEmpty((CharSequence)array[0]) ^ true);
        final Uri$Builder buildUpon = acjd.b.buildUpon();
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
            tvb.n(s2);
            buildUpon.appendPath(s2);
        }
        return buildUpon.build();
    }
    
    private final List i(final Uri uri, final boolean b) {
        tbi.f();
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
    
    public final acjb b(final Uri uri) {
        tbi.f();
        return (acjb)this.e.get((Object)uri);
    }
    
    public final acjb c(final Uri uri, final acjb acjb) {
        acjb.getClass();
        final acjb acjb2 = (acjb)this.e.get((Object)uri);
        acjb e = acjb;
        if (acjb2 != null) {
            e = acjb2.e(acjb);
            if (e == null) {
                throw new IllegalStateException();
            }
        }
        this.d(uri, e);
        return e;
    }
    
    public final void d(final Uri uri, final acjb acjb) {
        tbi.f();
        this.e.put((Object)uri, (Object)acjb);
        tbi.f();
        for (Uri a = uri; a != null; a = a(a)) {
            final List i = this.i(a, false);
            List list;
            if ((list = i) != null) {
                list = new ArrayList(i);
            }
            if (list != null) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    final acjc acjc = ((WeakReference<acjc>)iterator.next()).get();
                    if (acjc == null) {
                        iterator.remove();
                    }
                    else {
                        acjc.b(a, uri);
                    }
                }
            }
        }
    }
    
    public final void f(final acjc acjc) {
        acjc.getClass();
        final Set set = this.d.remove(acjc);
        if (set == null) {
            return;
        }
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final List i = this.i((Uri)iterator.next(), false);
            if (i != null) {
                final Iterator iterator2 = i.iterator();
                while (iterator2.hasNext()) {
                    final acjc acjc2 = ((WeakReference<acjc>)iterator2.next()).get();
                    if (acjc2 == null) {
                        iterator2.remove();
                    }
                    else {
                        if (acjc2 != acjc) {
                            continue;
                        }
                        iterator2.remove();
                    }
                }
            }
        }
    }
    
    public final void h(final Uri uri, final acjc acjc) {
        uri.getClass();
        acjc.getClass();
        tbi.f();
        Set set;
        if ((set = this.d.get(acjc)) == null) {
            set = new HashSet();
            this.d.put(acjc, set);
        }
        if (set.add(uri)) {
            this.i(uri, true).add(new WeakReference(acjc));
        }
        final long d = this.f.d();
        final long g = this.g;
        if (g == -1L || d - g >= acjd.a) {
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
        final acjb acjb = (acjb)this.e.get((Object)uri);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zmu zmu = (zmu)o;
            this.e.evictAll();
            this.c.clear();
            this.d.clear();
            this.g = this.f.d();
            array = null;
        }
        else {
            array = new Class[] { zmu.class };
        }
        return array;
    }
}
