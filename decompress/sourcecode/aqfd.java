import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfd extends agzi implements ahax
{
    public static final aqfd a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance((Class)aqfd.class, (agzi)(a = new aqfd()));
    }
    
    private aqfd() {
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
                if ((d = aqfd.d) == null) {
                    synchronized (aqfd.class) {
                        if (aqfd.d == null) {
                            aqfd.d = (ahbe)new agzb((agzi)aqfd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqfd.a;
            }
            case 4: {
                return new agza((agzi)aqfd.a);
            }
            case 3: {
                return new aqfd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
