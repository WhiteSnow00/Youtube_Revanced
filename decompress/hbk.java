import android.util.Pair;
import com.google.research.xeno.effect.Control$FloatSetting;
import com.google.research.xeno.effect.Control;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.view.View;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbk implements urd, ubh
{
    public final cl a;
    public final Executor b;
    public ChooseFilterView c;
    public CreationButtonView d;
    public xab e;
    public View f;
    public EffectsFeatureDescriptionView g;
    public ShortsIntensitySliderView h;
    public utv i;
    public xab j;
    public FilterMapTable$FilterDescriptor k;
    public upw l;
    public String m;
    public float n;
    public aeea o;
    
    public hbk(final bu bu, final Executor b) {
        this.n = 1.0f;
        this.a = bu.getSupportFragmentManager();
        this.b = b;
    }
    
    public final String a(final int n) {
        final ChooseFilterView c = this.c;
        Object a = null;
        final wyw wyw = null;
        ure c2;
        if (c == null) {
            c2 = null;
        }
        else {
            c2 = c.c();
        }
        if (c2 != null) {
            if (n == 3) {
                c2.j();
                final aeea o = this.o;
                Object a2;
                if (o == null) {
                    a2 = wyw;
                }
                else {
                    a2 = o.a;
                }
                tpe.bV((wyw)a2, c2.c, this.j);
            }
            else if (n == 1) {
                c2.k();
                final aeea o2 = this.o;
                if (o2 != null) {
                    a = o2.a;
                }
                tpe.bV((wyw)a, c2.c, this.j);
            }
            return c2.f();
        }
        return "";
    }
    
    public final void b(final String c) {
        final aeea o = this.o;
        if (o != null) {
            final xab j = this.j;
            if (j != null) {
                final twx cg = o.cG(j);
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                final ahaz builder2 = ((ahbh)aliq.a).createBuilder();
                builder2.copyOnWrite();
                final aliq aliq = (aliq)builder2.instance;
                aliq.b |= 0x1;
                aliq.c = c;
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                final aliq h = (aliq)builder2.build();
                h.getClass();
                alhi.h = h;
                alhi.b |= 0x8;
                cg.b = builder.build();
                cg.d();
            }
        }
    }
    
    public final void c() {
        final ChooseFilterView c = this.c;
        if (c != null && c.f) {
            final FilterMapTable$FilterDescriptor k = this.k;
            if (k != null && k.e("preset_intensity")) {
                final Control b = this.k.b("preset_intensity");
                final ShortsIntensitySliderView h = this.h;
                if (h != null && b != null) {
                    final Control$FloatSetting b2 = b.b;
                    final Pair a = b2.a;
                    if (a != null) {
                        h.c.setMax(ShortsIntensitySliderView.b((float)a.second));
                        h.c.setProgress(ShortsIntensitySliderView.b(b2.a()));
                        h.a = b2;
                    }
                }
                final ShortsIntensitySliderView h2 = this.h;
                if (h2 != null) {
                    h2.setVisibility(0);
                }
                return;
            }
        }
        final ShortsIntensitySliderView h3 = this.h;
        if (h3 != null) {
            h3.setVisibility(4);
        }
    }
}
