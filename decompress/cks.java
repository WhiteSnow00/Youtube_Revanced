import android.view.View;
import android.view.ViewGroup;
import android.os.Parcelable;
import android.database.DataSetObservable;
import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cks
{
    private DataSetObserver a;
    public final DataSetObservable b;
    
    public cks() {
        this.b = new DataSetObservable();
    }
    
    public Parcelable a() {
        return null;
    }
    
    public Object c(final ViewGroup viewGroup, final int n) {
        throw null;
    }
    
    public void d(final ViewGroup viewGroup, final int n, final Object o) {
        throw null;
    }
    
    public void e(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    public void f(final ViewGroup viewGroup) {
    }
    
    public abstract boolean g(final View p0, final Object p1);
    
    public void h() {
    }
    
    public void i(final ViewGroup viewGroup, final Object o) {
    }
    
    public abstract int j();
    
    public int k(final Object o) {
        return -1;
    }
    
    public CharSequence l(final int n) {
        return null;
    }
    
    public final void m() {
        synchronized (this) {
            final DataSetObserver a = this.a;
            if (a != null) {
                a.onChanged();
            }
            monitorexit(this);
            this.b.notifyChanged();
        }
    }
    
    public final void n(final DataSetObserver a) {
        synchronized (this) {
            this.a = a;
        }
    }
}
