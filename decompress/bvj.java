import java.nio.ByteBuffer;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bvj implements bvh
{
    public final Metadata a(final bvi bvi) {
        final ByteBuffer c = bvi.c;
        bad.b(c);
        final int position = c.position();
        boolean b2;
        final boolean b = b2 = false;
        if (position == 0) {
            b2 = b;
            if (c.hasArray()) {
                b2 = b;
                if (c.arrayOffset() == 0) {
                    b2 = true;
                }
            }
        }
        bad.d(b2);
        if (((bcy)bvi).isDecodeOnly()) {
            return null;
        }
        return this.b(bvi, c);
    }
    
    protected abstract Metadata b(final bvi p0, final ByteBuffer p1);
}
