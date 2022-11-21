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

final class acol extends ArrayAdapter implements SpinnerAdapter
{
    public int a;
    private LayoutInflater b;
    
    public acol(final Context context, final List list) {
        super(context, 2131625303, list);
        for (int i = 0; i < list.size(); ++i) {
            anaf anaf;
            if ((anaf = list.get(i).e) == null) {
                anaf = anaf.a;
            }
            if (anaf.f) {
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
        final anad anad = (anad)this.getItem(n);
        Object tag;
        if (inflate.getTag() instanceof acok) {
            tag = inflate.getTag();
        }
        else {
            tag = new acok(inflate, n3);
            inflate.setTag(tag);
        }
        if (anad != null) {
            anaf anaf;
            if ((anaf = anad.e) == null) {
                anaf = anaf.a;
            }
            final boolean enabled = this.isEnabled(n);
            if (anaf != null) {
                final TextView a = ((acok)tag).a;
                if (a != null) {
                    ajws ajws;
                    if ((anaf.b & 0x1) != 0x0) {
                        if ((ajws = anaf.c) == null) {
                            ajws = ajws.a;
                        }
                    }
                    else {
                        ajws = null;
                    }
                    a.setText((CharSequence)acbu.b(ajws));
                    ((acok)tag).a.setEnabled(enabled);
                }
            }
        }
        return inflate;
    }
    
    public final boolean areAllItemsEnabled() {
        return false;
    }
    
    public final anaf b(final int n) {
        final anad anad = (anad)this.getItem(n);
        anaf anaf;
        if (anad == null) {
            anaf = null;
        }
        else if ((anaf = anad.e) == null) {
            anaf = anaf.a;
        }
        if (anaf != null && !anaf.f) {
            return anaf;
        }
        return null;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 2131625303, 2131431153);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a(n, view, viewGroup, 2131625304, 2131431152);
    }
    
    public final boolean isEnabled(final int n) {
        return this.b(n) != null;
    }
}
