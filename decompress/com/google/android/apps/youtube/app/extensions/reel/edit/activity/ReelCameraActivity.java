// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.activity;

import android.view.KeyEvent;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import com.google.protobuf.ExtensionRegistryLite;

public class ReelCameraActivity extends hgz implements hii, wyv
{
    public hig b;
    public xac c;
    public trc d;
    public vai e;
    private aiqj f;
    
    public final aiqj b() {
        Label_0046: {
            if (this.f != null) {
                break Label_0046;
            }
            final Intent intent = this.getIntent();
            if (intent == null) {
                break Label_0046;
            }
            final byte[] byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint");
            if (byteArrayExtra == null) {
                break Label_0046;
            }
            try {
                this.f = (aiqj)ahbh.parseFrom((ahbh)aiqj.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                return this.f;
            }
            catch (final ahca ahca) {
                return this.f;
            }
        }
    }
    
    public final void d() {
        this.finish();
    }
    
    public final void e() {
    }
    
    public final void onBackPressed() {
        if (!this.b.ap.a()) {
            super.onBackPressed();
        }
    }
    
    public final void onCreate(Bundle bundle) {
        glb.c((Context)this);
        super.onCreate(bundle);
        if (this.e.aU()) {
            ((fa)this).setTheme(2132083492);
        }
        if (bundle != null) {
            bundle = bundle.getBundle("BUNDLE_INTERACTION_BUNDLE");
        }
        else {
            bundle = null;
        }
        this.c.M(bundle, this.b());
        ((qt)this).setContentView(2131625192);
        final br e = ((bu)this).getSupportFragmentManager().e(2131430850);
        if (e instanceof hig) {
            final hig b = (hig)e;
            this.b = b;
            b.aq = (hii)this;
            return;
        }
        final hig p = hig.p(this.b(), false, false);
        this.b = p;
        p.aq = (hii)this;
        final ct i = ((bu)this).getSupportFragmentManager().i();
        i.A(2131430850, (br)this.b);
        i.a();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.b.ap.b(n, keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        return this.b.ap.c(n) || super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return this.b.ap.d(n) || super.onKeyUp(n, keyEvent);
    }
    
    protected final void onPause() {
        if (this.isFinishing()) {
            this.setRequestedOrientation(-1);
        }
        super.onPause();
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", this.c.L());
    }
    
    public final void onUserInteraction() {
        final trc d = this.d;
        if (d != null) {
            d.b();
        }
        super.onUserInteraction();
    }
    
    public final wyw pF() {
        return (wyw)this.c;
    }
}
