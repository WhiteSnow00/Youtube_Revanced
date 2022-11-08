import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpc extends acja
{
    public final vax a;
    private final acng b;
    private final giz c;
    private final aceo d;
    private final Context e;
    private final FrameLayout f;
    private acja g;
    private acja h;
    private acja i;
    
    public kpc(final Context e, final acng b, final vax a, final giz c, final aceo d) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        c.c((View)(this.f = new FrameLayout(e)));
    }
    
    public final View a() {
        return this.c.a;
    }
    
    public final void c(final acir acir) {
        final acja g = this.g;
        if (g != null) {
            g.c(acir);
        }
        this.f.setOnClickListener((View$OnClickListener)null);
    }
}
