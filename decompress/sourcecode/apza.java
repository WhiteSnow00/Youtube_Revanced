import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apza extends agzi implements ahax
{
    public static final apza a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(apza.class, a = new apza());
    }
    
    private apza() {
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
                if ((d = apza.d) == null) {
                    synchronized (apza.class) {
                        if (apza.d == null) {
                            apza.d = (ahbe)new agzb((agzi)apza.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apza.a;
            }
            case 4: {
                return new agza((agzi)apza.a);
            }
            case 3: {
                return new apza();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apza.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", apqr.a() });
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
