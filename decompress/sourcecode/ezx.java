import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezx extends acja
{
    public final vax a;
    final TextView b;
    acqu c;
    final ViewGroup d;
    private final fuw e;
    private final View f;
    private fuv g;
    private final zhb h;
    
    public ezx(final Context context, final vax a, final fuw e, final zhb h, final byte[] array) {
        final View inflate = LayoutInflater.from(context).inflate(2131624169, (ViewGroup)null);
        this.f = inflate;
        this.a = a;
        this.e = e;
        this.h = h;
        this.d = (ViewGroup)inflate.findViewById(2131431609);
        this.b = (TextView)inflate.findViewById(2131429724);
    }
    
    public final View a() {
        return this.f;
    }
    
    public final void c(final acir acir) {
        final fuv g = this.g;
        if (g != null) {
            g.c(acir);
        }
    }
}
