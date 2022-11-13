import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bii extends bho
{
    public boolean e;
    public long f;
    private int g;
    private byte[] h;
    private byte[] i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    
    public bii() {
        dk.f(true);
        this.h = bax.e;
        this.i = bax.e;
    }
    
    private final int n(final long n) {
        return (int)(n * this.b.b / 1000000L);
    }
    
    private final int o(final ByteBuffer byteBuffer) {
        for (int i = byteBuffer.position(); i < byteBuffer.limit(); i += 2) {
            if (Math.abs(byteBuffer.getShort(i)) > 1024) {
                final int g = this.g;
                return g * (i / g);
            }
        }
        return byteBuffer.limit();
    }
    
    private final void p(final byte[] array, final int n) {
        this.j(n).put(array, 0, n).flip();
        if (n > 0) {
            this.m = true;
        }
    }
    
    private final void q(final ByteBuffer byteBuffer, final byte[] array, final int n) {
        final int min = Math.min(byteBuffer.remaining(), this.l);
        final int n2 = this.l - min;
        System.arraycopy(array, n - n2, this.i, 0, n2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.i, n2, min);
    }
    
    public final void e(final ByteBuffer byteBuffer) {
    Label_0000:
        while (byteBuffer.hasRemaining() && !super.d.hasRemaining()) {
            final int j = this.j;
            if (j == 0) {
                final int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.h.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    int n;
                    do {
                        n = limit2 - 2;
                        if (n < byteBuffer.position()) {
                            final int position = byteBuffer.position();
                            if (position == byteBuffer.position()) {
                                this.j = 1;
                            }
                            else {
                                byteBuffer.limit(position);
                                final int remaining = byteBuffer.remaining();
                                this.j(remaining).put(byteBuffer).flip();
                                if (remaining > 0) {
                                    this.m = true;
                                }
                            }
                            byteBuffer.limit(limit);
                            continue Label_0000;
                        }
                        limit2 = n;
                    } while (Math.abs(byteBuffer.getShort(n)) <= 1024);
                    final int g = this.g;
                    final int position = n / g * g + g;
                    continue;
                }
            }
            if (j != 1) {
                final int limit3 = byteBuffer.limit();
                final int o = this.o(byteBuffer);
                byteBuffer.limit(o);
                this.f += byteBuffer.remaining() / this.g;
                this.q(byteBuffer, this.i, this.l);
                if (o >= limit3) {
                    continue;
                }
                this.p(this.i, this.l);
                this.j = 0;
                byteBuffer.limit(limit3);
            }
            else {
                final int limit4 = byteBuffer.limit();
                final int o2 = this.o(byteBuffer);
                final int n2 = o2 - byteBuffer.position();
                final byte[] h = this.h;
                final int length = h.length;
                final int k = this.k;
                final int n3 = length - k;
                if (o2 < limit4 && n2 < n3) {
                    this.p(h, k);
                    this.k = 0;
                    this.j = 0;
                }
                else {
                    final int min = Math.min(n2, n3);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.h, this.k, min);
                    int i = this.k + min;
                    this.k = i;
                    final byte[] h2 = this.h;
                    if (i == h2.length) {
                        if (this.m) {
                            this.p(h2, this.l);
                            final long f = this.f;
                            i = this.k;
                            final int l = this.l;
                            this.f = f + (i - (l + l)) / this.g;
                        }
                        else {
                            this.f += (i - this.l) / this.g;
                        }
                        this.q(byteBuffer, this.h, i);
                        this.k = 0;
                        this.j = 2;
                    }
                    byteBuffer.limit(limit4);
                }
            }
        }
    }
    
    public final boolean g() {
        return this.e;
    }
    
    public final azt i(final azt azt) {
        if (azt.d != 2) {
            throw new azu(azt);
        }
        if (this.e) {
            return azt;
        }
        return azt.a;
    }
    
    protected final void k() {
        if (this.e) {
            this.g = this.b.e;
            final int n = this.n(150000L) * this.g;
            if (this.h.length != n) {
                this.h = new byte[n];
            }
            final int l = this.n(20000L) * this.g;
            if (this.i.length != (this.l = l)) {
                this.i = new byte[l];
            }
        }
        this.j = 0;
        this.f = 0L;
        this.k = 0;
        this.m = false;
    }
    
    protected final void l() {
        final int k = this.k;
        if (k > 0) {
            this.p(this.h, k);
        }
        if (!this.m) {
            this.f += this.l / this.g;
        }
    }
    
    protected final void m() {
        this.e = false;
        this.l = 0;
        this.h = bax.e;
        this.i = bax.e;
    }
}
