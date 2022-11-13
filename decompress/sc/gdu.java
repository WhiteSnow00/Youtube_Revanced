import com.google.android.apps.youtube.app.common.ui.scrollselection.DefaultScrollSelectionController;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdu extends iw
{
    final ActiveStateScrollSelectionController a;
    
    public gdu(final ActiveStateScrollSelectionController a) {
        this.a = a;
    }
    
    @Override
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        ((DefaultScrollSelectionController)this.a).t();
    }
}
