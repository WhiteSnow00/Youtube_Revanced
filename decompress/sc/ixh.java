import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.content.res.Resources;
import android.widget.ImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixh implements asjm
{
    public final ixj a;
    
    public ixh(final ixj a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final ixj a = this.a;
        final ixa ixa = (ixa)o;
        final ixf a2 = ixa.a;
        final boolean b = ixa.b;
        if (a2.a) {
            if (a.J.cD()) {
                final toz i = a.I;
                i.getClass();
                i.b(b);
            }
            final boolean b2 = a2.n.u && (a2.e || a2.f) && a2.c != abbx.a && !ControlsOverlayStyle.a(a2.n) && !a2.g && !a2.h && !a2.i && !a2.j && !a2.k && !a2.p;
            final boolean b3 = (a.J.f(45367792L) || a.J.cM()) && !a2.l && a2.o && a2.c != abbx.f;
            final boolean b4 = a.J.f(45367794L) && !a2.l && a2.c != abbx.f;
            final boolean b5 = (a.J.f(45367791L) || a.J.cL()) && !a2.l && a2.o && a2.c != abbx.f;
            final boolean b6 = a.J.f(45367793L) && !a2.l && a2.c != abbx.f;
            final boolean b7 = b2 && !b4 && !b3;
            final boolean b8 = b2 && !b6 && !b5;
            final toz z = a.z;
            z.getClass();
            z.l(b8, b);
            final toz a3 = a.A;
            a3.getClass();
            a3.l(b7, b);
            final toz z2 = a.z;
            z2.getClass();
            z2.a.setEnabled(a2.e);
            final toz a4 = a.A;
            a4.getClass();
            a4.a.setEnabled(a2.f);
            if (a.J.cD()) {
                final toz h = a.H;
                h.getClass();
                h.l(b8, b);
                final toz g = a.G;
                g.getClass();
                g.l(b7, b);
                final toz h2 = a.H;
                h2.getClass();
                h2.a.setEnabled(a2.e);
                final toz g2 = a.G;
                g2.getClass();
                g2.a.setEnabled(a2.f);
            }
            String string;
            if (a2.m) {
                final toz z3 = a.z;
                z3.getClass();
                string = z3.a.getResources().getString(2132017207);
            }
            else {
                string = null;
            }
            a.y = string;
            if (a2.b) {
                final iyy d = a.d;
                if (!d.h) {
                    final aans p = d.p;
                    if (p != null && p.c() != abke.j) {
                        d.l(d.c);
                        d.mm();
                    }
                }
            }
            final boolean b9 = a2.n.s && !a2.g && !a2.h && !a2.i && !a2.j && !a2.k;
            final boolean b10 = a.J.cM() && !a2.l && a2.o && a2.c != abbx.f;
            final boolean b11 = a.J.cL() && !a2.l && a2.o && a2.c != abbx.f;
            final boolean b12 = b9 && (a2.l || b10);
            final boolean b13 = b9 && (a2.l || b11);
            a.i = (b12 && b13);
            a.k = a2.d;
            a.j = a2.l;
            if (b12) {
                a.f.l((wzz)new wyt(xaa.c(148566)));
            }
            if (b13) {
                a.f.l((wzz)new wyt(xaa.c(148567)));
            }
            final toz b14 = a.B;
            b14.getClass();
            b14.l(b12, b);
            final toz c = a.C;
            c.getClass();
            c.l(b13, b);
            if (a.J.cD()) {
                final toz e = a.E;
                e.getClass();
                e.l(b12, b);
                final toz f = a.F;
                f.getClass();
                f.l(b13, b);
            }
            if (b12 || b13) {
                final int n = (int)a.b.a().getSeconds();
                int x;
                if (n != 5) {
                    if (n != 10) {
                        if (n != 15) {
                            if (n != 20) {
                                if (n != 30) {
                                    if (n != 60) {
                                        x = 7;
                                    }
                                    else {
                                        x = 6;
                                    }
                                }
                                else {
                                    x = 5;
                                }
                            }
                            else {
                                x = 4;
                            }
                        }
                        else {
                            x = 3;
                        }
                    }
                    else {
                        x = 2;
                    }
                }
                else {
                    x = 1;
                }
                final toz b15 = a.B;
                b15.getClass();
                final ImageView imageView = (ImageView)b15.a;
                final toz c2 = a.C;
                c2.getClass();
                final ImageView imageView2 = (ImageView)c2.a;
                final Resources resources = imageView.getContext().getResources();
                final Integer value = n;
                imageView.setContentDescription((CharSequence)resources.getQuantityString(2131886082, n, new Object[] { value }));
                imageView2.setContentDescription((CharSequence)imageView2.getContext().getResources().getQuantityString(2131886081, n, new Object[] { value }));
                if (a.x != x) {
                    if ((a.x = x) == 1) {
                        imageView.setImageResource(2131232443);
                        imageView2.setImageResource(2131232436);
                    }
                    else if (x == 2) {
                        imageView.setImageResource(2131232439);
                        imageView2.setImageResource(2131232432);
                    }
                    else if (x == 3) {
                        imageView.setImageResource(2131232440);
                        imageView2.setImageResource(2131232433);
                    }
                    else if (x == 4) {
                        imageView.setImageResource(2131232441);
                        imageView2.setImageResource(2131232434);
                    }
                    else if (x == 5) {
                        imageView.setImageResource(2131232442);
                        imageView2.setImageResource(2131232435);
                    }
                    else if (x == 6) {
                        imageView.setImageResource(2131232444);
                        imageView2.setImageResource(2131232437);
                    }
                    else {
                        imageView.setImageResource(2131232438);
                        imageView2.setImageResource(2131232431);
                    }
                }
            }
            if (a.J.cD()) {
                a.d();
            }
            else {
                a.c();
            }
            final YouTubeControlsOverlay g3 = a.g;
            g3.getClass();
            g3.A().requestLayout();
            return;
        }
        final toz b16 = a.B;
        b16.getClass();
        b16.a(b);
        final toz c3 = a.C;
        c3.getClass();
        c3.a(b);
        final toz a5 = a.A;
        a5.getClass();
        a5.a(b);
        final toz z4 = a.z;
        z4.getClass();
        z4.a(b);
        if (a.J.cD()) {
            final toz e2 = a.E;
            e2.getClass();
            e2.a(b);
            final toz f2 = a.F;
            f2.getClass();
            f2.a(b);
            final toz h3 = a.H;
            h3.getClass();
            h3.a(b);
            final toz g4 = a.G;
            g4.getClass();
            g4.a(b);
            final toz j = a.I;
            j.getClass();
            j.a(b);
        }
        final iyy d2 = a.d;
        if (!d2.h) {
            if (d2.k == d2.c) {
                d2.mk();
            }
        }
    }
}
