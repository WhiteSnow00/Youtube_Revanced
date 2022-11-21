// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import java.util.concurrent.atomic.AtomicReference;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;

public final class BillingsAndPaymentsPrefsFragment extends jpj
{
    public adbk c;
    public SettingsDataAccess d;
    asln e;
    
    public final void aM() {
    }
    
    public final void ab(final View view, final Bundle bundle) {
        super.ab(view, bundle);
        this.e = this.d.g((Runnable)new jin(this, 17));
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nu)null);
        return n;
    }
    
    public final void nm() {
        super.nm();
        atkw.f((AtomicReference)this.e);
    }
}
