// 
// Decompiled by Procyon v0.6.0
// 

public final class adsj
{
    public int a;
    public Object b;
    public Object c;
    
    public adsj() {
    }
    
    public adsj(final byte[] array) {
        final afag a = afag.a;
        this.c = a;
        this.b = a;
    }
    
    public final adsk a() {
        final Object b = this.b;
        if (b != null) {
            final Object c = this.c;
            if (c != null) {
                final int a = this.a;
                if (a != 0) {
                    return new adsk((String)b, (String)c, a);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" meetingCode");
        }
        if (this.c == null) {
            sb.append(" meetingUrl");
        }
        if (this.a == 0) {
            sb.append(" meetingStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final String b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null meetingCode");
    }
    
    public final void c(final String c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null meetingUrl");
    }
    
    public final qwi d() {
        final int a = this.a;
        if (a != 0) {
            return new qwi((afbh)this.c, a, (afbh)this.b);
        }
        throw new IllegalStateException("Missing required properties: state");
    }
    
    public final void e(final agul agul) {
        this.b = afbh.k(agul);
    }
    
    public final void f(final String b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null group");
    }
}
