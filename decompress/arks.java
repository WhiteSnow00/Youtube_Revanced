import java.io.EOFException;
import java.nio.channels.ReadableByteChannel;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arks
{
    static {
        ByteBuffer.allocate(0).asReadOnlyBuffer();
    }
    
    public static void a(final ReadableByteChannel readableByteChannel, final ByteBuffer byteBuffer) {
        final int remaining = byteBuffer.remaining();
        int n = 0;
        int read;
        do {
            read = readableByteChannel.read(byteBuffer);
            if (read != -1) {
                continue;
            }
            throw new EOFException("End of file. No more boxes.");
        } while ((n += read) != remaining);
        if (read != -1) {
            return;
        }
        throw new EOFException("End of file. No more boxes.");
    }
}
