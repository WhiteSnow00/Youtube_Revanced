// 
// Decompiled by Procyon v0.6.0
// 

public final class cac implements bzs
{
    private final bat a;
    private bug b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    
    public cac() {
        this.a = new bat(10);
        this.d = -9223372036854775807L;
    }
    
    public final void a(final bat bat) {
        bad.c(this.b);
        if (!this.c) {
            return;
        }
        final int a = bat.a();
        final int f = this.f;
        if (f < 10) {
            final int min = Math.min(a, 10 - f);
            System.arraycopy(bat.a, bat.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.G(0);
                if (this.a.i() != 73 || this.a.i() != 68 || this.a.i() != 51) {
                    baq.c("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
                this.a.H(3);
                this.e = this.a.h() + 10;
            }
        }
        final int min2 = Math.min(a, this.e - this.f);
        this.b.c(bat, min2);
        this.f += min2;
    }
    
    public final void b(final btp btp, final car car) {
        car.c();
        final bug q = btp.q(car.a(), 5);
        this.b = q;
        final ayg ayg = new ayg();
        ayg.a = car.b();
        ayg.k = "application/id3";
        q.b(ayg.a());
    }
    
    public final void c() {
        bad.c(this.b);
        if (this.c) {
            final int e = this.e;
            if (e != 0) {
                if (this.f == e) {
                    final long d = this.d;
                    if (d != -9223372036854775807L) {
                        this.b.e(d, 1, e, 0, (buf)null);
                    }
                    this.c = false;
                }
            }
        }
    }
    
    public final void d(final long d, final int n) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        if (d != -9223372036854775807L) {
            this.d = d;
        }
        this.e = 0;
        this.f = 0;
    }
    
    public final void e() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
