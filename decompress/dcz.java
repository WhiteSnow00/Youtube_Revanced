import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcz implements ddr
{
    private final List a;
    private final dcy b;
    private final dge c;
    
    public dcz(final List a, final dcy b, final dge c) {
        this.a = a;
        clm.h((Object)b);
        this.b = b;
        clm.h((Object)c);
        this.c = c;
    }
    
    public final /* bridge */ dfy a(final Object o, final int n, final int n2, final ddp ddp) {
        return this.b.c(dou.c((InputStream)o), ddp);
    }
    
    public final /* bridge */ boolean b(final Object o, final ddp ddp) {
        return ImageHeaderParser$ImageType.AVIF.equals((Object)cka.k(this.a, (InputStream)o, this.c));
    }
}
