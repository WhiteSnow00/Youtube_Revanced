import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView;
import android.view.MenuItem;
import android.widget.HeaderViewListAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.widget.ListAdapter;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class iv implements AdapterView$OnItemClickListener, jd, iz
{
    public Rect g;
    
    public iv() {
    }
    
    protected static int A(final ListAdapter listAdapter, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = listAdapter.getCount();
        ViewGroup viewGroup = null;
        View view = null;
        int n2 = 0;
        int n3 = 0;
        while (i < count) {
            final int itemViewType = listAdapter.getItemViewType(i);
            int n4;
            if (itemViewType != n3) {
                n4 = itemViewType;
            }
            else {
                n4 = n3;
            }
            View view2 = view;
            if (itemViewType != n3) {
                view2 = null;
            }
            Object o;
            if ((o = viewGroup) == null) {
                o = new FrameLayout(context);
            }
            final View view3 = listAdapter.getView(i, view2, (ViewGroup)o);
            view3.measure(measureSpec, measureSpec2);
            final int measuredWidth = view3.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n2 = n5;
            n3 = n4;
            viewGroup = (ViewGroup)o;
            view = view3;
        }
        return n2;
    }
    
    protected static ij y(final ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (ij)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (ij)listAdapter;
    }
    
    protected static boolean z(final im im) {
        final int size = im.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = im.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final int a() {
        return 0;
    }
    
    public final void c(final Context context, final im im) {
    }
    
    public final boolean h(final io io) {
        return false;
    }
    
    public final boolean i(final io io) {
        return false;
    }
    
    public abstract void l(final im p0);
    
    public abstract void o(final View p0);
    
    public final void onItemClick(final AdapterView adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        final im a = y(listAdapter).a;
        final MenuItem menuItem = (MenuItem)listAdapter.getItem(n);
        if (!this.w()) {
            n = 4;
        }
        else {
            n = 0;
        }
        a.A(menuItem, (iz)this, n);
    }
    
    public abstract void p(final boolean p0);
    
    public abstract void q(final int p0);
    
    public abstract void r(final int p0);
    
    public abstract void s(final PopupWindow$OnDismissListener p0);
    
    public abstract void t(final boolean p0);
    
    public abstract void u(final int p0);
    
    protected boolean w() {
        return true;
    }
}
