// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import java.util.concurrent.atomic.AtomicReference;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

public final class AboutPrefsFragment extends jph
{
    public hzf ae;
    private asln af;
    public adbk c;
    public SettingsDataAccess d;
    public ema e;
    
    public final void aM() {
        ((cfb)this).a.g("youtube");
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nu)null);
        return n;
    }
    
    public final void nl() {
        super.nl();
        this.e.a = this;
        this.af = this.d.g((Runnable)new jin(this, 16));
    }
    
    public final void nm() {
        super.nm();
        this.e.a = null;
        atkw.f((AtomicReference)this.af);
    }
}
