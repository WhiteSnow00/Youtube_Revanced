import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwo extends agzi implements ahax
{
    public static final aqwo a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aqwo.class, a = new aqwo());
    }
    
    private aqwo() {
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
                if ((d = aqwo.d) == null) {
                    synchronized (aqwo.class) {
                        if (aqwo.d == null) {
                            aqwo.d = (ahbe)new agzb((agzi)aqwo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqwo.a;
            }
            case 4: {
                return new agza((agzi)aqwo.a);
            }
            case 3: {
                return new aqwo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
