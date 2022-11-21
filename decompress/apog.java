import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apog extends ahcz implements aheo
{
    public static final apog a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public ahdp d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(apog.class, a = new apog());
    }
    
    private apog() {
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.e = "";
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
                if ((f = apog.f) == null) {
                    synchronized (apog.class) {
                        if (apog.f == null) {
                            apog.f = (ahev)new ahcs((ahcz)apog.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apog.a;
            }
            case 4: {
                return new ahcr((byte[][])null, (byte[])null);
            }
            case 3: {
                return new apog();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apog.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u1008\u0000", new Object[] { "b", "c", apnz.class, "d", apod.class, "e" });
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
