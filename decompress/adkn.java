import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkn extends Exception
{
    public final aphv a;
    public final boolean b;
    public final List c;
    
    private adkn(final aphv a, final List c, final Throwable t) {
        final int ad = a.aD;
        final String message = t.getMessage();
        final StringBuilder sb = new StringBuilder("UploadProcessorException: ");
        sb.append(ad);
        sb.append("\n");
        sb.append(message);
        super(sb.toString(), t);
        this.a = a;
        this.b = false;
        this.c = c;
    }
    
    private adkn(final aphv a, final boolean b, final List c) {
        final int ad = a.aD;
        final StringBuilder sb = new StringBuilder("UploadProcessorException: ");
        sb.append(ad);
        super(sb.toString());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static adkn a(final aphv aphv) {
        return new adkn(aphv, false, (List)afeq.q());
    }
    
    public static adkn b(final aphv aphv, final Throwable t) {
        return new adkn(aphv, (List)afeq.q(), t);
    }
    
    public static adkn c(final aphv aphv, final List list) {
        return new adkn(aphv, true, list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof adkn) {
            final adkn adkn = (adkn)o;
            if (this.a == adkn.a && this.b == adkn.b && this.c.equals(adkn.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ this.c.hashCode()) + (this.b ? 1 : 0);
    }
}
