import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocj extends agzi implements ahax
{
    public static final aocj a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aocj.class, a = new aocj());
    }
    
    private aocj() {
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
                final ahbe d;
                if ((d = aocj.d) == null) {
                    synchronized (aocj.class) {
                        if (aocj.d == null) {
                            aocj.d = (ahbe)new agzb((agzi)aocj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aocj.a;
            }
            case 4: {
                return new agza((agzi)aocj.a);
            }
            case 3: {
                return new aocj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
