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
    public final akes a;
    private final long b;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(11);
    }
    
    public AdBreakResponseModel(final akes a, final long b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public final ahiv a() {
        if (this.a.c.size() == 0) {
            return null;
        }
        for (final aket aket : this.a.c) {
            if (aket.b == 84813246) {
                return (ahiv)aket.c;
            }
        }
        return null;
    }
    
    public final List b() {
        final ArrayList list = new ArrayList();
        if (this.a.c.size() == 0) {
            return list;
        }
        final Iterator<Object> iterator = this.a.c.iterator();
        ahiv a;
        aket aket;
        do {
            final Object d = list;
            if (!iterator.hasNext()) {
                return (List)d;
            }
            aket = iterator.next();
            if (aket.b == 84813246) {
                a = (ahiv)aket.c;
            }
            else {
                a = ahiv.a;
            }
        } while (a.d.size() <= 0);
        ahiv a2;
        if (aket.b == 84813246) {
            a2 = (ahiv)aket.c;
        }
        else {
            a2 = ahiv.a;
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
        aeda.au(parcel, (MessageLite)this.a);
        parcel.writeLong(this.b);
    }
}
