import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dls implements dlt
{
    private final dgf a;
    private final dlt b;
    private final dlt c;
    
    public dls(final dgf a, final dlt b, final dlt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final dfx a(final dfx dfx, final ddo ddo) {
        final Drawable drawable = (Drawable)dfx.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a((dfx)djj.f(((BitmapDrawable)drawable).getBitmap(), this.a), ddo);
        }
        if (drawable instanceof dli) {
            return this.c.a(dfx, ddo);
        }
        return null;
    }
}
