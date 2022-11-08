import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import java.nio.ByteBuffer;
import java.io.InputStream;
import android.os.ParcelFileDescriptor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkh implements dki
{
    private final List a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;
    
    public dkh(final ParcelFileDescriptor parcelFileDescriptor, final List a, final dgd d, final int b) {
        this.b = b;
        cll.h((Object)d);
        this.d = d;
        cll.h((Object)a);
        this.a = a;
        this.c = new del(parcelFileDescriptor);
    }
    
    public dkh(final InputStream inputStream, final List a, final dgd d, final int b) {
        this.b = b;
        cll.h((Object)d);
        this.d = d;
        cll.h((Object)a);
        this.a = a;
        this.c = new dei(inputStream, d);
    }
    
    public dkh(final ByteBuffer d, final List a, final dgd c, final int b) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public final int a() {
        final int b = this.b;
        if (b == 0) {
            return cjz.h(this.a, ((dei)this.c).c(), (dgd)this.d);
        }
        if (b != 1) {
            return cjz.i(this.a, (ddh)new ddg((del)this.c, (dgd)this.d, 2));
        }
        final List a = this.a;
        final ByteBuffer d = dot.d((ByteBuffer)this.d);
        final Object c = this.c;
        if (d == null) {
            return -1;
        }
        return cjz.i(a, (ddh)new ddg(d, (dgd)c, 1));
    }
    
    public final Bitmap b(final BitmapFactory$Options bitmapFactory$Options) {
        final int b = this.b;
        if (b == 0) {
            return BitmapFactory.decodeStream(((dei)this.c).c(), (Rect)null, bitmapFactory$Options);
        }
        if (b != 1) {
            return BitmapFactory.decodeFileDescriptor(((del)this.c).c().getFileDescriptor(), (Rect)null, bitmapFactory$Options);
        }
        return BitmapFactory.decodeStream(dot.a(dot.d((ByteBuffer)this.d)), (Rect)null, bitmapFactory$Options);
    }
    
    public final ImageHeaderParser$ImageType c() {
        final int b = this.b;
        if (b == 0) {
            return cjz.k(this.a, ((dei)this.c).c(), (dgd)this.d);
        }
        if (b != 1) {
            return cjz.l(this.a, (ddi)new ddf((del)this.c, (dgd)this.d));
        }
        return cjz.j(this.a, dot.d((ByteBuffer)this.d));
    }
    
    public final void d() {
        if (this.b != 0) {
            return;
        }
        ((dei)this.c).a.a();
    }
}
