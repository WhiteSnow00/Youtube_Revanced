import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.protos.youtube.api.innertube.GamingSupportedRenderers;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmz extends acja
{
    private final Context a;
    private final aceo b;
    private final CardView c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final acih h;
    
    public kmz(final Context a, final aceo b, final vax vax, final ViewGroup viewGroup) {
        this.a = a;
        b.getClass();
        this.b = b;
        final CardView c = (CardView)LayoutInflater.from(a).inflate(2131624486, viewGroup, false);
        this.c = c;
        final TextView e = (TextView)c.findViewById(2131432092);
        e.getClass();
        this.e = e;
        final TextView f = (TextView)c.findViewById(2131431819);
        f.getClass();
        this.f = f;
        final TextView g = (TextView)c.findViewById(2131427706);
        g.getClass();
        this.g = g;
        final ImageView d = (ImageView)c.findViewById(2131432006);
        d.getClass();
        this.d = d;
        this.h = new acih(vax, (View)c);
    }
    
    public final View a() {
        return (View)this.c;
    }
    
    public final void c(final acir acir) {
        this.h.c();
    }
}
