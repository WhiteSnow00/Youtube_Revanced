import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adlb implements Runnable
{
    public final adld a;
    public final String b;
    public final boolean c;
    public final boolean d;
    
    public adlb(final adld a, final String b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        final adld a = this.a;
        final String b = this.b;
        final boolean c = this.c;
        final boolean d = this.d;
        final Iterator iterator = a.a.iterator();
        while (iterator.hasNext()) {
            ((adle)iterator.next()).a(b, c, d);
        }
    }
}
