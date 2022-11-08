import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzt extends agzi implements ahax
{
    public static final apzt a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apzt.class, a = new apzt());
    }
    
    private apzt() {
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
                if ((d = apzt.d) == null) {
                    synchronized (apzt.class) {
                        if (apzt.d == null) {
                            apzt.d = (ahbe)new agzb((agzi)apzt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzt.a;
            }
            case 4: {
                return new agza((agzi)apzt.a);
            }
            case 3: {
                return new apzt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
