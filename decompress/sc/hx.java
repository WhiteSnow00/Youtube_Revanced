import android.widget.EdgeEffect;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import java.util.List;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public class hx
{
    static void a(final Window$Callback window$Callback, final List list, final Menu menu, final int n) {
        window$Callback.onProvideKeyboardShortcuts(list, menu, n);
    }
    
    public EdgeEffect b(final RecyclerView recyclerView, final int n) {
        return new EdgeEffect(recyclerView.getContext());
    }
}
