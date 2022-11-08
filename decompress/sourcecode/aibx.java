import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibx extends agzi implements ahax
{
    public static final aibx a;
    private static volatile ahbe b;
    private int c;
    private aiik d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibx.class, (agzi)(a = new aibx()));
    }
    
    private aibx() {
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
                if ((b2 = aibx.b) == null) {
                    synchronized (aibx.class) {
                        if (aibx.b == null) {
                            aibx.b = (ahbe)new agzb((agzi)aibx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aibx.a;
            }
            case 4: {
                return new agza((agzi)aibx.a);
            }
            case 3: {
                return new aibx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibx.a, "\u0001\u0001\u0000\u0001\ufd96\u2704\ufd96\u2704\u0001\u0000\u0000\u0001\ufd96\u2704\u1409\u0000", new Object[] { "c", "d" });
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
