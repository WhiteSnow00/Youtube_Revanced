import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apom extends ahcz implements aheo
{
    public static final apom a;
    private static volatile ahev d;
    public int b;
    public ahdp c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(apom.class, a = new apom());
    }
    
    private apom() {
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
                if ((d = apom.d) == null) {
                    synchronized (apom.class) {
                        if (apom.d == null) {
                            apom.d = (ahev)new ahcs((ahcz)apom.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apom.a;
            }
            case 4: {
                return new ahcr((ahcz)apom.a);
            }
            case 3: {
                return new apom();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apom.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u001a", new Object[] { "e", "b", apnu.a(), "c" });
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
