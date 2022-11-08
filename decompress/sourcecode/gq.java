import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gq
{
    private static final Executor h;
    public final hd a;
    public final Executor b;
    public final List c;
    public List d;
    public List e;
    public int f;
    final bx g;
    
    static {
        h = (Executor)new sn(1, (byte[])null);
    }
    
    public gq(final hd a, final bx g, final byte[] array) {
        this.c = new CopyOnWriteArrayList();
        this.e = Collections.emptyList();
        this.a = a;
        this.g = g;
        this.b = gq.h;
    }
    
    public final void a() {
        for (fd fd : this.c) {}
    }
}
