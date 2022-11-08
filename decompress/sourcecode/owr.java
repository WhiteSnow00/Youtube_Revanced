import android.support.rastermill.FrameSequence;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owr implements ddq
{
    private final List a;
    private final dgf b;
    private final dgd c;
    
    public owr(final List a, final dgf b, final dgd c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final dfx c(final InputStream inputStream) {
        return (dfx)new ows(FrameSequence.decodeStream(inputStream), this.b);
    }
}
