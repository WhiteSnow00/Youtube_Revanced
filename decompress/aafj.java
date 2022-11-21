import android.util.Pair;
import java.util.HashSet;
import android.database.Cursor;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public class aafj implements aafl
{
    private final aafm a;
    private final oco b;
    private final SharedPreferences c;
    private final zwz d;
    private final thg e;
    private final arzb f;
    private final adhf g;
    
    public aafj(final aafm a, final adhf g, final oco b, final SharedPreferences c, final arzb f, final zwz d, final thg e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    private static int h(final long n) {
        if (n < 0L) {
            return Integer.MAX_VALUE;
        }
        return Math.max(1, (int)n);
    }
    
    private final int i(final String s, final aage aage, final amxh amxh, final long n) {
        amxh.getClass();
        final foq foq = new foq(amxh, n);
        this.c.edit().putString(tqf.aM("offline_refresh_continuation_token_%s", s), (String)foq.b).putLong(tqf.aM("offline_refresh_continuation_expiration_%s", s), foq.a).apply();
        final int c = amxh.c;
        if (c > this.d.d()) {
            this.a.e(s, c);
            String.format(Locale.US, "[Offline] Schedule deferred continuation in %d seconds", c);
            return 0;
        }
        String.format(Locale.US, "[Offline] Schedule continuation in %d seconds", c);
        if (c > 0) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(c));
            }
            catch (final InterruptedException ex) {
                tut.d("[Offline] Thread.sleep interrupted: ", (Throwable)ex);
                return 1;
            }
        }
        return this.j(s, aage, amxh.b, n);
    }
    
    private final int j(final String s, final aage aage, final String b, final long n) {
        twd.n(b);
        final aafq a = this.g.a();
        b.getClass();
        a.b = b;
        try {
            final akyf b2 = this.g.b(a);
            String.format(Locale.US, "[Offline] Offlined video set update count: %d", b2.d.size());
            akyg akyg;
            if ((b2.b & 0x2) != 0x0) {
                if ((akyg = b2.e) == null) {
                    akyg = akyg.a;
                }
            }
            else {
                akyg = null;
            }
            String.valueOf(akyg);
            if (b2.d.size() > 0) {
                this.f(s, aage, (List)b2.d, b2.f, n);
            }
            akyg akyg2;
            if ((akyg2 = b2.e) == null) {
                akyg2 = akyg.a;
            }
            if ((0x1 & akyg2.b) != 0x0) {
                akyg akyg3;
                if ((akyg3 = b2.e) == null) {
                    akyg3 = akyg.a;
                }
                amxh amxh;
                if ((amxh = akyg3.c) == null) {
                    amxh = amxh.a;
                }
                return this.i(s, aage, amxh, n);
            }
            this.m(s);
            return 2;
        }
        catch (final vnz vnz) {
            this.e.d((Object)new aaaq());
            return 1;
        }
    }
    
    private final akyf k(final Collection collection) {
        tcl.k();
        final aafq a = this.g.a();
        collection.getClass();
        a.a = new ArrayList();
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            a.a.add(((ahcr)iterator.next()).build());
        }
        final akyf b = this.g.b(a);
        b.d.size();
        akyg akyg;
        if ((b.b & 0x2) != 0x0) {
            if ((akyg = b.e) == null) {
                akyg = akyg.a;
            }
        }
        else {
            akyg = null;
        }
        String.valueOf(akyg);
        return b;
    }
    
    private static Collection l(final aage aage, Set iterator, final long n) {
        final HashMap hashMap = new HashMap();
        final Map f = aage.g().f();
        iterator = ((Set)iterator).iterator();
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            final aadc e = aage.l().e(s);
            if (e != null && e.n()) {
                final aadb j = e.j;
                final String a = e.a();
                long c;
                if (j != null) {
                    c = j.c;
                }
                else {
                    c = 0L;
                }
                final long g = e.g;
                final int h = h(TimeUnit.MILLISECONDS.toSeconds(n - c));
                final int h2 = h(TimeUnit.MILLISECONDS.toSeconds(n - g));
                final zxm b = aage.B();
                int h3 = 0;
                int h4 = 0;
                Label_0338: {
                    int n2 = 0;
                    Label_0331: {
                        if (b != null) {
                            final long c2 = b.c(a);
                            if (c2 > 0L) {
                                h3 = h(TimeUnit.MILLISECONDS.toSeconds(n - c2));
                            }
                            else {
                                h3 = 0;
                            }
                            twd.n(a);
                            final Cursor query = ((zxl)b.j.e).a().query("videosV2", new String[] { "streams_timestamp" }, "id = ?", new String[] { a }, (String)null, (String)null, (String)null, (String)null);
                            try {
                                long long1;
                                if (query.moveToNext()) {
                                    long1 = query.getLong(0);
                                    query.close();
                                }
                                else {
                                    query.close();
                                    long1 = 0L;
                                }
                                n2 = h3;
                                if (long1 > 0L) {
                                    h4 = h(TimeUnit.MILLISECONDS.toSeconds(n - long1));
                                    break Label_0338;
                                }
                                break Label_0331;
                            }
                            finally {
                                query.close();
                            }
                        }
                        n2 = 0;
                    }
                    h4 = 0;
                    h3 = n2;
                }
                final Locale us = Locale.US;
                long d;
                if (j != null) {
                    d = j.d;
                }
                else {
                    d = 0L;
                }
                long b2;
                if (j != null) {
                    b2 = j.b();
                }
                else {
                    b2 = 0L;
                }
                String.format(us, "[Offline] Refreshing video %s: Time since last refreshed: %d. Time to expire: %d", a, n - d, b2 - n);
                final ahcr builder = akyh.a.createBuilder();
                builder.copyOnWrite();
                final akyh akyh = (akyh)builder.instance;
                a.getClass();
                akyh.b |= 0x1;
                akyh.c = a;
                builder.copyOnWrite();
                final akyh akyh2 = (akyh)builder.instance;
                akyh2.b |= 0x2;
                akyh2.d = h;
                builder.copyOnWrite();
                final akyh akyh3 = (akyh)builder.instance;
                akyh3.b |= 0x4;
                akyh3.e = h2;
                builder.copyOnWrite();
                final akyh akyh4 = (akyh)builder.instance;
                akyh4.b |= 0x8;
                akyh4.g = h3;
                builder.copyOnWrite();
                final akyh akyh5 = (akyh)builder.instance;
                akyh5.b |= 0x10;
                akyh5.h = h4;
                if (f.containsKey(s)) {
                    final Iterable iterable = f.get(s);
                    builder.copyOnWrite();
                    final akyh akyh6 = (akyh)builder.instance;
                    final ahdp f2 = akyh6.f;
                    if (!f2.c()) {
                        akyh6.f = ahcz.mutableCopy(f2);
                    }
                    ahbc.addAll((Iterable)iterable, (List)akyh6.f);
                }
                final aadb i = e.j;
                if (i == null) {
                    continue;
                }
                final String e2 = i.e();
                if (hashMap.containsKey(e2)) {
                    ((ahcr)hashMap.get(e2)).cI(builder);
                }
                else {
                    final ahcr builder2 = akyl.a.createBuilder();
                    builder2.cI(builder);
                    if (e2 != null) {
                        builder2.copyOnWrite();
                        final akyl akyl = (akyl)builder2.instance;
                        akyl.b |= 0x1;
                        akyl.c = e2;
                    }
                    hashMap.put(e2, builder2);
                }
            }
        }
        return hashMap.values();
    }
    
    private final void m(final String s) {
        this.c.edit().remove(tqf.aM("offline_refresh_continuation_token_%s", s)).remove(tqf.aM("offline_refresh_continuation_expiration_%s", s)).apply();
    }
    
    private final void n() {
        this.e.d((Object)new aaas());
    }
    
    @Override
    public final int a(final String s, final aage aage) {
        monitorenter(this);
        try {
            tcl.k();
            final Set stringSet = this.c.getStringSet(tqf.aM("offline_refresh_video_ids_%s", s), (Set)new HashSet());
            final SharedPreferences c = this.c;
            final String am = tqf.aM("offline_refresh_continuation_token_%s", s);
            final akyf akyf = null;
            final String string = c.getString(am, (String)null);
            final long long1 = this.c.getLong(tqf.aM("offline_refresh_continuation_expiration_%s", s), -1L);
            Object o;
            if (string != null && long1 > 0L) {
                o = new foq(string, long1);
            }
            else {
                o = null;
            }
            final Pair pair = new Pair((Object)stringSet, o);
            final Set set = (Set)pair.first;
            final foq foq = (foq)pair.second;
            if (set.isEmpty() && foq == null) {
                this.n();
                monitorexit(this);
                return 0;
            }
            final long c2 = this.b.c();
            final int n = 1;
            int n2 = 1;
            Label_0284: {
                if (foq != null) {
                    if (c2 <= foq.a) {
                        final int j = this.j(s, aage, (String)foq.b, c2);
                        if (j != 0) {
                            if (j != 1) {
                                break Label_0284;
                            }
                        }
                        else {
                            n2 = j;
                        }
                        monitorexit(this);
                        return n2;
                    }
                    if (this.d.e()) {
                        this.a.c(s);
                        monitorexit(this);
                        return 0;
                    }
                }
            }
            Set set2 = set;
            if (!set.isEmpty()) {
                final HashSet set3 = new HashSet();
                final HashSet set4 = new HashSet();
                amwj amwj;
                if ((amwj = this.f.f().g) == null) {
                    amwj = amwj.a;
                }
                final int d = amwj.d;
                if (d > 0 && d < set.size()) {
                    final Iterator iterator = set.iterator();
                    int n3 = 0;
                    while (iterator.hasNext()) {
                        final String s2 = (String)iterator.next();
                        if (n3 < amwj.d) {
                            set3.add(s2);
                        }
                        else {
                            set4.add(s2);
                        }
                        ++n3;
                    }
                }
                else {
                    set3.addAll(set);
                }
                final Collection l = l(aage, set3, c2);
                final boolean empty = l.isEmpty();
                akyf k = akyf;
                if (!empty) {
                    try {
                        k = this.k(l);
                        this.f(s, aage, (List)k.d, k.f, c2);
                    }
                    catch (final vnz vnz) {
                        this.e.d((Object)new aaaq());
                        monitorexit(this);
                        return 1;
                    }
                }
                this.d(s, set4);
                Label_0644: {
                    if (k != null) {
                        akyg akyg;
                        if ((akyg = k.e) == null) {
                            akyg = akyg.a;
                        }
                        if ((akyg.b & 0x1) != 0x0) {
                            akyg akyg2;
                            if ((akyg2 = k.e) == null) {
                                akyg2 = akyg.a;
                            }
                            amxh amxh;
                            if ((amxh = akyg2.c) == null) {
                                amxh = amxh.a;
                            }
                            int i = this.i(s, aage, amxh, c2);
                            if (i != 0) {
                                if (i != 1) {
                                    break Label_0644;
                                }
                                i = n;
                            }
                            monitorexit(this);
                            return i;
                        }
                    }
                }
                set2 = set4;
            }
            if (!set2.isEmpty()) {
                this.a.d(s);
            }
            else {
                this.n();
            }
            monitorexit(this);
            return 0;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final akyf b(final aage aage, final Set set, final long n) {
        try {
            return this.k(l(aage, set, n));
        }
        catch (final vnz vnz) {
            return null;
        }
    }
    
    @Override
    public final void c(final String s, final aage aage) {
        monitorenter(this);
        try {
            tcl.k();
            this.m(s);
            this.c.edit().remove(tqf.aM("offline_refresh_video_ids_%s", s)).apply();
            this.a.h();
            final HashSet set = new HashSet();
            for (final aadc aadc : aage.l().j()) {
                if (aadc.n()) {
                    set.add(aadc.a());
                }
            }
            if (set.isEmpty()) {
                this.n();
                monitorexit(this);
                return;
            }
            this.d(s, set);
            this.a.d(s);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void d(final String s, final Set set) {
        this.c.edit().putStringSet(tqf.aM("offline_refresh_video_ids_%s", s), set).apply();
    }
    
    protected void e(final akyn akyn, final amxq amxq, final aage aage, final long n, final aadb aadb) {
        if (aadb == null) {
            return;
        }
        final String a = aadb.a;
        final amxg a2 = amxg.a;
        final int h = amxq.h;
        final int cg = aqvq.cG(h);
        final int n2 = 1;
        int n3;
        if ((n3 = cg) == 0) {
            n3 = 1;
        }
        if (--n3 == 1) {
            this.g(aage, n, amxq, aadb);
            final Iterator<Object> iterator = ((List<Object>)new ahdj((List)akyn.c, akyn.a)).iterator();
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            while (iterator.hasNext()) {
                final int ordinal = iterator.next().ordinal();
                int n8;
                int n9;
                int n10;
                int n11;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 5) {
                                    n8 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    n11 = n7;
                                }
                                else {
                                    n8 = 1;
                                    n9 = n5;
                                    n10 = n6;
                                    n11 = n7;
                                }
                            }
                            else {
                                n8 = 1;
                                n9 = 1;
                                n10 = n6;
                                n11 = n7;
                            }
                        }
                        else {
                            aage.g().i(a);
                            n8 = n4;
                            n9 = n5;
                            n10 = n6;
                            n11 = n7;
                        }
                    }
                    else {
                        n8 = 1;
                        n10 = 1;
                        n9 = n5;
                        n11 = n7;
                    }
                }
                else {
                    n8 = 1;
                    n11 = 1;
                    n10 = n6;
                    n9 = n5;
                }
                if (n8 != 0) {
                    aage.k().i(a);
                }
                if (n9 != 0) {
                    aage.k().h(a);
                    n4 = n8;
                    n5 = n9;
                    n6 = n10;
                    n7 = n11;
                }
                else if (n10 != 0) {
                    aage.k().f(a);
                    n4 = n8;
                    n5 = n9;
                    n6 = n10;
                    n7 = n11;
                }
                else {
                    n4 = n8;
                    n5 = n9;
                    n6 = n10;
                    if ((n7 = n11) == 0) {
                        continue;
                    }
                    aage.k().g(a);
                    n4 = n8;
                    n5 = n9;
                    n6 = n10;
                    n7 = n11;
                }
            }
            return;
        }
        if (n3 == 2) {
            aage.l().B(a);
            return;
        }
        if (n3 != 3) {
            int cg2 = aqvq.cG(h);
            if (cg2 == 0) {
                cg2 = n2;
            }
            tut.b("[Offline] Unrecognized OfflineState action: ".concat(Integer.toString(cg2 - 1)));
            aage.l().B(a);
            return;
        }
        this.g(aage, n, amxq, aadb);
    }
    
    final void f(final String s, final aage aage, final List list, final int n, final long n2) {
        tcl.k();
        for (final akym akym : list) {
            amxq amxq;
            if ((amxq = akym.b) == null) {
                amxq = amxq.a;
            }
            for (final akyn akyn : akym.c) {
                final String d = akyn.d;
                final int cg = aqvq.cG(amxq.h);
                Label_0127: {
                    if (cg != 0) {
                        if (cg == 2) {
                            break Label_0127;
                        }
                    }
                    final amxg a = amxg.a;
                    final int h = amxq.h;
                }
                this.e(akyn, amxq, aage, n2, aage.k().b(d));
            }
        }
        if (n > 0) {
            this.a.f(s, n);
        }
    }
    
    protected final void g(final aage aage, final long d, final amxq b, final aadb aadb) {
        final aagh k = aage.k();
        final aada c = aadb.c();
        c.b = b;
        c.d = d;
        if (k.j(c.b())) {
            this.e.d((Object)new aaam(aadb.a));
            return;
        }
        tut.b("[Offline] UpdateVideoPolicy failed for video ".concat(aadb.a));
    }
}
