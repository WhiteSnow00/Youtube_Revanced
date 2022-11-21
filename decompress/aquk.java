import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquk extends ahcz implements aheo
{
    public static final aquk a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(aquk.class, a = new aquk());
    }
    
    private aquk() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aquk.c) == null) {
                    synchronized (aquk.class) {
                        if (aquk.c == null) {
                            aquk.c = (ahev)new ahcs((ahcz)aquk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aquk.a;
            }
            case 4: {
                return new ahcr((ahcz)aquk.a);
            }
            case 3: {
                return new aquk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquk.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
