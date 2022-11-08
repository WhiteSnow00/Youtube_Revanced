import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptm extends agzi implements ahax
{
    public static final aptm a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)aptm.class, (agzi)(a = new aptm()));
    }
    
    private aptm() {
        emptyIntList();
        this.c = "";
        emptyIntList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aptm.d) == null) {
                    synchronized (aptm.class) {
                        if (aptm.d == null) {
                            aptm.d = (ahbe)new agzb((agzi)aptm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptm.a;
            }
            case 4: {
                return new agza((agzi)aptm.a);
            }
            case 3: {
                return new aptm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptm.a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000b\u1008\t", new Object[] { "b", "c" });
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
