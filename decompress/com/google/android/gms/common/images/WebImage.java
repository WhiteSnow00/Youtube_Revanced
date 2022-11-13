// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.images;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Locale;
import java.util.Arrays;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class WebImage extends AbstractSafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final Uri b;
    public final int c;
    public final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(11);
    }
    
    public WebImage(final int a, final Uri b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public WebImage(final Uri uri, final int n, final int n2) {
        this(1, uri, n, n2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (n >= 0 && n2 >= 0) {
            return;
        }
        throw new IllegalArgumentException("width and height must not be negative");
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (o instanceof WebImage) {
                final WebImage webImage = (WebImage)o;
                if (khl.be((Object)this.b, (Object)webImage.b) && this.c == webImage.c && this.d == webImage.d) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.d });
    }
    
    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", this.c, this.d, this.b.toString());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.S(parcel, 1, this.a);
        khl.af(parcel, 2, (Parcelable)this.b, n);
        khl.S(parcel, 3, this.c);
        khl.S(parcel, 4, this.d);
        khl.N(parcel, m);
    }
}
