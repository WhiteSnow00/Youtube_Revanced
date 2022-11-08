import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezh extends acja
{
    private final View a;
    private final TextView b;
    private final acih c;
    
    public ezh(final Context context, final vax vax) {
        context.getClass();
        final View inflate = LayoutInflater.from(context).inflate(2131624154, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131427545);
        this.c = new acih(vax, inflate);
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
        this.c.c();
    }
}
