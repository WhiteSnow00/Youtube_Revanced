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

public class ggh extends br implements wwu, ghn
{
    public fa at;
    public fzw au;
    public arhr av;
    public fzw aw;
    public ggi ax;
    public ggs ay;
    public uyf az;
    
    public void V(final Activity activity) {
        super.V(activity);
        this.at = (fa)activity;
    }
    
    public void aE(final MenuItem menuItem) {
    }
    
    public int aQ() {
        return Integer.MAX_VALUE;
    }
    
    public fzw aS() {
        return this.aw;
    }
    
    public fzw aT(final fzw fzw) {
        return fzw;
    }
    
    public aioe aU() {
        return PaneDescriptor.b(this).f();
    }
    
    public ashe aV() {
        return ashe.U((Object)gki.a);
    }
    
    public ashe aW() {
        return ashe.U((Object)Optional.empty());
    }
    
    public ashe aX() {
        return ashe.P((Callable)eiy.b);
    }
    
    public ashe aY() {
        return ashe.U((Object)Optional.empty());
    }
    
    public ashe aZ() {
        return ashe.U((Object)true);
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
        final ggh ggh = (ggh)super.C;
        return ggh != null && ggh.bl();
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
    
    public fzw mG() {
        if (this.au == null && this.aS() != null) {
            if (this.bb() == null) {
                this.au = this.aS();
            }
            else {
                final fzv b = this.aS().b();
                b.n((aexg)new gkq(this, 1));
                this.au = b.a();
            }
        }
        final fzw au = this.au;
        au.getClass();
        return au;
    }
    
    public final wwv n() {
        final arhr av = this.av;
        if (av == null) {
            return wwv.k;
        }
        return (wwv)av.a();
    }
    
    public void nm() {
        super.nm();
        this.n().s();
    }
    
    public void no() {
        super.no();
        this.ay.w(this);
    }
    
    public void oq(final Bundle bundle) {
        super.oq(bundle);
        final ggh ggh = (ggh)super.C;
        if (ggh != null) {
            ggh.ba(PaneDescriptor.b(this)).ifPresent((Consumer)new gft(this, 6));
        }
    }
}
