import java.io.File;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlg implements ddr
{
    private final int a;
    
    public dlg(final int a) {
        this.a = a;
    }
    
    @Override
    public final dfy a(final Object o, int a, final int n, final ddp ddp) {
        a = this.a;
        if (a == 0) {
            return dle.g((Drawable)o);
        }
        if (a != 1) {
            return new dje(o);
        }
        return new dla((Bitmap)o, 1);
    }
    
    @Override
    public final boolean b(final Object o, final ddp ddp) {
        final int a = this.a;
        if (a == 0) {
            final Drawable drawable = (Drawable)o;
            return true;
        }
        if (a != 1) {
            final File file = (File)o;
            return true;
        }
        final Bitmap bitmap = (Bitmap)o;
        return true;
    }
}
