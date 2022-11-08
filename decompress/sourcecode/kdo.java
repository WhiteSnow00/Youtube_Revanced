import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class kdo extends Drawable
{
    private final Paint a;
    private Path b;
    private Path c;
    
    public kdo() {
        this.a = new Paint(1);
    }
    
    public final void draw(final Canvas canvas) {
        this.a.setAlpha(128);
        canvas.drawPath(this.b, this.a);
        this.a.setAlpha(204);
        canvas.drawPath(this.c, this.a);
    }
    
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void setAlpha(final int n) {
    }
    
    public final void setBounds(final int n, final int n2, final int n3, final int n4) {
        super.setBounds(n, n2, n3, n4);
        final Path c = new Path();
        this.c = c;
        final float n5 = (float)n;
        final float n6 = (float)n2;
        c.moveTo(n5, n6);
        final float n7 = (float)(n3 - n);
        final float n8 = 0.1f * n7;
        this.c.lineTo((float)Math.round(n8), n6);
        final float n9 = 0.35f * n7;
        final float n10 = (n4 - n2) * 0.5f;
        this.c.lineTo((float)Math.round(n9), (float)Math.round(n10));
        final float n11 = (float)n4;
        this.c.lineTo((float)Math.round(n8), n11);
        this.c.lineTo(n5, n11);
        this.c.close();
        (this.b = new Path()).moveTo(n5, n6);
        this.b.lineTo((float)Math.round(n8), n6);
        this.b.lineTo((float)Math.round(n9), (float)Math.round(n10));
        this.b.lineTo((float)Math.round(n7 * 0.6f), n11);
        this.b.lineTo(n5, n11);
        this.b.close();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
