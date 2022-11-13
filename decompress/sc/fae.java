import java.util.List;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.widget.TextView;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fae extends ezf
{
    private final View l;
    private final acsy m;
    private final aeea n;
    
    public fae(final Context context, final acgs acgs, final gjh gjh, final aeea aeea, final acpn acpn, final cya cya, final ziy ziy, final hwn hwn, final hyx hyx, final aeea n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(context, acgs, gjh, aeea, acpn, cya, hwn, hyx, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.l = super.e.findViewById(2131427730);
        this.n = n;
        final TextView h = this.h;
        acsy ap;
        if (h != null) {
            ap = ziy.ap(h);
        }
        else {
            ap = null;
        }
        this.m = ap;
    }
    
    public static final CharSequence q(final aiut aiut) {
        ajut ajut;
        if ((aiut.b & 0x20) != 0x0) {
            if ((ajut = aiut.f) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public static final aiaw r(final aiut aiut) {
        for (final aiae aiae : aiut.j) {
            if ((aiae.b & 0x1000000) != 0x0) {
                aiaw aiaw;
                if ((aiaw = aiae.h) == null) {
                    aiaw = aiaw.a;
                }
                return aiaw;
            }
        }
        return null;
    }
    
    public static final CharSequence s(final aiut aiut) {
        ajut ajut;
        if ((aiut.b & 0x10) != 0x0) {
            if ((ajut = aiut.e) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        return (CharSequence)acak.b(ajut);
    }
    
    public final aiqj b(final Object o) {
        aiqj aiqj;
        if ((aiqj = ((aiut)o).g) == null) {
            aiqj = aiqj.a;
        }
        return aiqj;
    }
    
    public final amgv d(final Object o) {
        amgv amgv;
        if ((amgv = ((aiut)o).m) == null) {
            amgv = amgv.a;
        }
        return amgv;
    }
    
    public final /* bridge */ aome f(final Object o) {
        final aiut aiut = (aiut)o;
        aiuu aiuu;
        if ((aiuu = aiut.h) == null) {
            aiuu = aiuu.a;
        }
        aome aome;
        if ((aiuu.b & 0x1) != 0x0) {
            aiuu aiuu2;
            if ((aiuu2 = aiut.h) == null) {
                aiuu2 = aiuu.a;
            }
            if ((aome = aiuu2.c) == null) {
                aome = aome.a;
            }
        }
        else {
            aome = null;
        }
        return aome;
    }
    
    public final aotp g(final Object o) {
        aotp aotp;
        if ((aotp = ((aiut)o).c) == null) {
            aotp = aotp.a;
        }
        return aotp;
    }
    
    public final CharSequence h(final Object o) {
        return q((aiut)o);
    }
    
    public final CharSequence i(final Object o) {
        return s((aiut)o);
    }
    
    public final /* bridge */ CharSequence j(final Object o) {
        return q((aiut)o);
    }
    
    public final /* bridge */ CharSequence k(final Object o) {
        final aiut aiut = (aiut)o;
        Object o2;
        if (r(aiut) != null) {
            o2 = r(aiut).b;
        }
        else {
            ajut ajut;
            if ((aiut.b & 0x8) != 0x0) {
                if ((ajut = aiut.d) == null) {
                    ajut = ajut.a;
                }
            }
            else {
                ajut = null;
            }
            o2 = acak.b(ajut);
        }
        return (CharSequence)o2;
    }
    
    public final /* bridge */ CharSequence l(final Object o) {
        return s((aiut)o);
    }
    
    public final /* bridge */ Object m(final Object o, final aome c) {
        aiut aiut2;
        final aiut aiut = aiut2 = (aiut)o;
        if ((aiut.b & 0x100) != 0x0) {
            final ahbb ahbb = (ahbb)((ahbh)aiut).toBuilder();
            aiuu aiuu;
            if ((aiuu = aiut.h) == null) {
                aiuu = aiuu.a;
            }
            final ahaz builder = ((ahbh)aiuu).toBuilder();
            builder.copyOnWrite();
            final aiuu aiuu2 = (aiuu)builder.instance;
            c.getClass();
            aiuu2.c = c;
            aiuu2.b |= 0x1;
            ((ahaz)ahbb).copyOnWrite();
            final aiut aiut3 = (aiut)ahbb.instance;
            final aiuu h = (aiuu)builder.build();
            h.getClass();
            aiut3.h = h;
            aiut3.b |= 0x100;
            aiut2 = (aiut)((ahaz)ahbb).build();
        }
        return aiut2;
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final aiut aiut = (aiut)o;
        super.mN(ackm, (Object)aiut);
        tpe.aF(this.l, tpe.aD(this.a.getResources().getDimensionPixelSize(2131167259)), (Class)ViewGroup$LayoutParams.class);
        final TextView textView = (TextView)super.e.findViewById(2131428131);
        final aiaw r = r(aiut);
        boolean b = false;
        if (r != null) {
            final trd background = new trd(tpe.cr(textView.getContext(), 2130970948));
            textView.setMaxLines(2);
            textView.setBackground((Drawable)background);
            textView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new fad(aiut, textView, background, 0));
        }
        else {
            textView.setBackground((Drawable)null);
            textView.setMaxLines(this.a.getResources().getInteger(2131492890));
            textView.setPadding(0, 0, 0, 0);
        }
        aiao aiao;
        if ((aiut.b & 0x200) != 0x0) {
            if ((aiao = aiut.k) == null) {
                aiao = aiao.a;
            }
        }
        else {
            aiao = null;
        }
        final gag i = super.i;
        if (i != null && aiao != null && (aiao.b & 0x8) != 0x0) {
            amhp amhp;
            if ((amhp = aiao.f) == null) {
                amhp = amhp.a;
            }
            i.f(amhp);
        }
        final wyw a = ackm.a;
        if (this.m == null) {
            tpe.v((View)this.h, false);
        }
        else {
            aicz aicz;
            if ((aiut.b & 0x40000) != 0x0) {
                anuv anuv;
                if ((anuv = aiut.o) == null) {
                    anuv = anuv.a;
                }
                aicz = (aicz)anuv.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            }
            else {
                aicz = null;
            }
            ((acsx)this.m).b(aicz, a);
            final TextView h = this.h;
            if (aicz != null) {
                b = true;
            }
            tpe.v((View)h, b);
        }
        this.n.N(super.e, this.n.M(super.e, (Drawable)null));
    }
    
    public final List n(final Object o) {
        return (List)((aiut)o).i;
    }
    
    public final /* bridge */ byte[] o(final Object o) {
        return ((aiut)o).n.I();
    }
}
