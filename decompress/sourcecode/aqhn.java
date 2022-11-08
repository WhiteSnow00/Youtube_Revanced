import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhn extends agzi implements ahax
{
    public static final aqhn a;
    private static volatile ahbe b;
    private int c;
    private aqho d;
    private aqho e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aqhn.class, (agzi)(a = new aqhn()));
    }
    
    private aqhn() {
        this.g = 2;
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
                if ((b2 = aqhn.b) == null) {
                    synchronized (aqhn.class) {
                        if (aqhn.b == null) {
                            aqhn.b = (ahbe)new agzb((agzi)aqhn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhn.a;
            }
            case 4: {
                return new agza((agzi)aqhn.a);
            }
            case 3: {
                return new aqhn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhn.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
