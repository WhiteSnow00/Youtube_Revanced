import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import java.util.Arrays;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import android.net.Uri;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import android.os.Handler;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boo implements bnv, btm, brj, brm, bou
{
    public static final Map a;
    public static final ayg b;
    private bon[] A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private long G;
    private long H;
    private boolean I;
    private int J;
    private final brf K;
    private final gpj L;
    private des M;
    private final ttl N;
    public final bol c;
    public final long d;
    public final bro e;
    public final Runnable f;
    public final Runnable g;
    public final Handler h;
    public bnu i;
    public IcyHeaders j;
    public bov[] k;
    public boolean l;
    public bua m;
    public long n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    private final Uri u;
    private final bbl v;
    private final bks w;
    private final bri x;
    private final bnz y;
    private final boj z;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final ayf ayf = new ayf();
        ayf.a = "icy";
        ayf.k = "application/x-icy";
        b = ayf.a();
    }
    
    public boo(final Uri u, final bbl v, final boj z, final bks w, final ttl n, final bri x, final bnz y, final bol c, final brf k, final int n2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.u = u;
        this.v = v;
        this.w = w;
        this.N = n;
        this.x = x;
        this.y = y;
        this.c = c;
        this.K = k;
        this.d = n2;
        this.e = new bro("ProgressiveMediaPeriod");
        this.z = z;
        this.L = new gpj((byte[])null);
        this.f = (Runnable)new aus(this, 12);
        this.g = (Runnable)new aus(this, 13);
        this.h = bax.E();
        this.A = new bon[0];
        this.k = new bov[0];
        this.H = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.p = 1;
    }
    
    private final void A() {
        dk.h(this.l);
        dk.d((Object)this.M);
        dk.d((Object)this.m);
    }
    
    private final void B() {
        final bok bok = new bok(this, this.u, this.v, this.z, (btm)this, this.L, (byte[])null);
        if (this.l) {
            dk.h(this.C());
            final long n = this.n;
            if (n != -9223372036854775807L && this.H > n) {
                this.r = true;
                this.H = -9223372036854775807L;
                return;
            }
            final bua m = this.m;
            dk.d((Object)m);
            bok.c(m.b(this.H).a.c, this.H);
            final bov[] k = this.k;
            for (int length = k.length, i = 0; i < length; ++i) {
                k[i].d = this.H;
            }
            this.H = -9223372036854775807L;
        }
        this.J = this.z();
        this.e.h((brl)bok, (brj)this, this.x.a(this.p));
        this.y.n(new bno(bok.a, bok.d), 1, -1, null, 0, null, bok.c, this.n);
    }
    
    private final boolean C() {
        return this.H != -9223372036854775807L;
    }
    
    private final int z() {
        final bov[] k = this.k;
        final int length = k.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += k[i].i();
            ++i;
        }
        return n;
    }
    
    public final long a(final long n, final bfv bfv) {
        this.A();
        if (!this.m.c()) {
            return 0L;
        }
        final bty b = this.m.b(n);
        return bfv.a(n, b.a.b, b.b.b);
    }
    
    public final long c() {
        this.A();
        if (this.r || this.F == 0) {
            return Long.MIN_VALUE;
        }
        if (this.C()) {
            return this.H;
        }
        long n3;
        if (this.C) {
            final int length = this.k.length;
            long n = Long.MAX_VALUE;
            int n2 = 0;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                final des m = this.M;
                long min = n;
                if (((boolean[])m.c)[n2]) {
                    min = n;
                    if (((boolean[])m.b)[n2]) {
                        min = n;
                        if (!this.k[n2].z()) {
                            min = Math.min(n, this.k[n2].m());
                        }
                    }
                }
                ++n2;
                n = min;
            }
        }
        else {
            n3 = Long.MAX_VALUE;
        }
        long k = n3;
        if (n3 == Long.MAX_VALUE) {
            k = this.k(false);
        }
        if (k == Long.MIN_VALUE) {
            return this.G;
        }
        return k;
    }
    
    public final long d() {
        return this.c();
    }
    
    public final long e() {
        if (this.E && (this.r || this.z() > this.J)) {
            this.E = false;
            return this.G;
        }
        return -9223372036854775807L;
    }
    
    public final long f(long h) {
        this.A();
        final Object c = this.M.c;
        if (!this.m.c()) {
            h = 0L;
        }
        final int n = 0;
        final int n2 = 0;
        this.E = false;
        this.G = h;
        if (this.C()) {
            return this.H = h;
        }
        Label_0124: {
            if (this.p != 7) {
                for (int length = this.k.length, i = 0; i < length; ++i) {
                    if (!this.k[i].C(h, false)) {
                        if (((boolean[])c)[i]) {
                            break Label_0124;
                        }
                        if (!this.C) {
                            break Label_0124;
                        }
                    }
                }
                return h;
            }
        }
        this.I = false;
        this.H = h;
        this.r = false;
        final bro e = this.e;
        if (e.g()) {
            final bov[] k = this.k;
            for (int length2 = k.length, j = n2; j < length2; ++j) {
                k[j].q();
            }
            this.e.b();
        }
        else {
            e.c();
            final bov[] l = this.k;
            for (int length3 = l.length, n3 = n; n3 < length3; ++n3) {
                l[n3].w();
            }
        }
        return h;
    }
    
    public final long g(final bqw[] array, boolean[] array2, final bow[] array3, final boolean[] array4, long f) {
        this.A();
        final des m = this.M;
        final Object a = m.a;
        final Object b = m.b;
        final int f2 = this.F;
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < array.length; ++i) {
            final bow bow = array3[i];
            if (bow != null && (array[i] == null || !array2[i])) {
                final int a2 = ((bom)bow).a;
                final boolean[] array5 = (boolean[])b;
                dk.h(array5[a2]);
                --this.F;
                array5[a2] = false;
                array3[i] = null;
            }
        }
        int n5 = 0;
        Label_0168: {
            long n4 = 0L;
            Label_0161: {
                if (this.D) {
                    n4 = f;
                    if (f2 != 0) {
                        break Label_0161;
                    }
                }
                else if (f == 0L) {
                    n4 = 0L;
                    break Label_0161;
                }
                n5 = 1;
                break Label_0168;
            }
            n5 = 0;
            f = n4;
        }
        int j = 0;
        int n6 = n5;
        while (j < array.length) {
            int n7 = n6;
            if (array3[j] == null) {
                final bqw bqw = array[j];
                n7 = n6;
                if (bqw != null) {
                    dk.h(bqw.g() == 1);
                    dk.h(bqw.b(0) == 0);
                    final int a3 = ((bpe)a).a(bqw.j());
                    array2 = (boolean[])b;
                    dk.h(array2[a3] ^ true);
                    ++this.F;
                    array2[a3] = true;
                    array3[j] = (bow)new bom(this, a3);
                    array4[j] = true;
                    if ((n7 = n6) == 0) {
                        final bov bov = this.k[a3];
                        if (!bov.C(f, true) && bov.g() != 0) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                    }
                }
            }
            ++j;
            n6 = n7;
        }
        long n8;
        if (this.F == 0) {
            this.I = false;
            this.E = false;
            if (this.e.g()) {
                final bov[] k = this.k;
                for (int length = k.length, l = n3; l < length; ++l) {
                    k[l].q();
                }
                this.e.b();
                n8 = f;
            }
            else {
                final bov[] k2 = this.k;
                final int length2 = k2.length;
                int n9 = n;
                while (true) {
                    n8 = f;
                    if (n9 >= length2) {
                        break;
                    }
                    k2[n9].w();
                    ++n9;
                }
            }
        }
        else {
            n8 = f;
            if (n6 != 0) {
                f = this.f(f);
                int n10 = n2;
                while (true) {
                    n8 = f;
                    if (n10 >= array3.length) {
                        break;
                    }
                    if (array3[n10] != null) {
                        array4[n10] = true;
                    }
                    ++n10;
                }
            }
        }
        this.D = true;
        return n8;
    }
    
    public final bpe h() {
        this.A();
        return (bpe)this.M.a;
    }
    
    public final void i(final long n, final boolean b) {
        this.A();
        if (this.C()) {
            return;
        }
        final Object b2 = this.M.b;
        for (int length = this.k.length, i = 0; i < length; ++i) {
            this.k[i].p(n, b, ((boolean[])b2)[i]);
        }
    }
    
    public final void j() {
        this.v();
        if (this.r && !this.l) {
            throw aza.a("Loading finished before preparation is complete.", (Throwable)null);
        }
    }
    
    public final long k(final boolean b) {
        int i = 0;
        long n = Long.MIN_VALUE;
        while (i < this.k.length) {
            long max = 0L;
            Label_0062: {
                if (!b) {
                    final des m = this.M;
                    dk.d((Object)m);
                    max = n;
                    if (!((boolean[])m.b)[i]) {
                        break Label_0062;
                    }
                }
                max = Math.max(n, this.k[i].m());
            }
            ++i;
            n = max;
        }
        return n;
    }
    
    public final void kY(final brl brl, long k, final long n) {
        final bok bok = (bok)brl;
        if (this.n == -9223372036854775807L) {
            final bua m = this.m;
            if (m != null) {
                final boolean c = m.c();
                k = this.k(true);
                if (k == Long.MIN_VALUE) {
                    k = 0L;
                }
                else {
                    k += 10000L;
                }
                this.n = k;
                this.c.b(k, c, this.o);
            }
        }
        this.y.i(new bno(bok.a, bok.d, bok.b.a), 1, -1, null, 0, null, bok.c, this.n);
        this.r = true;
        final bnu i = this.i;
        dk.d((Object)i);
        i.b((boy)this);
    }
    
    public final ypi kZ(final brl brl, final IOException ex, int i) {
        final bok bok = (bok)brl;
        final bno bno = new bno(bok.a, bok.d, bok.b.a);
        final long c = bok.c;
        final int a = bax.a;
        final long c2 = this.x.c(new ttl(bno, ex, i));
        ypi ypi = null;
        Label_0244: {
            if (c2 == -9223372036854775807L) {
                ypi = bro.e;
            }
            else {
                final int z = this.z();
                final int j = this.J;
                i = 0;
                final boolean b = z > j;
                Label_0236: {
                    if (!this.q) {
                        final bua m = this.m;
                        if (m == null || m.a() == -9223372036854775807L) {
                            final boolean l = this.l;
                            if (l && !this.y()) {
                                this.I = true;
                                ypi = bro.d;
                                break Label_0244;
                            }
                            this.E = l;
                            this.G = 0L;
                            this.J = 0;
                            for (bov[] k = this.k; i < k.length; ++i) {
                                k[i].w();
                            }
                            bok.c(0L, 0L);
                            break Label_0236;
                        }
                    }
                    this.J = z;
                }
                ypi = bro.i(b, c2);
            }
        }
        final boolean b2 = ypi.c() ^ true;
        this.y.l(bno, 1, -1, null, 0, null, bok.c, this.n, ex, b2);
        if (b2) {
            final long a2 = bok.a;
        }
        return ypi;
    }
    
    public final void l(final bnu i, final long n) {
        this.i = i;
        this.L.e();
        this.B();
    }
    
    public final void lb(final brl brl, final boolean b) {
        final bok bok = (bok)brl;
        this.y.f(new bno(bok.a, bok.d, bok.b.a), 1, -1, null, 0, null, bok.c, this.n);
        if (!b) {
            final bov[] k = this.k;
            for (int length = k.length, i = 0; i < length; ++i) {
                k[i].w();
            }
            if (this.F > 0) {
                final bnu j = this.i;
                dk.d((Object)j);
                j.b((boy)this);
            }
        }
    }
    
    public final void m(final long n) {
    }
    
    public final boolean n(final long n) {
        if (!this.r && !this.e.f() && !this.I && (!this.l || this.F != 0)) {
            boolean e = this.L.e();
            if (!this.e.g()) {
                this.B();
                e = true;
            }
            return e;
        }
        return false;
    }
    
    public final boolean o() {
        return this.e.g() && this.L.d();
    }
    
    public final bud p(final bon bon) {
        final int length = this.k.length;
        for (int i = 0; i < length; ++i) {
            if (bon.equals(this.A[i])) {
                return (bud)this.k[i];
            }
        }
        final bov f = bov.F(this.K, this.w, this.N);
        f.b = (bou)this;
        final bon[] a = this.A;
        final int n = length + 1;
        final bon[] array = Arrays.copyOf(a, n);
        array[length] = bon;
        this.A = (bon[])bax.al((Object[])array);
        final bov[] array2 = Arrays.copyOf(this.k, n);
        array2[length] = f;
        this.k = (bov[])bax.al((Object[])array2);
        return (bud)f;
    }
    
    public final bud q(final int n, final int n2) {
        return this.p(new bon(n, false));
    }
    
    public final void r() {
        this.B = true;
        this.h.post(this.f);
    }
    
    public final void s() {
        if (!this.s && !this.l && this.B) {
            if (this.m != null) {
                final bov[] k = this.k;
                for (int length = k.length, i = 0; i < length; ++i) {
                    if (k[i].o() == null) {
                        return;
                    }
                }
                this.L.f();
                final int length2 = this.k.length;
                final azn[] array = new azn[length2];
                final boolean[] array2 = new boolean[length2];
                for (int j = 0; j < length2; ++j) {
                    final ayg o = this.k[j].o();
                    dk.d((Object)o);
                    final String n = o.n;
                    final boolean l = ayz.i(n);
                    final boolean b = l || ayz.m(n);
                    array2[j] = b;
                    this.C |= b;
                    final IcyHeaders m = this.j;
                    ayg a = o;
                    if (m != null) {
                        ayg a2 = null;
                        Label_0275: {
                            if (!l) {
                                a2 = o;
                                if (!this.A[j].b) {
                                    break Label_0275;
                                }
                            }
                            final Metadata l2 = o.l;
                            Metadata c;
                            if (l2 == null) {
                                c = new Metadata(new Metadata$Entry[] { (Metadata$Entry)m });
                            }
                            else {
                                c = l2.c(new Metadata$Entry[] { (Metadata$Entry)m });
                            }
                            final ayf b2 = o.b();
                            b2.i = c;
                            a2 = b2.a();
                        }
                        a = a2;
                        if (l) {
                            a = a2;
                            if (a2.h == -1) {
                                a = a2;
                                if (a2.i == -1) {
                                    final int a3 = m.a;
                                    a = a2;
                                    if (a3 != -1) {
                                        final ayf b3 = a2.b();
                                        b3.f = a3;
                                        a = b3.a();
                                    }
                                }
                            }
                        }
                    }
                    array[j] = new azn(Integer.toString(j), new ayg[] { a.c(this.w.a(a)) });
                }
                this.M = new des(new bpe(array), array2);
                this.l = true;
                final bnu i2 = this.i;
                dk.d((Object)i2);
                i2.kX((bnv)this);
            }
        }
    }
    
    public final void t(final int n) {
        this.A();
        final des m = this.M;
        final boolean[] array = (boolean[])m.d;
        if (!array[n]) {
            final ayg a = ((bpe)m.a).b(n).a(0);
            this.y.d(ayz.b(a.n), a, 0, null, this.G);
            array[n] = true;
        }
    }
    
    public final void u(int i) {
        this.A();
        final Object c = this.M.c;
        if (this.I && ((boolean[])c)[i]) {
            final bov bov = this.k[i];
            i = 0;
            if (!bov.A(false)) {
                this.H = 0L;
                this.I = false;
                this.E = true;
                this.G = 0L;
                this.J = 0;
                for (bov[] k = this.k; i < k.length; ++i) {
                    k[i].w();
                }
                final bnu j = this.i;
                dk.d((Object)j);
                j.b((boy)this);
            }
        }
    }
    
    final void v() {
        this.e.d(this.x.a(this.p));
    }
    
    public final void w() {
        final bov[] k = this.k;
        for (int length = k.length, i = 0; i < length; ++i) {
            k[i].v();
        }
        final bmu bmu = (bmu)this.z;
        if (bmu.a != null) {
            bmu.a = null;
        }
        bmu.b = null;
    }
    
    public final void x(final bua bua) {
        this.h.post((Runnable)new bhd(this, bua, 12));
    }
    
    public final boolean y() {
        return this.E || this.C();
    }
}
