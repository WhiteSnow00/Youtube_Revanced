// 
// Decompiled by Procyon v0.6.0
// 

public final class attd
{
    public final Object a;
    public final atst b;
    public final atqd c;
    public final Object d;
    public final Throwable e;
    
    public attd(final Object a, final atst b, final Throwable e) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = e;
    }
    
    public attd(final Object o, atst atst, Throwable t, final int n) {
        if ((n & 0x2) != 0x0) {
            atst = null;
        }
        if ((n & 0x10) != 0x0) {
            t = null;
        }
        this(o, atst, t);
    }
    
    public static attd b(final attd attd, atst b, Throwable e, final int n) {
        Object a;
        if ((n & 0x1) != 0x0) {
            a = attd.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = attd.b;
        }
        if ((n & 0x4) != 0x0) {
            final atqd c = attd.c;
        }
        if ((n & 0x8) != 0x0) {
            final Object d = attd.d;
        }
        if ((n & 0x10) != 0x0) {
            e = attd.e;
        }
        return new attd(a, b, e);
    }
    
    public final boolean a() {
        return this.e != null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof attd)) {
            return false;
        }
        final attd attd = (attd)o;
        if (!atqz.c(this.a, attd.a)) {
            return false;
        }
        if (!atqz.c(this.b, attd.b)) {
            return false;
        }
        final atqd c = attd.c;
        if (!atqz.c(null, null)) {
            return false;
        }
        final Object d = attd.d;
        return atqz.c(null, null) && atqz.c(this.e, attd.e);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final atst b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Throwable e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 29791 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Object a = this.a;
        final atst b = this.b;
        final Throwable e = this.e;
        final StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(a);
        sb.append(", cancelHandler=");
        sb.append(b);
        sb.append(", onCancellation=null, idempotentResume=null, cancelCause=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
}
