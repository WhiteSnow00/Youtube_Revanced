import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import android.os.HandlerThread;
import android.media.MediaCodec;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

final class blq
{
    public static final ArrayDeque a;
    public static final Object b;
    public final MediaCodec c;
    public final HandlerThread d;
    public Handler e;
    public final AtomicReference f;
    public boolean g;
    public final gpj h;
    
    static {
        a = new ArrayDeque();
        b = new Object();
    }
    
    public blq(final MediaCodec c, final HandlerThread d) {
        final gpj h = new gpj((byte[])null);
        this.c = c;
        this.d = d;
        this.h = h;
        this.f = new AtomicReference();
    }
    
    public static byte[] c(final byte[] array, final byte[] array2) {
        if (array == null) {
            return array2;
        }
        if (array2 != null) {
            final int length = array.length;
            if (array2.length >= length) {
                System.arraycopy(array, 0, array2, 0, length);
                return array2;
            }
        }
        return Arrays.copyOf(array, array.length);
    }
    
    public static int[] d(final int[] array, final int[] array2) {
        if (array == null) {
            return array2;
        }
        if (array2 != null) {
            final int length = array.length;
            if (array2.length >= length) {
                System.arraycopy(array, 0, array2, 0, length);
                return array2;
            }
        }
        return Arrays.copyOf(array, array.length);
    }
    
    public static lvf e() {
        final ArrayDeque a = blq.a;
        synchronized (a) {
            if (a.isEmpty()) {
                return new lvf((byte[])null);
            }
            return (lvf)a.removeFirst();
        }
    }
    
    public final void a() {
        if (this.g) {
            try {
                final Handler e = this.e;
                dk.d((Object)e);
                e.removeCallbacksAndMessages((Object)null);
                this.h.f();
                final Handler e2 = this.e;
                dk.d((Object)e2);
                e2.obtainMessage(2).sendToTarget();
                this.h.a();
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(ex);
            }
        }
    }
    
    public final void b() {
        final RuntimeException ex = this.f.getAndSet(null);
        if (ex == null) {
            return;
        }
        throw ex;
    }
}
