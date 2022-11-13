// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.upload;

import java.util.Iterator;
import android.net.Uri;
import android.os.Parcel;
import java.util.concurrent.CopyOnWriteArraySet;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class UploadFrontendIdMapHelper implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public Map a;
    public Set b;
    
    static {
        CREATOR = (Parcelable$Creator)new fzn(17);
    }
    
    public UploadFrontendIdMapHelper(final int n) {
        this.a = (Map)new ConcurrentHashMap(n);
        this.b = new CopyOnWriteArraySet();
    }
    
    public UploadFrontendIdMapHelper(final Parcel parcel) {
        final int int1 = parcel.readInt();
        this.a = (Map)new abh(int1);
        final int n = 0;
        for (int i = 0; i < int1; ++i) {
            this.a.put(parcel.readParcelable(Uri.class.getClassLoader()), parcel.readString());
        }
        final int int2 = parcel.readInt();
        this.b = new CopyOnWriteArraySet();
        for (int j = n; j < int2; ++j) {
            this.b.add(parcel.readString());
        }
    }
    
    public final String a(final Uri uri) {
        return this.a.get(uri);
    }
    
    public final void b(final String s, final adkb adkb) {
        if (!this.d(s)) {
            adkb.f(s, aphu.j);
            this.b.add(s);
        }
    }
    
    public final void c(final String s) {
        if (!this.d(s)) {
            this.b.add(s);
        }
    }
    
    public final boolean d(final String s) {
        return this.b.contains(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean e(final String s) {
        return this.a.containsValue(s);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a.size());
        for (final Map.Entry<Parcelable, V> entry : this.a.entrySet()) {
            parcel.writeParcelable((Parcelable)entry.getKey(), n);
            parcel.writeString((String)entry.getValue());
        }
        parcel.writeInt(this.b.size());
        final Iterator iterator2 = this.b.iterator();
        while (iterator2.hasNext()) {
            parcel.writeString((String)iterator2.next());
        }
    }
}
