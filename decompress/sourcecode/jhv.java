import android.graphics.drawable.Drawable;
import android.view.View;
import app.revanced.integrations.patches.HideAlbumCardsPatch;
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

public final class jhv extends acja
{
    private final aceo a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final acih e;
    
    public jhv(final Activity activity, final aceo a, final vax vax, final adcr adcr, final uyi uyi, final ViewGroup viewGroup, final byte[] array) {
        this.a = a;
        final View inflate = LayoutInflater.from((Context)activity).inflate(2131624022, viewGroup, false);
        HideAlbumCardsPatch.hideAlbumCards(inflate);
        final CardView b = (CardView)inflate;
        this.b = b;
        if (uyi.aR()) {
            b.f((float)tmy.aZ(((Context)activity).getResources().getDisplayMetrics(), 8));
        }
        if (uyi.aT()) {
            b.d(tmy.cn((Context)activity, 2130970829));
        }
        final TextView d = (TextView)b.findViewById(2131432092);
        d.getClass();
        this.d = d;
        final ImageView c = (ImageView)b.findViewById(2131432006);
        c.getClass();
        this.c = c;
        this.e = new acih(vax, (View)b);
        adcr.c((View)b, adcr.a((View)b, (Drawable)null));
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        this.e.c();
    }
}
