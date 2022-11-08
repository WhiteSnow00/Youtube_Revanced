// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.youtube.api;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import app.revanced.integrations.utils.ReVancedUtils;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import android.content.Context;
import android.os.Handler;

public final class StandalonePlayerActivity extends aeeo implements lng
{
    private static StandalonePlayerActivity d;
    public Handler b;
    public Context c;
    private WatchDescriptor e;
    private PlaybackStartDescriptor f;
    private boolean g;
    private boolean h;
    private boolean i;
    private lnb j;
    private lot k;
    private lou l;
    private String m;
    private String n;
    
    public final void a(final lnb j) {
        this.j = j;
        if (!TextUtils.isEmpty((CharSequence)this.m)) {
            j.g(this.m, (zku)new kva(this, 5));
            return;
        }
        this.e();
    }
    
    public final void b(final Exception ex) {
        final Intent intent = new Intent();
        intent.putExtra("initialization_result", aeda.j(lnf.o(ex)));
        this.setResult(1, intent);
        this.finish();
    }
    
    public final void e() {
        if (this.isFinishing()) {
            return;
        }
        ((lnf)this.j).i = this.n;
        final lnb j = this.j;
        final lot k = new lot((Activity)this, j, ((yzf)((lnf)j).D.a()).c((Context)this));
        this.k = k;
        boolean b = true;
        k.ar(true);
        if (((lqd)this.e.b.instance).d) {
            this.k.aq((aefm)new aefl(this));
        }
        final View view = (View)aefv.b(this.k.L());
        if (view == null) {
            this.b(new IllegalStateException("Could not get player view."));
            return;
        }
        (this.l = new lou((Activity)this, view, this.k, this.f, this.g, this.h, this.i)).show();
        this.k.M(8);
        final lot i = this.k;
        if (this.g || this.i) {
            b = false;
        }
        i.ao(b);
        final Intent intent = new Intent();
        intent.putExtra("initialization_result", "SUCCESS");
        this.setResult(-1, intent);
    }
    
