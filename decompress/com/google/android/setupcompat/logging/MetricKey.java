// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupcompat.logging;

import android.os.Parcel;
import java.util.Arrays;
import android.app.Activity;
import android.os.Bundle;
import java.util.regex.Pattern;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MetricKey implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final Pattern a;
    private final String b;
    private final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(7);
        a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
        Pattern.compile("^([a-z]+[.])+[A-Z][a-zA-Z0-9]+");
        Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    }
    
    public MetricKey(final String b, final String c) {
        this.b = b;
        this.c = c;
    }
    
    public static Bundle a(final MetricKey metricKey) {
        aefb.e((Object)metricKey, "MetricKey cannot be null.");
        final Bundle bundle = new Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.b);
        bundle.putString("MetricKey_screenName", metricKey.c);
        return bundle;
    }
    
    public static MetricKey b(final String s, final Activity activity) {
        final String className = activity.getComponentName().getClassName();
        aefb.a(s, "MetricKey.name", 5, 30);
        aefb.c(MetricKey.a.matcher(s).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new MetricKey(s, className);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricKey)) {
            return false;
        }
        final MetricKey metricKey = (MetricKey)o;
        return aefb.p((Object)this.b, (Object)metricKey.b) && aefb.p((Object)this.c, (Object)metricKey.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
