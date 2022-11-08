import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovx extends agzi implements ahax
{
    public static final aovx a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aovx.class, a = new aovx());
    }
    
    private aovx() {
        this.h = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((b2 = aovx.b) == null) {
                    synchronized (aovx.class) {
                        if (aovx.b == null) {
                            aovx.b = (ahbe)new agzb((agzi)aovx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aovx.a;
            }
            case 4: {
                return new agza((agzi)aovx.a);
            }
            case 3: {
                return new aovx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovx.a, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0007\u1409\u0006\t\u1409\u0002", new Object[] { "c", "d", "e", "g", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
