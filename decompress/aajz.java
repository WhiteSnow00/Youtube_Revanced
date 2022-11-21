import android.widget.AdapterView;
import android.view.View;
import android.widget.Checkable;
import android.widget.ListView;
import android.content.Context;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aajz extends aakj implements AdapterView$OnItemClickListener
{
    public int a;
    private final NonScrollableListView c;
    
    public aajz(final Context context, final NonScrollableListView c) {
        super(context, null);
        this.a = -1;
        c.getClass();
        this.c = c;
    }
    
    public final void a(final int a) {
        this.a = a;
        for (int i = 0; i < this.c.getChildCount(); ++i) {
            final View child = this.c.getChildAt(i);
            if (child instanceof Checkable) {
                ((Checkable)child).setChecked(i == a);
            }
        }
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (this.a == n) {
            return;
        }
        this.a(n);
    }
}
