import android.os.Bundle;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class evx extends evo
{
    public atke a;
    public Handler b;
    public aezp c;
    public toj d;
    public ewp e;
    public tol f;
    public atke g;
    public atke h;
    public vaf i;
    public vai j;
    public arwh k;
    
    public int e() {
        throw null;
    }
    
    protected int f() {
        throw null;
    }
    
    public int g() {
        throw null;
    }
    
    public Intent h() {
        final Intent intent = new Intent(this.getIntent());
        intent.setComponent(new ComponentName((Context)this, this.i()));
        intent.putExtra("alias", this.getClass().getName());
        intent.setFlags(this.f());
        return intent;
    }
    
    protected abstract Class i();
    
    public final void j(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public final void k(final Intent intent) {
        ((qnf)this).startActivity(intent);
        this.overridePendingTransition(17432576, 17432577);
        ((qnf)this).finish();
    }
    
    public boolean l(final boolean b) {
        throw null;
    }
    
    public boolean m() {
        throw null;
    }
    
    protected void onCreate(final Bundle bundle) {
        final tvc tvc = new tvc(0);
        final tor d = toj.d(1, (oby)tvc);
        final tor d2 = toj.d(19, (oby)tvc);
        this.d();
        this.e.m();
        if (this.j.cr().aM()) {
            ((hny)this.h.a()).b = System.currentTimeMillis();
        }
        final toj d3 = this.d;
        d2.g();
        d3.g(d2);
        if (!glb.ac(this.i)) {
            this.g.a();
            this.a.a();
        }
        final toh k = this.e.k;
        final ttl i = toh.k(6);
        i.g("dan", (Runnable)new esl(this, 11));
        i.g("soc", (Runnable)new coh(this, bundle, 18));
        i.g("nls", (Runnable)new esl(this, 12));
        i.g("lta", (Runnable)new esl(this, 13));
        k.n(new ttl[] { i });
        final toj d4 = this.d;
        d.g();
        d4.g(d);
    }
    
    protected void onDestroy() {
        super.onDestroy();
        if (this.isChangingConfigurations()) {
            this.f.e();
        }
    }
}
