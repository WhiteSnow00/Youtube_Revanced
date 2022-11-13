import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dla implements dfy
{
    private final int a;
    private final Object b;
    
    public dla(final Bitmap b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dla(final AnimatedImageDrawable b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public dla(final byte[] array, final int a) {
        this.a = a;
        this.b = clm.h((Object)array);
    }
    
    @Override
    public final int a() {
        final int a = this.a;
        if (a == 0) {
            return ((byte[])this.b).length;
        }
        if (a != 1) {
            final int n = ((AnimatedImageDrawable)this.b).getIntrinsicWidth() * ((AnimatedImageDrawable)this.b).getIntrinsicHeight() * dph.b(Bitmap$Config.ARGB_8888);
            return n + n;
        }
        return dph.a((Bitmap)this.b);
    }
    
    @Override
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
    
    @Override
    public final Object c() {
        final int a = this.a;
        if (a == 0) {
            return this.b;
        }
        if (a != 1) {
            return this.b;
        }
        return this.b;
    }
    
    @Override
    public final void e() {
        final int a = this.a;
        if (a != 0 && a != 1) {
            ((AnimatedImageDrawable)this.b).stop();
            ((AnimatedImageDrawable)this.b).clearAnimationCallbacks();
        }
    }
}
