import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appy extends agzi implements ahax
{
    public static final appy a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)appy.class, (agzi)(a = new appy()));
    }
    
    private appy() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = appy.d) == null) {
                    synchronized (appy.class) {
                        if (appy.d == null) {
                            appy.d = (ahbe)new agzb((agzi)appy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appy.a;
            }
            case 4: {
                return new agza((agzi)appy.a);
            }
            case 3: {
                return new appy();
            }
            case 2: {
                return newMessageInfo((MessageLite)appy.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0000", new Object[] { "b", "c" });
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
