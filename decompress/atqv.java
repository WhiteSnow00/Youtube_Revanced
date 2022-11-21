import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqv
{
    public static boolean a(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static void b(final ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return;
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }
    
    public static void c(final ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer is already full.");
    }
    
    public static String d() {
        return "107.0.5284.2@".concat("17cc95f7");
    }
}
