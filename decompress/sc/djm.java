import java.util.List;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djm implements ddr
{
    private final int a;
    private final Object b;
    
    public djm(final int a) {
        this.a = a;
        this.b = new djj();
    }
    
    public djm(final int a, final byte[] array) {
        this.a = a;
        this.b = new djj();
    }
    
    public djm(final dgg b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public djm(final dkb b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public djm(final dml b, final int a, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final dfy a(final Object o, final int n, final int n2, final ddp ddp) {
        final int a = this.a;
        if (a == 0) {
            return ((djj)this.b).c(ImageDecoder.createSource((ByteBuffer)o), n, n2, ddp);
        }
        if (a == 1) {
            final ByteBuffer byteBuffer = (ByteBuffer)o;
            final dkb dkb = (dkb)this.b;
            return dkb.a((dkj)new dki(byteBuffer, dkb.g, dkb.f, 1), n, n2, ddp, dkb.e);
        }
        if (a == 2) {
            return ((djj)this.b).c(ImageDecoder.createSource(dou.c((InputStream)o)), n, n2, ddp);
        }
        if (a == 3) {
            final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)o;
            final dkb dkb2 = (dkb)this.b;
            return dkb2.a((dkj)new dki(parcelFileDescriptor, dkb2.g, dkb2.f, 2), n, n2, ddp, dkb.e);
        }
        if (a == 4) {
            return dml.d(ImageDecoder.createSource((ByteBuffer)o), n, n2, ddp);
        }
        if (a != 5) {
            return djk.f(((dcu)o).a(), (dgg)this.b);
        }
        return dml.d(ImageDecoder.createSource(dou.c((InputStream)o)), n, n2, ddp);
    }
    
    @Override
    public final boolean b(final Object o, final ddp ddp) {
        final int a = this.a;
        if (a == 0) {
            final ByteBuffer byteBuffer = (ByteBuffer)o;
            return true;
        }
        if (a == 1) {
            final ByteBuffer byteBuffer2 = (ByteBuffer)o;
            return true;
        }
        if (a == 2) {
            final InputStream inputStream = (InputStream)o;
            return true;
        }
        if (a == 3) {
            final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)o;
            return ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && !"HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || parcelFileDescriptor.getStatSize() <= 536870912L) && dem.d();
        }
        if (a == 4) {
            return dml.e(cka.j((List)((dml)this.b).a, (ByteBuffer)o));
        }
        if (a != 5) {
            final dcu dcu = (dcu)o;
            return true;
        }
        final InputStream inputStream2 = (InputStream)o;
        final dml dml = (dml)this.b;
        return dml.e(cka.k((List)dml.a, inputStream2, (dge)dml.b));
    }
}
