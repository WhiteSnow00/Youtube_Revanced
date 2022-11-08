import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxu extends agzi implements ahax
{
    public static final aqxu a;
    private static volatile ahbe d;
    public int b;
    public aqvj c;
    
    static {
        agzi.registerDefaultInstance(aqxu.class, a = new aqxu());
    }
    
    private aqxu() {
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
                if ((d = aqxu.d) == null) {
                    synchronized (aqxu.class) {
                        if (aqxu.d == null) {
                            aqxu.d = (ahbe)new agzb((agzi)aqxu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqxu.a;
            }
            case 4: {
                return new agza((agzi)aqxu.a);
            }
            case 3: {
                return new aqxu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
