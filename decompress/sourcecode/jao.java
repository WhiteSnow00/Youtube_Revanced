import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jao implements acil, fvd
{
    public aioe a;
    private final Context b;
    private final wwv c;
    private final aceo d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final fve j;
    private final MetadataHighlightsColumnLinearLayout k;
    
    public jao(final Context b, final ViewGroup viewGroup, final wwv c, final aceo d, final vax vax, final fvf fvf, final hyc hyc, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.a = null;
        final View inflate = LayoutInflater.from(b).inflate(2131624824, viewGroup, false);
        this.e = inflate;
        final View viewById = inflate.findViewById(2131428103);
        if (viewById instanceof MetadataHighlightsColumnLinearLayout) {
            this.k = (MetadataHighlightsColumnLinearLayout)viewById;
        }
        else {
            this.k = null;
        }
        this.f = (ImageView)inflate.findViewById(2131428086);
        this.g = (TextView)inflate.findViewById(2131428153);
        this.h = (TextView)inflate.findViewById(2131428146);
        final TextView i = (TextView)inflate.findViewById(2131431807);
        this.i = i;
        (this.j = fvf.a(i, hyc.k(inflate.findViewById(2131431815)))).l(3);
        inflate.setOnClickListener((View$OnClickListener)new iue(this, vax, 4));
    }
    
    private final void b(final boolean b) {
        if (b) {
            this.i.setBackgroundResource(2131231352);
            return;
        }
        this.i.setBackgroundResource(2131231351);
    }
    
    @Override
    public final View a() {
        return this.e;
    }
    
    @Override
    public final void c(final acir acir) {
        this.j.i.remove(this);
        this.j.f();
    }
    
    public final void pv(final boolean b, final boolean b2) {
        this.b(b);
    }
}
