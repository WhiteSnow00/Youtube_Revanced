import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adru extends aqzm
{
    private final adot a;
    
    public adru(final adot a) {
        super((InputStream)a);
        this.a = a;
    }
    
    public final long a() {
        synchronized (this) {
            if (this.a.b()) {
                return this.a.a();
            }
            return super.a();
        }
    }
}
