// 
// Decompiled by Procyon v0.6.0
// 

public final class enr extends env
{
    private static volatile Long h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public enr(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", ahaz, n, 33);
    }
    
    protected final void a() {
        if (enr.h == null) {
            synchronized (enr.i) {
                if (enr.h == null) {
                    enr.h = (Long)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final ahaz g = this.g;
            final long longValue = enr.h;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            eht.b |= 0x8000000;
            eht.w = longValue;
        }
    }
}
