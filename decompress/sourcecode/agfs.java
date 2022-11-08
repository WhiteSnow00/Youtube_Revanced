import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfs extends agzi implements ahax
{
    public static final agfs a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public apqx d;
    
    static {
        agzi.registerDefaultInstance(agfs.class, a = new agfs());
    }
    
    private agfs() {
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
                if ((e = agfs.e) == null) {
                    synchronized (agfs.class) {
                        if (agfs.e == null) {
                            agfs.e = (ahbe)new agzb((agzi)agfs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agfs.a;
            }
            case 4: {
                return new agza((agzi)agfs.a);
            }
            case 3: {
                return new agfs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
