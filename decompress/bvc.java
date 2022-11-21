import java.util.List;
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvc implements btm
{
    private final bat a;
    private btp b;
    private int c;
    private int d;
    private int e;
    private long f;
    private MotionPhotoMetadata g;
    private btn h;
    private bvd i;
    private bws j;
    
    public bvc() {
        this.a = new bat(6);
        this.f = -1L;
    }
    
    private final int a(final btn btn) {
        this.a.C(2);
        btn.j(this.a.a, 0, 2);
        return this.a.m();
    }
    
    private final void b() {
        this.c(new Metadata$Entry[0]);
        final btp b = this.b;
        bad.b(b);
        b.r();
        this.b.x((bud)new buc(-9223372036854775807L));
        this.c = 6;
    }
    
    private final void c(final Metadata$Entry... array) {
        final btp b = this.b;
        bad.b(b);
        final bug q = b.q(1024, 4);
        final ayg ayg = new ayg();
        ayg.j = "image/jpeg";
        ayg.i = new Metadata(array);
        q.b(ayg.a());
    }
    
    public final void d(final btp b) {
        this.b = b;
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        if (n == 0L) {
            this.c = 0;
            this.j = null;
            return;
        }
        if (this.c == 5) {
            final bws j = this.j;
            bad.b(j);
            j.f(n, n2);
        }
    }
    
    public final boolean g(final btn btn) {
        if (this.a(btn) != 65496) {
            return false;
        }
        final int a = this.a(btn);
        this.d = a;
        int a2;
        if ((a2 = a) == 65504) {
            this.a.C(2);
            btn.j(this.a.a, 0, 2);
            btn.g(this.a.m() - 2);
            a2 = this.a(btn);
            this.d = a2;
        }
        if (a2 != 65505) {
            return false;
        }
        btn.g(2);
        this.a.C(6);
        btn.j(this.a.a, 0, 6);
        return this.a.q() == 1165519206L && this.a.m() == 0;
    }
    
    public final int h(final btn h, final pbg pbg) {
        final int c = this.c;
        if (c == 0) {
            this.a.C(2);
            h.k(this.a.a, 0, 2);
            final int m = this.a.m();
            if ((this.d = m) == 65498) {
                if (this.f != -1L) {
                    this.c = 4;
                }
                else {
                    this.b();
                }
            }
            else if ((m < 65488 || m > 65497) && m != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (c == 1) {
            this.a.C(2);
            h.k(this.a.a, 0, 2);
            this.e = this.a.m() - 2;
            this.c = 2;
            return 0;
        }
        final MotionPhotoMetadata motionPhotoMetadata = null;
        if (c == 2) {
            if (this.d == 65505) {
                final bat bat = new bat(this.e);
                h.k(bat.a, 0, this.e);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(bat.u())) {
                    final String u = bat.u();
                    if (u != null) {
                        final long b = ((btg)h).b;
                        MotionPhotoMetadata g;
                        if (b == -1L) {
                            g = motionPhotoMetadata;
                        }
                        else {
                            final foq a = bvg.a(u);
                            if (a == null) {
                                g = motionPhotoMetadata;
                            }
                            else {
                                final int c2 = ((afjx)a.b).c;
                                if (c2 < 2) {
                                    g = motionPhotoMetadata;
                                }
                                else {
                                    int i = c2 - 1;
                                    long n = -1L;
                                    long n2 = -1L;
                                    long n4;
                                    final long n3 = n4 = n2;
                                    boolean b2 = false;
                                    long n5 = n3;
                                    long n6 = b;
                                    while (i >= 0) {
                                        final bzd bzd = ((List<bzd>)a.b).get(i);
                                        final boolean b3 = b2 | "video/mp4".equals(bzd.c);
                                        long n7;
                                        long n8;
                                        if (i == 0) {
                                            n7 = n6 - bzd.a;
                                            n8 = 0L;
                                        }
                                        else {
                                            n8 = n6 - bzd.b;
                                            n7 = n6;
                                        }
                                        n6 = n8;
                                        b2 = b3;
                                        long n9 = n5;
                                        long n10 = n4;
                                        if (b3) {
                                            b2 = b3;
                                            n9 = n5;
                                            n10 = n4;
                                            if (n6 != n7) {
                                                n10 = n7 - n6;
                                                n9 = n6;
                                                b2 = false;
                                            }
                                        }
                                        if (i == 0) {
                                            n2 = n7;
                                        }
                                        if (i == 0) {
                                            n = n6;
                                        }
                                        --i;
                                        n5 = n9;
                                        n4 = n10;
                                    }
                                    if (n5 != -1L && n4 != -1L && n != -1L && n2 != -1L) {
                                        g = new MotionPhotoMetadata(n, n2, a.a, n5, n4);
                                    }
                                    else {
                                        g = null;
                                    }
                                }
                            }
                        }
                        this.g = g;
                        if (g != null) {
                            this.f = g.d;
                        }
                    }
                }
            }
            else {
                h.m(this.e);
            }
            return this.c = 0;
        }
        if (c != 4) {
            if (c == 5) {
                if (this.i == null || h != this.h) {
                    this.h = h;
                    this.i = new bvd(h, this.f);
                }
                final bws j = this.j;
                bad.b(j);
                final int h2 = j.h((btn)this.i, pbg);
                if (h2 == 1) {
                    pbg.a += this.f;
                }
                return h2;
            }
            if (c == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        else {
            final long c3 = ((btg)h).c;
            final long f = this.f;
            if (c3 == f) {
                if (!h.o(this.a.a, 0, 1, true)) {
                    this.b();
                }
                else {
                    h.l();
                    if (this.j == null) {
                        this.j = new bws(null);
                    }
                    final bvd k = new bvd(h, this.f);
                    this.i = k;
                    if (this.j.g((btn)k)) {
                        final bws l = this.j;
                        final long f2 = this.f;
                        final btp b4 = this.b;
                        bad.b(b4);
                        l.a = (btp)new bvf(f2, b4);
                        final MotionPhotoMetadata g2 = this.g;
                        bad.b(g2);
                        this.c((Metadata$Entry)g2);
                        this.c = 5;
                    }
                    else {
                        this.b();
                    }
                }
                return 0;
            }
            pbg.a = f;
            return 1;
        }
    }
}
