import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidy extends agzi implements ahax
{
    public static final aidy a;
    private static volatile ahbe b;
    private int c;
    private amwa d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aidy.class, (agzi)(a = new aidy()));
    }
    
    private aidy() {
        this.f = 2;
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
                if ((b2 = aidy.b) == null) {
                    synchronized (aidy.class) {
                        if (aidy.b == null) {
                            aidy.b = (ahbe)new agzb((agzi)aidy.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidy.a;
            }
            case 4: {
                return new agza((agzi)aidy.a);
            }
            case 3: {
                return new aidy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}