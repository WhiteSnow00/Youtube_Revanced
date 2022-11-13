import android.widget.ImageView;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ij extends BaseAdapter
{
    public final im a;
    public boolean b;
    private int c;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;
    
    public ij(final im a, final LayoutInflater e, final boolean d, final int f) {
        this.c = -1;
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.b();
    }
    
    public final io a(final int n) {
        ArrayList list;
        if (this.d) {
            list = this.a.e();
        }
        else {
            list = this.a.f();
        }
        final int c = this.c;
        int n2 = n;
        if (c >= 0 && (n2 = n) >= c) {
            n2 = n + 1;
        }
        return (io)list.get(n2);
    }
    
    final void b() {
        final im a = this.a;
        final io i = a.i;
        if (i != null) {
            final ArrayList e = a.e();
            for (int size = e.size(), j = 0; j < size; ++j) {
                if (e.get(j) == i) {
                    this.c = j;
                    return;
                }
            }
        }
        this.c = -1;
    }
    
    public final int getCount() {
        ArrayList list;
        if (this.d) {
            list = this.a.e();
        }
        else {
            list = this.a.f();
        }
        if (this.c < 0) {
            return list.size();
        }
        return list.size() - 1;
    }
    
    public final /* bridge */ Object getItem(final int n) {
        return this.a(n);
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final int n2 = 0;
        View inflate = view;
        if (view == null) {
            inflate = this.e.inflate(this.f, viewGroup, false);
        }
        final int b = this.a(n).b;
        final int n3 = n - 1;
        int b2;
        if (n3 >= 0) {
            b2 = this.a(n3).b;
        }
        else {
            b2 = b;
        }
        final ListMenuItemView listMenuItemView = (ListMenuItemView)inflate;
        final boolean b3 = this.a.w() && b != b2;
        final ImageView b4 = listMenuItemView.b;
        if (b4 != null) {
            int visibility;
            if (!listMenuItemView.d && b3) {
                visibility = n2;
            }
            else {
                visibility = 8;
            }
            b4.setVisibility(visibility);
        }
        final ja ja = (ja)inflate;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        ja.f(this.a(n));
        return inflate;
    }
    
    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}
