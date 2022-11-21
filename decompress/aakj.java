import android.text.Spanned;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ListView;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public class aakj extends ArrayAdapter
{
    public final ListView b;
    
    public aakj(final Context context, final ListView b) {
        super(context, 0);
        this.b = b;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final aack aack = (aack)this.getItem(n);
        final LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        View inflate = view;
        if (view == null) {
            inflate = from.inflate(2131624953, viewGroup, false);
        }
        abwe tag;
        if ((tag = (abwe)inflate.getTag()) == null) {
            tag = new abwe(inflate);
            inflate.setTag((Object)tag);
        }
        if (aack == null) {
            ((TextView)tag.b).setVisibility(8);
        }
        else {
            ((TextView)tag.a).setText((CharSequence)aack.b);
            final Spanned c = aack.c;
            if (c != null) {
                ((TextView)tag.b).setText((CharSequence)c);
                ((TextView)tag.b).setVisibility(0);
            }
            else {
                ((TextView)tag.b).setVisibility(8);
            }
        }
        return inflate;
    }
}
