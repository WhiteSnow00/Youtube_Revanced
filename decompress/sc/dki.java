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

public final class dki implements dkj
{
    private final List a;
    private final int b;
    private final Object c;
    private final Object d;
    
    public dki(final ParcelFileDescriptor parcelFileDescriptor, final List a, final dge d, final int b) {
        this.b = b;
        clm.h((Object)d);
        this.d = d;
        clm.h((Object)a);
        this.a = a;
        this.c = new dem(parcelFileDescriptor);
    }
    
    public dki(final InputStream inputStream, final List a, final dge d, final int b) {
        this.b = b;
        clm.h((Object)d);
        this.d = d;
        clm.h((Object)a);
        this.a = a;
        this.c = new dej(inputStream, d);
    }
    
    public dki(final ByteBuffer d, final List a, final dge c, final int b) {
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public final int a() {
        final int b = this.b;
        if (b == 0) {
            return cka.h(this.a, ((dej)this.c).c(), (dge)this.d);
        }
        if (b != 1) {
            return cka.i(this.a, (ddi)new ddh((dem)this.c, (dge)this.d, 2));
        }
        final List a = this.a;
        final ByteBuffer d = dou.d((ByteBuffer)this.d);
        final Object c = this.c;
        if (d == null) {
            return -1;
        }
        return cka.i(a, (ddi)new ddh(d, (dge)c, 1));
    }
    
    public final Bitmap b(final BitmapFactory$Options bitmapFactory$Options) {
        final int b = this.b;
        if (b == 0) {
            return BitmapFactory.decodeStream(((dej)this.c).c(), (Rect)null, bitmapFactory$Options);
        }
        if (b != 1) {
            return BitmapFactory.decodeFileDescriptor(((dem)this.c).c().getFileDescriptor(), (Rect)null, bitmapFactory$Options);
        }
        return BitmapFactory.decodeStream(dou.a(dou.d((ByteBuffer)this.d)), (Rect)null, bitmapFactory$Options);
    }
    
    public final ImageHeaderParser$ImageType c() {
        final int b = this.b;
        if (b == 0) {
            return cka.k(this.a, ((dej)this.c).c(), (dge)this.d);
        }
        if (b != 1) {
            return cka.l(this.a, (ddj)new ddg((dem)this.c, (dge)this.d));
        }
        return cka.j(this.a, dou.d((ByteBuffer)this.d));
    }
    
    public final void d() {
        if (this.b != 0) {
            return;
        }
        ((dej)this.c).a.a();
    }
}
