import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amal extends ahcz implements aheo
{
    public static final amal a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(amal.class, a = new amal());
    }
    
    private amal() {
        this.c = "";
        final ahbt b = ahbt.b;
        this.d = "";
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
                if ((e = amal.e) == null) {
                    synchronized (amal.class) {
                        if (amal.e == null) {
                            amal.e = (ahev)new ahcs((ahcz)amal.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amal.a;
            }
            case 4: {
                return new ahcr((ahcz)amal.a);
            }
            case 3: {
                return new amal();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amal.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002", new Object[] { "b", "c", "d" });
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
