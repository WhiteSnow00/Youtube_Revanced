// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Fragment$SavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Bundle a;
    
    static {
        CREATOR = (Parcelable$Creator)new og(1);
    }
    
    public Fragment$SavedState(final Bundle a) {
        this.a = a;
    }
    
    public Fragment$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        final Bundle bundle = parcel.readBundle();
        this.a = bundle;
        if (classLoader != null && bundle != null) {
            bundle.setClassLoader(classLoader);
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.a);
    }
}
