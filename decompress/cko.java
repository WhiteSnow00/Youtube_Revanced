import androidx.versionedparcelable.ParcelImpl;
import androidx.activity.result.ActivityResult;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cko implements Parcelable$Creator
{
    private final int a;
    
    public cko(final int a) {
        this.a = a;
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        if (this.a != 0) {
            return new ActivityResult(parcel);
        }
        return new ParcelImpl(parcel);
    }
    
    public final Object[] newArray(final int n) {
        if (this.a != 0) {
            return new ActivityResult[n];
        }
        return new ParcelImpl[n];
    }
}
