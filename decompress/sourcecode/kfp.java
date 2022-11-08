import android.view.ViewGroup;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfp extends acja
{
    private final View a;
    private final TextView b;
    private final TextView c;
    private final acio d;
    private final Resources e;
    private final Context f;
    
    public kfp(final Context f, final giz d) {
        f.getClass();
        d.getClass();
        this.d = (acio)d;
        final View inflate = View.inflate(f, 2131624605, (ViewGroup)null);
        this.a = inflate;
        this.b = (TextView)inflate.findViewById(2131432092);
        this.c = (TextView)inflate.findViewById(2131431819);
        this.f = f;
        this.e = f.getResources();
        d.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.d).a;
    }
    
    public final void c(final acir acir) {
    }
}
