import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocd extends agzi implements ahax
{
    public static final aocd a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aocd.class, a = new aocd());
    }
    
    private aocd() {
        this.c = "";
        agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aocd.d) == null) {
                    synchronized (aocd.class) {
                        if (aocd.d == null) {
                            aocd.d = (ahbe)new agzb((agzi)aocd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aocd.a;
            }
            case 4: {
                return new agza((agzi)aocd.a);
            }
            case 3: {
                return new aocd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
