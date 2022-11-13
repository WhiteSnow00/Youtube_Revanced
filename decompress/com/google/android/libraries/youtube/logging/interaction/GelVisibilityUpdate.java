// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.logging.interaction;

import android.os.Bundle;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import android.os.Parcel;
import j$.util.Optional;
import android.os.Parcelable;

public abstract class GelVisibilityUpdate implements Parcelable
{
    public static final afeq a;
    private static final aqss h;
    public final wyu b;
    public final afeq c;
    public final appm d;
    public final Optional e;
    public final alhi f;
    public final int g;
    
    static {
        a = afeq.q();
        h = aqss.a;
    }
    
    public GelVisibilityUpdate(final int g, final appm appm, final afeq c, final Optional e, final alhi f) {
        this.b = new wyu((long)(g - 1));
        this.g = g;
        this.d = wzc.b(appm);
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    public GelVisibilityUpdate(final Parcel parcel) {
        this.b = new wyu(parcel.readLong());
        int aw;
        if ((aw = adyf.aW(parcel.readInt())) == 0) {
            aw = 1;
        }
        this.g = aw;
        this.d = (appm)vdh.bo(parcel, (ahbh)appm.a);
        final aqss h = GelVisibilityUpdate.h;
        final aqss aqss = (aqss)vdh.bo(parcel, (ahbh)h);
        if (((ahbh)aqss).equals((Object)h)) {
            this.e = Optional.empty();
        }
        else {
            this.e = Optional.ofNullable((Object)aqss);
        }
        final Bundle bundle = parcel.readBundle(alhi.class.getClassLoader());
        alhi f;
        final alhi alhi = f = null;
        if (bundle != null) {
            if (!bundle.containsKey("INTERACTION_LOGGING_CLIENT_DATA_KEY")) {
                f = alhi;
            }
            else {
                try {
                    f = (alhi)adyf.av(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", (MessageLite)alhi.a, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahca ahca) {
                    zlm.c(zll.b, zlk.l, "Exception reading the InteractionLoggingClientData from Parcel.", (Throwable)ahca);
                    f = alhi;
                }
            }
        }
        this.f = f;
        final int[] intArray = parcel.createIntArray();
        final afel afel = new afel();
        for (int i = 0; i < intArray.length; ++i) {
            afel.h(alwb.b(intArray[i]));
        }
        this.c = afel.g();
    }
    
    public GelVisibilityUpdate(final wyu b, final int g, final afeq c, final appm d, final Optional e, final alhi f) {
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeLong(this.b.a);
        parcel.writeInt(this.g - 1);
        vdh.bp((MessageLite)this.d, parcel);
        vdh.bp((MessageLite)this.e.orElse((Object)GelVisibilityUpdate.h), parcel);
        final Bundle bundle = new Bundle();
        final alhi f = this.f;
        if (f != null) {
            adyf.aA(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", (MessageLite)f);
        }
        parcel.writeBundle(bundle);
        final int[] array = new int[this.c.size()];
        for (i = 0; i < this.c.size(); ++i) {
            array[i] = ((alwb)this.c.get(i)).d;
        }
        parcel.writeIntArray(array);
    }
}
