import java.util.Iterator;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auea implements Iterable
{
    public final List a;
    public int b;
    public boolean c;
    private int d;
    
    public auea() {
        this.a = new ArrayList();
        Process.myTid();
    }
    
    public final Object a(final int n) {
        return this.a.get(n);
    }
    
    public final boolean b() {
        return this.d == 0;
    }
    
    public final boolean c(final Object o) {
        if (o == null) {
            return false;
        }
        final int index = this.a.indexOf(o);
        if (index == -1) {
            return false;
        }
        if (this.b == 0) {
            this.a.remove(index);
        }
        else {
            this.c = true;
            this.a.set(index, null);
        }
        --this.d;
        return true;
    }
    
    public final void d(final Object o) {
        if (o != null) {
            if (!this.a.contains(o)) {
                this.a.add(o);
                ++this.d;
            }
        }
    }
    
    @Override
    public final Iterator iterator() {
        return new audz(this);
    }
}
