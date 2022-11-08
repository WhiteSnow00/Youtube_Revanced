import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrb extends agzi implements ahax
{
    public static final ahrb a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahrb.class, a = new ahrb());
    }
    
    private ahrb() {
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
                if ((c = ahrb.c) == null) {
                    synchronized (ahrb.class) {
                        if (ahrb.c == null) {
                            ahrb.c = (ahbe)new agzb((agzi)ahrb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahrb.a;
            }
            case 4: {
                return new agza((agzi)ahrb.a);
            }
            case 3: {
                return new ahrb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ahng.p });
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
