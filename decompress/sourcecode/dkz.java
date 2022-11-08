import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkz implements dfx
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public dkz(final Bitmap b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dkz(final AnimatedImageDrawable b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dkz(final byte[] array, final int a) {
        this.a = a;
        this.b = cll.h((Object)array);
    }
    
    public final int a() {
        final int a = this.a;
        if (a == 0) {
            return ((byte[])this.b).length;
        }
        if (a != 1) {
            final int n = ((AnimatedImageDrawable)this.b).getIntrinsicWidth() * ((AnimatedImageDrawable)this.b).getIntrinsicHeight() * dpg.c(Bitmap$Config.ARGB_8888);
            return n + n;
        }
        return dpg.a((Bitmap)this.b);
    }
    
    public final Class b() {
        final int a = this.a;
        if (a == 0) {
            return byte[].class;
        }
        if (a != 1) {
            return Drawable.class;
        }
        return Bitmap.class;
    }
    
    public final void e() {
        final int a = this.a;
        if (a != 0 && a != 1) {
            ((AnimatedImageDrawable)this.b).stop();
            ((AnimatedImageDrawable)this.b).clearAnimationCallbacks();
        }
    }
}
