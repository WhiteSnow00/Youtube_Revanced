import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aied extends agzi implements ahax
{
    public static final aied a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aied.class, (agzi)(a = new aied()));
    }
    
    private aied() {
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
                if ((b2 = aied.b) == null) {
                    synchronized (aied.class) {
                        if (aied.b == null) {
                            aied.b = (ahbe)new agzb((agzi)aied.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aied.a;
            }
            case 4: {
                return new agza((agzi)aied.a);
            }
            case 3: {
                return new aied();
            }
            case 2: {
                return newMessageInfo((MessageLite)aied.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "c", "d" });
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
