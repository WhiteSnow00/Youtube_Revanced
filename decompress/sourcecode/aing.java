import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aing extends agzi implements ahax
{
    public static final aing a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aing.class, a = new aing());
    }
    
    private aing() {
        this.c = "";
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
                if ((d = aing.d) == null) {
                    synchronized (aing.class) {
                        if (aing.d == null) {
                            aing.d = (ahbe)new agzb((agzi)aing.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aing.a;
            }
            case 4: {
                return new agza((agzi)aing.a);
            }
            case 3: {
                return new aing();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aing.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
