import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.util.Log;
import org.aomedia.avif.android.AvifDecoder$Info;
import org.aomedia.avif.android.AvifDecoder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcy implements ddr
{
    private final dgg a;
    
    public dcy(final dgg a) {
        clm.h((Object)a);
        this.a = a;
    }
    
    private static final ByteBuffer d(final ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            return byteBuffer;
        }
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.put(byteBuffer);
        allocateDirect.flip();
        return allocateDirect;
    }
    
    public final /* bridge */ dfy a(final Object o, final int n, final int n2, final ddp ddp) {
        return this.c((ByteBuffer)o, ddp);
    }
    
    public final /* bridge */ boolean b(final Object o, final ddp ddp) {
        return AvifDecoder.a(d((ByteBuffer)o));
    }
    
    public final dfy c(final ByteBuffer byteBuffer, final ddp ddp) {
        final ByteBuffer d = d(byteBuffer);
        final AvifDecoder$Info avifDecoder$Info = new AvifDecoder$Info();
        if (!AvifDecoder.getInfo(d, d.remaining(), avifDecoder$Info)) {
            if (Log.isLoggable("AvifBitmapDecoder", 6)) {
                Log.e("AvifBitmapDecoder", "Requested to decode byte buffer which cannot be handled by AvifDecoder");
            }
            return null;
        }
        Bitmap$Config bitmap$Config;
        if (ddp.b(dkb.a) == ddb.b) {
            bitmap$Config = Bitmap$Config.RGB_565;
        }
        else if (avifDecoder$Info.depth == 8) {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        else {
            bitmap$Config = Bitmap$Config.RGBA_F16;
        }
        final Bitmap a = this.a.a(avifDecoder$Info.width, avifDecoder$Info.height, bitmap$Config);
        if (!AvifDecoder.decode(d, d.remaining(), a)) {
            if (Log.isLoggable("AvifBitmapDecoder", 6)) {
                Log.e("AvifBitmapDecoder", "Failed to decode ByteBuffer as Avif.");
            }
            this.a.d(a);
            return null;
        }
        return (dfy)djk.f(a, this.a);
    }
}
