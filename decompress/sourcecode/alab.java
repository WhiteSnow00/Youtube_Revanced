import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alab extends agzi implements ahax
{
    public static final alab a;
    private static volatile ahbe c;
    public akjf b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)alab.class, (agzi)(a = new alab()));
    }
    
    private alab() {
        this.e = 2;
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
                final ahbe c;
                if ((c = alab.c) == null) {
                    synchronized (alab.class) {
                        if (alab.c == null) {
                            alab.c = (ahbe)new agzb((agzi)alab.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alab.a;
            }
            case 4: {
                return new agza((agzi)alab.a);
            }
            case 3: {
                return new alab();
            }
            case 2: {
                return newMessageInfo((MessageLite)alab.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
