import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apip extends agzi implements ahax
{
    public static final apip a;
    private static volatile ahbe d;
    public int b;
    public apit c;
    
    static {
        agzi.registerDefaultInstance(apip.class, a = new apip());
    }
    
    private apip() {
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
                if ((d = apip.d) == null) {
                    synchronized (apip.class) {
                        if (apip.d == null) {
                            apip.d = (ahbe)new agzb((agzi)apip.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apip.a;
            }
            case 4: {
                return new agza((agzi)apip.a);
            }
            case 3: {
                return new apip();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apip.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
