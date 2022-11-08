import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankj extends agzi implements ahax
{
    public static final ankj a;
    private static volatile ahbe g;
    public int b;
    public aorm c;
    public aioe d;
    public ankk e;
    public agyc f;
    private anss h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(ankj.class, a = new ankj());
    }
    
    private ankj() {
        this.j = 2;
        this.f = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ankj.g) == null) {
                    synchronized (ankj.class) {
                        if (ankj.g == null) {
                            ankj.g = (ahbe)new agzb((agzi)ankj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ankj.a;
            }
            case 4: {
                return new agza((agzi)ankj.a);
            }
            case 3: {
                return new ankj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankj.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1009\u0002\u0004\u1409\u0004\u0005\u100a\u0005\u0006\u1409\u0003", new Object[] { "b", "c", "d", "e", "i", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
