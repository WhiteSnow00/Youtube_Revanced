// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.innertube.model;

import android.os.Parcel;
import com.google.protobuf.MessageLite;
import java.util.HashMap;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class BrowseResponseModel implements Parcelable, acbl
{
    public static final Parcelable$Creator CREATOR;
    public final akka a;
    public Object b;
    private final Map c;
    private afgh d;
    
    static {
        CREATOR = (Parcelable$Creator)new ulj(7);
    }
    
    public BrowseResponseModel(final akka a) {
        this.a = a;
        this.c = new HashMap();
    }
    
    public static BrowseResponseModel e(final byte[] array, final vmx vmx) {
        if (array == null) {
            return null;
        }
        return new BrowseResponseModel((akka)vmx.a(array, (MessageLite)akka.a));
    }
    
    public final anxa a() {
        anxa anxa;
        if ((anxa = this.a.i) == null) {
            anxa = anxa.a;
        }
        return anxa;
    }
    
    public final Object b() {
        return this.b;
    }
    
    public final void c(final Object b) {
        this.b = b;
    }
    
    public final byte[] d() {
        return this.a.j.I();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final vic f() {
        akkb akkb;
        if ((akkb = this.a.f) == null) {
            akkb = akkb.a;
        }
        if (akkb.b == 49399797) {
            akkb akkb2;
            if ((akkb2 = this.a.f) == null) {
                akkb2 = akkb.a;
            }
            aobc a;
            if (akkb2.b == 49399797) {
                a = (aobc)akkb2.c;
            }
            else {
                a = aobc.a;
            }
            return new vic(a);
        }
        return null;
    }
    
    public final afgh g() {
        if (this.d == null) {
            akkb akkb;
            if ((akkb = this.a.f) == null) {
                akkb = akkb.a;
            }
            akkj a;
            if (akkb.b == 58173949) {
                a = (akkj)akkb.c;
            }
            else {
                a = akkj.a;
            }
            this.d = (afgh)((asla)askp.U((Iterable)a.c).K((asmo)uyx.i).Z((asmn)uzb.u).aO((asmn)twx.c)).ac();
        }
        return this.d;
    }
    
    public final Object h(final String s, final Object o) {
        if (this.c.containsKey(s)) {
            return this.c.get(s);
        }
        return o;
    }
    
    public final void i(final String s, final Object o) {
        this.c.put(s, o);
    }
    
    public final boolean j() {
        return (this.a.b & 0x40) == 0x0;
    }
    
    public final byte[] k() {
        return ((ahbc)this.a).toByteArray();
    }
    
    @Override
    public final String toString() {
        final akka a = this.a;
        if (a == null) {
            return "(null)";
        }
        return ((ahcz)a).toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ume.ad((MessageLite)this.a, parcel);
    }
}
