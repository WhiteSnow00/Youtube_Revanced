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
    public cmh b;
    public Set c;
    public int d;
    public Executor e;
    public cnd f;
    public cmk g;
    public aja h;
    
    public WorkerParameters(final UUID a, final cmh b, final Collection collection, final int d, final Executor e, final aja h, final cnd f, final cmk g, final byte[] array, final byte[] array2, final byte[] array3) {
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
