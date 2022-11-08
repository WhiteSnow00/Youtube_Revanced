import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawz extends aaxd
{
    public aawz(final Context context, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final ajmx ajmx, final uyi uyi) {
        super(context, creatorEndscreenOverlayPresenter, ajmx, uyi);
    }
    
    public final void g(final aaxe aaxe) {
        super.g(aaxe);
        ((TextView)aaxe.g).setVisibility(8);
        ((TextView)aaxe.h).setVisibility(0);
        final Drawable a = agw.a(((aawv)this).a, 2131232793);
        if (a != null) {
            aip.f(a.mutate(), tmy.ct(((aawv)this).a, 2130970940).orElse(0));
        }
        final TextView textView = (TextView)aaxe.h;
        final ajsq ajsq = null;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, a, (Drawable)null);
        ((TextView)aaxe.h).setCompoundDrawablePadding(8);
        final Object j = aaxe.j;
        final ajmx b = ((aawv)this).b;
        ajsq ajsq2;
        if ((b.b & 0x4000) != 0x0) {
            if ((ajsq2 = b.p) == null) {
                ajsq2 = ajsq.a;
            }
        }
        else {
            ajsq2 = null;
        }
        tmy.t((TextView)j, (CharSequence)abyh.b(ajsq2));
        final Object k = aaxe.k;
        final ajmx b2 = ((aawv)this).b;
        ajsq ajsq3;
        if ((b2.b & 0x8000) != 0x0) {
            if ((ajsq3 = b2.q) == null) {
                ajsq3 = ajsq.a;
            }
        }
        else {
            ajsq3 = null;
        }
        tmy.t((TextView)k, (CharSequence)abyh.b(ajsq3));
        final Object l = aaxe.l;
        final ajmx b3 = ((aawv)this).b;
        ajsq ajsq4 = ajsq;
        if ((b3.b & 0x2000) != 0x0 && (ajsq4 = b3.o) == null) {
            ajsq4 = ajsq.a;
        }
        tmy.t((TextView)l, (CharSequence)abyh.b(ajsq4));
    }
    
    public final void j() {
        super.j();
        final TextView q = super.q;
        final ajmx b = ((aawv)this).b;
        ajsq ajsq;
        if ((b.b & 0x20000) != 0x0) {
            if ((ajsq = b.r) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        tmy.t(q, (CharSequence)abyh.b(ajsq));
        super.p.setVisibility(8);
    }
}
