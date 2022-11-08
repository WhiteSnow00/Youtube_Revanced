import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Map;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpn extends sya implements vau
{
    public final ktg a;
    public final ktf b;
    private final Handler f;
    private final abno g;
    private final ggi h;
    private final elw i;
    
    public gpn(final bu bu, final vax vax, final ktg a, final ktf b, final wwu wwu, final abno g, final elw i, final ggi h, final byte[] array, final byte[] array2) {
        super(bu, vax, wwu);
        this.a = a;
        this.b = b;
        this.g = g;
        this.i = i;
        this.h = h;
        this.f = new Handler(Looper.getMainLooper());
    }
    
    protected final void b(final aioe aioe, final Map map, final ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) {
        final int aa = aqql.aa(showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.k);
        if (aa != 0) {
            if (aa == 3) {
                final ggi h = this.h;
                final Bundle bundle = new Bundle();
                bundle.putByteArray("show_webview_dialog_command", ((agxl)aioe).toByteArray());
                h.d(PaneDescriptor.c((Class)gpq.class, aioe, bundle));
                return;
            }
        }
        final boolean j = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.j;
        if (j) {
            this.f.post((Runnable)new ghh(this, 18));
        }
        else {
            final Handler f = this.f;
            final abno g = this.g;
            g.getClass();
            f.post((Runnable)new ghh(g, 19));
        }
        int b;
        final int n = b = 0;
        if (j) {
            final Object a = this.i.a;
            if (a == null) {
                b = n;
            }
            else {
                final kyh h2 = ((DefaultWatchPanelViewController)a).h;
                if (h2 == null) {
                    b = n;
                }
                else {
                    b = h2.b();
                }
            }
        }
        final sye am = sye.aM(aioe, b);
        am.aN((syd)new gpm(this, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand, map, j));
        am.r(this.c.getSupportFragmentManager(), "web_view_dialog");
    }
}
