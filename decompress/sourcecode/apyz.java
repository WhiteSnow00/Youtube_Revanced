import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyz extends agzi implements ahax
{
    public static final apyz a;
    private static volatile ahbe d;
    public int b;
    public ajph c;
    
    static {
        agzi.registerDefaultInstance(apyz.class, a = new apyz());
    }
    
    private apyz() {
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
                if ((d = apyz.d) == null) {
                    synchronized (apyz.class) {
                        if (apyz.d == null) {
                            apyz.d = (ahbe)new agzb((agzi)apyz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apyz.a;
            }
            case 4: {
                return new agza((agzi)apyz.a);
            }
            case 3: {
                return new apyz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
