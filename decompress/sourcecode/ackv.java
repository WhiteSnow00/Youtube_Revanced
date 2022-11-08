import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ackv extends ArrayAdapter implements SpinnerAdapter
{
    public int a;
    private LayoutInflater b;
    
    public ackv(final Context context, final List list) {
        super(context, 2131625296, list);
        for (int i = 0; i < list.size(); ++i) {
            amvw amvw;
            if ((amvw = list.get(i).e) == null) {
                amvw = amvw.a;
            }
            if (amvw.f) {
                this.a = i;
                return;
            }
        }
    }
    
    public final View a(final int n, final View view, final ViewGroup viewGroup, final int n2, final int n3) {
        View inflate = view;
        if (view == null) {
            if (this.b == null) {
                this.b = LayoutInflater.from(this.getContext());
            }
            inflate = this.b.inflate(n2, viewGroup, false);
        }
        final amvu amvu = (amvu)this.getItem(n);
        Object tag;
        if (inflate.getTag() instanceof acku) {
            tag = inflate.getTag();
        }
        else {
            tag = new acku(inflate, n3);
            inflate.setTag(tag);
        }
        if (amvu != null) {
            amvw amvw;
            if ((amvw = amvu.e) == null) {
                amvw = amvw.a;
            }
            final boolean enabled = this.isEnabled(n);
            if (amvw != null) {
                final TextView a = ((acku)tag).a;
                if (a != null) {
                    ajsq ajsq;
                    if ((amvw.b & 0x1) != 0x0) {
                        if ((ajsq = amvw.c) == null) {
                            ajsq = ajsq.a;
                        }
                    }
                    else {
                        ajsq = null;
                    }
                    a.setText((CharSequence)abyh.b(ajsq));
                    ((acku)tag).a.setEnabled(enabled);
                }
            }
        }
        return inflate;
    }
    
    public final boolean areAllItemsEnabled() {
        return false;
    }
    
    public final amvw b(final int n) {
        final amvu amvu = (amvu)this.getItem(n);
        amvw amvw;
        if (amvu == null) {
            amvw = null;
        }
        else if ((amvw = amvu.e) == null) {
            amvw = amvw.a;
        }
        if (amvw != null && !amvw.f) {
            return amvw;
        }
        return null;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 2131625296, 2131431150);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 2131625297, 2131431149);
    }
    
    public final boolean isEnabled(final int n) {
        return this.b(n) != null;
    }
}
