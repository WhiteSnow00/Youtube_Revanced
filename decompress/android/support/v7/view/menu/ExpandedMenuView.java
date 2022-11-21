// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements AdapterView$OnItemClickListener, im, jc
{
    private static final int[] a;
    private in b;
    
    static {
        a = new int[] { 16842964, 16843049 };
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set) {
        this(context, set, 16842868);
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final cdr w = cdr.w(context, set, ExpandedMenuView.a, n, 0);
        if (w.q(0)) {
            this.setBackgroundDrawable(w.k(0));
        }
        if (w.q(1)) {
            this.setDivider(w.k(1));
        }
        w.o();
    }
    
    public final void a(final in b) {
        this.b = b;
    }
    
    public final boolean b(final ip ip) {
        throw null;
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.b.z((MenuItem)this.getAdapter().getItem(n), 0);
    }
}
