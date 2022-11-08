import android.view.View;
import android.view.View$OnClickListener;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwe
{
    public final ImageView a;
    public final acts b;
    public aokx c;
    public wwv d;
    public final SubscriptionNotificationOptionsDialogFragmentControllerImpl e;
    private final acng f;
    private final aeby g;
    
    public fwe(final SubscriptionNotificationOptionsDialogFragmentControllerImpl e, final acng f, final acts b, final aeby g, final ImageView a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.f = f;
        this.b = b;
        this.g = g;
        this.a = a;
    }
    
    public final void a() {
        this.a.setVisibility(8);
    }
    
    public final void b(final aokx c, final wwv d) {
        this.c = c;
        this.d = d;
        if (c != null && (c.b & 0x10) != 0x0) {
            Optional.ofNullable((Object)d).ifPresent((Consumer)new fva(c, 12));
            this.a.setOnClickListener((View$OnClickListener)new fuh(this, 3));
            final ImageView a = this.a;
            final acng f = this.f;
            akbf akbf;
            if ((akbf = c.g) == null) {
                akbf = akbf.a;
            }
            akbe akbe;
            if ((akbe = akbe.b(akbf.c)) == null) {
                akbe = akbe.a;
            }
            a.setImageResource(f.a(akbe));
            ahgn ahgn;
            if ((ahgn = c.k) == null) {
                ahgn = ahgn.a;
            }
            if ((ahgn.b & 0x1) != 0x0) {
                final ImageView a2 = this.a;
                ahgn ahgn2;
                if ((ahgn2 = c.k) == null) {
                    ahgn2 = ahgn.a;
                }
                ahgm ahgm;
                if ((ahgm = ahgn2.c) == null) {
                    ahgm = ahgm.a;
                }
                a2.setContentDescription((CharSequence)ahgm.c);
            }
            else {
                this.a.setContentDescription((CharSequence)null);
            }
            this.c();
            this.g.S(c, (View)this.a);
            return;
        }
        this.a();
    }
    
    public final void c() {
        Optional.ofNullable((Object)this.c).ifPresent((Consumer)new fva(this, 10));
    }
}
