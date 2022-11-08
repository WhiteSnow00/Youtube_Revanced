// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.base.api;

import java.util.Arrays;
import com.google.protobuf.MessageLite;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ParcelableProtoLite implements Parcelable
{
    public byte[] a;
    
    public ParcelableProtoLite() {
        this.a = null;
    }
    
    protected ParcelableProtoLite(final Parcel parcel) {
        this.a = null;
        this.b(parcel);
    }
    
    public ParcelableProtoLite(final byte[] a) {
        this.a = a;
    }
    
    public final int a() {
        final byte[] a = this.a;
        if (a == null) {
            return 0;
        }
        return a.length;
    }
    
    public final void b(final Parcel parcel) {
        if (this.d()) {
            parcel.readInt();
        }
        this.a = parcel.createByteArray();
    }
    
    public final void c(final MessageLite messageLite) {
        if (messageLite != null && messageLite.getSerializedSize() != 0) {
            this.a = messageLite.toByteArray();
            return;
        }
        this.a = null;
    }
    
    protected boolean d() {
        return false;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    protected boolean e() {
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof ParcelableProtoLite) {
                if (!Arrays.equals(((ParcelableProtoLite)o).a, this.a)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public String toString() {
        final int a = this.a();
        final StringBuilder sb = new StringBuilder("ParcelableProtoLite[");
        sb.append(a);
        sb.append(" bytes]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int length) {
        if (this.d()) {
            final byte[] a = this.a;
            if (a == null) {
                length = 0;
            }
            else {
                length = a.length;
            }
            parcel.writeInt(length);
        }
        final byte[] a2 = this.a;
        if (a2 == null && this.e()) {
            parcel.writeByteArray(new byte[0]);
            return;
        }
        parcel.writeByteArray(a2);
    }
}
