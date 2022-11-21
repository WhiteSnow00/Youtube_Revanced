import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atuu extends CancellationException implements attj
{
    public final transient atut a;
    
    public atuu(final String s, final Throwable t, final atut a) {
        a.getClass();
        super(s);
        this.a = a;
        if (t != null) {
            this.initCause(t);
        }
    }
    
    @Override
    public final /* bridge */ Throwable a() {
        if (attt.a) {
            final String message = this.getMessage();
            message.getClass();
            return new atuu(message, this, this.a);
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof atuu) {
                final atuu atuu = (atuu)o;
                if (atqz.c(atuu.getMessage(), this.getMessage()) && atqz.c(atuu.a, this.a)) {
                    if (atqz.c(atuu.getCause(), this.getCause())) {
                        b = b;
                        return b;
                    }
                    return false;
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        if (attt.a) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    @Override
    public final int hashCode() {
        final String message = this.getMessage();
        message.getClass();
        final int hashCode = message.hashCode();
        final int hashCode2 = this.a.hashCode();
        final Throwable cause = this.getCause();
        int hashCode3;
        if (cause != null) {
            hashCode3 = cause.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final atut a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("; job=");
        sb.append(a);
        return sb.toString();
    }
}
