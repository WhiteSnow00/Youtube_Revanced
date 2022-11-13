import java.util.Collections;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzu implements bzp
{
    private static final float[] a;
    private final bas b;
    private final boolean[] c;
    private final bzs d;
    private final cac e;
    private bzt f;
    private long g;
    private String h;
    private bud i;
    private boolean j;
    private long k;
    private final eab l;
    
    static {
        a = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f };
    }
    
    public bzu() {
        this(null, null, null, null);
    }
    
    public bzu(final eab l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.l = l;
        this.c = new boolean[4];
        this.d = new bzs();
        this.k = -9223372036854775807L;
        this.e = new cac(178);
        this.b = new bas();
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.f);
        dk.e((Object)this.i);
        int b = bas.b;
        final int c = bas.c;
        final byte[] a = bas.a;
        this.g += bas.a();
        this.i.c(bas, bas.a());
        while (true) {
            final int a2 = btx.a(a, b, c, this.c);
            if (a2 == c) {
                break;
            }
            final byte[] a3 = bas.a;
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
                    final bzs d = this.d;
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
                                        final bud i = this.i;
                                        final int e2 = d.e;
                                        final String h = this.h;
                                        dk.d((Object)h);
                                        final byte[] copy = Arrays.copyOf(d.f, d.d);
                                        final atim atim = new atim(copy, (byte[])null);
                                        atim.p(e2);
                                        atim.p(4);
                                        atim.n();
                                        atim.o(8);
                                        if (atim.q()) {
                                            atim.o(4);
                                            atim.o(3);
                                        }
                                        final int g = atim.g(4);
                                        float t = 0.0f;
                                        Label_0463: {
                                            if (g == 15) {
                                                final int g2 = atim.g(8);
                                                final int g3 = atim.g(8);
                                                if (g3 != 0) {
                                                    t = g2 / (float)g3;
                                                    break Label_0463;
                                                }
                                                bap.c("H263Reader", "Invalid aspect ratio");
                                            }
                                            else {
                                                if (g < 7) {
                                                    t = bzu.a[g];
                                                    break Label_0463;
                                                }
                                                bap.c("H263Reader", "Invalid aspect ratio");
                                            }
                                            t = 1.0f;
                                        }
                                        if (atim.q()) {
                                            atim.o(2);
                                            atim.o(1);
                                            if (atim.q()) {
                                                atim.o(15);
                                                atim.n();
                                                atim.o(15);
                                                atim.n();
                                                atim.o(15);
                                                atim.n();
                                                atim.o(3);
                                                atim.o(11);
                                                atim.n();
                                                atim.o(15);
                                                atim.n();
                                            }
                                        }
                                        if (atim.g(2) != 0) {
                                            bap.c("H263Reader", "Unhandled video object layer shape");
                                        }
                                        atim.n();
                                        final int g4 = atim.g(16);
                                        atim.n();
                                        if (atim.q()) {
                                            if (g4 == 0) {
                                                bap.c("H263Reader", "Invalid vop_increment_time_resolution");
                                            }
                                            else {
                                                int j;
                                                int n5;
                                                for (j = g4 - 1, n5 = 0; j > 0; j >>= 1, ++n5) {}
                                                atim.o(n5);
                                            }
                                        }
                                        atim.n();
                                        final int g5 = atim.g(13);
                                        atim.n();
                                        final int g6 = atim.g(13);
                                        atim.n();
                                        atim.n();
                                        final ayf ayf = new ayf();
                                        ayf.a = h;
                                        ayf.k = "video/mp4v-es";
                                        ayf.p = g5;
                                        ayf.q = g6;
                                        ayf.t = t;
                                        ayf.m = Collections.singletonList(copy);
                                        i.b(ayf.a());
                                        this.j = true;
                                        break Label_0922;
                                    }
                                    if ((n2 & 0xF0) != 0x20) {
                                        bap.c("H263Reader", "Unexpected start code value");
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
                                    bap.c("H263Reader", "Unexpected start code value");
                                    d.b();
                                    e = n2;
                                }
                                else {
                                    d.c = 3;
                                    e = n2;
                                }
                            }
                            else if (n2 != 181) {
                                bap.c("H263Reader", "Unexpected start code value");
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
                    d.a(bzs.a, 0, 3);
                }
            }
            this.f.a(a, b, a2);
            final cac e3 = this.e;
            int n6;
            if (n3 > 0) {
                e3.a(a, b, a2);
                n6 = 0;
            }
            else {
                n6 = -n3;
            }
            if (this.e.d(n6)) {
                final cac e4 = this.e;
                final int b2 = btx.b(e4.b, e4.c);
                final bas b3 = this.b;
                final int a4 = bax.a;
                b3.E(this.e.b, b2);
                this.l.j(this.k, this.b);
            }
            if (e == 178) {
                if (bas.a[a2 + 2] == 1) {
                    this.e.c(178);
                }
                e = 178;
            }
            final int n7 = c - a2;
            final long g7 = this.g - n7;
            final bzt f = this.f;
            final boolean k = this.j;
            if (f.e == 182 && k && f.b) {
                final long h2 = f.h;
                if (h2 != -9223372036854775807L) {
                    f.a.e(h2, (int)(f.d ? 1 : 0), (int)(g7 - f.g), n7, (buc)null);
                }
            }
            final int e5 = f.e;
            final int n8 = 179;
            if (e5 != 179) {
                f.g = g7;
            }
            final bzt f2 = this.f;
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
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.h = cao.b();
        this.i = btm.q(cao.a(), 2);
        this.f = new bzt(this.i);
        this.l.k(btm, cao);
    }
    
    public final void c() {
    }
    
    public final void d(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public final void e() {
        btx.d(this.c);
        this.d.b();
        final bzt f = this.f;
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
