import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobg extends agzi implements ahax
{
    public static final aobg a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aobg.class, a = new aobg());
    }
    
    private aobg() {
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
                if ((c = aobg.c) == null) {
                    synchronized (aobg.class) {
                        if (aobg.c == null) {
                            aobg.c = (ahbe)new agzb((agzi)aobg.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aobg.a;
            }
            case 4: {
                return new agza((agzi)aobg.a);
            }
            case 3: {
                return new aobg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", anvq.s });
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
