import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dke implements ddd
{
    public final int a(final InputStream inputStream, final dgd dgd) {
        int b;
        if ((b = new ata(inputStream).b()) == 0) {
            b = -1;
        }
        return b;
    }
    
    public final int b(final ByteBuffer byteBuffer, final dgd dgd) {
        return this.a(dot.a(byteBuffer), dgd);
    }
    
    public final ImageHeaderParser$ImageType c(final InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
    
    public final ImageHeaderParser$ImageType d(final ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
