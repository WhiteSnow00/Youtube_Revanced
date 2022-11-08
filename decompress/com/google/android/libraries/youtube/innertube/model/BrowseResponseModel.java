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

public class BrowseResponseModel implements Parcelable, abxy
{
    public static final Parcelable$Creator CREATOR;
    public final akfw a;
    public Object b;
    private final Map c;
    private afcr d;
    
    static {
        CREATOR = (Parcelable$Creator)new uik(7);
    }
    
    public BrowseResponseModel(final akfw a) {
        this.a = a;
        this.c = new HashMap();
    }
    
    public static BrowseResponseModel e(final byte[] array, final vjl vjl) {
        if (array == null) {
            return null;
        }
        return new BrowseResponseModel((akfw)vjl.a(array, (MessageLite)akfw.a));
    }
    
    public final ansr a() {
        ansr ansr;
        if ((ansr = this.a.i) == null) {
            ansr = ansr.a;
        }
        return ansr;
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
    
    public final veu f() {
        akfx akfx;
        if ((akfx = this.a.f) == null) {
            akfx = akfx.a;
        }
        if (akfx.b == 49399797) {
            akfx akfx2;
            if ((akfx2 = this.a.f) == null) {
                akfx2 = akfx.a;
            }
            anws a;
            if (akfx2.b == 49399797) {
                a = (anws)akfx2.c;
            }
            else {
                a = anws.a;
            }
            return new veu(a);
        }
        return null;
    }
    
    public final afcr g() {
        if (this.d == null) {
            akfx akfx;
            if ((akfx = this.a.f) == null) {
                akfx = akfx.a;
            }
            akgf a;
            if (akfx.b == 58173949) {
                a = (akgf)akfx.c;
            }
            else {
                a = akgf.a;
            }
            this.d = (afcr)((ashp)ashe.R((Iterable)a.c).J((asjd)uvw.i).W((asjc)uwd.r).aI((asjc)sjx.u)).ab();
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
        return ((agxl)this.a).toByteArray();
    }
    
    @Override
    public final String toString() {
        final akfw a = this.a;
        if (a == null) {
            return "(null)";
        }
        return ((agzi)a).toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        uji.ag((MessageLite)this.a, parcel);
    }
}
