// 
// Decompiled by Procyon v0.6.0
// 

public final class aekq
{
    public final aexq a;
    private final aexq b;
    private final aexq c;
    private final aexq d;
    private final aexq e;
    private final aexq f;
    
    public aekq() {
    }
    
    public aekq(final aexq b, final aexq c, final aexq d, final aexq a, final aexq e, final aexq f) {
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
        if (o instanceof aekq) {
            final aekq aekq = (aekq)o;
            if (this.b.equals(aekq.b) && this.c.equals(aekq.c) && this.d.equals(aekq.d) && this.a.equals(aekq.a) && this.e.equals(aekq.e) && this.f.equals(aekq.f)) {
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
