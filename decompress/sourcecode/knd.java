import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knd extends acja
{
    private final fve a;
    private final aceo b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;
    
    public knd(final Context context, final aceo b, final fvf fvf, final uyi uyi) {
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131625646, (ViewGroup)null);
        this.c = inflate;
        if (uyi.aT()) {
            inflate.setBackgroundColor(tmy.cn(context, 2130970829));
        }
        this.d = (TextView)inflate.findViewById(2131432092);
        this.g = (ImageView)inflate.findViewById(2131428086);
        this.e = (TextView)inflate.findViewById(2131431810);
        final TextView f = (TextView)inflate.findViewById(2131431807);
        this.f = f;
        this.a = fvf.a(f, null);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
        this.g.setBackground((Drawable)null);
        this.d.setText((CharSequence)null);
        this.e.setText((CharSequence)null);
        this.a.f();
    }
}
