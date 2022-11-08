import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amuu extends agzi implements ahax
{
    public static final amuu a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public ajsq d;
    public int e;
    public int f;
    public boolean g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(amuu.class, a = new amuu());
    }
    
    private amuu() {
        this.i = 2;
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
                final ahbe h;
                if ((h = amuu.h) == null) {
                    synchronized (amuu.class) {
                        if (amuu.h == null) {
                            amuu.h = (ahbe)new agzb((agzi)amuu.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amuu.a;
            }
            case 4: {
                return new agza((agzi)amuu.a);
            }
            case 3: {
                return new amuu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amuu.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e", amuv.a(), "f", amum.a(), "g" });
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
