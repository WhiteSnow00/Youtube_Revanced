import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpj extends agzi implements ahax
{
    public static final agpj a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(agpj.class, a = new agpj());
    }
    
    private agpj() {
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
                if ((c = agpj.c) == null) {
                    synchronized (agpj.class) {
                        if (agpj.c == null) {
                            agpj.c = (ahbe)new agzb((agzi)agpj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpj.a;
            }
            case 4: {
                return new agza((agzi)agpj.a);
            }
            case 3: {
                return new agpj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpj.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
