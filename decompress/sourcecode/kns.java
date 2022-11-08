import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class kns extends jes
{
    public final uyi p;
    private final acih r;
    
    public kns(final Context context, final aceo aceo, final vax vax, final acnj acnj, final int n, final acio acio, final acng acng, final cxz cxz, final uyi p12, final byte[] array, final byte[] array2, final byte[] array3) {
        super(context, aceo, acnj, n, acng, (ViewGroup)null, (qbo)null, cxz, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.r = new acih(vax, acio);
        this.p = p12;
    }
    
    public final View a() {
        return super.c;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.r.c();
    }
    
    public final void n(final acij acij, final ajxg ajxg) {
        final acih r = this.r;
        final wwv a = ((wwx)acij).a;
        aioe aioe;
        if ((ajxg.b & 0x200) != 0x0) {
            if ((aioe = ajxg.i) == null) {
                aioe = aioe.a;
            }
        }
        else {
            aioe = null;
        }
        r.a(a, aioe, acij.e());
    }
}
