import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyk extends agzi implements ahax
{
    public static final apyk a;
    private static volatile ahbe d;
    public int b;
    public aico c;
    
    static {
        agzi.registerDefaultInstance(apyk.class, a = new apyk());
    }
    
    private apyk() {
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
                if ((d = apyk.d) == null) {
                    synchronized (apyk.class) {
                        if (apyk.d == null) {
                            apyk.d = (ahbe)new agzb((agzi)apyk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyk.a;
            }
            case 4: {
                return new agza((agzi)apyk.a);
            }
            case 3: {
                return new apyk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
