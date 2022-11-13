// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.scte35;

import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

public final class SpliceScheduleCommand extends SpliceCommand
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    
    static {
        CREATOR = (Parcelable$Creator)new bvm(8);
    }
    
    public SpliceScheduleCommand(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<bvp>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(bvp.a(parcel));
        }
        this.a = Collections.unmodifiableList((List<?>)list);
    }
    
    public SpliceScheduleCommand(final List list) {
        this.a = Collections.unmodifiableList((List<?>)list);
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final int size = this.a.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            bvp.c((bvp)this.a.get(i), parcel);
        }
    }
}
