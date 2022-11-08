import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dji implements ddq
{
    private final dgf a;
    
    public dji() {
        this.a = (dgf)new dgg();
    }
    
    public final dfx c(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final ddo ddo) {
        return (dfx)new djj(ImageDecoder.decodeBitmap(imageDecoder$Source, (ImageDecoder$OnHeaderDecodedListener)new djc(n, n2, ddo)), this.a);
    }
}
