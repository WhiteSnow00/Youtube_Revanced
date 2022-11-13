import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddf implements ddj
{
    final Object a;
    private final int b;
    
    public ddf(final InputStream a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ddf(final ByteBuffer a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ImageHeaderParser$ImageType a(final dde dde) {
        if (this.b != 0) {
            try {
                return dde.c((InputStream)this.a);
            }
            finally {
                ((InputStream)this.a).reset();
            }
        }
        try {
            return dde.d((ByteBuffer)this.a);
        }
        finally {
            dou.d((ByteBuffer)this.a);
        }
    }
}
