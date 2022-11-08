import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoce extends agzi implements ahax
{
    public static final aoce a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(aoce.class, a = new aoce());
    }
    
    private aoce() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aoce.c) == null) {
                    synchronized (aoce.class) {
                        if (aoce.c == null) {
                            aoce.c = (ahbe)new agzb((agzi)aoce.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoce.a;
            }
            case 4: {
                return new agza((agzi)aoce.a);
            }
            case 3: {
                return new aoce();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoce.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
