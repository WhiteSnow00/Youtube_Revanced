import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.io.IOException;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlr implements ddr
{
    private final List a;
    private final ddr b;
    private final dge c;
    
    public dlr(final List a, final ddr b, final dge c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final /* bridge */ dfy a(final Object o, final int n, final int n2, final ddp ddp) {
        final InputStream inputStream = (InputStream)o;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] byteArray;
        try {
            final byte[] array = new byte[16384];
            while (true) {
                final int read = inputStream.read(array);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(array, 0, read);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        }
        catch (final IOException ex) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", (Throwable)ex);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), n, n2, ddp);
    }
    
    @Override
    public final /* bridge */ boolean b(final Object o, final ddp ddp) {
        final InputStream inputStream = (InputStream)o;
        return !(boolean)ddp.b(dlq.b) && cka.k(this.a, inputStream, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
