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
        CREATOR = (Parcelable$Creator)new rix(16);
    }
    
    private Volumes() {
        this.a = new EnumMap(aprk.class);
        this.d((ubv)new ubu(this, 0));
    }
    
    public Volumes(final float n, final float n2) {
        this();
        this.a.put(aprk.b, n);
        this.a.put(aprk.c, n2);
        this.a.put(aprk.d, 0.0f);
    }
    
    public Volumes(final Volumes volumes) {
        this.a = new EnumMap(aprk.class);
        this.d((ubv)new ubt(this, volumes, 2));
    }
    
    public static Volumes c() {
        return new Volumes();
    }
    
    public static boolean g(final float n) {
        return aftw.c((double)n, -1.0, 0.008999999612569809);
    }
    
    public final float a(final aprk aprk) {
        final Float n = this.a.get(aprk);
        if (n == null) {
            tut.b("Unexpected null volume");
            return 1.0f;
        }
        return n;
    }
    
    public final float b(final aprk aprk) {
        final float a = this.a(aprk);
        if (g(a)) {
            String.valueOf(aprk);
            return 1.0f;
        }
        return a;
    }
    
    public final void d(final ubv ubv) {
        for (final aprk aprk : aprk.values()) {
            if (aprk != aprk.a) {
                ubv.a(aprk);
            }
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean e(final Volumes volumes) {
        for (final aprk aprk : aprk.values()) {
            if (aprk != aprk.a) {
                if (!aftw.c((double)this.b(aprk), (double)volumes.b(aprk), 0.008999999612569809)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean f() {
        return this.e(c());
    }
    
    public final void h(final float n, final aprk aprk) {
        if (n > 1.0f) {
            final StringBuilder sb = new StringBuilder("Ignoreing unsupported volume: ");
            sb.append(n);
            tut.g(sb.toString());
            return;
        }
        if (n < 0.0f && !g(n)) {
            tut.g("Ignoreing negative volume");
            return;
        }
        this.a.put(aprk, n);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Volumes:");
        this.d((ubv)new ubt(this, sb, 0));
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        this.d((ubv)new ubt(this, parcel, 1));
        parcel.writeInt(-1);
    }
}
