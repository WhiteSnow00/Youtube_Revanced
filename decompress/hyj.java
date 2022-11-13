import j$.util.function.Consumer$_CC;
import android.net.Uri;
import android.support.v4.app.Fragment$SavedState;
import j$.util.Optional;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyj implements Consumer
{
    public final int a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public hyj(final int a, final String b, final afel c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public hyj(final hww b, final PaneDescriptor c, final int a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hyj(final hyk b, final int a, final PanelDescriptor c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public hyj(final jcn c, final int a, final abig b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hyj(final ssj b, final srf c, final int a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public hyj(final ssj b, final sru c, final int a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        final int d = this.d;
        if (d == 0) {
            final Object b = this.b;
            final int a = this.a;
            final Object c = this.c;
            final br br = (br)o;
            final hyk hyk = (hyk)b;
            final ct i = hyk.b.i();
            i.w(a, br, ((PanelDescriptor)c).d());
            if (hyk.d()) {
                i.i = 4099;
            }
            i.d();
            return;
        }
        if (d == 1) {
            final Object b2 = this.b;
            final Object c2 = this.c;
            final int a2 = this.a;
            final ggq ggq = (ggq)o;
            if (ggq.m == null) {
                ggq.ag(new Bundle());
            }
            final hww hww = (hww)b2;
            if (hww.ag) {
                ggq.m.putBoolean("needs_nested_header", true);
            }
            if (c2 == hww.af) {
                final Fragment$SavedState ae = hww.ae;
                if (ae != null) {
                    ggq.ai(ae);
                }
            }
            final ct j = hww.og().i();
            j.w(a2, (br)ggq, "detail_fragment_tag");
            j.i = 0;
            j.a();
            return;
        }
        if (d == 2) {
            final int a3 = this.a;
            final Object b3 = this.b;
            final Object c3 = this.c;
            final aaba aaba = (aaba)o;
            final int k = fex.j(amas.b.a(), 3, a3);
            final ahaz builder = ((ahbh)amul.a).createBuilder();
            builder.copyOnWrite();
            final amul amul = (amul)builder.instance;
            amul.c = 2;
            amul.b |= 0x1;
            final String h = vgl.h(amas.b.a(), aaba.f());
            builder.copyOnWrite();
            final amul amul2 = (amul)builder.instance;
            h.getClass();
            amul2.b |= 0x2;
            amul2.d = h;
            final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
            final ahbf b4 = amao.b;
            final ahaz builder2 = ((ahbh)amao.a).createBuilder();
            builder2.copyOnWrite();
            final amao amao = (amao)builder2.instance;
            amao.c |= 0x8;
            amao.f = (String)b3;
            ahbb.e((ahaq)b4, (Object)builder2.build());
            ((ahaz)ahbb).copyOnWrite();
            final amuj amuj = (amuj)ahbb.instance;
            amuj.c |= 0x1;
            amuj.d = k;
            builder.copyOnWrite();
            final amul amul3 = (amul)builder.instance;
            final amuj e = (amuj)((ahaz)ahbb).build();
            e.getClass();
            amul3.e = e;
            amul3.b |= 0x4;
            ((afel)c3).h((Object)builder.build());
            return;
        }
        if (d == 3) {
            final Object c4 = this.c;
            final int a4 = this.a;
            final Object b5 = this.b;
            final TextView textView = (TextView)o;
            textView.setMaxWidth(a4);
            tpe.aF((View)textView, tpe.aD(-2), (Class)ViewGroup$LayoutParams.class);
            textView.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jcl((jcn)c4, (abig)b5, 0));
            return;
        }
        if (d != 4) {
            final Object b6 = this.b;
            final Object c5 = this.c;
            final int a5 = this.a;
            final sru sru = (sru)o;
            final Uri a6 = sru.a;
            final srf srf = (srf)c5;
            if (a6.equals((Object)srf.b().a)) {
                final vkz d2 = srf.b().d();
                akdw d3;
                if ((d3 = sru.d) == null) {
                    d3 = ssj.r(Optional.ofNullable((Object)srf.b().c));
                }
                d2.d = d3;
                ((ssj)b6).n(d2.c(), a5);
            }
            return;
        }
        final Object b7 = this.b;
        final Object c6 = this.c;
        final int a7 = this.a;
        final vkz d4 = ((sru)o).d();
        d4.d = ((sru)c6).d;
        ((ssj)b7).n(d4.c(), a7);
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        final int d = this.d;
        if (d == 0) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (d == 1) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (d == 2) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (d == 3) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (d != 4) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}
