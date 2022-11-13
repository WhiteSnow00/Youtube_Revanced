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

final class acmy extends ArrayAdapter implements SpinnerAdapter
{
    public int a;
    private LayoutInflater b;
    
    public acmy(final Context context, final List list) {
        super(context, 2131625301, list);
        for (int i = 0; i < list.size(); ++i) {
            amya amya;
            if ((amya = list.get(i).e) == null) {
                amya = amya.a;
            }
            if (amya.f) {
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
        final amxy amxy = (amxy)this.getItem(n);
        Object tag;
        if (inflate.getTag() instanceof acmx) {
            tag = inflate.getTag();
        }
        else {
            tag = new acmx(inflate, n3);
            inflate.setTag(tag);
        }
        if (amxy != null) {
            amya amya;
            if ((amya = amxy.e) == null) {
                amya = amya.a;
            }
            final boolean enabled = this.isEnabled(n);
            if (amya != null) {
                final TextView a = ((acmx)tag).a;
                if (a != null) {
                    ajut ajut;
                    if ((amya.b & 0x1) != 0x0) {
                        if ((ajut = amya.c) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    a.setText((CharSequence)acak.b(ajut));
                    ((acmx)tag).a.setEnabled(enabled);
                }
            }
        }
        return inflate;
    }
    
    public final boolean areAllItemsEnabled() {
        return false;
    }
    
    public final amya b(final int n) {
        final amxy amxy = (amxy)this.getItem(n);
        amya amya;
        if (amxy == null) {
            amya = null;
        }
        else if ((amya = amxy.e) == null) {
            amya = amya.a;
        }
        if (amya != null && !amya.f) {
            return amya;
        }
        return null;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 2131625301, 2131431153);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 2131625302, 2131431152);
    }
    
    public final boolean isEnabled(final int n) {
        return this.b(n) != null;
    }
}
