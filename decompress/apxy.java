import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxy extends ahcz implements aheo
{
    public static final apxy a;
    private static volatile ahev d;
    public String b;
    public ahdp c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(apxy.class, a = new apxy());
    }
    
    private apxy() {
        this.b = "";
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
                if ((d = apxy.d) == null) {
                    synchronized (apxy.class) {
                        if (apxy.d == null) {
                            apxy.d = (ahev)new ahcs((ahcz)apxy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apxy.a;
            }
            case 4: {
                return new ahcr((ahcz)apxy.a);
            }
            case 3: {
                return new apxy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "e", "b", "c" });
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
