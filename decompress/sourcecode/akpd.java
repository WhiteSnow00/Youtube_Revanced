import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpd extends agzi implements ahax
{
    public static final akpd a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance(akpd.class, a = new akpd());
    }
    
    private akpd() {
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
                if ((f = akpd.f) == null) {
                    synchronized (akpd.class) {
                        if (akpd.f == null) {
                            akpd.f = (ahbe)new agzb((agzi)akpd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akpd.a;
            }
            case 4: {
                return new agza((agzi)akpd.a);
            }
            case 3: {
                return new akpd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akpd.a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004", new Object[] { "b", "c", "d", "e" });
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
