import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpw extends agzi implements ahax
{
    public static final agpw a;
    private static volatile ahbe e;
    public String b;
    public int c;
    public int d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(agpw.class, a = new agpw());
    }
    
    private agpw() {
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
                final ahbe e;
                if ((e = agpw.e) == null) {
                    synchronized (agpw.class) {
                        if (agpw.e == null) {
                            agpw.e = (ahbe)new agzb((agzi)agpw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agpw.a;
            }
            case 4: {
                return new agza((agzi)agpw.a);
            }
            case 3: {
                return new agpw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002", new Object[] { "f", "b", "c", "d" });
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
