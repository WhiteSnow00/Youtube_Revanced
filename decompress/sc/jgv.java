import java.util.List;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.res.Resources;
import android.content.Context;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgv implements acko, jha
{
    public final vcy a;
    public final ghb b;
    public final NavigationDropdownView c;
    public acrh d;
    private final Context e;
    private final Resources f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private boolean k;
    
    public jgv(final Context e, final vcy a, final ghb b) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = e.getResources();
        final View inflate = LayoutInflater.from(e).inflate(2131624417, (ViewGroup)null);
        this.g = inflate;
        final NavigationDropdownView c = (NavigationDropdownView)inflate.findViewById(2131431313);
        this.c = c;
        c.g = (jha)this;
        this.h = c.findViewById(2131428759);
        this.i = c.findViewById(2131428761);
        this.j = c.findViewById(2131427841);
        this.k = false;
    }
    
    @Override
    public final View a() {
        return this.g;
    }
    
    @Override
    public final void c(final acku acku) {
        this.c.b(false);
    }
    
    @Override
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final ajqn ajqn = (ajqn)o;
        final int bd = tpe.bd(this.e);
        int dimensionPixelSize = this.f.getDimensionPixelSize(2131169824);
        final int dimensionPixelSize2 = this.f.getDimensionPixelSize(2131168618);
        final boolean b = false;
        final boolean k = bd > dimensionPixelSize2 + dimensionPixelSize + dimensionPixelSize;
        if (this.k != k) {
            this.k = k;
            final int paddingTop = this.i.getPaddingTop();
            final int paddingBottom = this.i.getPaddingBottom();
            int dimensionPixelSize3;
            if (this.k) {
                dimensionPixelSize = 0;
                dimensionPixelSize3 = 0;
            }
            else {
                dimensionPixelSize3 = this.f.getDimensionPixelSize(2131168263);
            }
            anb.ab(this.h, dimensionPixelSize, 0, dimensionPixelSize3, 0);
            this.i.setPadding(dimensionPixelSize, paddingTop, dimensionPixelSize, paddingBottom);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.j.getLayoutParams();
            all.g((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams, dimensionPixelSize);
            all.f((ViewGroup$MarginLayoutParams)frameLayout$LayoutParams, dimensionPixelSize);
            this.j.invalidate();
        }
        this.d = (acrh)ackm.c("sectionListController");
        ajkd ajkd = null;
        Label_0254: {
            if (ajqn != null) {
                anuv anuv;
                if ((anuv = ajqn.b) == null) {
                    anuv = anuv.a;
                }
                if (anuv.ry((ahaq)DropdownRendererOuterClass.dropdownRenderer)) {
                    anuv anuv2;
                    if ((anuv2 = ajqn.b) == null) {
                        anuv2 = anuv.a;
                    }
                    ajkd = (ajkd)anuv2.rx((ahaq)DropdownRendererOuterClass.dropdownRenderer);
                    break Label_0254;
                }
            }
            ajkd = null;
        }
        final NavigationDropdownView c = this.c;
        if (ajkd != null && ajkd.c.size() != 0) {
            tpe.v((View)c, true);
            c.b(false);
            final TextView e = c.e;
            String d;
            if ((ajkd.b & 0x1) != 0x0) {
                d = ajkd.d;
            }
            else {
                d = null;
            }
            e.setText((CharSequence)d);
            final ahbx c2 = ajkd.c;
            c.k.a.clear();
            for (int i = 0; i < ((List)c2).size(); ++i) {
                ajkf h;
                if ((h = ((ajka)((List)c2).get(i)).e) == null) {
                    h = ajkf.a;
                }
                if (h.f) {
                    c.h = h;
                    final TextView d2 = c.d;
                    ajut ajut;
                    if ((h.b & 0x1) != 0x0) {
                        if ((ajut = h.e) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    d2.setText((CharSequence)acak.b(ajut));
                }
                c.k.a.add(h);
            }
            ((nq)c.k).rZ();
            boolean m = b;
            if (c.k.a() > 1) {
                m = true;
            }
            c.m = m;
            c.e();
        }
        else {
            tpe.v((View)c, false);
        }
        final NavigationDropdownView c3 = this.c;
        if (!c3.l) {
            c3.c(true);
        }
    }
}
