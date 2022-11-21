import android.view.View;
import android.view.WindowId;

// 
// Decompiled by Procyon v0.6.0
// 

final class cjv
{
    private final WindowId a;
    
    public cjv(final View view) {
        this.a = view.getWindowId();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof cjv && ((cjv)o).a.equals((Object)this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
