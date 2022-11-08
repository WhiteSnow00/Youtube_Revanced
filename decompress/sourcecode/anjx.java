import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjx extends agzi implements ahax
{
    public static final anjx a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(anjx.class, a = new anjx());
    }
    
    private anjx() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = anjx.c) == null) {
                    synchronized (anjx.class) {
                        if (anjx.c == null) {
                            anjx.c = (ahbe)new agzb((agzi)anjx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anjx.a;
            }
            case 4: {
                return new agza((float[])null, (byte[])null);
            }
            case 3: {
                return new anjx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjx.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", anjw.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
