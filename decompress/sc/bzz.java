// 
// Decompiled by Procyon v0.6.0
// 

public final class bzz implements bzp
{
    private final bas a;
    private bud b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    
    public bzz() {
        this.a = new bas(10);
        this.d = -9223372036854775807L;
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.b);
        if (!this.c) {
            return;
        }
        final int a = bas.a();
        final int f = this.f;
        if (f < 10) {
            final int min = Math.min(a, 10 - f);
            System.arraycopy(bas.a, bas.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.G(0);
                if (this.a.i() != 73 || this.a.i() != 68 || this.a.i() != 51) {
                    bap.c("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
                this.a.H(3);
                this.e = this.a.h() + 10;
            }
        }
        final int min2 = Math.min(a, this.e - this.f);
        this.b.c(bas, min2);
        this.f += min2;
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        final bud q = btm.q(cao.a(), 5);
        this.b = q;
        final ayf ayf = new ayf();
        ayf.a = cao.b();
        ayf.k = "application/id3";
        q.b(ayf.a());
    }
    
    public final void c() {
        dk.e((Object)this.b);
        if (this.c) {
            final int e = this.e;
            if (e != 0) {
                if (this.f == e) {
                    final long d = this.d;
                    if (d != -9223372036854775807L) {
                        this.b.e(d, 1, e, 0, (buc)null);
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
