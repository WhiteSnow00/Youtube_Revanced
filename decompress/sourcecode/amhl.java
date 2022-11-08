import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhl extends agzi implements ahax
{
    public static final amhl a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)amhl.class, (agzi)(a = new amhl()));
    }
    
    private amhl() {
        this.h = 2;
        this.c = "";
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
                if ((g = amhl.g) == null) {
                    synchronized (amhl.class) {
                        if (amhl.g == null) {
                            amhl.g = (ahbe)new agzb((agzi)amhl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amhl.a;
            }
            case 4: {
                return new agza((agzi)amhl.a);
            }
            case 3: {
                return new amhl();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
