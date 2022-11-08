import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzt extends agzi implements ahax
{
    public static final akzt a;
    private static volatile ahbe b;
    private int c;
    private akzw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)akzt.class, (agzi)(a = new akzt()));
    }
    
    private akzt() {
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
                if ((b2 = akzt.b) == null) {
                    synchronized (akzt.class) {
                        if (akzt.b == null) {
                            akzt.b = (ahbe)new agzb((agzi)akzt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return akzt.a;
            }
            case 4: {
                return new agza((agzi)akzt.a);
            }
            case 3: {
                return new akzt();
            }
            case 2: {
                return newMessageInfo((MessageLite)akzt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
