import java.util.Map;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcy implements acko
{
    private final vcy a;
    private final wyw b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final View g;
    private final acsx h;
    private final Runnable i;
    
    public adcy(final Context context, final vcy a, final aeea aeea, final wyw b, final adcx adcx, final Runnable i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.i = i;
        this.a = a;
        final View inflate = View.inflate(context, 2131624225, (ViewGroup)null);
        addn.e(this.c = inflate);
        this.d = (TextView)inflate.findViewById(2131432095);
        this.e = (TextView)inflate.findViewById(2131431822);
        final TextView f = (TextView)inflate.findViewById(2131430522);
        this.f = f;
        final View viewById = inflate.findViewById(2131432128);
        this.g = viewById;
        this.h = new acsx(a, aeea, (View)f, (vai)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        tpe.r((View)f, f.getBackground());
        final adam adam = (adam)adcx;
        aozh aozh;
        if ((aozh = adam.a.f) == null) {
            aozh = aozh.a;
        }
        if (aozh.b == 102716411) {
            final adak b2 = adam.b;
            aozh aozh2;
            if ((aozh2 = adam.a.f) == null) {
                aozh2 = aozh.a;
            }
            akbo a2;
            if (aozh2.b == 102716411) {
                a2 = (akbo)aozh2.c;
            }
            else {
                a2 = akbo.a;
            }
            final adbe adbe = (adbe)b2;
            adbe.n = a2;
            adbe.o = viewById;
            adbe.b();
        }
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acku acku) {
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final aozi aozi = (aozi)o;
        this.c.setVisibility(0);
        aida aida;
        if ((aida = aozi.e) == null) {
            aida = aida.a;
        }
        if ((aida.b & 0x1) != 0x0) {
            final TextView d = this.d;
            final int b = aozi.b;
            final ajut ajut = null;
            ajut ajut2;
            if ((b & 0x1) != 0x0) {
                if ((ajut2 = aozi.c) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            d.setText((CharSequence)acak.b(ajut2));
            final TextView e = this.e;
            ajut ajut3;
            if ((aozi.b & 0x2) != 0x0) {
                if ((ajut3 = aozi.d) == null) {
                    ajut3 = ajut.a;
                }
            }
            else {
                ajut3 = null;
            }
            e.setText((CharSequence)vde.a(ajut3, this.a, false));
            aida aida2;
            if ((aida2 = aozi.e) == null) {
                aida2 = aida.a;
            }
            aicz aicz;
            if ((aicz = aida2.c) == null) {
                aicz = aicz.a;
            }
            final TextView f = this.f;
            ajut ajut4 = ajut;
            if ((aicz.b & 0x200) != 0x0 && (ajut4 = aicz.i) == null) {
                ajut4 = ajut.a;
            }
            f.setText((CharSequence)acak.b(ajut4));
            final abh abh = new abh(1);
            ((Map<String, Runnable>)abh).put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i);
            this.h.a(aicz, this.b, (Map)abh);
            return;
        }
        this.c.setVisibility(8);
    }
}