    public final void onCreate(final Bundle bundle) {
        ReVancedUtils.context = (Context)this;
        final StandalonePlayerActivity d = StandalonePlayerActivity.d;
        if (d != null) {
            d.finish();
        }
        StandalonePlayerActivity.d = this;
        final Intent intent = this.getIntent();
        final WatchDescriptor e = (WatchDescriptor)intent.getParcelableExtra("watch");
        if (e != null) {
            this.e = e;
            PlaybackStartDescriptor f = e.a;
            if (!TextUtils.isEmpty((CharSequence)f.k())) {
                f = jfi.af(f.k(), f.c());
            }
            else if (!TextUtils.isEmpty((CharSequence)f.i())) {
                f = jfi.ae(f.i(), f.a(), f.c());
            }
            else {
                final List l = f.l();
                if (l != null) {
                    if (l.size() == 1) {
                        f = jfi.af((String)l.get(0), f.c());
                    }
                    else {
                        f = jfi.ag(l, f.a(), f.c());
                    }
                }
                else {
                    afqg.s("Invalid PlaybackStartDescriptor. Returning the instance itself.");
                }
            }
            this.f = f;
        }
        else {
            final String stringExtra = intent.getStringExtra("video_id");
            final String stringExtra2 = intent.getStringExtra("playlist_id");
            final ArrayList stringArrayListExtra = intent.getStringArrayListExtra("video_ids");
            final int intExtra = intent.getIntExtra("current_index", 0);
            final int intExtra2 = intent.getIntExtra("start_time_millis", 0);
            final boolean booleanExtra = intent.getBooleanExtra("autoplay", false);
            PlaybackStartDescriptor playbackStartDescriptor;
            if (stringArrayListExtra != null) {
                playbackStartDescriptor = jfi.ag((List)stringArrayListExtra, intExtra, (long)intExtra2);
            }
            else if (stringExtra2 != null) {
                playbackStartDescriptor = jfi.ae(stringExtra2, intExtra, (long)intExtra2);
            }
            else if (stringExtra != null) {
                playbackStartDescriptor = jfi.af(stringExtra, (long)intExtra2);
            }
            else {
                playbackStartDescriptor = PlaybackStartDescriptor.d().a();
            }
            final abhx e2 = playbackStartDescriptor.e();
            e2.c((e2.d = booleanExtra) ^ true);
            final WatchDescriptor e3 = new WatchDescriptor(e2.a());
            this.e = e3;
            this.f = e3.a;
        }
        this.g = intent.getBooleanExtra("lightbox_mode", false);
        this.h = intent.getBooleanExtra("window_has_status_bar", false);
        this.i = this.isInMultiWindowMode();
        super.onCreate(bundle);
        if (!this.g && !this.i) {
            this.setRequestedOrientation(6);
        }
        final String stringExtra3 = intent.getStringExtra("developer_key");
        final String stringExtra4 = intent.getStringExtra("app_version");
        String stringExtra5;
        if ((stringExtra5 = intent.getStringExtra("client_library_version")) == null) {
            stringExtra5 = "1.0.0";
        }
        if (!stringExtra5.matches("^(\\d+\\.){2}(\\d+)(\\w?)$")) {
            this.b(new IllegalStateException("Invalid client version"));
            return;
        }
        final String callingPackage = this.getCallingPackage();
        String stringExtra6;
        if (callingPackage != null) {
            stringExtra6 = callingPackage;
        }
        else {
            stringExtra6 = intent.getStringExtra("app_package");
        }
        String stringExtra7;
        if (!TextUtils.isEmpty((CharSequence)stringExtra6) && !TextUtils.equals((CharSequence)stringExtra6, (CharSequence)"com.google.android.youtube")) {
            stringExtra7 = stringExtra6;
        }
        else {
            stringExtra7 = intent.getStringExtra("referring_app_package");
        }
        this.n = stringExtra7;
        String stringExtra8;
        if ("com.google.android.music".equals(callingPackage)) {
            stringExtra8 = intent.getStringExtra("google_account_name");
        }
        else {
            stringExtra8 = null;
        }
        this.m = stringExtra8;
        if (stringExtra3 == null) {
            this.b(new IllegalArgumentException("App developer key cannot be null or empty"));
            return;
        }
        if (stringExtra6 == null) {
            this.b(new IllegalArgumentException("App package name cannot be null or empty"));
            return;
        }
        if (stringExtra4 == null) {
            this.b(new IllegalArgumentException("App version name cannot be null or empty"));
            return;
        }
        lnf.p((lng)this, this.b, this.c, stringExtra3, stringExtra6, stringExtra4, stringExtra5, TextUtils.isEmpty((CharSequence)stringExtra8) ^ true, 3);
    }
    
    public final void onDestroy() {
        final lot k = this.k;
        if (k != null) {
            k.ao(false);
            this.k.an(this.isFinishing());
        }
        final lou l = this.l;
        if (l != null && l.isShowing()) {
            this.l.dismiss();
        }
        super.onDestroy();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final lot k = this.k;
        return (k != null && k.ay(n, keyEvent)) || super.onKeyUp(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final lot k = this.k;
        return (k != null && k.az(n, keyEvent)) || super.onKeyUp(n, keyEvent);
    }
    
    public final void onPause() {
        final lot k = this.k;
        if (k != null) {
            k.aj();
        }
        super.onPause();
    }
    
    public final void onResume() {
        super.onResume();
        final lot k = this.k;
        if (k != null) {
            k.ak();
        }
    }
    
    public final void onStart() {
        super.onStart();
        final lot k = this.k;
        if (k != null) {
            k.al();
        }
    }
    
    public final void onStop() {
        if (StandalonePlayerActivity.d == this) {
            StandalonePlayerActivity.d = null;
        }
        final lot k = this.k;
        if (k != null) {
            k.am();
        }
        super.onStop();
    }
}
