import android.os.LocaleList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Collection;
import android.util.Log;
import java.io.FileFilter;
import java.util.Locale;
import java.util.ArrayList;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.io.File;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aech implements aebq
{
    public static final long a;
    public final Context b;
    public final Executor c;
    public final aebg d;
    public final Set e;
    public final Set f;
    public final AtomicBoolean g;
    public final aeby h;
    public final aeby i;
    private final Handler j;
    private final aebo k;
    private final arhr l;
    private final File m;
    private final AtomicReference n;
    private final aeby o;
    
    static {
        a = TimeUnit.SECONDS.toMillis(1L);
    }
    
    public aech(final Context b, final File m, final aebo k, final arhr l) {
        if (adwd.b == null) {
            (adwd.b = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new och(4))).allowCoreThreadTimeOut(true);
        }
        final ThreadPoolExecutor b2 = adwd.b;
        final aeby o = new aeby(b, (char[])null);
        this.j = new Handler(Looper.getMainLooper());
        this.n = new AtomicReference();
        this.e = Collections.synchronizedSet(new HashSet<Object>());
        this.f = Collections.synchronizedSet(new HashSet<Object>());
        this.g = new AtomicBoolean(false);
        this.b = b;
        this.m = m;
        this.k = k;
        this.l = l;
        this.c = b2;
        this.o = o;
        this.i = new aeby((byte[])null, (byte[])null);
        this.h = new aeby((byte[])null, (byte[])null);
        this.d = (aebg)aebj.a;
    }
    
    public static String d(final String s) {
        return s.split("\\.config\\.", 2)[0];
    }
    
    private final nly f(final int n) {
        this.g((aecg)new aecf(n));
        return nmr.b((Exception)new aebn(n));
    }
    
    private final aebx g(final aecg aecg) {
        monitorenter(this);
        try {
            final aebx c = this.c();
            final aebx a = aecg.a(c);
            final AtomicReference n = this.n;
            while (!n.compareAndSet(c, a)) {
                if (n.get() != c) {
                    monitorexit(this);
                    return null;
                }
            }
            monitorexit(this);
            return a;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final aeby h() {
        try {
            final aeby e = this.k.e(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 128).applicationInfo.metaData);
            if (e != null) {
                return e;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new IllegalStateException("App is not found in PackageManager", (Throwable)ex);
        }
    }
    
    public final nly a(final aebt aebt) {
        try {
            final aebx g = this.g((aecg)new aece(aebt));
            if (g == null) {
                return this.f(-100);
            }
            final int a = g.a;
            final ArrayList list = new ArrayList();
            final Iterator iterator = aebt.b.iterator();
            while (iterator.hasNext()) {
                list.add(((Locale)iterator.next()).getLanguage());
            }
            final HashSet set = new HashSet();
            final ArrayList list2 = new ArrayList();
            final File[] listFiles = this.m.listFiles((FileFilter)dyp.b);
            if (listFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return this.f(-5);
            }
            final int length = listFiles.length;
            int i = 0;
            long n = 0L;
            while (i < length) {
                final File file = listFiles[i];
                final String l = adwd.L(file);
                final String d = d(l);
                set.add(l);
                long n3 = 0L;
                Label_0795: {
                    int n2 = 0;
                    Label_0771: {
                        if (aebt.a.contains(d)) {
                            final String d2 = d(l);
                            final LocaleList locales = ((Context)this.o.a).getResources().getConfiguration().getLocales();
                            final ArrayList list3 = new ArrayList(locales.size());
                            for (int j = 0; j < locales.size(); ++j) {
                                final Locale value = locales.get(j);
                                final String language = value.getLanguage();
                                String concat;
                                if (value.getCountry().isEmpty()) {
                                    concat = "";
                                }
                                else {
                                    concat = "_".concat(String.valueOf(value.getCountry()));
                                }
                                list3.add((Object)String.valueOf(language).concat(concat));
                            }
                            final HashSet set2 = new HashSet(list3);
                            final Map k = this.h().j((Collection)Arrays.asList(d2));
                            final HashSet set3 = new HashSet();
                            final Iterator iterator2 = k.values().iterator();
                            while (iterator2.hasNext()) {
                                set3.addAll((Collection)iterator2.next());
                            }
                            final HashSet<Object> set4 = new HashSet<Object>();
                            for (String s2 : set2) {
                                final String s = s2;
                                if (s.contains("_")) {
                                    s2 = s.split("_", -1)[0];
                                }
                                set4.add(s2);
                            }
                            set4.addAll(this.f);
                            set4.addAll(list);
                            final HashSet set5 = new HashSet();
                            for (final Map.Entry<Object, V> entry : k.entrySet()) {
                                if (set4.contains(entry.getKey())) {
                                    set5.addAll((Collection)entry.getValue());
                                }
                            }
                            n2 = i;
                            if (!set3.contains(l)) {
                                break Label_0771;
                            }
                            n2 = i;
                            if (set5.contains(l)) {
                                n2 = i;
                                break Label_0771;
                            }
                        }
                        else {
                            n2 = i;
                        }
                        final List b = aebt.b;
                        final ArrayList list4 = new ArrayList(this.e);
                        list4.addAll(Arrays.asList("", "base"));
                        final Map m = this.h().j((Collection)list4);
                        final Iterator iterator5 = b.iterator();
                        Locale locale;
                        do {
                            n3 = n;
                            i = n2;
                            if (!iterator5.hasNext()) {
                                break Label_0795;
                            }
                            locale = (Locale)iterator5.next();
                        } while (!m.containsKey(locale.getLanguage()) || !((Set)m.get(locale.getLanguage())).contains(l));
                    }
                    n3 = n + file.length();
                    list2.add(file);
                    i = n2;
                }
                ++i;
                n = n3;
            }
            set.toString();
            aebt.a.toString();
            Integer b2;
            if (aebt.a.size() != 1 || (b2 = ((aeci)this.l.a()).c.get(aebt.a.get(0))) == null) {
                b2 = ((aeci)this.l.a()).b;
            }
            if (b2 != null) {
                return this.f(b2);
            }
            if (!set.containsAll(new HashSet(aebt.a))) {
                return this.f(-2);
            }
            final List a2 = aebt.a;
            final Integer value2 = a;
            this.e(1, 0, 0L, n, a2, value2, list);
            this.c.execute((Runnable)new aecw(this, (List)list2, (List)list, 1));
            return nmr.c((Object)value2);
        }
        catch (final aeyy aeyy) {
            aeyy.d("getCause", aebn.class);
            if (aebn.class.isInstance(aeyy.b())) {
                return this.f(aebn.class.cast(aeyy.b()).b());
            }
            throw aeyy.a(aeyy.b(), "getCause(%s) doesn't match underlying exception", aebn.class);
        }
    }
    
    public final Set b() {
        final HashSet set = new HashSet();
        set.addAll(this.k.b());
        set.addAll(this.e);
        return set;
    }
    
    public final aebx c() {
        return this.n.get();
    }
    
    public final void e(final int n, final int n2, final Long n3, final Long n4, final List list, final Integer n5, final List list2) {
        final aebx g = this.g((aecg)new aecd(n5, n, n2, n3, n4, list, list2));
        if (g != null) {
            this.j.post((Runnable)new adpd(this, g, 6));
        }
    }
}
