import androidx.viewpager.widget.ViewPager;
import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckz extends DataSetObserver
{
    final ViewPager a;
    
    public ckz(final ViewPager a) {
        this.a = a;
    }
    
    public final void onChanged() {
        this.a.f();
    }
    
    public final void onInvalidated() {
        this.a.f();
    }
}
