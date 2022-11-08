import com.google.protos.youtube.api.innertube.BackgroundPromoRendererOuterClass;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfz extends acja
{
    private final giz a;
    private final FrameLayout b;
    private final acir c;
    private acil d;
    private final TextView e;
    
    public kfz(final Context context, final giz a, final acir c) {
        a.getClass();
        this.a = a;
        context.getClass();
        c.getClass();
        this.c = c;
        final FrameLayout b = (FrameLayout)View.inflate(context, 2131624973, (ViewGroup)null);
        this.b = b;
        this.e = (TextView)b.findViewById(2131430071);
        a.c((View)b);
    }
    
    public final View a() {
        return this.a.a;
    }
    
    public final void c(final acir acir) {
        final acil d = this.d;
        if (d != null) {
            this.b.removeView(d.a());
            actc.w(this.d, acir);
            this.d = null;
        }
    }
}
