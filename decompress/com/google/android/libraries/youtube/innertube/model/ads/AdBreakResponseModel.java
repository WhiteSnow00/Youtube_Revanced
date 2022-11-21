// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.ads;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class AdBreakResponseModel implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final akiw a;
    private final long b;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(11);
    }
    
    public AdBreakResponseModel(final akiw a, final long b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final ahmk a() {
        if (this.a.c.size() == 0) {
            return null;
        }
        for (final akix akix : this.a.c) {
            if (akix.b == 84813246) {
                return (ahmk)akix.c;
            }
        }
        return null;
    }
    
    public final List b() {
        final ArrayList list = new ArrayList();
        if (this.a.c.size() == 0) {
            return list;
        }
        final Iterator<Object> iterator = ((List<Object>)this.a.c).iterator();
        ahmk a;
        akix akix;
        do {
            final Object d = list;
            if (!iterator.hasNext()) {
                return (List)d;
            }
            akix = iterator.next();
            if (akix.b == 84813246) {
                a = (ahmk)akix.c;
            }
            else {
                a = ahmk.a;
            }
        } while (a.d.size() <= 0);
        ahmk a2;
        if (akix.b == 84813246) {
            a2 = (ahmk)akix.c;
        }
        else {
            a2 = ahmk.a;
        }
        final Object d = a2.d;
        return (List)d;
    }
    
    public final boolean c() {
        return this.a.d;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        adzw.aD(parcel, (MessageLite)this.a);
        parcel.writeLong(this.b);
    }
}
