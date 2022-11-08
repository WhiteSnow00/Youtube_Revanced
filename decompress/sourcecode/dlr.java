import java.io.OutputStream;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import android.content.res.Resources;
import android.graphics.Bitmap$CompressFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlr implements dlt
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public dlr(final int a) {
        this.a = a;
        final Bitmap$CompressFormat jpeg = Bitmap$CompressFormat.JPEG;
        this.b = jpeg;
    }
    
    public dlr(final Resources b, final int a) {
        this.a = a;
        cll.h((Object)b);
        this.b = b;
    }
    
    public final dfx a(final dfx dfx, final ddo ddo) {
        if (this.a != 0) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ((Bitmap)dfx.c()).compress((Bitmap$CompressFormat)this.b, 100, (OutputStream)byteArrayOutputStream);
            dfx.e();
            return (dfx)new dkz(byteArrayOutputStream.toByteArray(), 0);
        }
        return dkj.f((Resources)this.b, dfx);
    }
}
