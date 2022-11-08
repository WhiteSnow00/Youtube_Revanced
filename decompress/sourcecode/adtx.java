import android.view.View;
import com.google.android.material.internal.ParcelableSparseArray;
import android.util.SparseArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtx implements iz
{
    public int A;
    final View$OnClickListener B;
    public NavigationMenuView a;
    public LinearLayout b;
    public im c;
    public int d;
    public adtq e;
    public LayoutInflater f;
    public int g;
    public ColorStateList h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public RippleDrawable m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    int z;
    
    public adtx() {
        this.g = 0;
        this.i = 0;
        this.w = true;
        this.A = -1;
        this.B = (View$OnClickListener)new acsj(this, 12);
    }
    
    public final int a() {
        return this.d;
    }
    
    public final void c(final Context context, final im c) {
        this.f = LayoutInflater.from(context);
        this.c = c;
        this.z = context.getResources().getDimensionPixelOffset(2131166274);
    }
    
    public final void d(final im im, final boolean b) {
    }
    
    public final void e(final iy iy) {
        throw null;
    }
    
    public final boolean f() {
        return false;
    }
    
    public final boolean g(final jg jg) {
        return false;
    }
    
    public final boolean h(final io io) {
        return false;
    }
    
    public final boolean i(final io io) {
        return false;
    }
    
    public final void j() {
        final adtq e = this.e;
        if (e != null) {
            e.b();
            e.rT();
        }
    }
    
    public final void k(final int n) {
        this.A = n;
        final NavigationMenuView a = this.a;
        if (a != null) {
            a.setOverScrollMode(n);
        }
    }
    
    public final Parcelable kC() {
        final Bundle bundle = new Bundle();
        if (this.a != null) {
            final SparseArray sparseArray = new SparseArray();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        final adtq e = this.e;
        if (e != null) {
            final Bundle bundle2 = new Bundle();
            final io e2 = e.e;
            if (e2 != null) {
                bundle2.putInt("android:menu:checked", e2.a);
            }
            final SparseArray sparseArray2 = new SparseArray();
            for (int size = e.a.size(), i = 0; i < size; ++i) {
                final adts adts = e.a.get(i);
                if (adts instanceof adtu) {
                    final io a = ((adtu)adts).a;
                    View actionView;
                    if (a != null) {
                        actionView = a.getActionView();
                    }
                    else {
                        actionView = null;
                    }
                    if (actionView != null) {
                        final ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState((SparseArray)parcelableSparseArray);
                        sparseArray2.put(a.a, (Object)parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.b != null) {
            final SparseArray sparseArray3 = new SparseArray();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return (Parcelable)bundle;
    }
    
    public final void l(final boolean f) {
        final adtq e = this.e;
        if (e != null) {
            e.f = f;
        }
    }
    
    public final void m() {
        int y;
        if (this.b.getChildCount() == 0 && this.w) {
            y = this.y;
        }
        else {
            y = 0;
        }
        final NavigationMenuView a = this.a;
        a.setPadding(0, y, 0, a.getPaddingBottom());
    }
    
    public final void n(final Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            final Bundle bundle = (Bundle)parcelable;
            final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            final Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                final adtq e = this.e;
                final int n = 0;
                final int int1 = bundle2.getInt("android:menu:checked", 0);
                if (int1 != 0) {
                    e.f = true;
                    for (int size = e.a.size(), i = 0; i < size; ++i) {
                        final adts adts = e.a.get(i);
                        if (adts instanceof adtu) {
                            final io a = ((adtu)adts).a;
                            if (a != null && a.a == int1) {
                                e.x(a);
                                break;
                            }
                        }
                    }
                    e.f = false;
                    e.b();
                }
                final SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    for (int size2 = e.a.size(), j = n; j < size2; ++j) {
                        final adts adts2 = e.a.get(j);
                        if (adts2 instanceof adtu) {
                            final io a2 = ((adtu)adts2).a;
                            if (a2 != null) {
                                final View actionView = a2.getActionView();
                                if (actionView != null) {
                                    final ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray)sparseParcelableArray2.get(a2.a);
                                    if (parcelableSparseArray != null) {
                                        actionView.restoreHierarchyState((SparseArray)parcelableSparseArray);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }
}
