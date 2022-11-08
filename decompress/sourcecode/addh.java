import android.view.ViewGroup$LayoutParams;
import java.util.List;
import android.graphics.Canvas;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.Iterator;
import android.graphics.Paint$Style;
import android.content.Context;
import j$.util.Optional;
import android.graphics.Paint;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class addh extends View implements nrx
{
    public final Paint a;
    public boolean b;
    public boolean c;
    public nqn d;
    public Optional e;
    public Optional f;
    public afcr g;
    public Optional h;
    public volatile double i;
    public boolean j;
    public volatile boolean k;
    private final nuo l;
    private final Paint m;
    private final Paint n;
    private final float o;
    private final float p;
    private final float[] q;
    private final nrw r;
    private final nrw s;
    
    public addh(final Context context) {
        super(context);
        this.s = new adde(this);
        this.r = new addf(this);
        this.l = (nuo)new addg(this);
        final Paint a = new Paint();
        this.a = a;
        final Paint m = new Paint();
        this.m = m;
        final Paint n = new Paint();
        this.n = n;
        this.b = false;
        this.c = false;
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = afcr.q();
        this.h = Optional.empty();
        this.j = false;
        this.k = false;
        a.setStyle(Paint$Style.STROKE);
        a.setColor(-16777216);
        a.setAntiAlias(true);
        a.setDither(true);
        final float c = nsg.c(context, 4.0f);
        this.q = new float[] { c, c };
        this.o = nsg.c(context, 4.0f);
        this.p = nsg.c(context, 6.0f);
        m.setStyle(Paint$Style.FILL);
        m.setAntiAlias(true);
        m.setDither(true);
        n.setColor(tmy.cn(context, 2130970841));
        n.setStyle(Paint$Style.FILL);
        n.setAntiAlias(true);
        n.setDither(true);
    }
    
    private final Optional g() {
        for (final nqx nqx : this.d.k()) {
            if (!nqx.a.c) {
                return Optional.of((Object)nqx);
            }
        }
        return Optional.empty();
    }
    
    private static boolean h(final int n, final int n2, final int n3) {
        return n >= n2 && n <= n3;
    }
    
    private static double i(final nqx nqx, final int n) {
        final nvv a = nqx.a;
        final nug c = nqx.c;
        final nvr c2 = a.c(nvs.a);
        final nvs b = nvs.b;
        double doubleValue = 0.0;
        final nvr e = a.e(b, (Object)0.0);
        final Double n2 = (Double)c2.a((Object)a.a.get(n), n, a);
        final Double n3 = (Double)e.a((Object)a.a.get(n), n, a);
        if (n3 != null) {
            doubleValue = n3;
        }
        return ((nuj)c).b((Object)n2, (Object)doubleValue);
    }
    
    public final num a() {
        final nup u = this.d.u;
        if (u instanceof num) {
            return (num)u;
        }
        return null;
    }
    
    public final void b(final nqn d) {
        nwn.a(this.d == null, "DomainValueHighlighter can only be attached to one chart at a time.");
        (this.d = d).l((View)this);
        d.A(this.s);
        if (this.j && !tqt.f(this.getContext())) {
            if (!this.g.isEmpty()) {
                this.h = adio.S(d, this.g);
            }
            d.t(this.l);
            d.z(this.r);
            d.v((nup)new num());
        }
        if (this.c) {
            ((nrt)d).H(new atvw((int)this.o, (byte[])null));
            ((nrt)d).G(new atvw((int)this.o, (byte[])null));
        }
    }
    
    public final void c(final nqn nqn) {
        nwn.a(this.d == nqn, "DomainValueHighlighter can only be removed from the chart it was attached to.");
        this.d = null;
        nqn.B(this.s);
        nqn.n(this.l);
        nqn.y(this.r);
        nqn.removeView((View)this);
    }
    
    public final Optional d(final double n) {
        final Optional g = this.g();
        if (g.isPresent()) {
            final nug d = ((nqx)g.get()).d;
            final Double value = n;
            if (((nuj)d).n((Object)value)) {
                return Optional.of((Object)Math.round(nui.a.a((nuj)((nqx)g.get()).d, (Object)value)));
            }
        }
        return Optional.empty();
    }
    
    public final void e(final double c) {
        if (this.e.isPresent() && this.f.isPresent() && this.d instanceof nvd) {
            final agzc agzc = (agzc)((agzi)SenderStateOuterClass$SenderState.a).createBuilder();
            final agzg b = aqkd.b;
            final agza builder = ((agzi)aqkd.a).createBuilder();
            final agza builder2 = ((agzi)aqks.a).createBuilder();
            builder2.copyOnWrite();
            final aqks aqks = (aqks)builder2.instance;
            aqks.b |= 0x1;
            aqks.c = c;
            builder.copyOnWrite();
            final aqkd aqkd = (aqkd)builder.instance;
            final aqks d = (aqks)builder2.build();
            d.getClass();
            aqkd.d = d;
            aqkd.c = 1;
            agzc.e((agyr)b, builder.build());
            final SenderStateOuterClass$SenderState d2 = (SenderStateOuterClass$SenderState)agzc.build();
            final ves a = orr.a();
            a.d = d2;
            ((ort)this.e.get()).a((CommandOuterClass$Command)this.f.get(), a.f()).U();
        }
    }
    
    public final void f() {
        this.a.setStrokeWidth(nsg.c(this.getContext(), 1.0f));
        this.requestLayout();
        this.invalidate();
    }
    
    public final void onDraw(final Canvas canvas) {
        final Optional d = this.d(this.i);
        if (d.isPresent()) {
            final int intValue = (int)d.get();
            if (intValue >= this.getPaddingLeft() && intValue <= this.getWidth() - this.getPaddingRight()) {
                final int min = Math.min((int)d.get(), (int)Math.floor(this.getWidth() - this.getPaddingRight() - this.a.getStrokeWidth()) + 1);
                final float n = (float)(this.getHeight() - this.getPaddingBottom());
                final float n2 = (float)this.getPaddingTop();
                if (this.b) {
                    final float n3 = (float)min;
                    nrw.e(canvas, n3, n, n3, n2, this.a, this.q);
                }
                else {
                    final float n4 = (float)min;
                    canvas.drawLine(n4, n, n4, n2, this.a);
                }
                if (this.c) {
                    final double i = this.i;
                    final Optional g = this.g();
                    Optional optional;
                    if (g.isPresent() && !((nqx)g.get()).a.a.isEmpty()) {
                        final List a = ((nqx)g.get()).a.a;
                        final nug d2 = ((nqx)g.get()).d;
                        final int round = Math.round(nui.a.a((nuj)d2, (Object)i));
                        final int round2 = Math.round(nui.a.a((nuj)d2, (Object)a.get(0).a()));
                        if (h(round, round2 - 5, round2)) {
                            optional = Optional.of((Object)i((nqx)g.get(), 0));
                        }
                        else {
                            final int round3 = Math.round(nui.a.a((nuj)d2, (Object)((nvy)adwd.aK(a)).a()));
                            if (h(round, round3, round3 + 5)) {
                                optional = Optional.of((Object)i((nqx)g.get(), a.size() - 1));
                            }
                            else {
                                int n5 = 0;
                                while (true) {
                                    final int n6 = n5 + 1;
                                    if (n6 >= a.size()) {
                                        optional = Optional.empty();
                                        break;
                                    }
                                    final nvy nvy = a.get(n5);
                                    final nvy nvy2 = a.get(n6);
                                    if (nvy.a() < i && i <= nvy2.a()) {
                                        final double n7 = (i - nvy.a()) / (nvy2.a() - nvy.a());
                                        optional = Optional.of((Object)(i((nqx)g.get(), n5) * (1.0 - n7) + i((nqx)g.get(), n6) * n7));
                                        break;
                                    }
                                    n5 = n6;
                                }
                            }
                        }
                    }
                    else {
                        optional = Optional.empty();
                    }
                    if (optional.isPresent() && !Double.isNaN((double)optional.get())) {
                        final float n8 = (float)min;
                        canvas.drawCircle(n8, (float)Math.round((double)optional.get()), this.p, this.n);
                        final Paint m = this.m;
                        final Optional g2 = this.g();
                        final boolean present = g2.isPresent();
                        int intValue2 = -16777216;
                        if (present) {
                            if (((nqx)g2.get()).a.a.isEmpty()) {
                                intValue2 = intValue2;
                            }
                            else {
                                final nvv a2 = ((nqx)g2.get()).a;
                                intValue2 = (int)a2.d(nvg.d, nvs.e).a((Object)a2.a.get(0), 0, a2);
                            }
                        }
                        m.setColor(intValue2);
                        canvas.drawCircle(n8, (float)Math.round((double)optional.get()), this.o, this.m);
                    }
                }
            }
        }
    }
    
    public final void setLayoutParams(final ViewGroup$LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof nrz) {
            final nrz nrz = (nrz)layoutParams;
            nrz.d();
            if (nrz.b == 0) {
                nrz.b = 25;
            }
        }
    }
}
