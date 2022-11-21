// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import java.util.concurrent.atomic.AtomicReference;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;

public final class PrivacyPrefsFragment extends jpn
{
    private asln ae;
    public adbk c;
    public SettingsDataAccess d;
    public arzb e;
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        this.ae = this.d.g((Runnable)new jov(this, 0));
    }
    
    public final void aM() {
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nu)null);
        return n;
    }
    
    public final void nm() {
        super.nm();
        atkw.f((AtomicReference)this.ae);
    }
}
