import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayDeque;
import j$.util.DesugarCollections;
import java.util.HashMap;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.Optional;
import java.util.Deque;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aays implements abcc, aayk
{
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Deque e;
    public final Map f;
    public final aayp g;
    public Optional h;
    public Optional i;
    public boolean j;
    public TimelineMarker k;
    public boolean l;
    public ardu m;
    private final vax n;
    private final afdx o;
    private volatile boolean p;
    private long q;
    
    public aays(final vax n, final aayp g) {
        this.n = n;
        this.g = g;
        this.a = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.b = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.c = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.d = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.f = DesugarCollections.synchronizedMap((Map)new HashMap());
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.e = new ArrayDeque();
        final abcg f = abcg.f;
        final abcg f2 = abcg.f;
        final abcg h = abcg.h;
        final abcg g2 = abcg.g;
        final afdv b = afdx.b();
        b.d((Object)f, (Object)f2);
        b.d((Object)h, (Object)h);
        b.d((Object)g2, (Object)g2);
        this.o = b.c();
    }
    
    private final long q() {
        final ardu m = this.m;
        if (m != null) {
            final TimelineMarker[] n = this.n(abcg.f);
            final int a = m.a;
            if (a < n.length) {
                return n[a].a + 1L;
            }
        }
        return this.q;
    }
    
    private final void r() {
        if (!this.i.isPresent()) {
            return;
        }
        final afcr afcr = (afcr)this.i.get();
        for (int size = ((List)afcr).size(), i = 0; i < size; ++i) {
            this.s(true, Optional.ofNullable((Object)((List)afcr).get(i)));
        }
    }
    
    private final void s(final boolean b, final Optional h) {
        this.b.clear();
        if (b) {
            this.h = h;
        }
        if (h.isEmpty()) {
            return;
        }
        final Map map = this.c.get(h.get());
        if (map != null) {
            for (final abcg abcg : map.keySet()) {
                if (!b) {
                    this.d.remove(abcg);
                    Collection$_EL.removeIf((Collection)this.e, (Predicate)new zxs(h, 3));
                }
                else {
                    final String s = (String)h.get();
                    final HashSet set = new HashSet();
                    final afie k = this.o.a((Object)abcg).k();
                    while (((Iterator)k).hasNext()) {
                        final abcg abcg2 = (abcg)((Iterator)k).next();
                        final aamd aamd = this.d.get(abcg2);
                        if (aamd != null && !TextUtils.equals((CharSequence)aamd.a, (CharSequence)s)) {
                            set.add(abcg2);
                            this.d.remove(abcg2);
                            this.e.push(aamd);
                        }
                    }
                    set.remove(abcg);
                    for (final abcg abcg3 : set) {
                        final Set set2 = this.a.get(abcg3);
                        if (set2 == null) {
                            break;
                        }
                        final Iterator iterator3 = set2.iterator();
                        while (iterator3.hasNext()) {
                            ((aayr)iterator3.next()).oR(abcg3, false);
                        }
                    }
                    this.d.put(abcg, new aamd((String)h.get(), (aayc)map.get(abcg)));
                }
                final Set set3 = this.a.get(abcg);
                if (set3 == null) {
                    return;
                }
                final Iterator iterator4 = set3.iterator();
                while (iterator4.hasNext()) {
                    ((aayr)iterator4.next()).oR(abcg, b);
                }
                if (!b) {
                    continue;
                }
                this.u(this.q(), 0, abcg);
            }
            final ArrayList list = new ArrayList();
            final Iterator iterator5 = this.d.values().iterator();
            while (iterator5.hasNext()) {
                list.add(((aamd)iterator5.next()).b);
            }
            this.g.d(afcr.o((Collection)list));
        }
        if (!b) {
            final aioe aioe = this.f.get(h.get());
            if (aioe != null) {
                this.n.a(aioe);
            }
        }
    }
    
    private final void t(final long q, final int n) {
        if (this.j) {
            return;
        }
        this.q = q;
        this.m(n);
    }
    
    private final void u(final long n, final int n2, final abcg abcg) {
        final Optional ofNullable = Optional.ofNullable((Object)this.n(abcg));
        if (ofNullable.isEmpty()) {
            return;
        }
        final boolean equals = abcg.equals((Object)abcg.g);
        final TimelineMarker timelineMarker = null;
        final TimelineMarker timelineMarker2 = null;
        if (equals) {
            int length = ((TimelineMarker[])ofNullable.get()).length;
            TimelineMarker timelineMarker3 = null;
            Label_0162: {
                TimelineMarker timelineMarker4;
                while (true) {
                    final int n3 = length - 1;
                    timelineMarker3 = timelineMarker2;
                    if (n3 < 0) {
                        break Label_0162;
                    }
                    timelineMarker4 = ((TimelineMarker[])ofNullable.get())[n3];
                    final long b = timelineMarker4.b;
                    Optional optional;
                    if (b > timelineMarker4.a) {
                        optional = Optional.of((Object)b);
                    }
                    else {
                        optional = Optional.empty();
                    }
                    length = n3;
                    if (timelineMarker4.a > n) {
                        continue;
                    }
                    if (!optional.isPresent()) {
                        break;
                    }
                    length = n3;
                    if ((long)optional.get() > n) {
                        break;
                    }
                }
                timelineMarker3 = timelineMarker4;
            }
            this.v(timelineMarker3, abcg, n2);
            return;
        }
        final TimelineMarker[] array = (TimelineMarker[])ofNullable.get();
        final int length2 = array.length;
        int n4 = 0;
        TimelineMarker timelineMarker5;
        while (true) {
            timelineMarker5 = timelineMarker;
            if (n4 >= length2) {
                break;
            }
            timelineMarker5 = array[n4];
            if (timelineMarker5.a(n)) {
                break;
            }
            ++n4;
        }
        this.v(timelineMarker5, abcg, n2);
    }
    
    private final void v(final TimelineMarker timelineMarker, final abcg abcg, final int n) {
        final TimelineMarker timelineMarker2 = this.b.get(abcg);
        if (aeda.v(timelineMarker, timelineMarker2)) {
            return;
        }
        if (timelineMarker != null) {
            this.b.put(abcg, timelineMarker);
        }
        else {
            this.b.remove(abcg);
        }
        this.f(timelineMarker, abcg, n, timelineMarker2);
    }
    
    public final void a(final List list) {
        if (list != null && !list.isEmpty()) {
            this.i = Optional.of((Object)afcr.o((Collection)list));
            this.r();
            return;
        }
        this.i = Optional.empty();
    }
    
    public final TimelineMarker b(final abcg abcg) {
        return this.b.get(abcg);
    }
    
    public final Optional c(final abcg abcg) {
        final Optional ofNullable = Optional.ofNullable((Object)this.n(abcg));
        if (!ofNullable.isEmpty() && ((TimelineMarker[])ofNullable.get()).length != 0) {
            final TimelineMarker timelineMarker = this.b.get(abcg);
            if (timelineMarker != null) {
                final long b = timelineMarker.b;
                if (b != Long.MAX_VALUE) {
                    for (final TimelineMarker timelineMarker2 : (TimelineMarker[])ofNullable.get()) {
                        if (timelineMarker2.a(b + 1L)) {
                            return Optional.of((Object)timelineMarker2);
                        }
                    }
                    return Optional.empty();
                }
            }
            return Optional.empty();
        }
        return Optional.empty();
    }
    
    public final Optional d(final abcg abcg) {
        final Optional ofNullable = Optional.ofNullable((Object)this.n(abcg));
        if (!ofNullable.isEmpty() && ((TimelineMarker[])ofNullable.get()).length != 0) {
            final TimelineMarker timelineMarker = this.b.get(abcg);
            if (timelineMarker != null) {
                final long a = timelineMarker.a;
                if (a > 0L) {
                    for (final TimelineMarker timelineMarker2 : (TimelineMarker[])ofNullable.get()) {
                        if (timelineMarker2.a(a - 1L)) {
                            return Optional.of((Object)timelineMarker2);
                        }
                    }
                    return Optional.empty();
                }
            }
            return Optional.empty();
        }
        return Optional.empty();
    }
    
    public final void e(final String s, final aioe aioe) {
        if (aioe == null) {
            return;
        }
        this.f.put(s, aioe);
    }
    
    public final void f(final TimelineMarker timelineMarker, final abcg abcg, final int n, final TimelineMarker timelineMarker2) {
        if (timelineMarker != null) {
            final aioe e = timelineMarker.e;
            if (e != null) {
                this.n.a(e);
            }
        }
        final Set set = this.a.get(abcg);
        if (set == null) {
            return;
        }
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((aayr)iterator.next()).c(timelineMarker2, timelineMarker, abcg, n);
        }
    }
    
    public final void g(final String s, final boolean b) {
        if (TextUtils.equals((CharSequence)s, (CharSequence)this.h.orElse((Object)null))) {
            if (!b) {
                this.s(false, Optional.ofNullable((Object)s));
                this.h = Optional.empty();
                if (!this.e.isEmpty()) {
                    this.s(true, Optional.ofNullable(this.e.pop().a));
                }
            }
            return;
        }
        if (!b) {
            return;
        }
        this.s(true, Optional.ofNullable((Object)s));
    }
    
    public final void h(final int n, final long n2) {
        this.p = (n == 1 || n == 2);
        if (this.l && n == 1) {
            this.k = this.b(abcg.f);
        }
        if (n != 4) {
            if (n != 5) {
                this.t(n2, 2);
                if (n == 3) {
                    final aayp g = this.g;
                    g.c(n2).ifPresent((Consumer)new zoc(g.b, 16));
                }
            }
        }
    }
    
    public final void i(final abcg abcg, final aayr aayr) {
        Set set;
        if ((set = this.a.get(abcg)) == null) {
            set = new CopyOnWriteArraySet();
            this.a.put(abcg, set);
        }
        set.add(aayr);
    }
    
    public final void j(final long n) {
        if (this.p) {
            return;
        }
        this.t(n, 1);
    }
    
    public final void k(final boolean l) {
        if (!(this.l = l)) {
            this.k = null;
        }
    }
    
    public final void l(final abcg abcg, final aayr aayr) {
        final Set set = this.a.get(abcg);
        if (set == null) {
            return;
        }
        set.remove(aayr);
    }
    
    public final void m(final int n) {
        final abcg[] values = abcg.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.u(this.q(), n, values[i]);
        }
        final aayp g = this.g;
        final long q = this.q();
        if (n != 2 && n != 3) {
            return;
        }
        g.a.tr((Object)g.c(q));
    }
    
    public final TimelineMarker[] n(final abcg abcg) {
        final aamd aamd = this.d.get(abcg);
        if (aamd == null) {
            return new TimelineMarker[0];
        }
        return (TimelineMarker[])((afci)((aayc)aamd.b).a).toArray((Object[])new TimelineMarker[0]);
    }
    
    public final aayc o(final abcg abcg) {
        final aamd aamd = this.d.get(abcg);
        if (aamd == null) {
            return null;
        }
        return (aayc)aamd.b;
    }
    
    public final void p(final String s, final abcg abcg, final aayc aayc) {
        Map synchronizedMap;
        if (this.c.containsKey(s)) {
            synchronizedMap = this.c.get(s);
        }
        else {
            synchronizedMap = DesugarCollections.synchronizedMap((Map)new HashMap());
            this.c.put(s, synchronizedMap);
        }
        if (synchronizedMap != null) {
            synchronizedMap.put(abcg, aayc);
            final Set set = this.a.get(abcg);
            if (set != null) {
                final Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    ((aayr)iterator.next()).d(abcg);
                }
            }
        }
        final ardu m = this.m;
        if (m != null && abcg == abcg.f && m.a < aayc.a.size()) {
            ((atit)m.b).tu();
        }
        if (this.i.isPresent() && ((afcr)this.i.get()).contains((Object)s)) {
            this.r();
        }
    }
}
