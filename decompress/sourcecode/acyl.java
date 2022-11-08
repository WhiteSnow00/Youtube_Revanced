import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import android.widget.PopupWindow$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyl implements PopupWindow$OnDismissListener
{
    private final Set a;
    
    public acyl(final Context context, final vax vax) {
        context.getClass();
        vax.getClass();
        this.a = new HashSet();
    }
    
    public final void onDismiss() {
        this.a.add(null);
    }
}
