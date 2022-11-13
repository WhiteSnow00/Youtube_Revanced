import android.app.Activity;
import j$.util.Optional;
import android.content.Intent;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.apps.tiktok.account.AccountId;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvu extends gvv implements hcb, aejp
{
    public boolean a;
    public final ShortsCreationActivity b;
    public final ueu c;
    public final oby d;
    public long e;
    public final aeij f;
    public final trc g;
    public final gbc h;
    public final ViewGroup i;
    public final vai j;
    public final aujg k;
    private aiqj m;
    private final rzv n;
    private final sqq o;
    
    public gvu(final ShortsCreationActivity b, final ueu c, final oby d, final aujg k, final aeij f, final sqq o, final trc g, final rzv n, final gbc h, final ViewGroup i, final vai j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.a = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
        this.f = f;
        this.o = o;
        this.g = g;
        this.n = n;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void b() {
    }
    
    public final void c() {
        afse.j((aejp)this);
    }
    
    public final void d(final aeea aeea) {
        final AccountId h = aeea.h();
        final long e = this.e;
        final cl supportFragmentManager = this.b.getSupportFragmentManager();
        if (!(supportFragmentManager.e(2131430850) instanceof hcd)) {
            final aiqj e2 = this.e();
            final hcd hcd = new hcd();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", ((agzk)e2).toByteArray());
            hcd.ag(bundle);
            hcd.aw = e;
            aepz.e((br)hcd, h);
            final ct i = supportFragmentManager.i();
            i.A(2131430850, (br)hcd);
            i.d();
        }
        this.n.h(16, 2, 2);
    }
    
    public final aiqj e() {
        if (this.m == null) {
            final Intent intent = this.b.getIntent();
            if (intent != null) {
                final byte[] byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint");
                aiqj m;
                final aiqj aiqj = m = null;
                if (byteArrayExtra != null) {
                    try {
                        m = (aiqj)ahbh.parseFrom((ahbh)aiqj.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                    }
                    catch (final ahca ahca) {
                        m = aiqj;
                    }
                }
                if (m == null) {
                    zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Navigation] No Command in Intent.");
                }
                else {
                    this.m = m;
                }
            }
        }
        return this.m;
    }
    
    public final Optional f() {
        final br e = this.b.getSupportFragmentManager().e(2131430850);
        if (e instanceof hcd) {
            return Optional.of((Object)((hcd)e).ar);
        }
        return Optional.empty();
    }
    
    public final void g(final boolean b) {
        this.a = true;
        this.c.g(b);
        this.b.finish();
    }
    
    public final void sX(final Throwable t) {
        this.o.j("ShortsCreationActivityPeer", t, 16, (Activity)this.b);
    }
}
