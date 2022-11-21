// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class FragmentState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final String l;
    public final int m;
    public final boolean n;
    
    static {
        CREATOR = (Parcelable$Creator)new aw(4);
    }
    
    public FragmentState(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.c = (int1 != 0);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (parcel.readInt() != 0);
        this.h = (parcel.readInt() != 0);
        this.i = (parcel.readInt() != 0);
        this.j = (parcel.readInt() != 0);
        this.k = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.n = (parcel.readInt() != 0 && b);
    }
    
    public FragmentState(final br br) {
        this.a = br.getClass().getName();
        this.b = br.l;
        this.c = br.u;
        this.d = br.D;
        this.e = br.E;
        this.f = br.F;
        this.g = br.I;
        this.h = br.s;
        this.i = br.H;
        this.j = br.G;
        this.k = br.W.ordinal();
        this.l = br.o;
        this.m = br.p;
        this.n = br.Q;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.e));
        }
        final String f = this.f;
        if (f != null && !f.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f);
        }
        if (this.g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.j) {
            sb.append(" hidden");
        }
        if (this.l != null) {
            sb.append(" targetWho=");
            sb.append(this.l);
            sb.append(" targetRequestCode=");
            sb.append(this.m);
        }
        if (this.n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt((int)(this.c ? 1 : 0));
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt((int)(this.g ? 1 : 0));
        parcel.writeInt((int)(this.h ? 1 : 0));
        parcel.writeInt((int)(this.i ? 1 : 0));
        parcel.writeInt((int)(this.j ? 1 : 0));
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt((int)(this.n ? 1 : 0));
    }
}
