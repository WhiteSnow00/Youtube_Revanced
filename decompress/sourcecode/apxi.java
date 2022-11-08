import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxi extends agzi implements ahax
{
    public static final apxi a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(apxi.class, a = new apxi());
    }
    
    private apxi() {
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
                if ((d = apxi.d) == null) {
                    synchronized (apxi.class) {
                        if (apxi.d == null) {
                            apxi.d = (ahbe)new agzb((agzi)apxi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxi.a;
            }
            case 4: {
                return new agza((agzi)apxi.a);
            }
            case 3: {
                return new apxi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxi.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", apsc.p });
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
