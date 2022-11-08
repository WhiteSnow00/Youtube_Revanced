import java.nio.ByteBuffer;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.FileInputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

final class aucx implements ReadableByteChannel
{
    private final InputStream a;
    private final AtomicBoolean b;
    
    private aucx(final InputStream a) {
        this.b = new AtomicBoolean(true);
        this.a = a;
    }
    
    static ReadableByteChannel a(final InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return FileInputStreamWrapper.getChannel((FileInputStream)inputStream);
        }
        return new aucx(inputStream);
    }
    
    @Override
    public final void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }
    
    @Override
    public final boolean isOpen() {
        return this.b.get();
    }
    
    @Override
    public final int read(ByteBuffer byteBuffer) {
        int read2;
        if (byteBuffer.hasArray()) {
            final int read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if ((read2 = read) > 0) {
                byteBuffer = (ByteBuffer)byteBuffer.position(byteBuffer.position() + read);
                return read;
            }
        }
        else {
            final byte[] array = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
            read2 = this.a.read(array);
            if (read2 > 0) {
                byteBuffer.put(array, 0, read2);
                return read2;
            }
        }
        return read2;
    }
}
