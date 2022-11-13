import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.ContextThemeWrapper;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbt
{
    public static final afev a;
    private static final aqyf f;
    private static final ull k;
    public aqzt b;
    public arbf c;
    public final hbs d;
    public boolean e;
    private ViewGroup g;
    private View h;
    private final acgs i;
    private final bu j;
    private final aeea l;
    
    static {
        a = afev.n(aqyf.b, 2132083368, aqyf.c, 2132083287);
        f = aqyf.b;
        k = new ull();
    }
    
    public hbt(final bu j, final aeea l, final acgs i, final hbs d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.j = j;
        this.l = l;
        this.i = i;
        this.d = d;
    }
    
    public final void a(final arad arad) {
        if (arad == null || arad.b() <= 0 || !Collection$_EL.stream((Collection)arad.i()).anyMatch((Predicate)fqo.s)) {
            final arbf c = this.c;
            if (c != null) {
                final int b = c.b;
                if ((b & 0x1) != 0x0 && (b & 0x8) != 0x0) {
                    aitg aitg;
                    if ((aitg = c.c) == null) {
                        aitg = aitg.a;
                    }
                    final arbf c2 = this.c;
                    final int d = c2.d;
                    final int e = c2.e;
                    if (d > 0) {
                        if (e > 0) {
                            ahfu ahfu;
                            if ((ahfu = c2.f) == null) {
                                ahfu = ahfu.a;
                            }
                            aotp aotp;
                            if ((aotp = aitg.c) == null) {
                                aotp = aotp.a;
                            }
                            final Uri j = aald.J(aotp);
                            final ahaz builder = ((ahbh)aqyd.a).createBuilder();
                            ajut ajut;
                            if ((ajut = aitg.d) == null) {
                                ajut = ajut.a;
                            }
                            final String string = acak.b(ajut).toString();
                            builder.copyOnWrite();
                            final aqyd aqyd = (aqyd)builder.instance;
                            string.getClass();
                            aqyd.b |= 0x2;
                            aqyd.d = string;
                            ajut ajut2;
                            if ((ajut2 = aitg.e) == null) {
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
                            if ((aitg.b & 0x8) != 0x0) {
                                final ull k = hbt.k;
                                aplh aplh;
                                if ((aplh = aplh.b(aitg.f)) == null) {
                                    aplh = aplh.a;
                                }
                                final aqye aqye = (aqye)((aeze)k).d((Object)aplh);
                                builder.copyOnWrite();
                                final aqyd aqyd4 = (aqyd)builder.instance;
                                aqyd4.h = aqye.f;
                                aqyd4.b |= 0x20;
                            }
                            final ahaz builder2 = ((ahbh)aqyc.b).createBuilder();
                            final aqyf f = hbt.f;
                            builder2.copyOnWrite();
                            final aqyc aqyc = (aqyc)builder2.instance;
                            aqyc.d = f.d;
                            aqyc.c |= 0x1;
                            final afev a = hbt.a;
                            builder2.cz((Iterable)a.s());
                            builder.copyOnWrite();
                            final aqyd aqyd5 = (aqyd)builder.instance;
                            final aqyc g = (aqyc)builder2.build();
                            g.getClass();
                            aqyd5.g = g;
                            aqyd5.b |= 0x10;
                            final aqzs i = aqzt.j();
                            final ahaz builder3 = ((ahbh)aqzr.a).createBuilder();
                            builder3.copyOnWrite();
                            final aqzr aqzr = (aqzr)builder3.instance;
                            final aqyd d2 = (aqyd)builder.build();
                            d2.getClass();
                            aqzr.d = d2;
                            aqzr.c = 4;
                            ((ahaz)i).copyOnWrite();
                            aqzt.r((aqzt)i.instance, (aqzr)builder3.build());
                            final aqzt b2 = (aqzt)((ahaz)i).build();
                            this.b = b2;
                            final bu l = this.j;
                            if (b2 == null) {
                                this.b = aqzt.l();
                            }
                            final aqzr m = this.b.i();
                            aqyd a2;
                            if (m.c == 4) {
                                a2 = (aqyd)m.d;
                            }
                            else {
                                a2 = aqyd.a;
                            }
                            final aqzs aqzs = (aqzs)((ahbh)this.b).toBuilder();
                            final ahaz builder4 = ((ahbh)this.b.i()).toBuilder();
                            final ahaz builder5 = ((ahbh)a2).toBuilder();
                            aqyc aqyc2;
                            if ((aqyc2 = a2.g) == null) {
                                aqyc2 = aqyc.b;
                            }
                            final ahaz builder6 = ((ahbh)aqyc2).toBuilder();
                            builder6.copyOnWrite();
                            final aqyc aqyc3 = (aqyc)builder6.instance;
                            aqyc3.d = f.d;
                            aqyc3.c |= 0x1;
                            builder5.copyOnWrite();
                            final aqyd aqyd6 = (aqyd)builder5.instance;
                            final aqyc g2 = (aqyc)builder6.build();
                            g2.getClass();
                            aqyd6.g = g2;
                            aqyd6.b |= 0x10;
                            builder4.copyOnWrite();
                            final aqzr aqzr2 = (aqzr)builder4.instance;
                            final aqyd d3 = (aqyd)builder5.build();
                            d3.getClass();
                            aqzr2.d = d3;
                            aqzr2.c = 4;
                            ((ahaz)aqzs).copyOnWrite();
                            aqzt.r((aqzt)aqzs.instance, (aqzr)builder4.build());
                            this.b = (aqzt)((ahaz)aqzs).build();
                            final LayoutInflater from = LayoutInflater.from((Context)new ContextThemeWrapper((Context)l, (int)a.getOrDefault(f, 2132083368)));
                            if (this.g == null) {
                                this.g = (ViewGroup)from.inflate(2131625393, (ViewGroup)null, false);
                            }
                            final View inflate = from.inflate(2131625392, (ViewGroup)null, false);
                            this.h = inflate;
                            final TextView textView = (TextView)inflate.findViewById(2131431422);
                            final TextView textView2 = (TextView)this.h.findViewById(2131431461);
                            final ImageView imageView = (ImageView)this.h.findViewById(2131431423);
                            textView2.setText((CharSequence)a2.d);
                            if ((a2.b & 0x8) != 0x0 && !a2.f.isEmpty()) {
                                textView.setText((CharSequence)a2.e);
                                imageView.setImageDrawable(((Activity)l).getResources().getDrawable(2131232498));
                                final Uri cl = tpe.cL(a2.f);
                                if (cl != null) {
                                    this.i.k(cl, (tcc)new hbr(imageView, 0));
                                }
                            }
                            final View h = this.h;
                            if (h != null) {
                                final ViewGroup g3 = this.g;
                                if (g3 != null) {
                                    g3.addView(h);
                                    final ViewGroup viewGroup = (ViewGroup)h.getParent();
                                    final ViewGroup$LayoutParams layoutParams = h.getLayoutParams();
                                    final FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(d, e);
                                    viewGroup.removeView(h);
                                    h.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                                    final Bitmap x = vdh.X((Context)this.j, h);
                                    this.l.cp(x, (umo)new hbq(this, x, h, layoutParams, viewGroup, ahfu));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
