import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooj extends ahcz implements aheo
{
    public static final aooj a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    
    static {
        ahcz.registerDefaultInstance(aooj.class, a = new aooj());
    }
    
    private aooj() {
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aooj.d) == null) {
                    synchronized (aooj.class) {
                        if (aooj.d == null) {
                            aooj.d = (ahev)new ahcs((ahcz)aooj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aooj.a;
            }
            case 4: {
                return new ahcr((ahcz)aooj.a);
            }
            case 3: {
                return new aooj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aooj.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[] { "b", ahon.class, "c" });
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
