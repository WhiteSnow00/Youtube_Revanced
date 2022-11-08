// 
// Decompiled by Procyon v0.6.0
// 

public final class adgg
{
    public final adgw a;
    public final atjj b;
    public int c;
    public long d;
    public agza e;
    
    public adgg(final adgw a, final atjj b) {
        this.a = a;
        this.b = b;
        this.c = Math.min(10, ((tmm)a.e).d());
    }
    
    public static String b(final Thread thread) {
        final StringBuilder sb = new StringBuilder();
        for (final StackTraceElement stackTraceElement : thread.getStackTrace()) {
            if (sb.length() + stackTraceElement.toString().length() > 2000) {
                break;
            }
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }
    
    final void a() {
        this.e = null;
        adio.m(adio.u(this.a));
    }
}
