import android.content.res.Resources;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jis extends jes
{
    private final Context q;
    private final acio r;
    private final acih s;
    
    public jis(final Context q, final aceo aceo, final giz r, final vax vax, final acnj acnj, final acng acng, final ViewGroup viewGroup) {
        super(q, aceo, acnj, 2131625036, acng, viewGroup, (qbo)null, (cxz)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.q = q;
        this.r = (acio)r;
        final View c = super.c;
        r.c(c);
        this.s = new acih(vax, (acio)r);
        this.a().setTag(2131430139, (Object)new jji(c, 1));
        this.a().setLayoutDirection(q.getResources().getConfiguration().getLayoutDirection());
    }
    
    private final int n() {
        return this.q.getResources().getDimensionPixelSize(2131168517) + super.c.getPaddingLeft() + super.c.getPaddingRight();
    }
    
    public final View a() {
        return ((giz)this.r).a;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.s.c();
    }
}
