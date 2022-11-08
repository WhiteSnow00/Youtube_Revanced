import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocx extends agzi implements ahax
{
    public static final aocx a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(aocx.class, a = new aocx());
    }
    
    private aocx() {
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
                if ((d = aocx.d) == null) {
                    synchronized (aocx.class) {
                        if (aocx.d == null) {
                            aocx.d = (ahbe)new agzb((agzi)aocx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aocx.a;
            }
            case 4: {
                return new agza((agzi)aocx.a);
            }
            case 3: {
                return new aocx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
