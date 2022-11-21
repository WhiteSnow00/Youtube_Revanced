import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgt implements Serializable
{
    private static final long serialVersionUID = 0L;
    final afgm a;
    
    public afgt(final afgm a) {
        this.a = a;
    }
    
    Object readResolve() {
        return this.a.e();
    }
}
