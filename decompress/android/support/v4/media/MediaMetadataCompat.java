// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.net.Uri;
import android.util.Log;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.os.Parcel;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final abi a;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    public final Bundle b;
    public MediaMetadata c;
    private MediaDescriptionCompat g;
    
    static {
        final abi abi = a = new abi();
        final Integer value = 1;
        ((abp)abi).put((Object)"android.media.metadata.TITLE", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.ARTIST", (Object)value);
        final Integer value2 = 0;
        ((abp)abi).put((Object)"android.media.metadata.DURATION", (Object)value2);
        ((abp)abi).put((Object)"android.media.metadata.ALBUM", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.AUTHOR", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.WRITER", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.COMPOSER", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.COMPILATION", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.DATE", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.YEAR", (Object)value2);
        ((abp)abi).put((Object)"android.media.metadata.GENRE", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.TRACK_NUMBER", (Object)value2);
        ((abp)abi).put((Object)"android.media.metadata.NUM_TRACKS", (Object)value2);
        ((abp)abi).put((Object)"android.media.metadata.DISC_NUMBER", (Object)value2);
        ((abp)abi).put((Object)"android.media.metadata.ALBUM_ARTIST", (Object)value);
        final Integer value3 = 2;
        ((abp)abi).put((Object)"android.media.metadata.ART", (Object)value3);
        ((abp)abi).put((Object)"android.media.metadata.ART_URI", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.ALBUM_ART", (Object)value3);
        ((abp)abi).put((Object)"android.media.metadata.ALBUM_ART_URI", (Object)value);
        final Integer value4 = 3;
        ((abp)abi).put((Object)"android.media.metadata.USER_RATING", (Object)value4);
        ((abp)abi).put((Object)"android.media.metadata.RATING", (Object)value4);
        ((abp)abi).put((Object)"android.media.metadata.DISPLAY_TITLE", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.DISPLAY_SUBTITLE", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.DISPLAY_DESCRIPTION", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.DISPLAY_ICON", (Object)value3);
        ((abp)abi).put((Object)"android.media.metadata.DISPLAY_ICON_URI", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.MEDIA_ID", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.BT_FOLDER_TYPE", (Object)value2);
        ((abp)abi).put((Object)"android.media.metadata.MEDIA_URI", (Object)value);
        ((abp)abi).put((Object)"android.media.metadata.ADVERTISEMENT", (Object)value2);
        ((abp)abi).put((Object)"android.media.metadata.DOWNLOAD_STATUS", (Object)value2);
        d = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
        e = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
        f = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
        CREATOR = (Parcelable$Creator)new aw(7);
    }
    
    public MediaMetadataCompat(Bundle b) {
        b = new Bundle(b);
        eg.c(this.b = b);
    }
    
    public MediaMetadataCompat(final Parcel parcel) {
        this.b = parcel.readBundle(eg.class.getClassLoader());
    }
    
    public static MediaMetadataCompat c(final Object o) {
        if (o != null) {
            final Parcel obtain = Parcel.obtain();
            final MediaMetadata c = (MediaMetadata)o;
            c.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            final MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.c = c;
            return mediaMetadataCompat;
        }
        return null;
    }
    
    public final long a(final String s) {
        return this.b.getLong(s, 0L);
    }
    
    public final MediaDescriptionCompat b() {
        final MediaDescriptionCompat g = this.g;
        if (g != null) {
            return g;
        }
        final String e = this.e("android.media.metadata.MEDIA_ID");
        final CharSequence[] array = new CharSequence[3];
        final CharSequence d = this.d("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(d)) {
            array[0] = d;
            array[1] = this.d("android.media.metadata.DISPLAY_SUBTITLE");
            array[2] = this.d("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        else {
            int i = 0;
            int n = 0;
            while (i < 3) {
                final String[] d2 = MediaMetadataCompat.d;
                final int length = d2.length;
                if (n >= 7) {
                    break;
                }
                final CharSequence d3 = this.d(d2[n]);
                int n2 = i;
                if (!TextUtils.isEmpty(d3)) {
                    array[i] = d3;
                    n2 = i + 1;
                }
                ++n;
                i = n2;
            }
        }
        int n3 = 0;
        Bitmap bitmap;
        while (true) {
            final String[] e2 = MediaMetadataCompat.e;
            final int length2 = e2.length;
            if (n3 >= 3) {
                bitmap = null;
                break;
            }
            final String s = e2[n3];
            try {
                bitmap = (Bitmap)this.b.getParcelable(s);
            }
            catch (final Exception ex) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", (Throwable)ex);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            ++n3;
        }
        int n4 = 0;
        Uri parse;
        while (true) {
            final String[] f = MediaMetadataCompat.f;
            final int length3 = f.length;
            if (n4 >= 3) {
                parse = null;
                break;
            }
            final String e3 = this.e(f[n4]);
            if (!TextUtils.isEmpty((CharSequence)e3)) {
                parse = Uri.parse(e3);
                break;
            }
            ++n4;
        }
        final String e4 = this.e("android.media.metadata.MEDIA_URI");
        Uri parse2;
        if (!TextUtils.isEmpty((CharSequence)e4)) {
            parse2 = Uri.parse(e4);
        }
        else {
            parse2 = null;
        }
        final CharSequence charSequence = array[0];
        final CharSequence charSequence2 = array[1];
        final CharSequence charSequence3 = array[2];
        Bundle bundle = new Bundle();
        if (this.b.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", this.a("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.b.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", this.a("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (bundle.isEmpty()) {
            bundle = null;
        }
        return this.g = dj.q(e, charSequence, charSequence2, charSequence3, bitmap, parse, bundle, parse2);
    }
    
    public final CharSequence d(final String s) {
        return this.b.getCharSequence(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final String e(final String s) {
        final CharSequence charSequence = this.b.getCharSequence(s);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.b);
    }
}
