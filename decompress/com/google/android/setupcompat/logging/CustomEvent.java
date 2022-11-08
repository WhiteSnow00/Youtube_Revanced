// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupcompat.logging;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class CustomEvent implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final long a;
    private final MetricKey b;
    private final PersistableBundle c;
    private final PersistableBundle d;
    
    static {
        CREATOR = (Parcelable$Creator)new abyl(6);
    }
    
    private CustomEvent(final long a, final MetricKey b, final PersistableBundle persistableBundle, final PersistableBundle persistableBundle2) {
        aeda.e(a >= 0L, "Timestamp cannot be negative.");
        aeda.g(b, "MetricKey cannot be null.");
        aeda.g(persistableBundle, "Bundle cannot be null.");
        aeda.e(persistableBundle.isEmpty() ^ true, "Bundle cannot be empty.");
        aeda.g(persistableBundle2, "piiValues cannot be null.");
        i(persistableBundle);
        this.a = a;
        this.b = b;
        this.c = new PersistableBundle(persistableBundle);
        this.d = new PersistableBundle(persistableBundle2);
    }
    
    public static Bundle b(final CustomEvent customEvent) {
        final Bundle bundle = new Bundle();
        bundle.putInt("CustomEvent_version", 1);
        bundle.putLong("CustomEvent_timestamp", customEvent.a());
        bundle.putBundle("CustomEvent_metricKey", MetricKey.a(customEvent.g()));
        bundle.putBundle("CustomEvent_bundleValues", aecv.a(customEvent.d()));
        bundle.putBundle("CustomEvent_pii_bundleValues", aecv.a(customEvent.c()));
        return bundle;
    }
    
    public static CustomEvent e(final MetricKey metricKey, final PersistableBundle persistableBundle) {
        aeda.e(Build$VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher.");
        return f(metricKey, persistableBundle, PersistableBundle.EMPTY);
    }
    
    public static CustomEvent f(final MetricKey metricKey, final PersistableBundle persistableBundle, final PersistableBundle persistableBundle2) {
        aeda.e(Build$VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher");
        final long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        aecv.d(persistableBundle);
        aecv.d(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }
    
    public static String h(final String s) {
        if (s.length() <= 50) {
            return s;
        }
        return String.format("%s\u2026", s.substring(0, 49));
    }
    
    private static void i(final PersistableBundle persistableBundle) {
        for (final String s : persistableBundle.keySet()) {
            aeda.a(s, "bundle key", 3, 50);
            final Object value = persistableBundle.get(s);
            if (value instanceof String) {
                aeda.e(((String)value).length() <= 50, String.format("Maximum length of string value for key='%s' cannot exceed %s.", s, 50));
            }
        }
    }
    
    public long a() {
        return this.a;
    }
    
    public PersistableBundle c() {
        return this.d;
    }
    
    public PersistableBundle d() {
        return new PersistableBundle(this.c);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomEvent)) {
            return false;
        }
        final CustomEvent customEvent = (CustomEvent)o;
        return this.a == customEvent.a && aeda.s(this.b, customEvent.b) && aecv.c(this.c, customEvent.c) && aecv.c(this.d, customEvent.d);
    }
    
    public MetricKey g() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d });
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.a);
        parcel.writeParcelable((Parcelable)this.b, n);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
