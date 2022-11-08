import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxd extends acja
{
    private final acio a;
    private final aceo b;
    private final acih c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final acqu i;
    private final int j;
    
    public fxd(final Context context, final ViewGroup viewGroup, final giz a, final aceo b, final vax vax, final zhb zhb, final byte[] array) {
        this.a = (acio)a;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624265, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView)inflate.findViewById(2131432006);
        this.f = (TextView)inflate.findViewById(2131432092);
        this.g = (TextView)inflate.findViewById(2131431819);
        final TextView h = (TextView)inflate.findViewById(2131427452);
        this.h = h;
        this.i = zhb.g(h);
        ((acio)a).c(inflate);
        this.c = new acih(vax, (acio)a);
        this.j = tmy.aZ(context.getResources().getDisplayMetrics(), 8);
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void c(final acir acir) {
    }
}
