import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class bik extends bhn
{
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j;
    private int k;
    
    public bik() {
        this.j = baw.e;
    }
    
    public final ByteBuffer b() {
        if (super.h()) {
            final int k = this.k;
            if (k > 0) {
                this.j(k).put(this.j, 0, this.k).flip();
                this.k = 0;
            }
        }
        return super.b();
    }
    
    public final void e(final ByteBuffer byteBuffer) {
        final int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - position;
        if (n == 0) {
            return;
        }
        final int min = Math.min(n, this.i);
        this.g += min / this.b.e;
        this.i -= min;
        byteBuffer.position(position + min);
        if (this.i > 0) {
            return;
        }
        final int n2 = n - min;
        final int n3 = this.k + n2 - this.j.length;
        final ByteBuffer j = this.j(n3);
        final int e = baw.e(n3, 0, this.k);
        j.put(this.j, 0, e);
        final int e2 = baw.e(n3 - e, 0, n2);
        byteBuffer.limit(byteBuffer.position() + e2);
        j.put(byteBuffer);
        byteBuffer.limit(limit);
        final int n4 = n2 - e2;
        final int k = this.k - e;
        this.k = k;
        final byte[] i = this.j;
        System.arraycopy(i, e, i, 0, k);
        byteBuffer.get(this.j, this.k, n4);
        this.k += n4;
        j.flip();
    }
    
    public final boolean h() {
        return super.h() && this.k == 0;
    }
    
    public final azs i(final azs azs) {
        if (azs.d == 2) {
            this.h = true;
            azs a = azs;
            if (this.e == 0) {
                if (this.f != 0) {
                    a = azs;
                }
                else {
                    a = azs.a;
                }
            }
            return a;
        }
        throw new azt(azs);
    }
    
    protected final void k() {
        if (this.h) {
            this.h = false;
            final int f = this.f;
            final int e = this.b.e;
            this.j = new byte[f * e];
            this.i = this.e * e;
        }
        this.k = 0;
    }
    
    protected final void l() {
        if (this.h) {
            final int k = this.k;
            if (k > 0) {
                this.g += k / this.b.e;
            }
            this.k = 0;
        }
    }
    
    protected final void m() {
        this.j = baw.e;
    }
}
