import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjm extends agzi implements ahax
{
    public static final apjm a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(apjm.class, a = new apjm());
    }
    
    private apjm() {
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
                if ((d = apjm.d) == null) {
                    synchronized (apjm.class) {
                        if (apjm.d == null) {
                            apjm.d = (ahbe)new agzb((agzi)apjm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjm.a;
            }
            case 4: {
                return new agza((agzi)apjm.a);
            }
            case 3: {
                return new apjm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
