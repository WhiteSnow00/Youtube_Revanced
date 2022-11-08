import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjp extends agzi implements ahax
{
    public static final apjp a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apjp.class, a = new apjp());
    }
    
    private apjp() {
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
                if ((d = apjp.d) == null) {
                    synchronized (apjp.class) {
                        if (apjp.d == null) {
                            apjp.d = (ahbe)new agzb((agzi)apjp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjp.a;
            }
            case 4: {
                return new agza((agzi)apjp.a);
            }
            case 3: {
                return new apjp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
