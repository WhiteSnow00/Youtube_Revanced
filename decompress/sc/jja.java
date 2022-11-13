import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jja extends ftt
{
    private final Context a;
    private final ackr f;
    private final ackk g;
    
    public jja(final Context a, final acgs acgs, final gjh f, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(a, acgs, 2131624135);
        a.getClass();
        this.a = a;
        f.getClass();
        ((gjh)(this.f = (ackr)f)).c(super.b);
        this.g = aeea.ab((ackr)f);
    }
    
    public final View a() {
        return ((gjh)this.f).a;
    }
    
    public final void c(final acku acku) {
        this.g.c();
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final aigd aigd = (aigd)o;
        tpe.aF(this.a(), tpe.aD(this.a.getResources().getDimensionPixelSize(2131165727)), (Class)ViewGroup$LayoutParams.class);
        final ackk g = this.g;
        final wyw a = ackm.a;
        final int b = aigd.b;
        final ajut ajut = null;
        aiqj aiqj;
        if ((b & 0x8) != 0x0) {
            if ((aiqj = aigd.f) == null) {
                aiqj = aiqj.a;
            }
        }
        else {
            aiqj = null;
        }
        g.a(a, aiqj, ackm.e());
        ackm.a.t((wzz)new wyt(aigd.g), (alhi)null);
        aotp aotp;
        if ((aigd.b & 0x1) != 0x0) {
            if ((aotp = aigd.c) == null) {
                aotp = aotp.a;
            }
        }
        else {
            aotp = null;
        }
        this.b(aotp);
        ajut ajut2;
        if ((aigd.b & 0x2) != 0x0) {
            if ((ajut2 = aigd.d) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        this.f((CharSequence)acak.b(ajut2));
        ajut ajut3 = ajut;
        if ((aigd.b & 0x4) != 0x0 && (ajut3 = aigd.e) == null) {
            ajut3 = ajut.a;
        }
        this.d((CharSequence)acak.b(ajut3));
        this.f.e(ackm);
    }
}
