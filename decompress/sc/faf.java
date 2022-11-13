import android.content.Context;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class faf extends ftt
{
    final fah a;
    private final fwl f;
    private final fvn g;
    private final ackk h;
    private final View i;
    private boolean j;
    
    public faf(final fah a) {
        this.a = a;
        super(a.a, a.b, 2131624498);
        this.h = a.g.ab((ackr)a.c);
        this.i = super.b.findViewById(2131428145);
        final TextView textView = (TextView)super.b.findViewById(2131431810);
        final fwl l = a.f.l(super.b.findViewById(2131431818));
        this.f = l;
        this.g = a.e.a(textView, l);
    }
    
    public final View a() {
        return super.b;
    }
    
    public final void c(final acku acku) {
        this.h.c();
        this.g.f();
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final ajzb ajzb = (ajzb)o;
        final int b = ajzb.b;
        final aiqj aiqj = null;
        ajut ajut;
        if ((b & 0x4) != 0x0) {
            if ((ajut = ajzb.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        this.f((CharSequence)acak.b(ajut));
        ajut ajut2;
        if ((ajzb.b & 0x8) != 0x0) {
            if ((ajut2 = ajzb.e) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        tpe.t(super.d, (CharSequence)acak.b(ajut2));
        ajut ajut3;
        if ((ajzb.b & 0x10) != 0x0) {
            if ((ajut3 = ajzb.f) == null) {
                ajut3 = ajut.a;
            }
        }
        else {
            ajut3 = null;
        }
        this.d((CharSequence)acak.b(ajut3));
        aotp aotp;
        if ((aotp = ajzb.c) == null) {
            aotp = aotp.a;
        }
        this.b(aotp);
        ajzc ajzc;
        if ((ajzc = ajzb.j) == null) {
            ajzc = ajzc.a;
        }
        aome a;
        if (ajzc.b == 55419609) {
            ajzc ajzc2;
            if ((ajzc2 = ajzb.j) == null) {
                ajzc2 = ajzc.a;
            }
            if (ajzc2.b == 55419609) {
                a = (aome)ajzc2.c;
            }
            else {
                a = aome.a;
            }
        }
        else {
            a = null;
        }
        final wyw a2 = ackm.a;
        aome aome = a;
        if (a != null) {
            final Context a3 = this.a.a;
            final ahaz builder = a.toBuilder();
            fex.d(a3, builder, this.c.getText());
            aome = (aome)builder.build();
        }
        this.g.j(aome, a2);
        if (!this.j) {
            final View b2 = this.f.b();
            if (b2 != null) {
                final int dimensionPixelOffset = this.a.a.getResources().getDimensionPixelOffset(2131165779);
                final int dimensionPixelOffset2 = this.a.a.getResources().getDimensionPixelOffset(2131165777);
                b2.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
                this.j = true;
            }
        }
        tpe.v(this.i, true);
        final ackk h = this.h;
        final wyw a4 = ackm.a;
        aiqj aiqj2 = aiqj;
        if ((ajzb.b & 0x80) != 0x0 && (aiqj2 = ajzb.i) == null) {
            aiqj2 = aiqj.a;
        }
        h.a(a4, aiqj2, ackm.e());
    }
}
