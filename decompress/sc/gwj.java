import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.ContextThemeWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwj implements Runnable
{
    public final gww a;
    public final aezp b;
    
    public gwj(final gww a, final aezp b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final gww a = this.a;
        final aezp b = this.b;
        if (b.h()) {
            final han x = a.x;
            final bu h = a.h;
            final ViewGroup ao = a.aO;
            final aitg e = (aitg)b.c();
            final View ap = a.aP;
            if (h != null && ao != null) {
                if (ap != null) {
                    ((hbm)x).g = ap;
                }
                final hbm hbm = (hbm)x;
                hbm.b = ao;
                hbm.e = e;
                aotp aotp;
                if ((aotp = e.c) == null) {
                    aotp = aotp.a;
                }
                final Uri j = aald.J(aotp);
                final ahaz builder = ((ahbh)aqyd.a).createBuilder();
                ajut ajut;
                if ((ajut = e.d) == null) {
                    ajut = ajut.a;
                }
                final String string = acak.b(ajut).toString();
                builder.copyOnWrite();
                final aqyd aqyd = (aqyd)builder.instance;
                string.getClass();
                aqyd.b |= 0x2;
                aqyd.d = string;
                ajut ajut2;
                if ((ajut2 = e.e) == null) {
                    ajut2 = ajut.a;
                }
                final String string2 = acak.b(ajut2).toString();
                builder.copyOnWrite();
                final aqyd aqyd2 = (aqyd)builder.instance;
                string2.getClass();
                aqyd2.b |= 0x4;
                aqyd2.e = string2;
                String string3;
                if (j != null) {
                    string3 = j.toString();
                }
                else {
                    string3 = "";
                }
                builder.copyOnWrite();
                final aqyd aqyd3 = (aqyd)builder.instance;
                string3.getClass();
                aqyd3.b |= 0x8;
                aqyd3.f = string3;
                final ahaz builder2 = ((ahbh)aqyc.b).createBuilder();
                final aqyf a2 = hbm.a;
                builder2.copyOnWrite();
                final aqyc aqyc = (aqyc)builder2.instance;
                aqyc.d = a2.d;
                aqyc.c |= 0x1;
                builder.copyOnWrite();
                final aqyd aqyd4 = (aqyd)builder.instance;
                final aqyc g = (aqyc)builder2.build();
                g.getClass();
                aqyd4.g = g;
                aqyd4.b |= 0x10;
                final aqzs i = aqzt.j();
                final ahaz builder3 = aqzr.a.createBuilder();
                builder3.copyOnWrite();
                final aqzr aqzr = (aqzr)builder3.instance;
                final aqyd d = (aqyd)builder.build();
                d.getClass();
                aqzr.d = d;
                aqzr.c = 4;
                i.copyOnWrite();
                aqzt.r((aqzt)i.instance, (aqzr)builder3.build());
                hbm.c = (aqzt)i.build();
                if (hbm.c == null) {
                    hbm.c = aqzt.l();
                }
                final aqzr k = hbm.c.i();
                aqyd a3;
                if (k.c == 4) {
                    a3 = (aqyd)k.d;
                }
                else {
                    a3 = aqyd.a;
                }
                final LayoutInflater from = LayoutInflater.from((Context)new ContextThemeWrapper((Context)h, 2132083368));
                if (hbm.b == null) {
                    hbm.b = (ViewGroup)from.inflate(2131625393, (ViewGroup)null, false);
                }
                hbm.d = from.inflate(2131625392, (ViewGroup)null, false);
                final TextView textView = (TextView)hbm.d.findViewById(2131431422);
                final TextView textView2 = (TextView)hbm.d.findViewById(2131431461);
                final ImageView imageView = (ImageView)hbm.d.findViewById(2131431423);
                textView.setText((CharSequence)a3.e);
                textView2.setText((CharSequence)a3.d);
                imageView.setImageDrawable(((Activity)h).getResources().getDrawable(2131232498));
                if ((a3.b & 0x8) != 0x0 && !a3.f.isEmpty()) {
                    final Uri cl = tpe.cL(a3.f);
                    if (cl != null) {
                        hbm.j.k(cl, (tcc)new hbr(imageView, 1));
                    }
                }
                ((View)imageView).setAccessibilityTraversalAfter(2131431428);
                ((View)textView).setAccessibilityTraversalAfter(2131431423);
                ((View)textView2).setAccessibilityTraversalAfter(2131431422);
                final View d2 = hbm.d;
                if (d2 != null) {
                    d2.setOnTouchListener((View$OnTouchListener)x);
                    ((ViewGroup)hbm.b.findViewById(2131431463)).addView(d2);
                    hbm.b.setVisibility(0);
                }
            }
            final han x2 = a.x;
            final ucd b2 = a.k.b();
            if (b2 != null) {
                final hbm hbm2 = (hbm)x2;
                if (hbm2.e != null) {
                    final ViewGroup b3 = hbm2.b;
                    if (b3 != null) {
                        final View d3 = hbm2.d;
                        if (d3 != null) {
                            b3.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new hbl(hbm2, d3, b2, 0));
                        }
                    }
                }
            }
            return;
        }
        final hbm hbm3 = (hbm)a.x;
        final ViewGroup b4 = hbm3.b;
        if (b4 != null) {
            b4.setVisibility(4);
        }
        hbm3.e = null;
    }
}
