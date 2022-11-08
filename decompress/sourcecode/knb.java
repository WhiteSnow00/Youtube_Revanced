import java.util.Iterator;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knb extends acja
{
    public final View a;
    private final aceo b;
    private final acng c;
    private final acih d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final ImageView i;
    private final TextView j;
    private final ViewStub k;
    private fzy l;
    
    public knb(final Context context, final aceo b, final acng c, final vax vax, final cxz cxz, int n, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        final int n2 = n - 1;
        if (n2 != 1) {
            final int n3 = n = 2131625301;
            if (n2 != 2) {
                if (n2 != 3) {
                    n = n3;
                }
                else {
                    n = 2131625303;
                }
            }
        }
        else {
            n = 2131625304;
        }
        final View inflate = LayoutInflater.from(context).inflate(n, viewGroup, false);
        this.a = inflate;
        this.f = (TextView)inflate.findViewById(2131432092);
        this.g = (TextView)inflate.findViewById(2131431819);
        this.h = (TextView)inflate.findViewById(2131427952);
        this.i = (ImageView)inflate.findViewById(2131427956);
        this.e = (ImageView)inflate.findViewById(2131432006);
        this.j = (TextView)inflate.findViewById(2131432009);
        this.d = new acih(vax, inflate);
        final ViewStub k = (ViewStub)inflate.findViewById(2131429862);
        if ((this.k = k) != null) {
            this.l = cxz.D(context, k);
        }
    }
    
    public final View a() {
        return this.a;
    }
    
    public final void c(final acir acir) {
        this.d.c();
        final ImageView i = this.i;
        if (i != null) {
            i.setImageResource(0);
            this.i.setVisibility(8);
        }
    }
}
