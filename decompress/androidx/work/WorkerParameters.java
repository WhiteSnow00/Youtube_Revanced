// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.HashSet;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.Set;
import java.util.UUID;

public final class WorkerParameters
{
    public UUID a;
    public cmi b;
    public Set c;
    public int d;
    public Executor e;
    public cne f;
    public cml g;
    public ajb h;
    
    public WorkerParameters(final UUID a, final cmi b, final Collection collection, final int d, final Executor e, final ajb h, final cne f, final cml g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = new HashSet(collection);
        this.d = d;
        this.e = e;
        this.h = h;
        this.f = f;
        this.g = g;
    }
}
