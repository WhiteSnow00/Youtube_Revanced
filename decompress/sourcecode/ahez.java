import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahez extends agzi implements ahax
{
    public static final ahez a;
    private static volatile ahbe b;
    private int c;
    private afpe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahez.class, a = new ahez());
    }
    
    private ahez() {
        this.e = 2;
        emptyIntList();
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
                if ((b2 = ahez.b) == null) {
                    synchronized (ahez.class) {
                        if (ahez.b == null) {
                            ahez.b = (ahbe)new agzb((agzi)ahez.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahez.a;
            }
            case 4: {
                return new agza((agzi)ahez.a);
            }
            case 3: {
                return new ahez();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahez.a, "\u0001\u0001\u0000\u0001%%\u0001\u0000\u0000\u0001%\u1409\u0003", new Object[] { "c", "d" });
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
