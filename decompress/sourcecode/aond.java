import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aond extends agzi implements ahax
{
    public static final aond a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance((Class)aond.class, (agzi)(a = new aond()));
    }
    
    private aond() {
        this.d = 2;
        this.b = emptyProtobufList();
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
                final ahbe c;
                if ((c = aond.c) == null) {
                    synchronized (aond.class) {
                        if (aond.c == null) {
                            aond.c = (ahbe)new agzb((agzi)aond.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aond.a;
            }
            case 4: {
                return new agza((agzi)aond.a);
            }
            case 3: {
                return new aond();
            }
            case 2: {
                return newMessageInfo((MessageLite)aond.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
