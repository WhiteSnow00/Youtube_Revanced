import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlj extends agzi implements ahax
{
    public static final ahlj a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahlj.class, (agzi)(a = new ahlj()));
    }
    
    private ahlj() {
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
                final ahbe b2;
                if ((b2 = ahlj.b) == null) {
                    synchronized (ahlj.class) {
                        if (ahlj.b == null) {
                            ahlj.b = (ahbe)new agzb((agzi)ahlj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahlj.a;
            }
            case 4: {
                return new agza((agzi)ahlj.a);
            }
            case 3: {
                return new ahlj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
