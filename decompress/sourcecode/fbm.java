import java.util.Set;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbm implements abkq
{
    private static final Duration b;
    public Duration a;
    private final absi c;
    
    static {
        b = Duration.ofSeconds(10L);
    }
    
    public fbm(final absi c) {
        this.a = fbm.b;
        this.c = c;
    }
    
    public final int a() {
        if (this.a.getSeconds() == 10L) {
            return 2131232744;
        }
        if (this.a.getSeconds() == 30L) {
            return 2131232748;
        }
        return 2131232715;
    }
    
    public final int b() {
        return 2132017266;
    }
    
    public final aexq c() {
        return aexq.k((Object)wya.c(105677));
    }
    
    public final String d() {
        return "SEEK_FORWARD_NOTIFICATION_ACTION_PLUGIN";
    }
    
    public final void f() {
        this.c.g(this.a.toMillis());
    }
    
    public final boolean j() {
        return true;
    }
    
    public final boolean k() {
        return true;
    }
}
