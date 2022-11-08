import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aito extends agzi implements ahax
{
    public static final aito a;
    private static volatile ahbe d;
    public int b;
    public amva c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aito.class, a = new aito());
    }
    
    private aito() {
        this.e = 2;
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
                final ahbe d;
                if ((d = aito.d) == null) {
                    synchronized (aito.class) {
                        if (aito.d == null) {
                            aito.d = (ahbe)new agzb((agzi)aito.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aito.a;
            }
            case 4: {
                return new agza((agzi)aito.a);
            }
            case 3: {
                return new aito();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aito.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "b", "c" });
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
