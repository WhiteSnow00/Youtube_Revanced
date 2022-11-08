import java.util.Set;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.Collection;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import java.util.Map;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eac
{
    private static volatile Looper j;
    public volatile boolean a;
    public final dvj b;
    public final dzt c;
    public final String d;
    public final dzz e;
    public dzs f;
    public dzs g;
    public final bhu h;
    public maw i;
    private final dzk k;
    private final Map l;
    private final boolean m;
    private final dzz n;
    private boolean o;
    private int p;
    private final eaa q;
    private final List r;
    private final AtomicBoolean s;
    private final elw t;
    private final cxz u;
    private final hgm v;
    
    public eac(final cdn cdn, final byte[] array, final byte[] array2, final byte[] array3) {
        this.l = new HashMap();
        this.h = new bhu((char[])null);
        this.v = new hgm(null, null);
        final dvi b = new dvi(Looper.getMainLooper());
        final dus a = bkt.a;
        this.b = (dvj)b;
        final cxz u = new cxz((short[])null);
        this.u = u;
        this.a = false;
        final String d = (String)cdn.c;
        this.d = d;
        final dzk k = new dzk((eab)cdn.b, u, d, (byte[])null, (byte[])null);
        this.k = k;
        this.m = ((ebc)k.b).b;
        this.t = new elw();
        final dzt c = new dzt((dsw)cdn.a);
        c.l = this;
        c.n = (dum)new ead(this);
        this.c = c;
        this.r = new ArrayList();
        this.q = new eaa();
        final dvi dvi = new dvi(a());
        final dus a2 = bkt.a;
        this.e = new dzz(this, (dvj)dvi);
        this.n = new dzz(this, (dvj)b);
        this.s = new AtomicBoolean(false);
    }
    
    public static Looper a() {
        synchronized (eac.class) {
            if (eac.j == null) {
                final HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                handlerThread.start();
                eac.j = handlerThread.getLooper();
            }
            return eac.j;
        }
    }
    
    public static dzs b(final dzs dzs, final boolean b) {
        if (dzs != null) {
            return dzs.c(b);
        }
        return null;
    }
    
    public static String c(final eac eac) {
        synchronized (eac) {
            final boolean a = eac.a;
            final StringBuilder sb = new StringBuilder("tag: ");
            sb.append(eac.d);
            sb.append(", currentSection.size: ");
            final dzs f = eac.f;
            final String s = null;
            Integer value;
            if (f != null) {
                value = f.i;
            }
            else {
                value = null;
            }
            sb.append(value);
            sb.append(", currentSection.name: ");
            final dzs f2 = eac.f;
            String f3;
            if (f2 != null) {
                f3 = f2.f;
            }
            else {
                f3 = null;
            }
            sb.append(f3);
            sb.append(", nextSection.size: ");
            final dzs g = eac.g;
            Integer value2;
            if (g != null) {
                value2 = g.i;
            }
            else {
                value2 = null;
            }
            sb.append(value2);
            sb.append(", nextSection.name: ");
            final dzs g2 = eac.g;
            String f4 = s;
            if (g2 != null) {
                f4 = g2.f;
            }
            sb.append(f4);
            sb.append(", pendingChangeSets.size: ");
            sb.append(eac.r.size());
            sb.append(", pendingStateUpdates.size: ");
            sb.append(((Map)eac.q.a).size());
            sb.append(", pendingNonLazyStateUpdates.size: ");
            sb.append(((Map)eac.q.b).size());
            sb.append("\n");
            return sb.toString();
        }
    }
    
    private final void n(final dzs dzs) {
        this.h.j((dsw)dzs.c, (duu)dzs, dzs.k);
        if (!((dzu)dzs).j()) {
            final List j = dzs.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.n((dzs)j.get(i));
            }
        }
    }
    
    private final void o(final dzs dzs) {
        monitorenter(this);
        try {
            final dzt c = dzs.c;
            final List j = dzs.j;
            if (j != null) {
                for (int size = j.size(), i = 0; i < size; ++i) {
                    this.o((dzs)j.get(i));
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void p() {
        this.o = false;
        this.p = 0;
    }
    
    private final void q(final dzs dzs) {
        final dzt c = dzs.c;
        if (!((dzu)dzs).j()) {
            final List j = dzs.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.q((dzs)j.get(i));
            }
        }
    }
    
    private final boolean r(final eaa eaa) {
        synchronized (this) {
            return eaa.b.equals(this.q.b);
        }
    }
    
    private final void s(final dzs dzs, final List list) {
        final ArrayList list2 = new ArrayList();
        try {
            final int size = list.size();
            int i = 0;
            boolean b = false;
            while (i < size) {
                final dzn dzn = list.get(i);
                boolean b2 = b;
                if (dzn.a() > 0) {
                    for (int a = dzn.a(), j = 0; j < a; ++j, b = true) {
                        final dzl b3 = dzn.b(j);
                        final int b4 = b3.b;
                        if (b4 != -3) {
                            if (b4 != -2) {
                                if (b4 != -1) {
                                    if (b4 != 0) {
                                        if (b4 != 1) {
                                            if (b4 != 2) {
                                                final dzk k = this.k;
                                                final int c = b3.c;
                                                if (k.e == 3) {
                                                    final int f = k.f;
                                                    if (f >= c && f <= c + 1) {
                                                        ++k.g;
                                                        k.f = c;
                                                        continue;
                                                    }
                                                }
                                                k.b();
                                                k.f = c;
                                                k.g = 1;
                                                k.e = 3;
                                            }
                                            else {
                                                final dzk l = this.k;
                                                final int c2 = b3.c;
                                                final eeh f2 = b3.f;
                                                if (l.e == 2) {
                                                    final int f3 = l.f;
                                                    final int n = l.g + f3;
                                                    if (c2 <= n) {
                                                        final int n2 = c2 + 1;
                                                        if (n2 >= f3) {
                                                            l.f = Math.min(c2, f3);
                                                            l.g = Math.max(n, n2) - l.f;
                                                            l.c.put(c2, (Object)f2);
                                                            continue;
                                                        }
                                                    }
                                                }
                                                l.b();
                                                l.f = c2;
                                                l.g = 1;
                                                l.e = 2;
                                                l.c.put(c2, (Object)f2);
                                            }
                                        }
                                        else {
                                            final dzk m = this.k;
                                            final int c3 = b3.c;
                                            final eeh f4 = b3.f;
                                            if (m.e == 1) {
                                                final int f5 = m.f;
                                                if (c3 >= f5) {
                                                    final int g = m.g;
                                                    final int n3 = f5 + g;
                                                    if (c3 <= n3 && c3 >= n3) {
                                                        m.g = g + 1;
                                                        m.f = Math.min(c3, f5);
                                                        m.c.put(c3, (Object)f4);
                                                        continue;
                                                    }
                                                }
                                            }
                                            m.b();
                                            m.f = c3;
                                            m.g = 1;
                                            m.e = 1;
                                            m.c.put(c3, (Object)f4);
                                        }
                                    }
                                    else {
                                        final dzk k2 = this.k;
                                        final int c4 = b3.c;
                                        final int d = b3.d;
                                        k2.b();
                                        final eab b5 = k2.b;
                                        Label_0670: {
                                            if (((ebc)b5).b) {
                                                final eea a2 = ((ebc)b5).a;
                                                a2.x();
                                                if (eek.a) {
                                                    a2.hashCode();
                                                }
                                                final edt edt = new edt(c4, d, (byte[])null);
                                                synchronized (a2) {
                                                    a2.B = true;
                                                    final List c5 = a2.c;
                                                    c5.add(d, c5.remove(c4));
                                                    a2.t((edr)edt);
                                                    break Label_0670;
                                                }
                                            }
                                            ((ebc)b5).a.G(c4, d);
                                        }
                                        if (dzk.a) {
                                            k2.h.p(k2.d, c4, d, Thread.currentThread().getName());
                                        }
                                    }
                                }
                                else {
                                    final dzk k3 = this.k;
                                    final int c6 = b3.c;
                                    final int e = b3.e;
                                    final List g2 = b3.g;
                                    k3.b();
                                    k3.b.e(c6, g2);
                                    if (dzk.a) {
                                        k3.c(c6, g2);
                                    }
                                }
                            }
                            else {
                                final dzk k4 = this.k;
                                final int c7 = b3.c;
                                final int e2 = b3.e;
                                final List g3 = b3.g;
                                k4.b();
                                k4.b.f(c7, g3);
                                if (dzk.a) {
                                    k4.d(c7, g3);
                                }
                            }
                        }
                        else {
                            final dzk k5 = this.k;
                            final int c8 = b3.c;
                            final int e3 = b3.e;
                            k5.b();
                            k5.b.a(c8, e3);
                        }
                    }
                    this.k.b();
                    b2 = b;
                }
                list2.addAll((Collection)dzn.b);
                ++i;
                b = b2;
            }
            final ble ble = new ble((List)list2);
            final dzk k6 = this.k;
            final dzy dzy = new dzy(this, ble, b, dzs, null, null);
            final eab b6 = k6.b;
            if (((ebc)b6).b) {
                final eea a3 = ((ebc)b6).a;
                try {
                    if (eek.a) {
                        a3.hashCode();
                    }
                    a3.B = true;
                    a3.x();
                    a3.R(b, dzy);
                    if (bkv.f()) {
                        a3.u();
                        if (b) {
                            if (dvp.b((dvp)null)) {
                                throw null;
                            }
                            a3.E();
                        }
                    }
                    else if (a3.j.get()) {
                        dyn.b().a(a3.r);
                    }
                    if (!dyo.a && !dyo.e) {
                        return;
                    }
                    a3.n.set(-1L);
                    return;
                }
                finally {}
            }
            ((ebc)b6).a.S(b, dzy);
        }
        finally {
            while (true) {}
        }
    }
    
    private final void t(final dwv dwv) {
        if (!this.m) {
            if (bkv.f()) {
                try {
                    this.i();
                    return;
                }
                catch (final IndexOutOfBoundsException ex) {
                    final String c = c(this);
                    final String message = ex.getMessage();
                    final StringBuilder sb = new StringBuilder("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: ");
                    sb.append(c);
                    sb.append(message);
                    throw new RuntimeException(sb.toString(), ex);
                }
            }
            final dzw dzw = new dzw(this, dwv);
            if (this.s.compareAndSet(true, false)) {
                ((dvi)this.b).postAtFrontOfQueue((Runnable)dzw);
                return;
            }
            ((dvi)this.b).post((Runnable)dzw);
        }
        else {
            try {
                synchronized (this) {
                    this.s(this.f, this.r);
                    this.r.clear();
                    monitorexit(this);
                    if (!bkv.f()) {
                        ((dvi)this.b).post((Runnable)new dzx(this, dwv));
                        return;
                    }
                    this.e();
                }
            }
            finally {}
        }
    }
    
    private static void u(final dzt dzt, final dzs dzs, final dzs a, final Map map, final cxz cxz, final String s) {
        if (a != null) {
            try {
                a.c = dzt.u(dzt, a);
                if (dzs != null) {
                    a.i = dzs.i;
                }
                final boolean j = ((dzu)a).j();
                if (!j) {
                    final cxz k = ((dsw)dzt).k;
                }
                final boolean b = dzs != null && dzs.getClass().equals(a.getClass());
                if (dzs != null && b) {
                    ((dzu)a).i(dzs.g, a.g);
                }
                else {
                    ((dzu)a).h(a.c);
                }
                final List list = map.get(a.k);
                if (list != null) {
                    final dwq g = a.g;
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        g.a((ardu)list.get(i));
                    }
                    ebd.g.addAndGet(list.size());
                    if (dzs.o(dzs, a)) {
                        dzs.e(a);
                    }
                }
                if (!j) {
                    Map d;
                    if (dzs != null && !((dzu)dzs).j()) {
                        d = dzs.d(dzs);
                    }
                    else {
                        d = null;
                    }
                    final cxz l = ((dsw)dzt).k;
                    final mck p6 = ((dsw)dzt).p();
                    final dwj m = blx.j((dsw)dzt, 14, (dzs)null, a);
                    final cxz r = ((dzu)a).r(a.c);
                    Object a2;
                    if (r == null) {
                        a2 = new ArrayList();
                    }
                    else {
                        a2 = r.a;
                    }
                    a.j = (List)a2;
                    if (p6 != null && m != null) {
                        mck.t(m);
                    }
                    final List j2 = a.j;
                    for (int size2 = j2.size(), n = 0; n < size2; ++n) {
                        final dzs dzs2 = j2.get(n);
                        dzs2.a = a;
                        final String l2 = dzs2.l;
                        if (TextUtils.isEmpty((CharSequence)l2)) {
                            final String f = dzs2.f;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Your Section ");
                            sb.append(f);
                            sb.append(" has an empty key. Please specify a key.");
                            throw new IllegalStateException(sb.toString());
                        }
                        final String k2 = a.k;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(k2);
                        sb2.append(l2);
                        String k3 = sb2.toString();
                        final dzt c = a.c;
                        final dzs t = c.t();
                        if (t != null) {
                            if (((Set)t.c.o.a).contains(k3)) {
                                final String f2 = dzs2.f;
                                if (t.e == null) {
                                    t.e = new HashMap();
                                }
                                int intValue;
                                if (t.e.containsKey(f2)) {
                                    intValue = t.e.get(f2);
                                }
                                else {
                                    intValue = 0;
                                }
                                t.e.put(f2, intValue + 1);
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append(k3);
                                sb3.append(intValue);
                                k3 = sb3.toString();
                            }
                        }
                        dzs2.k = k3;
                        ((Set<String>)c.o.a).add(k3);
                        dzs2.c = dzt.u(dzt, dzs2);
                        akp akp;
                        if (d == null) {
                            akp = null;
                        }
                        else {
                            akp = d.get(dzs2.k);
                        }
                        dzs dzs3;
                        if (akp != null) {
                            dzs3 = (dzs)akp.a;
                        }
                        else {
                            dzs3 = null;
                        }
                        u(dzt, dzs3, dzs2, map, cxz, s);
                    }
                    if (((dsw)dzt).k != l) {
                        ((dsw)dzt).k = l;
                    }
                }
                return;
            }
            finally {}
        }
        throw new IllegalStateException("Can't generate a subtree with a null root");
    }
    
    private final void v(final String s, final ardu ardu) {
        synchronized (this) {
            if (this.f == null && this.g == null) {
                throw new IllegalStateException("State set with no attached Section");
            }
            final eaa q = this.q;
            eaa.z(s, ardu, (Map)q.a);
            eaa.z(s, ardu, (Map)q.b);
            if (this.o && ++this.p == 50) {
                coy.d(3, "SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
            final dzs g = this.g;
            if (g == null) {
                this.g = b(this.f, false);
                return;
            }
            this.g = b(g, false);
        }
    }
    
    public final void d(final dzs dzs) {
        final dzt c = dzs.c;
        if (!((dzu)dzs).j()) {
            final List j = dzs.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.d((dzs)j.get(i));
            }
        }
    }
    
    public final void e() {
        if (this.t.a != null) {
            final dzp a = dzp.a;
        }
    }
    
    public final void f(final dzs dzs) {
        final dzt c = dzs.c;
        ((dzu)dzs).p();
        if (!((dzu)dzs).j()) {
            final List j = dzs.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.f((dzs)j.get(i));
            }
        }
    }
    
    public final void g(final dzp a) {
        final dzp a2 = dzp.a;
        this.t.a = a;
    }
    
    public final void h(dzs dzs, final int e, final int a, final int d, final int b, final int n) {
        final area area = this.l.get(dzs.k);
        final int i = dzs.i;
        area area2;
        if (area == null) {
            area2 = new area();
            this.l.put(dzs.k, area2);
        }
        else {
            area2 = area;
            if (area.e == e) {
                area2 = area;
                if (area.a == a) {
                    area2 = area;
                    if (area.d == d) {
                        area2 = area;
                        if (area.b == b) {
                            area2 = area;
                            if (area.c == i) {
                                area2 = area;
                                if (n != 1) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        area2.a = a;
        area2.e = e;
        area2.d = d;
        area2.b = b;
        area2.c = i;
        final dzt c = dzs.c;
        ((dzu)dzs).q(a, i);
        if (!((dzu)dzs).j()) {
            final List j = dzs.j;
            int l;
            for (int size = j.size(), n2 = 0, k = 0; k < size; ++k, n2 += l) {
                dzs = (dzs)j.get(k);
                final int n3 = e - n2;
                final int n4 = a - n2;
                final int n5 = d - n2;
                final int n6 = b - n2;
                int max;
                int min;
                if (n3 < dzs.i && n4 >= 0) {
                    max = Math.max(n3, 0);
                    min = Math.min(n4, dzs.i - 1);
                }
                else {
                    max = -1;
                    min = -1;
                }
                int max2;
                int min2;
                if (n5 < dzs.i && n6 >= 0) {
                    max2 = Math.max(n5, 0);
                    min2 = Math.min(n6, dzs.i - 1);
                }
                else {
                    max2 = -1;
                    min2 = -1;
                }
                l = dzs.i;
                this.h(dzs, max, min, max2, min2, n);
            }
        }
    }
    
    public final void i() {
        bkv.e();
        if (!this.m) {
            try {
                synchronized (this) {
                    final ArrayList list = new ArrayList(this.r);
                    this.r.clear();
                    final dzs f = this.f;
                    monitorexit(this);
                    this.s(f, list);
                    this.e();
                    return;
                }
            }
            finally {}
        }
        throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
    }
    
    public final void j(int i, String d, dwv dwv) {
        if (d == null) {
            d = this.d;
        }
        if (eek.a) {
            synchronized (this) {
                monitorexit(this);
                this.hashCode();
            }
        }
        try {
            synchronized (this) {
                Object o = b(this.f, true);
                final dzs g = this.g;
                int c = 0;
                final dzs b = b(g, false);
                final mck p2 = ((dsw)this.c).p();
                Object o2 = this.q.a();
                this.o = true;
                monitorexit(this);
                final dwj j = blx.j((dsw)this.c, 15, (dzs)o, b);
                final boolean b2 = p2 != null && j != null && mck.s(j);
                if (j != null) {
                    j.a("attribution", (String)d);
                    if (i != -1) {
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    d = "updateStateAsync";
                                }
                                else {
                                    d = "updateState";
                                }
                            }
                            else {
                                d = "setRootAsync";
                            }
                        }
                        else {
                            d = "setRoot";
                        }
                    }
                    else {
                        d = "none";
                    }
                    j.a("section_set_root_source", (String)d);
                    bkv.f();
                }
                this.v.h();
                dzs f = b;
                while (f != null) {
                    final dzt c2 = this.c;
                    final Object a = ((eaa)o2).a;
                    final cxz u = this.u;
                    final String d2 = this.d;
                    f.k = f.l;
                    final mck p3 = ((dsw)c2).p();
                    final dwj k = blx.j((dsw)c2, 11, (dzs)o, f);
                    try {
                        u(c2, (dzs)o, f, (Map)a, u, d2);
                        if (p3 != null && k != null) {
                            mck.t(k);
                        }
                        try {
                            i = dzo.a;
                            final ArrayList list = new ArrayList();
                            final mck p4 = ((dsw)c2).p();
                            final dwj l = blx.j((dsw)c2, 13, (dzs)o, f);
                            dzn dzn;
                            if (o != null && !((dzs)o).f.equals(f.f)) {
                                dzn = dzn.e(dzo.a(c2, (dzs)o, null, list, u, d2, "", "", Thread.currentThread().getName(), b2), dzo.a(c2, null, f, list, u, d2, "", "", Thread.currentThread().getName(), b2));
                            }
                            else {
                                dzn = dzo.a(c2, (dzs)o, f, list, u, d2, "", "", Thread.currentThread().getName(), b2);
                            }
                            if (p4 != null && l != null) {
                                dzn.a();
                                mck.t(l);
                            }
                            if ((o != null && ((dzs)o).i < 0) || f.i < 0) {
                                dwv = (dwv)new StringBuilder();
                                ((StringBuilder)dwv).append("Changet count is below 0! Current section: ");
                                if (o == null) {
                                    ((StringBuilder)dwv).append("null; ");
                                }
                                else {
                                    final String f2 = ((dzs)o).f;
                                    o2 = ((dzs)o).k;
                                    i = ((dzs)o).i;
                                    final int size = ((dzs)o).j.size();
                                    o = new StringBuilder();
                                    ((StringBuilder)o).append(f2);
                                    ((StringBuilder)o).append(" , key=");
                                    ((StringBuilder)o).append((String)o2);
                                    ((StringBuilder)o).append(", count=");
                                    ((StringBuilder)o).append(i);
                                    ((StringBuilder)o).append(", childrenSize=");
                                    ((StringBuilder)o).append(size);
                                    ((StringBuilder)o).append("; ");
                                    ((StringBuilder)dwv).append(((StringBuilder)o).toString());
                                }
                                ((StringBuilder)dwv).append("Next section: ");
                                o = f.f;
                                o2 = f.k;
                                i = f.i;
                                final int size2 = f.j.size();
                                final StringBuilder sb = new StringBuilder();
                                sb.append((String)o);
                                sb.append(" , key=");
                                sb.append((String)o2);
                                sb.append(", count=");
                                sb.append(i);
                                sb.append(", childrenSize=");
                                sb.append(size2);
                                sb.append("; ");
                                ((StringBuilder)dwv).append(sb.toString());
                                ((StringBuilder)dwv).append("Changes: [");
                                dzl b3;
                                int b4;
                                int d3;
                                StringBuilder sb2;
                                for (i = c; i < dzn.a; ++i) {
                                    b3 = dzn.b(i);
                                    b4 = b3.b;
                                    c = b3.c;
                                    d3 = b3.d;
                                    sb2 = new StringBuilder();
                                    sb2.append(b4);
                                    sb2.append(" ");
                                    sb2.append(c);
                                    sb2.append(" ");
                                    sb2.append(d3);
                                    ((StringBuilder)dwv).append(sb2.toString());
                                    ((StringBuilder)dwv).append(", ");
                                }
                                ((StringBuilder)dwv).append("]");
                                throw new IllegalStateException(((StringBuilder)dwv).toString());
                            }
                            monitorenter(this);
                            if (o != null) {
                                i = 1;
                            }
                            else {
                                i = 0;
                            }
                            try {
                                final dzs f3 = this.f;
                                final boolean b5 = f3 != null;
                                if ((i != 0 && b5 && ((dzs)o).h == f3.h) || (i == 0 && !b5)) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                o = this.g;
                                final boolean b6 = o != null && f.h == ((dzs)o).h;
                                if (i != 0 && b6 && this.r((eaa)o2)) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                if (i != 0) {
                                    final dzs f4 = this.f;
                                    this.f = f;
                                    this.g = null;
                                    this.p();
                                    final eaa q = this.q;
                                    if (!((Map)((eaa)o2).a).isEmpty()) {
                                        final Iterator<String> iterator = ((Map<String, V>)((eaa)o2).a).keySet().iterator();
                                        while (iterator.hasNext()) {
                                            o = iterator.next();
                                            if (!((Map)q.a).containsKey(o)) {
                                                break;
                                            }
                                            eaa.b((Map)q.a, (Map)((eaa)o2).a, (String)o);
                                            eaa.b((Map)q.b, (Map)((eaa)o2).b, (String)o);
                                        }
                                    }
                                    this.r.add(dzn);
                                    if (f4 != null) {
                                        this.q(f4);
                                    }
                                    this.o(f);
                                }
                                else {
                                    f = null;
                                }
                                monitorexit(this);
                                if (i != 0) {
                                    this.n(f);
                                    int size3;
                                    area area;
                                    for (size3 = list.size(), i = 0; i < size3; ++i) {
                                        area = this.l.remove(((dzs)list.get(i)).k);
                                    }
                                    this.h.k();
                                    this.t(dwv);
                                }
                                synchronized (this) {
                                    ((Map)((eaa)o2).a).clear();
                                    ((Map)((eaa)o2).b).clear();
                                    o = b(this.f, true);
                                    if (b(this.g, false) != null) {
                                        o2 = this.q.a();
                                        this.o = true;
                                    }
                                    else {
                                        this.p();
                                    }
                                }
                            }
                            finally {
                                monitorexit(this);
                            }
                        }
                        finally {}
                    }
                    finally {}
                    break;
                }
                final cxz m = ((dsw)this.c).k;
                dvp dvp;
                if (m == null) {
                    dvp = null;
                }
                else {
                    dvp = (dvp)m.u(dvp.class);
                }
                if (!dvp.b(dvp)) {
                    if (p2 != null && j != null) {
                        mck.t(j);
                    }
                    ebd.a();
                    if (bkv.f()) {
                        ebd.b();
                    }
                    return;
                }
                throw null;
            }
        }
        finally {
            ebd.a();
            Label_1436: {
                if (bkv.f()) {
                    ebd.b();
                    break Label_1436;
                }
                break Label_1436;
            }
            while (true) {}
        }
    }
    
    public final void k(final dzs dzs, final boolean b, final boolean b2, final long n, final ble ble, int i) {
        if (((dzu)dzs).j()) {
            return;
        }
        final area area = this.l.get(dzs.k);
        final dzt c = dzs.c;
        final List j = dzs.j;
        final int size = j.size();
        int n2 = i;
        dzs dzs2;
        for (i = 0; i < size; ++i) {
            dzs2 = j.get(i);
            this.k(dzs2, b, b2, n, ble, n2);
            n2 += dzs2.i;
        }
    }
    
    final void l(final String s, final ardu ardu, final String s2) {
        synchronized (this) {
            this.n.b();
            this.v(s, ardu);
            this.n.c(2, s2);
            ebd.h.addAndGet(1L);
        }
    }
    
    final void m(final String s, final ardu ardu, final String s2) {
        synchronized (this) {
            this.e.b();
            this.v(s, ardu);
            this.e.c(3, s2);
            ebd.i.addAndGet(1L);
        }
    }
}
