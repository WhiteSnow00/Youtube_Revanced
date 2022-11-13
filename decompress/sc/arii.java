import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arii extends arfu
{
    public long[] a;
    private String b;
    private String c;
    
    public arii() {
        super("saio");
        this.a = new long[0];
    }
    
    protected final long h() {
        final int s = this.s();
        int n = 8;
        int n2;
        if (s == 0) {
            n2 = this.a.length * 4;
        }
        else {
            n2 = this.a.length * 8;
        }
        if (0x1 != (this.r() & 0x1)) {
            n = 0;
        }
        return n2 + 8 + n;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if ((this.r() & 0x1) == 0x1) {
            this.b = cln.y(byteBuffer);
            this.c = cln.y(byteBuffer);
        }
        final int q = aqsy.q(cln.w(byteBuffer));
        this.a = new long[q];
        for (int i = 0; i < q; ++i) {
            if (this.s() == 0) {
                this.a[i] = cln.w(byteBuffer);
            }
            else {
                this.a[i] = cln.x(byteBuffer);
            }
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if ((this.r() & 0x1) == 0x1) {
            byteBuffer.put(dpt.b(this.b));
            byteBuffer.put(dpt.b(this.c));
        }
        cln.m(byteBuffer, (long)this.a.length);
        for (final Long value : this.a) {
            if (this.s() == 0) {
                cln.m(byteBuffer, (long)value);
            }
            else {
                byteBuffer.putLong(value);
            }
        }
    }
}
