import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amib extends ahcz implements aheo
{
    public static final amib a;
    private static volatile ahev o;
    public int b;
    public ajsw c;
    public amzq d;
    public aicv e;
    public antf f;
    public anbz g;
    public ajtb h;
    public ahui i;
    public amic j;
    public aneh k;
    public ansx l;
    public anya m;
    public anyv n;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(amib.class, a = new amib());
    }
    
    private amib() {
        this.p = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev o3;
                if ((o3 = amib.o) == null) {
                    synchronized (amib.class) {
                        if (amib.o == null) {
                            amib.o = (ahev)new ahcs((ahcz)amib.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return amib.a;
            }
            case 4: {
                return new ahcr((ahcz)amib.a);
            }
            case 3: {
                return new amib();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amib.a, "\u0001\f\u0000\u0001\u0003\uee52\u55a0\f\u0000\u0000\u0001\u0003\u1009\f\u0004\u1009\r\u0005\u1009\u000e\u0006\u1009\u000f\u0007\u1009\u0010\uf988\u4273\u1009\u0001\ue99c\u45c4\u1409\u0002\ufe95\u4808\u1009\u0005\uee53\u4b15\u1009\u0007\ue0b1\u4b5d\u1009\u0006\ue536\u51a1\u1009\b\uee52\u55a0\u1009\n", new Object[] { "b", "j", "k", "l", "m", "n", "c", "d", "e", "g", "f", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
