// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.database.Cursor;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class MatrixCursorParcelable implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final Cursor a;
    private final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(0);
    }
    
    public MatrixCursorParcelable(final Cursor a) {
        this.a = a;
        int count;
        if (a == null) {
            count = 0;
        }
        else {
            count = a.getCount();
        }
        this.b = count;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final Cursor a = this.a;
        if (a != null) {
            try {
                final int columnCount = a.getColumnCount();
                parcel.writeInt(columnCount);
                parcel.writeStringArray(this.a.getColumnNames());
                parcel.writeInt(this.b);
                this.a.moveToPosition(-1);
                while (this.a.moveToNext()) {
                    final Object[] array = new Object[columnCount];
                    int type;
                    for (i = 0; i < columnCount; ++i) {
                        type = this.a.getType(i);
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 2) {
                                    if (type != 3) {
                                        if (type == 4) {
                                            array[i] = this.a.getBlob(i);
                                        }
                                    }
                                    else {
                                        array[i] = this.a.getString(i);
                                    }
                                }
                                else {
                                    array[i] = this.a.getFloat(i);
                                }
                            }
                            else {
                                array[i] = this.a.getInt(i);
                            }
                        }
                        else {
                            array[i] = null;
                        }
                    }
                    parcel.writeArray(array);
                }
                return;
            }
            finally {
                this.a.close();
            }
        }
        parcel.writeInt(0);
        parcel.writeStringArray(new String[0]);
        parcel.writeInt(0);
    }
}
