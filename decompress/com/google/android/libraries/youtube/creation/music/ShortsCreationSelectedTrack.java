// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.music;

import android.os.Parcel;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ShortsCreationSelectedTrack implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final byte[] a;
    
    static {
        a = new byte[0];
        CREATOR = (Parcelable$Creator)new rhy(17);
    }
    
    public static ubk r() {
        final ubk ubk = new ubk((byte[])null);
        ubk.h(0L);
        ubk.h = (aezp)aeyo.a;
        ubk.g(15000L);
        ubk.f(15000L);
        ubk.j(false);
        ubk.d(false);
        return ubk;
    }
    
    public static ShortsCreationSelectedTrack s(final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand) {
        final ubk r = r();
        r.i(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.c);
        r.e(false);
        r.a = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.d;
        r.h(tpe.bL(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand));
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 0x8) != 0x0) {
            aiqj b;
            if ((b = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.g) == null) {
                b = aiqj.a;
            }
            r.b = b;
        }
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 0x4) != 0x0) {
            aobi aobi;
            if ((aobi = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e) == null) {
                aobi = aobi.a;
            }
            if ((aobi.b & 0x1) != 0x0) {
                aobi aobi2;
                if ((aobi2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e) == null) {
                    aobi2 = aobi.a;
                }
                aotp d;
                if ((d = aobi2.c) == null) {
                    d = aotp.a;
                }
                r.d = d;
            }
            final aobi e = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
            aobi a;
            if (e == null) {
                a = aobi.a;
            }
            else {
                a = e;
            }
            if ((a.b & 0x2) != 0x0) {
                aobi a2;
                if ((a2 = e) == null) {
                    a2 = aobi.a;
                }
                r.f = a2.d;
            }
            return r.a();
        }
        return r.a();
    }
    
    public static ShortsCreationSelectedTrack t(final aoep aoep) {
        final ubk r = r();
        r.i(aoep.c);
        if ((aoep.b & 0x2) != 0x0) {
            aotp d;
            if ((d = aoep.d) == null) {
                d = aotp.a;
            }
            r.d = d;
        }
        if ((aoep.b & 0x4) != 0x0) {
            r.f = aoep.e;
        }
        r.e(false);
        r.a = aoep.g;
        if ((aoep.b & 0x40) != 0x0) {
            aiqj b;
            if ((b = aoep.h) == null) {
                b = aiqj.a;
            }
            r.b = b;
        }
        r.h(tpe.bN(aoep));
        return r.a();
    }
    
    public static ShortsCreationSelectedTrack u(final arbc arbc) {
        final ubk r = r();
        r.i(arbc.c);
        arbb arbb;
        if ((arbb = arbc.e) == null) {
            arbb = arbb.a;
        }
        if ((arbb.b & 0x2) != 0x0) {
            arbb arbb2;
            if ((arbb2 = arbc.e) == null) {
                arbb2 = arbb.a;
            }
            aotp d;
            if ((d = arbb2.d) == null) {
                d = aotp.a;
            }
            r.d = d;
        }
        final arbb e = arbc.e;
        arbb a;
        if (e == null) {
            a = arbb.a;
        }
        else {
            a = e;
        }
        if ((a.b & 0x1) != 0x0) {
            arbb a2;
            if ((a2 = e) == null) {
                a2 = arbb.a;
            }
            r.f = a2.c;
        }
        if ((arbc.b & 0x10) != 0x0) {
            aiqj b;
            if ((b = arbc.g) == null) {
                b = aiqj.a;
            }
            r.b = b;
        }
        r.e(false);
        r.h(tpe.bO(arbc));
        r.a = arbc.f;
        r.d(true);
        return r.a();
    }
    
    public abstract long a();
    
    public abstract long b();
    
    public abstract long c();
    
    public abstract Uri d();
    
    public final int describeContents() {
        return 0;
    }
    
    public abstract ubk e();
    
    public abstract aezp f();
    
    public abstract aezp g();
    
    public abstract aiqj h();
    
    public abstract aiqj i();
    
    public abstract aoek j();
    
    public abstract aotp k();
    
    public abstract String l();
    
    public abstract String m();
    
    public abstract String n();
    
    public abstract boolean o();
    
    public abstract boolean p();
    
    public abstract boolean q();
    
    public final void writeToParcel(final Parcel parcel, int length) {
        parcel.writeString(this.n());
        parcel.writeLong(this.c());
        parcel.writeInt((int)(this.p() ? 1 : 0));
        parcel.writeString(this.l());
        byte[] array;
        if (this.k() == null) {
            array = ShortsCreationSelectedTrack.a;
        }
        else {
            array = ((agzk)this.k()).toByteArray();
        }
        parcel.writeByteArray(array);
        parcel.writeString(this.m());
        final Uri d = this.d();
        final int n = 0;
        parcel.writeParcelable((Parcelable)d, 0);
        long longValue;
        if (this.f().h()) {
            longValue = (long)this.f().c();
        }
        else {
            longValue = -1L;
        }
        parcel.writeLong(longValue);
        if (this.g().h()) {
            length = ((byte[])this.g().c()).length;
        }
        else {
            length = -1;
        }
        parcel.writeInt(length);
        if (this.g().h()) {
            parcel.writeByteArray((byte[])this.g().c());
        }
        if (this.i() != null) {
            length = 1;
        }
        else {
            length = 0;
        }
        parcel.writeInt(length);
        if (this.i() != null) {
            parcel.writeByteArray(((agzk)this.i()).toByteArray());
        }
        length = n;
        if (this.h() != null) {
            length = 1;
        }
        parcel.writeInt(length);
        if (this.h() != null) {
            parcel.writeByteArray(((agzk)this.h()).toByteArray());
        }
    }
}
