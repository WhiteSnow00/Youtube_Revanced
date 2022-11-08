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

public final class adaz implements acil
{
    public final vax a;
    private final View b;
    private final LinearLayout c;
    private final TextView d;
    private final TextView e;
    private final Context f;
    private final int g;
    
    public adaz(final Context f, final vax a) {
        final View inflate = View.inflate(f, 2131625368, (ViewGroup)null);
        this.b = inflate;
        this.d = (TextView)inflate.findViewById(2131432092);
        this.c = (LinearLayout)inflate.findViewById(2131431403);
        this.e = (TextView)inflate.findViewById(2131427541);
        this.a = a;
        this.f = f;
        this.g = f.getResources().getDimensionPixelSize(2131169546);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
        this.e.setVisibility(8);
    }
}
