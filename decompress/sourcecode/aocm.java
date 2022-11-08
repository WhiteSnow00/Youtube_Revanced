import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocm extends agzi implements ahax
{
    public static final aocm a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance(aocm.class, a = new aocm());
    }
    
    private aocm() {
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
                if ((d = aocm.d) == null) {
                    synchronized (aocm.class) {
                        if (aocm.d == null) {
                            aocm.d = (ahbe)new agzb((agzi)aocm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aocm.a;
            }
            case 4: {
                return new agza((agzi)aocm.a);
            }
            case 3: {
                return new aocm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
