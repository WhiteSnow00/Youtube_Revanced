import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpl extends agzi implements ahax
{
    public static final lpl a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    private String i;
    
    static {
        agzi.registerDefaultInstance(lpl.class, a = new lpl());
    }
    
    private lpl() {
        this.c = "";
        this.i = "";
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
                if ((h = lpl.h) == null) {
                    synchronized (lpl.class) {
                        if (lpl.h == null) {
                            lpl.h = (ahbe)new agzb((agzi)lpl.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return lpl.a;
            }
            case 4: {
                return new agza((agzi)lpl.a);
            }
            case 3: {
                return new lpl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpl.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\u1008\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1008\u0000\b\u1007\u0006", new Object[] { "b", "i", "d", "e", "f", "c", "g" });
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
