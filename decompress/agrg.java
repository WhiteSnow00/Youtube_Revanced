import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrg extends ahcz implements aheo
{
    public static final agrg a;
    private static volatile ahev f;
    public agsa b;
    public String c;
    public ahdp d;
    public agrx e;
    
    static {
        ahcz.registerDefaultInstance(agrg.class, a = new agrg());
    }
    
    private agrg() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
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
                if ((f = agrg.f) == null) {
                    synchronized (agrg.class) {
                        if (agrg.f == null) {
                            agrg.f = (ahev)new ahcs((ahcz)agrg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agrg.a;
            }
            case 4: {
                return new ahcr((ahcz)agrg.a);
            }
            case 3: {
                return new agrg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrg.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\u0208\u0003\u021a\u0004\t", new Object[] { "b", "c", "d", "e" });
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
