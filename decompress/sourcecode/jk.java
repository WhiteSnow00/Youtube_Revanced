import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Canvas;
import android.support.v7.widget.ActionBarContainer;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jk extends Drawable
{
    final ActionBarContainer a;
    
    public jk(final ActionBarContainer a) {
        this.a = a;
    }
    
    public final void draw(final Canvas canvas) {
        final ActionBarContainer a = this.a;
        if (a.d) {
            final Drawable c = a.c;
            if (c != null) {
                c.draw(canvas);
            }
        }
        else {
            final Drawable a2 = a.a;
            if (a2 != null) {
                a2.draw(canvas);
            }
            final ActionBarContainer a3 = this.a;
            if (a3.b != null) {
                final boolean e = a3.e;
            }
        }
    }
    
    public final int getOpacity() {
        return 0;
    }
    
    public final void getOutline(final Outline outline) {
        final ActionBarContainer a = this.a;
        if (a.d) {
            if (a.c != null) {
                a.a.getOutline(outline);
            }
        }
        else {
            final Drawable a2 = a.a;
            if (a2 != null) {
                a2.getOutline(outline);
            }
        }
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
    }
}
