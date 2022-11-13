import android.view.View;
import android.view.View$OnClickListener;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwm
{
    public final ImageView a;
    public final acvw b;
    public aona c;
    public wyw d;
    public final SubscriptionNotificationOptionsDialogFragmentControllerImpl e;
    private final acpk f;
    private final aeea g;
    
    public fwm(final SubscriptionNotificationOptionsDialogFragmentControllerImpl e, final acpk f, final acvw b, final aeea g, final ImageView a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.e = e;
        this.f = f;
        this.b = b;
        this.g = g;
        this.a = a;
    }
    
    public final void a() {
        this.a.setVisibility(8);
    }
    
    public final void b(final aona c, final wyw d) {
        this.c = c;
        this.d = d;
        if (c != null && (c.b & 0x10) != 0x0) {
            Optional.ofNullable((Object)d).ifPresent((Consumer)new fvj(c, 12));
            this.a.setOnClickListener((View$OnClickListener)new fup(this, 3));
            final ImageView a = this.a;
            final acpk f = this.f;
            akdi akdi;
            if ((akdi = c.g) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            a.setImageResource(f.a(akdh));
            ahil ahil;
            if ((ahil = c.k) == null) {
                ahil = ahil.a;
            }
            if ((ahil.b & 0x1) != 0x0) {
                final ImageView a2 = this.a;
                ahil ahil2;
                if ((ahil2 = c.k) == null) {
                    ahil2 = ahil.a;
                }
                ahik ahik;
                if ((ahik = ahil2.c) == null) {
                    ahik = ahik.a;
                }
                a2.setContentDescription((CharSequence)ahik.c);
            }
            else {
                this.a.setContentDescription((CharSequence)null);
            }
            this.c();
            this.g.Y((Object)c, (View)this.a);
            return;
        }
        this.a();
    }
    
    public final void c() {
        Optional.ofNullable((Object)this.c).ifPresent((Consumer)new fvj(this, 10));
    }
}
