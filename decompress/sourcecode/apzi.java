import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzi extends agzi implements ahax
{
    public static final apzi a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public aqsz d;
    
    static {
        agzi.registerDefaultInstance(apzi.class, a = new apzi());
    }
    
    private apzi() {
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
                if ((e = apzi.e) == null) {
                    synchronized (apzi.class) {
                        if (apzi.e == null) {
                            apzi.e = (ahbe)new agzb((agzi)apzi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apzi.a;
            }
            case 4: {
                return new agza((agzi)apzi.a);
            }
            case 3: {
                return new apzi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "b", "c", apyh.a(), "d" });
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
