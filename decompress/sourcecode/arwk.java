import java.util.concurrent.LinkedBlockingQueue;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

final class arwk
{
    private static final int a;
    private static final Queue b;
    
    static {
        b = new LinkedBlockingQueue(131072 / (a = Math.max(16384, 8192)));
    }
    
    static void a(final byte[] array) {
        if (array.length == arwk.a) {
            arwk.b.offer(array);
        }
    }
    
    static byte[] b() {
        return c(arwk.a);
    }
    
    static byte[] c(final int n) {
        if (n == arwk.a) {
            final byte[] array = arwk.b.poll();
            if (array != null) {
                return array;
            }
        }
        return new byte[n];
    }
}
