import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqan extends agzi implements ahax
{
    public static final aqan a;
    private static volatile ahbe d;
    public int b;
    public ahca c;
    
    static {
        agzi.registerDefaultInstance(aqan.class, a = new aqan());
    }
    
    private aqan() {
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
                if ((d = aqan.d) == null) {
                    synchronized (aqan.class) {
                        if (aqan.d == null) {
                            aqan.d = (ahbe)new agzb((agzi)aqan.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqan.a;
            }
            case 4: {
                return new agza((agzi)aqan.a);
            }
            case 3: {
                return new aqan();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqan.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
