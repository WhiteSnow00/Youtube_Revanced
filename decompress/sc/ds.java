import java.util.Iterator;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.media.session.MediaSession$QueueItem;
import java.util.ArrayList;
import java.util.List;
import android.support.v4.media.session.PlaybackStateCompat;
import android.media.session.PlaybackState;
import android.support.v4.media.MediaMetadataCompat;
import android.media.MediaMetadata;
import android.os.Bundle;
import androidx.media.AudioAttributesCompat;
import android.media.session.MediaController$PlaybackInfo;
import java.lang.ref.WeakReference;
import android.media.session.MediaController$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ds extends MediaController$Callback
{
    private final WeakReference a;
    
    public ds(final du du) {
        this.a = new WeakReference((T)du);
    }
    
    public final void onAudioInfoChanged(final MediaController$PlaybackInfo mediaController$PlaybackInfo) {
        if (this.a.get() != null) {
            mediaController$PlaybackInfo.getPlaybackType();
            mediaController$PlaybackInfo.getAudioAttributes();
            final int b = AudioAttributesCompat.b;
            mediaController$PlaybackInfo.getVolumeControl();
            mediaController$PlaybackInfo.getMaxVolume();
            mediaController$PlaybackInfo.getCurrentVolume();
        }
    }
    
    public final void onExtrasChanged(final Bundle bundle) {
        eg.c(bundle);
        final du du = (du)this.a.get();
    }
    
    public final void onMetadataChanged(final MediaMetadata mediaMetadata) {
        final du du = (du)this.a.get();
        if (du != null) {
            du.a(MediaMetadataCompat.c((Object)mediaMetadata));
        }
    }
    
    public final void onPlaybackStateChanged(final PlaybackState playbackState) {
        final du du = (du)this.a.get();
        if (du != null) {
            if (du.c == null) {
                du.b(PlaybackStateCompat.a((Object)playbackState));
            }
        }
    }
    
    public final void onQueueChanged(final List list) {
        if (this.a.get() != null && list != null) {
            final ArrayList list2 = new ArrayList(list.size());
            for (final Object next : list) {
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
                if (next != null) {
                    final MediaSession$QueueItem mediaSession$QueueItem = (MediaSession$QueueItem)next;
                    mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a((Object)ef.b(mediaSession$QueueItem)), ef.a(mediaSession$QueueItem));
                }
                else {
                    mediaSessionCompat$QueueItem = null;
                }
                list2.add(mediaSessionCompat$QueueItem);
            }
        }
    }
    
    public final void onQueueTitleChanged(final CharSequence charSequence) {
        final du du = (du)this.a.get();
    }
    
    public final void onSessionDestroyed() {
        final du du = (du)this.a.get();
        if (du != null) {
            du.c();
        }
    }
    
    public final void onSessionEvent(final String s, final Bundle bundle) {
        eg.c(bundle);
        final du du = (du)this.a.get();
    }
}
