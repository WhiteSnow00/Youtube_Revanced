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

public final class ead
{
    private static volatile Looper j;
    public volatile boolean a;
    public final dvk b;
    public final dzu c;
    public final String d;
    public final eaa e;
    public dzt f;
    public dzt g;
    public final bhv h;
    public mcb i;
    private final dzl k;
    private final Map l;
    private final boolean m;
    private final eaa n;
    private boolean o;
    private int p;
    private final eab q;
    private final List r;
    private final AtomicBoolean s;
    private final elx t;
    private final cya u;
    private final hhg v;
    
    public ead(final cdo cdo, final byte[] array, final byte[] array2, final byte[] array3) {
        this.l = new HashMap();
        this.h = new bhv((char[])null);
        this.v = new hhg((byte[])null, (byte[])null);
        final dvj b = new dvj(Looper.getMainLooper());
        final dut a = bku.a;
        this.b = (dvk)b;
        final cya u = new cya((short[])null);
        this.u = u;
        this.a = false;
        final String d = (String)cdo.c;
        this.d = d;
        final dzl k = new dzl((eac)cdo.b, u, d, (byte[])null, (byte[])null);
        this.k = k;
        this.m = ((ebd)k.b).b;
        this.t = new elx();
        final dzu c = new dzu((dsx)cdo.a);
        c.l = this;
        c.n = (dun)new eae(this);
        this.c = c;
        this.r = new ArrayList();
        this.q = new eab();
        final dvj dvj = new dvj(a());
        final dut a2 = bku.a;
        this.e = new eaa(this, (dvk)dvj);
        this.n = new eaa(this, (dvk)b);
        this.s = new AtomicBoolean(false);
    }
    
    public static Looper a() {
        synchronized (ead.class) {
            if (ead.j == null) {
                final HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                handlerThread.start();
                ead.j = handlerThread.getLooper();
            }
            return ead.j;
        }
    }
    
    public static dzt b(final dzt dzt, final boolean b) {
        if (dzt != null) {
            return dzt.c(b);
        }
        return null;
    }
    
    public static String c(final ead ead) {
        synchronized (ead) {
            final boolean a = ead.a;
            final StringBuilder sb = new StringBuilder("tag: ");
            sb.append(ead.d);
            sb.append(", currentSection.size: ");
            final dzt f = ead.f;
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
            final dzt f2 = ead.f;
            String f3;
            if (f2 != null) {
                f3 = f2.f;
            }
            else {
                f3 = null;
            }
            sb.append(f3);
            sb.append(", nextSection.size: ");
            final dzt g = ead.g;
            Integer value2;
            if (g != null) {
                value2 = g.i;
            }
            else {
                value2 = null;
            }
            sb.append(value2);
            sb.append(", nextSection.name: ");
            final dzt g2 = ead.g;
            String f4 = s;
            if (g2 != null) {
                f4 = g2.f;
            }
            sb.append(f4);
            sb.append(", pendingChangeSets.size: ");
            sb.append(ead.r.size());
            sb.append(", pendingStateUpdates.size: ");
            sb.append(((Map)ead.q.a).size());
            sb.append(", pendingNonLazyStateUpdates.size: ");
            sb.append(((Map)ead.q.b).size());
            sb.append("\n");
            return sb.toString();
        }
    }
    
