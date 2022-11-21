import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqac extends ahcz implements aheo
{
    public static final aqac a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    
    static {
        ahcz.registerDefaultInstance(aqac.class, a = new aqac());
    }
    
    private aqac() {
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
                if ((d = aqac.d) == null) {
                    synchronized (aqac.class) {
                        if (aqac.d == null) {
                            aqac.d = (ahev)new ahcs((ahcz)aqac.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqac.a;
            }
            case 4: {
                return new ahcr((float[][])null, (float[])null);
            }
            case 3: {
                return new aqac();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqac.a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001a\u0003\u001b", new Object[] { "b", "c", aqab.class });
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
