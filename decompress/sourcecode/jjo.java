import android.text.Spanned;
import java.util.List;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

final class jjo extends kcs
{
    private final acih a;
    private final acng b;
    private final acnj c;
    private final TextView d;
    private final View e;
    private final ViewGroup f;
    
    public jjo(final Context context, final aceo aceo, final vax vax, final acio acio, final acnj c, final acng b, final uyi uyi) {
        super(context, aceo, vax, acio, 2131625771, null, null, uyi, null, null, null, null);
        this.a = new acih(vax, acio);
        final View i = super.i;
        this.d = (TextView)i.findViewById(2131431382);
        this.e = i.findViewById(2131432026);
        this.f = (ViewGroup)i.findViewById(2131427768);
        this.c = c;
        this.b = b;
    }
    
    public final View a() {
        return super.i;
    }
    
    @Override
    public final void c(final acir acir) {
        super.c(acir);
        this.a.c();
    }
}
