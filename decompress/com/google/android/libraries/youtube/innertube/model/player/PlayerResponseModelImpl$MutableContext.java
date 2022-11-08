// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model.player;

import java.util.Map;
import android.os.Parcel;
import java.util.HashMap;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PlayerResponseModelImpl$MutableContext implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final HashMap a;
    final HashMap b;
    public final HashMap c;
    
    static {
        CREATOR = (Parcelable$Creator)new vho(1);
    }
    
    public PlayerResponseModelImpl$MutableContext() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }
    
    public final void a(final String s, final boolean b) {
        this.a.put(s, b);
    }
    
    public final void b(final String s, final long n) {
        this.b.put(s, n);
    }
    
    public final void c(final String s, final String s2) {
        this.c.put(s, s2);
    }
    
    public final boolean d(final String s) {
        return this.a.containsKey(s) && this.a.get(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final long e() {
        if (this.b.containsKey("PLAYER_RESPONSE_SOURCE_KEY")) {
            return this.b.get("PLAYER_RESPONSE_SOURCE_KEY");
        }
        return 0L;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeMap((Map)this.a);
        parcel.writeMap((Map)this.b);
        parcel.writeMap((Map)this.c);
    }
}
