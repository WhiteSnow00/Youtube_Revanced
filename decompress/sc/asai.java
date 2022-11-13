import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class asai implements asak
{
    private final int a;
    
    public asai(final int a) {
        this.a = a;
    }
    
    public final int a(final asei asei, final int n, final Object o, int limit) {
        final int a = this.a;
        if (a == 0) {
            final Void void1 = (Void)o;
            asei.l(n);
            return 0;
        }
        if (a == 1) {
            final Void void2 = (Void)o;
            return asei.e();
        }
        if (a != 2) {
            final ByteBuffer byteBuffer = (ByteBuffer)o;
            limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + n);
            asei.i(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
        asei.k((byte[])o, limit, n);
        return limit + n;
    }
}
