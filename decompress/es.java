import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.support.v7.app.AlertController$RecycleListView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class es implements AdapterView$OnItemClickListener
{
    final AlertController$RecycleListView a;
    final ew b;
    final et c;
    
    public es(final et c, final AlertController$RecycleListView a, final ew b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final boolean[] s = this.c.s;
        if (s != null) {
            s[n] = this.a.isItemChecked(n);
        }
        this.c.w.onClick((DialogInterface)this.b.b, n, this.a.isItemChecked(n));
    }
}
