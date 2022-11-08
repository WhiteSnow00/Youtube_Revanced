// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.cast.framework.media;

import android.os.Bundle;
import android.view.KeyEvent;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class MediaIntentReceiver extends BroadcastReceiver
{
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final mnb log;
    
    static {
        log = new mnb("MediaIntentReceiver");
    }
    
    private static mlu getRemoteMediaClient(final mis mis) {
        if (mis != null && ((mjp)mis).q()) {
            return mis.c();
        }
        return null;
    }
    
    private void seek(final mis mis, final long n) {
        if (n == 0L) {
            return;
        }
        final mlu remoteMediaClient = getRemoteMediaClient(mis);
        if (remoteMediaClient != null && !remoteMediaClient.q()) {
            if (!remoteMediaClient.u()) {
                remoteMediaClient.z(mlc.o(remoteMediaClient.c() + n));
            }
        }
    }
    
    private void togglePlayback(final mis mis) {
        final mlu remoteMediaClient = getRemoteMediaClient(mis);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.m();
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        if (action == null) {
            return;
        }
        final mjq d = mio.b(context).d();
        final mjp b = d.b();
        if (b == null) {
            return;
        }
        int n = 0;
        Label_0240: {
            switch (action.hashCode()) {
                case 1997055314: {
                    if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                        n = 7;
                        break Label_0240;
                    }
                    break;
                }
                case 1362116196: {
                    if (action.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                        n = 3;
                        break Label_0240;
                    }
                    break;
                }
                case 235550565: {
                    if (action.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                        n = 0;
                        break Label_0240;
                    }
                    break;
                }
                case -124479363: {
                    if (action.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                        n = 6;
                        break Label_0240;
                    }
                    break;
                }
                case -668151673: {
                    if (action.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                        n = 5;
                        break Label_0240;
                    }
                    break;
                }
                case -945080078: {
                    if (action.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                        n = 2;
                        break Label_0240;
                    }
                    break;
                }
                case -945151566: {
                    if (action.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                        n = 1;
                        break Label_0240;
                    }
                    break;
                }
                case -1699820260: {
                    if (action.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                        n = 4;
                        break Label_0240;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                this.onReceiveOtherAction(context, action, intent);
                return;
            }
            case 7: {
                this.onReceiveActionMediaButton(b, intent);
                return;
            }
            case 6: {
                d.d(false);
                return;
            }
            case 5: {
                d.d(true);
                return;
            }
            case 4: {
                this.onReceiveActionRewind(b, intent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
                return;
            }
            case 3: {
                this.onReceiveActionForward(b, intent.getLongExtra("googlecast-extra_skip_step_ms", 0L));
                return;
            }
            case 2: {
                this.onReceiveActionSkipPrev(b);
                return;
            }
            case 1: {
                this.onReceiveActionSkipNext(b);
                return;
            }
            case 0: {
                this.onReceiveActionTogglePlayback(b);
            }
        }
    }
    
    protected void onReceiveActionForward(final mjp mjp, final long n) {
        if (mjp instanceof mis) {
            this.seek((mis)mjp, n);
        }
    }
    
    protected void onReceiveActionMediaButton(final mjp mjp, final Intent intent) {
        if (mjp instanceof mis) {
            if (!intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                return;
            }
            final Bundle extras = intent.getExtras();
            kgk.aL((Object)extras);
            final KeyEvent keyEvent = (KeyEvent)extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null) {
                if (keyEvent.getAction() == 0) {
                    if (keyEvent.getKeyCode() == 85) {
                        this.togglePlayback((mis)mjp);
                    }
                }
            }
        }
    }
    
    protected void onReceiveActionRewind(final mjp mjp, final long n) {
        if (mjp instanceof mis) {
            this.seek((mis)mjp, -n);
        }
    }
    
    protected void onReceiveActionSkipNext(final mjp mjp) {
        if (mjp instanceof mis) {
            final mlu remoteMediaClient = getRemoteMediaClient((mis)mjp);
            if (remoteMediaClient != null) {
                if (!remoteMediaClient.u()) {
                    remoteMediaClient.x();
                }
            }
        }
    }
    
    protected void onReceiveActionSkipPrev(final mjp mjp) {
        if (mjp instanceof mis) {
            final mlu remoteMediaClient = getRemoteMediaClient((mis)mjp);
            if (remoteMediaClient != null) {
                if (!remoteMediaClient.u()) {
                    remoteMediaClient.y();
                }
            }
        }
    }
    
    protected void onReceiveActionTogglePlayback(final mjp mjp) {
        if (mjp instanceof mis) {
            this.togglePlayback((mis)mjp);
        }
    }
    
    protected void onReceiveOtherAction(final Context context, final String s, final Intent intent) {
    }
    
    @Deprecated
    protected void onReceiveOtherAction(final String s, final Intent intent) {
        this.onReceiveOtherAction(null, s, intent);
    }
}
