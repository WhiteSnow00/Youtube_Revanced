import android.widget.ImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class fry extends acfy
{
    final aqgl a;
    final Context b;
    final otc c;
    final aqgi d;
    
    public fry(final aqgl a, final Context b, final otc c, final aqgi d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void b(final ImageView imageView) {
        if (imageView instanceof fsd) {
            ((fsd)imageView).b();
        }
    }
    
    public final void c(final ImageView imageView) {
        if (!(imageView instanceof fsd)) {
            return;
        }
        final aqgl a = this.a;
        final int c = a.c;
        final int n = 1;
        if ((c & 0x8) != 0x0) {
            aqgi aqgi;
            if ((aqgi = a.g) == null) {
                aqgi = aqgi.a;
            }
            final fsd fsd = (fsd)imageView;
            int j;
            if ((j = aqsx.J(aqgi.d)) == 0) {
                j = 1;
            }
            fsd.t = j;
            aakv.u(aqgi, imageView, this.b, this.c);
        }
        final fsd fsd2 = (fsd)imageView;
        int i = aqsx.J(this.d.d);
        if (i == 0) {
            i = n;
        }
        fsd2.t = i;
    }
}
