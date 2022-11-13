// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.livechat.settings;

import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;

public class LiveChatFragment extends iai
{
    public aczw c;
    public SettingsDataAccess d;
    private asir e;
    
    public final void aM() {
    }
    
    public final void ab(final View view, final Bundle bundle) {
        super.ab(view, bundle);
        this.e = this.d.g((Runnable)new hvt(this, 7));
    }
    
    public final void np() {
        super.np();
        athz.f((AtomicReference)this.e);
    }
}
