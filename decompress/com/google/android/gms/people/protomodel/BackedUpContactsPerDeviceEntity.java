// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final DeviceVersionEntity f;
    private final List g;
    private List h;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(3);
    }
    
    public BackedUpContactsPerDeviceEntity(final String a, final Long b, final List g, final String c, final Long d, final Long e, final DeviceVersionEntity f) {
        this.a = a;
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final DeviceVersion a() {
        return this.f;
    }
    
    public final Long b() {
        return this.b;
    }
    
    public final Long c() {
        return this.e;
    }
    
    public final Long d() {
        return this.d;
    }
    
    public final String e() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice)o;
        return kgk.ba((Object)this.f(), (Object)backedUpContactsPerDevice.f()) && kgk.ba((Object)this.b(), (Object)backedUpContactsPerDevice.b()) && kgk.ba((Object)this.g(), (Object)backedUpContactsPerDevice.g()) && kgk.ba((Object)this.e(), (Object)backedUpContactsPerDevice.e()) && kgk.ba((Object)this.d(), (Object)backedUpContactsPerDevice.d()) && kgk.ba((Object)this.c(), (Object)backedUpContactsPerDevice.c()) && kgk.ba((Object)this.a(), (Object)backedUpContactsPerDevice.a());
    }
    
    public final String f() {
        return this.a;
    }
    
    public final List g() {
        if (this.h == null) {
            final List g = this.g;
            if (g != null) {
                this.h = new ArrayList(g.size());
                final Iterator iterator = this.g.iterator();
                while (iterator.hasNext()) {
                    this.h.add(iterator.next());
                }
            }
        }
        return this.h;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.f(), this.b(), this.g(), this.e(), this.d(), this.c(), this.a() });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ag(parcel, 3, this.g());
        kgk.ac(parcel, 4, this.c);
        kgk.aa(parcel, 5, this.d);
        kgk.aa(parcel, 6, this.e);
        kgk.aa(parcel, 7, this.b);
        kgk.ab(parcel, 8, (Parcelable)this.f, n);
        kgk.J(parcel, i);
    }
}
