import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrk extends ahcz implements aheo
{
    public static final agrk a;
    private static volatile ahev c;
    public String b;
    
    static {
        ahcz.registerDefaultInstance(agrk.class, a = new agrk());
    }
    
    private agrk() {
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
                if ((c = agrk.c) == null) {
                    synchronized (agrk.class) {
                        if (agrk.c == null) {
                            agrk.c = (ahev)new ahcs((ahcz)agrk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrk.a;
            }
            case 4: {
                return new ahcr((ahcz)agrk.a);
            }
            case 3: {
                return new agrk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrk.a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", new Object[] { "b" });
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
