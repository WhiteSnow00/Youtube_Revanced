import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aajw implements View$OnClickListener
{
    final int a;
    final Object b;
    final Object c;
    private final int d;
    
    public aajw(final NonScrollableListView c, final int a, final ListAdapter b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aajw(final wxm c, final int a, final ImageView b, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        if (this.d != 0) {
            final wxm wxm = (wxm)this.c;
            int a;
            if (wxm.a == (a = this.a)) {
                a = 0;
            }
            wxm.a = a;
            wxm.d();
            final wxm wxm2 = (wxm)this.c;
            ((ImageView)this.b).setImageDrawable(((ImageView)((ViewGroup)wxm2.d).getChildAt(wxm2.a).findViewById(2131429016)).getDrawable());
            return;
        }
        final AdapterView$OnItemClickListener c = ((NonScrollableListView)this.c).c;
        if (c != null) {
            final int a2 = this.a;
            c.onItemClick((AdapterView)null, view, a2, ((ListAdapter)this.b).getItemId(a2));
        }
    }
}
