import android.widget.Filter;
import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObserver;
import android.database.Cursor;
import android.widget.Filterable;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class apz extends BaseAdapter implements Filterable, aqa
{
    private aqb a;
    public boolean b;
    public final boolean c;
    public Cursor d;
    public int e;
    public final apx f;
    public final DataSetObserver g;
    
    public apz() {
        this.c = true;
        this.d = null;
        this.b = false;
        this.e = -1;
        this.f = new apx(this);
        this.g = (DataSetObserver)new apy(this);
    }
    
    public Cursor a(final CharSequence charSequence) {
        throw null;
    }
    
    public CharSequence b(final Cursor cursor) {
        throw null;
    }
    
    public void d(final Cursor cursor) {
        throw null;
    }
    
    public abstract void e(final View p0, final Cursor p1);
    
    public abstract View f(final ViewGroup p0);
    
    public final Cursor g() {
        return this.d;
    }
    
    public final int getCount() {
        if (this.b) {
            final Cursor d = this.d;
            if (d != null) {
                return d.getCount();
            }
        }
        return 0;
    }
    
    public View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        if (this.b) {
            final Cursor d = this.d;
            if (d != null) {
                d.moveToPosition(n);
                View h;
                if ((h = view) == null) {
                    h = this.h(viewGroup);
                }
                this.e(h, this.d);
                return h;
            }
        }
        return null;
    }
    
    public final Filter getFilter() {
        if (this.a == null) {
            this.a = new aqb((aqa)this);
        }
        return (Filter)this.a;
    }
    
    public final Object getItem(final int n) {
        if (this.b) {
            final Cursor d = this.d;
            if (d != null) {
                d.moveToPosition(n);
                return this.d;
            }
        }
        return null;
    }
    
    public final long getItemId(final int n) {
        if (this.b) {
            final Cursor d = this.d;
            if (d != null && d.moveToPosition(n)) {
                return this.d.getLong(this.e);
            }
        }
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        final Cursor d = this.d;
        if (d == null) {
            throw new IllegalStateException("this should only be called when the cursor is non-null");
        }
        if (d.moveToPosition(n)) {
            View f;
            if ((f = view) == null) {
                f = this.f(viewGroup);
            }
            this.e(f, this.d);
            return f;
        }
        final StringBuilder sb = new StringBuilder("couldn't move cursor to position ");
        sb.append(n);
        throw new IllegalStateException(sb.toString());
    }
    
    public View h(final ViewGroup viewGroup) {
        throw null;
    }
    
    public boolean hasStableIds() {
        return true;
    }
}
