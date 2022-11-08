import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aheq extends agzi implements ahax
{
    private static final aheq a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private Object e;
    private String f;
    
    static {
        agzi.registerDefaultInstance(aheq.class, a = new aheq());
    }
    
    private aheq() {
        this.d = 0;
        this.f = "";
    }
    
    public static ahep a() {
        return (ahep)aheq.a.createBuilder();
    }
    
    private void e(final String f) {
        f.getClass();
        this.c |= 0x1;
        this.f = f;
    }
    
    private void f(final aheu e) {
        this.e = e;
        this.d = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aheq.b) == null) {
                    synchronized (aheq.class) {
                        if (aheq.b == null) {
                            aheq.b = (ahbe)new agzb((agzi)aheq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aheq.a;
            }
            case 4: {
                return new ahep();
            }
            case 3: {
                return new aheq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aheq.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "e", "d", "c", "f", aheu.class, aher.class });
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
