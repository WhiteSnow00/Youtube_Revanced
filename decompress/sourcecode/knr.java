import android.text.Spanned;
import java.util.List;
import android.view.View;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knr extends jes
{
    private final acio p;
    private final acih q;
    private final TextView r;
    
    public knr(final Context context, final aceo aceo, final giz p6, final vax vax, final acnj acnj, final acng acng) {
        super(context, aceo, acnj, 2131624499, acng);
        p6.getClass();
        ((giz)(this.p = (acio)p6)).c(super.c);
        this.q = new acih(vax, (acio)p6);
        this.r = (TextView)super.c.findViewById(2131432092);
    }
    
    public final View a() {
        return ((giz)this.p).a;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.q.c();
    }
}
