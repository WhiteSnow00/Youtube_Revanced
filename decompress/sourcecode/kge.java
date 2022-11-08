import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.RelativeLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kge extends acja
{
    protected final RelativeLayout a;
    private final aceo b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final View f;
    private final acnj g;
    private final ImageView h;
    private final acio i;
    private final acih j;
    
    public kge(final Context context, final aceo b, final giz i, final vax vax, final acnj g) {
        this.j = new acih(vax, (acio)i);
        context.getClass();
        b.getClass();
        this.b = b;
        i.getClass();
        this.i = (acio)i;
        g.getClass();
        this.g = g;
        final RelativeLayout a = (RelativeLayout)View.inflate(context, 2131625162, (ViewGroup)null);
        this.a = a;
        this.c = (TextView)a.findViewById(2131432092);
        this.d = (TextView)a.findViewById(2131430589);
        this.e = (TextView)a.findViewById(2131429090);
        this.h = (ImageView)a.findViewById(2131432006);
        this.f = a.findViewById(2131428448);
        i.c((View)a);
    }
    
    public final View a() {
        return ((giz)this.i).a;
    }
    
    public final void c(final acir acir) {
        this.j.c();
    }
}
