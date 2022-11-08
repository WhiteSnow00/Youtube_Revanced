import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxa extends agzi implements ahax
{
    private static final aqxa a;
    private static volatile ahbe b;
    private int c;
    private boolean d;
    
    static {
        agzi.registerDefaultInstance(aqxa.class, a = new aqxa());
    }
    
    private aqxa() {
    }
    
    public static /* synthetic */ aqxa a() {
        return aqxa.a;
    }
    
    public static aqxa b() {
        return aqxa.a;
    }
    
    public boolean c() {
        return this.d;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqxa.b) == null) {
                    synchronized (aqxa.class) {
                        if (aqxa.b == null) {
                            aqxa.b = (ahbe)new agzb((agzi)aqxa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxa.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aqxa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
