// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service;

import java.util.Set;
import java.util.Iterator;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.i;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.h;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f;
import android.os.Handler;
import java.util.List;
import android.content.Context;

public final class b
{
    public final Object a;
    public Object b;
    public Object c;
    public final Object d;
    
    public b(final Context a, final aeby d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.d = d;
    }
    
    public b(final List list, final Handler handler, final lzi d, final f b, final byte[] array, final byte[] array2) {
        this.d = d;
        this.b = b;
        this.a = new SparseArray();
        this.c = new h(handler, d, (byte[])null, (byte[])null);
        final afif d2 = ((afcr)list).D();
        while (((Iterator)d2).hasNext()) {
            final int intValue = (int)((Iterator)d2).next();
            final a a = new a(this, intValue);
            ((SparseArray)this.a).put(intValue, (Object)a);
            d.c(intValue, (j)a);
        }
        try {
            final Object c = this.c;
            if (c != null) {
                b.a((i)c);
            }
        }
        catch (final RemoteException ex) {}
    }
    
    public final void a(final int n, final boolean b) {
        synchronized (this) {
            final Object b2 = this.b;
            if (b2 != null) {
                try {
                    ((f)b2).b(n, b);
                }
                catch (final RemoteException ex) {}
            }
        }
    }
    
    public final void b() {
        monitorenter(this);
        try {
            this.c = null;
            this.b = null;
            for (int i = 0; i < ((SparseArray)this.a).size(); ++i) {
                final Object d = this.d;
                final int key = ((SparseArray)this.a).keyAt(i);
                final j j = (j)((SparseArray)this.a).valueAt(i);
                final cgi cgi = (cgi)((SparseArray)((lzi)d).a).get(key);
                if (cgi != null) {
                    ((Set)cgi.b).remove(j);
                }
            }
            ((SparseArray)this.a).clear();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
