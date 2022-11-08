import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptb extends agzi implements ahax
{
    public static final aptb a;
    private static volatile ahbe d;
    public agyc b;
    public agyc c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aptb.class, (agzi)(a = new aptb()));
    }
    
    private aptb() {
        this.b = agyc.b;
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aptb.d) == null) {
                    synchronized (aptb.class) {
                        if (aptb.d == null) {
                            aptb.d = (ahbe)new agzb((agzi)aptb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptb.a;
            }
            case 4: {
                return new agza((agzi)aptb.a);
            }
            case 3: {
                return new aptb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001", new Object[] { "e", "b", "c" });
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
