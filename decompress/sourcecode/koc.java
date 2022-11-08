import android.text.Spanned;
import java.util.List;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class koc extends jes
{
    private final acih p;
    
    public koc(final Context context, final aceo aceo, final int n, final giz giz, final vax vax, final acnj acnj, final acng acng) {
        super(context, aceo, acnj, n, acng);
        this.p = new acih(vax, (acio)giz);
    }
    
    public final View a() {
        return super.c;
    }
    
    public final void c(final acir acir) {
        super.c(acir);
        this.p.c();
    }
    
    public final void n(final acij acij, final anhf anhf) {
        final acih p2 = this.p;
        final wwv a = ((wwx)acij).a;
        final int b = anhf.b;
        final ajsq ajsq = null;
        aioe aioe;
        if ((b & 0x20) != 0x0) {
            if ((aioe = anhf.j) == null) {
                aioe = aioe.a;
            }
        }
        else {
            aioe = null;
        }
        p2.a(a, aioe, acij.e());
        ajsq ajsq2;
        if ((anhf.b & 0x2) != 0x0) {
            if ((ajsq2 = anhf.d) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        this.k((CharSequence)abyh.b(ajsq2));
        ajsq ajsq3;
        if ((anhf.b & 0x80) != 0x0) {
            if ((ajsq3 = anhf.k) == null) {
                ajsq3 = ajsq.a;
            }
        }
        else {
            ajsq3 = null;
        }
        this.b((CharSequence)abyh.b(ajsq3));
        anig anig;
        if ((anig = anhf.e) == null) {
            anig = anig.a;
        }
        anih anih;
        if ((anih = anig.c) == null) {
            anih = anih.a;
        }
        if ((anih.b & 0x1) != 0x0) {
            anig anig2;
            if ((anig2 = anhf.e) == null) {
                anig2 = anig.a;
            }
            anih anih2;
            if ((anih2 = anig2.c) == null) {
                anih2 = anih.a;
            }
            aorm aorm;
            if ((aorm = anih2.c) == null) {
                aorm = aorm.a;
            }
            this.g(aorm);
        }
        else if (anhf.f.size() > 0) {
            this.g((aorm)anhf.f.get(0));
        }
        if (anhf.g.size() <= 0) {
            ajsq ajsq4 = ajsq;
            if ((anhf.b & 0x10) != 0x0 && (ajsq4 = anhf.i) == null) {
                ajsq4 = ajsq.a;
            }
            final Spanned b2 = abyh.b(ajsq4);
            this.j((CharSequence)b2, (CharSequence)b2);
            return;
        }
        this.i((List)anhf.g);
    }
}
