import java.util.List;
import java.util.Collection;
import android.support.v7.widget.RecyclerView;
import android.os.Looper;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abey
{
    public final ArrayList a;
    public final ArrayList b;
    public int c;
    public final Object d;
    private final Object e;
    private final Object f;
    
    public abey(final aaca e, final String d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.e = e;
        this.d = d;
        this.f = new abeu(this, Looper.getMainLooper());
    }
    
    public abey(final qpt f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.d = new akr(30);
        this.b = new ArrayList();
        this.a = new ArrayList();
        this.c = 0;
        this.f = f;
        this.e = new bx(this, (byte[])null);
    }
    
    public static final void e(final ArrayList list, final ArrayList list2) {
        if (list2.isEmpty()) {
            return;
        }
        if (list.isEmpty()) {
            list.add(list2.remove(0));
        }
        if (((abev)adwd.aK(list)).c()) {
            while (!list2.isEmpty() && list2.get(0).c()) {
                list.add(list2.remove(0));
            }
        }
    }
    
    private final boolean r() {
        if (this.a.isEmpty()) {
            return false;
        }
        if (adwd.aO(this.a, aacc.e)) {
            return true;
        }
        final abeu abeu = (abeu)this.f;
        return !abeu.hasMessages(1) && !abeu.hasMessages(2);
    }
    
    private final int s(int n, int size) {
        int size2 = this.a.size();
        while (true) {
            final int n2 = size2 - 1;
            if (n2 < 0) {
                break;
            }
            final jy jy = this.a.get(n2);
            final int a = jy.a;
            if (a == 8) {
                final int b = jy.b;
                final int d = jy.d;
                int n3;
                if (b < d) {
                    n3 = d;
                }
                else {
                    n3 = b;
                }
                int n4;
                if (b < d) {
                    n4 = b;
                }
                else {
                    n4 = d;
                }
                if (n >= n4 && n <= n3) {
                    if (n4 == b) {
                        if (size == 1) {
                            jy.d = d + 1;
                        }
                        else if (size == 2) {
                            jy.d = d - 1;
                        }
                        ++n;
                        size2 = n2;
                    }
                    else {
                        if (size == 1) {
                            jy.b = b + 1;
                        }
                        else if (size == 2) {
                            jy.b = b - 1;
                        }
                        --n;
                        size2 = n2;
                    }
                }
                else {
                    size2 = n2;
                    if (n >= b) {
                        continue;
                    }
                    if (size == 1) {
                        jy.b = b + 1;
                        jy.d = d + 1;
                        size2 = n2;
                    }
                    else {
                        size2 = n2;
                        if (size != 2) {
                            continue;
                        }
                        jy.b = b - 1;
                        jy.d = d - 1;
                        size2 = n2;
                    }
                }
            }
            else {
                final int b2 = jy.b;
                if (b2 <= n) {
                    if (a == 1) {
                        n -= jy.d;
                        size2 = n2;
                    }
                    else {
                        size2 = n2;
                        if (a != 2) {
                            continue;
                        }
                        n += jy.d;
                        size2 = n2;
                    }
                }
                else if (size == 1) {
                    jy.b = b2 + 1;
                    size2 = n2;
                }
                else {
                    size2 = n2;
                    if (size != 2) {
                        continue;
                    }
                    jy.b = b2 - 1;
                    size2 = n2;
                }
            }
        }
        size = this.a.size();
        while (--size >= 0) {
            final jy jy2 = this.a.get(size);
            if (jy2.a == 8) {
                final int d2 = jy2.d;
                if (d2 != jy2.b && d2 >= 0) {
                    continue;
                }
                this.a.remove(size);
                this.m(jy2);
            }
            else {
                if (jy2.d > 0) {
                    continue;
                }
                this.a.remove(size);
                this.m(jy2);
            }
        }
        return n;
    }
    
    private final void t(jy h) {
        final int a = h.a;
        if (a != 1 && a != 8) {
            int s = this.s(h.b, a);
            int b = h.b;
            final int a2 = h.a;
            int n;
            if (a2 != 2) {
                if (a2 != 4) {
                    new StringBuilder("op should be remove or update.").append(h);
                    throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(h)));
                }
                n = 1;
            }
            else {
                n = 0;
            }
            int i = 1;
            int n2 = 1;
            while (i < h.d) {
                final int s2 = this.s(h.b + n * i, h.a);
                final int a3 = h.a;
                Label_0237: {
                    Label_0182: {
                        boolean b2 = false;
                        Label_0171: {
                            Label_0168: {
                                if (a3 != 2) {
                                    if (a3 != 4) {
                                        break Label_0182;
                                    }
                                    if (s2 != s + 1) {
                                        break Label_0168;
                                    }
                                }
                                else if (s2 != s) {
                                    break Label_0168;
                                }
                                b2 = true;
                                break Label_0171;
                            }
                            b2 = false;
                        }
                        if (b2) {
                            ++n2;
                            break Label_0237;
                        }
                    }
                    final jy h2 = this.h(a3, s, n2, h.c);
                    this.k(h2, b);
                    this.m(h2);
                    int n3 = b;
                    if (h.a == 4) {
                        n3 = b + n2;
                    }
                    final int n4 = s2;
                    n2 = 1;
                    b = n3;
                    s = n4;
                }
                ++i;
            }
            final Object c = h.c;
            this.m(h);
            if (n2 > 0) {
                h = this.h(h.a, s, n2, c);
                this.k(h, b);
                this.m(h);
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }
    
    private final void u(final jy jy) {
        this.a.add(jy);
        final int a = jy.a;
        if (a == 1) {
            ((qpt)this.f).ae(jy.b, jy.d);
            return;
        }
        if (a == 2) {
            final Object f = this.f;
            final int b = jy.b;
            final int d = jy.d;
            final qpt qpt = (qpt)f;
            ((RecyclerView)qpt.a).P(b, d, false);
            ((RecyclerView)qpt.a).M = true;
            return;
        }
        if (a == 4) {
            ((qpt)this.f).ad(jy.b, jy.d, jy.c);
            return;
        }
        if (a == 8) {
            ((qpt)this.f).af(jy.b, jy.d);
            return;
        }
        new StringBuilder("Unknown update op type for ").append(jy);
        throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(jy)));
    }
    
    private final boolean v(final int n) {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final jy jy = this.a.get(i);
            final int a = jy.a;
            if (a == 8) {
                if (this.g(jy.d, i + 1) == n) {
                    return true;
                }
            }
            else if (a == 1) {
                for (int b = jy.b, d = jy.d, j = b; j < d + b; ++j) {
                    if (this.g(j, i + 1) == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final void a(final abev abev) {
        if (abev.c() && (adwd.aO(this.a, aacc.d) || adwd.aO(this.b, aacc.d))) {
            return;
        }
        final abev abev2 = (abev)adwd.aS(this.a);
        if (abev2 != null && abev2.b(abev)) {
            final ArrayList a = this.a;
            a.remove(a.size() - 1);
        }
        final boolean r = this.r();
        this.a.add(abev);
        if (!abev.c() || this.a.size() > 6) {
            this.d();
            return;
        }
        if (r) {
            return;
        }
        if (this.a.size() == 1) {
            ((abeu)this.f).a(1, 8000);
        }
        ((abeu)this.f).a(2, 3000);
    }
    
    public final void b() {
        this.b.clear();
        if (this.r()) {
            this.d();
        }
    }
    
    public final void c(final ArrayList list) {
        if (list.isEmpty()) {
            return;
        }
        final vse k = ((aaca)this.e).k();
        final abev abev = list.get(0);
        k.a = (String)abev.f.d;
        k.c = abev.c;
        if (!abev.d.H()) {
            ((vii)k).j(abev.d);
        }
        else {
            ((vii)k).i();
        }
        abev.a(k);
        for (int i = 1; i < list.size(); ++i) {
            ((abev)list.get(i)).a(k);
        }
        ((aaca)this.e).l((vjn)k, (znj)new abew(this, abev.e));
    }
    
    final void d() {
        ((abeu)this.f).removeCallbacksAndMessages((Object)null);
        if (!this.b.isEmpty()) {
            return;
        }
        final ArrayList list = new ArrayList();
        e(list, this.a);
        this.c(list);
        this.b.addAll(list);
    }
    
    public final int f(final int n) {
        return this.g(n, 0);
    }
    
    final int g(int n, int n2) {
        final int size = this.a.size();
        int i = n2;
        n2 = n;
        while (i < size) {
            final jy jy = this.a.get(i);
            final int a = jy.a;
            if (a == 8) {
                n = jy.b;
                if (n == n2) {
                    n = jy.d;
                }
                else {
                    int n3;
                    if (n < (n3 = n2)) {
                        n3 = n2 - 1;
                    }
                    if (jy.d <= (n = n3)) {
                        n = n3 + 1;
                    }
                }
            }
            else {
                final int b = jy.b;
                if (b <= (n = n2)) {
                    if (a == 2) {
                        n = jy.d;
                        if (n2 < b + n) {
                            return -1;
                        }
                        n = n2 - n;
                    }
                    else {
                        n = n2;
                        if (a == 1) {
                            n = n2 + jy.d;
                        }
                    }
                }
            }
            ++i;
            n2 = n;
        }
        return n2;
    }
    
    public final jy h(final int a, final int b, final int d, final Object c) {
        final jy jy = (jy)((akq)this.d).a();
        jy jy2;
        if (jy == null) {
            jy2 = new jy(a, b, d, c);
        }
        else {
            jy.a = a;
            jy.b = b;
            jy.d = d;
            jy.c = c;
            jy2 = jy;
        }
        return jy2;
    }
    
    public final void i() {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            ((qpt)this.f).ac((jy)this.a.get(i));
        }
        this.n(this.a);
        this.c = 0;
    }
    
    public final void j() {
        this.i();
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final jy jy = this.b.get(i);
            final int a = jy.a;
            if (a != 1) {
                if (a != 2) {
                    if (a != 4) {
                        if (a == 8) {
                            ((qpt)this.f).ac(jy);
                            ((qpt)this.f).af(jy.b, jy.d);
                        }
                    }
                    else {
                        ((qpt)this.f).ac(jy);
                        ((qpt)this.f).ad(jy.b, jy.d, jy.c);
                    }
                }
                else {
                    ((qpt)this.f).ac(jy);
                    ((qpt)this.f).ag(jy.b, jy.d);
                }
            }
            else {
                ((qpt)this.f).ac(jy);
                ((qpt)this.f).ae(jy.b, jy.d);
            }
        }
        this.n(this.b);
        this.c = 0;
    }
    
    final void k(final jy jy, final int n) {
        ((qpt)this.f).ac(jy);
        final int a = jy.a;
        if (a == 2) {
            ((qpt)this.f).ag(n, jy.d);
            return;
        }
        if (a == 4) {
            ((qpt)this.f).ad(n, jy.d, jy.c);
            return;
        }
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }
    
    public final void l() {
        final Object e = this.e;
        final ArrayList b = this.b;
    Label_1180:
        while (true) {
            int i = b.size();
            final int n = -1;
            --i;
            boolean b2 = false;
            int n2 = 0;
            while (true) {
                while (i >= 0) {
                    if (((jy)b.get(i)).a == 8) {
                        if (n2 != 0) {
                            final int n3 = i;
                            jy h = null;
                            Object h2 = null;
                            if (n3 == -1) {
                                break Label_1180;
                            }
                            final int n4 = n3 + 1;
                            final jy jy = (jy)b.get(n3);
                            final jy jy2 = (jy)b.get(n4);
                            final int a = jy2.a;
                            if (a == 1) {
                                final int d = jy.d;
                                final int b3 = jy2.b;
                                int n5;
                                if (d < b3) {
                                    n5 = n;
                                }
                                else {
                                    n5 = 0;
                                }
                                final int b4 = jy.b;
                                int n6 = n5;
                                if (b4 < b3) {
                                    n6 = n5 + 1;
                                }
                                if (b3 <= b4) {
                                    jy.b = b4 + jy2.d;
                                }
                                final int b5 = jy2.b;
                                if (b5 <= d) {
                                    jy.d = d + jy2.d;
                                }
                                jy2.b = b5 + n6;
                                b.set(n3, jy2);
                                b.set(n4, jy);
                                continue Label_1180;
                            }
                            if (a != 2) {
                                if (a != 4) {
                                    continue Label_1180;
                                }
                                final int d2 = jy.d;
                                final int b6 = jy2.b;
                                Object h3 = null;
                                Label_0243: {
                                    if (d2 < b6) {
                                        jy2.b = b6 - 1;
                                    }
                                    else {
                                        final int d3 = jy2.d;
                                        if (d2 < b6 + d3) {
                                            jy2.d = d3 - 1;
                                            h3 = ((abey)((bx)e).a).h(4, jy.b, 1, jy2.c);
                                            break Label_0243;
                                        }
                                    }
                                    h3 = null;
                                }
                                final int b7 = jy.b;
                                final int b8 = jy2.b;
                                if (b7 <= b8) {
                                    jy2.b = b8 + 1;
                                }
                                else {
                                    final int n7 = b8 + jy2.d;
                                    if (b7 < n7) {
                                        final int n8 = n7 - b7;
                                        h2 = ((abey)((bx)e).a).h(4, b7 + 1, n8, jy2.c);
                                        jy2.d -= n8;
                                    }
                                }
                                b.set(n4, jy);
                                if (jy2.d > 0) {
                                    b.set(n3, jy2);
                                }
                                else {
                                    b.remove(n3);
                                    ((abey)((bx)e).a).m(jy2);
                                }
                                if (h3 != null) {
                                    b.add(n3, h3);
                                }
                                if (h2 != null) {
                                    b.add(n3, h2);
                                    continue Label_1180;
                                }
                                continue Label_1180;
                            }
                            else {
                                final int b9 = jy.b;
                                final int d4 = jy.d;
                                boolean b10 = false;
                                Label_0517: {
                                    if (b9 < d4) {
                                        if (jy2.b != b9 || jy2.d != d4 - b9) {
                                            b10 = false;
                                            break Label_0517;
                                        }
                                        b10 = false;
                                    }
                                    else {
                                        if (jy2.b != d4 + 1 || jy2.d != b9 - d4) {
                                            b10 = true;
                                            break Label_0517;
                                        }
                                        b10 = true;
                                    }
                                    b2 = true;
                                }
                                final int b11 = jy2.b;
                                int b12;
                                if (d4 < b11) {
                                    b12 = b11 - 1;
                                    jy2.b = b12;
                                }
                                else {
                                    final int d5 = jy2.d;
                                    b12 = b11;
                                    if (d4 < b11 + d5) {
                                        jy2.d = d5 - 1;
                                        jy.a = 2;
                                        jy.d = 1;
                                        if (jy2.d == 0) {
                                            b.remove(n4);
                                            ((abey)((bx)e).a).m(jy2);
                                            continue Label_1180;
                                        }
                                        continue Label_1180;
                                    }
                                }
                                final int b13 = jy.b;
                                if (b13 <= b12) {
                                    jy2.b = b12 + 1;
                                }
                                else {
                                    final int n9 = b12 + jy2.d;
                                    if (b13 < n9) {
                                        h = ((abey)((bx)e).a).h(2, b13 + 1, n9 - b13, null);
                                        jy2.d = jy.b - jy2.b;
                                    }
                                }
                                if (b2) {
                                    b.set(n3, jy2);
                                    b.remove(n4);
                                    ((abey)((bx)e).a).m(jy);
                                    continue Label_1180;
                                }
                                if (b10) {
                                    if (h != null) {
                                        final int b14 = jy.b;
                                        if (b14 > h.b) {
                                            jy.b = b14 - h.d;
                                        }
                                        final int d6 = jy.d;
                                        if (d6 > h.b) {
                                            jy.d = d6 - h.d;
                                        }
                                    }
                                    final int b15 = jy.b;
                                    if (b15 > jy2.b) {
                                        jy.b = b15 - jy2.d;
                                    }
                                    final int d7 = jy.d;
                                    if (d7 > jy2.b) {
                                        jy.d = d7 - jy2.d;
                                    }
                                }
                                else {
                                    if (h != null) {
                                        final int b16 = jy.b;
                                        if (b16 >= h.b) {
                                            jy.b = b16 - h.d;
                                        }
                                        final int d8 = jy.d;
                                        if (d8 >= h.b) {
                                            jy.d = d8 - h.d;
                                        }
                                    }
                                    final int b17 = jy.b;
                                    if (b17 >= jy2.b) {
                                        jy.b = b17 - jy2.d;
                                    }
                                    final int d9 = jy.d;
                                    if (d9 >= jy2.b) {
                                        jy.d = d9 - jy2.d;
                                    }
                                }
                                b.set(n3, jy2);
                                if (jy.b != jy.d) {
                                    b.set(n4, jy);
                                }
                                else {
                                    b.remove(n4);
                                }
                                if (h != null) {
                                    b.add(n3, h);
                                    continue Label_1180;
                                }
                                continue Label_1180;
                            }
                        }
                        else {
                            n2 = 0;
                        }
                    }
                    else {
                        n2 = 1;
                    }
                    --i;
                }
                final int n3 = -1;
                continue;
            }
        }
        for (int size = this.b.size(), j = 0; j < size; ++j) {
            final jy jy3 = this.b.get(j);
            final int a2 = jy3.a;
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 != 4) {
                        if (a2 == 8) {
                            this.u(jy3);
                        }
                    }
                    else {
                        final int b18 = jy3.b;
                        final int d10 = jy3.d;
                        int n10 = b18;
                        int n11 = 0;
                        int n12 = -1;
                        int n17;
                        for (int k = b18; k < d10 + b18; ++k, n12 = n17) {
                            int n16;
                            if (((qpt)this.f).ab(k) == null && !this.v(k)) {
                                int n13 = n10;
                                int n14 = n11;
                                if (n12 == 1) {
                                    this.u(this.h(4, n10, n11, jy3.c));
                                    n13 = k;
                                    n14 = 0;
                                }
                                final int n15 = 0;
                                n10 = n13;
                                n16 = n14;
                                n17 = n15;
                            }
                            else {
                                int n18 = n10;
                                n16 = n11;
                                if (n12 == 0) {
                                    this.t(this.h(4, n10, n11, jy3.c));
                                    n18 = k;
                                    n16 = 0;
                                }
                                n17 = 1;
                                n10 = n18;
                            }
                            n11 = n16 + 1;
                        }
                        jy h4 = jy3;
                        if (n11 != jy3.d) {
                            final Object c = jy3.c;
                            this.m(jy3);
                            h4 = this.h(4, n10, n11, c);
                        }
                        if (n12 == 0) {
                            this.t(h4);
                        }
                        else {
                            this.u(h4);
                        }
                    }
                }
                else {
                    final int b19 = jy3.b;
                    int n19 = jy3.d + b19;
                    int l = b19;
                    int n20 = 0;
                    int n21 = -1;
                    while (l < n19) {
                        boolean b21;
                        if (((qpt)this.f).ab(l) == null && !this.v(l)) {
                            boolean b20;
                            if (n21 == 1) {
                                this.u(this.h(2, b19, n20, null));
                                b20 = true;
                            }
                            else {
                                b20 = false;
                            }
                            final int n22 = 0;
                            b21 = b20;
                            n21 = n22;
                        }
                        else {
                            if (n21 == 0) {
                                this.t(this.h(2, b19, n20, null));
                                b21 = true;
                            }
                            else {
                                b21 = false;
                            }
                            n21 = 1;
                        }
                        int n23;
                        if (b21) {
                            l -= n20;
                            n19 -= n20;
                            n23 = 1;
                        }
                        else {
                            n23 = n20 + 1;
                        }
                        ++l;
                        n20 = n23;
                    }
                    jy h5 = jy3;
                    if (n20 != jy3.d) {
                        this.m(jy3);
                        h5 = this.h(2, b19, n20, null);
                    }
                    if (n21 == 0) {
                        this.t(h5);
                    }
                    else {
                        this.u(h5);
                    }
                }
            }
            else {
                this.u(jy3);
            }
        }
        this.b.clear();
    }
    
    public final void m(final jy jy) {
        jy.c = null;
        ((akq)this.d).b((Object)jy);
    }
    
    final void n(final List list) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            this.m((jy)list.get(i));
        }
        list.clear();
    }
    
    public final void o() {
        this.n(this.b);
        this.n(this.a);
        this.c = 0;
    }
    
    public final boolean p(final int n) {
        return (n & this.c) != 0x0;
    }
    
    public final boolean q() {
        return this.b.size() > 0;
    }
}
