import android.view.ViewGroup$LayoutParams;
import com.google.protos.youtube.api.innertube.UnifiedSharePanelRendererOuterClass;
import android.text.method.LinkMovementMethod;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addc implements acko
{
    public final vcy a;
    private final View b;
    private final LinearLayout c;
    private final TextView d;
    private final TextView e;
    private final Context f;
    private final int g;
    
    public addc(final Context f, final vcy a) {
        final View inflate = View.inflate(f, 2131625373, (ViewGroup)null);
        this.b = inflate;
        this.d = (TextView)inflate.findViewById(2131432095);
        this.c = (LinearLayout)inflate.findViewById(2131431406);
        this.e = (TextView)inflate.findViewById(2131427541);
        this.a = a;
        this.f = f;
        this.g = f.getResources().getDimensionPixelSize(2131169545);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acku acku) {
        this.e.setVisibility(8);
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final apaa apaa = (apaa)o;
        final TextView d = this.d;
        final int b = apaa.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b & 0x1) != 0x0) {
            if ((ajut2 = apaa.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        d.setText((CharSequence)acak.b(ajut2));
        final TextView e = this.e;
        ajut ajut3 = ajut;
        if ((apaa.b & 0x2) != 0x0 && (ajut3 = apaa.d) == null) {
            ajut3 = ajut.a;
        }
        tpe.t(e, (CharSequence)vde.a(ajut3, this.a, false));
        this.e.setOnClickListener((View$OnClickListener)new zgi(this, apaa, 14));
        this.e.setMovementMethod(LinkMovementMethod.getInstance());
        this.e.setHighlightColor(0);
        if ((apaa.b & 0x10) != 0x0) {
            this.c.setOrientation(1);
            final ViewGroup$LayoutParams layoutParams = this.d.getLayoutParams();
            layoutParams.width = -2;
            this.d.setLayoutParams(layoutParams);
            final adde b2 = new addd(this.f).b();
            this.c.addView(b2.a);
            anuv anuv;
            if ((anuv = apaa.e) == null) {
                anuv = anuv.a;
            }
            b2.b((apab)((ahbc)anuv).rx((ahaq)UnifiedSharePanelRendererOuterClass.shareStartTimeWithContextRenderer));
        }
        final View b3 = this.b;
        final int g = this.g;
        b3.setPadding(g, g, g, g);
        addn.e(this.b);
    }
}
