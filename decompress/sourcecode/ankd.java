import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankd extends agzi implements ahax
{
    public static final ankd a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ankd.class, a = new ankd());
    }
    
    private ankd() {
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
                if ((c = ankd.c) == null) {
                    synchronized (ankd.class) {
                        if (ankd.c == null) {
                            ankd.c = (ahbe)new agzb((agzi)ankd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ankd.a;
            }
            case 4: {
                return new agza((float[][][])null, (short[])null);
            }
            case 3: {
                return new ankd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankd.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", anke.class });
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
