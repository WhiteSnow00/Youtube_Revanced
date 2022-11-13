import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlt implements dlu
{
    private final dgg a;
    private final dlu b;
    private final dlu c;
    
    public dlt(final dgg a, final dlu b, final dlu c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final dfy a(final dfy dfy, final ddp ddp) {
        final Drawable drawable = (Drawable)dfy.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a((dfy)djk.f(((BitmapDrawable)drawable).getBitmap(), this.a), ddp);
        }
        if (drawable instanceof dlj) {
            return this.c.a(dfy, ddp);
        }
        return null;
    }
}
