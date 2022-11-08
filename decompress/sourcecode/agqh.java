import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqh extends agzi implements ahax
{
    public static final agqh a;
    private static volatile ahbe e;
    public int b;
    public agqg c;
    public agqi d;
    
    static {
        agzi.registerDefaultInstance(agqh.class, a = new agqh());
    }
    
    private agqh() {
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
                if ((e = agqh.e) == null) {
                    synchronized (agqh.class) {
                        if (agqh.e == null) {
                            agqh.e = (ahbe)new agzb((agzi)agqh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqh.a;
            }
            case 4: {
                return new agza((agzi)agqh.a);
            }
            case 3: {
                return new agqh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
