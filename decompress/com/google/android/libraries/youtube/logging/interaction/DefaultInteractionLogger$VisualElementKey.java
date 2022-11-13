// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.logging.interaction;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class DefaultInteractionLogger$VisualElementKey implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final Object a;
    private final int b;
    private final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new vjo(9);
    }
    
    public DefaultInteractionLogger$VisualElementKey(final Parcel parcel) {
        this.a = parcel.readValue(Object.class.getClassLoader());
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
    
    public DefaultInteractionLogger$VisualElementKey(final Object a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (!(a instanceof DefaultInteractionLogger$VisualElementKey)) {
            return false;
        }
        final DefaultInteractionLogger$VisualElementKey defaultInteractionLogger$VisualElementKey = (DefaultInteractionLogger$VisualElementKey)a;
        if (this.c != defaultInteractionLogger$VisualElementKey.c) {
            return false;
        }
        a = this.a;
        if (a != null) {
            if (a.equals(defaultInteractionLogger$VisualElementKey.a)) {
                return this.b == defaultInteractionLogger$VisualElementKey.b;
            }
        }
        else if (defaultInteractionLogger$VisualElementKey.a == null) {
            return this.b == defaultInteractionLogger$VisualElementKey.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.b * 31 + this.c + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }
}
