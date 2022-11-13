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

public final class adfj extends View implements ntd
{
    public final Paint a;
    public boolean b;
    public boolean c;
    public nrt d;
    public Optional e;
    public Optional f;
    public afeq g;
    public Optional h;
    public volatile double i;
    public boolean j;
    public volatile boolean k;
    private final nvu l;
    private final Paint m;
    private final Paint n;
    private final float o;
    private final float p;
    private final float[] q;
    private final ntc r;
    private final ntc s;
    
    public adfj(final Context context) {
        super(context);
        this.s = new adfg(this);
        this.r = new adfh(this);
        this.l = (nvu)new adfi(this);
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
        this.g = afeq.q();
        this.h = Optional.empty();
        this.j = false;
        this.k = false;
        a.setStyle(Paint$Style.STROKE);
        a.setColor(-16777216);
        a.setAntiAlias(true);
        a.setDither(true);
        final float c = ntm.c(context, 4.0f);
        this.q = new float[] { c, c };
        this.o = ntm.c(context, 4.0f);
        this.p = ntm.c(context, 6.0f);
        m.setStyle(Paint$Style.FILL);
        m.setAntiAlias(true);
        m.setDither(true);
        n.setColor(tpe.cr(context, 2130970841));
        n.setStyle(Paint$Style.FILL);
        n.setAntiAlias(true);
        n.setDither(true);
    }
    
    private final Optional g() {
        for (final nsd nsd : this.d.k()) {
            if (!nsd.a.c) {
                return Optional.of((Object)nsd);
            }
        }
        return Optional.empty();
    }
    
    private static boolean h(final int n, final int n2, final int n3) {
        return n >= n2 && n <= n3;
    }
    
    private static double i(final nsd nsd, final int n) {
        final nxb a = nsd.a;
        final nvm c = nsd.c;
        final nwx c2 = a.c(nwy.a);
        final nwy b = nwy.b;
        double doubleValue = 0.0;
        final nwx e = a.e(b, (Object)0.0);
        final Double n2 = (Double)c2.a((Object)a.a.get(n), n, a);
        final Double n3 = (Double)e.a((Object)a.a.get(n), n, a);
        if (n3 != null) {
            doubleValue = n3;
        }
        return ((nvp)c).b((Object)n2, (Object)doubleValue);
    }
    
    public final nvs a() {
        final nvv u = this.d.u;
        if (u instanceof nvs) {
            return (nvs)u;
        }
        return null;
    }
    
    public final void b(final nrt d) {
        nxt.a(this.d == null, "DomainValueHighlighter can only be attached to one chart at a time.");
        (this.d = d).l((View)this);
        d.A(this.s);
        if (this.j && !tsy.f(this.getContext())) {
            if (!this.g.isEmpty()) {
                this.h = adds.q(d, this.g);
            }
            d.t(this.l);
            d.z(this.r);
            d.v((nvv)new nvs());
        }
        if (this.c) {
            ((nsz)d).H(new atwt((int)this.o, (byte[])null));
            ((nsz)d).G(new atwt((int)this.o, (byte[])null));
        }
    }
    
    public final void c(final nrt nrt) {
        nxt.a(this.d == nrt, "DomainValueHighlighter can only be removed from the chart it was attached to.");
        this.d = null;
        nrt.B(this.s);
        nrt.n(this.l);
        nrt.y(this.r);
        nrt.removeView((View)this);
    }
    
    public final Optional d(final double n) {
        final Optional g = this.g();
        if (g.isPresent()) {
            final nvm d = ((nsd)g.get()).d;
            final Double value = n;
            if (((nvp)d).n((Object)value)) {
                return Optional.of((Object)Math.round(nvo.a.a((nvp)((nsd)g.get()).d, (Object)value)));
            }
        }
        return Optional.empty();
    }
    
