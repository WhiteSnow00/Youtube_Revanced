// 
// Decompiled by Procyon v0.6.0
// 

public final class atvx extends atvv
{
    public final Runnable a;
    
    public atvx(final Runnable a, final long n, final atvw atvw) {
        super(n, atvw);
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.run();
        }
        finally {}
    }
    
    @Override
    public final String toString() {
        final String a = atqc.a(this.a);
        final String b = atqc.b(this.a);
        final long g = this.g;
        final atvw h = this.h;
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
