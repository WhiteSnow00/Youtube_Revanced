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
    public static final afcr a;
    private static final aqqg h;
    public final wwt b;
    public final afcr c;
    public final apni d;
    public final Optional e;
    public final alff f;
    public final int g;
    
    static {
        a = afcr.q();
        h = aqqg.a;
    }
    
    public GelVisibilityUpdate(final int g, final apni apni, final afcr c, final Optional e, final alff f) {
        this.b = new wwt((long)(g - 1));
        this.g = g;
        this.d = wxc.b(apni);
        this.c = c;
        this.e = e;
        this.f = f;
    }
    
    public GelVisibilityUpdate(final Parcel parcel) {
        this.b = new wwt(parcel.readLong());
        int c;
        if ((c = alhb.c(parcel.readInt())) == 0) {
            c = 1;
        }
        this.g = c;
        this.d = (apni)uji.af(parcel, (agzi)apni.a);
        final aqqg h = GelVisibilityUpdate.h;
        final aqqg aqqg = (aqqg)uji.af(parcel, (agzi)h);
        if (((agzi)aqqg).equals((Object)h)) {
            this.e = Optional.empty();
        }
        else {
            this.e = Optional.ofNullable((Object)aqqg);
        }
        final Bundle bundle = parcel.readBundle(alff.class.getClassLoader());
        alff f;
        final alff alff = f = null;
        if (bundle != null) {
            if (!bundle.containsKey("INTERACTION_LOGGING_CLIENT_DATA_KEY")) {
                f = alff;
            }
            else {
                try {
                    f = (alff)aeda.aq(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", (MessageLite)alff.a, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {
                    zjp.c(zjo.b, zjn.l, "Exception reading the InteractionLoggingClientData from Parcel.", (Throwable)ahab);
                    f = alff;
                }
            }
        }
        this.f = f;
        final int[] intArray = parcel.createIntArray();
        final afcm afcm = new afcm();
        for (int i = 0; i < intArray.length; ++i) {
            afcm.h((Object)altx.b(intArray[i]));
        }
        this.c = afcm.g();
    }
    
    public GelVisibilityUpdate(final wwt b, final int g, final afcr c, final apni d, final Optional e, final alff f) {
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
        uji.ag((MessageLite)this.d, parcel);
        uji.ag((MessageLite)this.e.orElse((Object)GelVisibilityUpdate.h), parcel);
        final Bundle bundle = new Bundle();
        final alff f = this.f;
        if (f != null) {
            aeda.av(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", (MessageLite)f);
        }
        parcel.writeBundle(bundle);
        final int[] array = new int[this.c.size()];
        for (i = 0; i < this.c.size(); ++i) {
            array[i] = ((altx)this.c.get(i)).d;
        }
        parcel.writeIntArray(array);
    }
}
