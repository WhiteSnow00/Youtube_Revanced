import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwh extends Property
{
    public adwh(final Class clazz) {
        super(clazz, "width");
    }
    
    public final /* bridge */ Object get(final Object o) {
        return ((View)o).getLayoutParams().width;
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final View view = (View)o;
        view.getLayoutParams().width = ((Float)o2).intValue();
        view.requestLayout();
    }
}
