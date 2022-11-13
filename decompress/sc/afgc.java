import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afgc extends afft
{
    public abstract Object b(final int p0);
    
    public final int c(final Object[] array, final int n) {
        return ((afeh)((afeh)this).g()).c(array, n);
    }
    
    public final afeq h() {
        return new afgb(this);
    }
    
    public /* bridge */ Iterator iterator() {
        return this.k();
    }
    
    public afke k() {
        return (afke)((afeh)this).g().D();
    }
}
