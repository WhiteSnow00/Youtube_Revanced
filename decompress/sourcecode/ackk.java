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

final class ackk extends ArrayAdapter
{
    private final LayoutInflater a;
    
    public ackk(final Context context, final ajhz ajhz) {
        super(context, 2131624662);
        this.a = LayoutInflater.from(context);
        this.setDropDownViewResource(2131624661);
        final agza builder = ((agzi)ajhy.a).createBuilder();
        String d;
        if ((ajhz.b & 0x1) != 0x0) {
            d = ajhz.d;
        }
        else {
            d = null;
        }
        final ajsq h = abyh.h(d);
        builder.copyOnWrite();
        final ajhy ajhy = (ajhy)builder.instance;
        h.getClass();
        ajhy.e = h;
        ajhy.b |= 0x1;
        this.insert((Object)builder.build(), 0);
        for (final ajhw ajhw : ajhz.c) {
            ajhy ajhy2;
            if ((ajhw.b & 0x8) != 0x0) {
                if ((ajhy2 = ajhw.c) == null) {
                    ajhy2 = ajhy.a;
                }
            }
            else {
                ajhy2 = null;
            }
            this.add((Object)ajhy2);
        }
    }
    
    private final TextView a(final int n, final View view, final ViewGroup viewGroup, final int n2) {
        View inflate = view;
        if (view == null) {
            inflate = this.a.inflate(n2, viewGroup, false);
        }
        final ajhy ajhy = (ajhy)super.getItem(n);
        final TextView textView = (TextView)inflate;
        if (this.isEnabled(n)) {
            ajsq ajsq;
            if ((ajhy.b & 0x1) != 0x0) {
                if ((ajsq = ajhy.e) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
            textView.setText((CharSequence)abyh.b(ajsq));
            textView.setHint((CharSequence)null);
        }
        else {
            ajsq ajsq2;
            if ((ajhy.b & 0x1) != 0x0) {
                if ((ajsq2 = ajhy.e) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            textView.setHint((CharSequence)abyh.b(ajsq2));
            textView.setText((CharSequence)null);
        }
        return textView;
    }
    
    public final boolean areAllItemsEnabled() {
        return false;
    }
    
    public final View getDropDownView(final int n, final View view, final ViewGroup viewGroup) {
        return (View)this.a(n, view, viewGroup, 2131624661);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        return (View)this.a(n, view, viewGroup, 2131624662);
    }
    
    public final boolean isEnabled(final int n) {
        return n != 0;
    }
}
