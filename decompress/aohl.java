import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohl extends ahcz implements aheo
{
    public static final aohl a;
    private static volatile ahev f;
    public int b;
    public String c;
    public int d;
    public aomw e;
    
    static {
        ahcz.registerDefaultInstance(aohl.class, a = new aohl());
    }
    
    private aohl() {
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
                final ahev f;
                if ((f = aohl.f) == null) {
                    synchronized (aohl.class) {
                        if (aohl.f == null) {
                            aohl.f = (ahev)new ahcs((ahcz)aohl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aohl.a;
            }
            case 4: {
                return new ahcr((ahcz)aohl.a);
            }
            case 3: {
                return new aohl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
