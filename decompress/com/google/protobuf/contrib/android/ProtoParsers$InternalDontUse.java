// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protobuf.contrib.android;

import java.io.IOException;
import android.os.Parcel;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import android.os.Parcelable$Creator;

public final class ProtoParsers$InternalDontUse implements ProtoParsers$ParcelableProto
{
    public static final Parcelable$Creator CREATOR;
    private volatile byte[] a;
    private volatile MessageLite b;
    
    static {
        CREATOR = (Parcelable$Creator)new acao(20);
    }
    
    public ProtoParsers$InternalDontUse(final byte[] a, final MessageLite b) {
        boolean b2 = true;
        if (a == null) {
            b2 = (b != null && b2);
        }
        adkp.I(b2, (Object)"Must have a message or bytes");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final MessageLite a(MessageLite b, final ExtensionRegistryLite extensionRegistryLite) {
        try {
            b = this.b(b, extensionRegistryLite);
            return b;
        }
        catch (final ahca ahca) {
            throw new IllegalStateException((Throwable)ahca);
        }
    }
    
    public final MessageLite b(final MessageLite messageLite, final ExtensionRegistryLite extensionRegistryLite) {
        if (this.b == null) {
            this.b = messageLite.toBuilder().mergeFrom(this.a, extensionRegistryLite).build();
        }
        return this.b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        if (this.a == null) {
            final byte[] a = new byte[this.b.getSerializedSize()];
            try {
                this.b.writeTo(ahal.ak(a));
                this.a = a;
            }
            catch (final IOException ex) {
                throw new AssertionError((Object)ex);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
