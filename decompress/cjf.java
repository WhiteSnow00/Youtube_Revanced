import android.view.View;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjf extends Property
{
    public cjf(final Class clazz) {
        super(clazz, "translationAlpha");
    }
    
    public final /* bridge */ Object get(final Object o) {
        return cjh.a((View)o);
    }
    
    public final /* bridge */ void set(final Object o, final Object o2) {
        cjh.c((View)o, (float)o2);
    }
}
