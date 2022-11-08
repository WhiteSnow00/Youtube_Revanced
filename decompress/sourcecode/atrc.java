import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atrc extends CancellationException implements atpr
{
    public final transient atrb a;
    
    public atrc(final String s, final Throwable t, final atrb a) {
        a.getClass();
        super(s);
        this.a = a;
        if (t != null) {
            this.initCause(t);
        }
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof atrc) {
                final atrc atrc = (atrc)o;
                if (atnh.c(atrc.getMessage(), this.getMessage()) && atnh.c(atrc.a, this.a)) {
                    if (atnh.c(atrc.getCause(), this.getCause())) {
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
    
    public final Throwable fillInStackTrace() {
        if (atqb.a) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
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
    
    public final String toString() {
        final String string = super.toString();
        final atrb a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("; job=");
        sb.append(a);
        return sb.toString();
    }
}
