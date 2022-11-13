import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkf implements dde
{
    @Override
    public final int a(final InputStream inputStream, final dge dge) {
        int b;
        if ((b = new atb(inputStream).b()) == 0) {
            b = -1;
        }
        return b;
    }
    
    @Override
    public final int b(final ByteBuffer byteBuffer, final dge dge) {
        return this.a(dou.a(byteBuffer), dge);
    }
    
    @Override
    public final ImageHeaderParser$ImageType c(final InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
    
    @Override
    public final ImageHeaderParser$ImageType d(final ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
