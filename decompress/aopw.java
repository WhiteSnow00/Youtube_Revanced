import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopw extends ahcz implements aheo
{
    public static final aopw a;
    private static volatile ahev e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(aopw.class, a = new aopw());
    }
    
    private aopw() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aopw.e) == null) {
                    synchronized (aopw.class) {
                        if (aopw.e == null) {
                            aopw.e = (ahev)new ahcs((ahcz)aopw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aopw.a;
            }
            case 4: {
                return new ahcr((ahcz)aopw.a);
            }
            case 3: {
                return new aopw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
