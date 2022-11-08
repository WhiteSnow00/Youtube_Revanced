// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.engagementpanel;

import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.a;
import android.view.View;
import android.view.View$OnTouchListener;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import android.view.ViewGroup;

public class AppEngagementPanelControllerInitializer implements tff, tpf
{
    public final utk a;
    public tmt b;
    private final ViewGroup c;
    private final fjp d;
    private final ggs e;
    private final asib f;
    private final ljz g;
    private final ggo h;
    private final gau i;
    private final adec j;
    private final vup k;
    
    public AppEngagementPanelControllerInitializer(final ViewGroup c, final utk a, final fjp d, final ggs e, final ljz g, final kvc kvc, final gau i) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.g = g;
        this.j = kvc.i();
        this.k = kvc.l();
        this.i = i;
        this.f = new asib();
        this.h = (ggo)new ljm(a, 1);
    }
    
    public final void b(final int n, final tmt tmt) {
        if (n == 0) {
            tmy.v(this.c.findViewById(2131427617), false);
            this.g.i(false);
            this.i.d(false);
            return;
        }
        if (n != 1 && n != 2) {
            return;
        }
        this.g.i(true);
        this.i.d(true);
    }
    
    public final void mM(final aum aum) {
        this.b.i((tpf)this);
        this.e.A(this.h);
        this.f.b();
    }
    
    public final void mq(final aum aum) {
        final AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout)this.c.findViewById(2131427411);
        final View viewById = accessibilityLayerLayout.findViewById(2131427617);
        final RelativeLayout relativeLayout = (RelativeLayout)viewById.findViewById(2131427616);
        relativeLayout.getClass();
        final View viewById2 = viewById.findViewById(2131431261);
        viewById2.getClass();
        final a w = lkn.w(new tmt(viewById2));
        w.j(this.a);
        this.a.i(relativeLayout, (RelativeLayout)null);
        relativeLayout.setOnTouchListener((View$OnTouchListener)gmg.e);
        final EngagementPanelSizeBehavior b = this.a.g().b;
        b.w(this.a.g(), (View)relativeLayout);
        tmy.aF((View)relativeLayout, tmy.ar((aeh)b), (Class)aej.class);
        final asib f = this.f;
        final adec j = this.j;
        accessibilityLayerLayout.getClass();
        f.f(new asic[] { asgt.K((Object)17).l((aujo)((asgt)((vup)j.d).b).L((asjc)tug.e).p()).al((asix)new tnp(relativeLayout, 14)), tmy.n((View)accessibilityLayerLayout, (asho)j.b).z().aB((asix)new uqp(j, relativeLayout, 2, (byte[])null, (byte[])null, (byte[])null)), ((toa)j.c).c().al((asix)new uso(j, ((View)relativeLayout).getPaddingTop(), (View)relativeLayout, ((View)relativeLayout).getPaddingLeft(), ((View)relativeLayout).getPaddingRight(), ((View)relativeLayout).getPaddingBottom(), (byte[])null, (byte[])null, (byte[])null)) });
        this.f.c(asgt.K((Object)ajnd.b).l((aujo)((asgt)this.k.b).L((asjc)kus.e).p()).al((asix)new jpm(this, viewById2, 8)));
        this.f.c(this.a.g().o.al((asix)new kuc(relativeLayout, 9)));
        (this.b = this.a.D()).g((tpf)this);
        this.f.c(((asgt)this.a.E().a).al((asix)new abde(this, w, accessibilityLayerLayout, viewById, 1, (byte[])null, (byte[])null)));
        this.f.c(this.d.k().aB((asix)new kuc(this, 10)));
        this.e.n(this.h);
    }
}
