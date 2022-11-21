import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class abtc implements zkv
{
    final ahcr a;
    
    public abtc(final ahcr a) {
        this.a = a;
    }
    
    public final int a() {
        return ((ajfg)this.a.instance).d;
    }
    
    public final int b() {
        return ((ajfg)this.a.instance).c;
    }
    
    public final int c() {
        return 0;
    }
    
    public final int d() {
        return (int)TimeUnit.DAYS.toMinutes(30L);
    }
}
