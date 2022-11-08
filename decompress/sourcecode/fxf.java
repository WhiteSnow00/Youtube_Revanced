import android.view.ViewStub;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxf extends acja
{
    private final aceo a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final acqu g;
    private final fzz h;
    private final acih i;
    
    public fxf(final Activity activity, final aceo a, final vax vax, final zhb zhb, final ViewGroup viewGroup, final byte[] array) {
        a.getClass();
        this.a = a;
        final CardView b = (CardView)LayoutInflater.from((Context)activity).inflate(2131624846, viewGroup, false);
        this.b = b;
        final TextView e = (TextView)b.findViewById(2131432092);
        e.getClass();
        this.e = e;
        final TextView f = (TextView)b.findViewById(2131431819);
        f.getClass();
        this.f = f;
        this.g = zhb.g((TextView)b.findViewById(2131430109));
        final ImageView c = (ImageView)b.findViewById(2131432006);
        c.getClass();
        this.c = c;
        this.d = (TextView)b.findViewById(2131428769);
        this.i = new acih(vax, (View)b);
        final ViewStub viewStub = (ViewStub)b.findViewById(2131431680);
        fzz h;
        if (viewStub == null) {
            h = null;
        }
        else {
            h = new fzz(viewStub, 1);
        }
        this.h = h;
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        this.i.c();
    }
}
