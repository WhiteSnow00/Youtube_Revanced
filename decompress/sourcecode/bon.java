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

public final class bon implements bnu, btl, bri, brl, bot
{
    public static final Map a;
    public static final ayf b;
    private bom[] A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private long G;
    private long H;
    private boolean I;
    private int J;
    private final bre K;
    private final gpd L;
    private der M;
    private final trg N;
    public final bok c;
    public final long d;
    public final brn e;
    public final Runnable f;
    public final Runnable g;
    public final Handler h;
    public bnt i;
    public IcyHeaders j;
    public bou[] k;
    public boolean l;
    public btz m;
    public long n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    private final Uri u;
    private final bbk v;
    private final bkr w;
    private final brh x;
    private final bny y;
    private final boi z;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final aye aye = new aye();
        aye.a = "icy";
        aye.k = "application/x-icy";
        b = aye.a();
    }
    
    public bon(final Uri u, final bbk v, final boi z, final bkr w, final trg n, final brh x, final bny y, final bok c, final bre k, final int n2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.u = u;
        this.v = v;
        this.w = w;
        this.N = n;
        this.x = x;
        this.y = y;
        this.c = c;
        this.K = k;
        this.d = n2;
        this.e = new brn("ProgressiveMediaPeriod");
        this.z = z;
        this.L = new gpd((byte[])null);
        this.f = (Runnable)new aur(this, 12);
        this.g = (Runnable)new aur(this, 13);
        this.h = baw.E();
        this.A = new bom[0];
        this.k = new bou[0];
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
        final boj boj = new boj(this, this.u, this.v, this.z, (btl)this, this.L, (byte[])null);
        if (this.l) {
            dk.h(this.C());
            final long n = this.n;
            if (n != -9223372036854775807L && this.H > n) {
                this.r = true;
                this.H = -9223372036854775807L;
                return;
            }
            final btz m = this.m;
            dk.d((Object)m);
            boj.c(m.b(this.H).a.c, this.H);
            final bou[] k = this.k;
            for (int length = k.length, i = 0; i < length; ++i) {
                k[i].d = this.H;
            }
            this.H = -9223372036854775807L;
        }
        this.J = this.z();
        this.e.h((brk)boj, (bri)this, this.x.a(this.p));
        this.y.n(new bnn(boj.a, boj.d), 1, -1, (ayf)null, 0, (Object)null, boj.c, this.n);
    }
    
    private final boolean C() {
        return this.H != -9223372036854775807L;
    }
    
    private final int z() {
        final bou[] k = this.k;
        final int length = k.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += k[i].i();
            ++i;
        }
        return n;
    }
    
    public final long a(final long n, final bfu bfu) {
        this.A();
        if (!this.m.c()) {
            return 0L;
        }
        final btx b = this.m.b(n);
        return bfu.a(n, b.a.b, b.b.b);
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
                final der m = this.M;
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
        Label_0126: {
            if (this.p != 7) {
                for (int length = this.k.length, i = 0; i < length; ++i) {
                    if (!this.k[i].C(h, false)) {
                        if (((boolean[])c)[i]) {
                            break Label_0126;
                        }
                        if (!this.C) {
                            break Label_0126;
                        }
                    }
                }
                return h;
            }
        }
        this.I = false;
        this.H = h;
        this.r = false;
        final brn e = this.e;
        if (e.g()) {
            final bou[] k = this.k;
            for (int length2 = k.length, j = n2; j < length2; ++j) {
                k[j].q();
            }
            this.e.b();
        }
        else {
            e.c();
            final bou[] l = this.k;
            for (int length3 = l.length, n3 = n; n3 < length3; ++n3) {
                l[n3].w();
            }
        }
        return h;
    }
    
    public final long g(final bqv[] array, boolean[] array2, final bov[] array3, final boolean[] array4, long f) {
        this.A();
        final der m = this.M;
        final Object a = m.a;
        final Object b = m.b;
        final int f2 = this.F;
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < array.length; ++i) {
            final bov bov = array3[i];
            if (bov != null && (array[i] == null || !array2[i])) {
                final int a2 = ((bol)bov).a;
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
                final bqv bqv = array[j];
                n7 = n6;
                if (bqv != null) {
                    dk.h(bqv.g() == 1);
                    dk.h(bqv.b(0) == 0);
                    final int a3 = ((bpd)a).a(bqv.j());
                    array2 = (boolean[])b;
                    dk.h(array2[a3] ^ true);
                    ++this.F;
                    array2[a3] = true;
                    array3[j] = (bov)new bol(this, a3);
                    array4[j] = true;
                    if ((n7 = n6) == 0) {
                        final bou bou = this.k[a3];
                        if (!bou.C(f, true) && bou.g() != 0) {
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
                final bou[] k = this.k;
                for (int length = k.length, l = n3; l < length; ++l) {
                    k[l].q();
                }
                this.e.b();
                n8 = f;
            }
            else {
                final bou[] k2 = this.k;
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
    
    public final bpd h() {
        this.A();
        return (bpd)this.M.a;
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
            throw ayz.a("Loading finished before preparation is complete.", (Throwable)null);
        }
    }
    
    public final long k(final boolean b) {
        long n = Long.MIN_VALUE;
        long max;
        for (int i = 0; i < this.k.length; ++i, n = max) {
            if (!b) {
                final der m = this.M;
                dk.d((Object)m);
                max = n;
                if (!((boolean[])m.b)[i]) {
                    continue;
                }
            }
            max = Math.max(n, this.k[i].m());
        }
        return n;
    }
    
    public final void l(final bnt i, final long n) {
        this.i = i;
        this.L.e();
        this.B();
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
    
    public final buc p(final bom bom) {
        final int length = this.k.length;
        for (int i = 0; i < length; ++i) {
            if (bom.equals((Object)this.A[i])) {
                return (buc)this.k[i];
            }
        }
        final bou f = bou.F(this.K, this.w, this.N);
        f.b = (bot)this;
        final int n = length + 1;
        final bom[] array = Arrays.copyOf(this.A, n);
        array[length] = bom;
        this.A = (bom[])baw.al((Object[])array);
        final bou[] array2 = Arrays.copyOf(this.k, n);
        array2[length] = f;
        this.k = (bou[])baw.al((Object[])array2);
        return (buc)f;
    }
    
    public final buc q(final int n, final int n2) {
        return this.p(new bom(n, false));
    }
    
    public final void r() {
        this.B = true;
        this.h.post(this.f);
    }
    
    public final void s() {
        if (!this.s && !this.l && this.B) {
            if (this.m != null) {
                final bou[] k = this.k;
                for (int length = k.length, i = 0; i < length; ++i) {
                    if (k[i].o() == null) {
                        return;
                    }
                }
                this.L.f();
                final int length2 = this.k.length;
                final azm[] array = new azm[length2];
                final boolean[] array2 = new boolean[length2];
                for (int j = 0; j < length2; ++j) {
                    final ayf o = this.k[j].o();
                    dk.d((Object)o);
                    final String n = o.n;
                    final boolean l = ayy.i(n);
                    final boolean b = l || ayy.m(n);
                    array2[j] = b;
                    this.C |= b;
                    final IcyHeaders m = this.j;
                    ayf a = o;
                    if (m != null) {
                        ayf a2 = null;
                        Label_0262: {
                            if (!l) {
                                a2 = o;
                                if (!this.A[j].b) {
                                    break Label_0262;
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
                            final aye b2 = o.b();
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
                                        final aye b3 = a2.b();
                                        b3.f = a3;
                                        a = b3.a();
                                    }
                                }
                            }
                        }
                    }
                    array[j] = new azm(Integer.toString(j), new ayf[] { a.c(this.w.a(a)) });
                }
                this.M = new der(new bpd(array), array2);
                this.l = true;
                final bnt i2 = this.i;
                dk.d((Object)i2);
                i2.kX((bnu)this);
            }
        }
    }
    
    public final void t(final int n) {
        this.A();
        final der m = this.M;
        final boolean[] array = (boolean[])m.d;
        if (!array[n]) {
            final ayf a = ((bpd)m.a).b(n).a(0);
            this.y.d(ayy.b(a.n), a, 0, (Object)null, this.G);
            array[n] = true;
        }
    }
    
    public final void u(int i) {
        this.A();
        final Object c = this.M.c;
        if (this.I && ((boolean[])c)[i]) {
            final bou bou = this.k[i];
            i = 0;
            if (!bou.A(false)) {
                this.H = 0L;
                this.I = false;
                this.E = true;
                this.G = 0L;
                this.J = 0;
                for (bou[] k = this.k; i < k.length; ++i) {
                    k[i].w();
                }
                final bnt j = this.i;
                dk.d((Object)j);
                j.b((box)this);
            }
        }
    }
    
    final void v() {
        this.e.d(this.x.a(this.p));
    }
    
    public final void w() {
        final bou[] k = this.k;
        for (int length = k.length, i = 0; i < length; ++i) {
            k[i].v();
        }
        final bmt bmt = (bmt)this.z;
        if (bmt.a != null) {
            bmt.a = null;
        }
        bmt.b = null;
    }
    
    public final void x(final btz btz) {
        this.h.post((Runnable)new bhc(this, btz, 12));
    }
    
    public final boolean y() {
        return this.E || this.C();
    }
}
