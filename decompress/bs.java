import android.graphics.Rect;
import android.content.Intent;
import android.content.res.Configuration;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.util.Pair;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Collection;
import java.util.AbstractCollection;
import java.util.EnumSet;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.SubscriptionNotificationButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bs implements akp
{
    public final Object a;
    private final int b;
    
    public bs(final afgj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final ahcr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final askq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final bu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final cl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final SubscriptionNotificationButton a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final fwt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final EnumSet a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public bs(final ra a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void accept(Object o) {
        switch (this.b) {
            default: {
                ((AbstractCollection)this.a).addAll((Collection)o);
                return;
            }
            case 11: {
                final Object a = this.a;
                final WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo)o;
                if (!((askq)a).tz()) {
                    ((askd)a).c(windowLayoutInfo);
                }
                return;
            }
            case 10: {
                final Object a2 = this.a;
                final Pair pair = (Pair)o;
                final int a3 = oss.a;
                o = ((dts)pair.second).h();
                if (o instanceof osr) {
                    ((afgj)a2).g(afbj.e(((osr)o).c), o);
                }
                return;
            }
            case 9: {
                final Object a4 = this.a;
                final Pair pair2 = (Pair)o;
                final int d = oso.d;
                final int[] array = (int[])pair2.first;
                final dts dts = (dts)pair2.second;
                o = dts.h();
                if (o instanceof osr) {
                    Object e = ((osr)o).e;
                    synchronized (e) {
                        final aqod d2 = ((osr)o).d;
                        monitorexit(e);
                        e = a4;
                        ((ahcr)e).copyOnWrite();
                        e = ((ahcr)e).instance;
                        final aqoh a5 = aqoh.a;
                        d2.getClass();
                        final ahdp c = ((aqoh)e).c;
                        if (!c.c()) {
                            ((aqoh)e).c = ahcz.mutableCopy(c);
                        }
                        ((aqoh)e).c.add((Object)d2);
                    }
                }
                final String j = dts.j();
                Object o2;
                if (j == null) {
                    o2 = null;
                }
                else {
                    final ahcr builder = aqog.a.createBuilder();
                    builder.copyOnWrite();
                    final aqog aqog = (aqog)builder.instance;
                    aqog.b |= 0x1;
                    aqog.c = j;
                    final Rect a6 = dts.a();
                    final ahcr builder2 = aqoc.a.createBuilder();
                    final int n = array[0];
                    final int left = a6.left;
                    builder2.copyOnWrite();
                    final aqoc aqoc = (aqoc)builder2.instance;
                    aqoc.b |= 0x1;
                    aqoc.c = (float)(n + left);
                    final int n2 = array[1];
                    final int top = a6.top;
                    builder2.copyOnWrite();
                    final aqoc aqoc2 = (aqoc)builder2.instance;
                    aqoc2.b |= 0x2;
                    aqoc2.d = (float)(n2 + top);
                    final float e2 = (float)a6.width();
                    builder2.copyOnWrite();
                    final aqoc aqoc3 = (aqoc)builder2.instance;
                    aqoc3.b |= 0x4;
                    aqoc3.e = e2;
                    final float f = (float)a6.height();
                    builder2.copyOnWrite();
                    final aqoc aqoc4 = (aqoc)builder2.instance;
                    aqoc4.b |= 0x8;
                    aqoc4.f = f;
                    final aqoc d3 = (aqoc)builder2.build();
                    builder.copyOnWrite();
                    final aqog aqog2 = (aqog)builder.instance;
                    d3.getClass();
                    aqog2.d = d3;
                    aqog2.b |= 0x2;
                    final ehe g = dts.g();
                    final aqof d4 = oso.d(g.R(1), g.R(2), g.R(3), g.R(4));
                    if (d4 != null) {
                        builder.copyOnWrite();
                        final aqog aqog3 = (aqog)builder.instance;
                        aqog3.e = d4;
                        aqog3.b |= 0x8;
                    }
                    final aqof d5 = oso.d(g.Q(1), g.Q(2), g.Q(3), g.Q(4));
                    if (d5 != null) {
                        builder.copyOnWrite();
                        final aqog aqog4 = (aqog)builder.instance;
                        aqog4.f = d5;
                        aqog4.b |= 0x10;
                    }
                    final aqof d6 = oso.d(g.S(1), g.S(2), g.S(3), g.S(4));
                    if (d6 != null) {
                        builder.copyOnWrite();
                        final aqog aqog5 = (aqog)builder.instance;
                        aqog5.g = d6;
                        aqog5.b |= 0x20;
                    }
                    o2 = builder.build();
                }
                if (o2 != null) {
                    final ahcr ahcr = (ahcr)a4;
                    ahcr.copyOnWrite();
                    final aqoh aqoh = (aqoh)ahcr.instance;
                    final aqoh a7 = aqoh.a;
                    final ahdp e3 = aqoh.e;
                    if (!e3.c()) {
                        aqoh.e = ahcz.mutableCopy(e3);
                    }
                    aqoh.e.add(o2);
                }
                return;
            }
            case 8: {
                final Object a8 = this.a;
                final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem = (SubscriptionNotificationMenuItem)o;
                final SubscriptionNotificationButton subscriptionNotificationButton = (SubscriptionNotificationButton)a8;
                subscriptionNotificationButton.b.i(subscriptionNotificationMenuItem);
                subscriptionNotificationButton.d.b(subscriptionNotificationMenuItem.c().I());
                return;
            }
            case 7: {
                final Object a9 = this.a;
                final aoph aoph = (aoph)o;
                final fwt fwt = (fwt)a9;
                Optional.ofNullable((Object)fwt.f).ifPresent((Consumer)new fvo(aoph, 15));
                if (fwt.a.o()) {
                    fwt.f(aoph.c);
                }
                return;
            }
            case 6: {
                final Object a10 = this.a;
                final Boolean b = (Boolean)o;
                if (aej.w()) {
                    ((ra)a10).e();
                }
                return;
            }
            case 5: {
                final Object a11 = this.a;
                final agjn agjn = (agjn)o;
                final cl cl = (cl)a11;
                if (cl.X()) {
                    cl.y(agjn.a, false);
                }
                return;
            }
            case 4: {
                final Object a12 = this.a;
                final agjn agjn2 = (agjn)o;
                final cl cl2 = (cl)a12;
                if (cl2.X()) {
                    cl2.t(agjn2.a, false);
                }
                return;
            }
            case 3: {
                final Object a13 = this.a;
                final Integer n3 = (Integer)o;
                final cl cl3 = (cl)a13;
                if (cl3.X() && n3 == 80) {
                    cl3.s(false);
                }
                return;
            }
            case 2: {
                final Object a14 = this.a;
                final Configuration configuration = (Configuration)o;
                final cl cl4 = (cl)a14;
                if (cl4.X()) {
                    cl4.p(configuration, false);
                }
                return;
            }
            case 1: {
                ((bu)this.a).lambda$init$1$android-support-v4-app-FragmentActivity((Configuration)o);
                return;
            }
            case 0: {
                ((bu)this.a).lambda$init$2$android-support-v4-app-FragmentActivity((Intent)o);
            }
        }
    }
}
