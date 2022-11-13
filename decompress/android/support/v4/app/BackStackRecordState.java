// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import java.util.List;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class BackStackRecordState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(1);
    }
    
    public BackStackRecordState(final Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = (parcel.readInt() != 0);
    }
    
    public BackStackRecordState(final av av) {
        final int size = av.d.size();
        this.a = new int[size * 6];
        if (av.j) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            int n = 0;
            while (i < size) {
                final cs cs = av.d.get(i);
                final int[] a = this.a;
                final int n2 = n + 1;
                a[n] = cs.a;
                final ArrayList b = this.b;
                final br b2 = cs.b;
                String l;
                if (b2 != null) {
                    l = b2.l;
                }
                else {
                    l = null;
                }
                b.add(l);
                final int[] a2 = this.a;
                final int n3 = n2 + 1;
                a2[n2] = (cs.c ? 1 : 0);
                final int n4 = n3 + 1;
                a2[n3] = cs.d;
                final int n5 = n4 + 1;
                a2[n4] = cs.e;
                final int n6 = n5 + 1;
                a2[n5] = cs.f;
                a2[n6] = cs.g;
                this.c[i] = cs.h.ordinal();
                this.d[i] = cs.i.ordinal();
                ++i;
                n = n6 + 1;
            }
            this.e = av.i;
            this.f = av.l;
            this.g = av.c;
            this.h = av.m;
            this.i = av.n;
            this.j = av.o;
            this.k = av.p;
            this.l = av.q;
            this.m = av.r;
            this.n = av.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList((List)this.l);
        parcel.writeStringList((List)this.m);
        parcel.writeInt((int)(this.n ? 1 : 0));
    }
}
