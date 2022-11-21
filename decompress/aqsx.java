import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsx extends ahcz implements aheo
{
    public static final aqsx a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aqsx.class, a = new aqsx());
    }
    
    private aqsx() {
        this.b = ahcz.emptyProtobufList();
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
                if ((c = aqsx.c) == null) {
                    synchronized (aqsx.class) {
                        if (aqsx.c == null) {
                            aqsx.c = (ahev)new ahcs((ahcz)aqsx.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqsx.a;
            }
            case 4: {
                return new ahcr((float[])null, (boolean[][])null);
            }
            case 3: {
                return new aqsx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsx.a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001a", new Object[] { "b" });
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
