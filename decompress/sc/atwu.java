// 
// Decompiled by Procyon v0.6.0
// 

public final class atwu extends atws
{
    public final Runnable a;
    
    public atwu(final Runnable a, final long n, final atwt atwt) {
        super(n, atwt);
        this.a = a;
    }
    
    public final void run() {
        try {
            this.a.run();
        }
        finally {}
    }
    
    public final String toString() {
        final String a = atqx.a((Object)this.a);
        final String b = atqx.b((Object)this.a);
        final long g = this.g;
        final atwt h = this.h;
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
