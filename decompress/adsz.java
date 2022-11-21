// 
// Decompiled by Procyon v0.6.0
// 

public final class adsz
{
    public final afxj a;
    public final afxk b;
    public final afxj c;
    public final afxj d;
    public final afxj e;
    private final afxj f;
    
    public adsz() {
    }
    
    public adsz(final afxj a, final afxk b, final afxj c, final afxj f, final afxj d, final afxj e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adsz) {
            final adsz adsz = (adsz)o;
            if (this.a.equals(adsz.a) && this.b.equals(adsz.b) && this.c.equals(adsz.c) && this.f.equals(adsz.f) && this.d.equals(adsz.d) && this.e.equals(adsz.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.f);
        final String value5 = String.valueOf(this.d);
        final String value6 = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder("LiveSharingExecutors{internalExecutor=");
        sb.append(value);
        sb.append(", heartbeatExecutor=");
        sb.append(value2);
        sb.append(", coWatchingDelegateExecutor=");
        sb.append(value3);
        sb.append(", coDoingDelegateExecutor=");
        sb.append(value4);
        sb.append(", outgoingIpcExecutor=");
        sb.append(value5);
        sb.append(", incomingIpcExecutor=");
        sb.append(value6);
        sb.append("}");
        return sb.toString();
    }
}
