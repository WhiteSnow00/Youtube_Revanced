import android.media.Rating;
import android.content.Intent;
import android.support.v4.media.RatingCompat;
import android.net.Uri;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.BadParcelableException;
import android.util.Log;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.versionedparcelable.ParcelImpl;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.Bundle;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.media.session.MediaSession$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class dy extends MediaSession$Callback
{
    final dz a;
    
    public dy(final dz a) {
        this.a = a;
    }
    
    private final eb a() {
        synchronized (this.a.a) {
            final eb eb = (eb)this.a.c.get();
            monitorexit(this.a.a);
            if (eb != null && this.a == eb.a()) {
                return eb;
            }
            return null;
        }
    }
    
    private static final void b(final ea ea) {
        ea.i(null);
    }
    
    private static final void c(final ea ea) {
        if (Build$VERSION.SDK_INT >= 28) {
            return;
        }
        String e;
        if (TextUtils.isEmpty((CharSequence)(e = ea.e()))) {
            e = "android.media.session.MediaController";
        }
        ea.i(new axe(e, -1, -1));
    }
    
    public final void onCommand(final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        Label_0252: {
            try {
                if (s.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    final Bundle bundle2 = new Bundle();
                    final MediaSessionCompat$Token b = a.b;
                    final dr a2 = b.a();
                    IBinder binder;
                    if (a2 == null) {
                        binder = null;
                    }
                    else {
                        binder = a2.asBinder();
                    }
                    afb.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", binder);
                    Object a3 = b.a;
                    synchronized (a3) {
                        final cko d = b.d;
                        monitorexit(a3);
                        if (d == null) {
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", (Parcelable)null);
                        }
                        else {
                            final Bundle bundle3 = new Bundle();
                            a3 = new ParcelImpl(d);
                            bundle3.putParcelable("a", (Parcelable)a3);
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", (Parcelable)bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                        break Label_0252;
                    }
                }
                if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    final MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                }
                else if (s.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    final MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                }
                else if (s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    final MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat)bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                }
                else {
                    s.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
                }
            }
            catch (final BadParcelableException ex) {
                Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
            }
        }
        b((ea)a);
    }
    
    public final void onCustomAction(final String s, Bundle bundle) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        try {
            if (s.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                final Uri uri = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                bundle = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                eg.c(bundle);
                this.a.e(uri, bundle);
            }
            else if (s.equals("android.support.v4.media.session.action.PREPARE")) {
                this.a.f();
            }
            else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                eg.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                this.a.q();
            }
            else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                eg.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                this.a.r();
            }
            else if (s.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                final Uri uri2 = (Uri)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                eg.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                this.a.s();
            }
            else if (s.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
            }
            else if (s.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
            }
            else if (s.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
            }
            else if (s.equals("android.support.v4.media.session.action.SET_RATING")) {
                final RatingCompat ratingCompat = (RatingCompat)bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                eg.c(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            }
            else if (s.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
            }
            else {
                this.a.n(s);
            }
        }
        catch (final BadParcelableException ex) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        b((ea)a);
    }
    
    public final void onFastForward() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.b();
        b((ea)a);
    }
    
    public final boolean onMediaButtonEvent(final Intent intent) {
        final eb a = this.a();
        if (a == null) {
            return false;
        }
        c((ea)a);
        final boolean m = this.a.m(intent);
        b((ea)a);
        return m || super.onMediaButtonEvent(intent);
    }
    
    public final void onPause() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.c();
        b((ea)a);
    }
    
    public final void onPlay() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.d();
        b((ea)a);
    }
    
    public final void onPlayFromMediaId(final String s, final Bundle bundle) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        this.a.o();
        b((ea)a);
    }
    
    public final void onPlayFromSearch(final String s, final Bundle bundle) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        this.a.p();
        b((ea)a);
    }
    
    public final void onPlayFromUri(final Uri uri, final Bundle bundle) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        this.a.e(uri, bundle);
        b((ea)a);
    }
    
    public final void onPrepare() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.f();
        b((ea)a);
    }
    
    public final void onPrepareFromMediaId(final String s, final Bundle bundle) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        this.a.q();
        b((ea)a);
    }
    
    public final void onPrepareFromSearch(final String s, final Bundle bundle) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        this.a.r();
        b((ea)a);
    }
    
    public final void onPrepareFromUri(final Uri uri, final Bundle bundle) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        eg.c(bundle);
        c((ea)a);
        this.a.s();
        b((ea)a);
    }
    
    public final void onRewind() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.g();
        b((ea)a);
    }
    
    public final void onSeekTo(final long n) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.h(n);
        b((ea)a);
    }
    
    public final void onSetPlaybackSpeed(final float n) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        b((ea)a);
    }
    
    public final void onSetRating(final Rating c) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        final dz a2 = this.a;
        final RatingCompat ratingCompat = null;
        final RatingCompat ratingCompat2 = null;
        RatingCompat ratingCompat3 = ratingCompat;
        Label_0403: {
            if (c != null) {
                final int c2 = dl.c(c);
                if (dl.j(c)) {
                    float n = 1.0f;
                    switch (c2) {
                        default: {
                            ratingCompat3 = ratingCompat;
                            break Label_0403;
                        }
                        case 6: {
                            final float a3 = dl.a(c);
                            if (a3 >= 0.0f && a3 <= 100.0f) {
                                ratingCompat3 = new RatingCompat(6, a3);
                                break;
                            }
                            Log.e("Rating", "Invalid percentage-based rating value");
                            ratingCompat3 = ratingCompat2;
                            break;
                        }
                        case 3:
                        case 4:
                        case 5: {
                            final float b = dl.b(c);
                            float n2;
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 != 5) {
                                        final StringBuilder sb = new StringBuilder("Invalid rating style (");
                                        sb.append(c2);
                                        sb.append(") for a star rating");
                                        Log.e("Rating", sb.toString());
                                        ratingCompat3 = ratingCompat2;
                                        break;
                                    }
                                    n2 = 5.0f;
                                }
                                else {
                                    n2 = 4.0f;
                                }
                            }
                            else {
                                n2 = 3.0f;
                            }
                            if (b >= 0.0f && b <= n2) {
                                ratingCompat3 = new RatingCompat(c2, b);
                                break;
                            }
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            ratingCompat3 = ratingCompat2;
                            break;
                        }
                        case 2: {
                            if (!dl.k(c)) {
                                n = 0.0f;
                            }
                            ratingCompat3 = new RatingCompat(2, n);
                            break;
                        }
                        case 1: {
                            if (!dl.i(c)) {
                                n = 0.0f;
                            }
                            ratingCompat3 = new RatingCompat(1, n);
                            break;
                        }
                    }
                }
                else {
                    switch (c2) {
                        default: {
                            ratingCompat3 = ratingCompat2;
                            break;
                        }
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6: {
                            ratingCompat3 = new RatingCompat(c2, -1.0f);
                            break;
                        }
                    }
                }
                ratingCompat3.c = c;
            }
        }
        a2.i(ratingCompat3);
        b((ea)a);
    }
    
    public final void onSkipToNext() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.j();
        b((ea)a);
    }
    
    public final void onSkipToPrevious() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.k();
        b((ea)a);
    }
    
    public final void onSkipToQueueItem(final long n) {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        b((ea)a);
    }
    
    public final void onStop() {
        final eb a = this.a();
        if (a == null) {
            return;
        }
        c((ea)a);
        this.a.l();
        b((ea)a);
    }
}
