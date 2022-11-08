import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkj implements dfx, dfu
{
    private final Resources a;
    private final dfx b;
    
    private dkj(final Resources a, final dfx b) {
        cll.h((Object)a);
        this.a = a;
        cll.h((Object)b);
        this.b = b;
    }
    
    public static dfx f(final Resources resources, final dfx dfx) {
        if (dfx == null) {
            return null;
        }
        return (dfx)new dkj(resources, dfx);
    }
    
    public final int a() {
        return this.b.a();
    }
    
    public final Class b() {
        return BitmapDrawable.class;
    }
    
    public final void d() {
        final dfx b = this.b;
        if (b instanceof dfu) {
            ((dfu)b).d();
        }
    }
    
    public final void e() {
        this.b.e();
    }
}
