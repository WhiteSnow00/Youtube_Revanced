import java.nio.MappedByteBuffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.nio.channels.FileChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dap implements dao
{
    private final FileChannel a;
    private final long b;
    private final long c;
    
    public dap(final FileChannel a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final long a() {
        return this.c;
    }
    
    @Override
    public final void b(final MessageDigest[] array, final long n, int i) {
        final MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + n, i);
        map.load();
        MessageDigest messageDigest;
        for (i = 0; i < array.length; ++i) {
            messageDigest = array[i];
            map.position(0);
            messageDigest.update(map);
        }
    }
}
