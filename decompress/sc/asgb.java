import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asgb implements arwm
{
    public static final ThreadLocal a;
    public final ahdd b;
    public final MessageLite c;
    
    static {
        a = new ThreadLocal();
    }
    
    public asgb(final MessageLite c) {
        this.c = c;
        this.b = c.getParserForType();
    }
}
