import android.content.Context;
import android.widget.TextView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class faf implements fvd
{
    public final abyf a;
    public final fve b;
    public final ViewGroup c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    private final fwd g;
    private final TextView h;
    private final TextView i;
    
    public faf(final Context context, final fvf fvf, final hyc hyc, final ViewGroup c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = aaiy.x(context, (ajsq)null, (abyc)null);
        this.c = c;
        this.h = (TextView)c.findViewById(2131430675);
        this.i = (TextView)c.findViewById(2131430676);
        final fwd k = hyc.k(c.findViewById(2131431815));
        this.g = k;
        this.b = fvf.a((TextView)c.findViewById(2131431807), k);
    }
    
    public final void b(final boolean b, final boolean b2, final boolean b3) {
        if (b3) {
            ciq.b(this.c, (cim)null);
        }
        if (b != b2) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            return;
        }
        if (!b2) {
            tmy.t(this.h, this.d);
            tmy.t(this.i, this.e);
            return;
        }
        tmy.t(this.h, this.f);
        this.i.setVisibility(8);
    }
    
    @Override
    public final void pv(final boolean b, final boolean b2) {
        this.b(b, b2, true);
    }
}
