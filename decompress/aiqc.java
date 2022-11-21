import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqc extends ahcz implements aheo
{
    public static final aiqc a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(aiqc.class, a = new aiqc());
    }
    
    private aiqc() {
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
                if ((c = aiqc.c) == null) {
                    synchronized (aiqc.class) {
                        if (aiqc.c == null) {
                            aiqc.c = (ahev)new ahcs((ahcz)aiqc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aiqc.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqc.a);
            }
            case 3: {
                return new aiqc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", aiqb.class });
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
