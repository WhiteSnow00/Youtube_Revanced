// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

public final class ThirdPartyPrefsFragment extends jpp
{
    public adbk c;
    public SettingsDataAccess d;
    asln e;
    
    public final void W() {
        ((cfb)this).o().ac();
        atkw.f((AtomicReference)this.e);
        super.W();
    }
    
    public final void aM() {
    }
    
    public final void ab(final View view, final Bundle bundle) {
        super.ab(view, bundle);
        this.e = this.d.g((Runnable)new jov(this, 3));
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nu)null);
        return n;
    }
}
