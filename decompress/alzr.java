import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzr extends ahcz implements aheo
{
    public static final alzr a;
    private static volatile ahev e;
    public int b;
    public int c;
    public alzq d;
    
    static {
        ahcz.registerDefaultInstance(alzr.class, a = new alzr());
    }
    
    private alzr() {
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
                if ((e = alzr.e) == null) {
                    synchronized (alzr.class) {
                        if (alzr.e == null) {
                            alzr.e = (ahev)new ahcs((ahcz)alzr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alzr.a;
            }
            case 4: {
                return new ahcr((ahcz)alzr.a);
            }
            case 3: {
                return new alzr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "b", "c", alwa.s, "d" });
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
