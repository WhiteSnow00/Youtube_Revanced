import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public interface dde
{
    int a(final InputStream p0, final dge p1);
    
    int b(final ByteBuffer p0, final dge p1);
    
    ImageHeaderParser$ImageType c(final InputStream p0);
    
    ImageHeaderParser$ImageType d(final ByteBuffer p0);
}
