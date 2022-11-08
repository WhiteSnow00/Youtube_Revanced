import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afpa extends agzi implements ahax
{
    public static final afpa a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(afpa.class, a = new afpa());
    }
    
    private afpa() {
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
                if ((d = afpa.d) == null) {
                    synchronized (afpa.class) {
                        if (afpa.d == null) {
                            afpa.d = (ahbe)new agzb((agzi)afpa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return afpa.a;
            }
            case 4: {
                return new agza((agzi)afpa.a);
            }
            case 3: {
                return new afpa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afpa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
