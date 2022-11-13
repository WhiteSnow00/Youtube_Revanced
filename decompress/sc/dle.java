import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class dle extends dlc
{
    private dle(final Drawable drawable) {
        super(drawable);
    }
    
    static dfy g(final Drawable drawable) {
        if (drawable != null) {
            return new dle(drawable);
        }
        return null;
    }
    
    @Override
    public final int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }
    
    @Override
    public final Class b() {
        return this.a.getClass();
    }
    
    @Override
    public final void e() {
    }
}
