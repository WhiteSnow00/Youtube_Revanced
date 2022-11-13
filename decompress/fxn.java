import android.view.ViewStub;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxn extends acld
{
    private final acgs a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final acsy g;
    private final gah h;
    private final ackk i;
    
    public fxn(final Activity activity, final acgs a, final vcy vcy, final ziy ziy, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        a.getClass();
        this.a = a;
        final CardView b = (CardView)LayoutInflater.from((Context)activity).inflate(2131624847, viewGroup, false);
        this.b = b;
        final TextView e = (TextView)b.findViewById(2131432095);
        e.getClass();
        this.e = e;
        final TextView f = (TextView)b.findViewById(2131431822);
        f.getClass();
        this.f = f;
        this.g = ziy.ap((TextView)b.findViewById(2131430109));
        final ImageView c = (ImageView)b.findViewById(2131432009);
        c.getClass();
        this.c = c;
        this.d = (TextView)b.findViewById(2131428769);
        this.i = new ackk(vcy, (View)b);
        final ViewStub viewStub = (ViewStub)b.findViewById(2131431683);
        gah h;
        if (viewStub == null) {
            h = null;
        }
        else {
            h = new gah(viewStub, 1);
        }
        this.h = h;
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acku acku) {
        this.i.c();
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((amkx)o).j.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, final Object o) {
        final amkx amkx = (amkx)o;
        final ackk i = this.i;
        final wyw a = ((wyy)ackm).a;
        final int b = amkx.b;
        final aias aias = null;
        aiqj aiqj;
        if ((b & 0x8) != 0x0) {
            if ((aiqj = amkx.f) == null) {
                aiqj = aiqj.a;
            }
        }
        else {
            aiqj = null;
        }
        i.a(a, aiqj, ackm.e());
        aotp aotp;
        if ((aotp = amkx.c) == null) {
            aotp = aotp.a;
        }
        this.a.g(this.c, aotp);
        Label_0209: {
            if (aotp != null && (aotp.b & 0x8) != 0x0) {
                ahil ahil;
                if ((ahil = aotp.d) == null) {
                    ahil = ahil.a;
                }
                if ((ahil.b & 0x1) != 0x0) {
                    final ImageView c = this.c;
                    ahil ahil2;
                    if ((ahil2 = aotp.d) == null) {
                        ahil2 = ahil.a;
                    }
                    ahik ahik;
                    if ((ahik = ahil2.c) == null) {
                        ahik = ahik.a;
                    }
                    c.setContentDescription((CharSequence)ahik.c);
                    break Label_0209;
                }
            }
            this.c.setContentDescription((CharSequence)null);
        }
        ajut ajut;
        if ((ajut = amkx.i) == null) {
            ajut = ajut.a;
        }
        final TextView d = this.d;
        if (d != null) {
            d.setText((CharSequence)acak.b(ajut));
            this.d.setContentDescription(acak.i(ajut));
        }
        final TextView e = this.e;
        ajut ajut2;
        if ((amkx.b & 0x2) != 0x0) {
            if ((ajut2 = amkx.d) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(e, (CharSequence)acak.b(ajut2));
        final TextView f = this.f;
        ajut ajut3;
        if ((amkx.b & 0x4) != 0x0) {
            if ((ajut3 = amkx.e) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        tpe.t(f, (CharSequence)acak.b(ajut3));
        amkw amkw;
        if ((amkw = amkx.g) == null) {
            amkw = amkw.a;
        }
        aicz a2;
        if (amkw.b == 65153809) {
            amkw amkw2;
            if ((amkw2 = amkx.g) == null) {
                amkw2 = amkw.a;
            }
            if (amkw2.b == 65153809) {
                a2 = (aicz)amkw2.c;
            }
            else {
                a2 = aicz.a;
            }
        }
        else {
            a2 = null;
        }
        aias a3 = aias;
        if (a2 == null) {
            a3 = aias;
            if (this.h != null) {
                a3 = aias;
                if ((amkx.b & 0x20) != 0x0) {
                    amkv amkv;
                    if ((amkv = amkx.h) == null) {
                        amkv = amkv.a;
                    }
                    if (amkv.b == 91394106) {
                        a3 = (aias)amkv.c;
                    }
                    else {
                        a3 = aias.a;
                    }
                }
            }
        }
        ((acsx)this.g).b(a2, ((wyy)ackm).a);
        this.h.a(a3);
    }
}
