// 
// Decompiled by Procyon v0.6.0
// 

package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Parcel;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class ParcelableFuture implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final afik f;
    public final int a;
    public boolean b;
    aexq c;
    public Object d;
    public Object e;
    private Throwable g;
    private aekk h;
    
    static {
        f = afik.m("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
        CREATOR = (Parcelable$Creator)new abyl(11);
    }
    
    public ParcelableFuture(final int a, final Object d, final ListenableFuture listenableFuture) {
        this.c = aewp.a;
        this.a = a;
        this.d = d;
        afva.w(listenableFuture, aesm.f((afsz)new aekj(this)), (Executor)afsl.a);
    }
    
    public ParcelableFuture(final Parcel parcel) {
        this.c = aewp.a;
        final ClassLoader classLoader = this.getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            final int int1 = parcel.readInt();
            this.c = aexq.k((Object)int1);
            if (int1 == 1) {
                this.b = true;
                this.e = parcel.readValue(classLoader);
                this.g = (Throwable)parcel.readValue(classLoader);
            }
        }
        catch (final RuntimeException g) {
            ((afii)((afii)((afii)((afig)ParcelableFuture.f).g()).i((Throwable)g)).j("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).s("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = g;
        }
    }
    
    private static void d(final Object o, final Parcel parcel) {
        final int dataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(o);
        }
        catch (final RuntimeException ex) {
            parcel.setDataPosition(dataPosition);
            c.i(((afig)ParcelableFuture.f).g(), "Result lost due to non-parcelable type.", "com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", '\u00ee', "ParcelableFuture.java", (Throwable)ex);
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(o.getClass()))), ex);
        }
    }
    
    public final void a() {
        final aekk h = this.h;
        if (h != null) {
            final Throwable g = this.g;
            if (g != null) {
                final FuturesMixinViewModel futuresMixinViewModel = (FuturesMixinViewModel)h;
                futuresMixinViewModel.a.execute(aesm.h((Runnable)new aecw(futuresMixinViewModel, this, g, 5)));
                return;
            }
            final Object e = this.e;
            final FuturesMixinViewModel futuresMixinViewModel2 = (FuturesMixinViewModel)h;
            futuresMixinViewModel2.a.execute(aesm.h((Runnable)new aecw(futuresMixinViewModel2, this, e, 4)));
        }
    }
    
    public final void b(final Throwable g) {
        this.g = g;
        this.b = true;
        this.a();
    }
    
    final void c(final aekk h) {
        this.h = h;
        if (h != null && this.b) {
            this.a();
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final Object d = this.d;
        String string = "";
        String string2;
        if (d != null) {
            final String name = d.getClass().getName();
            final StringBuilder sb = new StringBuilder("input=");
            sb.append(name);
            sb.append(";");
            string2 = sb.toString();
        }
        else {
            string2 = "";
        }
        final Object e = this.e;
        String string3;
        if (e != null) {
            final String name2 = e.getClass().getName();
            final StringBuilder sb2 = new StringBuilder("result=");
            sb2.append(name2);
            sb2.append(";");
            string3 = sb2.toString();
        }
        else {
            string3 = "";
        }
        final Throwable g = this.g;
        if (g != null) {
            final String name3 = g.getClass().getName();
            final StringBuilder sb3 = new StringBuilder("error=");
            sb3.append(name3);
            sb3.append(";");
            string = sb3.toString();
        }
        final StringBuilder sb4 = new StringBuilder("ParcelableFuture(");
        sb4.append(string2);
        sb4.append(string3);
        sb4.append(string);
        sb4.append(")");
        return sb4.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        parcel.writeInt(this.a);
        n = 1;
        try {
            d(this.d, parcel);
        }
        catch (final RuntimeException ex) {
            parcel.writeValue((Object)null);
            this.b = true;
            this.g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", ex);
            this.e = null;
        }
        if (!this.b) {
            n = 2;
        }
        parcel.writeInt(n);
        if (this.b) {
            try {
                d(this.e, parcel);
            }
            catch (final RuntimeException ex2) {
                parcel.writeValue((Object)null);
                this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", ex2);
            }
            try {
                d(this.g, parcel);
            }
            catch (final RuntimeException ex3) {
                d(this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.g))), ex3), parcel);
            }
        }
    }
}
