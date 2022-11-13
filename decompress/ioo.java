import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ioo implements czv
{
    public final int a;
    
    public ioo(final int a) {
        this.a = a;
    }
    
    @Override
    public final Object a() {
        return new PorterDuffColorFilter(this.a, PorterDuff$Mode.SRC_ATOP);
    }
}
