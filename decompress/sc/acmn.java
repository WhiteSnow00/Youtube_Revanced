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

final class acmn extends ArrayAdapter
{
    private final LayoutInflater a;
    
    public acmn(final Context context, final ajkd ajkd) {
        super(context, 2131624663);
        this.a = LayoutInflater.from(context);
        this.setDropDownViewResource(2131624662);
        final ahaz builder = ajkc.a.createBuilder();
        String d;
        if ((ajkd.b & 0x1) != 0x0) {
            d = ajkd.d;
        }
        else {
            d = null;
        }
        final ajut h = acak.h(d);
        builder.copyOnWrite();
        final ajkc ajkc = (ajkc)builder.instance;
        h.getClass();
        ajkc.e = h;
        ajkc.b |= 0x1;
        this.insert((Object)builder.build(), 0);
        for (final ajka ajka : ajkd.c) {
            ajkc ajkc2;
            if ((ajka.b & 0x8) != 0x0) {
                if ((ajkc2 = ajka.c) == null) {
                    ajkc2 = ajkc.a;
                }
            }
            else {
                ajkc2 = null;
            }
            this.add((Object)ajkc2);
        }
    }
    
    private final TextView a(final int n, final View view, final ViewGroup viewGroup, final int n2) {
        View inflate = view;
        if (view == null) {
            inflate = this.a.inflate(n2, viewGroup, false);
        }
        final ajkc ajkc = (ajkc)super.getItem(n);
        final boolean enabled = this.isEnabled(n);
        final TextView textView = (TextView)inflate;
        if (enabled) {
            ajut ajut;
            if ((ajkc.b & 0x1) != 0x0) {
                if ((ajut = ajkc.e) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            textView.setText((CharSequence)acak.b(ajut));
            textView.setHint((CharSequence)null);
        }
        else {
            ajut ajut2;
            if ((ajkc.b & 0x1) != 0x0) {
                if ((ajut2 = ajkc.e) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            textView.setHint((CharSequence)acak.b(ajut2));
            textView.setText((CharSequence)null);
        }
        return textView;
    }
    
    public final boolean areAllItemsEnabled() {
        return false;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return (View)this.a(n, view, viewGroup, 2131624662);
    }
    
    public final /* bridge */ Object getItem(final int n) {
        if (n != 0) {
            return super.getItem(n);
        }
        return null;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        return (View)this.a(n, view, viewGroup, 2131624663);
    }
    
    public final boolean isEnabled(final int n) {
        return n != 0;
    }
}
