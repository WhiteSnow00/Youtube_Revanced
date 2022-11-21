import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class chy extends Property
{
    private final Rect a;
    
    public chy(final Class clazz) {
        super(clazz, "boundsOrigin");
        this.a = new Rect();
    }
    
    public final /* bridge */ Object get(final Object o) {
        ((Drawable)o).copyBounds(this.a);
        return new PointF((float)this.a.left, (float)this.a.top);
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final Drawable drawable = (Drawable)o;
        final PointF pointF = (PointF)o2;
        drawable.copyBounds(this.a);
        this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.a);
    }
}
