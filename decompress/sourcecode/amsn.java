import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsn extends agzi implements ahax
{
    public static final amsn a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(amsn.class, a = new amsn());
    }
    
    private amsn() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amsn.d) == null) {
                    synchronized (amsn.class) {
                        if (amsn.d == null) {
                            amsn.d = (ahbe)new agzb((agzi)amsn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amsn.a;
            }
            case 4: {
                return new agza((agzi)amsn.a);
            }
            case 3: {
                return new amsn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
