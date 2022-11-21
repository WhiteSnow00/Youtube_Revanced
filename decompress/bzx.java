import java.util.Collections;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzx implements bzs
{
    private static final float[] a;
    private final bat b;
    private final boolean[] c;
    private final bzv d;
    private final caf e;
    private bzw f;
    private long g;
    private String h;
    private bug i;
    private boolean j;
    private long k;
    private final eae l;
    
    static {
        a = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f };
    }
    
    public bzx() {
        this(null, null, null, null);
    }
    
    public bzx(final eae l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.l = l;
        this.c = new boolean[4];
        this.d = new bzv();
        this.k = -9223372036854775807L;
        this.e = new caf(178);
        this.b = new bat();
    }
    
    public final void a(final bat bat) {
        bad.c(this.f);
        bad.c(this.i);
        int b = bat.b;
        final int c = bat.c;
        final byte[] a = bat.a;
        this.g += bat.a();
        this.i.c(bat, bat.a());
        while (true) {
            final int a2 = bua.a(a, b, c, this.c);
            if (a2 == c) {
                break;
            }
            final byte[] a3 = bat.a;
            final int n = a2 + 3;
            final int n2 = a3[n] & 0xFF;
            final int n3 = a2 - b;
            int e = n2;
            Label_0922: {
                if (!this.j) {
                    if (n3 > 0) {
                        this.d.a(a, b, a2);
                    }
                    int n4;
                    if (n3 < 0) {
                        n4 = -n3;
                    }
                    else {
                        n4 = 0;
                    }
                    final bzv d = this.d;
                    final int c2 = d.c;
                    Label_0912: {
                        if (c2 != 0) {
                            if (c2 != 1) {
                                if (c2 != 2) {
                                    if (c2 != 3) {
                                        if ((e = n2) != 179) {
                                            if ((e = n2) != 181) {
                                                break Label_0912;
                                            }
                                            e = 181;
                                        }
                                        d.d -= n4;
                                        d.b = false;
                                        final bug i = this.i;
                                        final int e2 = d.e;
                                        final String h = this.h;
                                        bad.b(h);
                                        final byte[] copy = Arrays.copyOf(d.f, d.d);
                                        final atlj atlj = new atlj(copy, null);
                                        atlj.p(e2);
                                        atlj.p(4);
                                        atlj.n();
                                        atlj.o(8);
                                        if (atlj.q()) {
                                            atlj.o(4);
                                            atlj.o(3);
                                        }
                                        final int g = atlj.g(4);
                                        float t = 0.0f;
                                        Label_0463: {
                                            if (g == 15) {
                                                final int g2 = atlj.g(8);
                                                final int g3 = atlj.g(8);
                                                if (g3 != 0) {
                                                    t = g2 / (float)g3;
                                                    break Label_0463;
                                                }
                                                baq.c("H263Reader", "Invalid aspect ratio");
                                            }
                                            else {
                                                if (g < 7) {
                                                    t = bzx.a[g];
                                                    break Label_0463;
                                                }
                                                baq.c("H263Reader", "Invalid aspect ratio");
                                            }
                                            t = 1.0f;
                                        }
                                        if (atlj.q()) {
                                            atlj.o(2);
                                            atlj.o(1);
                                            if (atlj.q()) {
                                                atlj.o(15);
                                                atlj.n();
                                                atlj.o(15);
                                                atlj.n();
                                                atlj.o(15);
                                                atlj.n();
                                                atlj.o(3);
                                                atlj.o(11);
                                                atlj.n();
                                                atlj.o(15);
                                                atlj.n();
                                            }
                                        }
                                        if (atlj.g(2) != 0) {
                                            baq.c("H263Reader", "Unhandled video object layer shape");
                                        }
                                        atlj.n();
                                        final int g4 = atlj.g(16);
                                        atlj.n();
                                        if (atlj.q()) {
                                            if (g4 == 0) {
                                                baq.c("H263Reader", "Invalid vop_increment_time_resolution");
                                            }
                                            else {
                                                int j;
                                                int n5;
                                                for (j = g4 - 1, n5 = 0; j > 0; j >>= 1, ++n5) {}
                                                atlj.o(n5);
                                            }
                                        }
                                        atlj.n();
                                        final int g5 = atlj.g(13);
                                        atlj.n();
                                        final int g6 = atlj.g(13);
                                        atlj.n();
                                        atlj.n();
                                        final ayg ayg = new ayg();
                                        ayg.a = h;
                                        ayg.k = "video/mp4v-es";
                                        ayg.p = g5;
                                        ayg.q = g6;
                                        ayg.t = t;
                                        ayg.m = Collections.singletonList(copy);
                                        i.b(ayg.a());
                                        this.j = true;
                                        break Label_0922;
                                    }
                                    if ((n2 & 0xF0) != 0x20) {
                                        baq.c("H263Reader", "Unexpected start code value");
                                        d.b();
                                        e = n2;
                                    }
                                    else {
                                        d.e = d.d;
                                        d.c = 4;
                                        e = n2;
                                    }
                                }
                                else if (n2 > 31) {
                                    baq.c("H263Reader", "Unexpected start code value");
                                    d.b();
                                    e = n2;
                                }
                                else {
                                    d.c = 3;
                                    e = n2;
                                }
                            }
                            else if (n2 != 181) {
                                baq.c("H263Reader", "Unexpected start code value");
                                d.b();
                                e = n2;
                            }
                            else {
                                d.c = 2;
                                e = n2;
                            }
                        }
                        else if ((e = n2) == 176) {
                            d.c = 1;
                            d.b = true;
                            e = 176;
                        }
                    }
                    d.a(bzv.a, 0, 3);
                }
            }
            this.f.a(a, b, a2);
            final caf e3 = this.e;
            int n6;
            if (n3 > 0) {
                e3.a(a, b, a2);
                n6 = 0;
            }
            else {
                n6 = -n3;
            }
            if (this.e.d(n6)) {
                final caf e4 = this.e;
                final int b2 = bua.b(e4.b, e4.c);
                final bat b3 = this.b;
                final int a4 = baz.a;
                b3.E(this.e.b, b2);
                this.l.j(this.k, this.b);
            }
            if (e == 178) {
                if (bat.a[a2 + 2] == 1) {
                    this.e.c(178);
                }
                e = 178;
            }
            final int n7 = c - a2;
            final long g7 = this.g - n7;
            final bzw f = this.f;
            final boolean k = this.j;
            if (f.e == 182 && k && f.b) {
                final long h2 = f.h;
                if (h2 != -9223372036854775807L) {
                    f.a.e(h2, (int)(f.d ? 1 : 0), (int)(g7 - f.g), n7, (buf)null);
                }
            }
            final int e5 = f.e;
            final int n8 = 179;
            if (e5 != 179) {
                f.g = g7;
            }
            final bzw f2 = this.f;
            final long l = this.k;
            f2.e = e;
            f2.d = false;
            boolean b4 = false;
            Label_1264: {
                if (e != 182) {
                    if (e != 179) {
                        b4 = false;
                        break Label_1264;
                    }
                    e = n8;
                }
                b4 = true;
            }
            f2.b = b4;
            f2.c = (e == 182);
            f2.f = 0;
            f2.h = l;
            b = n;
        }
        if (!this.j) {
            this.d.a(a, b, c);
        }
        this.f.a(a, b, c);
        this.e.a(a, b, c);
    }
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.h = car.b();
        this.i = btp.q(car.a(), 2);
        this.f = new bzw(this.i);
        this.l.k(btp, car);
    }
    
    public final void c() {
    }
    
    public final void d(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public final void e() {
        bua.d(this.c);
        this.d.b();
        final bzw f = this.f;
        if (f != null) {
            f.b = false;
            f.c = false;
            f.d = false;
            f.e = -1;
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
