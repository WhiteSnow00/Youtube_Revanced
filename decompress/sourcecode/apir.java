import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apir extends agzi implements ahax
{
    public static final apir a;
    private static volatile ahbe e;
    public int b;
    public long c;
    public agyo d;
    
    static {
        agzi.registerDefaultInstance(apir.class, a = new apir());
    }
    
    private apir() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apir.e) == null) {
                    synchronized (apir.class) {
                        if (apir.e == null) {
                            apir.e = (ahbe)new agzb((agzi)apir.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apir.a;
            }
            case 4: {
                return new agza((agzi)apir.a);
            }
            case 3: {
                return new apir();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apir.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
