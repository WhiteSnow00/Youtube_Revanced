// 
// Decompiled by Procyon v0.6.0
// 

public final class gmv
{
    public final boolean a;
    private final long b;
    
    public gmv() {
    }
    
    public gmv(final boolean a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gmv) {
            final gmv gmv = (gmv)o;
            if (this.a == gmv.a && this.b == gmv.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        final long b = this.b;
        return (n ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder("DataReminderSettingsPair{dataReminderEnabled=");
        sb.append(a);
        sb.append(", dataReminderUsageThresholdBytes=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
