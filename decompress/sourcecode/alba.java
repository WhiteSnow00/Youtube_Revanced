import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alba extends agzi implements ahax
{
    public static final alba a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)alba.class, (agzi)(a = new alba()));
    }
    
    private alba() {
        this.b = 0;
        this.e = 2;
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
                final ahbe d;
                if ((d = alba.d) == null) {
                    synchronized (alba.class) {
                        if (alba.d == null) {
                            alba.d = (ahbe)new agzb((agzi)alba.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alba.a;
            }
            case 4: {
                return new agza((agzi)alba.a);
            }
            case 3: {
                return new alba();
            }
            case 2: {
                return newMessageInfo((MessageLite)alba.a, "\u0001\u0004\u0001\u0000\ue785\u2e13\ueb52\u9f6f\u0004\u0000\u0000\u0004\ue785\u2e13\u143c\u0000\ufa9b\u48a4\u143c\u0000\uf492\u4933\u143c\u0000\ueb52\u9f6f\u143c\u0000", new Object[] { "c", "b", apel.class, altc.class, ajkj.class, apet.class });
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
