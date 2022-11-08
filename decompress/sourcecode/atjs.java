import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atjs implements Serializable, atjm
{
    private atma a;
    private volatile Object b;
    private final Object c;
    
    public atjs(final atma a) {
        this.a = a;
        this.b = atjt.a;
        this.c = this;
    }
    
    private final Object writeReplace() {
        return new atjl(this.a());
    }
    
    @Override
    public final Object a() {
        final Object b = this.b;
        if (b != atjt.a) {
            return b;
        }
        synchronized (this.c) {
            Object b2 = this.b;
            if (b2 == atjt.a) {
                final atma a = this.a;
                a.getClass();
                b2 = a.invoke();
                this.b = b2;
                this.a = null;
            }
            return b2;
        }
    }
    
    @Override
    public final boolean b() {
        return this.b != atjt.a;
    }
    
    @Override
    public final String toString() {
        String value;
        if (this.b()) {
            value = String.valueOf(this.a());
        }
        else {
            value = "Lazy value not initialized yet.";
        }
        return value;
    }
}
