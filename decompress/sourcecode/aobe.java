import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobe extends agzi implements ahax
{
    public static final aobe a;
    private static volatile ahbe b;
    private int c;
    private aobn d;
    private aobd e;
    private aobd f;
    private aioe g;
    private aioe h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aobe.class, a = new aobe());
    }
    
    private aobe() {
        this.i = 2;
        emptyProtobufList();
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
                final ahbe b2;
                if ((b2 = aobe.b) == null) {
                    synchronized (aobe.class) {
                        if (aobe.b == null) {
                            aobe.b = (ahbe)new agzb((agzi)aobe.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aobe.a;
            }
            case 4: {
                return new agza((agzi)aobe.a);
            }
            case 3: {
                return new aobe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobe.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
