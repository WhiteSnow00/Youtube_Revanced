import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezd
{
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final fve f;
    public final fwd g;
    public final acqu h;
    public final TextView i;
    public final View j;
    public final /* synthetic */ ezf k;
    public final hyc l;
    
    public ezd(final ezf k, final View a) {
        this.k = k;
        this.a = a;
        this.b = (TextView)a.findViewById(2131428153);
        this.c = (TextView)a.findViewById(2131428112);
        this.d = (TextView)a.findViewById(2131428149);
        this.e = (ImageView)a.findViewById(2131430640);
        final TextView i = (TextView)a.findViewById(2131431807);
        this.i = i;
        final View viewById = a.findViewById(2131431815);
        this.j = viewById;
        final TextView textView = (TextView)a.findViewById(2131431638);
        final TextView textView2 = (TextView)a.findViewById(2131430740);
        final fwd j = k.p.k(viewById);
        this.g = j;
        this.f = k.j.a(i, j);
        final acqu acqu = null;
        hyc l;
        if (textView == null) {
            l = null;
        }
        else {
            l = k.q.I(textView);
        }
        this.l = l;
        acqu g;
        if (textView2 == null) {
            g = acqu;
        }
        else {
            g = k.o.g(textView2);
        }
        this.h = g;
    }
}
