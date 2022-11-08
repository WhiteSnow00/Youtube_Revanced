// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import java.util.concurrent.atomic.AtomicReference;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;

public final class PrivacyPrefsFragment extends job
{
    private asic ae;
    public acxu c;
    public SettingsDataAccess d;
    public arud e;
    
    public final void T(final Bundle bundle) {
        super.T(bundle);
        this.ae = this.d.g((Runnable)new jmw(this, 5));
    }
    
    public final void aM() {
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nt)null);
        return n;
    }
    
    public final void np() {
        super.np();
        athh.f((AtomicReference)this.ae);
    }
}
