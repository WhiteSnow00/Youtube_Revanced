import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpz implements bxi
{
    public final Deque a;
    private final bxk b;
    private int c;
    private boolean d;
    
    public bpz() {
        this.b = new bxk();
        this.a = new ArrayDeque();
        for (int i = 0; i < 2; ++i) {
            this.a.addFirst(new bpx(this));
        }
        this.c = 0;
    }
    
    public final String c() {
        throw null;
    }
    
    public final void d() {
        dk.h(this.d ^ true);
        ((bcv)this.b).clear();
        this.c = 0;
    }
    
    public final void f() {
        this.d = true;
    }
    
    public final void t(final long n) {
    }
}
