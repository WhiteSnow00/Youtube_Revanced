// 
// Decompiled by Procyon v0.6.0
// 

final class aash implements Runnable
{
    final double a;
    final double b;
    final String c;
    final aasi d;
    
    public aash(final aasi d, final double a, final double b, final String c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final yzz m = this.d.m;
        final double a = this.a;
        final double b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(":");
        sb.append(b);
        sb.append(":");
        sb.append(c);
        ((yzu)m).a(sb.toString());
    }
}
