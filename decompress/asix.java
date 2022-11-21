import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asix implements arzg
{
    public static final ThreadLocal a;
    public final ahev b;
    public final MessageLite c;
    
    static {
        a = new ThreadLocal();
    }
    
    public asix(final MessageLite c) {
        this.c = c;
        this.b = c.getParserForType();
    }
}
