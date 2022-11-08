// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings;

import java.util.concurrent.atomic.AtomicReference;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

public final class AboutPrefsFragment extends jnv
{
    public hyc ae;
    private asic af;
    public acxu c;
    public SettingsDataAccess d;
    public elw e;
    
    public final void aM() {
        ((cex)this).a.g("youtube");
    }
    
    public final RecyclerView n(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.ae((nt)null);
        return n;
    }
    
    public final void no() {
        super.no();
        this.e.a = this;
        this.af = this.d.g((Runnable)new jcd(this, 20));
    }
    
    public final void np() {
        super.np();
        this.e.a = null;
        athh.f((AtomicReference)this.af);
    }
}
