import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknw extends agzi implements ahax
{
    public static final aknw a;
    private static volatile ahbe e;
    public int b;
    public Object c;
    public akjf d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aknw.class, a = new aknw());
    }
    
    private aknw() {
        this.b = 0;
        this.g = 2;
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
                final ahbe e;
                if ((e = aknw.e) == null) {
                    synchronized (aknw.class) {
                        if (aknw.e == null) {
                            aknw.e = (ahbe)new agzb((agzi)aknw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aknw.a;
            }
            case 4: {
                return new agza((agzi)aknw.a);
            }
            case 3: {
                return new aknw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknw.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u143c\u0000\u0004\u143c\u0000", new Object[] { "c", "b", "f", "d", aioe.class, aioe.class });
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
