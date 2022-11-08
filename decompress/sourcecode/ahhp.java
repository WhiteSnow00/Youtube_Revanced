import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhp extends agzi implements ahax
{
    public static final ahhp a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance(ahhp.class, a = new ahhp());
    }
    
    private ahhp() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahhp.f) == null) {
                    synchronized (ahhp.class) {
                        if (ahhp.f == null) {
                            ahhp.f = (ahbe)new agzb((agzi)ahhp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahhp.a;
            }
            case 4: {
                return new agza((agzi)ahhp.a);
            }
            case 3: {
                return new ahhp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "b", "c", ahho.b, "d", ahho.c, "e", ahho.a });
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
