import android.view.View;
import android.content.Context;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class keb extends jes
{
    private final aceo p;
    private final acio q;
    private final acih r;
    private final ImageView s;
    
    public keb(final Context context, final aceo p7, final giz q, final vax vax, final acnj acnj, final acng acng, final uyi uyi) {
        super(context, p7, acnj, 2131624263, acng);
        p7.getClass();
        this.p = p7;
        q.getClass();
        this.q = (acio)q;
        final ImageView s = (ImageView)super.c.findViewById(2131431701);
        this.s = s;
        if (uyi.aR()) {
            s.setClipToOutline(true);
            s.setBackgroundResource(2131231033);
        }
        q.c(super.c);
        this.r = new acih(vax, (acio)q);
    }
    
    public final View a() {
        return ((giz)this.q).a;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.r.c();
    }
}
