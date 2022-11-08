import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankf extends agzi implements ahax
{
    public static final ankf a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ankf.class, a = new ankf());
    }
    
    private ankf() {
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
                if ((c = ankf.c) == null) {
                    synchronized (ankf.class) {
                        if (ankf.c == null) {
                            ankf.c = (ahbe)new agzb((agzi)ankf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ankf.a;
            }
            case 4: {
                return new agza((char[])null, (short[])null);
            }
            case 3: {
                return new ankf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankf.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ankg.class });
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
