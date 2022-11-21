// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.livechat.settings;

import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;

public class LiveChatFragment extends iar
{
    public adbk c;
    public SettingsDataAccess d;
    private asln e;
    
    public final void aM() {
    }
    
    public final void ab(final View view, final Bundle bundle) {
        super.ab(view, bundle);
        this.e = this.d.g((Runnable)new hwf(this, 6));
    }
    
    public final void nm() {
        super.nm();
        atkw.f((AtomicReference)this.e);
    }
}
