import com.google.protos.youtube.api.innertube.BackgroundPromoRendererOuterClass;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kha extends acld
{
    private final gjh a;
    private final FrameLayout b;
    private final acku c;
    private acko d;
    private final TextView e;
    
    public kha(final Context context, final gjh a, final acku c) {
        a.getClass();
        this.a = a;
        context.getClass();
        c.getClass();
        this.c = c;
        final FrameLayout b = (FrameLayout)View.inflate(context, 2131624974, (ViewGroup)null);
        this.b = b;
        this.e = (TextView)b.findViewById(2131430071);
        a.c((View)b);
    }
    
    public final View a() {
        return this.a.a;
    }
    
    public final void c(final acku acku) {
        final acko d = this.d;
        if (d != null) {
            this.b.removeView(d.a());
            aald.C(this.d, acku);
            this.d = null;
        }
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        final amzi amzi = (amzi)o;
        return new byte[0];
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final amzi amzi = (amzi)o;
        final TextView e = this.e;
        ajut ajut;
        if ((amzi.b & 0x2) != 0x0) {
            if ((ajut = amzi.c) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        tpe.t(e, (CharSequence)acak.b(ajut));
        anuv anuv;
        if ((anuv = amzi.d) == null) {
            anuv = anuv.a;
        }
        if (anuv.ry((ahaq)BackgroundPromoRendererOuterClass.backgroundPromoRenderer)) {
            anuv anuv2;
            if ((anuv2 = amzi.d) == null) {
                anuv2 = anuv.a;
            }
            final ahyk ahyk = (ahyk)anuv2.rx((ahaq)BackgroundPromoRendererOuterClass.backgroundPromoRenderer);
            final aezp a = aald.A(this.c, (Object)ahyk, (ViewGroup)this.b);
            if (a.h()) {
                (this.d = (acko)a.c()).mN(ackm, ahyk);
                this.b.addView(this.d.a());
                tpe.aH((View)this.b, -1, -1);
                this.b.setVisibility(0);
            }
        }
        else {
            tpe.aH((View)this.b, -1, -2);
        }
        this.a.e(ackm);
    }
}
