import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiep extends agzi implements ahax
{
    public static final aiep a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aiep.class, (agzi)(a = new aiep()));
    }
    
    private aiep() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aiep.c) == null) {
                    synchronized (aiep.class) {
                        if (aiep.c == null) {
                            aiep.c = (ahbe)new agzb((agzi)aiep.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiep.a;
            }
            case 4: {
                return new agza((agzi)aiep.a);
            }
            case 3: {
                return new aiep();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiep.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aicj.f });
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
