import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqs extends acja
{
    public final tdz a;
    private final aceo b;
    private final acio c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    
    public kqs(final Context context, final aceo b, final tdz a, final giz c) {
        context.getClass();
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = (acio)c;
        final View inflate = View.inflate(context, 2131625848, (ViewGroup)null);
        this.g = (ImageView)inflate.findViewById(2131432374);
        this.d = (TextView)inflate.findViewById(2131428392);
        this.e = (TextView)inflate.findViewById(2131428391);
        (this.f = (TextView)inflate.findViewById(2131428724)).setOnClickListener((View$OnClickListener)new kmk(this, 10));
        ((acio)c).c(inflate);
    }
    
    public final View a() {
        return ((giz)this.c).a;
    }
    
    public final void c(final acir acir) {
    }
}
