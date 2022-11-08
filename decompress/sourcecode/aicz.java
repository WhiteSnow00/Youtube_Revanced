import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicz extends agzi implements ahax
{
    public static final aicz a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public Object d;
    public aorm e;
    public int f;
    public int g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)aicz.class, (agzi)(a = new aicz()));
    }
    
    private aicz() {
        this.c = 0;
        this.i = 2;
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
                final ahbe h;
                if ((h = aicz.h) == null) {
                    synchronized (aicz.class) {
                        if (aicz.h == null) {
                            aicz.h = (ahbe)new agzb((agzi)aicz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aicz.a;
            }
            case 4: {
                return new agza((agzi)aicz.a);
            }
            case 3: {
                return new aicz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aicz.a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u1409\u0002\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u143c\u0000", new Object[] { "d", "c", "b", aorm.class, "e", "f", "g", aicv.class });
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
