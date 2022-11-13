// 
// Decompiled by Procyon v0.6.0
// 

public final class adii
{
    public final adiz a;
    public final atke b;
    public int c;
    public long d;
    public ahaz e;
    
    public adii(final adiz a, final atke b) {
        this.a = a;
        this.b = b;
        this.c = Math.min(10, ((tos)a.e).d());
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
        adkp.r(adkp.z(this.a));
    }
}
