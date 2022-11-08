import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivw extends agzi implements ahax
{
    public static final aivw a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aivw.class, a = new aivw());
    }
    
    private aivw() {
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
                if ((c = aivw.c) == null) {
                    synchronized (aivw.class) {
                        if (aivw.c == null) {
                            aivw.c = (ahbe)new agzb((agzi)aivw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aivw.a;
            }
            case 4: {
                return new agza((agzi)aivw.a);
            }
            case 3: {
                return new aivw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aipt.k });
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
