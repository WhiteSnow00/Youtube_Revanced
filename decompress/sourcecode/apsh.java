import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsh extends agzi implements ahax
{
    public static final apsh a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public long e;
    
    static {
        agzi.registerDefaultInstance((Class)apsh.class, (agzi)(a = new apsh()));
    }
    
    private apsh() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apsh.f) == null) {
                    synchronized (apsh.class) {
                        if (apsh.f == null) {
                            apsh.f = (ahbe)new agzb((agzi)apsh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsh.a;
            }
            case 4: {
                return new agza((agzi)apsh.a);
            }
            case 3: {
                return new apsh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1003\u0002", new Object[] { "b", "c", "d", "e" });
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
