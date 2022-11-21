// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.accessibility;

import androidx.preference.Preference;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

public final class AccessibilityPrefsFragment extends jpv implements AccessibilityManager$AccessibilityStateChangeListener
{
    private ProtoDataStoreSwitchPreference ae;
    public ProtoDataStoreListPreference c;
    public xaa d;
    public bx e;
    
    private final void aQ() {
        this.ae.ag(this.e.Y());
        final ListenableFuture af = this.ae.af();
        final jnu q = jnu.q;
        final ProtoDataStoreListPreference c = this.c;
        c.getClass();
        tfx.n((aup)this, af, (tui)q, (tui)new jnl(c, 16));
    }
    
    public final void aM() {
        ((br)this).oa().setTitle(2132017398);
        this.d.pE().b(xbf.b(85013), (aisc)null, (alji)null);
        this.d.pE().l((xbe)new wzy(xbf.c(85014)));
    }
    
    public final void nl() {
        super.nl();
        tua.g(((br)this).nQ(), (AccessibilityManager$AccessibilityStateChangeListener)this);
        this.aQ();
    }
    
    public final void nm() {
        super.nm();
        tua.h(((br)this).nQ(), (AccessibilityManager$AccessibilityStateChangeListener)this);
    }
    
    public final void ol(final Bundle bundle) {
        super.ol(bundle);
        ((cfb)this).a.g("youtube");
        ((cfb)this).p(2132213760);
        final ProtoDataStoreSwitchPreference ae = (ProtoDataStoreSwitchPreference)((cfb)this).pJ((CharSequence)"accessibility_player_setting_key");
        ae.getClass();
        this.ae = ae;
        final ProtoDataStoreListPreference c = (ProtoDataStoreListPreference)((cfb)this).pJ((CharSequence)"accessibility_hide_player_controls_setting_key");
        c.getClass();
        this.c = c;
        this.ae.c = (ttl)new joj(this, 5);
        final ProtoDataStoreListPreference c2 = this.c;
        ((Preference)c2).o = (ceq)new jpq(this, 0);
        c2.G = (ttl)new joj(this, 6);
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        this.aQ();
    }
}
