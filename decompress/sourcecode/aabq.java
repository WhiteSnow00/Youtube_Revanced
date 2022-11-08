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

public class aabq implements aabs
{
    private final aabt a;
    private final oas b;
    private final SharedPreferences c;
    private final zth d;
    private final tdz e;
    private final arud f;
    private final addr g;
    
    public aabq(final aabt a, final addr g, final oas b, final SharedPreferences c, final arud f, final zth d, final tdz e, final byte[] array, final byte[] array2, final byte[] array3) {
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
    
    private final int i(final String s, final aack aack, final amsy amsy, final long n) {
        amsy.getClass();
        final foi foi = new foi(amsy, n);
        this.c.edit().putString(tmy.aM("offline_refresh_continuation_token_%s", s), (String)foi.b).putLong(tmy.aM("offline_refresh_continuation_expiration_%s", s), foi.a).apply();
        final int c = amsy.c;
        if (c > this.d.d()) {
            this.a.e(s, (long)c);
            String.format(Locale.US, "[Offline] Schedule deferred continuation in %d seconds", c);
            return 0;
        }
        String.format(Locale.US, "[Offline] Schedule continuation in %d seconds", c);
        if (c > 0) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(c));
            }
            catch (final InterruptedException ex) {
                trn.d("[Offline] Thread.sleep interrupted: ", (Throwable)ex);
                return 1;
            }
        }
        return this.j(s, aack, amsy.b, n);
    }
    
    private final int j(final String s, final aack aack, final String b, final long n) {
        tsx.n(b);
        final aabx a = this.g.a();
        b.getClass();
        a.b = b;
        try {
            final akuc b2 = this.g.b(a);
            String.format(Locale.US, "[Offline] Offlined video set update count: %d", b2.d.size());
            akud akud;
            if ((b2.b & 0x2) != 0x0) {
                if ((akud = b2.e) == null) {
                    akud = akud.a;
                }
            }
            else {
                akud = null;
            }
            String.valueOf(akud);
            if (b2.d.size() > 0) {
                this.f(s, aack, b2.d, b2.f, n);
            }
            akud akud2;
            if ((akud2 = b2.e) == null) {
                akud2 = akud.a;
            }
            if ((0x1 & akud2.b) != 0x0) {
                akud akud3;
                if ((akud3 = b2.e) == null) {
                    akud3 = akud.a;
                }
                amsy amsy;
                if ((amsy = akud3.c) == null) {
                    amsy = amsy.a;
                }
                return this.i(s, aack, amsy, n);
            }
            this.m(s);
            return 2;
        }
        catch (final vkn vkn) {
            this.e.d((Object)new zwx());
            return 1;
        }
    }
    
    private final akuc k(final Collection collection) {
        szc.e();
        final aabx a = this.g.a();
        collection.getClass();
        a.a = new ArrayList();
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            a.a.add(((agza)iterator.next()).build());
        }
        final akuc b = this.g.b(a);
        b.d.size();
        akud akud;
        if ((b.b & 0x2) != 0x0) {
            if ((akud = b.e) == null) {
                akud = akud.a;
            }
        }
        else {
            akud = null;
        }
        String.valueOf(akud);
        return b;
    }
    
    private static Collection l(final aack aack, Set iterator, final long n) {
        final HashMap hashMap = new HashMap();
        final Map f = aack.g().f();
        iterator = ((Set)iterator).iterator();
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            final zzl e = aack.l().e(s);
            if (e != null && e.n()) {
                final zzk j = e.j;
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
                final ztu b = aack.B();
                int h3 = 0;
                int g2 = 0;
                Label_0342: {
                    Label_0339: {
                        if (b != null) {
                            final long c2 = b.c(a);
                            if (c2 > 0L) {
                                h3 = h(TimeUnit.MILLISECONDS.toSeconds(n - c2));
                            }
                            else {
                                h3 = 0;
                            }
                            tsx.n(a);
                            final Cursor query = ((ztt)b.j.b).a().query("videosV2", new String[] { "streams_timestamp" }, "id = ?", new String[] { a }, (String)null, (String)null, (String)null, (String)null);
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
                                g2 = h3;
                                if (long1 > 0L) {
                                    final int h4 = h(TimeUnit.MILLISECONDS.toSeconds(n - long1));
                                    g2 = h3;
                                    h3 = h4;
                                    break Label_0342;
                                }
                                break Label_0339;
                            }
                            finally {
                                query.close();
                            }
                        }
                        g2 = 0;
                    }
                    h3 = 0;
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
                final agza builder = ((agzi)akue.a).createBuilder();
                builder.copyOnWrite();
                final akue akue = (akue)builder.instance;
                a.getClass();
                akue.b |= 0x1;
                akue.c = a;
                builder.copyOnWrite();
                final akue akue2 = (akue)builder.instance;
                akue2.b |= 0x2;
                akue2.d = h;
                builder.copyOnWrite();
                final akue akue3 = (akue)builder.instance;
                akue3.b |= 0x4;
                akue3.e = h2;
                builder.copyOnWrite();
                final akue akue4 = (akue)builder.instance;
                akue4.b |= 0x8;
                akue4.g = g2;
                builder.copyOnWrite();
                final akue akue5 = (akue)builder.instance;
                akue5.b |= 0x10;
                akue5.h = h3;
                if (f.containsKey(s)) {
                    final Iterable iterable = f.get(s);
                    builder.copyOnWrite();
                    final akue akue6 = (akue)builder.instance;
                    final agzy f2 = akue6.f;
                    if (!f2.c()) {
                        akue6.f = agzi.mutableCopy(f2);
                    }
                    agxl.addAll((Iterable)iterable, (List)akue6.f);
                }
                final zzk i = e.j;
                if (i == null) {
                    continue;
                }
                final String e2 = i.e();
                if (hashMap.containsKey(e2)) {
                    ((agza)hashMap.get(e2)).cG(builder);
                }
                else {
                    final agza builder2 = ((agzi)akuh.a).createBuilder();
                    builder2.cG(builder);
                    if (e2 != null) {
                        builder2.copyOnWrite();
                        final akuh akuh = (akuh)builder2.instance;
                        akuh.b |= 0x1;
                        akuh.c = e2;
                    }
                    hashMap.put(e2, builder2);
                }
            }
        }
        return hashMap.values();
    }
    
    private final void m(final String s) {
        this.c.edit().remove(tmy.aM("offline_refresh_continuation_token_%s", s)).remove(tmy.aM("offline_refresh_continuation_expiration_%s", s)).apply();
    }
    
    private final void n() {
        this.e.d((Object)new zwz());
    }
    
    public final int a(final String s, final aack aack) {
        monitorenter(this);
        try {
            szc.e();
            final Set stringSet = this.c.getStringSet(tmy.aM("offline_refresh_video_ids_%s", s), (Set)new HashSet());
            final SharedPreferences c = this.c;
            final String am = tmy.aM("offline_refresh_continuation_token_%s", s);
            final akuc akuc = null;
            final String string = c.getString(am, (String)null);
            final long long1 = this.c.getLong(tmy.aM("offline_refresh_continuation_expiration_%s", s), -1L);
            Object o;
            if (string != null && long1 > 0L) {
                o = new foi(string, long1);
            }
            else {
                o = null;
            }
            final Pair pair = new Pair((Object)stringSet, o);
            final Set set = (Set)pair.first;
            final foi foi = (foi)pair.second;
            if (set.isEmpty() && foi == null) {
                this.n();
                monitorexit(this);
                return 0;
            }
            final long c2 = this.b.c();
            final int n = 1;
            final int n2 = 1;
            Label_0284: {
                if (foi != null) {
                    if (c2 <= foi.a) {
                        int j = this.j(s, aack, (String)foi.b, c2);
                        if (j != 0) {
                            if (j != 1) {
                                break Label_0284;
                            }
                            j = n2;
                        }
                        monitorexit(this);
                        return j;
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
                amrz amrz;
                if ((amrz = this.f.f().g) == null) {
                    amrz = amrz.a;
                }
                final int d = amrz.d;
                if (d > 0 && d < set.size()) {
                    final Iterator iterator = set.iterator();
                    int n3 = 0;
                    while (iterator.hasNext()) {
                        final String s2 = (String)iterator.next();
                        if (n3 < amrz.d) {
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
                final Collection l = l(aack, set3, c2);
                final boolean empty = l.isEmpty();
                akuc k = akuc;
                if (!empty) {
                    try {
                        k = this.k(l);
                        this.f(s, aack, k.d, k.f, c2);
                    }
                    catch (final vkn vkn) {
                        this.e.d((Object)new zwx());
                        monitorexit(this);
                        return 1;
                    }
                }
                this.d(s, set4);
                Label_0644: {
                    if (k != null) {
                        akud akud;
                        if ((akud = k.e) == null) {
                            akud = akud.a;
                        }
                        if ((akud.b & 0x1) != 0x0) {
                            akud akud2;
                            if ((akud2 = k.e) == null) {
                                akud2 = akud.a;
                            }
                            amsy amsy;
                            if ((amsy = akud2.c) == null) {
                                amsy = amsy.a;
                            }
                            int i = this.i(s, aack, amsy, c2);
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
    
    public final akuc b(final aack aack, final Set set, final long n) {
        try {
            return this.k(l(aack, set, n));
        }
        catch (final vkn vkn) {
            return null;
        }
    }
    
    public final void c(final String s, final aack aack) {
        monitorenter(this);
        try {
            szc.e();
            this.m(s);
            this.c.edit().remove(tmy.aM("offline_refresh_video_ids_%s", s)).apply();
            this.a.h();
            final HashSet set = new HashSet();
            for (final zzl zzl : aack.l().j()) {
                if (zzl.n()) {
                    set.add(zzl.a());
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
        this.c.edit().putStringSet(tmy.aM("offline_refresh_video_ids_%s", s), set).apply();
    }
    
    protected void e(final akuj akuj, final amth amth, final aack aack, final long n, final zzk zzk) {
        if (zzk == null) {
            return;
        }
        final String a = zzk.a;
        final amsx a2 = amsx.a;
        final int h = amth.h;
        final int cn = aqql.cN(h);
        final int n2 = 1;
        int n3;
        if ((n3 = cn) == 0) {
            n3 = 1;
        }
        if (--n3 == 1) {
            this.g(aack, n, amth, zzk);
            final Iterator<Object> iterator = new agzs((List)akuj.c, akuj.a).iterator();
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            while (iterator.hasNext()) {
                final int ordinal = iterator.next().ordinal();
                int n8 = 0;
                int n9 = 0;
                int n10 = 0;
                int n11 = 0;
                Label_0344: {
                    if (ordinal != 1) {
                        int n12;
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                aack.g().i(a);
                                n8 = n4;
                                n9 = n5;
                                n10 = n6;
                                n11 = n7;
                                break Label_0344;
                            }
                            if (ordinal != 4) {
                                n8 = n4;
                                n12 = n5;
                                if (ordinal != 5) {
                                    n8 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    n11 = n7;
                                    break Label_0344;
                                }
                            }
                            else {
                                n12 = 1;
                                n8 = n4;
                            }
                        }
                        else {
                            n8 = 1;
                            n12 = n5;
                        }
                        final int n13 = 1;
                        n9 = n12;
                        n10 = n13;
                        n11 = n7;
                    }
                    else {
                        n10 = 1;
                        n11 = 1;
                        n9 = n5;
                        n8 = n4;
                    }
                }
                if (n10 != 0) {
                    aack.k().i(a);
                }
                if (n9 != 0) {
                    aack.k().h(a);
                    n4 = n8;
                    n5 = n9;
                    n6 = n10;
                    n7 = n11;
                }
                else if (n8 != 0) {
                    aack.k().f(a);
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
                    aack.k().g(a);
                    n4 = n8;
                    n5 = n9;
                    n6 = n10;
                    n7 = n11;
                }
            }
            return;
        }
        if (n3 == 2) {
            aack.l().B(a);
            return;
        }
        if (n3 != 3) {
            int cn2 = aqql.cN(h);
            if (cn2 == 0) {
                cn2 = n2;
            }
            trn.b("[Offline] Unrecognized OfflineState action: ".concat(Integer.toString(cn2 - 1)));
            aack.l().B(a);
            return;
        }
        this.g(aack, n, amth, zzk);
    }
    
    final void f(final String s, final aack aack, final List list, final int n, final long n2) {
        szc.e();
        for (final akui akui : list) {
            amth amth;
            if ((amth = akui.b) == null) {
                amth = amth.a;
            }
            for (final akuj akuj : akui.c) {
                final String d = akuj.d;
                final int cn = aqql.cN(amth.h);
                Label_0127: {
                    if (cn != 0) {
                        if (cn == 2) {
                            break Label_0127;
                        }
                    }
                    final amsx a = amsx.a;
                    final int h = amth.h;
                }
                this.e(akuj, amth, aack, n2, aack.k().b(d));
            }
        }
        if (n > 0) {
            this.a.f(s, (long)n);
        }
    }
    
    protected final void g(final aack aack, final long d, final amth b, final zzk zzk) {
        final aacn k = aack.k();
        final zzj c = zzk.c();
        c.b = b;
        c.d = d;
        if (k.k(c.b())) {
            this.e.d((Object)new zwt(zzk.a));
            return;
        }
        trn.b("[Offline] UpdateVideoPolicy failed for video ".concat(zzk.a));
    }
}
