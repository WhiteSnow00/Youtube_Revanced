import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqz extends agzi implements ahax
{
    public static final agqz a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public long d;
    
    static {
        agzi.registerDefaultInstance(agqz.class, a = new agqz());
    }
    
    private agqz() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = agqz.e) == null) {
                    synchronized (agqz.class) {
                        if (agqz.e == null) {
                            agqz.e = (ahbe)new agzb((agzi)agqz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqz.a;
            }
            case 4: {
                return new agza((agzi)agqz.a);
            }
            case 3: {
                return new agqz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001", new Object[] { "b", "c", aqkf.o, "d" });
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
