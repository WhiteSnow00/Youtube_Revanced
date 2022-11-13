// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.audioswap.model;

import java.util.Iterator;
import java.util.Arrays;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class CategorySelection implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public CharSequence a;
    public List b;
    
    static {
        CREATOR = (Parcelable$Creator)new rhy(18);
    }
    
    public CategorySelection(final Parcel parcel) {
        this.a = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = new ArrayList();
        for (int int1 = parcel.readInt(), i = 0; i < int1; ++i) {
            final byte[] array = new byte[parcel.readInt()];
            parcel.readByteArray(array);
            final ahaz builder = ((ahbh)ahwn.a).createBuilder();
            try {
                ((agzj)builder).mergeFrom(array, ExtensionRegistryLite.getGeneratedRegistry());
                this.b.add(builder.build());
            }
            catch (final ahca ahca) {
                ttr.d("Cannot deserialize AudioTracksCategoryRenderer from stored proto byte[] in parcel. Safely ignoring.", (Throwable)ahca);
            }
        }
    }
    
    public CategorySelection(final CharSequence a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this != o) {
            if (o instanceof CategorySelection) {
                final CharSequence a = this.a;
                final CategorySelection categorySelection = (CategorySelection)o;
                if (a.equals(categorySelection.a)) {
                    if (this.b.equals(categorySelection.b)) {
                        b = b;
                        return b;
                    }
                    return false;
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        parcel.writeInt(this.b.size());
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            final byte[] byteArray = ((agzk)iterator.next()).toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        }
    }
}
