import android.app.Activity;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class evu implements aeho
{
    public final Executor a;
    public final atjj b;
    public final atjj c;
    public final atjj d;
    public final atjj e;
    public final uyf f;
    private final Shell_HomeActivity g;
    private final atjj h;
    
    public evu(final Executor a, final uyf f, final Shell_HomeActivity g, final aegi aegi, final atjj b, final atjj c, final atjj d, final atjj e, final atjj h) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        if (!gkt.bE(f)) {
            this.a = (Executor)afsl.a;
            b.a();
            c.a();
            d.a();
            e.a();
            h.a();
        }
        else {
            this.a = a;
        }
        final aeht b2 = aehu.b((Activity)g);
        b2.b((Class)rkr.class);
        aegi.d(b2.a());
        aegi.c((aeho)this);
    }
    
    public final void d(final aeby aeby) {
        ((rxr)this.h.a()).h(4, 2, 2);
    }
    
    public final void sR(final Throwable t) {
        ((rxr)this.h.a()).i(4, t);
        this.g.finish();
    }
}
