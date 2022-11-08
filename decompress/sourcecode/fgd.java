// 
// Decompiled by Procyon v0.6.0
// 

public final class fgd implements wyz
{
    private final int a;
    
    public fgd(final int a) {
        this.a = a;
    }
    
    public final wyy a(final wzd wzd) {
        final int a = this.a;
        if (a == 0) {
            return new fgk(wzd);
        }
        if (a == 1) {
            return new fgf(wzd, null);
        }
        if (a == 2) {
            return new fgf(wzd);
        }
        if (a == 4) {
            return new fgi(wzd);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(" type is not support");
        throw new IllegalStateException(sb.toString());
    }
}
