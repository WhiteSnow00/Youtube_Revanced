import java.nio.ByteBuffer;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apm
{
    public static boolean a(final ViewGroup viewGroup) {
        return viewGroup.getClipToPadding();
    }
    
    public static final long b(final ByteBuffer byteBuffer) {
        return (long)byteBuffer.getInt() & 0xFFFFFFFFL;
    }
    
    public static final void c(final int n, final ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + n);
    }
}
