import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class bic extends bho
{
    private static final int e;
    
    static {
        e = Float.floatToIntBits(Float.NaN);
    }
    
    public bic() {
    }
    
    private static void n(int n, final ByteBuffer byteBuffer) {
        final double n2 = n;
        Double.isNaN(n2);
        if ((n = Float.floatToIntBits((float)(n2 * 4.656612875245797E-10))) == bic.e) {
            n = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(n);
    }
    
    public final void e(final ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - position;
        final int d = this.b.d;
        ByteBuffer byteBuffer2;
        if (d != 536870912) {
            if (d != 805306368) {
                throw new IllegalStateException();
            }
            final ByteBuffer j = this.j(n);
            while (true) {
                byteBuffer2 = j;
                if (position >= limit) {
                    break;
                }
                n((byteBuffer.get(position) & 0xFF) | (byteBuffer.get(position + 1) & 0xFF) << 8 | (byteBuffer.get(position + 2) & 0xFF) << 16 | (byteBuffer.get(position + 3) & 0xFF) << 24, j);
                position += 4;
            }
        }
        else {
            final ByteBuffer i = this.j(n / 3 * 4);
            while (true) {
                byteBuffer2 = i;
                if (position >= limit) {
                    break;
                }
                n((byteBuffer.get(position) & 0xFF) << 8 | (byteBuffer.get(position + 1) & 0xFF) << 16 | (byteBuffer.get(position + 2) & 0xFF) << 24, i);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }
    
    public final azt i(azt a) {
        final int d = a.d;
        if (bax.ad(d)) {
            if (d != 4) {
                a = new azt(a.b, a.c, 4);
            }
            else {
                a = azt.a;
            }
            return a;
        }
        throw new azu(a);
    }
}
