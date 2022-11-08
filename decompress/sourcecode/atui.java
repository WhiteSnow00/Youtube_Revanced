import java.net.SocketAddress;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atui
{
    public int a;
    public int b;
    public Object c;
    
    public atui() {
        this.c = new Object[16];
    }
    
    public atui(final List c) {
        this.c = c;
    }
    
    public final boolean a() {
        return this.a == this.b;
    }
    
    public final SocketAddress b() {
        return ((List<arsk>)this.c).get(this.b).b.get(this.a);
    }
    
    public final void c() {
        this.b = 0;
        this.a = 0;
    }
}
