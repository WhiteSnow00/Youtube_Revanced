import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class feo implements tak
{
    private final atjj a;
    private final atjj b;
    private final atjj c;
    private final /* synthetic */ int d;
    private final Object e;
    private final Object f;
    
    public feo(final atjj a, final atjj b, final atjj c, final uyf uyf, final int d) {
        this.d = d;
        this.e = "FElibrary";
        this.a = a;
        this.b = b;
        this.c = c;
        alvl f;
        if ((f = uyf.b().e) == null) {
            f = alvl.a;
        }
        this.f = f;
    }
    
    public feo(final atjj a, final atjj b, final atjj c, final uyf uyf, final zki f, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        alvl e;
        if ((e = uyf.b().e) == null) {
            e = alvl.a;
        }
        this.e = e;
        this.f = f;
    }
    
    public final int a(Bundle a) {
        final int d = this.d;
        final int n = 0;
        int n2 = 0;
        if (d != 0) {
            try {
                final vlq vlq = (vlq)this.a.a();
                final vlo f = vlq.f();
                f.w((String)this.e);
                f.b = true;
                ((vii)f).i();
                if (((alvl)this.f).aT) {
                    ((vii)f).v = tjq.a;
                }
                final BrowseResponseModel browseResponseModel = (BrowseResponseModel)tcp.d((Future)vlq.h(f, (Executor)afsl.a), (aexg)fee.a);
                final fem fem = (fem)this.c.a();
                browseResponseModel.getClass();
                fem.d().e(browseResponseModel);
                final akfw a2 = browseResponseModel.a;
                if (a2 != null) {
                    final akfw y = fzo.y(a2);
                    if (y != null) {
                        fem.k(y);
                    }
                }
                final akfw x = fem.l.x(a2);
                if (x != null) {
                    fem.c().e(x);
                }
                ((zjw)this.b.a()).b();
            }
            catch (final Exception ex) {
                if (ex instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                trn.d("Failed to fetch offline library browse", (Throwable)ex);
                n2 = 1;
            }
            return n2;
        }
        try {
            final vtn a3 = ((vup)this.a.a()).a(((zki)this.f).c());
            a = (ExecutionException)a3.a((String)null);
            if (((alvl)this.e).aT) {
                ((vii)a).v = tjq.a;
            }
            a = (ExecutionException)a3.d((vtj)a).get();
            ((fem)this.b.a()).i((vtk)a);
            ((zjw)this.c.a()).b();
            return n;
        }
        catch (final ExecutionException a) {}
        catch (final InterruptedException ex2) {}
        trn.d("Failed to fetch settings", (Throwable)a);
        return 1;
    }
}
