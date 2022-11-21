import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwi extends Property
{
    public adwi(final Class clazz) {
        super(clazz, "height");
    }
    
    public final /* bridge */ Object get(final Object o) {
        return ((View)o).getLayoutParams().height;
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final View view = (View)o;
        view.getLayoutParams().height = ((Float)o2).intValue();
        view.requestLayout();
    }
}