    public final void e(final double c) {
        if (this.e.isPresent() && this.f.isPresent() && this.d instanceof nwj) {
            final ahbb ahbb = (ahbb)((ahbh)SenderStateOuterClass$SenderState.a).createBuilder();
            final ahbf b = aqmq.b;
            final ahaz builder = aqmq.a.createBuilder();
            final ahaz builder2 = ((ahbh)aqne.a).createBuilder();
            builder2.copyOnWrite();
            final aqne aqne = (aqne)builder2.instance;
            aqne.b |= 0x1;
            aqne.c = c;
            builder.copyOnWrite();
            final aqmq aqmq = (aqmq)builder.instance;
            final aqne d = (aqne)builder2.build();
            d.getClass();
            aqmq.d = d;
            aqmq.c = 1;
            ahbb.e((ahaq)b, (Object)builder.build());
            final SenderStateOuterClass$SenderState d2 = (SenderStateOuterClass$SenderState)((ahaz)ahbb).build();
            final vgs a = ota.a();
            a.d = d2;
            ((otc)this.e.get()).a((CommandOuterClass$Command)this.f.get(), a.f()).U();
        }
    }
    
    public final void f() {
        this.a.setStrokeWidth(ntm.c(this.getContext(), 1.0f));
        this.requestLayout();
        this.invalidate();
    }
    
    public final void onDraw(final Canvas canvas) {
        final Optional d = this.d(this.i);
        if (d.isPresent()) {
            final int intValue = (int)d.get();
            if (intValue >= this.getPaddingLeft() && intValue <= this.getWidth() - this.getPaddingRight()) {
                final int min = Math.min((int)d.get(), (int)Math.floor(this.getWidth() - this.getPaddingRight() - this.a.getStrokeWidth()) + 1);
                final int height = this.getHeight();
                final int paddingBottom = this.getPaddingBottom();
                final float n = (float)this.getPaddingTop();
                final boolean b = this.b;
                final float n2 = (float)(height - paddingBottom);
                if (b) {
                    final float n3 = (float)min;
                    ntc.e(canvas, n3, n2, n3, n, this.a, this.q);
                }
                else {
                    final float n4 = (float)min;
                    canvas.drawLine(n4, n2, n4, n, this.a);
                }
                if (this.c) {
                    final double i = this.i;
                    final Optional g = this.g();
                    Optional optional;
                    if (g.isPresent() && !((nsd)g.get()).a.a.isEmpty()) {
                        final List a = ((nsd)g.get()).a.a;
                        final nvm d2 = ((nsd)g.get()).d;
                        final int round = Math.round(nvo.a.a((nvp)d2, (Object)i));
                        final int round2 = Math.round(nvo.a.a((nvp)d2, (Object)a.get(0).a()));
                        if (h(round, round2 - 5, round2)) {
                            optional = Optional.of((Object)i((nsd)g.get(), 0));
                        }
                        else {
                            final int round3 = Math.round(nvo.a.a((nvp)d2, (Object)((nxe)agpc.V(a)).a()));
                            if (h(round, round3, round3 + 5)) {
                                optional = Optional.of((Object)i((nsd)g.get(), a.size() - 1));
                            }
                            else {
                                int n5 = 0;
                                while (true) {
                                    final int n6 = n5 + 1;
                                    if (n6 >= a.size()) {
                                        optional = Optional.empty();
                                        break;
                                    }
                                    final nxe nxe = a.get(n5);
                                    final nxe nxe2 = a.get(n6);
                                    if (nxe.a() < i && i <= nxe2.a()) {
                                        final double doubleValue = nxe.a();
                                        final double doubleValue2 = nxe2.a();
                                        final double doubleValue3 = nxe.a();
                                        final double j = i((nsd)g.get(), n5);
                                        final double n7 = (i - doubleValue) / (doubleValue2 - doubleValue3);
                                        optional = Optional.of((Object)(j * (1.0 - n7) + i((nsd)g.get(), n6) * n7));
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
                            if (((nsd)g2.get()).a.a.isEmpty()) {
                                intValue2 = intValue2;
                            }
                            else {
                                final nxb a2 = ((nsd)g2.get()).a;
                                intValue2 = (int)a2.d(nwm.d, nwy.e).a((Object)a2.a.get(0), 0, a2);
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
        if (layoutParams instanceof ntf) {
            final ntf ntf = (ntf)layoutParams;
            ntf.d();
            if (ntf.b == 0) {
                ntf.b = 25;
            }
        }
    }
}
