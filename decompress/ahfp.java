import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahfp implements ahel
{
    public final ahex a;
    public final int[] b;
    public final ahcl[] c;
    public final MessageLite d;
    private final boolean e;
    
    public ahfp(final ahex a, final boolean e, final int[] b, final ahcl[] c, final Object o) {
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
        ahdq.i(o, "defaultInstance");
        this.d = (MessageLite)o;
    }
    
    public final MessageLite a() {
        return this.d;
    }
    
    public final ahex b() {
        return this.a;
    }
    
    public final boolean c() {
        return this.e;
    }
}
