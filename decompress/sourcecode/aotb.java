import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotb extends agzi implements ahax
{
    public static final aotb a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aotb.class, a = new aotb());
    }
    
    private aotb() {
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
                if ((c = aotb.c) == null) {
                    synchronized (aotb.class) {
                        if (aotb.c == null) {
                            aotb.c = (ahbe)new agzb((agzi)aotb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aotb.a;
            }
            case 4: {
                return new agza((agzi)aotb.a);
            }
            case 3: {
                return new aotb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aotc.b });
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
