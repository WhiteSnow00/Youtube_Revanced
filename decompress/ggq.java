import java.util.function.Consumer;
import android.os.Bundle;
import java.util.concurrent.Callable;
import j$.util.Optional;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.view.MenuItem;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class ggq extends br implements wyv, ghw
{
    public fa at;
    public gae au;
    public arkg av;
    public gae aw;
    public ggr ax;
    public ghb ay;
    public vaf az;
    
    public void V(final Activity activity) {
        super.V(activity);
        this.at = (fa)activity;
    }
    
    public void aE(final MenuItem menuItem) {
    }
    
    public int aQ() {
        return Integer.MAX_VALUE;
    }
    
    public gae aS() {
        return this.aw;
    }
    
    public gae aT(final gae gae) {
        return gae;
    }
    
    public aiqj aU() {
        return PaneDescriptor.b(this).f();
    }
    
    public asht aV() {
        return asht.X((Object)gkq.a);
    }
    
    public asht aW() {
        return asht.X((Object)Optional.empty());
    }
    
    public asht aX() {
        return asht.T((Callable)eiz.b);
    }
    
    public asht aY() {
        return asht.X((Object)Optional.empty());
    }
    
    public asht aZ() {
        return asht.X((Object)true);
    }
    
    public Optional ba(final PaneDescriptor paneDescriptor) {
        return Optional.empty();
    }
    
    public CharSequence bb() {
        return null;
    }
    
    public Object bc() {
        return null;
    }
    
    public String bd() {
        return null;
    }
    
    public void be(final int n) {
    }
    
    public void bf() {
    }
    
    public void bg() {
    }
    
    public void bh() {
    }
    
    public void bi(final Object o) {
    }
    
    public void bj(final boolean b) {
    }
    
    public final boolean bk() {
        final Bundle m = super.m;
        return this.bn() && m != null && m.getBoolean("needs_nested_header", false);
    }
    
    public boolean bl() {
        return false;
    }
    
    public final boolean bm() {
        return super.C != null;
    }
    
    public final boolean bn() {
        final ggq ggq = (ggq)super.C;
        return ggq != null && ggq.bl();
    }
    
    public boolean bo() {
        return false;
    }
    
    public boolean bp() {
        return false;
    }
    
    public boolean bq() {
        return false;
    }
    
    public void lQ() {
    }
    
    public gae mG() {
        if (this.au == null && this.aS() != null) {
            if (this.bb() == null) {
                this.au = this.aS();
            }
            else {
                final gad b = this.aS().b();
                b.n((aezf)new ggp(this, 0));
                this.au = b.a();
            }
        }
        final gae au = this.au;
        au.getClass();
        return au;
    }
    
    public void nm() {
        super.nm();
        this.pF().s();
    }
    
    public void no() {
        super.no();
        this.ay.w(this);
    }
    
    public void oq(final Bundle bundle) {
        super.oq(bundle);
        final ggq ggq = (ggq)super.C;
        if (ggq != null) {
            ggq.ba(PaneDescriptor.b(this)).ifPresent((Consumer)new gga(this, 6));
        }
    }
    
    public final wyw pF() {
        final arkg av = this.av;
        if (av == null) {
            return wyw.k;
        }
        return (wyw)av.a();
    }
}
