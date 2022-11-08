import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqc extends agzi implements ahax
{
    public static final ahqc a;
    private static volatile ahbe e;
    public boolean b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(ahqc.class, a = new ahqc());
    }
    
    private ahqc() {
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
                if ((e = ahqc.e) == null) {
                    synchronized (ahqc.class) {
                        if (ahqc.e == null) {
                            ahqc.e = (ahbe)new agzb((agzi)ahqc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahqc.a;
            }
            case 4: {
                return new agza((agzi)ahqc.a);
            }
            case 3: {
                return new ahqc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "f", "b", "c", "d" });
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
