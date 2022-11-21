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
    public final akgo a;
    private List b;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(6);
    }
    
    public InfoCardCollection(final akgo a) {
        a.getClass();
        this.a = a;
    }
    
    public final CharSequence a() {
        final akgo a = this.a;
        ajws ajws;
        if ((a.b & 0x4) != 0x0) {
            if ((ajws = a.f) == null) {
                ajws = ajws.a;
            }
        }
        else {
            ajws = null;
        }
        return (CharSequence)acbu.b(ajws);
    }
    
    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList();
            final Iterator<Object> iterator = ((List<Object>)this.a.c).iterator();
            while (iterator.hasNext()) {
                akgs akgs;
                if ((akgs = iterator.next().b) == null) {
                    akgs = akgs.a;
                }
                this.b.add(new arjd(akgs));
            }
        }
        return this.b;
    }
    
    public final byte[] c() {
        akgn akgn;
        if ((akgn = this.a.h) == null) {
            akgn = akgn.a;
        }
        if ((akgn.b & 0x2) != 0x0) {
            akgn akgn2;
            if ((akgn2 = this.a.h) == null) {
                akgn2 = akgn.a;
            }
            akgr akgr;
            if ((akgr = akgn2.c) == null) {
                akgr = akgr.a;
            }
            return akgr.b.I();
        }
        return null;
    }
    
    public final byte[] d() {
        akgn akgn;
        if ((akgn = this.a.g) == null) {
            akgn = akgn.a;
        }
        if ((akgn.b & 0x2) != 0x0) {
            akgn akgn2;
            if ((akgn2 = this.a.g) == null) {
                akgn2 = akgn.a;
            }
            akgr akgr;
            if ((akgr = akgn2.c) == null) {
                akgr = akgr.a;
            }
            return akgr.b.I();
        }
        return null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        adzw.aD(parcel, (MessageLite)this.a);
    }
}
