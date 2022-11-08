import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.AccountLinkButtonRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmy extends acja
{
    public final ImageView a;
    public final Activity b;
    public final vax c;
    public ahgv d;
    private final View e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final vbq i;
    private asic j;
    private final aceo k;
    
    public kmy(final Activity b, final vax c, final aceo k, final vbq i) {
        this.b = b;
        c.getClass();
        this.c = c;
        this.i = i;
        this.k = k;
        final View inflate = View.inflate((Context)b, 2131623969, (ViewGroup)null);
        this.e = inflate;
        this.f = (TextView)inflate.findViewById(2131432092);
        this.g = (TextView)inflate.findViewById(2131429563);
        this.a = (ImageView)inflate.findViewById(2131427725);
        this.h = inflate.findViewById(2131429471);
    }
    
    public final View a() {
        return this.e;
    }
    
    public final void c(final acir acir) {
        final asic j = this.j;
        if (j != null && !j.tx()) {
            asjg.b((AtomicReference)this.j);
        }
    }
    
    public final void f(final kmx kmx) {
        this.i.b().f(this.d.f).E(ashw.a()).s((asix)new kca(kmx, 8)).p((asir)new jbd(kmx, 12)).ab();
    }
    
    public final void g(final boolean b) {
        final TextView g = this.g;
        ajsq ajsq;
        if (b) {
            aibc aibc;
            if ((aibc = this.d.d) == null) {
                aibc = aibc.a;
            }
            aibb aibb;
            if ((aibb = aibc.c) == null) {
                aibb = aibb.a;
            }
            if ((ajsq = aibb.i) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            aibc aibc2;
            if ((aibc2 = this.d.e) == null) {
                aibc2 = aibc.a;
            }
            aibb aibb2;
            if ((aibb2 = aibc2.c) == null) {
                aibb2 = aibb.a;
            }
            if ((ajsq = aibb2.i) == null) {
                ajsq = ajsq.a;
            }
        }
        g.setText((CharSequence)abyh.b(ajsq));
        this.h.setClickable(true);
    }
}
