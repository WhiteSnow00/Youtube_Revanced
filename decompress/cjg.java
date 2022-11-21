import android.graphics.Rect;
import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjg extends Property
{
    public cjg(final Class clazz) {
        super(clazz, "clipBounds");
    }
    
    public final Object get(final Object o) {
        return anc.n((View)o);
    }
    
    public final void set(final Object o, final Object o2) {
        anc.T((View)o, (Rect)o2);
    }
}
