import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knx extends acja
{
    public angu a;
    private final View b;
    private final TextView c;
    
    public knx(final Context context, final vax vax) {
        final View inflate = LayoutInflater.from(context).inflate(2131625048, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131432092);
        inflate.setOnClickListener((View$OnClickListener)new kdw(this, vax, 20));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
    }
}
