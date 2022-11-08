import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodx extends agzi implements ahax
{
    public static final aodx a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aodx.class, a = new aodx());
    }
    
    private aodx() {
        this.b = 0;
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
                if ((d = aodx.d) == null) {
                    synchronized (aodx.class) {
                        if (aodx.d == null) {
                            aodx.d = (ahbe)new agzb((agzi)aodx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aodx.a;
            }
            case 4: {
                return new agza((agzi)aodx.a);
            }
            case 3: {
                return new aodx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodx.a, "\u0001\u0001\u0001\u0000\uffc4\u3ccc\uffc4\u3ccc\u0001\u0000\u0000\u0001\uffc4\u3ccc\u143c\u0000", new Object[] { "c", "b", aivy.class });
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
