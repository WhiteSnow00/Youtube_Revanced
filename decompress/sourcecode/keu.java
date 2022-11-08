import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class keu extends jes
{
    private final acih p;
    
    public keu(final Context context, final aceo aceo, final vax vax, final acnj acnj, final int n, final acio acio, final acng acng) {
        super(context, aceo, acnj, n, acng);
        this.p = new acih(vax, acio);
    }
    
    public final View a() {
        return super.c;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.p.c();
    }
    
    public final void n(final acij acij, final ajxk ajxk) {
        final acih p2 = this.p;
        final wwv a = ((wwx)acij).a;
        aioe aioe;
        if ((ajxk.b & 0x10) != 0x0) {
            if ((aioe = ajxk.e) == null) {
                aioe = aioe.a;
            }
        }
        else {
            aioe = null;
        }
        p2.a(a, aioe, acij.e());
    }
}
