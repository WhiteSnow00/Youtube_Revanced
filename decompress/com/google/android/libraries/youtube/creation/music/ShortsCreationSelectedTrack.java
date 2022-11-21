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
        CREATOR = (Parcelable$Creator)new rix(17);
    }
    
    public static ucq r() {
        final ucq ucq = new ucq((byte[])null);
        ucq.h(0L);
        ucq.h = afag.a;
        ucq.g(15000L);
        ucq.f(15000L);
        ucq.j(false);
        ucq.d(false);
        ucq.e(false);
        return ucq;
    }
    
    public static ShortsCreationSelectedTrack s(final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand) {
        final ucq r = r();
        r.i(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.c);
        r.a = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.d;
        r.h(tqf.bL(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand));
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 0x8) != 0x0) {
            aisc b;
            if ((b = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.g) == null) {
                b = aisc.a;
            }
            r.b = b;
        }
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 0x4) != 0x0) {
            aodp aodp;
            if ((aodp = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e) == null) {
                aodp = aodp.a;
            }
            if ((aodp.b & 0x1) != 0x0) {
                aodp aodp2;
                if ((aodp2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e) == null) {
                    aodp2 = aodp.a;
                }
                aowb d;
                if ((d = aodp2.c) == null) {
                    d = aowb.a;
                }
                r.d = d;
            }
            final aodp e = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
            aodp a;
            if (e == null) {
                a = aodp.a;
            }
            else {
                a = e;
            }
            if ((a.b & 0x2) != 0x0) {
                aodp a2;
                if ((a2 = e) == null) {
                    a2 = aodp.a;
                }
                r.f = a2.d;
            }
            return r.a();
        }
        return r.a();
    }
    
    public static ShortsCreationSelectedTrack t(final aogw aogw) {
        final ucq r = r();
        r.i(aogw.c);
        if ((aogw.b & 0x2) != 0x0) {
            aowb d;
            if ((d = aogw.d) == null) {
                d = aowb.a;
            }
            r.d = d;
        }
        final int b = aogw.b;
        if ((b & 0x4) != 0x0) {
            r.f = aogw.e;
        }
        r.a = aogw.g;
        if ((b & 0x40) != 0x0) {
            aisc b2;
            if ((b2 = aogw.h) == null) {
                b2 = aisc.a;
            }
            r.b = b2;
        }
        r.h(tqf.bN(aogw));
        return r.a();
    }
    
    public static ShortsCreationSelectedTrack u(final ardx ardx) {
        final ucq r = r();
        r.i(ardx.c);
        ardw ardw;
        if ((ardw = ardx.e) == null) {
            ardw = ardw.a;
        }
        if ((ardw.b & 0x2) != 0x0) {
            ardw ardw2;
            if ((ardw2 = ardx.e) == null) {
                ardw2 = ardw.a;
            }
            aowb d;
            if ((d = ardw2.d) == null) {
                d = aowb.a;
            }
            r.d = d;
        }
        final ardw e = ardx.e;
        ardw a;
        if (e == null) {
            a = ardw.a;
        }
        else {
            a = e;
        }
        if ((a.b & 0x1) != 0x0) {
            ardw a2;
            if ((a2 = e) == null) {
                a2 = ardw.a;
            }
            r.f = a2.c;
        }
        if ((ardx.b & 0x10) != 0x0) {
            aisc b;
            if ((b = ardx.g) == null) {
                b = aisc.a;
            }
            r.b = b;
        }
        r.h(tqf.bO(ardx));
        r.a = ardx.f;
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
    
    public abstract ucq e();
    
    public abstract afbh f();
    
    public abstract afbh g();
    
    public abstract aisc h();
    
    public abstract aisc i();
    
    public abstract aogr j();
    
    public abstract aowb k();
    
    public abstract String l();
    
    public abstract String m();
    
    public abstract String n();
    
    public abstract boolean o();
    
    public abstract boolean p();
    
    public abstract boolean q();
    
    public final void writeToParcel(final Parcel parcel, int length) {
        parcel.writeString(this.n());
        parcel.writeLong(this.c());
        parcel.writeString(this.l());
        byte[] array;
        if (this.k() == null) {
            array = ShortsCreationSelectedTrack.a;
        }
        else {
            array = ((ahbc)this.k()).toByteArray();
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
            parcel.writeByteArray(((ahbc)this.i()).toByteArray());
        }
        length = n;
        if (this.h() != null) {
            length = 1;
        }
        parcel.writeInt(length);
        if (this.h() != null) {
            parcel.writeByteArray(((ahbc)this.h()).toByteArray());
        }
    }
}
