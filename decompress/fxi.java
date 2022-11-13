import android.graphics.drawable.Drawable;
import android.widget.GridLayout$LayoutParams;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxi extends acld
{
    private final acgs a;
    private final ackr b;
    private final ackk c;
    private final Resources d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final acsy k;
    private final TextView l;
    
    public fxi(final Context context, final acgs a, final aeea aeea, final ziy ziy, final gjh b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.c = aeea.ab((ackr)b);
        a.getClass();
        this.a = a;
        this.b = (ackr)b;
        this.d = context.getResources();
        final View inflate = View.inflate(context, 2131624242, (ViewGroup)null);
        this.e = inflate;
        this.f = (ImageView)inflate.findViewById(2131432009);
        this.g = (TextView)inflate.findViewById(2131431995);
        this.h = (TextView)inflate.findViewById(2131432095);
        this.i = (TextView)inflate.findViewById(2131431822);
        this.j = (TextView)inflate.findViewById(2131432151);
        final TextView l = (TextView)inflate.findViewById(2131430110);
        this.l = l;
        this.k = ziy.ap(l);
        b.c(inflate);
    }
    
    public final View a() {
        return ((gjh)this.b).a;
    }
    
    public final void c(final acku acku) {
        this.c.c();
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((aivn)o).k.I();
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final aivn aivn = (aivn)o;
        final GridLayout$LayoutParams gridLayout$LayoutParams = (GridLayout$LayoutParams)this.f.getLayoutParams();
        final int b = aivn.b;
        if ((b & 0x8) != 0x0) {
            gridLayout$LayoutParams.width = this.d.getDimensionPixelSize(2131166076);
            final acgs a = this.a;
            final ImageView f = this.f;
            aotp aotp;
            if ((aotp = aivn.f) == null) {
                aotp = aotp.a;
            }
            a.g(f, aotp);
        }
        else if ((b & 0x4) != 0x0) {
            gridLayout$LayoutParams.width = this.d.getDimensionPixelSize(2131166104);
            final acgs a2 = this.a;
            final ImageView f2 = this.f;
            aotp aotp2;
            if ((aotp2 = aivn.e) == null) {
                aotp2 = aotp.a;
            }
            a2.g(f2, aotp2);
        }
        final View e = this.e;
        final aiqj aiqj = null;
        tpe.s(e, (Drawable)null, 0);
        final TextView g = this.g;
        ajut ajut;
        if ((aivn.b & 0x100) != 0x0) {
            if ((ajut = aivn.i) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        tpe.t(g, (CharSequence)acak.b(ajut));
        final TextView h = this.h;
        ajut ajut2;
        if ((aivn.b & 0x1) != 0x0) {
            if ((ajut2 = aivn.c) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(h, (CharSequence)acak.b(ajut2));
        final TextView i = this.i;
        ajut ajut3;
        if ((aivn.b & 0x2) != 0x0) {
            if ((ajut3 = aivn.d) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        tpe.t(i, (CharSequence)acak.b(ajut3));
        final TextView j = this.j;
        ajut ajut4;
        if ((aivn.b & 0x40) != 0x0) {
            if ((ajut4 = aivn.h) == null) {
                ajut4 = ajut.a;
            }
        }
        else {
            ajut4 = null;
        }
        tpe.t(j, (CharSequence)acak.b(ajut4));
        final acsy k = this.k;
        aida aida;
        if ((aida = aivn.j) == null) {
            aida = aida.a;
        }
        aicz aicz;
        if ((aida.b & 0x1) != 0x0) {
            aida aida2;
            if ((aida2 = aivn.j) == null) {
                aida2 = aida.a;
            }
            if ((aicz = aida2.c) == null) {
                aicz = aicz.a;
            }
        }
        else {
            aicz = null;
        }
        ((acsx)k).b(aicz, ((wyy)ackm).a);
        if ((aivn.b & 0x8) != 0x0) {
            tpe.d((View)this.l, agx.a(this.l.getContext(), 2131231070));
        }
        final ackk c = this.c;
        final wyw a3 = ((wyy)ackm).a;
        aiqj aiqj2 = aiqj;
        if ((aivn.b & 0x10) != 0x0 && (aiqj2 = aivn.g) == null) {
            aiqj2 = aiqj.a;
        }
        c.a(a3, aiqj2, ackm.e());
        this.b.e(ackm);
    }
}
