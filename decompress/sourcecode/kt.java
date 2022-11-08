import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ThemedSpinnerAdapter;
import android.content.res.Resources$Theme;
import android.widget.SpinnerAdapter;
import android.widget.ListAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kt implements ListAdapter, SpinnerAdapter
{
    private final SpinnerAdapter a;
    private ListAdapter b;
    
    public kt(final SpinnerAdapter a, final Resources$Theme resources$Theme) {
        this.a = a;
        if (a instanceof ListAdapter) {
            this.b = (ListAdapter)a;
        }
        if (resources$Theme != null) {
            if (!(a instanceof ThemedSpinnerAdapter)) {
                if (a instanceof pm) {
                    final pm pm = (pm)a;
                    if (pm.a() == null) {
                        pm.b();
                    }
                }
            }
            else {
                kr.a((ThemedSpinnerAdapter)a, resources$Theme);
            }
        }
    }
    
    public final boolean areAllItemsEnabled() {
        final ListAdapter b = this.b;
        return b == null || b.areAllItemsEnabled();
    }
    
    public final int getCount() {
        final SpinnerAdapter a = this.a;
        if (a == null) {
            return 0;
        }
        return a.getCount();
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        final SpinnerAdapter a = this.a;
        if (a == null) {
            return null;
        }
        return a.getDropDownView(n, view, viewGroup);
    }
    
    public final Object getItem(final int n) {
        final SpinnerAdapter a = this.a;
        if (a == null) {
            return null;
        }
        return a.getItem(n);
    }
    
    public final long getItemId(final int n) {
        final SpinnerAdapter a = this.a;
        if (a == null) {
            return -1L;
        }
        return a.getItemId(n);
    }
    
    public final int getItemViewType(final int n) {
        return 0;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.getDropDownView(n, view, viewGroup);
    }
    
    public final int getViewTypeCount() {
        return 1;
    }
    
    public final boolean hasStableIds() {
        final SpinnerAdapter a = this.a;
        return a != null && a.hasStableIds();
    }
    
    public final boolean isEmpty() {
        return this.getCount() == 0;
    }
    
    public final boolean isEnabled(final int n) {
        final ListAdapter b = this.b;
        return b == null || b.isEnabled(n);
    }
    
    public final void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        final SpinnerAdapter a = this.a;
        if (a != null) {
            a.registerDataSetObserver(dataSetObserver);
        }
    }
    
    public final void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        final SpinnerAdapter a = this.a;
        if (a != null) {
            a.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
