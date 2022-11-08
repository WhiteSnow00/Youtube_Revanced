import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class edx implements Iterator
{
    private final boolean a;
    private final List b;
    private int c;
    private int d;
    
    public edx(final List list, int c, final int d, final boolean a) {
        this.b = new ArrayList(list);
        if (a) {
            --c;
        }
        else {
            ++c;
        }
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    private final void b() {
        int c;
        if (this.a) {
            c = this.c - 1;
        }
        else {
            c = this.c + 1;
        }
        this.c = c;
    }
    
    public final ebs a() {
        synchronized (this) {
            if (!this.hasNext()) {
                return null;
            }
            final ebs ebs = this.b.get(this.c);
            this.b();
            --this.d;
            return ebs;
        }
    }
    
    @Override
    public final boolean hasNext() {
        while (this.d > 0) {
            final int c = this.c;
            if (c < 0 || c >= this.b.size()) {
                break;
            }
            final ebs ebs = this.b.get(this.c);
            if (ebs.d().k() && !ebs.q()) {
                return true;
            }
            this.b();
        }
        return false;
    }
    
    @Override
    public final void remove() {
    }
}
