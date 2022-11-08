import java.util.List;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezg extends acja
{
    public final vax a;
    private final Context b;
    private final acio c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final ViewGroup j;
    
    public ezg(final Context b, final giz c, final vax a) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = (acio)c;
        a.getClass();
        this.a = a;
        final View inflate = View.inflate(b, 2131624135, (ViewGroup)null);
        this.d = (TextView)inflate.findViewById(2131428624);
        this.e = (TextView)inflate.findViewById(2131429473);
        this.f = (TextView)inflate.findViewById(2131431811);
        this.g = (TextView)inflate.findViewById(2131432380);
        this.h = inflate.findViewById(2131428633);
        this.i = inflate.findViewById(2131431714);
        this.j = (ViewGroup)inflate.findViewById(2131429575);
        c.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.c).a;
    }
    
    public final void c(final acir acir) {
    }
}
