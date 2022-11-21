import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alos extends ahcz implements aheo
{
    public static final alos a;
    private static volatile ahev h;
    public int b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    
    static {
        ahcz.registerDefaultInstance(alos.class, a = new alos());
    }
    
    private alos() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = alos.h) == null) {
                    synchronized (alos.class) {
                        if (alos.h == null) {
                            alos.h = (ahev)new ahcs((ahcz)alos.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alos.a;
            }
            case 4: {
                return new ahcr((ahcz)alos.a);
            }
            case 3: {
                return new alos();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alos.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u100b\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
