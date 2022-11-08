import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jir extends acja
{
    public final vax a;
    public ajlx b;
    public wwx c;
    private final acnj d;
    private final acng e;
    private final View f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final View j;
    
    public jir(final Context context, final vax a, final acnj d, final acng e) {
        context.getClass();
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        final View inflate = View.inflate(context, 2131624875, (ViewGroup)null);
        this.f = inflate;
        this.g = (ImageView)inflate.findViewById(2131429270);
        this.h = (TextView)inflate.findViewById(2131427439);
        this.i = (TextView)inflate.findViewById(2131428648);
        this.j = inflate.findViewById(2131428448);
        inflate.setOnClickListener((View$OnClickListener)new jfv(this, 14));
    }
    
    public final View a() {
        return this.f;
    }
    
    public final void c(final acir acir) {
    }
}
