import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alsr extends agzi implements ahax
{
    public static final alsr a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(alsr.class, a = new alsr());
    }
    
    private alsr() {
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
                if ((c = alsr.c) == null) {
                    synchronized (alsr.class) {
                        if (alsr.c == null) {
                            alsr.c = (ahbe)new agzb((agzi)alsr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alsr.a;
            }
            case 4: {
                return new agza((agzi)alsr.a);
            }
            case 3: {
                return new alsr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alsr.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
