import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.ui.presenter.dismissal.DismissalFollowUpDialogFragmentController;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knm extends acja
{
    knl a;
    private final Context b;
    private final vax c;
    private final giz d;
    private final DismissalFollowUpDialogFragmentController e;
    private final FrameLayout f;
    private knl g;
    private knl h;
    private final uyf i;
    private final uyi j;
    private final zhb k;
    
    public knm(final Context b, final vax c, final giz d, final DismissalFollowUpDialogFragmentController e, final uyf i, final zhb k, final uyi j, final byte[] array) {
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        this.i = i;
        k.getClass();
        this.k = k;
        j.getClass();
        this.j = j;
        final FrameLayout f = new FrameLayout(b);
        d.c((View)(this.f = f));
        f.setBackground((Drawable)new fyl(tmy.cn(b, 2130970897), b.getResources().getDimensionPixelSize(2131167246)));
    }
    
    public static aibb f() {
        final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
        ((agza)agzc).copyOnWrite();
        final aibb aibb = (aibb)agzc.instance;
        aibb.d = 13;
        aibb.c = 1;
        return (aibb)((agza)agzc).build();
    }
    
    public static String g(final ajsq ajsq) {
        if (ajsq != null) {
            ajsr ajsr;
            if ((ajsr = ajsq.f) == null) {
                ajsr = ajsr.a;
            }
            if ((ajsr.b & 0x1) != 0x0) {
                ajsr ajsr2;
                if ((ajsr2 = ajsq.f) == null) {
                    ajsr2 = ajsr.a;
                }
                ahgm ahgm;
                if ((ahgm = ajsr2.c) == null) {
                    ahgm = ahgm.a;
                }
                return ahgm.c;
            }
        }
        return null;
    }
    
    protected static final byte[] h(final amqj amqj) {
        return amqj.f.I().clone();
    }
    
    public final View a() {
        return this.d.a;
    }
    
    public final void c(final acir acir) {
        if (this.a != null) {
            this.a = null;
        }
        this.f.removeAllViews();
    }
}
