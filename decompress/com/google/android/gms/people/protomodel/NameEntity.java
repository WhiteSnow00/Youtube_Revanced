// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class NameEntity extends AbstractSafeParcelable implements Name
{
    public static final Parcelable$Creator CREATOR;
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(8);
    }
    
    public NameEntity(final PersonFieldMetadataEntity a, final String b, final String c, final String d, final String e, final String f, final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final PersonFieldMetadata a() {
        return this.a;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final String c() {
        return this.e;
    }
    
    public final String d() {
        return this.g;
    }
    
    public final String e() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Name)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final Name name = (Name)o;
        return kgk.ba((Object)this.a(), (Object)name.a()) && kgk.ba((Object)this.b(), (Object)name.b()) && kgk.ba((Object)this.g(), (Object)name.g()) && kgk.ba((Object)this.e(), (Object)name.e()) && kgk.ba((Object)this.c(), (Object)name.c()) && kgk.ba((Object)this.f(), (Object)name.f()) && kgk.ba((Object)this.d(), (Object)name.d());
    }
    
    public final String f() {
        return this.f;
    }
    
    public final String g() {
        return this.c;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a(), this.b(), this.g(), this.e(), this.c(), this.f(), this.d() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ab(parcel, 2, (Parcelable)this.a, n);
        kgk.ac(parcel, 3, this.b);
        kgk.ac(parcel, 4, this.g);
        kgk.ac(parcel, 5, this.d);
        kgk.ac(parcel, 6, this.e);
        kgk.ac(parcel, 7, this.f);
        kgk.ac(parcel, 17, this.c);
        kgk.J(parcel, i);
    }
}
