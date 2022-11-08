// 
// Decompiled by Procyon v0.6.0
// 

public final class lqg
{
    private final String a;
    
    private lqg() {
        this.a = "proto";
    }
    
    public static lqg a() {
        return new lqg();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof lqg && this.a.equals(((lqg)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder("Encoding{name=\"");
        sb.append(a);
        sb.append("\"}");
        return sb.toString();
    }
}
