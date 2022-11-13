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

public final class abap implements abdw, abah
{
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Deque e;
    public final Map f;
    public final abam g;
    public Optional h;
    public Optional i;
    public boolean j;
    public TimelineMarker k;
    public boolean l;
    public argj m;
    private final vcy n;
    private final affw o;
    private volatile boolean p;
    private long q;
    
    public abap(final vcy n, final abam g) {
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
        final abea f = abea.f;
        final abea f2 = abea.f;
        final abea h = abea.h;
        final abea g2 = abea.g;
        final affu b = affw.b();
        b.d((Object)f, (Object)f2);
        b.d((Object)h, (Object)h);
        b.d((Object)g2, (Object)g2);
        this.o = b.c();
    }
    
    private final long q() {
        final argj m = this.m;
        if (m != null) {
            final TimelineMarker[] n = this.n(abea.f);
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
        final afeq afeq = (afeq)this.i.get();
        for (int size = ((List)afeq).size(), i = 0; i < size; ++i) {
            this.s(true, Optional.ofNullable((Object)((List)afeq).get(i)));
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
            for (final abea abea : map.keySet()) {
                if (!b) {
                    this.d.remove(abea);
                    Collection$_EL.removeIf((Collection)this.e, (Predicate)new zzn(h, 3));
                }
                else {
                    final String s = (String)h.get();
                    final HashSet set = new HashSet();
                    final afke k = this.o.a((Object)abea).k();
                    while (k.hasNext()) {
                        final abea abea2 = k.next();
                        final aanx aanx = this.d.get(abea2);
                        if (aanx != null && !TextUtils.equals((CharSequence)aanx.a, (CharSequence)s)) {
                            set.add(abea2);
                            this.d.remove(abea2);
                            this.e.push(aanx);
                        }
                    }
                    set.remove(abea);
                    for (final abea abea3 : set) {
                        final Set set2 = this.a.get(abea3);
                        if (set2 == null) {
                            break;
                        }
                        final Iterator iterator3 = set2.iterator();
                        while (iterator3.hasNext()) {
                            ((abao)iterator3.next()).oR(abea3, false);
                        }
                    }
                    this.d.put(abea, new aanx((String)h.get(), (aazz)map.get(abea)));
                }
                final Set set3 = this.a.get(abea);
                if (set3 == null) {
                    return;
                }
                final Iterator iterator4 = set3.iterator();
                while (iterator4.hasNext()) {
                    ((abao)iterator4.next()).oR(abea, b);
                }
                if (!b) {
                    continue;
                }
                this.u(this.q(), 0, abea);
            }
            final ArrayList list = new ArrayList();
            final Iterator iterator5 = this.d.values().iterator();
            while (iterator5.hasNext()) {
                list.add(((aanx)iterator5.next()).b);
            }
            this.g.d(afeq.o((Collection)list));
        }
        if (!b) {
            final aiqj aiqj = this.f.get(h.get());
            if (aiqj != null) {
                this.n.a(aiqj);
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
    
    private final void u(final long n, final int n2, final abea abea) {
        final Optional ofNullable = Optional.ofNullable((Object)this.n(abea));
        if (ofNullable.isEmpty()) {
            return;
        }
        final boolean equals = abea.equals((Object)abea.g);
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
            this.v(timelineMarker3, abea, n2);
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
        this.v(timelineMarker5, abea, n2);
    }
    
    private final void v(final TimelineMarker timelineMarker, final abea abea, final int n) {
        final TimelineMarker timelineMarker2 = this.b.get(abea);
        if (adkp.ae((Object)timelineMarker, (Object)timelineMarker2)) {
            return;
        }
        if (timelineMarker != null) {
            this.b.put(abea, timelineMarker);
        }
        else {
            this.b.remove(abea);
        }
        this.f(timelineMarker, abea, n, timelineMarker2);
    }
    
    public final void a(final List list) {
        if (list != null && !list.isEmpty()) {
            this.i = Optional.of((Object)afeq.o((Collection)list));
            this.r();
            return;
        }
        this.i = Optional.empty();
    }
    
    public final TimelineMarker b(final abea abea) {
        return this.b.get(abea);
    }
    
    public final Optional c(final abea abea) {
        final Optional ofNullable = Optional.ofNullable((Object)this.n(abea));
        if (!ofNullable.isEmpty() && ((TimelineMarker[])ofNullable.get()).length != 0) {
            final TimelineMarker timelineMarker = this.b.get(abea);
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
    
    public final Optional d(final abea abea) {
        final Optional ofNullable = Optional.ofNullable((Object)this.n(abea));
        if (!ofNullable.isEmpty() && ((TimelineMarker[])ofNullable.get()).length != 0) {
            final TimelineMarker timelineMarker = this.b.get(abea);
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
    
    public final void e(final String s, final aiqj aiqj) {
        if (aiqj == null) {
            return;
        }
        this.f.put(s, aiqj);
    }
    
    public final void f(final TimelineMarker timelineMarker, final abea abea, final int n, final TimelineMarker timelineMarker2) {
        if (timelineMarker != null) {
            final aiqj e = timelineMarker.e;
            if (e != null) {
                this.n.a(e);
            }
        }
        final Set set = this.a.get(abea);
        if (set == null) {
            return;
        }
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            ((abao)iterator.next()).c(timelineMarker2, timelineMarker, abea, n);
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
            this.k = this.b(abea.f);
        }
        if (n != 4) {
            if (n != 5) {
                this.t(n2, 2);
                if (n == 3) {
                    final abam g = this.g;
                    g.c(n2).ifPresent((Consumer)new aaxy(g.b, 2));
                }
            }
        }
    }
    
    public final void i(final abea abea, final abao abao) {
        Set set;
        if ((set = this.a.get(abea)) == null) {
            set = new CopyOnWriteArraySet();
            this.a.put(abea, set);
        }
        set.add(abao);
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
    
    public final void l(final abea abea, final abao abao) {
        final Set set = this.a.get(abea);
        if (set == null) {
            return;
        }
        set.remove(abao);
    }
    
    public final void m(final int n) {
        final abea[] values = abea.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.u(this.q(), n, values[i]);
        }
        final abam g = this.g;
        final long q = this.q();
        if (n != 2 && n != 3) {
            return;
        }
        g.a.tu((Object)g.c(q));
    }
    
    public final TimelineMarker[] n(final abea abea) {
        final aanx aanx = this.d.get(abea);
        if (aanx == null) {
            return new TimelineMarker[0];
        }
        return (TimelineMarker[])((afeh)((aazz)aanx.b).a).toArray(new TimelineMarker[0]);
    }
    
    public final aazz o(final abea abea) {
        final aanx aanx = this.d.get(abea);
        if (aanx == null) {
            return null;
        }
        return (aazz)aanx.b;
    }
    
    public final void p(final String s, final abea abea, final aazz aazz) {
        Map synchronizedMap;
        if (this.c.containsKey(s)) {
            synchronizedMap = this.c.get(s);
        }
        else {
            synchronizedMap = DesugarCollections.synchronizedMap((Map)new HashMap());
            this.c.put(s, synchronizedMap);
        }
        if (synchronizedMap != null) {
            synchronizedMap.put(abea, aazz);
            final Set set = this.a.get(abea);
            if (set != null) {
                final Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    ((abao)iterator.next()).d(abea);
                }
            }
        }
        final argj m = this.m;
        if (m != null && abea == abea.f && m.a < aazz.a.size()) {
            ((atjo)m.b).tx();
        }
        if (this.i.isPresent() && ((afeq)this.i.get()).contains((Object)s)) {
            this.r();
        }
    }
}
