import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class admc extends Exception
{
    public final apkh a;
    public final boolean b;
    public final List c;
    
    private admc(final apkh a, final List c, final Throwable t) {
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
    
    private admc(final apkh a, final boolean b, final List c) {
        final int ad = a.aD;
        final StringBuilder sb = new StringBuilder("UploadProcessorException: ");
        sb.append(ad);
        super(sb.toString());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static admc a(final apkh apkh) {
        return new admc(apkh, false, afgh.q());
    }
    
    public static admc b(final apkh apkh, final Throwable t) {
        return new admc(apkh, afgh.q(), t);
    }
    
    public static admc c(final apkh apkh, final List list) {
        return new admc(apkh, true, list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof admc) {
            final admc admc = (admc)o;
            if (this.a == admc.a && this.b == admc.b && this.c.equals(admc.c)) {
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
