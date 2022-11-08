// 
// Decompiled by Procyon v0.6.0
// 

public final class atpl
{
    public final Object a;
    public final atpb b;
    public final atml c;
    public final Object d;
    public final Throwable e;
    
    public atpl(final Object a, final atpb b, final Throwable e) {
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = null;
        this.e = e;
    }
    
    public final boolean a() {
        return this.e != null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof atpl)) {
            return false;
        }
        final atpl atpl = (atpl)o;
        if (!atnh.c(this.a, atpl.a)) {
            return false;
        }
        if (!atnh.c((Object)this.b, (Object)atpl.b)) {
            return false;
        }
        final atml c = atpl.c;
        if (!atnh.c((Object)null, (Object)null)) {
            return false;
        }
        final Object d = atpl.d;
        return atnh.c((Object)null, (Object)null) && atnh.c((Object)this.e, (Object)atpl.e);
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
        final atpb b = this.b;
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
        final atpb b = this.b;
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
