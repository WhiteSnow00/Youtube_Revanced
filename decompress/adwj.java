import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwj extends Property
{
    public adwj(final Class clazz) {
        super(clazz, "paddingStart");
    }
    
    public final /* bridge */ Object get(final Object o) {
        return anc.j((View)o);
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final View view = (View)o;
        anc.ab(view, ((Float)o2).intValue(), view.getPaddingTop(), anc.i(view), view.getPaddingBottom());
    }
}
