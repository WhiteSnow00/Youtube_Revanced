import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class isl extends abbk implements aaod, fqk
{
    private final Set a;
    public fkr f;
    public angg g;
    public boolean h;
    public long i;
    public long j;
    
    public isl(final Context context) {
        super(context);
        this.a = new CopyOnWriteArraySet();
    }
    
    public ViewGroup$LayoutParams a() {
        throw null;
    }
    
    public void e(final Context context, final View view) {
        throw null;
    }
    
    public final void h(final aaoc aaoc) {
        final Set a = this.a;
        aaoc.getClass();
        a.add(aaoc);
    }
    
    public final void k(final fkr f) {
        if (this.f != f) {
            this.f = f;
            this.Z(4);
        }
    }
    
    public final void l() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aaoc)iterator.next()).t();
        }
    }
    
    public final void m() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((aaoc)iterator.next()).u(false);
        }
    }
    
    protected abbn mj(final Context context) {
        final abbn mj = super.mj(context);
        mj.e = false;
        return mj;
    }
    
    public final void mk() {
        this.g = null;
        super.X();
    }
    
    public final String mr() {
        return "player_overlay_player_autonav_endscreen";
    }
    
    public final void n(final angg g, final boolean h) {
        this.mm();
        if (adkp.ae(this.g, g) && this.h == h) {
            return;
        }
        this.g = g;
        this.h = h;
        this.Z(1);
    }
    
    public final void o(final long i, final long j) {
        if (this.i == i && this.j == j) {
            return;
        }
        this.i = i;
        this.j = j;
        this.Z(2);
    }
    
    public final boolean oV() {
        return this.g != null;
    }
    
    public boolean ow(final fkr fkr) {
        throw null;
    }
}
