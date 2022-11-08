import android.widget.ImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class frq extends acdu
{
    final /* synthetic */ aqdz a;
    final /* synthetic */ Context b;
    final /* synthetic */ ort c;
    final /* synthetic */ aqdw d;
    
    public frq(final aqdz a, final Context b, final ort c, final aqdw d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void b(final ImageView imageView) {
        if (imageView instanceof frv) {
            ((frv)imageView).b();
        }
    }
    
    public final void c(final ImageView imageView) {
        if (!(imageView instanceof frv)) {
            return;
        }
        final aqdz a = this.a;
        final int c = a.c;
        final int n = 1;
        if ((c & 0x8) != 0x0) {
            aqdw aqdw;
            if ((aqdw = a.g) == null) {
                aqdw = aqdw.a;
            }
            final frv frv = (frv)imageView;
            int i;
            if ((i = aqql.I(aqdw.d)) == 0) {
                i = 1;
            }
            frv.t = i;
            aaja.w(aqdw, imageView, this.b, this.c);
        }
        final frv frv2 = (frv)imageView;
        int j = aqql.I(this.d.d);
        if (j == 0) {
            j = n;
        }
        frv2.t = j;
    }
}
