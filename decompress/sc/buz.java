import java.util.List;
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buz implements btj
{
    private final bas a;
    private btm b;
    private int c;
    private int d;
    private int e;
    private long f;
    private MotionPhotoMetadata g;
    private btk h;
    private bva i;
    private bwp j;
    
    public buz() {
        this.a = new bas(6);
        this.f = -1L;
    }
    
    private final int a(final btk btk) {
        this.a.C(2);
        btk.j(this.a.a, 0, 2);
        return this.a.m();
    }
    
    private final void b() {
        this.c(new Metadata$Entry[0]);
        final btm b = this.b;
        dk.d((Object)b);
        b.r();
        this.b.x((bua)new btz(-9223372036854775807L));
        this.c = 6;
    }
    
    private final void c(final Metadata$Entry... array) {
        final btm b = this.b;
        dk.d((Object)b);
        final bud q = b.q(1024, 4);
        final ayf ayf = new ayf();
        ayf.j = "image/jpeg";
        ayf.i = new Metadata(array);
        q.b(ayf.a());
    }
    
    public final void d(final btm b) {
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
            final bwp j = this.j;
            dk.d((Object)j);
            j.f(n, n2);
        }
    }
    
    public final boolean g(final btk btk) {
        if (this.a(btk) != 65496) {
            return false;
        }
        final int a = this.a(btk);
        this.d = a;
        int a2;
        if ((a2 = a) == 65504) {
            this.a.C(2);
            btk.j(this.a.a, 0, 2);
            btk.g(this.a.m() - 2);
            a2 = this.a(btk);
            this.d = a2;
        }
        if (a2 != 65505) {
            return false;
        }
        btk.g(2);
        this.a.C(6);
        btk.j(this.a.a, 0, 6);
        return this.a.q() == 1165519206L && this.a.m() == 0;
    }
    
    public final int h(final btk h, final paq paq) {
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
                final bas bas = new bas(this.e);
                h.k(bas.a, 0, this.e);
                if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(bas.u())) {
                    final String u = bas.u();
                    if (u != null) {
                        final long b = ((btd)h).b;
                        MotionPhotoMetadata g;
                        if (b == -1L) {
                            g = motionPhotoMetadata;
                        }
                        else {
                            final fon a = bvd.a(u);
                            if (a == null) {
                                g = motionPhotoMetadata;
                            }
                            else {
                                final int c2 = ((afih)a.b).c;
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
                                        final bza bza = ((List<bza>)a.b).get(i);
                                        final boolean b3 = b2 | "video/mp4".equals(bza.c);
                                        long n7;
                                        long n8;
                                        if (i == 0) {
                                            n7 = n6 - bza.a;
                                            n8 = 0L;
                                        }
                                        else {
                                            n8 = n6 - bza.b;
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
                    this.i = new bva(h, this.f);
                }
                final bwp j = this.j;
                dk.d((Object)j);
                final int h2 = j.h((btk)this.i, paq);
                if (h2 == 1) {
                    paq.a += this.f;
                }
                return h2;
            }
            if (c == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        else {
            final long c3 = ((btd)h).c;
            final long f = this.f;
            if (c3 == f) {
                if (!h.o(this.a.a, 0, 1, true)) {
                    this.b();
                }
                else {
                    h.l();
                    if (this.j == null) {
                        this.j = new bwp(null);
                    }
                    final bva k = new bva(h, this.f);
                    this.i = k;
                    if (this.j.g((btk)k)) {
                        final bwp l = this.j;
                        final long f2 = this.f;
                        final btm b4 = this.b;
                        dk.d((Object)b4);
                        l.a = (btm)new bvc(f2, b4);
                        final MotionPhotoMetadata g2 = this.g;
                        dk.d((Object)g2);
                        this.c((Metadata$Entry)g2);
                        this.c = 5;
                    }
                    else {
                        this.b();
                    }
                }
                return 0;
            }
            paq.a = f;
            return 1;
        }
    }
}
