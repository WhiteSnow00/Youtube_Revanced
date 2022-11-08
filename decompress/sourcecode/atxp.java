import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxp extends agzi implements ahax
{
    public static final atxp a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public String d;
    public int e;
    public long f;
    public String g;
    
    static {
        agzi.registerDefaultInstance(atxp.class, a = new atxp());
    }
    
    private atxp() {
        this.c = "";
        this.d = "";
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
                if ((h = atxp.h) == null) {
                    synchronized (atxp.class) {
                        if (atxp.h == null) {
                            atxp.h = (ahbe)new agzb((agzi)atxp.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return atxp.a;
            }
            case 4: {
                return new agza((agzi)atxp.a);
            }
            case 3: {
                return new atxp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxp.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", arbt.p, "f", "g" });
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
