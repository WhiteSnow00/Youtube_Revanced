// 
// Decompiled by Procyon v0.6.0
// 

public final class enq extends enu
{
    private static volatile Long h;
    private static final Object i;
    
    static {
        i = new Object();
    }
    
    public enq(final emj emj, final agza agza, final int n) {
        super(emj, "EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", agza, n, 33);
    }
    
    protected final void a() {
        if (enq.h == null) {
            synchronized (enq.i) {
                if (enq.h == null) {
                    enq.h = (Long)this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            final agza g = this.g;
            final long longValue = enq.h;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            ehs.b |= 0x8000000;
            ehs.w = longValue;
        }
    }
}
