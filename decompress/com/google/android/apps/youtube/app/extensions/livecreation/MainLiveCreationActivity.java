// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.livecreation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import android.view.ViewStub;

public class MainLiveCreationActivity extends gtt
{
    public gau a;
    public acup b;
    public tox c;
    
    @Override
    protected final void e(final ViewStub viewStub) {
        viewStub.setLayoutResource(2131624107);
        this.a.f((BottomUiContainer)viewStub.inflate());
    }
    
    @Override
    protected final void onCreate(final Bundle bundle) {
        fah.m((Context)this);
        super.onCreate(bundle);
        this.b.g(this.findViewById(16908290));
    }
    
    public final void onUserInteraction() {
        final tox c = this.c;
        if (c != null) {
            c.b();
        }
        super.onUserInteraction();
    }
}
