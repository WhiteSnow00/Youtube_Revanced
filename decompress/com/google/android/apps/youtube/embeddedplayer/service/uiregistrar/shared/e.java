// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import java.util.Set;
import java.util.Iterator;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import android.util.SparseArray;
import android.os.Handler;

public final class e extends enz implements f
{
    public final lzi a;
    private final Handler b;
    private final SparseArray c;
    private i d;
    
    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
    }
    
    private e(final Handler b, final lzi a, final byte[] array, final byte[] array2) {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
        this.b = b;
        this.a = a;
        this.c = new SparseArray();
    }
    
    public static e e(final List list, final Handler handler, final lzi lzi) {
        final e e = new e(handler, lzi, null, null);
        final afif d = ((afcr)list).D();
        while (((Iterator)d).hasNext()) {
            final int intValue = (int)((Iterator)d).next();
            final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e e2 = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e(e, intValue, 5);
            e.c.put(intValue, (Object)e2);
            e.a.b(intValue, (Runnable)e2);
        }
        return e;
    }
    
    public final void a(final i d) {
        synchronized (this) {
            this.d = d;
        }
    }
    
    public final void b(final int n, final boolean b) {
        this.b.post((Runnable)new wqn(this, n, b, 1));
    }
    
    public final void c(final int n) {
        synchronized (this) {
            final i d = this.d;
            if (d != null) {
                try {
                    d.a(n);
                }
                catch (final RemoteException ex) {}
            }
        }
    }
    
    public final void d() {
        monitorenter(this);
        try {
            this.d = null;
            for (int i = 0; i < this.c.size(); ++i) {
                final lzi a = this.a;
                final int key = this.c.keyAt(i);
                final Runnable runnable = (Runnable)this.c.valueAt(i);
                final cgi cgi = (cgi)((SparseArray)a.a).get(key);
                if (cgi != null) {
                    ((Set)cgi.c).remove(runnable);
                }
            }
            this.c.clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    protected final boolean dispatchTransaction(int int1, final Parcel parcel, final Parcel parcel2, final int n) {
        if (int1 != 1) {
            if (int1 != 2) {
                return false;
            }
            int1 = parcel.readInt();
            final boolean k = eoa.k(parcel);
            this.enforceNoDataAvail(parcel);
            this.b(int1, k);
        }
        else {
            final IBinder strongBinder = parcel.readStrongBinder();
            Object o;
            if (strongBinder == null) {
                o = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
                if (queryLocalInterface instanceof i) {
                    o = queryLocalInterface;
                }
                else {
                    o = new g(strongBinder);
                }
            }
            this.enforceNoDataAvail(parcel);
            this.a((i)o);
        }
        parcel2.writeNoException();
        return true;
    }
}
