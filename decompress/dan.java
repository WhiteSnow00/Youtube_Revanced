import java.security.MessageDigest;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dan implements dao
{
    private final ByteBuffer a;
    
    public dan(final ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }
    
    @Override
    public final long a() {
        return this.a.capacity();
    }
    
    @Override
    public final void b(final MessageDigest[] array, final long n, int i) {
        Object a = this.a;
        monitorenter(a);
        try {
            final ByteBuffer a2 = this.a;
            final int n2 = (int)n;
            a2.position(n2);
            this.a.limit(n2 + i);
            final ByteBuffer slice = this.a.slice();
            monitorexit(a);
            int length;
            for (length = array.length, i = 0; i < length; ++i) {
                a = array[i];
                slice.position(0);
                ((MessageDigest)a).update(slice);
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
