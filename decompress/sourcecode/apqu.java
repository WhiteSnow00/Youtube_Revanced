import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqu extends agzi implements ahax
{
    public static final apqu a;
    private static volatile ahbe b;
    private int c;
    private ahfw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apqu.class, (agzi)(a = new apqu()));
    }
    
    private apqu() {
        this.e = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apqu.b) == null) {
                    synchronized (apqu.class) {
                        if (apqu.b == null) {
                            apqu.b = (ahbe)new agzb((agzi)apqu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apqu.a;
            }
            case 4: {
                return new agza((agzi)apqu.a);
            }
            case 3: {
                return new apqu();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqu.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
