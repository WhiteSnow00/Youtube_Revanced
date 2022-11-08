import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgc extends agzi implements ahax
{
    public static final aqgc a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aqgc.class, (agzi)(a = new aqgc()));
    }
    
    private aqgc() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aqgc.c) == null) {
                    synchronized (aqgc.class) {
                        if (aqgc.c == null) {
                            aqgc.c = (ahbe)new agzb((agzi)aqgc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqgc.a;
            }
            case 4: {
                return new agza((agzi)aqgc.a);
            }
            case 3: {
                return new aqgc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgc.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
