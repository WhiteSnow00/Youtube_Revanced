import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kee extends acja
{
    public final vax a;
    public aihw b;
    private final View c;
    private final TextView d;
    private final ImageView e;
    
    public kee(final Context context, final vax a) {
        a.getClass();
        this.a = a;
        final View inflate = View.inflate(context, 2131624288, (ViewGroup)null);
        this.c = inflate;
        this.d = (TextView)inflate.findViewById(2131430617);
        (this.e = (ImageView)inflate.findViewById(2131430610)).setOnClickListener((View$OnClickListener)new jtw(this, 16));
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
    }
}
