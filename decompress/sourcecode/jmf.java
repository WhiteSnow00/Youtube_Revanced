import java.util.ArrayList;
import android.view.WindowInsets;
import android.view.View;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import android.view.View$OnApplyWindowInsetsListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jmf implements View$OnApplyWindowInsetsListener
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public jmf(final VoiceSearchActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jmf(final hwd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
        final int b = this.b;
        if (b == 0) {
            ((VoiceSearchActivity)this.a).o = windowInsets.getSystemWindowInsetTop();
            return windowInsets;
        }
        if (b == 1) {
            ((hwd)this.a).ag = windowInsets.getSystemWindowInsetTop();
            return windowInsets;
        }
        if (b != 2) {
            final Object a = this.a;
            final int a2 = zdd.a;
            if (windowInsets.getSystemWindowInsetBottom() <= windowInsets.getStableInsetBottom()) {
                final zcj zcj = (zcj)a;
                if (zcj.isFocused()) {
                    zcj.clearFocus();
                }
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        final ssh ssh = (ssh)this.a;
        if (ssh.aj != null) {
            Object ai = ssh.ai;
            final ArrayList list = new ArrayList();
            final String ak = ssh.ak;
            if (ak != null) {
                ssh.ai.findViewsWithText(list, (CharSequence)ak, 2);
            }
            if (!list.isEmpty()) {
                ai = list.get(0);
            }
            ssh.ag.f();
            final actt ah = ssh.ah;
            final ajzl aj = ssh.aj;
            ah.b(aj, (View)ai, (Object)aj, ssh.af);
        }
        return view.onApplyWindowInsets(windowInsets);
    }
}
