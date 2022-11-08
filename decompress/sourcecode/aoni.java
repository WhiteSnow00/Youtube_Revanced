import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoni extends agzi implements ahax
{
    public static final aoni a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aoni.class, (agzi)(a = new aoni()));
    }
    
    private aoni() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aoni.c) == null) {
                    synchronized (aoni.class) {
                        if (aoni.c == null) {
                            aoni.c = (ahbe)new agzb((agzi)aoni.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoni.a;
            }
            case 4: {
                return new agza((agzi)aoni.a);
            }
            case 3: {
                return new aoni();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoni.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aonj.b });
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
