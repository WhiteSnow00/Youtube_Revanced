import java.util.Set;
import android.view.ViewGroup$LayoutParams;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import android.util.SparseArray;
import android.view.View;
import java.util.Collections;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oc
{
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public final /* synthetic */ RecyclerView g;
    public agmd h;
    
    public oc(final RecyclerView g) {
        this.g = g;
        final ArrayList a = new ArrayList();
        this.a = a;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList((List<?>)a);
        this.e = 2;
        this.f = 2;
    }
    
    public final int a(final int n) {
        if (n < 0 || n >= this.g.L.a()) {
            final StringBuilder sb = new StringBuilder("invalid position ");
            sb.append(n);
            sb.append(". State item count is ");
            sb.append(this.g.L.a());
            sb.append(this.g.o());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        final RecyclerView g = this.g;
        if (!g.L.g) {
            return n;
        }
        return g.S.f(n);
    }
    
    public final View b(final int n) {
        return this.p(n, Long.MAX_VALUE).a;
    }
    
    final void c(final on on, final boolean b) {
        RecyclerView.w(on);
        final View a = on.a;
        final op p2 = this.g.P;
        if (p2 != null) {
            final akv j = p2.j();
            akv akv;
            if (j instanceof oo) {
                akv = ((oo)j).b.remove(a);
            }
            else {
                akv = null;
            }
            ana.N(a, akv);
        }
        if (b) {
            final od o = this.g.o;
            if (o != null) {
                o.a(on);
            }
            for (int size = this.g.p.size(), i = 0; i < size; ++i) {
                ((od)this.g.p.get(i)).a(on);
            }
            final nq m = this.g.m;
            if (m != null) {
                m.r(on);
            }
            final RecyclerView g = this.g;
            if (g.L != null) {
                g.T.h(on);
            }
        }
        on.r = null;
        on.q = null;
        this.q().O(on);
    }
    
    public final void d() {
        this.a.clear();
        this.i();
    }
    
    public final void e() {
        final agmd h = this.h;
        if (h != null) {
            final RecyclerView g = this.g;
            final nq m = g.m;
            if (m != null && g.r) {
                ((Set<nq>)h.a).add(m);
            }
        }
    }
    
    public final void f(final nq nq) {
        this.g(nq, false);
    }
    
    public final void g(final nq nq, final boolean b) {
        final agmd h = this.h;
        if (h != null) {
            ((Set)h.a).remove(nq);
            if (((Set)h.a).size() == 0 && !b) {
                for (int i = 0; i < ((SparseArray)h.c).size(); ++i) {
                    final SparseArray sparseArray = (SparseArray)h.c;
                    final ArrayList a = ((ob)sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int j = 0; j < a.size(); ++j) {
                        apj.e(((on)a.get(j)).a);
                    }
                }
            }
        }
    }
    
    final void h(final View view) {
        final on k = RecyclerView.k(view);
        k.m = null;
        k.n = false;
        k.i();
        this.l(k);
    }
    
    public final void i() {
        int size = this.c.size();
        while (--size >= 0) {
            this.j(size);
        }
        this.c.clear();
        if (RecyclerView.c) {
            this.g.W.u();
        }
    }
    
    public final void j(final int n) {
        this.c(this.c.get(n), true);
        this.c.remove(n);
    }
    
    public final void k(final View view) {
        final on k = RecyclerView.k(view);
        if (k.x()) {
            this.g.removeDetachedView(view, false);
        }
        if (k.w()) {
            k.p();
        }
        else if (k.B()) {
            k.i();
        }
        this.l(k);
        if (this.g.E != null && !k.u()) {
            this.g.E.b(k);
        }
    }
    
    final void l(final on on) {
        final boolean w = on.w();
        boolean b = true;
        final int n = 1;
        boolean b2 = false;
        if (w || on.a.getParent() != null) {
            final StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(on.w());
            sb.append(" isAttached:");
            if (on.a.getParent() == null) {
                b = false;
            }
            sb.append(b);
            sb.append(this.g.o());
            throw new IllegalArgumentException(sb.toString());
        }
        if (on.x()) {
            final StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(on);
            sb2.append(this.g.o());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!on.A()) {
            final boolean b3 = (on.j & 0x10) == 0x0 && ana.al(on.a);
            int n4 = 0;
            Label_0269: {
                if (on.u()) {
                    if (this.f > 0 && !on.q(526)) {
                        int size;
                        final int n2 = size = this.c.size();
                        if (n2 >= this.f && (size = n2) > 0) {
                            this.j(0);
                            size = n2 - 1;
                        }
                        int n3 = size;
                        if (RecyclerView.c && (n3 = size) > 0) {
                            n3 = size;
                            if (!this.g.W.w(on.c)) {
                                int c;
                                do {
                                    n3 = size - 1;
                                    if (n3 < 0) {
                                        break;
                                    }
                                    c = this.c.get(n3).c;
                                    size = n3;
                                } while (this.g.W.w(c));
                                ++n3;
                            }
                        }
                        this.c.add(n3, on);
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    if (!b2) {
                        this.c(on, true);
                        n4 = n;
                        break Label_0269;
                    }
                }
                n4 = 0;
            }
            this.g.T.h(on);
            if (!b2 && n4 == 0 && b3) {
                apj.e(on.a);
                on.r = null;
                on.q = null;
            }
            return;
        }
        throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.g.o()));
    }
    
    final void m(final View view) {
        final on k = RecyclerView.k(view);
        if (!k.q(12) && k.y()) {
            final nt e = this.g.E;
            if (e != null) {
                if (!e.i(k, k.d())) {
                    if (this.b == null) {
                        this.b = new ArrayList();
                    }
                    k.o(this, true);
                    this.b.add(k);
                    return;
                }
            }
        }
        if (k.t() && !k.v()) {
            final RecyclerView g = this.g;
            if (!g.m.c) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(g.o()));
            }
        }
        k.o(this, false);
        this.a.add(k);
    }
    
    public final void n(final on on) {
        if (on.n) {
            this.b.remove(on);
        }
        else {
            this.a.remove(on);
        }
        on.m = null;
        on.n = false;
        on.i();
    }
    
    public final void o() {
        final nw n = this.g.n;
        int a;
        if (n != null) {
            a = n.A;
        }
        else {
            a = 0;
        }
        this.f = this.e + a;
        int size = this.c.size();
        while (--size >= 0 && this.c.size() > this.f) {
            this.j(size);
        }
    }
    
    final on p(int n, long aw) {
        if (n >= 0 && n < this.g.L.a()) {
            final boolean g = this.g.L.g;
            final boolean b = false;
            on on2 = null;
            int n2 = 0;
            Label_0270: {
                if (g) {
                    final ArrayList b2 = this.b;
                    on on = null;
                    Label_0245: {
                        if (b2 != null) {
                            final int size = b2.size();
                            if (size != 0) {
                                for (int i = 0; i < size; ++i) {
                                    on = this.b.get(i);
                                    if (!on.B() && on.c() == n) {
                                        on.f(32);
                                        break Label_0245;
                                    }
                                }
                                final RecyclerView g2 = this.g;
                                if (g2.m.c) {
                                    final int f = g2.S.f(n);
                                    if (f > 0 && f < this.g.m.a()) {
                                        final long mr = this.g.m.mR(f);
                                        for (int j = 0; j < size; ++j) {
                                            on = (on)this.b.get(j);
                                            if (!on.B() && on.e == mr) {
                                                on.f(32);
                                                break Label_0245;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        on = null;
                    }
                    on2 = on;
                    if (on != null) {
                        n2 = 1;
                        on2 = on;
                        break Label_0270;
                    }
                }
                else {
                    on2 = null;
                }
                n2 = 0;
            }
            int n3 = n2;
            on on3 = on2;
            Label_1055: {
                if (on2 == null) {
                    final int size2 = this.a.size();
                    int k = 0;
                    while (true) {
                    Label_0369:
                        while (true) {
                        Label_0794:
                            while (true) {
                                while (k < size2) {
                                    final on on4 = this.a.get(k);
                                    if (!on4.B() && on4.c() == n && !on4.t() && (this.g.L.g || !on4.v())) {
                                        on4.f(32);
                                        final on l = on4;
                                        n3 = n2;
                                        on3 = l;
                                        if (l != null) {
                                            Label_0945: {
                                                if (l.v()) {
                                                    if (!this.g.L.g) {
                                                        break Label_0945;
                                                    }
                                                }
                                                else {
                                                    final int c = l.c;
                                                    if (c < 0 || c >= this.g.m.a()) {
                                                        final StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                                        sb.append(l);
                                                        sb.append(this.g.o());
                                                        throw new IndexOutOfBoundsException(sb.toString());
                                                    }
                                                    final RecyclerView g3 = this.g;
                                                    if (!g3.L.g && g3.m.d(l.c) != l.f) {
                                                        break Label_0945;
                                                    }
                                                    final nq m = this.g.m;
                                                    if (m.c) {
                                                        if (l.e != m.mR(l.c)) {
                                                            break Label_0945;
                                                        }
                                                    }
                                                }
                                                n3 = 1;
                                                on3 = l;
                                                break Label_1055;
                                            }
                                            l.f(4);
                                            if (l.w()) {
                                                this.g.removeDetachedView(l.a, false);
                                                l.p();
                                            }
                                            else if (l.B()) {
                                                l.i();
                                            }
                                            this.l(l);
                                            on3 = null;
                                            n3 = n2;
                                        }
                                        break Label_1055;
                                    }
                                    else {
                                        ++k;
                                    }
                                }
                                final lo h = this.g.h;
                                final int size3 = h.b.size();
                                int n4 = 0;
                                while (n4 < size3) {
                                    final View view = h.b.get(n4);
                                    final qpt c2 = h.c;
                                    final on k2 = RecyclerView.k(view);
                                    if (k2.c() == n && !k2.t() && !k2.v()) {
                                        if (view == null) {
                                            for (int size4 = this.c.size(), n5 = 0; n5 < size4; ++n5) {
                                                final on on4 = (on)this.c.get(n5);
                                                if (!on4.t() && on4.c() == n && !on4.r()) {
                                                    this.c.remove(n5);
                                                    continue Label_0369;
                                                }
                                            }
                                            final on l = null;
                                            continue Label_0794;
                                        }
                                        final on l = RecyclerView.k(view);
                                        final lo h2 = this.g.h;
                                        final int ai = h2.c.ai(view);
                                        if (ai < 0) {
                                            new StringBuilder("view is not a child, cannot hide ").append(view);
                                            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
                                        }
                                        if (!h2.a.f(ai)) {
                                            new StringBuilder("trying to unhide a view that was not hidden").append(view);
                                            throw new RuntimeException("trying to unhide a view that was not hidden".concat(view.toString()));
                                        }
                                        h2.a.b(ai);
                                        h2.l(view);
                                        final int c3 = this.g.h.c(view);
                                        if (c3 != -1) {
                                            this.g.h.h(c3);
                                            this.m(view);
                                            l.f(8224);
                                            continue Label_0794;
                                        }
                                        final StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                        sb2.append(l);
                                        sb2.append(this.g.o());
                                        throw new IllegalStateException(sb2.toString());
                                    }
                                    else {
                                        ++n4;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        final View view = null;
                        continue;
                    }
                }
            }
            int n6 = n3;
            on ms;
            if ((ms = on3) == null) {
                final int f2 = this.g.S.f(n);
                if (f2 < 0 || f2 >= this.g.m.a()) {
                    final StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid item position ");
                    sb3.append(n);
                    sb3.append("(offset:");
                    sb3.append(f2);
                    sb3.append(").state:");
                    sb3.append(this.g.L.a());
                    sb3.append(this.g.o());
                    throw new IndexOutOfBoundsException(sb3.toString());
                }
                final int d = this.g.m.d(f2);
                final nq m2 = this.g.m;
                int n7 = n3;
                on on5 = on3;
                Label_1414: {
                    if (m2.c) {
                        final long mr2 = m2.mR(f2);
                    Label_1387:
                        while (true) {
                            for (int n8 = this.a.size() - 1; n8 >= 0; --n8) {
                                final on on6 = this.a.get(n8);
                                if (on6.e == mr2 && !on6.B()) {
                                    if (d == on6.f) {
                                        on6.f(32);
                                        on on7 = on6;
                                        if (on6.v()) {
                                            on7 = on6;
                                            if (!this.g.L.g) {
                                                on6.m(2, 14);
                                                on7 = on6;
                                            }
                                        }
                                        n7 = n3;
                                        if ((on5 = on7) != null) {
                                            on7.c = f2;
                                            n7 = 1;
                                            on5 = on7;
                                        }
                                        break Label_1414;
                                    }
                                    else {
                                        this.a.remove(n8);
                                        this.g.removeDetachedView(on6.a, false);
                                        this.h(on6.a);
                                    }
                                }
                            }
                            int n9 = this.c.size() - 1;
                            while (n9 >= 0) {
                                final on on7 = (on)this.c.get(n9);
                                if (on7.e == mr2 && !on7.r()) {
                                    if (d == on7.f) {
                                        this.c.remove(n9);
                                        continue Label_1387;
                                    }
                                    this.j(n9);
                                    break;
                                }
                                else {
                                    --n9;
                                }
                            }
                            on on7 = null;
                            continue Label_1387;
                        }
                    }
                }
                on k3;
                if ((k3 = on5) == null) {
                    k3 = this.q().K(d);
                    if (k3 != null) {
                        k3.l();
                    }
                }
                n6 = n7;
                if ((ms = k3) == null) {
                    final long aw2 = RecyclerView.aw();
                    if (aw != Long.MAX_VALUE) {
                        final long c4 = this.h.J(d).c;
                        if (c4 != 0L) {
                            if (c4 + aw2 >= aw) {
                                return null;
                            }
                        }
                    }
                    final RecyclerView g4 = this.g;
                    ms = g4.m.mS((ViewGroup)g4, d);
                    if (RecyclerView.c) {
                        final RecyclerView l2 = RecyclerView.l(ms.a);
                        if (l2 != null) {
                            ms.b = new WeakReference(l2);
                        }
                    }
                    final long aw3 = RecyclerView.aw();
                    final ob j2 = this.h.J(d);
                    j2.c = agmd.P(j2.c, aw3 - aw2);
                    n6 = n7;
                }
            }
            if (n6 != 0 && !this.g.L.g && ms.q(8192)) {
                ms.m(0, 8192);
                if (this.g.L.j) {
                    nt.p(ms);
                    ms.d();
                    this.g.aF(ms, nt.v(ms));
                }
            }
            Label_2200: {
                Label_1796: {
                    if (this.g.L.g && ms.s()) {
                        ms.g = n;
                    }
                    else if (!ms.s() || ms.z() || ms.t()) {
                        final int f3 = this.g.S.f(n);
                        ms.r = null;
                        ms.q = this.g;
                        final int f4 = ms.f;
                        final long aw4 = RecyclerView.aw();
                        if (aw != Long.MAX_VALUE) {
                            final long d2 = this.h.J(f4).d;
                            if (d2 != 0L && d2 + aw4 >= aw) {
                                break Label_1796;
                            }
                        }
                        final nq m3 = this.g.m;
                        final boolean b3 = ms.r == null;
                        if (b3) {
                            ms.c = f3;
                            if (m3.c) {
                                ms.e = m3.mR(f3);
                            }
                            ms.m(1, 519);
                        }
                        ms.r = m3;
                        ms.d();
                        m3.t(ms, f3);
                        if (b3) {
                            ms.h();
                            final ViewGroup$LayoutParams layoutParams = ms.a.getLayoutParams();
                            if (layoutParams instanceof nx) {
                                ((nx)layoutParams).e = true;
                            }
                        }
                        aw = RecyclerView.aw();
                        final ob j3 = this.h.J(ms.f);
                        j3.d = agmd.P(j3.d, aw - aw4);
                        if (this.g.as()) {
                            final View a = ms.a;
                            if (ana.d(a) == 0) {
                                ana.X(a, 1);
                            }
                            final op p2 = this.g.P;
                            if (p2 != null) {
                                final akv j4 = p2.j();
                                if (j4 instanceof oo) {
                                    final oo oo = (oo)j4;
                                    final akv q = ana.q(a);
                                    if (q != null && q != oo) {
                                        oo.b.put(a, q);
                                    }
                                }
                                ana.N(a, j4);
                            }
                        }
                        if (this.g.L.g) {
                            ms.g = n;
                        }
                        n = 1;
                        break Label_2200;
                    }
                }
                n = 0;
            }
            final ViewGroup$LayoutParams layoutParams2 = ms.a.getLayoutParams();
            Object o;
            if (layoutParams2 == null) {
                o = this.g.generateDefaultLayoutParams();
                ms.a.setLayoutParams((ViewGroup$LayoutParams)o);
            }
            else if (!this.g.checkLayoutParams(layoutParams2)) {
                o = this.g.generateLayoutParams(layoutParams2);
                ms.a.setLayoutParams((ViewGroup$LayoutParams)o);
            }
            else {
                o = layoutParams2;
            }
            final nx nx = (nx)o;
            nx.c = ms;
            boolean f5 = b;
            if (n6 != 0) {
                f5 = b;
                if (n != 0) {
                    f5 = true;
                }
            }
            nx.f = f5;
            return ms;
        }
        final StringBuilder sb4 = new StringBuilder("Invalid item position ");
        sb4.append(n);
        sb4.append("(");
        sb4.append(n);
        sb4.append("). Item count:");
        sb4.append(this.g.L.a());
        sb4.append(this.g.o());
        throw new IndexOutOfBoundsException(sb4.toString());
    }
    
    public final agmd q() {
        if (this.h == null) {
            this.h = new agmd((char[])null, (byte[])null);
            this.e();
        }
        return this.h;
    }
}
