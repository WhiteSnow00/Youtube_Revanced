import android.text.TextUtils;
import android.widget.AdapterView;
import java.util.Iterator;
import com.google.protobuf.MessageLite;
import android.graphics.Rect;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.util.Collection;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import android.widget.Spinner;
import android.view.ViewGroup;
import java.util.Set;
import android.widget.SpinnerAdapter;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuy extends BaseAdapter implements SpinnerAdapter
{
    public final Set a;
    public CharSequence b;
    public int c;
    private final ViewGroup d;
    private final Spinner e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final List j;
    private int k;
    
    public fuy(final ViewGroup d, final Spinner e, final int f, final int g, final int i) {
        this.k = -1;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = 2131625461;
        this.i = i;
        this.j = new ArrayList();
        this.a = new HashSet();
    }
    
    private final View c(final ViewGroup viewGroup) {
        final LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        final View inflate = from.inflate(this.f, viewGroup, false);
        final ViewGroup viewGroup2 = (ViewGroup)inflate.findViewById(2131431633);
        viewGroup2.addView(from.inflate(this.g, viewGroup2, false));
        inflate.setTag(2131431630, (Object)true);
        return inflate;
    }
    
    private final void d(final TextView textView, final int n) {
        textView.setText(this.j.get(n).a());
    }
    
    private static void e(final View view, final int imageResource) {
        if (!(view instanceof ImageView)) {
            return;
        }
        if (imageResource != 0) {
            ((ImageView)view).setImageResource(imageResource);
        }
        tmy.v(view, imageResource != 0);
    }
    
    private static boolean f(final View view, final int n, final Object o) {
        Object tag;
        if (view != null) {
            tag = view.getTag(n);
        }
        else {
            tag = null;
        }
        return tag != null && tag.equals(o);
    }
    
    private static final TextView g(final View view) {
        final ViewGroup viewGroup = (ViewGroup)view.findViewById(2131431633);
        final View viewById = viewGroup.findViewById(2131432092);
        TextView textView;
        if (viewById instanceof TextView) {
            textView = (TextView)viewById;
        }
        else {
            textView = (TextView)viewGroup.getChildAt(0);
        }
        return textView;
    }
    
    public final void a(final List list) {
        this.j.clear();
        this.j.addAll(list);
        this.notifyDataSetChanged();
    }
    
    public final void b(final int n, final Object o) {
        this.j.get(n).c(o);
    }
    
    public final int getCount() {
        return this.j.size();
    }
    
    public final View getDropDownView(int n, final View view, final ViewGroup viewGroup) {
        final Boolean value = true;
        final boolean f = f(view, 2131431632, value);
        final int n2 = 0;
        View inflate;
        if (!f || (inflate = view) == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.h, viewGroup, false);
            inflate.setTag(2131431632, (Object)value);
        }
        final fux fux = this.j.get(n);
        final TextView textView = (TextView)inflate.findViewById(2131432092);
        if (fux.d()) {
            textView.setBackground((Drawable)new ColorDrawable(tmy.ct(this.d.getContext(), 2130970822).orElse(0)));
        }
        else {
            textView.setBackground((Drawable)null);
        }
        textView.setText(fux.a());
        final int paddingLeft = inflate.getPaddingLeft();
        int n3;
        if (n == 0) {
            n = this.i;
            n3 = 0;
        }
        else {
            final int n4 = 0;
            n3 = n;
            n = n4;
        }
        final int paddingRight = inflate.getPaddingRight();
        int i;
        if (n3 == this.j.size() - 1) {
            i = this.i;
        }
        else {
            i = 0;
        }
        inflate.setPadding(paddingLeft, n, paddingRight, i);
        if ((n = this.k) == -1) {
            final View c = this.c((ViewGroup)this.e);
            if (c.getLayoutParams() == null) {
                c.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
            }
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.d.getMeasuredWidth(), 0);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.d.getMeasuredHeight(), 0);
            e(c.findViewById(2131429270), this.c);
            final TextView g = g(c);
            n = 0;
            for (int j = n2; j < Math.min(this.j.size(), 10); ++j) {
                this.d(g, j);
                c.measure(measureSpec, measureSpec2);
                n = Math.max(n, c.getMeasuredWidth());
            }
            final Drawable background = this.d.getBackground();
            int n5 = n;
            if (background != null) {
                final Rect rect = new Rect();
                background.getPadding(rect);
                n5 = n + (rect.left + rect.right);
            }
            n = Math.max(n5, this.e.getWidth());
            this.k = n;
        }
        inflate.setMinimumWidth(n);
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iji.b(((fuv)((qpt)iterator.next()).a).e, (MessageLite)fux.b());
        }
        return inflate;
    }
    
    public final Object getItem(final int n) {
        return this.j.get(n).b();
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(int selectedItemPosition, final View view, final ViewGroup viewGroup) {
        if (viewGroup instanceof AdapterView) {
            selectedItemPosition = ((AdapterView)viewGroup).getSelectedItemPosition();
        }
        View c;
        if (!f(view, 2131431630, true) || (c = view) == null) {
            c = this.c(viewGroup);
        }
        final TextView g = g(c);
        if (!TextUtils.isEmpty(this.b)) {
            g.setText(this.b);
        }
        else {
            this.d(g, selectedItemPosition);
        }
        e(c.findViewById(2131429270), this.c);
        return c;
    }
    
    public final void notifyDataSetChanged() {
        this.k = -1;
        super.notifyDataSetChanged();
    }
}
