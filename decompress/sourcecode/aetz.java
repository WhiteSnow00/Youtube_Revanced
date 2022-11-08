import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aetz extends agzi implements ahax
{
    public static final aetz a;
    private static volatile ahbe c;
    public agyc b;
    
    static {
        agzi.registerDefaultInstance(aetz.class, a = new aetz());
    }
    
    private aetz() {
        final agyc b = agyc.b;
        this.b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aetz.c) == null) {
                    synchronized (aetz.class) {
                        if (aetz.c == null) {
                            aetz.c = (ahbe)new agzb((agzi)aetz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aetz.a;
            }
            case 4: {
                return new agza((agzi)aetz.a);
            }
            case 3: {
                return new aetz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aetz.a, "\u0000\u0001\u0000\u0000\u000f\u000f\u0001\u0000\u0000\u0000\u000f\n", new Object[] { "b" });
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
