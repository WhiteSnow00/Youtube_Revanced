import android.content.res.Resources;
import androidx.mediarouter.app.MediaRouteButton;
import android.view.MenuItem;
import java.util.function.Function;
import java.util.function.Consumer;
import android.content.Context;
import j$.util.Optional;
import java.util.Observable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iav extends Observable implements iaw
{
    public static final int h = 0;
    public final boolean a;
    public final asiq b;
    asir c;
    public Optional d;
    public boolean e;
    public final arwh f;
    public final aeea g;
    private final Context i;
    private final xbt j;
    private int k;
    private final asid l;
    private Optional m;
    
    static {
        ttr.a("MDX.MediaRouteActionBar");
    }
    
    public iav(final xbv xbv, final arwh f, final msr msr, final asid l, final aeea g, final Context i, final xbt j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        final asiq b = new asiq();
        this.b = b;
        this.a = xbv.q;
        this.f = f;
        this.l = l;
        this.g = g;
        this.m = Optional.empty();
        this.d = Optional.empty();
        this.i = i;
        this.j = j;
        msr.K().V(new esa(this, 17));
        b.c(j.m().aH((asjm)new iad(this, 3)));
    }
    
    public final void a(final tqb tqb, final int k) {
        this.m = Optional.of((Object)tqb);
        this.k = k;
        this.b().ifPresent((Consumer)new iau(this, 1));
        this.b.c(this.f.h().Z((asjr)hzh.h).A().af(this.l).aH((asjm)new iad(this, 2)));
    }
    
    public final Optional b() {
        return this.d.map((Function)hvv.o);
    }
    
    public final void c() {
        final asir c = this.c;
        if (c != null) {
            c.dispose();
            this.c = null;
        }
    }
    
    public final void d(final boolean b) {
        if (this.d.isEmpty()) {
            return;
        }
        ((MenuItem)this.d.get()).setVisible(b);
        ((MenuItem)this.d.get()).setEnabled(b);
    }
    
    public final void e(final boolean b) {
        final Optional b2 = this.b();
        if (!b2.isEmpty()) {
            if (!this.m.isEmpty()) {
                final MediaRouteButton mediaRouteButton = (MediaRouteButton)b2.get();
                final tqb tqb = (tqb)this.m.get();
                final Resources resources = ((MediaRouteButton)b2.get()).getContext().getResources();
                int n;
                if (!b) {
                    n = 2131231856;
                }
                else {
                    n = 2131231858;
                }
                mediaRouteButton.e(tqb.b(resources.getDrawable(n), this.k));
            }
        }
    }
    
    public final int j() {
        return 2131429801;
    }
    
    public final int k() {
        return 0;
    }
    
    public final fzh l() {
        return (fzh)this;
    }
    
    public final void m() {
    }
    
    public final boolean n() {
        return false;
    }
    
    public final void o(final MenuItem menuItem) {
        menuItem.setActionView(2131624132);
        menuItem.setShowAsAction(2);
        if (this.d.isPresent() && this.d.get() == menuItem) {
            return;
        }
        this.d = Optional.of((Object)menuItem);
        this.c();
        this.b().ifPresent((Consumer)new iau(this, 0));
        this.setChanged();
        this.notifyObservers();
    }
    
    public final boolean p() {
        return true;
    }
    
    public final int q() {
        return 0;
    }
    
    public final CharSequence r() {
        return this.i.getString(2132019137);
    }
}
