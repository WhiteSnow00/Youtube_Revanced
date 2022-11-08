import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appc extends agzi implements ahax
{
    public static final appc a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)appc.class, (agzi)(a = new appc()));
    }
    
    private appc() {
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
                if ((d = appc.d) == null) {
                    synchronized (appc.class) {
                        if (appc.d == null) {
                            appc.d = (ahbe)new agzb((agzi)appc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appc.a;
            }
            case 4: {
                return new agza((agzi)appc.a);
            }
            case 3: {
                return new appc();
            }
            case 2: {
                return newMessageInfo((MessageLite)appc.a, "\u0001\u0001\u0001\u0000\uf189\u383b\uf189\u383b\u0001\u0000\u0000\u0001\uf189\u383b\u143c\u0000", new Object[] { "c", "b", appm.class });
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
