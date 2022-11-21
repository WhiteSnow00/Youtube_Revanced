import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class acoa extends ArrayAdapter
{
    private final LayoutInflater a;
    
    public acoa(final Context context, final ajmc ajmc) {
        super(context, 2131624665);
        this.a = LayoutInflater.from(context);
        this.setDropDownViewResource(2131624664);
        final ahcr builder = ajmb.a.createBuilder();
        String d;
        if ((ajmc.b & 0x1) != 0x0) {
            d = ajmc.d;
        }
        else {
            d = null;
        }
        final ajws h = acbu.h(d);
        builder.copyOnWrite();
        final ajmb ajmb = (ajmb)builder.instance;
        h.getClass();
        ajmb.e = h;
        ajmb.b |= 0x1;
        this.insert((Object)builder.build(), 0);
        for (final ajlz ajlz : ajmc.c) {
            ajmb ajmb2;
            if ((ajlz.b & 0x8) != 0x0) {
                if ((ajmb2 = ajlz.c) == null) {
                    ajmb2 = ajmb.a;
                }
            }
            else {
                ajmb2 = null;
            }
            this.add((Object)ajmb2);
        }
    }
    
    private final TextView a(final int n, final View view, final ViewGroup viewGroup, final int n2) {
        View inflate = view;
        if (view == null) {
            inflate = this.a.inflate(n2, viewGroup, false);
        }
        final ajmb ajmb = (ajmb)super.getItem(n);
        final boolean enabled = this.isEnabled(n);
        final TextView textView = (TextView)inflate;
        if (enabled) {
            ajws ajws;
            if ((ajmb.b & 0x1) != 0x0) {
                if ((ajws = ajmb.e) == null) {
                    ajws = ajws.a;
                }
            }
            else {
                ajws = null;
            }
            textView.setText((CharSequence)acbu.b(ajws));
            textView.setHint((CharSequence)null);
        }
        else {
            ajws ajws2;
            if ((ajmb.b & 0x1) != 0x0) {
                if ((ajws2 = ajmb.e) == null) {
                    ajws2 = ajws.a;
                }
            }
            else {
                ajws2 = null;
            }
            textView.setHint((CharSequence)acbu.b(ajws2));
            textView.setText((CharSequence)null);
        }
        return textView;
    }
    
    public final boolean areAllItemsEnabled() {
        return false;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return (View)this.a(n, view, viewGroup, 2131624664);
    }
    
    public final /* bridge */ Object getItem(final int n) {
        if (n != 0) {
            return super.getItem(n);
        }
        return null;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        return (View)this.a(n, view, viewGroup, 2131624665);
    }
    
    public final boolean isEnabled(final int n) {
        return n != 0;
    }
}
