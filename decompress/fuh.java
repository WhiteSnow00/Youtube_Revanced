import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.View;
import android.util.SparseArray;
import java.util.ArrayList;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class fuh extends BaseAdapter
{
    public final ArrayList a;
    public final SparseArray b;
    public final ArrayList c;
    public int d;
    final fuj e;
    
    public fuh(final fuj e) {
        this.e = e;
        this.d = 1;
        this.a = new ArrayList();
        this.b = new SparseArray();
        this.c = new ArrayList();
    }
    
    public final int getCount() {
        return this.c.size();
    }
    
    public final Object getItem(final int n) {
        return this.c.get(n);
    }
    
    public final long getItemId(final int n) {
        return (int)this.c.get(n).a;
    }
    
    public final View getView(final int n, View inflate, final ViewGroup viewGroup) {
        final fzw fzw = this.c.get(n);
        if (fzw == null) {
            return null;
        }
        fzw tag;
        if (inflate == null) {
            inflate = this.e.b.inflate(2131624291, viewGroup, false);
            tag = new fzw(inflate);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (fzw)inflate.getTag();
        }
        tag.getClass();
        if (tag.a != null) {
            final Object b = ((hft)fzw.b).b;
            if (!TextUtils.isEmpty((CharSequence)b)) {
                ((TextView)tag.a).setText((CharSequence)b);
                ((TextView)tag.a).setVisibility(0);
            }
            else {
                ((TextView)tag.a).setText((CharSequence)null);
                ((TextView)tag.a).setVisibility(8);
            }
        }
        final Object b2 = tag.b;
        if (b2 != null) {
            ((ImageView)b2).setImageBitmap((Bitmap)null);
            ((ImageView)tag.b).setVisibility(8);
        }
        return inflate;
    }
    
    public final void notifyDataSetChanged() {
        this.c.clear();
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final fzw fzw = (fzw)a.get(i);
            final Object b = fzw.b;
            this.c.add(fzw);
        }
        super.notifyDataSetChanged();
    }
}
