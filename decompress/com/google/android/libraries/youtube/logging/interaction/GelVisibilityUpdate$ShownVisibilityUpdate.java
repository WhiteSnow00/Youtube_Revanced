// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.logging.interaction;

import java.util.Collection;
import java.util.List;
import j$.util.Optional;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class GelVisibilityUpdate$ShownVisibilityUpdate extends GelVisibilityUpdate
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new vjo(11);
    }
    
    public GelVisibilityUpdate$ShownVisibilityUpdate(final Parcel parcel) {
        super(parcel);
    }
    
    public GelVisibilityUpdate$ShownVisibilityUpdate(final appm appm, final Optional optional, final alhi alhi) {
        super(2, appm, GelVisibilityUpdate.a, optional, alhi);
    }
    
    public GelVisibilityUpdate$ShownVisibilityUpdate(final wzz wzz, final Optional optional, final alhi alhi) {
        final wyu wyu = new wyu(wzz.b);
        final long a = new wyu(wzz.b).a;
        int n;
        if (wyu.a(a, 5)) {
            n = 5;
        }
        else if (wyu.a(a, 2)) {
            n = 2;
        }
        else {
            n = 1;
        }
        super(wyu, n, afeq.o((Collection)new ahbr((List)wzz.b.g, alvw.a)), wzz.a, optional, alhi);
    }
    
    @Override
    public final /* bridge */ int describeContents() {
        return 0;
    }
}
