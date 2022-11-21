import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aajx extends DataSetObserver
{
    final NonScrollableListView a;
    
    protected aajx(final NonScrollableListView a) {
        this.a = a;
    }
    
    public final void onChanged() {
        final NonScrollableListView a = this.a;
        if (a.b != null) {
            a.a();
        }
    }
    
    public final void onInvalidated() {
        this.onChanged();
    }
}
