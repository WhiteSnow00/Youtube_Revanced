import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcq implements acil
{
    public aiqf a;
    private final Activity b;
    private final acng c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final fve h;
    
    public kcq(final Activity b, final vax vax, final acng c, final fvf fvf, final hyc hyc, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        this.c = c;
        final View inflate = LayoutInflater.from((Context)b).inflate(2131624078, (ViewGroup)null);
        this.d = inflate;
        this.e = (TextView)inflate.findViewById(2131428153);
        this.f = (TextView)inflate.findViewById(2131428146);
        final TextView g = (TextView)inflate.findViewById(2131431807);
        this.g = g;
        this.h = fvf.a(g, hyc.k(inflate.findViewById(2131431815)));
        inflate.setOnClickListener((View$OnClickListener)new jjz(this, vax, 19));
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void c(final acir acir) {
        this.h.f();
    }
}
