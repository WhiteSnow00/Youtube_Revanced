import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import j$.util.Optional;
import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;
import android.widget.RelativeLayout;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iut implements asjm
{
    public final Object a;
    private final int b;
    
    public iut(final ImageView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iut(final RelativeLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iut(final FullscreenEngagementPanelOverlay a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iut(final iuu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iut(final ivb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iut(final ivf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iut(final ivn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public iut(final ivr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                ((View)this.a).setTranslationY((float)(int)o);
                return;
            }
            case 19: {
                ((View)this.a).setTranslationX((float)(int)o);
                return;
            }
            case 18: {
                ((FullscreenEngagementPanelOverlay)this.a).i = (boolean)o;
                return;
            }
            case 17: {
                ((FullscreenEngagementPanelOverlay)this.a).j = (boolean)o;
                return;
            }
            case 16: {
                ((ImageView)this.a).setImageResource((int)o);
                return;
            }
            case 15: {
                final Object a = this.a;
                final boolean booleanValue = (boolean)o;
                final ivr ivr = (ivr)a;
                final ImageView f = ivr.f;
                if (f == null) {
                    return;
                }
                int n;
                if (booleanValue) {
                    n = 2132017260;
                }
                else {
                    n = 2132017255;
                }
                f.setContentDescription((CharSequence)f.getContext().getString(n));
                ivr.f.setSelected(booleanValue);
                ivr.f.sendAccessibilityEvent(16384);
                return;
            }
            case 14: {
                final Object a2 = this.a;
                final aezq aezq = (aezq)o;
                final float floatValue = (float)aezq.a;
                if ((boolean)aezq.b && -0.01f + floatValue > 0.0f) {
                    final ivn ivn = (ivn)a2;
                    ivn.c();
                    final View c = ivn.c;
                    c.getClass();
                    c.setVisibility(0);
                    ivn.c.setAlpha(floatValue);
                    return;
                }
                final View c2 = ((ivn)a2).c;
                if (c2 != null) {
                    c2.setVisibility(8);
                }
                return;
            }
            case 13: {
                final Object a3 = this.a;
                final aezp j = aezp.j((Object)((Optional)o).orElse((Object)null));
                final ivf ivf = (ivf)a3;
                ((TextView)ivf.p.a).setClickable(false);
                anb.N(ivf.p.a, new ivd(ivf));
                final Drawable[] compoundDrawablesRelative = ((TextView)ivf.p.a).getCompoundDrawablesRelative();
                Drawable drawable;
                if (compoundDrawablesRelative.length > 1) {
                    drawable = compoundDrawablesRelative[0];
                }
                else {
                    drawable = null;
                }
                if (!j.h()) {
                    ((TextView)ivf.p.a).setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
                    return;
                }
                final TextView textView = (TextView)ivf.p.a;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable)null, tpe.cu(textView.getContext(), 2130968966), (Drawable)null);
                ((TextView)ivf.p.a).setOnClickListener((View$OnClickListener)new ivc(ivf, j, 2));
                if ((((aiqj)j.c()).b & 0x1) != 0x0) {
                    ivf.a.l((wzz)new wyt(((aiqj)j.c()).c));
                }
                return;
            }
            case 12: {
                final Object a4 = this.a;
                final CharSequence i = (CharSequence)((Optional)o).orElse((Object)null);
                final ivf ivf2 = (ivf)a4;
                ivf2.j = i;
                ivf2.i(true);
                return;
            }
            case 11: {
                final Object a5 = this.a;
                final PlayerResponseModel playerResponseModel = (PlayerResponseModel)o;
                final ivb ivb = (ivb)a5;
                ivb.b.m();
                final fnz c3 = ivb.c;
                if ((c3 != null && c3.a != null) || ivb.i()) {
                    ivb.e(true, ivb.a(playerResponseModel));
                }
                return;
            }
            case 10: {
                final Object a6 = this.a;
                final aani aani = (aani)o;
                if (aani.c().b(abkb.b)) {
                    final PlayerResponseModel b = aani.b();
                    aiqj aiqj;
                    if ((aiqj = aani.d()) == null) {
                        final abpq abpq = (abpq)((ivb)a6).a.a();
                        aiqj = abkf.g(abpq.s(), abpq.r(), abpq.i(), 0.0f);
                    }
                    final aotp a7 = ivb.a(b);
                    final ivb ivb2 = (ivb)a6;
                    if (ivb2.j(aiqj)) {
                        ivb2.c = null;
                        ivb2.b.m();
                        ivb2.e(true, a7);
                        return;
                    }
                    if (aani.c().b(abkb.d) && !ivb2.i()) {
                        ivb2.e(false, a7);
                    }
                }
                return;
            }
            case 9: {
                ((iuu)this.a).r((fkr)o);
                return;
            }
            case 8: {
                ((iuu)this.a).x((int)o);
                return;
            }
            case 7: {
                ((iuu)this.a).l((boolean)o);
                return;
            }
            case 6: {
                ((iuu)this.a).m((boolean)o);
                return;
            }
            case 5: {
                ((iuu)this.a).pb((boolean)o);
                return;
            }
            case 4: {
                ((iuu)this.a).u((boolean)o);
                return;
            }
            case 3: {
                ((iuu)this.a).n((trs)o);
                return;
            }
            case 2: {
                ((iuu)this.a).s((boolean)o);
                return;
            }
            case 1: {
                ((iuu)this.a).v((boolean)o);
                return;
            }
            case 0: {
                ((iuu)this.a).pc((boolean)o);
            }
        }
    }
}
