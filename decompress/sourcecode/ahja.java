import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahja extends agzi implements ahax
{
    public static final ahja a;
    private static volatile ahbe g;
    public int b;
    public aorm c;
    public ajsq d;
    public aioe e;
    public agyc f;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)ahja.class, (agzi)(a = new ahja()));
    }
    
    private ahja() {
        this.i = 2;
        this.f = agyc.b;
    }
    
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
                if ((g = ahja.g) == null) {
                    synchronized (ahja.class) {
                        if (ahja.g == null) {
                            ahja.g = (ahbe)new agzb((agzi)ahja.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahja.a;
            }
            case 4: {
                return new agza((agzi)ahja.a);
            }
            case 3: {
                return new ahja();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahja.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
