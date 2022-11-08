import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aimf extends agzi implements ahax
{
    public static final aimf a;
    private static volatile ahbe c;
    public aimj b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aimf.class, a = new aimf());
    }
    
    private aimf() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aimf.c) == null) {
                    synchronized (aimf.class) {
                        if (aimf.c == null) {
                            aimf.c = (ahbe)new agzb((agzi)aimf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aimf.a;
            }
            case 4: {
                return new agza((agzi)aimf.a);
            }
            case 3: {
                return new aimf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aimf.a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\t\u1009\u0000", new Object[] { "d", "b" });
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
