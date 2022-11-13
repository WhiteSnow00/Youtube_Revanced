// 
// Decompiled by Procyon v0.6.0
// 

public final class aemr
{
    public final aezp a;
    private final aezp b;
    private final aezp c;
    private final aezp d;
    private final aezp e;
    private final aezp f;
    
    public aemr() {
    }
    
    public aemr(final aezp b, final aezp c, final aezp d, final aezp a, final aezp e, final aezp f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aemr) {
            final aemr aemr = (aemr)o;
            if (this.b.equals((Object)aemr.b) && this.c.equals((Object)aemr.c) && this.d.equals((Object)aemr.d) && this.a.equals((Object)aemr.a) && this.e.equals((Object)aemr.e) && this.f.equals((Object)aemr.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0x812DBBED) * 1000003 ^ 0x4D5) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.a);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder("TikTokWorkManagerClientConfiguration{jobSchedulerJobIdRange=");
        sb.append(value);
        sb.append(", minimumLoggingLevel=");
        sb.append(value2);
        sb.append(", initializationExceptionHandler=");
        sb.append(value3);
        sb.append(", defaultProcessName=");
        sb.append(value4);
        sb.append(", useRemoteWorkManager=false, maxSchedulerLimit=");
        sb.append(value5);
        sb.append(", schedulingExceptionHandler=");
        sb.append(value6);
        sb.append("}");
        return sb.toString();
    }
}
