import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrn extends ahcz implements aheo
{
    public static final agrn a;
    private static volatile ahev e;
    public agqy b;
    public String c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(agrn.class, a = new agrn());
    }
    
    private agrn() {
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
                final ahev e;
                if ((e = agrn.e) == null) {
                    synchronized (agrn.class) {
                        if (agrn.e == null) {
                            agrn.e = (ahev)new ahcs((ahcz)agrn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agrn.a;
            }
            case 4: {
                return new ahcr((ahcz)agrn.a);
            }
            case 3: {
                return new agrn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agrn.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u021a\u0003\u0208", new Object[] { "b", "d", "c" });
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
