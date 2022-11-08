import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jan
{
    public final acng a;
    public final Context b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final acqt f;
    public final wwv g;
    public final vax h;
    public final acts i;
    public final int j;
    
    public jan(final Context b, final wwv g, final vax h, final acng a, final acts i, final auip auip, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.g = g;
        this.a = a;
        this.h = h;
        this.i = i;
        final View inflate = LayoutInflater.from(b).inflate(2131624467, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131427927);
        this.e = (TextView)inflate.findViewById(2131427934);
        this.f = auip.H(inflate);
        this.j = tmy.ct(b, 2130970881).orElse(0);
    }
}
