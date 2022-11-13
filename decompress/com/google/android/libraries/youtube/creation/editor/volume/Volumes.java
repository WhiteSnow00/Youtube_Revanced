// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.editor.volume;

import android.os.Parcel;
import java.util.EnumMap;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class Volumes implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Map a;
    
    static {
        CREATOR = (Parcelable$Creator)new rhy(16);
    }
    
    private Volumes() {
        this.a = new EnumMap(apoy.class);
        f((uar)new uaq(this));
    }
    
    public Volumes(final float n, final float n2) {
        this();
        this.a.put(apoy.b, n);
        this.a.put(apoy.c, n2);
        this.a.put(apoy.d, 0.0f);
    }
    
    public Volumes(final Volumes volumes) {
        this.a = new EnumMap(apoy.class);
        f((uar)new uap(this, volumes, 2));
    }
    
    public static Volumes b() {
        return new Volumes();
    }
    
    private static final void f(final uar uar) {
        for (final apoy apoy : apoy.values()) {
            if (apoy != apoy.a) {
                uar.a(apoy);
            }
        }
    }
    
    public final float a(final apoy apoy) {
        final Float n = this.a.get(apoy);
        if (n == null) {
            ttr.b("Unexpected null volume");
            return 1.0f;
        }
        return n;
    }
    
    public final boolean c(final Volumes volumes) {
        for (final apoy apoy : apoy.values()) {
            if (apoy != apoy.a) {
                if (!afsh.c((double)this.a(apoy), (double)volumes.a(apoy), 0.008999999612569809)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean d() {
        return this.c(b());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void e(final float n, final apoy apoy) {
        if (n > 1.0f) {
            final StringBuilder sb = new StringBuilder("Ignoreing unsupported volume: ");
            sb.append(n);
            ttr.g(sb.toString());
            return;
        }
        if (n < 0.0f) {
            ttr.g("Ignoreing negative volume");
            return;
        }
        this.a.put(apoy, n);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Volumes:");
        f((uar)new uap(this, sb, 0));
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        f((uar)new uap(this, parcel, 1));
        parcel.writeInt(-1);
    }
}
