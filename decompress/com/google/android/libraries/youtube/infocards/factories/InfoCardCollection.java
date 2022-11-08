// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.infocards.factories;

import com.google.protobuf.MessageLite;
import android.os.Parcel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class InfoCardCollection implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final akck a;
    private List b;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(6);
    }
    
    public InfoCardCollection(final akck a) {
        a.getClass();
        this.a = a;
    }
    
    public final CharSequence a() {
        final akck a = this.a;
        ajsq ajsq;
        if ((a.b & 0x4) != 0x0) {
            if ((ajsq = a.f) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        return (CharSequence)abyh.b(ajsq);
    }
    
    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList();
            final Iterator<Object> iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                akco akco;
                if ((akco = iterator.next().b) == null) {
                    akco = akco.a;
                }
                this.b.add(new ardu(akco));
            }
        }
        return this.b;
    }
    
    public final byte[] c() {
        akcj akcj;
        if ((akcj = this.a.h) == null) {
            akcj = akcj.a;
        }
        if ((akcj.b & 0x2) != 0x0) {
            akcj akcj2;
            if ((akcj2 = this.a.h) == null) {
                akcj2 = akcj.a;
            }
            akcn akcn;
            if ((akcn = akcj2.c) == null) {
                akcn = akcn.a;
            }
            return akcn.b.I();
        }
        return null;
    }
    
    public final byte[] d() {
        akcj akcj;
        if ((akcj = this.a.g) == null) {
            akcj = akcj.a;
        }
        if ((akcj.b & 0x2) != 0x0) {
            akcj akcj2;
            if ((akcj2 = this.a.g) == null) {
                akcj2 = akcj.a;
            }
            akcn akcn;
            if ((akcn = akcj2.c) == null) {
                akcn = akcn.a;
            }
            return akcn.b.I();
        }
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        aeda.au(parcel, (MessageLite)this.a);
    }
}
