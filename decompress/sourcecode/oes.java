import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oes
{
    private final int a;
    private final int b;
    private final int c;
    
    public oes(final int n, final int b, final int c) {
        this.a = -2032180703;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof oes)) {
            return false;
        }
        final oes oes = (oes)o;
        return this.b() == oes.b() && this.a() == oes.a() && this.c() == oes.c();
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new int[] { this.b(), this.a(), this.c() });
    }
    
    @Override
    public String toString() {
        final int b = this.b();
        final int a = this.a();
        final int c = this.c();
        final StringBuilder sb = new StringBuilder("java_hash=");
        sb.append(b);
        sb.append(",feature_hash=");
        sb.append(a);
        sb.append(",res=");
        sb.append(c);
        return sb.toString();
    }
}