    private final void n(final dzt dzt) {
        this.h.j((dsx)dzt.c, (duv)dzt, dzt.k);
        if (!((dzv)dzt).j()) {
            final List j = dzt.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.n((dzt)j.get(i));
            }
        }
    }
    
    private final void o(final dzt dzt) {
        monitorenter(this);
        try {
            final dzu c = dzt.c;
            final List j = dzt.j;
            if (j != null) {
                for (int size = j.size(), i = 0; i < size; ++i) {
                    this.o((dzt)j.get(i));
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
    
    private final void q(final dzt dzt) {
        final dzu c = dzt.c;
        if (!((dzv)dzt).j()) {
            final List j = dzt.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.q((dzt)j.get(i));
            }
        }
    }
    
    private final boolean r(final eab eab) {
        synchronized (this) {
            return eab.b.equals(this.q.b);
        }
    }
    
    private final void s(final dzt dzt, final List list) {
        final ArrayList list2 = new ArrayList();
        try {
            final int size = list.size();
            int i = 0;
            boolean b = false;
            while (i < size) {
                final dzo dzo = list.get(i);
                boolean b2 = b;
                if (dzo.a() > 0) {
                    for (int a = dzo.a(), j = 0; j < a; ++j, b = true) {
                        final dzm b3 = dzo.b(j);
                        final int b4 = b3.b;
                        if (b4 != -3) {
                            if (b4 != -2) {
                                if (b4 != -1) {
                                    if (b4 != 0) {
                                        if (b4 != 1) {
                                            if (b4 != 2) {
                                                final dzl k = this.k;
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
                                                final dzl l = this.k;
                                                final int c2 = b3.c;
                                                final eei f2 = b3.f;
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
                                            final dzl m = this.k;
                                            final int c3 = b3.c;
                                            final eei f4 = b3.f;
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
                                        final dzl k2 = this.k;
                                        final int c4 = b3.c;
                                        final int d = b3.d;
                                        k2.b();
                                        final eac b5 = k2.b;
                                        Label_0668: {
                                            if (((ebd)b5).b) {
                                                final eeb a2 = ((ebd)b5).a;
                                                a2.x();
                                                if (eel.a) {
                                                    a2.hashCode();
                                                }
                                                final edu edu = new edu(c4, d, (byte[])null);
                                                synchronized (a2) {
                                                    a2.B = true;
                                                    final List c5 = a2.c;
                                                    c5.add(d, c5.remove(c4));
                                                    a2.t((eds)edu);
                                                    break Label_0668;
                                                }
                                            }
                                            ((ebd)b5).a.G(c4, d);
                                        }
                                        if (dzl.a) {
                                            k2.h.p(k2.d, c4, d, Thread.currentThread().getName());
                                        }
                                    }
                                }
                                else {
                                    final dzl k3 = this.k;
                                    final int c6 = b3.c;
                                    final int e = b3.e;
                                    final List g2 = b3.g;
                                    k3.b();
                                    k3.b.e(c6, g2);
                                    if (dzl.a) {
                                        k3.c(c6, g2);
                                    }
                                }
                            }
                            else {
                                final dzl k4 = this.k;
                                final int c7 = b3.c;
                                final int e2 = b3.e;
                                final List g3 = b3.g;
                                k4.b();
                                k4.b.f(c7, g3);
                                if (dzl.a) {
                                    k4.d(c7, g3);
                                }
                            }
                        }
                        else {
                            final dzl k5 = this.k;
                            final int c8 = b3.c;
                            final int e3 = b3.e;
                            k5.b();
                            k5.b.a(c8, e3);
                        }
                    }
                    this.k.b();
                    b2 = b;
                }
                list2.addAll((Collection)dzo.b);
                ++i;
                b = b2;
            }
            final blf blf = new blf(list2);
            final dzl k6 = this.k;
            final dzz dzz = new dzz(this, blf, b, dzt, null, null);
            final eac b6 = k6.b;
            if (((ebd)b6).b) {
                final eeb a3 = ((ebd)b6).a;
                try {
                    if (eel.a) {
                        a3.hashCode();
                    }
                    a3.B = true;
                    a3.x();
                    a3.R(b, dzz);
                    if (bkw.f()) {
                        a3.u();
                        if (b) {
                            if (dvq.b((dvq)null)) {
                                throw null;
                            }
                            a3.E();
                        }
                    }
                    else if (a3.j.get()) {
                        dyo.b().a(a3.r);
                    }
                    if (!dyp.a && !dyp.e) {
                        return;
                    }
                    a3.n.set(-1L);
                    return;
                }
                finally {}
            }
            ((ebd)b6).a.S(b, dzz);
        }
        finally {
            while (true) {}
        }
    }
    
    private final void t(final dww dww) {
        if (this.m) {
            try {
                synchronized (this) {
                    this.s(this.f, this.r);
                    this.r.clear();
                    monitorexit(this);
                    if (!bkw.f()) {
                        ((dvj)this.b).post((Runnable)new dzy(this, dww));
                        return;
                    }
                    this.e();
                    return;
                }
            }
            finally {}
        }
        if (bkw.f()) {
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
        final dzx dzx = new dzx(this, dww);
        if (this.s.compareAndSet(true, false)) {
            ((dvj)this.b).postAtFrontOfQueue((Runnable)dzx);
            return;
        }
        ((dvj)this.b).post((Runnable)dzx);
    }
    
    private static void u(final dzu dzu, final dzt dzt, final dzt a, final Map map, final cya cya, final String s) {
        if (a != null) {
            try {
                a.c = dzu.u(dzu, a);
                if (dzt != null) {
                    a.i = dzt.i;
                }
                final boolean j = ((dzv)a).j();
                if (!j) {
                    final cya k = ((dsx)dzu).k;
                }
                final boolean b = dzt != null && dzt.getClass().equals(a.getClass());
                if (dzt != null && b) {
                    ((dzv)a).i(dzt.g, a.g);
                }
                else {
                    ((dzv)a).h(a.c);
                }
                final List list = map.get(a.k);
                if (list != null) {
                    final dwr g = a.g;
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        g.a((argj)list.get(i));
                    }
                    ebe.g.addAndGet(list.size());
                    if (dzt.o(dzt, a)) {
                        dzt.e(a);
                    }
                }
                if (!j) {
                    Map d;
                    if (dzt != null && !((dzv)dzt).j()) {
                        d = dzt.d(dzt);
                    }
                    else {
                        d = null;
                    }
                    final cya l = ((dsx)dzu).k;
                    final msr q = ((dsx)dzu).q();
                    final dwk m = bly.j((dsx)dzu, 14, null, a);
                    final cya r = ((dzv)a).r(a.c);
                    Object a2;
                    if (r == null) {
                        a2 = new ArrayList();
                    }
                    else {
                        a2 = r.a;
                    }
                    a.j = (List)a2;
                    if (q != null && m != null) {
                        msr.u(m);
                    }
                    final List j2 = a.j;
                    for (int size2 = j2.size(), n = 0; n < size2; ++n) {
                        final dzt dzt2 = j2.get(n);
                        dzt2.a = a;
                        final String l2 = dzt2.l;
                        if (TextUtils.isEmpty((CharSequence)l2)) {
                            final String f = dzt2.f;
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
                        final dzu c = a.c;
                        final dzt t = c.t();
                        if (t != null) {
                            if (((Set)t.c.o.a).contains(k3)) {
                                final String f2 = dzt2.f;
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
                        dzt2.k = k3;
                        ((Set<String>)c.o.a).add(k3);
                        dzt2.c = dzu.u(dzu, dzt2);
                        akq akq;
                        if (d == null) {
                            akq = null;
                        }
                        else {
                            akq = d.get(dzt2.k);
                        }
                        dzt dzt3;
                        if (akq != null) {
                            dzt3 = (dzt)akq.a;
                        }
                        else {
                            dzt3 = null;
                        }
                        u(dzu, dzt3, dzt2, map, cya, s);
                    }
                    if (((dsx)dzu).k != l) {
                        ((dsx)dzu).k = l;
                    }
                }
                return;
            }
            finally {}
        }
        throw new IllegalStateException("Can't generate a subtree with a null root");
    }
    
    private final void v(final String s, final argj argj) {
        synchronized (this) {
            if (this.f == null && this.g == null) {
                throw new IllegalStateException("State set with no attached Section");
            }
            final eab q = this.q;
            eab.z(s, argj, (Map)q.a);
            eab.z(s, argj, (Map)q.b);
            if (this.o && ++this.p == 50) {
                coz.d(3, "SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
            final dzt g = this.g;
            if (g == null) {
                this.g = b(this.f, false);
                return;
            }
            this.g = b(g, false);
        }
    }
    
    public final void d(final dzt dzt) {
        final dzu c = dzt.c;
        if (!((dzv)dzt).j()) {
            final List j = dzt.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.d((dzt)j.get(i));
            }
        }
    }
    
    public final void e() {
        if (this.t.a != null) {
            final dzq a = dzq.a;
        }
    }
    
    public final void f(final dzt dzt) {
        final dzu c = dzt.c;
        ((dzv)dzt).p();
        if (!((dzv)dzt).j()) {
            final List j = dzt.j;
            for (int size = j.size(), i = 0; i < size; ++i) {
                this.f((dzt)j.get(i));
            }
        }
    }
    
    public final void g(final dzq a) {
        final dzq a2 = dzq.a;
        this.t.a = a;
    }
    
    public final void h(final dzt dzt, final int e, final int a, final int d, final int b, final int n) {
        final argp argp = this.l.get(dzt.k);
        final int i = dzt.i;
        argp argp2;
        if (argp == null) {
            argp2 = new argp();
            this.l.put(dzt.k, argp2);
        }
        else {
            argp2 = argp;
            if (argp.e == e) {
                argp2 = argp;
                if (argp.a == a) {
                    argp2 = argp;
                    if (argp.d == d) {
                        argp2 = argp;
                        if (argp.b == b) {
                            argp2 = argp;
                            if (argp.c == i) {
                                argp2 = argp;
                                if (n != 1) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        argp2.a = a;
        argp2.e = e;
        argp2.d = d;
        argp2.b = b;
        argp2.c = i;
        final dzu c = dzt.c;
        ((dzv)dzt).q(a, i);
        if (!((dzv)dzt).j()) {
            final List j = dzt.j;
            int l;
            for (int size = j.size(), n2 = 0, k = 0; k < size; ++k, n2 += l) {
                final dzt dzt2 = j.get(k);
                final int n3 = e - n2;
                final int n4 = a - n2;
                final int n5 = d - n2;
                final int n6 = b - n2;
                int max;
                int min;
                if (n3 < dzt2.i && n4 >= 0) {
                    max = Math.max(n3, 0);
                    min = Math.min(n4, dzt2.i - 1);
                }
                else {
                    max = -1;
                    min = -1;
                }
                int max2;
                int min2;
                if (n5 < dzt2.i && n6 >= 0) {
                    max2 = Math.max(n5, 0);
                    min2 = Math.min(n6, dzt2.i - 1);
                }
                else {
                    max2 = -1;
                    min2 = -1;
                }
                l = dzt2.i;
                this.h(dzt2, max, min, max2, min2, n);
            }
        }
    }
    
    public final void i() {
        bkw.e();
        if (!this.m) {
            try {
                synchronized (this) {
                    final ArrayList list = new ArrayList(this.r);
                    this.r.clear();
                    final dzt f = this.f;
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
    
    public final void j(int i, String d, dww dww) {
        if (d == null) {
            d = this.d;
        }
        if (eel.a) {
            synchronized (this) {
                monitorexit(this);
                this.hashCode();
            }
        }
        try {
            synchronized (this) {
                Object o = b(this.f, true);
                final dzt g = this.g;
                int b = 0;
                final dzt b2 = b(g, false);
                final msr q = ((dsx)this.c).q();
                Object o2 = this.q.a();
                this.o = true;
                monitorexit(this);
                final dwk j = bly.j((dsx)this.c, 15, (dzt)o, b2);
                final boolean b3 = q != null && j != null && msr.t(j);
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
                    bkw.f();
                }
                this.v.h();
                dzt f = b2;
                while (f != null) {
                    final dzu c = this.c;
                    final Object a = ((eab)o2).a;
                    final cya u = this.u;
                    final String d2 = this.d;
                    f.k = f.l;
                    final msr q2 = ((dsx)c).q();
                    final dwk k = bly.j((dsx)c, 11, (dzt)o, f);
                    try {
                        u(c, (dzt)o, f, (Map)a, u, d2);
                        if (q2 != null && k != null) {
                            msr.u(k);
                        }
                        try {
                            i = dzp.a;
                            final ArrayList list = new ArrayList();
                            final msr q3 = ((dsx)c).q();
                            final dwk l = bly.j((dsx)c, 13, (dzt)o, f);
                            dzo dzo;
                            if (o != null && !((dzt)o).f.equals(f.f)) {
                                dzo = dzo.e(dzp.a(c, (dzt)o, null, list, u, d2, "", "", Thread.currentThread().getName(), b3), dzp.a(c, null, f, list, u, d2, "", "", Thread.currentThread().getName(), b3));
                            }
                            else {
                                dzo = dzp.a(c, (dzt)o, f, list, u, d2, "", "", Thread.currentThread().getName(), b3);
                            }
                            if (q3 != null && l != null) {
                                dzo.a();
                                msr.u(l);
                            }
                            if ((o != null && ((dzt)o).i < 0) || f.i < 0) {
                                dww = (dww)new StringBuilder();
                                ((StringBuilder)dww).append("Changet count is below 0! Current section: ");
                                if (o == null) {
                                    ((StringBuilder)dww).append("null; ");
                                }
                                else {
                                    final String f2 = ((dzt)o).f;
                                    o2 = ((dzt)o).k;
                                    i = ((dzt)o).i;
                                    final int size = ((dzt)o).j.size();
                                    o = new StringBuilder();
                                    ((StringBuilder)o).append(f2);
                                    ((StringBuilder)o).append(" , key=");
                                    ((StringBuilder)o).append((String)o2);
                                    ((StringBuilder)o).append(", count=");
                                    ((StringBuilder)o).append(i);
                                    ((StringBuilder)o).append(", childrenSize=");
                                    ((StringBuilder)o).append(size);
                                    ((StringBuilder)o).append("; ");
                                    ((StringBuilder)dww).append(((StringBuilder)o).toString());
                                }
                                ((StringBuilder)dww).append("Next section: ");
                                o = f.f;
                                o2 = f.k;
                                final int m = f.i;
                                i = f.j.size();
                                final StringBuilder sb = new StringBuilder();
                                sb.append((String)o);
                                sb.append(" , key=");
                                sb.append((String)o2);
                                sb.append(", count=");
                                sb.append(m);
                                sb.append(", childrenSize=");
                                sb.append(i);
                                sb.append("; ");
                                ((StringBuilder)dww).append(sb.toString());
                                ((StringBuilder)dww).append("Changes: [");
                                dzm b4;
                                int c2;
                                int d3;
                                StringBuilder sb2;
                                for (i = b; i < dzo.a; ++i) {
                                    b4 = dzo.b(i);
                                    b = b4.b;
                                    c2 = b4.c;
                                    d3 = b4.d;
                                    sb2 = new StringBuilder();
                                    sb2.append(b);
                                    sb2.append(" ");
                                    sb2.append(c2);
                                    sb2.append(" ");
                                    sb2.append(d3);
                                    ((StringBuilder)dww).append(sb2.toString());
                                    ((StringBuilder)dww).append(", ");
                                }
                                ((StringBuilder)dww).append("]");
                                throw new IllegalStateException(((StringBuilder)dww).toString());
                            }
                            monitorenter(this);
                            if (o != null) {
                                i = 1;
                            }
                            else {
                                i = 0;
                            }
                            try {
                                final dzt f3 = this.f;
                                final boolean b5 = f3 != null;
                                if ((i != 0 && b5 && ((dzt)o).h == f3.h) || (i == 0 && !b5)) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                o = this.g;
                                final boolean b6 = o != null && f.h == ((dzt)o).h;
                                if (i != 0 && b6 && this.r((eab)o2)) {
                                    i = 1;
                                }
                                else {
                                    i = 0;
                                }
                                if (i != 0) {
                                    o = this.f;
                                    this.f = f;
                                    this.g = null;
                                    this.p();
                                    final eab q4 = this.q;
                                    if (!((Map)((eab)o2).a).isEmpty()) {
                                        for (final String s : ((Map<String, V>)((eab)o2).a).keySet()) {
                                            if (!((Map)q4.a).containsKey(s)) {
                                                break;
                                            }
                                            eab.b((Map)q4.a, (Map)((eab)o2).a, s);
                                            eab.b((Map)q4.b, (Map)((eab)o2).b, s);
                                        }
                                    }
                                    this.r.add(dzo);
                                    if (o != null) {
                                        this.q((dzt)o);
                                    }
                                    this.o(f);
                                }
                                else {
                                    f = null;
                                }
                                monitorexit(this);
                                if (i != 0) {
                                    this.n(f);
                                    int size2;
                                    argp argp;
                                    for (size2 = list.size(), i = 0; i < size2; ++i) {
                                        argp = this.l.remove(((dzt)list.get(i)).k);
                                    }
                                    this.h.k();
                                    this.t(dww);
                                }
                                synchronized (this) {
                                    ((Map)((eab)o2).a).clear();
                                    ((Map)((eab)o2).b).clear();
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
                final cya k2 = ((dsx)this.c).k;
                dvq dvq;
                if (k2 == null) {
                    dvq = null;
                }
                else {
                    dvq = (dvq)k2.u((Class)dvq.class);
                }
                if (!dvq.b(dvq)) {
                    if (q != null && j != null) {
                        msr.u(j);
                    }
                    ebe.a();
                    if (bkw.f()) {
                        ebe.b();
                    }
                    return;
                }
                throw null;
            }
        }
        finally {
            ebe.a();
            Label_1436: {
                if (bkw.f()) {
                    ebe.b();
                    break Label_1436;
                }
                break Label_1436;
            }
            while (true) {}
        }
    }
    
    public final void k(final dzt dzt, final boolean b, final boolean b2, final long n, final blf blf, int i) {
        if (((dzv)dzt).j()) {
            return;
        }
        final argp argp = this.l.get(dzt.k);
        final dzu c = dzt.c;
        final List j = dzt.j;
        final int size = j.size();
        int n2 = i;
        dzt dzt2;
        for (i = 0; i < size; ++i) {
            dzt2 = j.get(i);
            this.k(dzt2, b, b2, n, blf, n2);
            n2 += dzt2.i;
        }
    }
    
    final void l(final String s, final argj argj, final String s2) {
        synchronized (this) {
            this.n.b();
            this.v(s, argj);
            this.n.c(2, s2);
            ebe.h.addAndGet(1L);
        }
    }
    
    final void m(final String s, final argj argj, final String s2) {
        synchronized (this) {
            this.e.b();
            this.v(s, argj);
            this.e.c(3, s2);
            ebe.i.addAndGet(1L);
        }
    }
}
