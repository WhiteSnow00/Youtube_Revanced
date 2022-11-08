// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.innertube;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.os.Parcel;
import java.util.Date;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class StreamMetadata implements Serializable, Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public transient akjp g;
    public transient akjq h;
    public Place i;
    public Date j;
    public transient ajub k;
    public int l;
    public int m;
    public int n;
    
    static {
        CREATOR = (Parcelable$Creator)new vho(6);
    }
    
    public StreamMetadata() {
        this.n = 1;
    }
    
    public StreamMetadata(final Parcel parcel) {
        this.n = 1;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Boolean)parcel.readValue(Boolean.class.getClassLoader());
        this.d = (Boolean)parcel.readValue(Boolean.class.getClassLoader());
        this.e = (Boolean)parcel.readValue(Boolean.class.getClassLoader());
        this.l = alhb.e(parcel.readInt());
        this.m = aesy.aO(parcel.readInt());
        this.f = (Boolean)parcel.readValue(Boolean.class.getClassLoader());
        final ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite != null) {
            this.g = (akjp)parcelableMessageLite.a((MessageLite)akjp.a);
        }
        final ParcelableMessageLite parcelableMessageLite2 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite2 != null) {
            this.h = (akjq)parcelableMessageLite2.a((MessageLite)akjq.a);
        }
        if ((this.n = aqql.ct(parcel.readInt())) == 0) {
            this.n = 1;
        }
        this.i = (Place)parcel.readParcelable(Place.class.getClassLoader());
        this.j = (Date)parcel.readSerializable();
        final ParcelableMessageLite parcelableMessageLite3 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite3 != null) {
            this.k = (ajub)parcelableMessageLite3.a((MessageLite)ajub.a);
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.g = (akjp)xkm.aY(objectInputStream, (MessageLite)akjp.a, (Class)akjp.class);
        this.h = (akjq)xkm.aY(objectInputStream, (MessageLite)akjq.a, (Class)akjq.class);
        this.k = (ajub)xkm.aY(objectInputStream, (MessageLite)ajub.a, (Class)ajub.class);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        xkm.aZ(objectOutputStream, (MessageLite)this.g);
        xkm.aZ(objectOutputStream, (MessageLite)this.h);
        xkm.aZ(objectOutputStream, (MessageLite)this.k);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        throw new UnsupportedOperationException("Equals is not implemented for and should not be implemented for StreamMetadata!");
    }
    
    @Override
    public final int hashCode() {
        throw new UnsupportedOperationException("hashCode is not implemented for and should not be implemented for StreamMetadata");
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue((Object)this.c);
        parcel.writeValue((Object)this.d);
        parcel.writeValue((Object)this.e);
        n = this.l;
        if (n != 0) {
            --n;
        }
        else {
            n = -1;
        }
        parcel.writeInt(n);
        n = this.m;
        if (n != 0) {
            --n;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeValue((Object)this.f);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.g), 0);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.h), 0);
        n = this.n;
        if (n != 0) {
            parcel.writeInt(n - 1);
            parcel.writeParcelable((Parcelable)this.i, 0);
            parcel.writeSerializable((Serializable)this.j);
            parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.k), 0);
            return;
        }
        throw null;
    }
}
