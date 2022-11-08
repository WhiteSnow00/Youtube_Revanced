import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyx extends agzi implements ahax
{
    public static final apyx a;
    private static volatile ahbe d;
    public int b;
    public apys c;
    
    static {
        agzi.registerDefaultInstance(apyx.class, a = new apyx());
    }
    
    private apyx() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apyx.d) == null) {
                    synchronized (apyx.class) {
                        if (apyx.d == null) {
                            apyx.d = (ahbe)new agzb((agzi)apyx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyx.a;
            }
            case 4: {
                return new agza((agzi)apyx.a);
            }
            case 3: {
                return new apyx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
