import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

class koy extends acja
{
    protected final Context a;
    protected final aceo b;
    protected final acng c;
    protected final View d;
    protected final ImageView e;
    protected final TextView f;
    
    public koy(final Context a, final aceo b, final acng c, final int n) {
        this.a = a;
        this.b = b;
        this.c = c;
        final View inflate = LayoutInflater.from(a).inflate(n, (ViewGroup)null);
        this.d = inflate;
        this.e = (ImageView)inflate.findViewById(2131431048);
        this.f = (TextView)inflate.findViewById(2131431049);
    }
    
    public final View a() {
        return this.d;
    }
    
    public void c(final acir acir) {
        this.b.d(this.e);
    }
    
    protected void f(final acij acij, final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) {
        final acng c = this.c;
        akbf akbf;
        if ((akbf = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.d) == null) {
            akbf = akbf.a;
        }
        akbe akbe;
        if ((akbe = akbe.b(akbf.c)) == null) {
            akbe = akbe.a;
        }
        this.e.setImageResource(c.a(akbe));
        if ((reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b & 0x8) != 0x0) {
            final int intValue = (int)acij.d("avatar_size", (Object)0);
            final int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131169219);
            if (intValue > dimensionPixelSize) {
                final int n = intValue - dimensionPixelSize;
                this.e.getLayoutParams().width = n;
                this.e.getLayoutParams().height = n;
            }
        }
        final TextView f = this.f;
        final int b = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b;
        CharSequence c2 = null;
        ajsq ajsq;
        if ((b & 0x4) != 0x0) {
            if ((ajsq = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.e) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        f.setText((CharSequence)abyh.b(ajsq));
        final TextView f2 = this.f;
        ahgn ahgn;
        if ((ahgn = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.g) == null) {
            ahgn = ahgn.a;
        }
        if ((ahgn.b & 0x1) != 0x0) {
            ahgn ahgn2;
            if ((ahgn2 = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.g) == null) {
                ahgn2 = ahgn.a;
            }
            ahgm ahgm;
            if ((ahgm = ahgn2.c) == null) {
                ahgm = ahgm.a;
            }
            c2 = ahgm.c;
        }
        f2.setContentDescription(c2);
    }
}
