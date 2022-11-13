import android.util.Size;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import android.os.Build$VERSION;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.graphics.ImageDecoder$Source;
import android.graphics.ImageDecoder$ImageInfo;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djd implements ImageDecoder$OnHeaderDecodedListener
{
    private final dkh a;
    private final int b;
    private final int c;
    private final ddb d;
    private final djy e;
    private final boolean f;
    private final ddq g;
    
    public djd(final int b, final int c, final ddp ddp) {
        this.a = dkh.a();
        this.b = b;
        this.c = c;
        this.d = (ddb)ddp.b(dkb.a);
        this.e = (djy)ddp.b(djy.f);
        final Object b2 = ddp.b(dkb.d);
        boolean f = false;
        if (b2 != null) {
            f = f;
            if (ddp.b(dkb.d)) {
                f = true;
            }
        }
        this.f = f;
        this.g = (ddq)ddp.b(dkb.b);
    }
    
    public final void onHeaderDecoded(final ImageDecoder imageDecoder, final ImageDecoder$ImageInfo imageDecoder$ImageInfo, final ImageDecoder$Source imageDecoder$Source) {
        if (this.a.c(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        }
        else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == ddb.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener((ImageDecoder$OnPartialImageListener)new djc());
        final Size size = imageDecoder$ImageInfo.getSize();
        int n;
        if ((n = this.b) == Integer.MIN_VALUE) {
            n = size.getWidth();
        }
        int n2;
        if ((n2 = this.c) == Integer.MIN_VALUE) {
            n2 = size.getHeight();
        }
        final float a = this.e.a(size.getWidth(), size.getHeight(), n, n2);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * a), Math.round(a * size.getHeight()));
        if (this.g != null) {
            if (Build$VERSION.SDK_INT >= 28) {
                ColorSpace$Named colorSpace$Named;
                if (this.g == ddq.b && imageDecoder$ImageInfo.getColorSpace() != null && imageDecoder$ImageInfo.getColorSpace().isWideGamut()) {
                    colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
                }
                else {
                    colorSpace$Named = ColorSpace$Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(colorSpace$Named));
                return;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace$Named.SRGB));
        }
    }
}
