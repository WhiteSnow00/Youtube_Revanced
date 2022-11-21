// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.media.MediaDescription$Builder;
import android.os.Parcel;
import android.media.MediaDescription;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;
    public final Uri d;
    private final String e;
    private final CharSequence f;
    private final Bundle g;
    private final Uri h;
    private MediaDescription i;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(6);
    }
    
    public MediaDescriptionCompat(final String e, final CharSequence a, final CharSequence b, final CharSequence f, final Bitmap c, final Uri d, final Bundle g, final Uri h) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
    }
    
    public static MediaDescriptionCompat a(final Object o) {
        MediaDescriptionCompat q = null;
        if (o != null) {
            final MediaDescription i = (MediaDescription)o;
            final String j = dj.i(i);
            final CharSequence h = dj.h(i);
            final CharSequence g = dj.g(i);
            final CharSequence f = dj.f(i);
            final Bitmap a = dj.a(i);
            final Uri d = dj.d(i);
            final Bundle e = dj.e(i);
            Bundle a2;
            if ((a2 = e) != null) {
                a2 = eg.a(e);
            }
            Uri a3;
            if (a2 != null) {
                a3 = (Uri)a2.getParcelable("android.support.v4.media.description.MEDIA_URI");
            }
            else {
                a3 = null;
            }
            Bundle bundle = a2;
            if (a3 != null) {
                if (a2.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && a2.size() == 2) {
                    bundle = null;
                }
                else {
                    a2.remove("android.support.v4.media.description.MEDIA_URI");
                    a2.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = a2;
                }
            }
            if (a3 == null) {
                a3 = dk.a(i);
            }
            q = dj.q(j, h, g, f, a, d, bundle, a3);
            q.i = i;
        }
        return q;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.a);
        sb.append(", ");
        sb.append((Object)this.b);
        sb.append(", ");
        sb.append((Object)this.f);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        MediaDescription i;
        if ((i = this.i) == null) {
            final MediaDescription$Builder b = dj.b();
            dj.n(b, this.e);
            dj.p(b, this.a);
            dj.o(b, this.b);
            dj.j(b, this.f);
            dj.l(b, this.c);
            dj.m(b, this.d);
            dj.k(b, this.g);
            dk.b(b, this.h);
            i = dj.c(b);
            this.i = i;
        }
        i.writeToParcel(parcel, n);
    }
}
