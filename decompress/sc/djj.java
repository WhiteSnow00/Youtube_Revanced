import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djj implements ddr
{
    private final dgg a;
    
    public djj() {
        this.a = (dgg)new dgh();
    }
    
    @Override
    public final /* bridge */ dfy a(final Object o, final int n, final int n2, final ddp ddp) {
        return this.c((ImageDecoder$Source)o, n, n2, ddp);
    }
    
    @Override
    public final /* bridge */ boolean b(final Object o, final ddp ddp) {
        final ImageDecoder$Source imageDecoder$Source = (ImageDecoder$Source)o;
        return true;
    }
    
    public final dfy c(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final ddp ddp) {
        return new djk(ImageDecoder.decodeBitmap(imageDecoder$Source, (ImageDecoder$OnHeaderDecodedListener)new djd(n, n2, ddp)), this.a);
    }
}
