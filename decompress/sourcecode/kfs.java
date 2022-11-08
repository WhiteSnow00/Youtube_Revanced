import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfs extends acja
{
    public aioe a;
    public aioe b;
    private final TextView c;
    private final TextView d;
    private final acio e;
    
    public kfs(final Context context, final vax vax, final giz e) {
        vax.getClass();
        e.getClass();
        this.e = (acio)e;
        final View inflate = LayoutInflater.from(context).inflate(2131624676, (ViewGroup)null);
        final TextView c = (TextView)inflate.findViewById(2131429566);
        this.c = c;
        final TextView d = (TextView)inflate.findViewById(2131432109);
        this.d = d;
        e.c(inflate);
        e.b(false);
        c.setOnClickListener((View$OnClickListener)new kdw(this, vax, 7));
        d.setOnClickListener((View$OnClickListener)new kdw(this, vax, 8));
    }
    
    public final View a() {
        return ((giz)this.e).a;
    }
    
    public final void c(final acir acir) {
    }
}
