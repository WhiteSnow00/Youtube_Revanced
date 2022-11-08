import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjt extends agzi implements ahax
{
    public static final apjt a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apjt.class, a = new apjt());
    }
    
    private apjt() {
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
                if ((d = apjt.d) == null) {
                    synchronized (apjt.class) {
                        if (apjt.d == null) {
                            apjt.d = (ahbe)new agzb((agzi)apjt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjt.a;
            }
            case 4: {
                return new agza((agzi)apjt.a);
            }
            case 3: {
                return new apjt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
