import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubi extends ahcz implements aheo
{
    public static final aubi a;
    private static volatile ahev h;
    public int b;
    public String c;
    public String d;
    public int e;
    public long f;
    public String g;
    
    static {
        ahcz.registerDefaultInstance(aubi.class, a = new aubi());
    }
    
    private aubi() {
        this.c = "";
        this.d = "";
        this.g = "";
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
                if ((h = aubi.h) == null) {
                    synchronized (aubi.class) {
                        if (aubi.h == null) {
                            aubi.h = (ahev)new ahcs((ahcz)aubi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aubi.a;
            }
            case 4: {
                return new ahcr((ahcz)aubi.a);
            }
            case 3: {
                return new aubi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubi.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", areg.r, "f", "g" });
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
