import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfr extends agzi implements ahax
{
    public static final amfr a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amfr.class, (agzi)(a = new amfr()));
    }
    
    private amfr() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b2 = amfr.b) == null) {
                    synchronized (amfr.class) {
                        if (amfr.b == null) {
                            amfr.b = (ahbe)new agzb((agzi)amfr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return amfr.a;
            }
            case 4: {
                return new agza((agzi)amfr.a);
            }
            case 3: {
                return new amfr();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfr.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
