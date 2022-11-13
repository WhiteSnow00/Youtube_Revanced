// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.data;

import android.os.Parcelable;
import android.os.Parcel;
import android.util.Log;
import android.database.CursorIndexOutOfBoundsException;
import java.util.HashMap;
import java.util.ArrayList;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import java.io.Closeable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class DataHolder extends AbstractSafeParcelable implements Closeable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    boolean i;
    private boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new mpg(10);
        final String[] array = new String[0];
        new ArrayList();
        new HashMap();
    }
    
    public DataHolder(final int a, final String[] b, final CursorWindow[] d, final int e, final Bundle f) {
        this.i = false;
        this.j = true;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final String s, final int n) {
        final Bundle c = this.c;
        if (c == null || !c.containsKey(s)) {
            throw new IllegalArgumentException("No such column: ".concat(s));
        }
        if (this.b()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (n >= 0 && n < this.h) {
            return;
        }
        throw new CursorIndexOutOfBoundsException(n, this.h);
    }
    
    public final boolean b() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public final void close() {
        monitorenter(this);
        try {
            if (!this.i) {
                this.i = true;
                int n = 0;
                while (true) {
                    final CursorWindow[] d = this.d;
                    if (n >= d.length) {
                        break;
                    }
                    d[n].close();
                    ++n;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    protected final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !this.b()) {
                this.close();
                final String string = this.toString();
                final StringBuilder sb = new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int m = khl.M(parcel);
        khl.ah(parcel, 1, this.b);
        khl.aj(parcel, 2, (Parcelable[])this.d, n);
        khl.S(parcel, 3, this.e);
        khl.V(parcel, 4, this.f);
        khl.S(parcel, 1000, this.a);
        khl.N(parcel, m);
        if ((n & 0x1) != 0x0) {
            this.close();
        }
    }
}
