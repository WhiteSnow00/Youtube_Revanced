import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aouj extends agzi implements ahax
{
    public static final aouj a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aouj.class, a = new aouj());
    }
    
    private aouj() {
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
                final ahbe e;
                if ((e = aouj.e) == null) {
                    synchronized (aouj.class) {
                        if (aouj.e == null) {
                            aouj.e = (ahbe)new agzb((agzi)aouj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aouj.a;
            }
            case 4: {
                return new agza((agzi)aouj.a);
            }
            case 3: {
                return new aouj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aouj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", aotx.a() });
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
