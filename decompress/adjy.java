// 
// Decompiled by Procyon v0.6.0
// 

public final class adjy
{
    public final adkp a;
    public final atnb b;
    public int c;
    public long d;
    public ahcr e;
    
    public adjy(final adkp a, final atnb b) {
        this.a = a;
        this.b = b;
        this.c = Math.min(10, ((tpt)a.e).d());
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
        adme.i(adme.q(this.a));
    }
}
