import java.nio.ByteBuffer;
import androidx.media3.common.Metadata;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bvg implements bve
{
    public final Metadata a(final bvf bvf) {
        final ByteBuffer c = bvf.c;
        dk.d((Object)c);
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
        dk.f(b2);
        if (((bcw)bvf).isDecodeOnly()) {
            return null;
        }
        return this.b(bvf, c);
    }
    
    protected abstract Metadata b(final bvf p0, final ByteBuffer p1);
}
