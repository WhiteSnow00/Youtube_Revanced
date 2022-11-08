import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosr extends agzi implements ahax
{
    public static final aosr a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public aost d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(aosr.class, a = new aosr());
    }
    
    private aosr() {
        this.c = "";
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
                if ((f = aosr.f) == null) {
                    synchronized (aosr.class) {
                        if (aosr.f == null) {
                            aosr.f = (ahbe)new agzb((agzi)aosr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aosr.a;
            }
            case 4: {
                return new agza((agzi)aosr.a);
            }
            case 3: {
                return new aosr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
