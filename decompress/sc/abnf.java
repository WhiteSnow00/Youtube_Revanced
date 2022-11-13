import android.app.Activity;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;
import android.app.Dialog;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnf implements abng
{
    public final WeakReference a;
    public final Executor b;
    public final zmf c;
    public Dialog d;
    public AgeVerificationDialog$CustomWebView e;
    public tce f;
    public abnk g;
    public final man h;
    
    public abnf(final Activity activity, final Executor b, final zmf c, final man h, final byte[] array, final byte[] array2, final byte[] array3) {
        activity.getClass();
        this.a = new WeakReference((T)activity);
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        h.getClass();
        this.h = h;
    }
    
    public final void a() {
        final tce f = this.f;
        if (f != null) {
            f.d();
        }
        this.d.dismiss();
        this.e.loadUrl("about:blank");
    }
    
    public final void b() {
        this.a();
        this.g.b();
    }
    
    public final void c() {
        this.a();
        final abnk g = this.g;
        abnm.a(g.b, g.c.i(g.a));
    }
}
