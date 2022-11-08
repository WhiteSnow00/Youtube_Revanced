import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.function.Function;
import android.os.Handler;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gax extends gae implements gbn
{
    private final Optional d;
    private final Optional e;
    private gbs f;
    private final uyi g;
    private final zhb h;
    
    public gax(final Optional d, final Optional e, final gau gau, final Handler handler, final zhb h, final uyi g, final byte[] array) {
        super(gau, handler, (atjj)eps.j, (gad)gay.b);
        this.d = d;
        this.e = e;
        this.h = h;
        this.g = g;
    }
    
    private final boolean o() {
        return (boolean)this.e.map((Function)fwc.f).orElse((Object)false);
    }
    
    public final void k(final actk actk) {
        if (!this.o()) {
            super.b.add(actk);
            final actm c = super.c;
            if (c != null) {
                actk.mv((Object)c);
            }
        }
    }
    
    public final void l(final actz actz) {
        if (!this.o()) {
            super.e((actm)actz);
        }
    }
    
    public final void m(final actk actk) {
        if (!this.o()) {
            super.b.remove(actk);
        }
    }
    
    public final void n(final actz actz) {
        if (this.d.isPresent() && this.o()) {
            tmy.y((Context)this.d.get(), actz.j(), 1);
            return;
        }
        super.g((actm)actz);
    }
}
