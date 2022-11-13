// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.livecreation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.ViewStub;

public class MainLiveCreationActivity extends gub
{
    public gbc a;
    public acwt b;
    public trc c;
    
    protected final void e(final ViewStub viewStub) {
        viewStub.setLayoutResource(2131624106);
        this.a.f((BottomUiContainer)viewStub.inflate());
    }
    
    protected final void onCreate(final Bundle bundle) {
        glb.c((Context)this);
        super.onCreate(bundle);
        this.b.h(this.findViewById(16908290));
    }
    
    public final void onUserInteraction() {
        final trc c = this.c;
        if (c != null) {
            c.b();
        }
        super.onUserInteraction();
    }
}
