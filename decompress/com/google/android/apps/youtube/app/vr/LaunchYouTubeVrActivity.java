// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.vr;

import com.google.vr.ndk.base.DaydreamApi;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;
import android.os.Bundle;

public class LaunchYouTubeVrActivity extends ksz
{
    public abno b;
    public tox c;
    
    public final void onCreate(final Bundle bundle) {
        fah.m((Context)this);
        super.onCreate(bundle);
        final FrameLayout contentView = new FrameLayout((Context)this);
        ((View)contentView).setBackgroundColor(-16777216);
        ((View)contentView).setSystemUiVisibility(3846);
        ((qt)this).setContentView((View)contentView);
        final DaydreamApi create = DaydreamApi.create(this.getApplicationContext());
        if (create != null) {
            aauz.d((Context)this, 2, create, this.b);
            create.close();
        }
    }
    
    public final void onUserInteraction() {
        final tox c = this.c;
        if (c != null) {
            c.b();
        }
        super.onUserInteraction();
    }
}
