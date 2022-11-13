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

public final class jbn implements acko, fvm
{
    public aiqj a;
    private final Context b;
    private final wyw c;
    private final acgs d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final fvn j;
    private final MetadataHighlightsColumnLinearLayout k;
    
    public jbn(final Context b, final ViewGroup viewGroup, final wyw c, final acgs d, final vcy vcy, final hwn hwn, final hyx hyx, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
        this.a = null;
        final View inflate = LayoutInflater.from(b).inflate(2131624825, viewGroup, false);
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
        final TextView i = (TextView)inflate.findViewById(2131431810);
        this.i = i;
        (this.j = hwn.a(i, hyx.l(inflate.findViewById(2131431818)))).l(3);
        inflate.setOnClickListener((View$OnClickListener)new ivc(this, vcy, 5));
    }
    
    private final void b(final boolean b) {
        if (b) {
            this.i.setBackgroundResource(2131231352);
            return;
        }
        this.i.setBackgroundResource(2131231351);
    }
    
    public final View a() {
        return this.e;
    }
    
    public final void c(final acku acku) {
        this.j.i.remove(this);
        this.j.f();
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final ajvu ajvu = (ajvu)o;
        this.j.d((fvm)this);
        final MetadataHighlightsColumnLinearLayout k = this.k;
        boolean enabled = true;
        if (k != null) {
            final Integer n = (Integer)ackm.c("ITEM_COUNT");
            int n2 = 2132083255;
            if (n != null) {
                n2 = n2;
                if (n > 1) {
                    n2 = 2132083259;
                }
            }
            this.k.b(n2);
        }
        final wyw c = this.c;
        final wyt wyt = new wyt(ajvu.h);
        final ajut ajut = null;
        c.t((wzz)wyt, (alhi)null);
        aiqj a;
        if ((ajvu.b & 0x8) != 0x0) {
            if ((a = ajvu.f) == null) {
                a = aiqj.a;
            }
        }
        else {
            a = null;
        }
        this.a = a;
        final TextView g = this.g;
        ajut ajut2;
        if ((ajvu.b & 0x2) != 0x0) {
            if ((ajut2 = ajvu.d) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        g.setText((CharSequence)acak.b(ajut2));
        final TextView h = this.h;
        ajut ajut3;
        if ((ajvu.b & 0x4) != 0x0) {
            if ((ajut3 = ajvu.e) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        tpe.t(h, (CharSequence)acak.b(ajut3));
        aotp aotp;
        if ((aotp = ajvu.c) == null) {
            aotp = aotp.a;
        }
        if (aotp.c.size() > 0) {
            final acgs d = this.d;
            final ImageView f = this.f;
            aotp aotp2;
            if ((aotp2 = ajvu.c) == null) {
                aotp2 = aotp.a;
            }
            d.g(f, aotp2);
        }
        else {
            this.d.d(this.f);
            this.f.setImageResource(2131232282);
        }
        final ImageView f2 = this.f;
        if ((ajvu.b & 0x8) == 0x0) {
            enabled = false;
        }
        f2.setEnabled(enabled);
        this.j.j((aome)null, this.c);
        anuv anuv;
        if ((anuv = ajvu.g) == null) {
            anuv = anuv.a;
        }
        if (((ahbc)anuv).ry((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            anuv anuv2;
            if ((anuv2 = ajvu.g) == null) {
                anuv2 = anuv.a;
            }
            final aome aome = (aome)((ahbc)anuv2).rx((ahaq)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
            if (aome.n) {
                final ahaz builder = ((ahbh)aome).toBuilder();
                final Context b = this.b;
                ajut ajut4 = ajut;
                if ((ajvu.b & 0x2) != 0x0 && (ajut4 = ajvu.d) == null) {
                    ajut4 = ajut.a;
                }
                fex.c(b, builder, (CharSequence)acak.b(ajut4));
                final aome aome2 = (aome)builder.build();
                this.j.j(aome2, this.c);
                this.b(aome2.l);
            }
        }
    }
    
    public final void pz(final boolean b, final boolean b2) {
        this.b(b);
    }
}
