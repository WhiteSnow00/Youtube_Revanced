import android.text.Spannable;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Bundle;
import android.net.Uri;
import android.media.MediaDescription$Builder;
import android.graphics.Bitmap;
import android.media.MediaDescription;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dj
{
    public static Bitmap a(final MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }
    
    public static MediaDescription$Builder b() {
        return new MediaDescription$Builder();
    }
    
    public static MediaDescription c(final MediaDescription$Builder mediaDescription$Builder) {
        return mediaDescription$Builder.build();
    }
    
    public static Uri d(final MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }
    
    public static Bundle e(final MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }
    
    public static CharSequence f(final MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }
    
    public static CharSequence g(final MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }
    
    public static CharSequence h(final MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }
    
    public static String i(final MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }
    
    public static void j(final MediaDescription$Builder mediaDescription$Builder, final CharSequence description) {
        mediaDescription$Builder.setDescription(description);
    }
    
    public static void k(final MediaDescription$Builder mediaDescription$Builder, final Bundle extras) {
        mediaDescription$Builder.setExtras(extras);
    }
    
    public static void l(final MediaDescription$Builder mediaDescription$Builder, final Bitmap iconBitmap) {
        mediaDescription$Builder.setIconBitmap(iconBitmap);
    }
    
    public static void m(final MediaDescription$Builder mediaDescription$Builder, final Uri iconUri) {
        mediaDescription$Builder.setIconUri(iconUri);
    }
    
    public static void n(final MediaDescription$Builder mediaDescription$Builder, final String mediaId) {
        mediaDescription$Builder.setMediaId(mediaId);
    }
    
    public static void o(final MediaDescription$Builder mediaDescription$Builder, final CharSequence subtitle) {
        mediaDescription$Builder.setSubtitle(subtitle);
    }
    
    public static void p(final MediaDescription$Builder mediaDescription$Builder, final CharSequence title) {
        mediaDescription$Builder.setTitle(title);
    }
    
    public static final MediaDescriptionCompat q(final String s, final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final Bitmap bitmap, final Uri uri, final Bundle bundle, final Uri uri2) {
        return new MediaDescriptionCompat(s, charSequence, charSequence2, charSequence3, bitmap, uri, bundle, uri2);
    }
    
    public static void r(final Spannable spannable, final Object o, final int n, final int n2) {
        for (final Object o2 : spannable.getSpans(n, n2, (Class)o.getClass())) {
            if (spannable.getSpanStart(o2) == n && spannable.getSpanEnd(o2) == n2 && spannable.getSpanFlags(o2) == 33) {
                spannable.removeSpan(o2);
            }
        }
        spannable.setSpan(o, n, n2, 33);
    }
}
