import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgr extends acja
{
    private final acio a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final int e;
    private final int f;
    private final int g;
    
    public kgr(final Context context, final giz a) {
        this.a = (acio)a;
        final View inflate = View.inflate(context, 2131625501, (ViewGroup)null);
        this.b = inflate;
        this.c = (TextView)inflate.findViewById(2131432092);
        this.d = (TextView)inflate.findViewById(2131428440);
        this.e = tmy.ct(context, 2130970924).orElse(0);
        this.f = tmy.ct(context, 2130970926).orElse(0);
        this.g = tmy.ct(context, 2130970922).orElse(0);
        a.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.a).a;
    }
    
    public final void c(final acir acir) {
    }
}
