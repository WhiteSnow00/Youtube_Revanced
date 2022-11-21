import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyb extends ahcz implements aheo
{
    private static final apyb a;
    private static volatile ahev b;
    private ahdp c;
    
    static {
        ahcz.registerDefaultInstance(apyb.class, a = new apyb());
    }
    
    private apyb() {
        this.c = ahcz.emptyProtobufList();
    }
    
    public static apyb a() {
        return apyb.a;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apyb.b) == null) {
                    synchronized (apyb.class) {
                        if (apyb.b == null) {
                            apyb.b = (ahev)new ahcs((ahcz)apyb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apyb.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new apyb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyb.a, "\u0001\u0000", null);
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
