import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrm extends ahcz implements aheo
{
    public static final agrm a;
    private static volatile ahev c;
    public String b;
    
    static {
        ahcz.registerDefaultInstance(agrm.class, a = new agrm());
    }
    
    private agrm() {
        this.b = "";
        ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
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
                if ((c = agrm.c) == null) {
                    synchronized (agrm.class) {
                        if (agrm.c == null) {
                            agrm.c = (ahev)new ahcs((ahcz)agrm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agrm.a;
            }
            case 4: {
                return new ahcr((ahcz)agrm.a);
            }
            case 3: {
                return new agrm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrm.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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
