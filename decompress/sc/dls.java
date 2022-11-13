import java.io.OutputStream;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.content.res.Resources;
import android.graphics.Bitmap$CompressFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dls implements dlu
{
    private final int a;
    private final Object b;
    
    public dls(final int a) {
        this.a = a;
        final Bitmap$CompressFormat jpeg = Bitmap$CompressFormat.JPEG;
        this.b = jpeg;
    }
    
    public dls(final Resources b, final int a) {
        this.a = a;
        clm.h((Object)b);
        this.b = b;
    }
    
    public final dfy a(final dfy dfy, final ddp ddp) {
        if (this.a != 0) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ((Bitmap)dfy.c()).compress((Bitmap$CompressFormat)this.b, 100, (OutputStream)byteArrayOutputStream);
            dfy.e();
            return new dla(byteArrayOutputStream.toByteArray(), 0);
        }
        return dkk.f((Resources)this.b, dfy);
    }
}
