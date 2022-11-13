import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnClickListener;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.util.SparseArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.widget.ListAdapter;
import android.content.DialogInterface$OnDismissListener;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ii implements AdapterView$OnItemClickListener, iz
{
    Context a;
    public LayoutInflater b;
    im c;
    public ExpandedMenuView d;
    public iy e;
    public ih f;
    
    public ii(final Context a) {
        this.a = a;
        this.b = LayoutInflater.from(a);
    }
    
    public final int a() {
        return 0;
    }
    
    public final void c(final Context a, final im c) {
        if (this.a != null) {
            this.a = a;
            if (this.b == null) {
                this.b = LayoutInflater.from(a);
            }
        }
        this.c = c;
        final ih f = this.f;
        if (f != null) {
            f.notifyDataSetChanged();
        }
    }
    
    public final void d(final im im, final boolean b) {
        final iy e = this.e;
        if (e != null) {
            e.a(im, b);
        }
    }
    
    public final void e(final iy iy) {
        throw null;
    }
    
    public final boolean f() {
        return false;
    }
    
    public final boolean g(final jg jg) {
        if (!((im)jg).hasVisibleItems()) {
            return false;
        }
        final in in = new in((im)jg);
        final im a = in.a;
        final ex ex = new ex(a.a);
        in.c = new ii(ex.a());
        final ii c = in.c;
        c.e = (iy)in;
        in.a.g((iz)c);
        final ListAdapter k = in.c.k();
        final et a2 = ex.a;
        a2.p = k;
        a2.q = (DialogInterface$OnClickListener)in;
        final View g = a.g;
        if (g != null) {
            ex.d(g);
        }
        else {
            ex.e(a.f);
            ex.o(a.e);
        }
        ex.a.n = (DialogInterface$OnKeyListener)in;
        (in.b = ex.b()).setOnDismissListener((DialogInterface$OnDismissListener)in);
        final WindowManager$LayoutParams attributes = in.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 0x20000;
        in.b.show();
        final iy e = this.e;
        if (e != null) {
            e.b((im)jg);
        }
        return true;
    }
    
    public final boolean h(final io io) {
        return false;
    }
    
    public final boolean i(final io io) {
        return false;
    }
    
    public final void j() {
        final ih f = this.f;
        if (f != null) {
            f.notifyDataSetChanged();
        }
    }
    
    public final ListAdapter k() {
        if (this.f == null) {
            this.f = new ih(this);
        }
        return (ListAdapter)this.f;
    }
    
    public final Parcelable kC() {
        if (this.d == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        final SparseArray sparseArray = new SparseArray();
        final ExpandedMenuView d = this.d;
        if (d != null) {
            ((View)d).saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return (Parcelable)bundle;
    }
    
    public final void n(final Parcelable parcelable) {
        final SparseArray sparseParcelableArray = ((Bundle)parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            ((View)this.d).restoreHierarchyState(sparseParcelableArray);
        }
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.c.A((MenuItem)this.f.a(n), (iz)this, 0);
    }
}
