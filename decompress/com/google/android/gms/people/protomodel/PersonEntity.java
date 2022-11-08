// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PersonEntity extends AbstractSafeParcelable implements Person
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    
    static {
        CREATOR = (Parcelable$Creator)new njx(9);
    }
    
    public PersonEntity(final String a, final List b, final List c, final List d, final List e, final List f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final List b() {
        if (this.k == null) {
            final List f = this.f;
            if (f != null) {
                this.k = new ArrayList(f.size());
                final Iterator iterator = this.f.iterator();
                while (iterator.hasNext()) {
                    this.k.add(iterator.next());
                }
            }
        }
        return this.k;
    }
    
    public final List c() {
        if (this.i == null) {
            final List d = this.d;
            if (d != null) {
                this.i = new ArrayList(d.size());
                final Iterator iterator = this.d.iterator();
                while (iterator.hasNext()) {
                    this.i.add(iterator.next());
                }
            }
        }
        return this.i;
    }
    
    public final List d() {
        if (this.g == null) {
            final List b = this.b;
            if (b != null) {
                this.g = new ArrayList(b.size());
                final Iterator iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    this.g.add(iterator.next());
                }
            }
        }
        return this.g;
    }
    
    public final List e() {
        if (this.j == null) {
            final List e = this.e;
            if (e != null) {
                this.j = new ArrayList(e.size());
                final Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    this.j.add(iterator.next());
                }
            }
        }
        return this.j;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final Person person = (Person)o;
        return kgk.ba((Object)this.a(), (Object)person.a()) && kgk.ba((Object)this.d(), (Object)person.d()) && kgk.ba((Object)this.f(), (Object)person.f()) && kgk.ba((Object)this.c(), (Object)person.c()) && kgk.ba((Object)this.e(), (Object)person.e()) && kgk.ba((Object)this.b(), (Object)person.b());
    }
    
    public final List f() {
        if (this.h == null) {
            final List c = this.c;
            if (c != null) {
                this.h = new ArrayList(c.size());
                final Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    this.h.add(iterator.next());
                }
            }
        }
        return this.h;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a(), this.d(), this.f(), this.c(), this.e(), this.b() });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        i = kgk.I(parcel);
        kgk.ac(parcel, 2, this.a);
        kgk.ag(parcel, 4, this.d());
        kgk.ag(parcel, 5, this.f());
        kgk.ag(parcel, 9, this.b());
        kgk.ag(parcel, 11, this.c());
        kgk.ag(parcel, 13, this.e());
        kgk.J(parcel, i);
    }
}
