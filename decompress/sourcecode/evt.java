import android.os.Bundle;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class evt extends evk
{
    public atjj a;
    public Handler b;
    public aexq c;
    public tmd d;
    public ewl e;
    public tmf f;
    public atjj g;
    public atjj h;
    public uyf i;
    public uyi j;
    public arud k;
    
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
    
    public final void k(final Intent intent) {
        this.startActivity(intent);
        this.overridePendingTransition(17432576, 17432577);
        this.finish();
    }
    
    public boolean l(final boolean b) {
        throw null;
    }
    
    public boolean m() {
        throw null;
    }
    
    protected void onCreate(final Bundle bundle) {
        final tsy tsy = new tsy(0);
        final tml d = tmd.d(1, (oas)tsy);
        final tml d2 = tmd.d(19, (oas)tsy);
        this.d();
        this.e.m();
        if (this.j.cp().aG()) {
            ((hnd)this.h.a()).b = System.currentTimeMillis();
        }
        final tmd d3 = this.d;
        d2.g();
        d3.g(d2);
        if (!gkt.bE(this.i)) {
            this.g.a();
            this.a.a();
        }
        final tmb k = this.e.k;
        final trg i = tmb.k(6);
        i.g("dan", (Runnable)new esi(this, 12));
        i.g("soc", (Runnable)new cog(this, bundle, 18));
        i.g("nls", (Runnable)new esi(this, 13));
        i.g("lta", (Runnable)new esi(this, 14));
        k.n(new trg[] { i });
        final tmd d4 = this.d;
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
