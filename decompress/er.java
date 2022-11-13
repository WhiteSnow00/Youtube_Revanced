import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.support.v7.app.AlertController$RecycleListView;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class er extends ArrayAdapter
{
    final AlertController$RecycleListView a;
    final et b;
    
    public er(final et b, final Context context, final int n, final CharSequence[] array, final AlertController$RecycleListView a) {
        this.b = b;
        this.a = a;
        super(context, n, 16908308, (Object[])array);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final View view2 = super.getView(n, view, viewGroup);
        final boolean[] s = this.b.s;
        if (s != null && s[n]) {
            this.a.setItemChecked(n, true);
        }
        return view2;
    }
}
