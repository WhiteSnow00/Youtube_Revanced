import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqf extends agzi implements ahax
{
    public static final ahqf a;
    private static volatile ahbe f;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;
    
    static {
        agzi.registerDefaultInstance(ahqf.class, a = new ahqf());
    }
    
    private ahqf() {
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
                if ((f = ahqf.f) == null) {
                    synchronized (ahqf.class) {
                        if (ahqf.f == null) {
                            ahqf.f = (ahbe)new agzb((agzi)ahqf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahqf.a;
            }
            case 4: {
                return new agza((agzi)ahqf.a);
            }
            case 3: {
                return new ahqf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
