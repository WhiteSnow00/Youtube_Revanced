import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahby implements ahau
{
    public final ahbg a;
    public final int[] b;
    public final agyu[] c;
    public final MessageLite d;
    private final boolean e;
    
    public ahby(final ahbg a, final boolean e, final int[] b, final agyu[] c, final Object o) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        agzz.i(o, "defaultInstance");
        this.d = (MessageLite)o;
    }
    
    public final MessageLite a() {
        return this.d;
    }
    
    public final ahbg b() {
        return this.a;
    }
    
    public final boolean c() {
        return this.e;
    }
}
