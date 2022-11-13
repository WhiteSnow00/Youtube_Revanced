import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iji implements ijj
{
    private final tmx a;
    private final asjr b;
    
    public iji(final tmx a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    public final asht b() {
        return this.a.d().R().L(this.b).p().ai();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof iji) {
            final iji iji = (iji)o;
            if (iji.a.equals(this.a) && iji.b.equals(this.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
