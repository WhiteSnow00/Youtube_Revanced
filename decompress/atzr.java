// 
// Decompiled by Procyon v0.6.0
// 

public final class atzr extends atzp
{
    public final Runnable a;
    
    public atzr(final Runnable a, final long n, final atzq atzq) {
        super(n, atzq);
        this.a = a;
    }
    
    public final void run() {
        try {
            this.a.run();
        }
        finally {}
    }
    
    public final String toString() {
        final String a = attu.a(this.a);
        final String b = attu.b(this.a);
        final long g = this.g;
        final atzq h = this.h;
        final StringBuilder sb = new StringBuilder("Task[");
        sb.append(a);
        sb.append("@");
        sb.append(b);
        sb.append(", ");
        sb.append(g);
        sb.append(", ");
        sb.append(h);
        sb.append("]");
        return sb.toString();
    }
}
