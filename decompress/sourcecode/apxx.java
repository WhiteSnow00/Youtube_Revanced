import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxx extends agzi implements ahax
{
    public static final apxx a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(apxx.class, a = new apxx());
    }
    
    private apxx() {
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apxx.f) == null) {
                    synchronized (apxx.class) {
                        if (apxx.f == null) {
                            apxx.f = (ahbe)new agzb((agzi)apxx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxx.a;
            }
            case 4: {
                return new agza((agzi)apxx.a);
            }
            case 3: {
                return new apxx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002", new Object[] { "b", "c", aijn.a, "d", aijn.c, "e" });
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
