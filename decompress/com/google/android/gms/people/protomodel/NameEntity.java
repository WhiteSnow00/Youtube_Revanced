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
        CREATOR = (Parcelable$Creator)new nlj(7);
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
        return (PersonFieldMetadata)this.a;
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
        return khl.be((Object)((Name)this).a(), (Object)name.a()) && khl.be((Object)((Name)this).b(), (Object)name.b()) && khl.be((Object)((Name)this).g(), (Object)name.g()) && khl.be((Object)((Name)this).e(), (Object)name.e()) && khl.be((Object)((Name)this).c(), (Object)name.c()) && khl.be((Object)((Name)this).f(), (Object)name.f()) && khl.be((Object)((Name)this).d(), (Object)name.d());
    }
    
    public final String f() {
        return this.f;
    }
    
    public final String g() {
        return this.c;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { ((Name)this).a(), ((Name)this).b(), ((Name)this).g(), ((Name)this).e(), ((Name)this).c(), ((Name)this).f(), ((Name)this).d() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.af(parcel, 2, (Parcelable)this.a, n);
        khl.ag(parcel, 3, this.b);
        khl.ag(parcel, 4, this.g);
        khl.ag(parcel, 5, this.d);
        khl.ag(parcel, 6, this.e);
        khl.ag(parcel, 7, this.f);
        khl.ag(parcel, 17, this.c);
        khl.N(parcel, m);
    }
}
