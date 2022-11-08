import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptl extends agzi implements ahax
{
    public static final aptl a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aptl.class, (agzi)(a = new aptl()));
    }
    
    private aptl() {
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
                if ((d = aptl.d) == null) {
                    synchronized (aptl.class) {
                        if (aptl.d == null) {
                            aptl.d = (ahbe)new agzb((agzi)aptl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptl.a;
            }
            case 4: {
                return new agza((agzi)aptl.a);
            }
            case 3: {
                return new aptl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptl.a, "\u0001\u0001\u0001\u0000\ufac9\u3c79\ufac9\u3c79\u0001\u0000\u0000\u0001\ufac9\u3c79\u143c\u0000", new Object[] { "c", "b", aptj.class });
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
