import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class abrq implements zja
{
    final ahaz a;
    
    public abrq(final ahaz a) {
        this.a = a;
    }
    
    public final int a() {
        return ((ajdi)this.a.instance).d;
    }
    
    public final int b() {
        return ((ajdi)this.a.instance).c;
    }
    
    public final int c() {
        return 0;
    }
    
    public final int d() {
        return (int)TimeUnit.DAYS.toMinutes(30L);
    }
}
