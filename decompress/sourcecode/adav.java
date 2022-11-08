import java.util.Map;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adav implements acil
{
    private final vax a;
    private final wwv b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final View g;
    private final acqt h;
    private final Runnable i;
    
    public adav(final Context context, final vax a, final aeby aeby, final wwv b, final adau adau, final Runnable i, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.i = i;
        this.a = a;
        final View inflate = View.inflate(context, 2131624226, (ViewGroup)null);
        adbk.e(this.c = inflate);
        this.d = (TextView)inflate.findViewById(2131432092);
        this.e = (TextView)inflate.findViewById(2131431819);
        final TextView f = (TextView)inflate.findViewById(2131430521);
        this.f = f;
        final View viewById = inflate.findViewById(2131432125);
        this.g = viewById;
        this.h = new acqt(a, aeby, (View)f, null, null, null, null);
        tmy.r((View)f, f.getBackground());
        final acyk acyk = (acyk)adau;
        aoxd aoxd;
        if ((aoxd = acyk.a.f) == null) {
            aoxd = aoxd.a;
        }
        if (aoxd.b == 102716411) {
            final acyi b2 = acyk.b;
            aoxd aoxd2;
            if ((aoxd2 = acyk.a.f) == null) {
                aoxd2 = aoxd.a;
            }
            ajzl a2;
            if (aoxd2.b == 102716411) {
                a2 = (ajzl)aoxd2.c;
            }
            else {
                a2 = ajzl.a;
            }
            final aczb aczb = (aczb)b2;
            aczb.n = a2;
            aczb.o = viewById;
            aczb.b();
        }
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
    }
}
