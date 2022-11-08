// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.gmscompliance.ui;

import android.content.res.TypedArray;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.w;
import android.view.View$OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.content.Context;
import android.text.TextUtils;
import android.os.Bundle;

public class UncertifiedDeviceActivity extends fa
{
    protected final void onCreate(Bundle bundleExtra) {
        super.onCreate(bundleExtra);
        int theme;
        if (TextUtils.isEmpty((CharSequence)"glif_v3_light")) {
            theme = 0;
        }
        else {
            if (aeef.a == null) {
                final aeee aeee = new aeee();
                aeee.a = 2132083789;
                aeee.b();
                aeef.a = aeee.a();
            }
            final aeee aeee2 = new aeee(aeef.a);
            aeee2.a = 0;
            aeee2.b();
            if (!aeee2.a().c) {
                theme = 2132083796;
            }
            else {
                theme = 2132083795;
            }
        }
        if (theme != 0) {
            this.setTheme(theme);
        }
        final Window window = this.getWindow();
        final aeby a = aedm.a;
        final WindowManager$LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility &= 0xFFFFE9FD;
        window.setAttributes(attributes);
        final aedl aedl = new aedl();
        aedl.b = window;
        aedl.c = 3;
        aedl.d.run();
        final TypedArray obtainStyledAttributes = ((Context)this).obtainStyledAttributes(new int[] { 16843857, 16843858 });
        final int color = obtainStyledAttributes.getColor(0, 0);
        final int color2 = obtainStyledAttributes.getColor(1, 0);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
        ((qt)this).setContentView(2131624057);
        if (this.getIntent().getBooleanExtra("overrideNavBarColor", false)) {
            this.getWindow().setNavigationBarColor(agx.a((Context)this, 2131101609));
        }
        qcj.D((TextView)this.findViewById(2131430421), LinkMovementMethod.getInstance());
        final Button button = (Button)this.findViewById(2131429134);
        if (button != null) {
            final String stringExtra = this.getIntent().getStringExtra("customCtaText");
            final Intent intent = (Intent)this.getIntent().getParcelableExtra("ctaIntent");
            if (!TextUtils.isEmpty((CharSequence)stringExtra) && intent != null) {
                bundleExtra = this.getIntent().getBundleExtra("ctaIntentOptions");
                button.setText((CharSequence)stringExtra);
                button.setOnClickListener((View$OnClickListener)new klr(this, intent, bundleExtra, 7));
            }
            else {
                button.setVisibility(4);
            }
        }
        final TextView textView = (TextView)this.findViewById(2131430422);
        if (textView != null) {
            final String stringExtra2 = this.getIntent().getStringExtra("customBodyText");
            if (TextUtils.isEmpty((CharSequence)stringExtra2)) {
                textView.setVisibility(4);
            }
            else {
                textView.setText((CharSequence)aey.e(stringExtra2));
                qcj.D(textView, LinkMovementMethod.getInstance());
                final Intent intent2 = (Intent)this.getIntent().getParcelableExtra("customBodyTextOnClickIntent");
                if (intent2 != null) {
                    textView.setOnClickListener((View$OnClickListener)new kox(this, intent2, 12));
                }
            }
        }
        final Button button2 = (Button)this.findViewById(2131429032);
        if (button2 != null) {
            button2.setOnClickListener((View$OnClickListener)new w(this, 10));
        }
    }
}
