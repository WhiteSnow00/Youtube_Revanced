import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxl extends acld
{
    private final ackr a;
    private final acgs b;
    private final ackk c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final acsy i;
    private final int j;
    
    public fxl(final Context context, final ViewGroup viewGroup, final gjh a, final acgs b, final vcy vcy, final ziy ziy, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = (ackr)a;
        this.b = b;
        final View inflate = LayoutInflater.from(context).inflate(2131624264, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView)inflate.findViewById(2131432009);
        this.f = (TextView)inflate.findViewById(2131432095);
        this.g = (TextView)inflate.findViewById(2131431822);
        final TextView h = (TextView)inflate.findViewById(2131427452);
        this.h = h;
        this.i = ziy.ap(h);
        ((ackr)a).c(inflate);
        this.c = new ackk(vcy, (ackr)a);
        this.j = tpe.aZ(context.getResources().getDisplayMetrics(), 8);
    }
    
    public final View a() {
        return this.d;
    }
    
    public final void c(final acku acku) {
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aiwj)o).h.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aiwj aiwj = (aiwj)o;
        final acgs b = this.b;
        final ImageView e = this.e;
        aotp aotp;
        if ((aotp = aiwj.c) == null) {
            aotp = aotp.a;
        }
        b.g(e, aotp);
        final TextView f = this.f;
        ajut ajut;
        if ((aiwj.b & 0x2) != 0x0) {
            if ((ajut = aiwj.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        tpe.t(f, (CharSequence)acak.b(ajut));
        final TextView g = this.g;
        ajut ajut2;
        if ((aiwj.b & 0x4) != 0x0) {
            if ((ajut2 = aiwj.e) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(g, (CharSequence)acak.b(ajut2));
        aicz aicz;
        if ((aiwj.b & 0x8) != 0x0) {
            anuv anuv;
            if ((anuv = aiwj.f) == null) {
                anuv = anuv.a;
            }
            aicz = (aicz)((ahbc)anuv).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
        }
        else {
            aicz = null;
        }
        ((acsx)this.i).b(aicz, ((wyy)ackm).a);
        if ((aiwj.b & 0x10) != 0x0) {
            final ackk c = this.c;
            final wyw a = ((wyy)ackm).a;
            aiqj aiqj;
            if ((aiqj = aiwj.g) == null) {
                aiqj = aiqj.a;
            }
            c.a(a, aiqj, ackm.e());
            tpe.r(this.d, (Drawable)null);
            this.h.setClickable(false);
        }
        tpe.aF(this.d, tpe.aq(this.j), (Class)ViewGroup$MarginLayoutParams.class);
    }
}
