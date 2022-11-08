import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocb extends agzi implements ahax
{
    public static final aocb a;
    private static volatile ahbe c;
    public agzt b;
    
    static {
        agzi.registerDefaultInstance(aocb.class, a = new aocb());
    }
    
    private aocb() {
        this.b = agzi.emptyLongList();
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
                if ((c = aocb.c) == null) {
                    synchronized (aocb.class) {
                        if (aocb.c == null) {
                            aocb.c = (ahbe)new agzb((agzi)aocb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aocb.a;
            }
            case 4: {
                return new agza((char[])null, (boolean[][])null);
            }
            case 3: {
                return new aocb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[] { "b" });
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
