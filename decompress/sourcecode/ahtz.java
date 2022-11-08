import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtz extends agzi implements ahax
{
    public static final ahtz a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahtz.class, a = new ahtz());
    }
    
    private ahtz() {
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
                if ((c = ahtz.c) == null) {
                    synchronized (ahtz.class) {
                        if (ahtz.c == null) {
                            ahtz.c = (ahbe)new agzb((agzi)ahtz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahtz.a;
            }
            case 4: {
                return new agza((agzi)ahtz.a);
            }
            case 3: {
                return new ahtz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtz.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahtv.class });
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
