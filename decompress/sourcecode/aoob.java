import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoob extends agzi implements ahax
{
    public static final aoob a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public long e;
    
    static {
        agzi.registerDefaultInstance((Class)aoob.class, (agzi)(a = new aoob()));
    }
    
    private aoob() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aoob.f) == null) {
                    synchronized (aoob.class) {
                        if (aoob.f == null) {
                            aoob.f = (ahbe)new agzb((agzi)aoob.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoob.a;
            }
            case 4: {
                return new agza((agzi)aoob.a);
            }
            case 3: {
                return new aoob();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoob.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e" });
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
