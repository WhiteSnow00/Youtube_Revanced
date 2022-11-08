// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.mdx.background;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.content.Intent;
import android.content.Context;

public class MdxBackgroundPlaybackBroadcastReceiver extends xad
{
    private static final String c;
    public xag a;
    public wwv b;
    
    static {
        c = trn.a("MDX.MdxBackgroundPlaybackBroadcastReceiver");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        this.a(context);
        final String stringExtra = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.route_id");
        final String stringExtra2 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.device_name");
        final String stringExtra3 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.playlist_id");
        final String stringExtra4 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.video_id");
        final int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.session_type", -1);
        if (!aexs.f(stringExtra) && !aexs.f(stringExtra2) && (!aexs.f(stringExtra3) || !aexs.f(stringExtra4)) && intExtra != -1) {
            final int intExtra2 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.timeout", -1);
            final xqc a = xai.a();
            a.f(stringExtra);
            a.h(aqql.dw(intExtra));
            a.e(stringExtra2);
            final xlf c = xlg.c();
            c.d(tsx.i(stringExtra3));
            c.g(tsx.i(stringExtra4));
            c.b(intent.getLongExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", 0L));
            c.e(intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", 0));
            a.c = c.a();
            if (intExtra2 >= 0) {
                a.g(intExtra2);
            }
            trn.h(MdxBackgroundPlaybackBroadcastReceiver.c, "starting background playback");
            this.a.e(a.d());
            final InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen)intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.background.ve_screen");
            final int intExtra3 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.ve_type", 0);
            if (interactionLoggingScreen != null && intExtra3 != 0) {
                this.b.B(interactionLoggingScreen);
                this.b.J(3, (wxz)new wws(wya.c(intExtra3)), (alff)null);
            }
            return;
        }
        trn.m(MdxBackgroundPlaybackBroadcastReceiver.c, "playback request not valid, ignoring");
    }
}
