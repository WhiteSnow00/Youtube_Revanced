import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class adwk extends Property
{
    public adwk(final Class clazz) {
        super(clazz, "paddingEnd");
    }
    
    public final /* bridge */ Object get(final Object o) {
        return anc.i((View)o);
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        final View view = (View)o;
        anc.ab(view, anc.j(view), view.getPaddingTop(), ((Float)o2).intValue(), view.getPaddingBottom());
    }
}
