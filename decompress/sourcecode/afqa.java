import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqa extends agzi implements ahax
{
    public static final afqa a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(afqa.class, a = new afqa());
    }
    
    private afqa() {
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
                if ((c = afqa.c) == null) {
                    synchronized (afqa.class) {
                        if (afqa.c == null) {
                            afqa.c = (ahbe)new agzb((agzi)afqa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return afqa.a;
            }
            case 4: {
                return new agza((agzi)afqa.a);
            }
            case 3: {
                return new afqa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afqa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aeih.s });
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
