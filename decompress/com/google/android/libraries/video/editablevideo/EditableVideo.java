// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.video.editablevideo;

import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import android.net.Uri;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Parcel;
import java.util.List;
import com.google.android.libraries.video.media.VideoMetaData;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class EditableVideo implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final EditableVideoEdits a;
    public final VideoMetaData b;
    private final List c;
    
    static {
        CREATOR = (Parcelable$Creator)new now(17);
    }
    
    public EditableVideo(final Parcel parcel) {
        this.c = new CopyOnWriteArrayList();
        this.a = (EditableVideoEdits)parcel.readParcelable(EditableVideoEdits.class.getClassLoader());
        this.b = (VideoMetaData)parcel.readParcelable(VideoMetaData.class.getClassLoader());
    }
    
    public EditableVideo(final EditableVideoEdits a, final VideoMetaData b) {
        this.c = new CopyOnWriteArrayList();
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public EditableVideo(final VideoMetaData b, final long n, final long n2, final boolean b2) {
        this.c = new CopyOnWriteArrayList();
        b.getClass();
        this.b = b;
        this.a = new EditableVideoEdits(b, n, n2, b2);
    }
    
    public final void A(final double q, final double r) {
        final boolean b = true;
        adkp.H(q >= 0.0 && q < 1.0);
        adkp.H(r >= 0.0 && r < 1.0);
        adkp.H(q + r < 1.0 && b);
        final EditableVideoEdits a = this.a;
        a.q = q;
        a.r = r;
    }
    
    public final void B(final double o, final double p2) {
        final boolean b = true;
        adkp.H(o >= 0.0 && o < 1.0);
        adkp.H(p2 >= 0.0 && p2 < 1.0);
        adkp.H(o + p2 < 1.0 && b);
        final EditableVideoEdits a = this.a;
        a.o = o;
        a.p = p2;
    }
    
    public final void C(final String e) {
        this.a.e = e;
    }
    
    public final void D(final long n) {
        this.F(this.a.f, n);
    }
    
    public final void E(final long n) {
        this.F(n, this.a.g);
    }
    
    public final void F(long n, long max) {
        final long n2 = n;
        final long n3 = max;
        final EditableVideoEdits a = this.a;
        if (!a.a) {
            return;
        }
        final long b = a.b;
        long h = this.b.h;
        n = a.c;
        long min;
        if (n > 0L) {
            min = Math.min(h, n);
        }
        else {
            min = h;
        }
        final boolean b2 = this.a.f != n2;
        n = n2;
        if (b2) {
            n = Math.max(Math.min(n2, n3 - b), n3 - min);
        }
        final boolean b3 = this.a.g != n3;
        max = n3;
        if (b3) {
            max = Math.max(Math.min(n3, min + n), b + n);
        }
        long f = n;
        if (n < 0L) {
            f = 0L;
        }
        if (max <= h) {
            h = max;
        }
        final EditableVideoEdits a2 = this.a;
        a2.f = f;
        a2.g = h;
        if (b2) {
            this.u(0);
        }
        if (b3) {
            this.u(1);
        }
    }
    
    public final boolean G() {
        return this.a.m;
    }
    
    public final boolean H() {
        final EditableVideoEdits a = this.a;
        final Uri l = a.l;
        boolean b = false;
        if (l != null) {
            if (a.n <= 1.0E-6f) {
                if (this.N()) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean I() {
        return this.d() != 0.0 || this.a() != 0.0 || this.b() != 0.0 || this.c() != 0.0;
    }
    
    public final boolean J() {
        final String e = this.a.e;
        return e != null && !e.equals("NORMAL");
    }
    
    public final boolean K() {
        if (!this.L()) {
            if (this.a.i == 0) {
                if (!this.J() && !this.H() && !this.G() && !this.I()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean L() {
        final EditableVideoEdits a = this.a;
        final boolean h = a.h;
        boolean b = false;
        if (h) {
            if (a.f == 0L) {
                if (a.g != this.b.h) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean M() {
        return this.a.a;
    }
    
    public final boolean N() {
        final EditableVideoEdits a = this.a;
        return a.s > 1.0E-6f || a.t > 1.0E-6f;
    }
    
    public final double a() {
        return this.a.p;
    }
    
    public final double b() {
        return this.a.q;
    }
    
    public final double c() {
        return this.a.r;
    }
    
    public final double d() {
        return this.a.o;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Deprecated
    public final float e() {
        return this.a.n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EditableVideo)) {
            return false;
        }
        final EditableVideo editableVideo = (EditableVideo)o;
        return qdt.o((Object)this.b, (Object)editableVideo.b) && qdt.o((Object)this.c, (Object)editableVideo.c);
    }
    
    public final int f() {
        return this.a.i;
    }
    
    public final long g() {
        return this.a.j;
    }
    
    public final long h() {
        return this.a.c;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b });
    }
    
    public final long i() {
        return this.a.b;
    }
    
    public final long j() {
        return this.k() - this.m();
    }
    
    public final long k() {
        return this.l() / 1000L;
    }
    
    public final long l() {
        final EditableVideoEdits a = this.a;
        long n;
        if (a.h) {
            n = a.g;
        }
        else {
            n = this.b.h;
        }
        return n;
    }
    
    public final long m() {
        return this.n() / 1000L;
    }
    
    public final long n() {
        final EditableVideoEdits a = this.a;
        if (a.h) {
            return a.f;
        }
        return 0L;
    }
    
    public final Uri o() {
        return this.a.l;
    }
    
    public final String p() {
        String e;
        if ((e = this.a.e) == null) {
            e = "NORMAL";
        }
        return e;
    }
    
    public final void q(final qzg qzg) {
        this.c.add(qzg);
    }
    
    public final void r(final boolean h) {
        this.a.h = h;
    }
    
    public final void s(final Set set) {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((qzg)iterator.next()).a(this, set);
        }
    }
    
    public final void t(final Set set) {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((qzg)iterator.next()).c(this, set);
        }
    }
    
    @Override
    public final String toString() {
        return qdt.n(this.getClass().getName(), new Object[] { "videoMetaData=".concat(String.valueOf(String.valueOf(this.b))) });
    }
    
    public final void u(final int n) {
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((qzg)iterator.next()).b(this, n);
        }
    }
    
    public final void v(final qzg qzg) {
        this.c.remove(qzg);
    }
    
    public final void w(final boolean m) {
        final EditableVideoEdits a = this.a;
        if (a.m == m) {
            return;
        }
        a.m = m;
        this.u(5);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeParcelable((Parcelable)this.b, n);
    }
    
    public final void x(final long j) {
        final EditableVideoEdits a = this.a;
        if (a.j != j) {
            a.j = j;
            this.u(3);
        }
    }
    
    public final void y(final Uri l) {
        this.a.l = l;
    }
    
    @Deprecated
    public final void z(final float n) {
        final EditableVideoEdits a = this.a;
        if (a.n != n) {
            a.n = n;
            this.u(4);
        }
    }
}
