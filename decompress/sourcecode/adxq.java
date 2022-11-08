import com.google.android.material.tabs.TabLayout;
import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxq extends DataSetObserver
{
    final /* synthetic */ TabLayout a;
    
    public adxq(final TabLayout a) {
        this.a = a;
    }
    
    public final void onChanged() {
        this.a.h();
    }
    
    public final void onInvalidated() {
        this.a.h();
    }
}
