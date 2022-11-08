import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfk extends agzi implements ahax
{
    public static final aqfk a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aqfk.class, (agzi)(a = new aqfk()));
    }
    
    private aqfk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aqfk.c) == null) {
                    synchronized (aqfk.class) {
                        if (aqfk.c == null) {
                            aqfk.c = (ahbe)new agzb((agzi)aqfk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqfk.a;
            }
            case 4: {
                return new agza((agzi)aqfk.a);
            }
            case 3: {
                return new aqfk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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
