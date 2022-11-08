import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lox extends agzi implements ahax
{
    public static final lox a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public abxu d;
    public long e;
    public long f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(lox.class, a = new lox());
    }
    
    private lox() {
        this.c = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = lox.h) == null) {
                    synchronized (lox.class) {
                        if (lox.h == null) {
                            lox.h = (ahbe)new agzb((agzi)lox.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return lox.a;
            }
            case 4: {
                return new agza((agzi)lox.a);
            }
            case 3: {
                return new lox();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lox.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
