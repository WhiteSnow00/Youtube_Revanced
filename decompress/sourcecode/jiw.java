import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jiw extends acja
{
    public final vax a;
    private final Context b;
    private final acio c;
    private final Resources d;
    private final ViewGroup e;
    private final TextView f;
    private final View$OnClickListener g;
    private final ViewGroup h;
    private final ViewGroup i;
    private ViewGroup j;
    
    public jiw(final Context b, final giz c, final vax a) {
        this.b = b;
        c.getClass();
        this.c = (acio)c;
        this.a = a;
        final ViewGroup e = (ViewGroup)View.inflate(b, 2131625165, (ViewGroup)null);
        this.e = e;
        this.d = b.getResources();
        this.f = (TextView)e.findViewById(2131432092);
        this.h = (ViewGroup)e.findViewById(2131431118);
        this.i = this.f(0);
        this.g = (View$OnClickListener)new jfv(this, 17);
        c.c((View)e);
    }
    
    private final ViewGroup f(final int n) {
        if (n >= this.h.getChildCount()) {
            View.inflate(this.b, 2131625164, this.h);
        }
        return (ViewGroup)this.h.getChildAt(n);
    }
    
    private final void g(final ViewGroup viewGroup, final Iterator iterator, final int n) {
        int i;
        for (i = viewGroup.getChildCount(); i < n; ++i) {
            View.inflate(this.b, 2131625166, viewGroup);
        }
        for (int j = 0; j < i; ++j) {
            final TextView textView = (TextView)viewGroup.getChildAt(j);
            if (j < n && iterator.hasNext()) {
                final anoy anoy = iterator.next();
                ajsq ajsq;
                if ((anoy.b & 0x1) != 0x0) {
                    if ((ajsq = anoy.c) == null) {
                        ajsq = ajsq.a;
                    }
                }
                else {
                    ajsq = null;
                }
                textView.setText((CharSequence)abyh.b(ajsq));
                aioe aioe;
                if ((aioe = anoy.d) == null) {
                    aioe = aioe.a;
                }
                textView.setTag(2131431930, (Object)aioe);
                textView.setOnClickListener(this.g);
                textView.setVisibility(0);
            }
            else {
                textView.setVisibility(8);
            }
        }
    }
    
    public final View a() {
        return ((giz)this.c).a;
    }
    
    public final void c(final acir acir) {
    }
}
