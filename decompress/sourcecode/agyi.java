import java.util.List;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agyi implements ahbk
{
    public final agyh a;
    public int b;
    public int c;
    private int d;
    
    private agyi(final agyh a) {
        this.c = 0;
        agzz.i((Object)a, "input");
        this.a = a;
        a.d = this;
    }
    
    private final void Q(final Object o, final ahbp ahbp, final ExtensionRegistryLite extensionRegistryLite) {
        final int d = this.d;
        this.d = ahco.c(ahco.a(this.b), 4);
        try {
            ahbp.h(o, (ahbk)this, extensionRegistryLite);
            if (this.b == this.d) {
                return;
            }
            throw ahab.g();
        }
        finally {
            this.d = d;
        }
    }
    
    private final void R(final Object o, final ahbp ahbp, final ExtensionRegistryLite extensionRegistryLite) {
        final int o2 = this.a.o();
        final agyh a = this.a;
        if (a.a < a.b) {
            final int f = a.f(o2);
            final agyh a2 = this.a;
            ++a2.a;
            ahbp.h(o, (ahbk)this, extensionRegistryLite);
            this.a.B(0);
            final agyh a3 = this.a;
            --a3.a;
            a3.C(f);
            return;
        }
        throw ahab.h();
    }
    
    private final void S(final int n) {
        if (this.a.e() == n) {
            return;
        }
        throw ahab.j();
    }
    
    private static final void T(final int n) {
        if ((n & 0x3) == 0x0) {
            return;
        }
        throw ahab.g();
    }
    
    private static final void U(final int n) {
        if ((n & 0x7) == 0x0) {
            return;
        }
        throw ahab.g();
    }
    
    public static agyi p(final agyh agyh) {
        final agyi d = agyh.d;
        if (d != null) {
            return d;
        }
        return new agyi(agyh);
    }
    
    public final void A(final List list) {
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    agzj.g(this.a.g());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    agzj.g(this.a.g());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.g());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.g());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void B(final List list) {
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            final int b = ahco.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    int i;
                    do {
                        agzj.g(this.a.h());
                        if (this.a.E()) {
                            return;
                        }
                        i = this.a.n();
                    } while (i == this.b);
                    this.c = i;
                    return;
                }
                throw ahab.a();
            }
            else {
                final int o = this.a.o();
                T(o);
                do {
                    agzj.g(this.a.h());
                } while (this.a.e() < this.a.e() + o);
            }
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 != 2) {
                if (b2 == 5) {
                    int j;
                    do {
                        list.add(this.a.h());
                        if (this.a.E()) {
                            return;
                        }
                        j = this.a.n();
                    } while (j == this.b);
                    this.c = j;
                    return;
                }
                throw ahab.a();
            }
            else {
                final int o2 = this.a.o();
                T(o2);
                do {
                    list.add(this.a.h());
                } while (this.a.e() < this.a.e() + o2);
            }
        }
    }
    
    public final void C(final List list) {
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            final int b = ahco.b(this.b);
            if (b == 1) {
                int i;
                do {
                    ahan.f(this.a.p());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b != 2) {
                throw ahab.a();
            }
            final int o = this.a.o();
            U(o);
            do {
                ahan.f(this.a.p());
            } while (this.a.e() < this.a.e() + o);
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 1) {
                int j;
                do {
                    list.add(this.a.p());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 != 2) {
                throw ahab.a();
            }
            final int o2 = this.a.o();
            U(o2);
            do {
                list.add(this.a.p());
            } while (this.a.e() < this.a.e() + o2);
        }
    }
    
    public final void D(final List list) {
        if (list instanceof agyy) {
            final agyy agyy = (agyy)list;
            final int b = ahco.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    int i;
                    do {
                        agyy.h(this.a.c());
                        if (this.a.E()) {
                            return;
                        }
                        i = this.a.n();
                    } while (i == this.b);
                    this.c = i;
                    return;
                }
                throw ahab.a();
            }
            else {
                final int o = this.a.o();
                T(o);
                do {
                    agyy.h(this.a.c());
                } while (this.a.e() < this.a.e() + o);
            }
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 != 2) {
                if (b2 == 5) {
                    int j;
                    do {
                        list.add(this.a.c());
                        if (this.a.E()) {
                            return;
                        }
                        j = this.a.n();
                    } while (j == this.b);
                    this.c = j;
                    return;
                }
                throw ahab.a();
            }
            else {
                final int o2 = this.a.o();
                T(o2);
                do {
                    list.add(this.a.c());
                } while (this.a.e() < this.a.e() + o2);
            }
        }
    }
    
    public final void E(final List list) {
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    agzj.g(this.a.i());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    agzj.g(this.a.i());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.i());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.i());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void F(final List list) {
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    ahan.f(this.a.q());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    ahan.f(this.a.q());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.q());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.q());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void G(final List list) {
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            final int b = ahco.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    int i;
                    do {
                        agzj.g(this.a.l());
                        if (this.a.E()) {
                            return;
                        }
                        i = this.a.n();
                    } while (i == this.b);
                    this.c = i;
                    return;
                }
                throw ahab.a();
            }
            else {
                final int o = this.a.o();
                T(o);
                do {
                    agzj.g(this.a.l());
                } while (this.a.e() < this.a.e() + o);
            }
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 != 2) {
                if (b2 == 5) {
                    int j;
                    do {
                        list.add(this.a.l());
                        if (this.a.E()) {
                            return;
                        }
                        j = this.a.n();
                    } while (j == this.b);
                    this.c = j;
                    return;
                }
                throw ahab.a();
            }
            else {
                final int o2 = this.a.o();
                T(o2);
                do {
                    list.add(this.a.l());
                } while (this.a.e() < this.a.e() + o2);
            }
        }
    }
    
    public final void H(final List list) {
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            final int b = ahco.b(this.b);
            if (b == 1) {
                int i;
                do {
                    ahan.f(this.a.u());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b != 2) {
                throw ahab.a();
            }
            final int o = this.a.o();
            U(o);
            do {
                ahan.f(this.a.u());
            } while (this.a.e() < this.a.e() + o);
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 1) {
                int j;
                do {
                    list.add(this.a.u());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 != 2) {
                throw ahab.a();
            }
            final int o2 = this.a.o();
            U(o2);
            do {
                list.add(this.a.u());
            } while (this.a.e() < this.a.e() + o2);
        }
    }
    
    public final void I(final List list) {
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    agzj.g(this.a.m());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    agzj.g(this.a.m());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.m());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.m());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void J(final List list) {
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    ahan.f(this.a.v());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    ahan.f(this.a.v());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.v());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.v());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void K(final List list, final boolean b) {
        if (ahco.b(this.b) == 2) {
            if (list instanceof ahaj) {
                if (!b) {
                    final ahaj ahaj = (ahaj)list;
                    int i;
                    do {
                        ahaj.i(this.o());
                        if (this.a.E()) {
                            return;
                        }
                        i = this.a.n();
                    } while (i == this.b);
                    this.c = i;
                    return;
                }
            }
            int j;
            do {
                String s;
                if (b) {
                    s = this.v();
                }
                else {
                    s = this.u();
                }
                list.add(s);
                if (this.a.E()) {
                    return;
                }
                j = this.a.n();
            } while (j == this.b);
            this.c = j;
            return;
        }
        throw ahab.a();
    }
    
    public final void L(final List list) {
        if (list instanceof agzj) {
            final agzj agzj = (agzj)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    agzj.g(this.a.o());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    agzj.g(this.a.o());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.o());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.o());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void M(final List list) {
        if (list instanceof ahan) {
            final ahan ahan = (ahan)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    ahan.f(this.a.w());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    ahan.f(this.a.w());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.w());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.w());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void N(final int n) {
        if (ahco.b(this.b) == n) {
            return;
        }
        throw ahab.a();
    }
    
    public final boolean O() {
        this.N(0);
        return this.a.F();
    }
    
    public final boolean P() {
        if (!this.a.E()) {
            final int b = this.b;
            if (b != this.d) {
                return this.a.G(b);
            }
        }
        return false;
    }
    
    public final double a() {
        this.N(1);
        return this.a.b();
    }
    
    public final float b() {
        this.N(5);
        return this.a.c();
    }
    
    public final int c() {
        int n = this.c;
        if (n != 0) {
            this.b = n;
            this.c = 0;
        }
        else {
            n = this.a.n();
            this.b = n;
        }
        if (n != 0 && n != this.d) {
            return ahco.a(n);
        }
        return Integer.MAX_VALUE;
    }
    
    public final int d() {
        this.N(0);
        return this.a.g();
    }
    
    public final int e() {
        this.N(5);
        return this.a.h();
    }
    
    public final int f() {
        this.N(0);
        return this.a.i();
    }
    
    public final int g() {
        this.N(5);
        return this.a.l();
    }
    
    public final int h() {
        this.N(0);
        return this.a.m();
    }
    
    public final int i() {
        this.N(0);
        return this.a.o();
    }
    
    public final long j() {
        this.N(1);
        return this.a.p();
    }
    
    public final long k() {
        this.N(0);
        return this.a.q();
    }
    
    public final long l() {
        this.N(1);
        return this.a.u();
    }
    
    public final long m() {
        this.N(0);
        return this.a.v();
    }
    
    public final long n() {
        this.N(0);
        return this.a.w();
    }
    
    public final agyc o() {
        this.N(2);
        return this.a.x();
    }
    
    public final Object q(final ahcm ahcm, final Class clazz, final ExtensionRegistryLite extensionRegistryLite) {
        final ahcm a = ahcm.a;
        switch (ahcm.ordinal()) {
            default: {
                throw new IllegalArgumentException("unsupported field type.");
            }
            case 17: {
                return this.m();
            }
            case 16: {
                return this.h();
            }
            case 15: {
                return this.l();
            }
            case 14: {
                return this.g();
            }
            case 13: {
                return this.d();
            }
            case 12: {
                return this.i();
            }
            case 11: {
                return this.o();
            }
            case 10: {
                return this.t(clazz, extensionRegistryLite);
            }
            case 8: {
                return this.v();
            }
            case 7: {
                return this.O();
            }
            case 6: {
                return this.e();
            }
            case 5: {
                return this.j();
            }
            case 4: {
                return this.f();
            }
            case 3: {
                return this.n();
            }
            case 2: {
                return this.k();
            }
            case 1: {
                return this.b();
            }
            case 0: {
                return this.a();
            }
        }
    }
    
    public final Object r(final ahbp ahbp, final ExtensionRegistryLite extensionRegistryLite) {
        final Object e = ahbp.e();
        this.Q(e, ahbp, extensionRegistryLite);
        ahbp.f(e);
        return e;
    }
    
    public final Object s(final ahbp ahbp, final ExtensionRegistryLite extensionRegistryLite) {
        final Object e = ahbp.e();
        this.R(e, ahbp, extensionRegistryLite);
        ahbp.f(e);
        return e;
    }
    
    public final Object t(final Class clazz, final ExtensionRegistryLite extensionRegistryLite) {
        this.N(2);
        return this.s(ahbh.a.a(clazz), extensionRegistryLite);
    }
    
    public final String u() {
        this.N(2);
        return this.a.z();
    }
    
    public final String v() {
        this.N(2);
        return this.a.A();
    }
    
    public final void w(final Object o, final ahbp ahbp, final ExtensionRegistryLite extensionRegistryLite) {
        this.N(3);
        this.Q(o, ahbp, extensionRegistryLite);
    }
    
    public final void x(final Object o, final ahbp ahbp, final ExtensionRegistryLite extensionRegistryLite) {
        this.N(2);
        this.R(o, ahbp, extensionRegistryLite);
    }
    
    public final void y(final List list) {
        if (list instanceof agxt) {
            final agxt agxt = (agxt)list;
            final int b = ahco.b(this.b);
            if (b == 0) {
                int i;
                do {
                    agxt.f(this.a.F());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b == 2) {
                final int n = this.a.e() + this.a.o();
                do {
                    agxt.f(this.a.F());
                } while (this.a.e() < n);
                this.S(n);
                return;
            }
            throw ahab.a();
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.F());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 == 2) {
                final int n2 = this.a.e() + this.a.o();
                do {
                    list.add(this.a.F());
                } while (this.a.e() < n2);
                this.S(n2);
                return;
            }
            throw ahab.a();
        }
    }
    
    public final void z(final List list) {
        if (list instanceof agyn) {
            final agyn agyn = (agyn)list;
            final int b = ahco.b(this.b);
            if (b == 1) {
                int i;
                do {
                    agyn.f(this.a.b());
                    if (this.a.E()) {
                        return;
                    }
                    i = this.a.n();
                } while (i == this.b);
                this.c = i;
                return;
            }
            if (b != 2) {
                throw ahab.a();
            }
            final int o = this.a.o();
            U(o);
            do {
                agyn.f(this.a.b());
            } while (this.a.e() < this.a.e() + o);
        }
        else {
            final int b2 = ahco.b(this.b);
            if (b2 == 1) {
                int j;
                do {
                    list.add(this.a.b());
                    if (this.a.E()) {
                        return;
                    }
                    j = this.a.n();
                } while (j == this.b);
                this.c = j;
                return;
            }
            if (b2 != 2) {
                throw ahab.a();
            }
            final int o2 = this.a.o();
            U(o2);
            do {
                list.add(this.a.b());
            } while (this.a.e() < this.a.e() + o2);
        }
    }
}
