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

public final class gvf extends gvg implements hbk, aeho
{
    public boolean a;
    public final ShortsCreationActivity b;
    public final ucs c;
    public final oas d;
    public long e;
    public final aegi f;
    public final tox g;
    public final gau h;
    public final ViewGroup i;
    public final uyi j;
    public final auip k;
    private aioe m;
    private final rxr n;
    private final tdg o;
    
    public gvf(final ShortsCreationActivity b, final ucs c, final oas d, final auip k, final aegi f, final tdg o, final tox g, final rxr n, final gau h, final ViewGroup i, final uyi j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
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
    
    public final void d(final aeby aeby) {
        final AccountId i = aeby.i();
        final long e = this.e;
        final cl supportFragmentManager = this.b.getSupportFragmentManager();
        if (!(supportFragmentManager.e(2131430847) instanceof hbl)) {
            final aioe e2 = this.e();
            final hbl hbl = new hbl();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", ((agxl)e2).toByteArray());
            hbl.ag(bundle);
            hbl.aw = e;
            aenz.e((br)hbl, i);
            final ct j = supportFragmentManager.i();
            j.A(2131430847, (br)hbl);
            j.d();
        }
        this.n.h(16, 2, 2);
    }
    
    public final aioe e() {
        if (this.m == null) {
            final Intent intent = this.b.getIntent();
            if (intent != null) {
                final byte[] byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint");
                aioe m;
                final aioe aioe = m = null;
                if (byteArrayExtra != null) {
                    try {
                        m = (aioe)agzi.parseFrom((agzi)aioe.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                    }
                    catch (final ahab ahab) {
                        m = aioe;
                    }
                }
                if (m == null) {
                    zjp.b(zjo.b, zjn.f, "[ShortsCreation][Android][Navigation] No Command in Intent.");
                }
                else {
                    this.m = m;
                }
            }
        }
        return this.m;
    }
    
    public final Optional f() {
        final br e = this.b.getSupportFragmentManager().e(2131430847);
        if (e instanceof hbl) {
            return Optional.of((Object)((hbl)e).ar);
        }
        return Optional.empty();
    }
    
    public final void g(final boolean b) {
        this.a = true;
        this.c.f(b);
        this.b.finish();
    }
    
    public final void sR(final Throwable t) {
        this.o.r("ShortsCreationActivityPeer", t, 16, (Activity)this.b);
    }
}
