import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import android.widget.PopupWindow$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcb implements PopupWindow$OnDismissListener
{
    private final Set a;
    
    public adcb(final Context context, final veh veh) {
        context.getClass();
        veh.getClass();
        this.a = new HashSet();
    }
    
    public final void onDismiss() {
        this.a.add(null);
    }
}
