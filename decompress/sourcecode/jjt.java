import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjt implements acil
{
    public aioe a;
    private final View b;
    private final TextView c;
    
    public jjt(final Context context, final vax vax, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2131625774, viewGroup, false);
        this.b = inflate;
        (this.c = (TextView)inflate.findViewById(2131432358)).setOnClickListener((View$OnClickListener)new iue(this, vax, 18));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
    }
}
