import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class abbv
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public aans H;
    public abke I;
    public Map J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public final Object Q;
    public FormatStreamModel[] R;
    public final abbt S;
    public final abbu T;
    public final wqf U;
    public final ibx V;
    private final abbf a;
    private asir b;
    public final abpq v;
    public final abbs w;
    public final xwk x;
    public final ScheduledExecutorService y;
    public final Executor z;
    
    public abbv(final abpq v, final abbf a, final abbs w, final xwk x, final ScheduledExecutorService y, final Executor z) {
        this.Q = new Object();
        this.S = new abbt(this);
        this.v = v;
        w.getClass();
        this.w = w;
        x.getClass();
        this.x = x;
        y.getClass();
        this.y = y;
        z.getClass();
        this.z = z;
        this.a = a;
        this.T = new abbu(this);
        this.U = new wqf(this, 8);
        this.V = new ibx(this, 12);
    }
    
    private final boolean g() {
        return this.a != null;
    }
    
    public final void a() {
        this.w.oE();
    }
    
    public final void b() {
        if (this.g() && this.b == null) {
            this.a.d();
            this.b = this.a.a().P(asil.a()).an(new abav(this, 9), abba.d);
            this.d();
        }
    }
    
    public final void c() {
        if (this.g() && this.b != null) {
            this.a.c();
            athz.f((AtomicReference)this.b);
            this.b = null;
        }
    }
    
    public final void d() {
        if (this.g()) {
            this.a.b();
        }
    }
    
    public final void e() {
        final aans h = this.H;
        if (h == null) {
            return;
        }
        final boolean l = h.l();
        boolean b = true;
        final boolean b2 = l && h.b() != null && h.b().U();
        final PlayerResponseModel b3 = this.H.b();
        Label_0187: {
            if (b3 != null) {
                aneh aneh;
                if ((aneh = b3.z().e) == null) {
                    aneh = aneh.a;
                }
                andr andr;
                if ((andr = aneh.g) == null) {
                    andr = andr.a;
                }
                if ((andr.b & 0x8) != 0x0) {
                    aneh aneh2;
                    if ((aneh2 = b3.z().e) == null) {
                        aneh2 = aneh.a;
                    }
                    andr andr2;
                    if ((andr2 = aneh2.g) == null) {
                        andr2 = andr.a;
                    }
                    if ((andr2.b & 0x10) != 0x0) {
                        break Label_0187;
                    }
                }
            }
            b = false;
        }
        if (this.I != abke.d) {
            if (this.I.h()) {
                if (this.A && this.H.k() == null) {
                    this.w.oU(ControlsOverlayStyle.m);
                    return;
                }
                final abbs w = this.w;
                ControlsOverlayStyle controlsOverlayStyle;
                if (this.A) {
                    controlsOverlayStyle = ControlsOverlayStyle.j;
                }
                else {
                    controlsOverlayStyle = ControlsOverlayStyle.i;
                }
                w.oU(controlsOverlayStyle);
            }
            else if (this.I.c(abke.g)) {
                if (this.A) {
                    if (this.H.l()) {
                        final abbs w2 = this.w;
                        ControlsOverlayStyle controlsOverlayStyle2;
                        if (b2) {
                            controlsOverlayStyle2 = ControlsOverlayStyle.h;
                        }
                        else {
                            controlsOverlayStyle2 = ControlsOverlayStyle.g;
                        }
                        w2.oU(controlsOverlayStyle2);
                        return;
                    }
                    if (this.G) {
                        final abbs w3 = this.w;
                        ControlsOverlayStyle controlsOverlayStyle3;
                        if (this.F) {
                            controlsOverlayStyle3 = ControlsOverlayStyle.b;
                        }
                        else {
                            controlsOverlayStyle3 = ControlsOverlayStyle.c;
                        }
                        w3.oU(controlsOverlayStyle3);
                        return;
                    }
                    if (this.D) {
                        this.w.oU(ControlsOverlayStyle.e);
                        return;
                    }
                    this.w.oU(ControlsOverlayStyle.f);
                }
                else {
                    if (this.H.l() && !b) {
                        final abbs w4 = this.w;
                        ControlsOverlayStyle controlsOverlayStyle4;
                        if (b2) {
                            controlsOverlayStyle4 = ControlsOverlayStyle.l;
                        }
                        else {
                            controlsOverlayStyle4 = ControlsOverlayStyle.k;
                        }
                        w4.oU(controlsOverlayStyle4);
                        return;
                    }
                    if (this.G) {
                        final abbs w5 = this.w;
                        ControlsOverlayStyle controlsOverlayStyle5;
                        if (this.F) {
                            controlsOverlayStyle5 = ControlsOverlayStyle.b;
                        }
                        else {
                            controlsOverlayStyle5 = ControlsOverlayStyle.c;
                        }
                        w5.oU(controlsOverlayStyle5);
                        return;
                    }
                    if (this.D) {
                        this.w.oU(ControlsOverlayStyle.d);
                        return;
                    }
                    this.w.oU(ControlsOverlayStyle.a);
                }
            }
        }
    }
    
    public final void f() {
        this.w.pn(this.K, this.L, this.M, this.N, Math.min(Math.max(this.O, this.P), this.N));
    }
}
