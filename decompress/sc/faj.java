import android.content.Context;
import android.widget.TextView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class faj implements fvm
{
    public final acai a;
    public final fvn b;
    public final ViewGroup c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    private final fwl g;
    private final TextView h;
    private final TextView i;
    
    public faj(final Context context, final hwn hwn, final hyx hyx, final ViewGroup c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = aakt.w(context, (ajut)null, (acaf)null);
        this.c = c;
        this.h = (TextView)c.findViewById(2131430678);
        this.i = (TextView)c.findViewById(2131430679);
        final fwl l = hyx.l(c.findViewById(2131431818));
        this.g = l;
        this.b = hwn.a((TextView)c.findViewById(2131431810), l);
    }
    
    public final void b(final boolean b, final boolean b2, final boolean b3) {
        if (b3) {
            cir.b(this.c, (cin)null);
        }
        if (b != b2) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            return;
        }
        if (!b2) {
            tpe.t(this.h, this.d);
            tpe.t(this.i, this.e);
            return;
        }
        tpe.t(this.h, this.f);
        this.i.setVisibility(8);
    }
    
    public final void pz(final boolean b, final boolean b2) {
        this.b(b, b2, true);
    }
}
