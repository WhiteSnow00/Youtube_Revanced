// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import android.util.Base64;
import android.text.TextUtils;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.os.Parcel;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import android.os.Parcelable$Creator;
import java.io.Serializable;
import android.os.Parcelable;

public class StreamConfig implements Parcelable, Serializable
{
    public static final Parcelable$Creator CREATOR;
    public int A;
    public transient apjz B;
    public transient boolean a;
    public String b;
    public String c;
    public StreamMetadata d;
    public boolean e;
    public String f;
    public int g;
    public transient aioe h;
    public transient amgq i;
    public transient amhp j;
    public transient amhy k;
    public transient aioe l;
    public transient aioe m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public double w;
    public String x;
    public String y;
    public String z;
    
    static {
        CREATOR = (Parcelable$Creator)new vho(5);
    }
    
    public StreamConfig() {
        this.q = true;
        this.t = -1;
        this.w = 0.8888888888888888;
        this.A = -1;
    }
    
    public StreamConfig(final Parcel parcel) {
        final boolean b = true;
        this.q = true;
        this.t = -1;
        this.w = 0.8888888888888888;
        this.A = -1;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (StreamMetadata)parcel.readParcelable(StreamMetadata.class.getClassLoader());
        this.e = (parcel.readByte() != 0);
        this.f = parcel.readString();
        this.g = parcel.readInt();
        final ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite != null) {
            this.h = (aioe)parcelableMessageLite.a((MessageLite)aioe.a);
        }
        final ParcelableMessageLite parcelableMessageLite2 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite2 != null) {
            this.i = (amgq)parcelableMessageLite2.a((MessageLite)amgq.a);
        }
        final ParcelableMessageLite parcelableMessageLite3 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite3 != null) {
            this.j = (amhp)parcelableMessageLite3.a((MessageLite)amhp.a);
        }
        final ParcelableMessageLite parcelableMessageLite4 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite4 != null) {
            this.k = (amhy)parcelableMessageLite4.a((MessageLite)amhy.a);
        }
        final ParcelableMessageLite parcelableMessageLite5 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite5 != null) {
            this.l = (aioe)parcelableMessageLite5.a((MessageLite)aioe.a);
        }
        final ParcelableMessageLite parcelableMessageLite6 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite6 != null) {
            this.m = (aioe)parcelableMessageLite6.a((MessageLite)aioe.a);
        }
        this.n = parcel.readLong();
        this.o = parcel.readLong();
        this.q = (parcel.readByte() != 0);
        this.p = (parcel.readByte() != 0);
        this.r = (parcel.readByte() != 0);
        this.s = (parcel.readByte() != 0 && b);
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readDouble();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readInt();
        final ParcelableMessageLite parcelableMessageLite7 = (ParcelableMessageLite)parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
        if (parcelableMessageLite7 != null) {
            this.B = (apjz)parcelableMessageLite7.a((MessageLite)apjz.a);
        }
    }
    
    public static StreamConfig a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        final byte[] decode = Base64.decode(s, 0);
        try {
            final ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(decode));
            final Object object = objectInputStream.readObject();
            objectInputStream.close();
            return (StreamConfig)object;
        }
        catch (final Exception ex) {
            trn.n("Deserialization of live stream config data from Shared Preferences failed.", (Throwable)ex);
            return null;
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.h = (aioe)xkm.aY(objectInputStream, (MessageLite)aioe.a, (Class)aioe.class);
        this.i = (amgq)xkm.aY(objectInputStream, (MessageLite)amgq.a, (Class)amgq.class);
        this.j = (amhp)xkm.aY(objectInputStream, (MessageLite)amhp.a, (Class)amhp.class);
        this.k = (amhy)xkm.aY(objectInputStream, (MessageLite)amhy.a, (Class)amhy.class);
        this.l = (aioe)xkm.aY(objectInputStream, (MessageLite)aioe.a, (Class)aioe.class);
        this.m = (aioe)xkm.aY(objectInputStream, (MessageLite)aioe.a, (Class)aioe.class);
        this.B = (apjz)xkm.aY(objectInputStream, (MessageLite)apjz.a, (Class)apjz.class);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        xkm.aZ(objectOutputStream, (MessageLite)this.h);
        xkm.aZ(objectOutputStream, (MessageLite)this.i);
        xkm.aZ(objectOutputStream, (MessageLite)this.j);
        xkm.aZ(objectOutputStream, (MessageLite)this.k);
        xkm.aZ(objectOutputStream, (MessageLite)this.l);
        xkm.aZ(objectOutputStream, (MessageLite)this.m);
        xkm.aZ(objectOutputStream, (MessageLite)this.B);
    }
    
    public final String b() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String encodeToString;
        try {
            final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        }
        catch (final IOException ex) {
            trn.n("Serialization of live stream config data to Shared Preferences failed.", (Throwable)ex);
            encodeToString = null;
        }
        return encodeToString;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable((Parcelable)this.d, 0);
        parcel.writeByte((byte)(byte)(this.e ? 1 : 0));
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.h), 0);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.i), 0);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.j), 0);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.k), 0);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.l), 0);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.m), 0);
        parcel.writeLong(this.n);
        parcel.writeLong(this.o);
        parcel.writeByte((byte)(byte)(this.q ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.p ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.r ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.s ? 1 : 0));
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeDouble(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A);
        parcel.writeParcelable((Parcelable)new ParcelableMessageLite((MessageLite)this.B), 0);
    }
}
