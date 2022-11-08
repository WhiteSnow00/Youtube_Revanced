import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonk extends agzi implements ahax
{
    public static final aonk a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aonk.class, (agzi)(a = new aonk()));
    }
    
    private aonk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aonk.c) == null) {
                    synchronized (aonk.class) {
                        if (aonk.c == null) {
                            aonk.c = (ahbe)new agzb((agzi)aonk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aonk.a;
            }
            case 4: {
                return new agza((agzi)aonk.a);
            }
            case 3: {
                return new aonk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aonj.a });
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
