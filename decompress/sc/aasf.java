// 
// Decompiled by Procyon v0.6.0
// 

final class aasf implements Runnable
{
    final float a;
    final float b;
    final aasj c;
    
    public aasf(final aasj c, final float a, final float b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final aasj c = this.c;
        final float a = this.a;
        final float b = this.b;
        final yzz f = c.f;
        final int n = (int)Math.round(Math.toDegrees(a));
        final int n2 = (int)Math.round(Math.toDegrees(b));
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(":");
        sb.append(n2);
        ((yzu)f).a(sb.toString());
    }
}
