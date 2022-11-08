import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtc extends agzi implements ahax
{
    public static final agtc a;
    private static volatile ahbe d;
    public int b;
    public agtf c;
    
    static {
        agzi.registerDefaultInstance(agtc.class, a = new agtc());
    }
    
    private agtc() {
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
                if ((d = agtc.d) == null) {
                    synchronized (agtc.class) {
                        if (agtc.d == null) {
                            agtc.d = (ahbe)new agzb((agzi)agtc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agtc.a;
            }
            case 4: {
                return new agza((agzi)agtc.a);
            }
            case 3: {
                return new agtc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
